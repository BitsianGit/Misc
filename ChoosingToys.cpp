void ChoosingToys()
{
	int n;
	cin >> n;
	int *arr = new int[n];
	for (int i = 0; i < n; i++)
	{
		cin>>arr[i];
	}

	sort(arr, arr + n);

	int i = 0, j=i;
	int curWt = arr[i];
	int maxWt = curWt + 4, count = 1;

	while (j < n-1)
	{
		if (arr[j+1]<=maxWt)
		{
			j++;
			continue;
		}
		else
		{
			count += 1;
			j++;
			i = j;
			maxWt = arr[i] + 4;
		}
	}
	cout << count;
}
