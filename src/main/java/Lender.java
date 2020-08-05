final class Lender {

    private long availableFunds = 0;

    public long getAvailableFunds() {
        return this.availableFunds;
    }

    public void addFunds(final long funds) {
        if (funds <= 0) {
            throw new IllegalArgumentException("Amount added must be greater than zero.");
        }
        this.availableFunds = Math.addExact(this.availableFunds, funds);
    }
}
