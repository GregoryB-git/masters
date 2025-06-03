// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

public class u extends h
{
    public static final u o;
    
    static {
        o = new u();
    }
    
    public static u j() {
        return u.o;
    }
    
    @Override
    public String c() {
        return ".value";
    }
    
    @Override
    public boolean e(final n n) {
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof u;
    }
    
    @Override
    public m f(final b b, final n n) {
        return new m(b, n);
    }
    
    @Override
    public m g() {
        return new m(b.m(), n.l);
    }
    
    @Override
    public int hashCode() {
        return 4;
    }
    
    public int i(final m m, final m i) {
        final int compareTo = m.d().compareTo(i.d());
        if (compareTo == 0) {
            return m.c().h(i.c());
        }
        return compareTo;
    }
    
    @Override
    public String toString() {
        return "ValueIndex";
    }
}
