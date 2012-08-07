package org.jpos.jposext.ctxmgmt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dgrandemange
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateContextRule {

	public final static String DEFAULT_ID="default";
	
	String id() default DEFAULT_ID;

	String[] attrNames();

}
