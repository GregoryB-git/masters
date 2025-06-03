package z2;

import A2.AbstractC0327m;
import x2.C2190d;

/* renamed from: z2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2322z {

    /* renamed from: a, reason: collision with root package name */
    public final C2299b f21770a;

    /* renamed from: b, reason: collision with root package name */
    public final C2190d f21771b;

    public /* synthetic */ C2322z(C2299b c2299b, C2190d c2190d, AbstractC2321y abstractC2321y) {
        this.f21770a = c2299b;
        this.f21771b = c2190d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2322z)) {
            C2322z c2322z = (C2322z) obj;
            if (AbstractC0327m.a(this.f21770a, c2322z.f21770a) && AbstractC0327m.a(this.f21771b, c2322z.f21771b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0327m.b(this.f21770a, this.f21771b);
    }

    public final String toString() {
        return AbstractC0327m.c(this).a("key", this.f21770a).a("feature", this.f21771b).toString();
    }
}
