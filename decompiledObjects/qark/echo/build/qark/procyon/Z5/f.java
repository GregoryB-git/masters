// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    String c() default "";
    
    String f() default "";
    
    int[] l() default {};
    
    String m() default "";
    
    int v() default 1;
}
