// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

import java.lang.annotation.Annotation;

public @interface d {
    a intEncoding() default a.o;
    
    int tag();
    
    public enum a
    {
        o("DEFAULT", 0), 
        p("SIGNED", 1), 
        q("FIXED", 2);
        
        public a(final String name, final int ordinal) {
        }
    }
}
