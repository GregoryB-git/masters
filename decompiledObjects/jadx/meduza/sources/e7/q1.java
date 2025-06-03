package e7;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4576a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4577b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4578c;

    /* renamed from: d, reason: collision with root package name */
    public long f4579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f4580e;

    public q1(l1 l1Var, String str, long j10) {
        this.f4580e = l1Var;
        m6.j.e(str);
        this.f4576a = str;
        this.f4577b = j10;
    }

    public final long a() {
        if (!this.f4578c) {
            this.f4578c = true;
            this.f4579d = this.f4580e.v().getLong(this.f4576a, this.f4577b);
        }
        return this.f4579d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f4580e.v().edit();
        edit.putLong(this.f4576a, j10);
        edit.apply();
        this.f4579d = j10;
    }
}
