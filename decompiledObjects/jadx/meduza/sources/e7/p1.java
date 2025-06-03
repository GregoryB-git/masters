package e7;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4557b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4558c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f4560e;

    public p1(l1 l1Var, long j10) {
        this.f4560e = l1Var;
        m6.j.e("health_monitor");
        m6.j.b(j10 > 0);
        this.f4556a = "health_monitor:start";
        this.f4557b = "health_monitor:count";
        this.f4558c = "health_monitor:value";
        this.f4559d = j10;
    }

    public final void a() {
        this.f4560e.l();
        ((b.z) this.f4560e.zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f4560e.v().edit();
        edit.remove(this.f4557b);
        edit.remove(this.f4558c);
        edit.putLong(this.f4556a, currentTimeMillis);
        edit.apply();
    }
}
