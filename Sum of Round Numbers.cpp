//https://codeforces.com/problemset/problem/1352/A
#include "bits/stdc++.h"
long long a[1000001];
using namespace std;
int main() {
    int t,n,k;
     cin>>t;
        while(t--){
            cin>>n;
            int j=1;
            k=1;
            //memset(a,0,sizeof(a));
            while(n)
            {
                if(n%10)
                {
                    a[j]=k*(n%10);
                    j++;
                }
                n/=10;
                k*=10;
            }
            j--;
            cout<<j<<endl;
            for(int i=j;i>=1;i--)
            {
                cout<<a[i]<<" ";
            }
            cout<<endl;
        }
//    int a;
//    cin >> a;
//    while (a--) {
//        string b;
//        cin >> b;
//        int t = 0;
//        if (b.length() == 1 || b[b.length() - 1] == '0') {
//            cout << 1 << endl;
//            cout << b << endl;
//        } else {
//            vector<string> v;
//            for (int i = 0; i < b.length(); ++i) {
//                string ne = "";
//                ne += b[i];
//                for (int j = i + 1; j < b.length(); ++j) {
//                    ne += '0';
//                }
//                v.push_back(ne);
//            }
//            map<string,int>str;
//            for (auto ve: v) {
//                string r="";
//                for (int i = 0; i < ve.length(); ++i) {
//                    r+='0';
//                }
//                if (ve==r)
//                    continue;
//                else{
//                    t++;
//                    str.insert({ve,ve.length()});
//                }
//            }
//            for (int i = 0; i < str.size(); ++i) {
//                
//            }
//        }
//    }
}