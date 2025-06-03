// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class v4 implements b5
{
    public static final J4 b;
    public final J4 a;
    
    static {
        b = new z4();
    }
    
    public v4() {
        this(new B4(new J4[] { Z3.c(), b() }));
    }
    
    public v4(final J4 j4) {
        this.a = (J4)a4.f(j4, "messageInfoFactory");
    }
    
    public static J4 b() {
        try {
            return (J4)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return v4.b;
        }
    }
    
    public static boolean c(final G4 g4) {
        return x4.a[g4.b().ordinal()] != 1;
    }
    
    @Override
    public final Z4 a(final Class clazz) {
        a5.o(clazz);
        final G4 a = this.a.a(clazz);
        if (a.c()) {
            if (Y3.class.isAssignableFrom(clazz)) {
                return O4.j(a5.u(), P3.b(), a.a());
            }
            return O4.j(a5.f(), P3.a(), a.a());
        }
        else if (Y3.class.isAssignableFrom(clazz)) {
            final boolean c = c(a);
            final P4 b = Q4.b();
            final q4 c2 = q4.c();
            final x5 u = a5.u();
            if (c) {
                return M4.n(clazz, a, b, c2, u, P3.b(), H4.b());
            }
            return M4.n(clazz, a, b, c2, u, null, H4.b());
        }
        else {
            final boolean c3 = c(a);
            final P4 a2 = Q4.a();
            final q4 a3 = q4.a();
            final x5 f = a5.f();
            if (c3) {
                return M4.n(clazz, a, a2, a3, f, P3.a(), H4.a());
            }
            return M4.n(clazz, a, a2, a3, f, null, H4.a());
        }
    }
}
