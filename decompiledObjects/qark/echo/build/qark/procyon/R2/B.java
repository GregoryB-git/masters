// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import E2.e;
import android.content.Context;
import java.util.Iterator;
import android.os.Bundle;
import A2.n;
import t.a;
import java.util.Map;

public final class B extends G1
{
    public final Map b;
    public final Map c;
    public long d;
    
    public B(final N2 n2) {
        super(n2);
        this.c = new a();
        this.b = new a();
    }
    
    public final void A(final String s, final long l, final w4 w4) {
        if (w4 == null) {
            this.j().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (l < 1000L) {
            this.j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", l);
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("_ai", s);
        ((BaseBundle)bundle).putLong("_xt", l);
        S5.L(w4, bundle, true);
        this.r().z0("am", "_xu", bundle);
    }
    
    public final void B(final long n) {
        final Iterator<String> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            this.b.put(iterator.next(), n);
        }
        if (!this.b.isEmpty()) {
            this.d = n;
        }
    }
    
    public final void D(final String s, final long n) {
        if (s != null && s.length() != 0) {
            this.e().D(new E0(this, s, n));
            return;
        }
        this.j().G().a("Ad unit id must be a non-empty string");
    }
    
    public final void v(final long n) {
        final w4 c = this.s().C(false);
        for (final String s : this.b.keySet()) {
            this.A(s, n - (long)this.b.get(s), c);
        }
        if (!this.b.isEmpty()) {
            this.w(n - this.d, c);
        }
        this.B(n);
    }
    
    public final void w(final long l, final w4 w4) {
        if (w4 == null) {
            this.j().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (l < 1000L) {
            this.j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", l);
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_xt", l);
        S5.L(w4, bundle, true);
        this.r().z0("am", "_xa", bundle);
    }
    
    public final void z(final String s, final long n) {
        if (s != null && s.length() != 0) {
            this.e().D(new R2.a(this, s, n));
            return;
        }
        this.j().G().a("Ad unit id must be a non-empty string");
    }
}
