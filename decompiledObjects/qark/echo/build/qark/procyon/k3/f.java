// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import c3.k;
import p3.z;
import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.List;
import n3.c;
import c3.v;
import n3.b;

public abstract class f
{
    public static final n3.b.a a;
    
    static {
        a = new b(null);
    }
    
    public static c a(final v v) {
        final c.b a = c.a();
        a.d(v.d());
        final Iterator<List<v.c>> iterator = v.c().iterator();
        while (iterator.hasNext()) {
            for (final v.c c : iterator.next()) {
                a.a(c(c.h()), c.d(), b(c.e()), c.f().name());
            }
        }
        if (v.e() != null) {
            a.e(v.e().d());
        }
        try {
            return a.b();
        }
        catch (GeneralSecurityException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public static String b(final String s) {
        if (!s.startsWith("type.googleapis.com/google.crypto.")) {
            return s;
        }
        return s.substring(34);
    }
    
    public static k c(final z z) {
        final int n = f$a.a[z.ordinal()];
        if (n == 1) {
            return k.b;
        }
        if (n == 2) {
            return k.c;
        }
        if (n == 3) {
            return k.d;
        }
        throw new IllegalStateException("Unknown key status");
    }
    
    public static class b implements a
    {
        @Override
        public void a() {
        }
        
        @Override
        public void b(final int n, final long n2) {
        }
    }
}
