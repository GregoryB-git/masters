// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r3;

import c3.y;

public final class b
{
    public final a a;
    
    public b(final a a) {
        this.a = a;
    }
    
    public static b a(final byte[] array, final y y) {
        if (y != null) {
            return new b(a.a(array));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
    
    public int b() {
        return this.a.c();
    }
}
