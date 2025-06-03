package d5;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r4.a[] f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3481c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3482d;

    public f(String str, String str2, long[] jArr, r4.a[] aVarArr) {
        this.f3481c = str;
        this.f3482d = str2;
        this.f3480b = jArr;
        this.f3479a = aVarArr;
    }

    public final String a() {
        return this.f3481c + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.f3482d;
    }
}
