package br.com.zildo.restWithSpringBoot;

import lombok.Data;

@Data
public class Greeting {

    private final long Id;
    private final String content;
}
