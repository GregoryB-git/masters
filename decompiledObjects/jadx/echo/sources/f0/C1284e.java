package f0;

import android.os.Bundle;
import g0.AbstractC1297a;
import g0.M;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14126c = M.w0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f14127d = M.w0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f14128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14129b;

    public C1284e(String str, int i7) {
        this.f14128a = str;
        this.f14129b = i7;
    }

    public static C1284e a(Bundle bundle) {
        return new C1284e((String) AbstractC1297a.e(bundle.getString(f14126c)), bundle.getInt(f14127d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f14126c, this.f14128a);
        bundle.putInt(f14127d, this.f14129b);
        return bundle;
    }
}
