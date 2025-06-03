package H0;

import g0.z;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2139c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2140d;

    public c(int i7, int i8, int i9, int i10) {
        this.f2137a = i7;
        this.f2138b = i8;
        this.f2139c = i9;
        this.f2140d = i10;
    }

    public static c c(z zVar) {
        int t7 = zVar.t();
        zVar.U(8);
        int t8 = zVar.t();
        int t9 = zVar.t();
        zVar.U(4);
        int t10 = zVar.t();
        zVar.U(12);
        return new c(t7, t8, t9, t10);
    }

    @Override // H0.a
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        return (this.f2138b & 16) == 16;
    }
}
