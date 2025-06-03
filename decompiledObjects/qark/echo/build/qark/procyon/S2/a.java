// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S2;

import A2.m;

public final class a implements d
{
    public static final a j;
    public final boolean a = false;
    public final boolean b = false;
    public final String c = null;
    public final boolean d = false;
    public final String e = null;
    public final String f = null;
    public final boolean g = false;
    public final Long h = null;
    public final Long i = null;
    
    static {
        j = new a(false, false, null, false, null, null, false, null, null, null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final boolean a = ((a)o).a;
        return m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null);
    }
    
    @Override
    public final int hashCode() {
        final Boolean false = Boolean.FALSE;
        return m.b(false, false, null, false, false, null, null, null, null);
    }
}
