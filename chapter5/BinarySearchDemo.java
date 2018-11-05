class BinarySearchDemo {
    public static void main(String[] args) {
        int [] sortedArray = {1, 3, 5, 7, 8, 9, 11, 14, 16, 19, 21, 23, 25, 26, 28, 30, 34};
        System.out.println(binarySearch(sortedArray, 25, 0, sortedArray.length-1));
    }

    public static boolean binarySearch(int [] data, int target, int low, int high){
        if(low > high){
            return false;
        } else {
            int mid = (high + low)/2;

            if(target == data[mid])
                return true;

            else if(data[mid] < target)
                return binarySearch(data, target, mid+1, high);
            else
                return binarySearch(data, target, low, mid-1);
        }
    }
}
