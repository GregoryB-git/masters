package z2;

import A2.AbstractC0327m;
import y2.C2270a;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299b {

    /* renamed from: a, reason: collision with root package name */
    public final int f21701a;

    /* renamed from: b, reason: collision with root package name */
    public final C2270a f21702b;

    /* renamed from: c, reason: collision with root package name */
    public final C2270a.d f21703c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21704d;

    public C2299b(C2270a c2270a, C2270a.d dVar, String str) {
        this.f21702b = c2270a;
        this.f21703c = dVar;
        this.f21704d = str;
        this.f21701a = AbstractC0327m.b(c2270a, dVar, str);
    }

    public static C2299b a(C2270a c2270a, C2270a.d dVar, String str) {
        return new C2299b(c2270a, dVar, str);
    }

    public final String b() {
        return this.f21702b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2299b)) {
            return false;
        }
        C2299b c2299b = (C2299b) obj;
        return AbstractC0327m.a(this.f21702b, c2299b.f21702b) && AbstractC0327m.a(this.f21703c, c2299b.f21703c) && AbstractC0327m.a(this.f21704d, c2299b.f21704d);
    }

    public final int hashCode() {
        return this.f21701a;
    }
}
