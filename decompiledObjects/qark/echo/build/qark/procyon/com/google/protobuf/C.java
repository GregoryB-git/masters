// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public final class C implements a0
{
    public static final J b;
    public final J a;
    
    static {
        b = new J() {
            @Override
            public I a(final Class clazz) {
                throw new IllegalStateException("This should never be called.");
            }
            
            @Override
            public boolean b(final Class clazz) {
                return false;
            }
        };
    }
    
    public C() {
        this(b());
    }
    
    public C(final J j) {
        this.a = (J)t.b(j, "messageInfoFactory");
    }
    
    public static J b() {
        return new b(new J[] { q.c(), c() });
    }
    
    public static J c() {
        try {
            return (J)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return C.b;
        }
    }
    
    public static boolean d(final I i) {
        return i.b() == V.o;
    }
    
    public static Z e(final Class clazz, final I i) {
        if (r.class.isAssignableFrom(clazz)) {
            if (d(i)) {
                return N.I(clazz, i, S.b(), A.b(), b0.J(), n.b(), H.b());
            }
            return N.I(clazz, i, S.b(), A.b(), b0.J(), null, H.b());
        }
        else {
            if (d(i)) {
                return N.I(clazz, i, S.a(), A.a(), b0.F(), n.a(), H.a());
            }
            return N.I(clazz, i, S.a(), A.a(), b0.G(), null, H.a());
        }
    }
    
    @Override
    public Z a(final Class clazz) {
        b0.H(clazz);
        final I a = this.a.a(clazz);
        if (a.a()) {
            g0 g0;
            l l;
            if (r.class.isAssignableFrom(clazz)) {
                g0 = b0.J();
                l = n.b();
            }
            else {
                g0 = b0.F();
                l = n.a();
            }
            return O.j(g0, l, a.c());
        }
        return e(clazz, a);
    }
    
    public static class b implements J
    {
        public J[] a;
        
        public b(final J... a) {
            this.a = a;
        }
        
        @Override
        public I a(final Class clazz) {
            final J[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                final J j = a[i];
                if (j.b(clazz)) {
                    return j.a(clazz);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No factory is available for message type: ");
            sb.append(clazz.getName());
            throw new UnsupportedOperationException(sb.toString());
        }
        
        @Override
        public boolean b(final Class clazz) {
            final J[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                if (a[i].b(clazz)) {
                    return true;
                }
            }
            return false;
        }
    }
}
