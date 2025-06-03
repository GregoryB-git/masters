// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

public final class d
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public d f;
    public d g;
    
    public d() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public d(final byte[] a, final int b, final int c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final d a() {
        final d f = this.f;
        d d;
        if (f != this) {
            d = f;
        }
        else {
            d = null;
        }
        final d g = this.g;
        g.f = f;
        this.f.g = g;
        this.f = null;
        this.g = null;
        return d;
    }
    
    public final d b(final d d) {
        d.g = this;
        d.f = this.f;
        this.f.g = d;
        return this.f = d;
    }
    
    public final d c() {
        this.d = true;
        return new d(this.a, this.b, this.c, true, false);
    }
}
