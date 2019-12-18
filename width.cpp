using namespace std;
#include<iostream>
int main()
{
    int items[4]={10,8,12,15},sum=0;
    int cost[4]={75,100,60,99};
    cout.width(5);
    cout<<"items";
    cout.width(8);
    cout<<"cost";
    cout.width(15);
    cout<<"total value"<<"\n";
    for(int i=0;i<4;i++)
    {
        cout.width(5);
        cout<<items[i];
        cout.width(8);
        cout<<cost[i];
        int value=items[i]*cost[i];
        cout.width(15);
        cout<<value<<"\n";
        sum=sum+value;
    }
    cout<<"\n grand total=";
    cout.width(2);
    cout<<sum<<"\n";

}
