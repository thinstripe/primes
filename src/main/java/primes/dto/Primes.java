package primes.dto;

import java.util.Collection;

public class Primes {
    public final Integer Initial;
    public final Collection<Integer> Primes;

    public Primes(Integer initial, Collection<Integer> primes) {
        this.Initial = initial;
        this.Primes = primes;
    }
}