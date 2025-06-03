package R2;

import A2.AbstractC0328n;
import android.content.SharedPreferences;

/* renamed from: R2.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570o2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5441a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5443c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0549l2 f5445e;

    public C0570o2(C0549l2 c0549l2, String str, boolean z7) {
        this.f5445e = c0549l2;
        AbstractC0328n.e(str);
        this.f5441a = str;
        this.f5442b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor edit = this.f5445e.F().edit();
        edit.putBoolean(this.f5441a, z7);
        edit.apply();
        this.f5444d = z7;
    }

    public final boolean b() {
        if (!this.f5443c) {
            this.f5443c = true;
            this.f5444d = this.f5445e.F().getBoolean(this.f5441a, this.f5442b);
        }
        return this.f5444d;
    }
}
