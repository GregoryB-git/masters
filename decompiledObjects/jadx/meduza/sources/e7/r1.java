package e7;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4607a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4608b;

    /* renamed from: c, reason: collision with root package name */
    public String f4609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f4610d;

    public r1(l1 l1Var, String str) {
        this.f4610d = l1Var;
        m6.j.e(str);
        this.f4607a = str;
    }

    public final String a() {
        if (!this.f4608b) {
            this.f4608b = true;
            this.f4609c = this.f4610d.v().getString(this.f4607a, null);
        }
        return this.f4609c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f4610d.v().edit();
        edit.putString(this.f4607a, str);
        edit.apply();
        this.f4609c = str;
    }
}
