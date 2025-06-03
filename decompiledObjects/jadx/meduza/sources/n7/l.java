package n7;

/* loaded from: classes.dex */
public final class l<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f11297a;

    public l(T t) {
        this.f11297a = t;
    }

    @Override // n7.h
    public final T a() {
        return this.f11297a;
    }

    @Override // n7.h
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f11297a.equals(((l) obj).f11297a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11297a.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Optional.of(");
        l10.append(this.f11297a);
        l10.append(")");
        return l10.toString();
    }
}
