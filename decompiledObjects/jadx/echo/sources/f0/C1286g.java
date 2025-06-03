package f0;

import android.os.Bundle;
import g0.M;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f14130d = M.w0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f14131e = M.w0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f14132f = M.w0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f14133a;

    /* renamed from: b, reason: collision with root package name */
    public int f14134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14135c;

    public C1286g(int i7, int i8, int i9) {
        this.f14133a = i7;
        this.f14134b = i8;
        this.f14135c = i9;
    }

    public static C1286g a(Bundle bundle) {
        return new C1286g(bundle.getInt(f14130d), bundle.getInt(f14131e), bundle.getInt(f14132f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f14130d, this.f14133a);
        bundle.putInt(f14131e, this.f14134b);
        bundle.putInt(f14132f, this.f14135c);
        return bundle;
    }
}
