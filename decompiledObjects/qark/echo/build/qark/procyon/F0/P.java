// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

public final class P implements M
{
    public final long a;
    public final long b;
    
    public P(final long n) {
        this(n, 0L);
    }
    
    public P(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public a j(final long n) {
        return new a(new N(n, this.b));
    }
    
    @Override
    public long l() {
        return this.a;
    }
}
