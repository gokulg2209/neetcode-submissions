class MedianFinder {
    private ArrayList<Double> listarray;

    public MedianFinder() {
        listarray = new ArrayList<>();
    }

    public void addNum(int num) {
        listarray.add((double) num); 
        listarray.sort(null); 
    }

    public double findMedian() {
        int n = listarray.size();
        if (n % 2 == 1) {
            return listarray.get(n / 2);
        } else {
            return (listarray.get((n / 2) - 1) + listarray.get(n / 2)) / 2.0;
        }
    }
}