package Assignment;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NameConfig {
@Bean
public ListofName name() {
	return new ListofName(Arrays.asList("ram","rajan","sd"));
	
}
}
