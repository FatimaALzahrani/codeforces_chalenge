//https://codeforces.com/problemset/problem/510/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    int r,c;
    cin>>r>>c;
    int arr[r][c];
    int t=1;
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < c; ++j) {
            if(i%2==1){
                if(t%2==0 && j!=0){
                    cout<<'.';
                }
                else if(t%2==1 && j!=c-1){
                    cout<<'.';
                }else
                    cout<<'#';
            }else{
                cout<<'#';
            }
        }
        if(i%2==1)
        t++;
        cout<<'\n';
    }
}