package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //메소드에만 적용되는 annotation
@Retention(RetentionPolicy.RUNTIME) //언제까지 실행할 것인가. runtime 중 실행
public @interface LogExecutionTime {

}
