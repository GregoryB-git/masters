package p6;

/* loaded from: classes.dex */
public abstract class B0 extends F {
    public abstract B0 H();

    public final String I() {
        B0 b02;
        B0 c7 = W.c();
        if (this == c7) {
            return "Dispatchers.Main";
        }
        try {
            b02 = c7.H();
        } catch (UnsupportedOperationException unused) {
            b02 = null;
        }
        if (this == b02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
