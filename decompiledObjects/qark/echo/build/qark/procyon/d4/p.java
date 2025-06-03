// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import V3.k;

public final class p extends h
{
    public final k o;
    
    public p(final k o) {
        if (o.size() == 1 && o.Z().s()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.o = o;
    }
    
    @Override
    public String c() {
        return this.o.d0();
    }
    
    @Override
    public boolean e(final n n) {
        return n.A(this.o).isEmpty() ^ true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && p.class == o.getClass() && this.o.equals(((p)o).o));
    }
    
    @Override
    public m f(final b b, final n n) {
        return new m(b, g.W().y(this.o, n));
    }
    
    @Override
    public m g() {
        return new m(b.m(), g.W().y(this.o, n.l));
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    public int i(final m m, final m i) {
        final int compareTo = m.d().A(this.o).compareTo(i.d().A(this.o));
        if (compareTo == 0) {
            return m.c().h(i.c());
        }
        return compareTo;
    }
}
