package ec;

import dc.w;

/* loaded from: classes.dex */
public final class v {
    public static void a(int i10, Object obj) {
        if (obj == null || b(i10, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(defpackage.g.e(obj.getClass().getName(), " cannot be cast to ", defpackage.f.h("kotlin.jvm.functions.Function", i10)));
        i.g(v.class.getName(), classCastException);
        throw classCastException;
    }

    public static boolean b(int i10, Object obj) {
        if (obj instanceof rb.a) {
            if ((obj instanceof f ? ((f) obj).getArity() : obj instanceof dc.a ? 0 : obj instanceof dc.l ? 1 : obj instanceof dc.p ? 2 : obj instanceof dc.q ? 3 : obj instanceof dc.r ? 4 : obj instanceof dc.s ? 5 : obj instanceof dc.t ? 6 : obj instanceof dc.u ? 7 : obj instanceof dc.v ? 8 : obj instanceof w ? 9 : obj instanceof dc.b ? 10 : obj instanceof dc.c ? 11 : obj instanceof dc.d ? 12 : obj instanceof dc.e ? 13 : obj instanceof dc.f ? 14 : obj instanceof dc.g ? 15 : obj instanceof dc.h ? 16 : obj instanceof dc.i ? 17 : obj instanceof dc.j ? 18 : obj instanceof dc.k ? 19 : obj instanceof dc.m ? 20 : obj instanceof dc.n ? 21 : obj instanceof dc.o ? 22 : -1) == i10) {
                return true;
            }
        }
        return false;
    }
}
