// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.s7;

public final class i4 implements Runnable
{
    public final /* synthetic */ q3 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ q3 s;
    public final /* synthetic */ C3 t;
    
    public i4(final C3 t, final q3 o, final long p6, final long q, final boolean r, final q3 s) {
        this.t = t;
        this.o = o;
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public final void run() {
        this.t.G(this.o);
        this.t.E(this.p, false);
        C3.K(this.t, this.o, this.q, true, this.r);
        if (s7.a() && this.t.f().s(K.x0)) {
            C3.L(this.t, this.o, this.s);
        }
    }
}
