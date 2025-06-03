package W5;

/* loaded from: classes.dex */
public abstract class m extends w {
    public static /* bridge */ /* synthetic */ Appendable v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, g6.l lVar, int i8, Object obj) {
        Appendable u7;
        u7 = w.u(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i7, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return u7;
    }
}
