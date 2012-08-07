package org.jpos.jposext.ctxmgmt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateContextRules {

	UpdateContextRule[] value();

}
