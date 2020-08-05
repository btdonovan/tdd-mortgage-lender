import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


final class LenderTest {

    @Test
    void getAvailableFundsReturnsZeroByDefault() {
        final Lender lender = new Lender();
        final long expected = 0L;

        final long actual = lender.getAvailableFunds();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addFundsThrowsAnExceptionForZero() {
        final Lender lender = new Lender();
        final String expected = "Amount added must be greater than zero.";

        final Exception actual = assertThrows(IllegalArgumentException.class,
                () -> lender.addFunds(0L));
        assertThat(actual.getMessage()).isEqualTo(expected);
    }

    @Test
    void addFundsIncreasesAvailableFundsByOne() {
        final Lender lender = new Lender();
        final long expected = 1L;
        lender.addFunds(expected);
        final long actual = lender.getAvailableFunds();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addFundsThrowsAnExceptionForNegativeValue() {
        final Lender lender = new Lender();
        final String expected = "Amount added must be greater than zero.";
        final Exception actual = assertThrows(IllegalArgumentException.class,
                () -> lender.addFunds(Long.MIN_VALUE));
        assertThat(actual.getMessage()).isEqualTo(expected);
    }

    @Test
    void addFundsIncreasesAvailableFundsByTwo() {
        final Lender lender = new Lender();
        final long expected = 2L;
        lender.addFunds(expected);
        final long actual = lender.getAvailableFunds();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addFundsIncreasesAvailableFundsByThreeThenFour() {
        final Lender lender = new Lender();
        final long expected = 7L;
        lender.addFunds(3L);
        lender.addFunds(4L);
        final long actual = lender.getAvailableFunds();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addFundsThrowsExceptionIfOverflowWillHappen() {
        final Lender lender = new Lender();
        lender.addFunds(Long.MAX_VALUE);
        final String expected = "long overflow";
        final Exception actual = assertThrows(ArithmeticException.class,
                () -> lender.addFunds(1L));
        assertThat(actual.getMessage()).isEqualTo(expected);
    }

}
