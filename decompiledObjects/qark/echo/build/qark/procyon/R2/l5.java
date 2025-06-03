// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import android.content.Context;
import com.google.android.gms.internal.measurement.t0;
import android.os.Looper;
import android.os.Handler;

public final class l5 extends f1
{
    public Handler c;
    public boolean d;
    public final t5 e;
    public final r5 f;
    public final q5 g;
    
    public l5(final N2 n2) {
        super(n2);
        this.d = true;
        this.e = new t5(this);
        this.f = new r5(this);
        this.g = new q5(this);
    }
    
    private final void G() {
        this.n();
        if (this.c == null) {
            this.c = new t0(Looper.getMainLooper());
        }
    }
    
    @Override
    public final boolean A() {
        return false;
    }
    
    public final void D(final boolean d) {
        this.n();
        this.d = d;
    }
    
    public final boolean E(final boolean b, final boolean b2, final long n) {
        return this.f.d(b, b2, n);
    }
    
    public final boolean F() {
        this.n();
        return this.d;
    }
}
