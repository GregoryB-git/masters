// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class B4 implements J4
{
    public J4[] a;
    
    public B4(final J4... a) {
        this.a = a;
    }
    
    @Override
    public final G4 a(final Class clazz) {
        final J4[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final J4 j4 = a[i];
            if (j4.b(clazz)) {
                return j4.a(clazz);
            }
        }
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("No factory is available for message type: ");
        sb.append(name);
        throw new UnsupportedOperationException(sb.toString());
    }
    
    @Override
    public final boolean b(final Class clazz) {
        final J4[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].b(clazz)) {
                return true;
            }
        }
        return false;
    }
}
