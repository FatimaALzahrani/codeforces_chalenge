//https://codeforces.com/problemset/problem/1328/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    int t;
    cin>>t;
    while (t--)
    {
        long long a,b;
        cin>>a>>b;
        int s=(a%b);
        if(a%b==0)
            cout<<0<<endl;
        else
        cout<<(b-s)<<endl;
    }
}