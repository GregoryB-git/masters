// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.s7;

public final class l4 implements Runnable
{
    public final /* synthetic */ q3 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ q3 r;
    public final /* synthetic */ C3 s;
    
    public l4(final C3 s, final q3 o, final long p5, final boolean q, final q3 r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        this.s.G(this.o);
        C3.K(this.s, this.o, this.p, false, this.q);
        if (s7.a() && this.s.f().s(K.x0)) {
            C3.L(this.s, this.o, this.r);
        }
    }
}
