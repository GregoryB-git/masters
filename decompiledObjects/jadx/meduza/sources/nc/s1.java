package nc;

/* loaded from: classes.dex */
public abstract class s1 extends a0 {
    public abstract s1 C0();

    @Override // nc.a0
    public String toString() {
        s1 s1Var;
        String str;
        tc.c cVar = r0.f11545a;
        s1 s1Var2 = sc.n.f14360a;
        if (this == s1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s1Var = s1Var2.C0();
            } catch (UnsupportedOperationException unused) {
                s1Var = null;
            }
            str = this == s1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + g0.b(this);
    }
}
