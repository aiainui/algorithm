//求解Sentece1 和 Sentece2 的最长公共子序列
int LCSByDP(const vector<string>& vSentece1, const vector<string>& vSentece2)
{
	int **c = new int*[vSentece1.size() + 1]; //共有length1+1行
	for (int i = 0; i < vSentece1.size() + 1; i++)
		c[i] = new int[vSentece2.size() + 1];//共有length2+1列

	for (int row = 0; row <= vSentece1.size(); row++)
		c[row][0] = 0;
	for (int column = 0; column <= vSentece2.size(); column++)
		c[0][column] = 0;

	for (int i = 1; i <= vSentece1.size(); i++)
	for (int j = 1; j <= vSentece2.size(); j++)
	{
		if (vSentece1.at(i - 1) == vSentece2.at(j - 1))
			c[i][j] = c[i - 1][j - 1] + 1;
		else if (c[i][j - 1] > c[i - 1][j])
			c[i][j] = c[i][j - 1];
		else
			c[i][j] = c[i - 1][j];
	}

	return c[vSentece1.size()][vSentece2.size()];
}
