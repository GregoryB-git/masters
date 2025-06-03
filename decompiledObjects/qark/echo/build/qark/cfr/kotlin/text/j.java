/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
package kotlin.text;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public class j {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void a(Appendable var0, Object var1_1, l var2_2) {
        block3 : {
            Intrinsics.checkNotNullParameter((Object)var0, "<this>");
            if (var2_2 == null) break block3;
            var1_1 = var2_2.invoke(var1_1);
            ** GOTO lbl-1000
        }
        if (var1_1 == null || var1_1 instanceof CharSequence) lbl-1000: // 2 sources:
        {
            var1_1 = (CharSequence)var1_1;
        } else {
            if (var1_1 instanceof Character) {
                var0.append(((Character)var1_1).charValue());
                return;
            }
            var1_1 = String.valueOf((Object)var1_1);
        }
        var0.append((CharSequence)var1_1);
    }
}

