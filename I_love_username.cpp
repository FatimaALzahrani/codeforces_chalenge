//https://codeforces.com/problemset/problem/155/A
#include "bits/stdc++.h"
using namespace std;
int main() {
int n;
cin>>n;
int sum=0;
int ar[n];
    cin>>ar[0];
    int min=ar[0];
    int max=ar[0];
    for (int i = 1; i < n; ++i) {
        cin>>ar[i];
        if(ar[i]>max) {
            sum++;
            max=ar[i];
        }
        if(ar[i]<min){
            sum++;
            min=ar[i];
        }
    }
    cout<<sum;
}