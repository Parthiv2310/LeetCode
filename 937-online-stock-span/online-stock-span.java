class StockSpanner {
    Stack<int[]> c;
    public StockSpanner() {
        c = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!c.isEmpty() && c.peek()[0] <= price) {
            span += c.pop()[1];
        }
        c.push(new int[] {price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */