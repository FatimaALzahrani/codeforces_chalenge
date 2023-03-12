//https://codeforces.com/problemset/problem/144/A
#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    int ar[n];
    for (int i = 0; i < n; ++i) {
        int a;
        cin>>a;
        arr[i]=a;
        ar[i]=a;
    }
    int minumm= *min_element(arr,arr+n);
    int macumm=*max_element(arr,arr+n);
    reverse (ar, ar + n);
    int findmin= n-(find(ar,ar+n,minumm)-ar)-1;
    int findmax= find(arr,arr+n,macumm)-arr;
    int count =0;
//    cout<<findmax<<endl;//6
//    cout<<findmin<<endl;//1
//    cout<<macumm<<endl;//76
//    cout<<minumm<<endl;//10
    bool flag=true;
    while(flag){
        if(findmin!=n-1 || findmax!=0) {
            if (findmin != n-1) {//10 58 31 76 10 63 40
                if(findmax==findmin)
                    count--;
                int tmp = arr[findmin + 1];//63
                arr[findmin + 1] = minumm;//10
                arr[findmin] = tmp;
                count++;
                findmin++;
//                for (int i = 0; i < n; ++i) {
//                    cout<<arr[i]<<" ";
//                }
//                cout<<"\n";
//                cout<<findmin<<"    "<<arr[findmin]<<endl;
            }
            if (findmax != 0) {
                if(findmin==findmax)
                    count--;
                int tmp = arr[findmax - 1];
                arr[findmax - 1] = macumm;
                arr[findmax] = tmp;
                count++;
                findmax--;
//                for (int i = 0; i < n; ++i) {
//                    cout<<arr[i]<<" ";
//                }
//                cout<<"\n";
//                cout<<findmax<<"   "<<arr[findmax]<<endl;
            }
        }
 
        if(findmin==n-1 && findmax==0){
            flag=false;
        }
    }
    cout<<count<<endl;
}