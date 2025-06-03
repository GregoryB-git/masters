// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

public class q extends h
{
    public static final q o;
    
    static {
        o = new q();
    }
    
    public static q j() {
        return q.o;
    }
    
    @Override
    public String c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }
    
    @Override
    public boolean e(final n n) {
        return n.t().isEmpty() ^ true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof q;
    }
    
    @Override
    public m f(final b b, final n n) {
        return new m(b, new t("[PRIORITY-POST]", n));
    }
    
    @Override
    public m g() {
        return this.f(b.m(), n.l);
    }
    
    @Override
    public int hashCode() {
        return 3155577;
    }
    
    public int i(final m m, final m i) {
        return d4.o.c(m.c(), m.d().t(), i.c(), i.d().t());
    }
    
    @Override
    public String toString() {
        return "PriorityIndex";
    }
}
