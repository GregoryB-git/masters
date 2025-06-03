package kotlin.text;

import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
class CharsKt__CharJVMKt {
    public static final int a(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    public static final boolean b(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    public static final int checkRadix(int i7) {
        if (2 <= i7 && i7 < 37) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new l6.c(2, 36));
    }
}
