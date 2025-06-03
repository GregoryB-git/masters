// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T5;

import t1.b;

public final class f implements AutoCloseable
{
    public f(final String s) {
        a(s);
    }
    
    public static void a(final String s) {
        b.c(c(s));
    }
    
    public static void b(final String s, final int n) {
        b.a(c(s), n);
    }
    
    public static String c(final String s) {
        if (s.length() < 124) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, 124));
        sb.append("...");
        return sb.toString();
    }
    
    public static void e() {
        b.f();
    }
    
    public static void h(final String s, final int n) {
        b.d(c(s), n);
    }
    
    public static f i(final String s) {
        return new f(s);
    }
    
    @Override
    public void close() {
        e();
    }
}
