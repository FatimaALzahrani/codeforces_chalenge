//https://codeforces.com/problemset/problem/228/A
#include <iostream>
#include <set>
using namespace std;
int main(){
    set<int>st;
    for(int i=0;i<4;i++){
        int a;
        cin>>a;
    st.insert(a);
    }
    cout<<(4-st.size());
    return 0;
}