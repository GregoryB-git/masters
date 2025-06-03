// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

public final class v implements Runnable
{
    public final /* synthetic */ w o;
    
    public v(final w o) {
        this.o = o;
    }
    
    @Override
    public final void run() {
        final x a = this.o.a;
        x.s(a).f(x.s(a).getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
