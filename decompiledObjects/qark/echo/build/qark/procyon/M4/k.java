// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

public enum k
{
    p(1099511627776L) {
    }, 
    q(1073741824L) {
    }, 
    r(1048576L) {
    }, 
    s(1024L) {
    }, 
    t(1L) {
    };
    
    public long o;
    
    public k(final String name, final int ordinal, final long o) {
        this.o = o;
    }
    
    public long c(final long n) {
        return n * this.o / k.s.o;
    }
}
