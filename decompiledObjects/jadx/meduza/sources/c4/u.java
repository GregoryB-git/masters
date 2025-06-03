package c4;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f2318c = new u(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f2319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2320b;

    public u(long j10, long j11) {
        this.f2319a = j10;
        this.f2320b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2319a == uVar.f2319a && this.f2320b == uVar.f2320b;
    }

    public final int hashCode() {
        return (((int) this.f2319a) * 31) + ((int) this.f2320b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[timeUs=");
        l10.append(this.f2319a);
        l10.append(", position=");
        l10.append(this.f2320b);
        l10.append("]");
        return l10.toString();
    }
}
