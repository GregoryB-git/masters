// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

public class j extends h
{
    public static final j o;
    
    static {
        o = new j();
    }
    
    public static j j() {
        return j.o;
    }
    
    @Override
    public String c() {
        return ".key";
    }
    
    @Override
    public boolean e(final n n) {
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof j;
    }
    
    @Override
    public m f(final b b, final n n) {
        Y3.m.f(n instanceof t);
        return new m(b.j((String)n.getValue()), g.W());
    }
    
    @Override
    public m g() {
        return m.a();
    }
    
    @Override
    public int hashCode() {
        return 37;
    }
    
    public int i(final m m, final m i) {
        return m.c().h(i.c());
    }
    
    @Override
    public String toString() {
        return "KeyIndex";
    }
}
