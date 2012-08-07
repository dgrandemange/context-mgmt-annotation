package org.jpos.jposext.ctxmgmt.annotation;

/**
 * @author dgrandemange
 *
 */
public @interface UpdateContextRule {

	public final static String DEFAULT_ID="default";
	
	String id() default DEFAULT_ID;

	String[] attrNames();

}
