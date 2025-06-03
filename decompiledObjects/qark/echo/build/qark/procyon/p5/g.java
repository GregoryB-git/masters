// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p5;

public class g
{
    public final e a;
    public final Runnable b;
    
    public g(final e a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public void a() {
        this.b.run();
    }
}
