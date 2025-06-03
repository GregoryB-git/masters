package ma;

import ma.s0;
import ma.w;

/* loaded from: classes.dex */
public abstract class b<MessageType extends s0> implements b1<MessageType> {
    static {
        o.a();
    }

    public static void b(s0 s0Var) {
        o1 o1Var;
        if (s0Var.f()) {
            return;
        }
        if (s0Var instanceof a) {
            o1Var = new o1();
        } else {
            o1Var = new o1();
        }
        b0 b0Var = new b0(o1Var.getMessage());
        b0Var.f10917a = s0Var;
        throw b0Var;
    }

    @Override // ma.b1
    public final s0 a(i iVar, o oVar) {
        w C = w.C(((w.b) this).f11121a, iVar, oVar);
        b(C);
        return C;
    }
}
