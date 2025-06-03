// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

public class i extends j
{
    public i(final Object o, final Object o2) {
        super(o, o2, g.j(), g.j());
    }
    
    public i(final Object o, final Object o2, final h h, final h h2) {
        super(o, o2, h, h2);
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public j l(Object value, final Object o, h f, final h h) {
        Object key = value;
        if (value == null) {
            key = this.getKey();
        }
        if ((value = o) == null) {
            value = this.getValue();
        }
        h a;
        if ((a = f) == null) {
            a = this.a();
        }
        if ((f = h) == null) {
            f = this.f();
        }
        return new i(key, value, a, f);
    }
    
    @Override
    public a n() {
        return h.a.o;
    }
    
    @Override
    public int size() {
        return this.a().size() + 1 + this.f().size();
    }
}
