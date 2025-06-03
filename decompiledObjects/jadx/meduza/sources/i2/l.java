package i2;

import android.graphics.Rect;
import e0.s0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final f2.a f7391a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f7392b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, s0 s0Var) {
        this(new f2.a(rect), s0Var);
        ec.i.e(s0Var, "insets");
    }

    public l(f2.a aVar, s0 s0Var) {
        ec.i.e(s0Var, "_windowInsetsCompat");
        this.f7391a = aVar;
        this.f7392b = s0Var;
    }

    public final Rect a() {
        f2.a aVar = this.f7391a;
        aVar.getClass();
        return new Rect(aVar.f5301a, aVar.f5302b, aVar.f5303c, aVar.f5304d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ec.i.a(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ec.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return ec.i.a(this.f7391a, lVar.f7391a) && ec.i.a(this.f7392b, lVar.f7392b);
    }

    public final int hashCode() {
        return this.f7392b.hashCode() + (this.f7391a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("WindowMetrics( bounds=");
        l10.append(this.f7391a);
        l10.append(", windowInsetsCompat=");
        l10.append(this.f7392b);
        l10.append(')');
        return l10.toString();
    }
}
