// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

public class f extends j
{
    public int e;
    
    public f(final Object o, final Object o2, final h h, final h h2) {
        super(o, o2, h, h2);
        this.e = -1;
    }
    
    @Override
    public boolean d() {
        return false;
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
        return new f(key, value, a, f);
    }
    
    @Override
    public a n() {
        return h.a.p;
    }
    
    @Override
    public int size() {
        if (this.e == -1) {
            this.e = this.a().size() + 1 + this.f().size();
        }
        return this.e;
    }
    
    @Override
    public void u(final h h) {
        if (this.e == -1) {
            super.u(h);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }
}
