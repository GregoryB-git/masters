package Y0;

import F0.C0364i;
import F0.I;

/* loaded from: classes.dex */
public final class a extends C0364i implements g {

    /* renamed from: h, reason: collision with root package name */
    public final int f7299h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7300i;

    public a(long j7, long j8, int i7, int i8, boolean z7) {
        super(j7, j8, i7, i8, z7);
        this.f7299h = i7;
        this.f7300i = j7 == -1 ? -1L : j7;
    }

    @Override // Y0.g
    public long c(long j7) {
        return b(j7);
    }

    @Override // Y0.g
    public long f() {
        return this.f7300i;
    }

    @Override // Y0.g
    public int k() {
        return this.f7299h;
    }

    public a(long j7, long j8, I.a aVar, boolean z7) {
        this(j7, j8, aVar.f1786f, aVar.f1783c, z7);
    }
}
