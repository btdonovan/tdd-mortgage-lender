import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoanApplicantTest {

    @Test
    void canGetApplicantCreditScore() {
        LoanApplicant applicant = new LoanApplicant(
                200000,
                1000000,
                400000,
                100000,
                650
        );
        int expected = 650;
        int actual = applicant.getCreditScore();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetApplicantDownPayment() {
        LoanApplicant applicant = new LoanApplicant(
                200000,
                1000000,
                400000,
                100000,
                650
        );
        int expected = 200000;
        int actual = applicant.getDownPayment();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetApplicantDebtLoad() {
        LoanApplicant applicant = new LoanApplicant(
                200000,
                1000000,
                400000,
                100000,
                650
        );
        int expected = 100000;
        int actual = applicant.getMonthlyDebtLoad();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetApplicantMonthlyGrossIncom() {
        LoanApplicant applicant = new LoanApplicant(
                200000,
                1000000,
                400000,
                100000,
                650
        );
        int expected = 400000;
        int actual = applicant.getMonthlyGrossIncome();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetRequestedLoanAmount() {
        LoanApplicant applicant = new LoanApplicant(
                200000,
                1000000,
                400000,
                100000,
                650
        );
        long expected = 1000000L;
        long actual = applicant.getRequestedAmount();
        assertThat(actual).isEqualTo(expected);
    }
}
