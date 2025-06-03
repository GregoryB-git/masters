package v5;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f15981c = new w(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f15982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15983b;

    static {
        new w(0, 0);
    }

    public w(int i10, int i11) {
        x6.b.q((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f15982a = i10;
        this.f15983b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f15982a == wVar.f15982a && this.f15983b == wVar.f15983b;
    }

    public final int hashCode() {
        int i10 = this.f15983b;
        int i11 = this.f15982a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        return this.f15982a + "x" + this.f15983b;
    }
}
