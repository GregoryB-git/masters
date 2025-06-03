package f2;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5304d;

    public a(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f5301a = i10;
        this.f5302b = i11;
        this.f5303c = i12;
        this.f5304d = i13;
        if (!(i10 <= i12)) {
            throw new IllegalArgumentException(defpackage.f.i("Left must be less than or equal to right, left: ", i10, ", right: ", i12).toString());
        }
        if (!(i11 <= i13)) {
            throw new IllegalArgumentException(defpackage.f.i("top must be less than or equal to bottom, top: ", i11, ", bottom: ", i13).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ec.i.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ec.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        a aVar = (a) obj;
        return this.f5301a == aVar.f5301a && this.f5302b == aVar.f5302b && this.f5303c == aVar.f5303c && this.f5304d == aVar.f5304d;
    }

    public final int hashCode() {
        return (((((this.f5301a * 31) + this.f5302b) * 31) + this.f5303c) * 31) + this.f5304d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f5301a);
        sb2.append(',');
        sb2.append(this.f5302b);
        sb2.append(',');
        sb2.append(this.f5303c);
        sb2.append(',');
        return a0.j.m(sb2, this.f5304d, "] }");
    }
}
