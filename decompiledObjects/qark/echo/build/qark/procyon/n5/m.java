// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

public final class m
{
    public final l a;
    public final Runnable b;
    
    public m(final l a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public Integer a() {
        final l a = this.a;
        if (a != null) {
            return a.a();
        }
        return null;
    }
    
    public boolean b() {
        final l a = this.a;
        return a != null && a.b();
    }
}
