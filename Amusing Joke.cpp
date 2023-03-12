//https://codeforces.com/problemset/problem/141/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    string s1,s2,s3;
    cin>>s1>>s2>>s3;
    map<char,int> ch;
    int a='A';
    for (int i = 0; i < 26; ++i) {
        ch[a];
        a++;
    }
    map<char,int>mp2=ch;
    string s4=s1+s2;
    for (int i = 0; i < s4.length(); ++i) {
       ch[s4[i]]++;
    }
    for (int i = 0; i < s3.length(); ++i) {
        mp2[s3[i]]++;
    }
    cout<<(mp2==ch?"YES":"NO");
}