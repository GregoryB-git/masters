package e7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzdj;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: d, reason: collision with root package name */
    public static volatile zzdj f4700d;

    /* renamed from: a, reason: collision with root package name */
    public final c3 f4701a;

    /* renamed from: b, reason: collision with root package name */
    public final i6.p f4702b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f4703c;

    public v(c3 c3Var) {
        m6.j.i(c3Var);
        this.f4701a = c3Var;
        this.f4702b = new i6.p(this, c3Var, 3);
    }

    public final void a() {
        this.f4703c = 0L;
        d().removeCallbacks(this.f4702b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            ((b.z) this.f4701a.zzb()).getClass();
            this.f4703c = System.currentTimeMillis();
            if (d().postDelayed(this.f4702b, j10)) {
                return;
            }
            this.f4701a.zzj().f4060o.c("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public abstract void c();

    public final Handler d() {
        zzdj zzdjVar;
        if (f4700d != null) {
            return f4700d;
        }
        synchronized (v.class) {
            if (f4700d == null) {
                f4700d = new zzdj(this.f4701a.zza().getMainLooper());
            }
            zzdjVar = f4700d;
        }
        return zzdjVar;
    }
}
