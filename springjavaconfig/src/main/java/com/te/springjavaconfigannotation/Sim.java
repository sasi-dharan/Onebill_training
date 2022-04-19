package com.te.springjavaconfigannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Sim {
	@Value(value="jio")
String name;
	@Value(value="37285q30785")
String number;
}
