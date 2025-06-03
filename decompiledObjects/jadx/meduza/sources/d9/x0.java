package d9;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3736a;

    public x0(int i10) {
        this.f3736a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && this.f3736a == ((x0) obj).f3736a;
    }

    public final int hashCode() {
        return this.f3736a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("TransactionOptions{maxAttempts=");
        l10.append(this.f3736a);
        l10.append('}');
        return l10.toString();
    }
}
