/*************************************************************************
	> File Name: dy_5.cpp
	> Author: dyl
	> Mail: denyulong@100tal.com
	> Created Time: Tue 22 Jan 2019 01:28:20 AM CST
 ************************************************************************/

#include<iostream>
using namespace std;
const int ms =  1000;
int r[ms][ms], m[ms][ms],s[ms][ms];
int n;
void rent()
{
    int i,j,k,d;
    //从三个站点的子问题出发
    for(d=3; d <= n; d++){
	//m[i][j] 起始位置i
        for(i=1; i <= n-d+1; i++){
            //限定j最大值为当前d限定的宽度
	    j = i+d-1;
	    //子问题再拆分，k为拆分点
            for(k=i+1; k<j; k++){
                int temp;
                temp = m[i][k] + m[k][j];
                if(temp < m[i][j]){
                    m[i][j] = temp;
                    s[i][j] = k;
                }
            }
        }
    }
}

void print(int i, int j)
{
    if(s[i][j] == 0){
        cout << "---" <<j;
        return ;
    }
    print(i, s[i][j]);
    print(s[i][j], j);
}

int main()
{
    int i, j;
    cout << "请输入站点个数：";
    cin >> n;
    cout << "请依次输入各站点的租金：";
    for(i = 1; i <= n; i++){
        for(j = i+1; j <= n; ++j){
            cin >> r[i][j];
            m[i][j] = r[i][j];
        }
    }
    rent();
    cout << "花费最少租金为：" << m[i][n] << endl;
    cout << "最少租金经过的站点为: " << 1;
    print(1, n);
    return 0;
}

//input 
// 6
// 2 6 9 15 20 3 5 11 18 3 6 12 5 8 6
