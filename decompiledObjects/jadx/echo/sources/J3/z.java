package J3;

import J3.D;

/* loaded from: classes.dex */
public final class z extends D.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3034a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3036c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3037d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3038e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3039f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3040g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3041h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3042i;

    public z(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f3034a = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f3035b = str;
        this.f3036c = i8;
        this.f3037d = j7;
        this.f3038e = j8;
        this.f3039f = z7;
        this.f3040g = i9;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f3041h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f3042i = str3;
    }

    @Override // J3.D.b
    public int a() {
        return this.f3034a;
    }

    @Override // J3.D.b
    public int b() {
        return this.f3036c;
    }

    @Override // J3.D.b
    public long d() {
        return this.f3038e;
    }

    @Override // J3.D.b
    public boolean e() {
        return this.f3039f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.b)) {
            return false;
        }
        D.b bVar = (D.b) obj;
        return this.f3034a == bVar.a() && this.f3035b.equals(bVar.g()) && this.f3036c == bVar.b() && this.f3037d == bVar.j() && this.f3038e == bVar.d() && this.f3039f == bVar.e() && this.f3040g == bVar.i() && this.f3041h.equals(bVar.f()) && this.f3042i.equals(bVar.h());
    }

    @Override // J3.D.b
    public String f() {
        return this.f3041h;
    }

    @Override // J3.D.b
    public String g() {
        return this.f3035b;
    }

    @Override // J3.D.b
    public String h() {
        return this.f3042i;
    }

    public int hashCode() {
        int hashCode = (((((this.f3034a ^ 1000003) * 1000003) ^ this.f3035b.hashCode()) * 1000003) ^ this.f3036c) * 1000003;
        long j7 = this.f3037d;
        int i7 = (hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f3038e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f3039f ? 1231 : 1237)) * 1000003) ^ this.f3040g) * 1000003) ^ this.f3041h.hashCode()) * 1000003) ^ this.f3042i.hashCode();
    }

    @Override // J3.D.b
    public int i() {
        return this.f3040g;
    }

    @Override // J3.D.b
    public long j() {
        return this.f3037d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f3034a + ", model=" + this.f3035b + ", availableProcessors=" + this.f3036c + ", totalRam=" + this.f3037d + ", diskSpace=" + this.f3038e + ", isEmulator=" + this.f3039f + ", state=" + this.f3040g + ", manufacturer=" + this.f3041h + ", modelClass=" + this.f3042i + "}";
    }
}
