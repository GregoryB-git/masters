// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import V3.k;
import java.util.Comparator;

public abstract class h implements Comparator
{
    public static h b(final String s) {
        if (s.equals(".value")) {
            return u.j();
        }
        if (s.equals(".key")) {
            return j.j();
        }
        if (!s.equals(".priority")) {
            return new p(new k(s));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }
    
    public int a(final m m, final m i, final boolean b) {
        if (b) {
            return this.compare(i, m);
        }
        return this.compare(m, i);
    }
    
    public abstract String c();
    
    public boolean d(final n n, final n n2) {
        return this.compare(new m(b.n(), n), new m(b.n(), n2)) != 0;
    }
    
    public abstract boolean e(final n p0);
    
    public abstract m f(final b p0, final n p1);
    
    public abstract m g();
    
    public m h() {
        return m.b();
    }
}
