// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import g0.M;

public final class e
{
    public final String a;
    public final String b;
    public final String c;
    
    public e(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (e.class != o.getClass()) {
            return false;
        }
        final e e = (e)o;
        return M.c(this.a, e.a) && M.c(this.b, e.b) && M.c(this.c, e.c);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
}
