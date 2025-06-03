package ea;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final m f5007a = m.SESSION_START;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f5008b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5009c;

    public y(f0 f0Var, b bVar) {
        this.f5008b = f0Var;
        this.f5009c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5007a == yVar.f5007a && ec.i.a(this.f5008b, yVar.f5008b) && ec.i.a(this.f5009c, yVar.f5009c);
    }

    public final int hashCode() {
        return this.f5009c.hashCode() + ((this.f5008b.hashCode() + (this.f5007a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SessionEvent(eventType=");
        l10.append(this.f5007a);
        l10.append(", sessionData=");
        l10.append(this.f5008b);
        l10.append(", applicationInfo=");
        l10.append(this.f5009c);
        l10.append(')');
        return l10.toString();
    }
}
