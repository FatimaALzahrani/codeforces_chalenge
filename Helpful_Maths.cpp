#include "bits/stdc++.h"
using namespace std;
int main(){
    string s;
    cin>>s;
    map<int,int>val;
    s+="+";
    string t="";
    for (int i = 0; i < s.length(); ++i) {
        if(s[i]=='+'){
            val[stoi(t)]++;
            t="";
            continue;
        }
        t+=s[i];
    }
    string re="";
    for(auto mp : val){
       while(mp.second) {
           re += to_string(mp.first) + "+";
           mp.second--;
       }

    }
    cout<<re.substr(0,re.length()-1);
}