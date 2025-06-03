package V3;

import i4.C1356a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f6661a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6662b;

    /* renamed from: c, reason: collision with root package name */
    public String f6663c;

    /* renamed from: d, reason: collision with root package name */
    public String f6664d;

    public void a(C1356a c1356a) {
        if (c1356a == null) {
            return;
        }
        String str = c1356a.a() + ":" + c1356a.b();
        this.f6661a = str;
        this.f6664d = str;
        this.f6662b = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f6662b == pVar.f6662b && this.f6661a.equals(pVar.f6661a)) {
            return this.f6663c.equals(pVar.f6663c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6661a.hashCode() * 31) + (this.f6662b ? 1 : 0)) * 31) + this.f6663c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f6662b ? "s" : "");
        sb.append("://");
        sb.append(this.f6661a);
        return sb.toString();
    }
}
