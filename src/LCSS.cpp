//求解Sentece1 和 Sentece2 的最大公共子串
int LCSSByDP(const vector<string>& vSentece1, const vector<string>& vSentece2)
{
	int nMax = 0;
	int **c = new int*[vSentece1.size()]; //共有length1+1行
	for (int i = 0; i < vSentece1.size(); i++)
		c[i] = new int[vSentece2.size()];//共有length2+1列

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
