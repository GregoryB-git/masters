// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import d4.m;
import java.util.Iterator;
import d4.i;

public class b
{
    public final i a;
    public final e b;
    
    public b(final e b, final i a) {
        this.a = a;
        this.b = b;
    }
    
    public static /* synthetic */ e a(final b b) {
        return b.b;
    }
    
    public boolean b() {
        return this.a.k().isEmpty() ^ true;
    }
    
    public Iterable c() {
        return new Iterable() {
            public final /* synthetic */ Iterator o = Q3.b.this.a.iterator();
            
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    public b b() {
                        final m m = Iterable.this.o.next();
                        return new b(Q3.b.a(Q3.b.this).W(m.c().e()), i.d(m.d()));
                    }
                    
                    @Override
                    public boolean hasNext() {
                        return Iterable.this.o.hasNext();
                    }
                    
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }
    
    public long d() {
        return this.a.k().E();
    }
    
    public String e() {
        return this.b.X();
    }
    
    public Object f() {
        Object o2;
        final Object o = o2 = this.a.k().t().getValue();
        if (o instanceof Long) {
            o2 = o;
        }
        return o2;
    }
    
    public e g() {
        return this.b;
    }
    
    public Object h() {
        return this.a.k().getValue();
    }
    
    public Object i(final boolean b) {
        return this.a.k().L(b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DataSnapshot { key = ");
        sb.append(this.b.X());
        sb.append(", value = ");
        sb.append(this.a.k().L(true));
        sb.append(" }");
        return sb.toString();
    }
}
