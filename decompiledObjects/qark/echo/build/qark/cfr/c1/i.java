/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.util.List
 */
package c1;

import c1.e;
import c1.k;
import c1.t;
import g0.g;
import java.util.List;

public abstract class i {
    public static int a(k k8, long l8) {
        int n8;
        if (l8 == -9223372036854775807L) {
            return 0;
        }
        int n9 = n8 = k8.c(l8);
        if (n8 == -1) {
            n9 = k8.j();
        }
        n8 = n9;
        if (n9 > 0) {
            n8 = n9;
            if (k8.e(n9 - 1) == l8) {
                n8 = n9 - 1;
            }
        }
        return n8;
    }

    public static void b(k k8, int n8, g g8) {
        long l8 = k8.e(n8);
        List list = k8.h(l8);
        if (list.isEmpty()) {
            return;
        }
        if (n8 != k8.j() - 1) {
            long l9 = k8.e(n8 + 1) - k8.e(n8);
            if (l9 > 0L) {
                g8.accept(new e(list, l8, l9));
            }
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void c(k var0, t.b var1_1, g var2_2) {
        var3_3 = i.a(var0, var1_1.a);
        var8_4 = var1_1.a;
        var7_5 = 0;
        if (var8_4 == -9223372036854775807L || var3_3 >= var0.j()) ** GOTO lbl-1000
        var12_6 = var0.h(var1_1.a);
        var8_4 = var0.e(var3_3);
        if (!var12_6.isEmpty() && (var10_7 = var1_1.a) < var8_4) {
            var2_2.accept(new e(var12_6, var10_7, var8_4 - var10_7));
            var4_8 = true;
        } else lbl-1000: // 2 sources:
        {
            var4_8 = false;
        }
        for (var5_9 = var3_3; var5_9 < var0.j(); ++var5_9) {
            i.b(var0, var5_9, var2_2);
        }
        if (var1_1.b == false) return;
        var5_9 = var3_3;
        var6_10 = var7_5;
        if (var4_8) {
            var5_9 = var3_3 - 1;
            var6_10 = var7_5;
        }
        do {
            if (var6_10 >= var5_9) {
                if (var4_8 == false) return;
                var2_2.accept(new e(var0.h(var1_1.a), var0.e(var5_9), var1_1.a - var0.e(var5_9)));
                return;
            }
            i.b(var0, var6_10, var2_2);
            ++var6_10;
        } while (true);
    }
}

