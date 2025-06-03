package t5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: c, reason: collision with root package name */
    public int f14558c;

    /* renamed from: d, reason: collision with root package name */
    public int f14559d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14556a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f14557b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f14560e = 0;
    public a[] f = new a[100];

    public final synchronized void a() {
        int i10 = this.f14558c;
        int i11 = this.f14557b;
        int i12 = v5.e0.f15881a;
        int max = Math.max(0, (((i10 + i11) - 1) / i11) - this.f14559d);
        int i13 = this.f14560e;
        if (max >= i13) {
            return;
        }
        Arrays.fill(this.f, max, i13, (Object) null);
        this.f14560e = max;
    }
}
