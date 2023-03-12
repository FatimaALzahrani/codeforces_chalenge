//https://codeforces.com/problemset/problem/785/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    int t;
    cin>>t;
    int n=0;
    while (t--)
    {
        string s;
        cin>>s;
        if(s=="Tetrahedron")
        n+=4;
        else if(s=="Cube")
        n+=6;
        else if(s=="Octahedron")
        n+=8;
        else if(s=="Dodecahedron")
        n+=12;
        else if(s=="Icosahedron")
        n+=20;
    }
    cout<<n;
} 
