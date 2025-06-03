// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.G6;

public final class r5
{
    public long a;
    public long b;
    public final x c;
    public final /* synthetic */ l5 d;
    
    public r5(final l5 d) {
        this.d = d;
        this.c = new u5(this, d.a);
        final long b = d.b().b();
        this.a = b;
        this.b = b;
    }
    
    public final long a(final long b) {
        return (this.b = b) - this.b;
    }
    
    public final void b() {
        this.c.a();
        this.a = 0L;
        this.b = 0L;
    }
    
    public final boolean d(final boolean b, final boolean b2, final long a) {
        this.d.n();
        this.d.v();
        if (!G6.a() || !this.d.f().s(K.q0) || this.d.a.p()) {
            this.d.i().p.b(this.d.b().a());
        }
        long a2 = a - this.a;
        if (!b && a2 < 1000L) {
            this.d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", a2);
            return false;
        }
        if (!b2) {
            a2 = this.a(a);
        }
        this.d.j().K().b("Recording user engagement, ms", a2);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_et", a2);
        S5.L(this.d.s().C(this.d.f().Q() ^ true), bundle, true);
        if (!b2) {
            this.d.r().z0("auto", "_e", bundle);
        }
        this.a = a;
        this.c.a();
        this.c.b(3600000L);
        return true;
    }
    
    public final void e(final long n) {
        this.c.a();
    }
    
    public final void f(final long n) {
        this.d.n();
        this.c.a();
        this.a = n;
        this.b = n;
    }
}
