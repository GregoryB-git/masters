package k0;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f15693c = new b1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f15694a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15695b;

    public b1(int i7, boolean z7) {
        this.f15694a = i7;
        this.f15695b = z7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f15694a == b1Var.f15694a && this.f15695b == b1Var.f15695b;
    }

    public int hashCode() {
        return (this.f15694a << 1) + (this.f15695b ? 1 : 0);
    }
}
