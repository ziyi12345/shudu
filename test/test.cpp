#include<iostream>  
#include<iomanip> 
#include <Windows.h>
#include <stdlib.h>
#include <fstream>
using namespace std;  
   
int arr[10][10];   
int s;

bool get_arr(int i,int j)//搜索第（i，j）位置处可以存储的数字,找到解则返回true，否则返回false  
{  
    if(i>9||j>9)   
        return true;//越界，说明数独填完了，结束 
  
    for(int k=1;k<=9;++k)   
    {   s=rand()%9+1;//S是随机生成的，保证了数独的随机性 
        bool can=true; //can变量用于记录数字s能否放在(i,j)处  
        
        for( int m=1;m<i;++m)   
            if(arr[m][j]==s)  
            {  
                can=false;  
                break;  
            } // 检查同一列是否出现过数字s
            
        if (can)   
            for( int n=1;n<j;++n)   
                if(arr[i][n]==s)  
                {  
                    can=false;  
                    break;   
                }// 检查同一行是否出现过数字s  
                
        if(can)   
        {  
            int x=(i-1)/3;
            int y=(j-1)/3;
            for(int p=(x*3+1);p<=(x*3+3);p++)//判断九宫格中有没有重复填入 
            {  
                if(can==false)
                    break;  
                    
                for(int q=(y*3+1);q<=(y*3+3);q++)   
                    if(arr[p][q]==s)   
                    {  
                        can=false;  
                        break;  
                    }  
            }  
        }  
        
        if(can)   
        {  
            arr[i][j]=s;//将数字填入 
			 
            if(j<9)   
            {  
                if(get_arr(i,j+1))//填第一行的下一列 
                    return true;//  
            }  
            else  
            {  
                if(i<9)    
                {  
                    if(get_arr(i+1,1))//开始填下一行 
                        return true;
                }  
                else  
                    return true;//全部完成，结束 
   
            }  
            arr[i][j]=0;//不能填入要重置0
        }  
    }  
    return false;//全部试过了之后还不成功就返回上一步 
} 

long long myrand() 
{__asm("RDTSC");}//用来生成生成种子的东西 


void start()   
{
  srand (myrand()); // 产生s的随机数种子  
    for(int i=1;i<=9;++i)  
        for(int j=1;j<=9;++j)  
            arr[i][j]=0;//初始全部置0 
   arr[1][1]=5;//学号尾数13，所以第一个位置是5 
    get_arr(1,2) ;  //第一个数字固定了所以从第二个开始 

}
  
   
int main()  
{  ofstream cout("sudoku.txt",ios::out);//把输出结果写到sudoku.txt中 
	 int a=0,c=0;
	 char n[20];
	 cin>>n;
	if(n[c]>='9'||n[c]<='0')
	 {
	cout<<"输入出错"<<endl; 
	 return 0; }
	else if(c<20)
	c++;
	
	
	c=atoi(n);
	while(a!=c)
  		{ 
	 	start();
	 	for(int i=1;i<=9;i++)   
    {  
        for(int j=1;j<=9;j++)   
            cout<<arr[i][j]<<" " ;  
        	cout<<endl;//输出结果（写到文件里面去了） 
  }  
	 		cout<<endl;
			a++;}  
    return 0;  
}  
