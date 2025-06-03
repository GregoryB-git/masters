// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public final class G implements f0
{
    public static final N b;
    public final N a;
    
    static {
        b = new N() {
            @Override
            public M a(final Class clazz) {
                throw new IllegalStateException("This should never be called.");
            }
            
            @Override
            public boolean b(final Class clazz) {
                return false;
            }
        };
    }
    
    public G() {
        this(b());
    }
    
    public G(final N n) {
        this.a = (N)z.b(n, "messageInfoFactory");
    }
    
    public static N b() {
        return new b(new N[] { w.c(), c() });
    }
    
    public static N c() {
        try {
            return (N)Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return G.b;
        }
    }
    
    public static boolean d(final M m) {
        return m.b() == Z.o;
    }
    
    public static e0 e(final Class clazz, final M m) {
        if (x.class.isAssignableFrom(clazz)) {
            if (d(m)) {
                return S.T(clazz, m, W.b(), E.b(), g0.L(), s.b(), L.b());
            }
            return S.T(clazz, m, W.b(), E.b(), g0.L(), null, L.b());
        }
        else {
            if (d(m)) {
                return S.T(clazz, m, W.a(), E.a(), g0.G(), s.a(), L.a());
            }
            return S.T(clazz, m, W.a(), E.a(), g0.H(), null, L.a());
        }
    }
    
    @Override
    public e0 a(final Class clazz) {
        g0.I(clazz);
        final M a = this.a.a(clazz);
        if (a.a()) {
            k0 k0;
            q q;
            if (x.class.isAssignableFrom(clazz)) {
                k0 = g0.L();
                q = s.b();
            }
            else {
                k0 = g0.G();
                q = s.a();
            }
            return T.m(k0, q, a.c());
        }
        return e(clazz, a);
    }
    
    public static class b implements N
    {
        public N[] a;
        
        public b(final N... a) {
            this.a = a;
        }
        
        @Override
        public M a(final Class clazz) {
            final N[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                final N n = a[i];
                if (n.b(clazz)) {
                    return n.a(clazz);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No factory is available for message type: ");
            sb.append(clazz.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
        
        @Override
        public boolean b(final Class clazz) {
            final N[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                if (a[i].b(clazz)) {
                    return true;
                }
            }
            return false;
        }
    }
}
