void MaximumSubArray(int arr[], int n)
{
	int *arr = new int[n];
	for (int i = 0; i<n; i++)
	{
	    cin >> arr[i];
	}
	int *sumarr = new int[n];
	bool negativeFlag = true;

	for (int i = 0; i < n; i++)
	{
		sumarr[i] = 0;
	}

	int max = -99999, sum = 0, noncontmax = 0;

	for (int i = 0; i < n; i++)
	{
		if (arr[i]>0)
		{
			negativeFlag = false;
			break;
		}
		else
			continue;
	}

	if (negativeFlag)
	{
		for (int i = 0; i < n; i++)
		{
			sumarr[i] = arr[i];
		}
	}
	else
	{
		for (int i = 0; i < n; i++)
		{
			sum = sum + arr[i];
			if (sum < 0)
				sum = 0;
			else
				sumarr[i] = sum;
		}
	}

	for (int i = 0; i < n; i++)
	{
		if (max < sumarr[i])
			max = sumarr[i];
	}

	if (max < 0)
	{
		noncontmax = max;
	}
	else
	{
		for (int i = 0; i < n; i++)
		{
			if (arr[i] >= 0)
				noncontmax += arr[i];
		}
    }

	cout << max << " " << noncontmax << endl;
}
