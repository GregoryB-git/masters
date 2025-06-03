// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import g6.l;

public class j
{
    public static void a(final Appendable appendable, Object invoke, final l l) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        CharSequence value = null;
        Label_0023: {
            if (l != null) {
                invoke = l.invoke(invoke);
            }
            else if (invoke != null) {
                if (!(invoke instanceof CharSequence)) {
                    if (invoke instanceof Character) {
                        appendable.append((char)invoke);
                        return;
                    }
                    value = String.valueOf(invoke);
                    break Label_0023;
                }
            }
            value = (CharSequence)invoke;
        }
        appendable.append(value);
    }
}
