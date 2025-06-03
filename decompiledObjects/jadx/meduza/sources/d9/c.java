package d9;

/* loaded from: classes.dex */
public final class c implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    public final ma.h f3646a;

    public c(ma.h hVar) {
        this.f3646a = hVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        return n9.o.c(this.f3646a, cVar.f3646a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && this.f3646a.equals(((c) obj).f3646a);
    }

    public final int hashCode() {
        return this.f3646a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Blob { bytes=");
        l10.append(n9.o.i(this.f3646a));
        l10.append(" }");
        return l10.toString();
    }
}
