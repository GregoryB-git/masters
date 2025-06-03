package sb;

/* loaded from: classes.dex */
public final class v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f14327a;

    /* renamed from: b, reason: collision with root package name */
    public final T f14328b;

    public v(int i10, T t) {
        this.f14327a = i10;
        this.f14328b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f14327a == vVar.f14327a && ec.i.a(this.f14328b, vVar.f14328b);
    }

    public final int hashCode() {
        int i10 = this.f14327a * 31;
        T t = this.f14328b;
        return i10 + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("IndexedValue(index=");
        l10.append(this.f14327a);
        l10.append(", value=");
        l10.append(this.f14328b);
        l10.append(')');
        return l10.toString();
    }
}
