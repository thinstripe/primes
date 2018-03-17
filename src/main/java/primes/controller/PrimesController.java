package primes.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import primes.PrimeIntStream;
import primes.dto.Primes;

import java.util.stream.Collectors;

@Controller
@EnableAutoConfiguration
public class PrimesController {
    @GetMapping("/primes/{initial}")
    @ResponseBody
    Primes primes(@PathVariable("initial") final int initial) {
        return new Primes(initial, PrimeIntStream.upto(initial).boxed().collect(Collectors.toList()));
    }
}
