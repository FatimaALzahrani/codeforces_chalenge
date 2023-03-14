//https://codeforces.com/problemset/problem/427/A
#include "bits/stdc++.h"
using namespace std;
int main() {
int n;
cin>>n;
int sum=0;
stack<int>st;
    while (n--){
        int a;
        cin>>a;//2
        if(st.empty() && a==-1)
            sum++;
        else if(a>0){
            st.push(a);
        }else {
            --st.top();
            if (st.top() == 0)
                st.pop();
        }
    }
    cout<<sum;
}