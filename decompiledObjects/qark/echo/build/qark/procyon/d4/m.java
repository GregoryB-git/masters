// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

public final class m
{
    public static final m c;
    public static final m d;
    public final b a;
    public final n b;
    
    static {
        c = new m(b.n(), g.W());
        d = new m(b.m(), n.l);
    }
    
    public m(final b a, final n b) {
        this.a = a;
        this.b = b;
    }
    
    public static m a() {
        return m.d;
    }
    
    public static m b() {
        return m.c;
    }
    
    public b c() {
        return this.a;
    }
    
    public n d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (m.class != o.getClass()) {
            return false;
        }
        final m m = (m)o;
        return this.a.equals(m.a) && this.b.equals(m.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NamedNode{name=");
        sb.append(this.a);
        sb.append(", node=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
