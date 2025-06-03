// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import java.util.NoSuchElementException;

public abstract class b implements n
{
    public final long b;
    public final long c;
    public long d;
    
    public b(final long b, final long c) {
        this.b = b;
        this.c = c;
        this.f();
    }
    
    public final void c() {
        final long d = this.d;
        if (d >= this.b && d <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    public final long d() {
        return this.d;
    }
    
    public boolean e() {
        return this.d > this.c;
    }
    
    public void f() {
        this.d = this.b - 1L;
    }
    
    @Override
    public boolean next() {
        ++this.d;
        return this.e() ^ true;
    }
}
