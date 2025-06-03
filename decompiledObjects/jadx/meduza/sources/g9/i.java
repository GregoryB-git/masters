package g9;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f5971a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.g f5972b;

    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public i(a aVar, j9.g gVar) {
        this.f5971a = aVar;
        this.f5972b = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5971a.equals(iVar.f5971a) && this.f5972b.equals(iVar.f5972b);
    }

    public final int hashCode() {
        return this.f5972b.getData().hashCode() + ((this.f5972b.getKey().hashCode() + ((this.f5971a.hashCode() + 1891) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DocumentViewChange(");
        l10.append(this.f5972b);
        l10.append(",");
        l10.append(this.f5971a);
        l10.append(")");
        return l10.toString();
    }
}
