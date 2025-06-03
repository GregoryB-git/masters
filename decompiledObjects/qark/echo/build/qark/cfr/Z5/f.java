/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 */
package Z5;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface f {
    public String c() default "";

    public String f() default "";

    public int[] l() default {};

    public String m() default "";

    public int v() default 1;
}

