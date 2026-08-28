class PrefixTree {
    private ArrayList<String> values;
    public PrefixTree() {
        values= new ArrayList<>();
    }

    public void insert(String word) {
        values.add(word);
    }

    public boolean search(String word) {
        return values.contains(word);
    }

    public boolean startsWith(String prefix) {
        return values.stream().filter(s -> s.startsWith(prefix)).findAny().isPresent();
    }
}
