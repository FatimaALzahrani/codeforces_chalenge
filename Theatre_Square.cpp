#include "bits/stdc++.h"
using namespace std;
int main(){
    int n,m,a;
    cin>>n>>m>>a;
    int sizeall=n*m;
    int sizeone=a+a;
    int re=sizeall/sizeone;
    if(re==0)
    re=1;
    cout<<(re);
}