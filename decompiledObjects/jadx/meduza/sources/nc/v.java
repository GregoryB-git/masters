package nc;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11558a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.l<Throwable, rb.h> f11559b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, dc.l<? super Throwable, rb.h> lVar) {
        this.f11558a = obj;
        this.f11559b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return ec.i.a(this.f11558a, vVar.f11558a) && ec.i.a(this.f11559b, vVar.f11559b);
    }

    public final int hashCode() {
        Object obj = this.f11558a;
        return this.f11559b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CompletedWithCancellation(result=");
        l10.append(this.f11558a);
        l10.append(", onCancellation=");
        l10.append(this.f11559b);
        l10.append(')');
        return l10.toString();
    }
}
