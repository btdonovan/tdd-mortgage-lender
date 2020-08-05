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

    public Enum getApproval(LoanApplicant applicant) {
        return ApplicationStatus.INSUFFICIENT_FUNDS;
    }

    public float calculatePayment(long principal, float interestRate, int numberOfPayments) {
        return (float) (principal * ((interestRate/12) * Math.pow((1+(interestRate/12)),numberOfPayments)) / (Math.pow((1 + (interestRate/12)),numberOfPayments) - 1));
    }
}
