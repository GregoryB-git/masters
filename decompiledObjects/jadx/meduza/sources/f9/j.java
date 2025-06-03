package f9;

import j9.q;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5508a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5509b;

    /* renamed from: c, reason: collision with root package name */
    public final q f5510c;

    public j(String str, i iVar, q qVar) {
        this.f5508a = str;
        this.f5509b = iVar;
        this.f5510c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f5508a.equals(jVar.f5508a) && this.f5509b.equals(jVar.f5509b)) {
            return this.f5510c.equals(jVar.f5510c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5510c.hashCode() + ((this.f5509b.hashCode() + (this.f5508a.hashCode() * 31)) * 31);
    }
}
