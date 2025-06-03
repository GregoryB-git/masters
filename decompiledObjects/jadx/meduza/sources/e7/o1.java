package e7;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4538c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f4540e;

    public o1(l1 l1Var, String str, boolean z10) {
        this.f4540e = l1Var;
        m6.j.e(str);
        this.f4536a = str;
        this.f4537b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f4540e.v().edit();
        edit.putBoolean(this.f4536a, z10);
        edit.apply();
        this.f4539d = z10;
    }

    public final boolean b() {
        if (!this.f4538c) {
            this.f4538c = true;
            this.f4539d = this.f4540e.v().getBoolean(this.f4536a, this.f4537b);
        }
        return this.f4539d;
    }
}
