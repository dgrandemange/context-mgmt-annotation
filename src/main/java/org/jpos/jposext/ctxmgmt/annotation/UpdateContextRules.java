package org.jpos.jposext.ctxmgmt.annotation;

/**
 * Annotation usage sample :<br>
 * <br>
 * {@code @UpdateContextRules({<br>
		&nbsp;&nbsp;@UpdateContextRule(attrNames={"attr0"}), // default rule (no transition id); one attribute to put in context<br>
		&nbsp;&nbsp;@UpdateContextRule(id="ok", attrNames={"attr1","attr2","attr3"}), // for transition "ok", three attributes {"attr1","attr2","attr3"} to put in context<br>
		&nbsp;&nbsp;@UpdateContextRule(id="nok", attrNames={"attr4","attr5"}) // for transition "nok", two attributes {"attr4","attr5"} to put in context<br>
		})}
 * 
 * @author dgrandemange
 *
 */
public @interface UpdateContextRules {

	UpdateContextRule[] value();

}
