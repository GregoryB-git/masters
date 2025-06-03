// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public enum p3
{
    p("STORAGE", 0, new q3.a[] { q3.a.p, q3.a.q }), 
    q("DMA", 1, new q3.a[] { q3.a.r });
    
    public final q3.a[] o;
    
    public p3(final String name, final int ordinal, final q3.a... o) {
        this.o = o;
    }
    
    public final q3.a[] c() {
        return this.o;
    }
}
