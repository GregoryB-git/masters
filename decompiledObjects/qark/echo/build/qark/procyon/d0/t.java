// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.M;

public class t
{
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;
    
    static {
        c = M.w0(0);
        d = M.w0(1);
    }
    
    public t(final String s, final String b) {
        this.a = M.L0(s);
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final t t = (t)o;
        return M.c(this.a, t.a) && M.c(this.b, t.b);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.b.hashCode();
        final String a = this.a;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
}
