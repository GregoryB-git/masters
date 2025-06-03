package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class p extends f0.e.d.a.b.AbstractC0154b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10662b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0155d.AbstractC0156a> f10663c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.d.a.b.AbstractC0154b f10664d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10665e;

    public p() {
        throw null;
    }

    public p(String str, String str2, List list, f0.e.d.a.b.AbstractC0154b abstractC0154b, int i10) {
        this.f10661a = str;
        this.f10662b = str2;
        this.f10663c = list;
        this.f10664d = abstractC0154b;
        this.f10665e = i10;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0154b
    public final f0.e.d.a.b.AbstractC0154b a() {
        return this.f10664d;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0154b
    public final List<f0.e.d.a.b.AbstractC0155d.AbstractC0156a> b() {
        return this.f10663c;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0154b
    public final int c() {
        return this.f10665e;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0154b
    public final String d() {
        return this.f10662b;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0154b
    public final String e() {
        return this.f10661a;
    }

    public final boolean equals(Object obj) {
        String str;
        f0.e.d.a.b.AbstractC0154b abstractC0154b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0154b)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0154b abstractC0154b2 = (f0.e.d.a.b.AbstractC0154b) obj;
        return this.f10661a.equals(abstractC0154b2.e()) && ((str = this.f10662b) != null ? str.equals(abstractC0154b2.d()) : abstractC0154b2.d() == null) && this.f10663c.equals(abstractC0154b2.b()) && ((abstractC0154b = this.f10664d) != null ? abstractC0154b.equals(abstractC0154b2.a()) : abstractC0154b2.a() == null) && this.f10665e == abstractC0154b2.c();
    }

    public final int hashCode() {
        int hashCode = (this.f10661a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10662b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f10663c.hashCode()) * 1000003;
        f0.e.d.a.b.AbstractC0154b abstractC0154b = this.f10664d;
        return ((hashCode2 ^ (abstractC0154b != null ? abstractC0154b.hashCode() : 0)) * 1000003) ^ this.f10665e;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Exception{type=");
        l10.append(this.f10661a);
        l10.append(", reason=");
        l10.append(this.f10662b);
        l10.append(", frames=");
        l10.append(this.f10663c);
        l10.append(", causedBy=");
        l10.append(this.f10664d);
        l10.append(", overflowCount=");
        return a0.j.m(l10, this.f10665e, "}");
    }
}
