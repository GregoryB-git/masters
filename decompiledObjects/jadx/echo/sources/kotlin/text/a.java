package kotlin.text;

/* loaded from: classes.dex */
public class a extends CharsKt__CharJVMKt {
    public static int c(char c7) {
        int a7 = CharsKt__CharJVMKt.a(c7, 10);
        if (a7 >= 0) {
            return a7;
        }
        throw new IllegalArgumentException("Char " + c7 + " is not a decimal digit");
    }

    public static final boolean d(char c7, char c8, boolean z7) {
        if (c7 == c8) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
