// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import l6.c;
import kotlin.Metadata;

@Metadata
class CharsKt__CharJVMKt
{
    public CharsKt__CharJVMKt() {
    }
    
    public static final int a(final char codePoint, final int radix) {
        return Character.digit((int)codePoint, radix);
    }
    
    public static final boolean b(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    public static final int checkRadix(final int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new c(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
