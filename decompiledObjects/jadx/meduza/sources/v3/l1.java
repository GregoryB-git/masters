package v3;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f15514b = new l1(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15515a;

    public l1(boolean z10) {
        this.f15515a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l1.class == obj.getClass() && this.f15515a == ((l1) obj).f15515a;
    }

    public final int hashCode() {
        return !this.f15515a ? 1 : 0;
    }
}
