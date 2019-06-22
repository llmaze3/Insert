class InsertionSort {
		void sort(int array[])
		{
			int a = array.length;
			for(int j = 1; j<a; ++j)
			{
				//Select the first unsorted section
				int key = array[j];
				//Set the marker for the sorter section
				int i = j-1;
				while(i>=0 && array[i]>key)
				{
					//Swap the elements to the right to move element to the right place
					array[i+1] = array[i];
					i = i-1;
				}
				//Advance the maker to the right
				array[i+1] = key;
			}
			
		}
		static void print(int array[])
		{
			int n = array.length;
			for(int i = 0; i<n; ++i)
			{
			System.out.print(array[i] + " ");
			}
		System.out.println();
		}
		public static void main(String args[])
		{
		//Random array
		int array[] = {5, 2, 4, 6, 1, 3};
		//Create object
		InsertionSort object = new InsertionSort();
		//Call Insertion sort method
		object.sort(array);
		print(array);
		}
}