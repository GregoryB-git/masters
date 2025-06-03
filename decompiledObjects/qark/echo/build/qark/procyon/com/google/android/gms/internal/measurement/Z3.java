// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class Z3 implements J4
{
    public static final Z3 a;
    
    static {
        a = new Z3();
    }
    
    public static Z3 c() {
        return Z3.a;
    }
    
    @Override
    public final G4 a(final Class clazz) {
        if (Y3.class.isAssignableFrom(clazz)) {
            try {
                return (G4)Y3.l(clazz.asSubclass(Y3.class)).p(Y3.c.c, null, null);
            }
            catch (Exception cause) {
                final String name = clazz.getName();
                final StringBuilder sb = new StringBuilder("Unable to get message info for ");
                sb.append(name);
                throw new RuntimeException(sb.toString(), cause);
            }
        }
        final String name2 = clazz.getName();
        final StringBuilder sb2 = new StringBuilder("Unsupported message type: ");
        sb2.append(name2);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public final boolean b(final Class clazz) {
        return Y3.class.isAssignableFrom(clazz);
    }
}
