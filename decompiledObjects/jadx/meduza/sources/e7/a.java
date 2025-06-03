package e7;

import android.os.Bundle;
import java.util.Iterator;
import r.g;

/* loaded from: classes.dex */
public final class a extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final r.b f4054c;

    /* renamed from: d, reason: collision with root package name */
    public final r.b f4055d;

    /* renamed from: e, reason: collision with root package name */
    public long f4056e;

    public a(j2 j2Var) {
        super(j2Var);
        this.f4055d = new r.b();
        this.f4054c = new r.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(long j10) {
        q4 v10 = p().v(false);
        Iterator it = ((g.c) this.f4054c.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            v(str, j10 - ((Long) this.f4054c.getOrDefault(str, null)).longValue(), v10);
        }
        if (!this.f4054c.isEmpty()) {
            t(j10 - this.f4056e, v10);
        }
        w(j10);
    }

    public final void t(long j10, q4 q4Var) {
        if (q4Var == null) {
            zzj().f4067w.b("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().f4067w.c("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        r6.L(q4Var, bundle, true);
        o().Q("am", "_xa", bundle);
    }

    public final void u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().f4060o.b("Ad unit id must be a non-empty string");
        } else {
            zzl().u(new u(this, str, j10, 1));
        }
    }

    public final void v(String str, long j10, q4 q4Var) {
        if (q4Var == null) {
            zzj().f4067w.b("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().f4067w.c("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        r6.L(q4Var, bundle, true);
        o().Q("am", "_xu", bundle);
    }

    public final void w(long j10) {
        Iterator it = ((g.c) this.f4054c.keySet()).iterator();
        while (it.hasNext()) {
            this.f4054c.put((String) it.next(), Long.valueOf(j10));
        }
        if (this.f4054c.isEmpty()) {
            return;
        }
        this.f4056e = j10;
    }

    public final void x(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().f4060o.b("Ad unit id must be a non-empty string");
        } else {
            zzl().u(new u(this, str, j10, 0));
        }
    }
}
