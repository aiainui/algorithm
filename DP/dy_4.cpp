#include<iostream>
#include<string>

#define EDIT_LENGTH  1001
int L[EDIT_LENGTH][EDIT_LENGTH];

int min(int a, int b)
{
	if (a > b)
		return b;
	return a;
}
void LED(int m, int n, std::string x, std::string y)
{
	int a, b, c;
	for (int i = 0; i<m + 1; i++)
	{
		L[i][0] = i;
	}
	for (int i = 0; i<n + 1; i++)
	{
		L[0][i] = i;
	}

	for (int i = 1; i<m + 1; i++)
	{
		for (int j = 1; j<n + 1; j++)
		{
			a = L[i - 1][j] + 1;
			b = L[i][j - 1] + 1;
			c = L[i - 1][j - 1] + (x[i] == y[j] ? 0 : 1);
			L[i][j] = min(c, min(a, b));
		}
	}

}


int main()
{
	int m, n;
	std::string x="hello", y="hell";
	m = x.size();
	n = y.size();
	memset(L, 0, sizeof(L));
	x = " " + x;
	y = " " + y;
	LED(m, n, x, y);
	std::cout << L[m][n] << std::endl;
}
