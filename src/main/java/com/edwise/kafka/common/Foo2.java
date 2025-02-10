package com.edwise.kafka.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foo2 {

    private String foo;

    @Override
    public String toString() {
        return "Foo2 [foo=" + this.foo + "]";
    }

}