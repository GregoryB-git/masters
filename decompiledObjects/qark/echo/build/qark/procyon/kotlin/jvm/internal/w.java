// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.g;
import m6.f;
import m6.d;
import m6.c;
import m6.e;

public class w
{
    public e a(final i i) {
        return i;
    }
    
    public c b(final Class clazz) {
        return new kotlin.jvm.internal.e(clazz);
    }
    
    public d c(final Class clazz, final String s) {
        return new m(clazz, s);
    }
    
    public f d(final n n) {
        return n;
    }
    
    public g e(final p p) {
        return p;
    }
    
    public String f(final h h) {
        String s2;
        final String s = s2 = h.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
    
    public String g(final l l) {
        return this.f(l);
    }
}
