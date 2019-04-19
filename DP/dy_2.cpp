#include <iostream>
#include <vector>

using namespace std;

//求解两个串的最大公共子串
int LCSSByDP(const vector<string>& vSentece1, const vector<string>& vSentece2)
{
	int nMax = 0;
	int **c = new int*[vSentece1.size()]; //共有length1+1行
	for (int i = 0; i < vSentece1.size(); i++){
		c[i] = new int[vSentece2.size()];//共有length2+1列
		memset(c[i], 0, sizeof(c[i]));
	}

	for (int i = 0; i < vSentece1.size(); i++)
	for (int j = 0; j < vSentece2.size(); j++)
	{
		if (vSentece1.at(i) == vSentece2.at(j)){
			if (i > 0 && j > 0){
				c[i][j] = c[i - 1][j - 1] + 1;
			}
			else{
				c[i][j] = 1;
			}
			if (nMax < c[i][j]) nMax = c[i][j];
		}
	}

	return nMax;
}


int main()
{
	vector<std::string> t1;
	vector<std::string> t2;
	t1.push_back("高");
	t1.push_back("大");
	t1.push_back("人");
	t1.push_back("物");

	t2.push_back("高");
	t2.push_back("大");
	t2.push_back("啊");
	t2.push_back("物");
	cout << LCSSByDP(t1, t2) << endl;
	return 0;
}
