/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.Object
 *  java.lang.String
 */
package g1;

import W2.c;
import android.text.TextUtils;

public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(int n8, int n9, int n10, int n11, int n12) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static a a(String var0) {
        g0.a.a(var0.startsWith("Format:"));
        var0 = TextUtils.split((String)var0.substring(7), (String)",");
        var3_4 = var2_3 = (var1_2 = (var6_1 = -1));
        var7_5 = 0;
        var4_6 = var2_3;
        var5_7 = var1_2;
        var1_2 = var7_5;
        while (var1_2 < var0.length) {
            block13 : {
                var8_8 = c.e(var0[var1_2].trim());
                var8_8.hashCode();
                switch (var8_8.hashCode()) {
                    case 109780401: {
                        if (!var8_8.equals((Object)"style")) break;
                        var2_3 = 3;
                        ** break;
                    }
                    case 109757538: {
                        if (!var8_8.equals((Object)"start")) break;
                        var2_3 = 2;
                        ** break;
                    }
                    case 3556653: {
                        if (!var8_8.equals((Object)"text")) break;
                        var2_3 = 1;
                        ** break;
                    }
                    case 100571: {
                        if (var8_8.equals((Object)"end")) break block13;
                    }
                }
                var2_3 = -1;
                ** break;
            }
            var2_3 = 0;
lbl30: // 5 sources:
            switch (var2_3) {
                default: {
                    ** break;
                }
                case 3: {
                    var4_6 = var1_2;
                    ** break;
                }
                case 2: {
                    var6_1 = var1_2;
                    ** break;
                }
                case 1: {
                    var3_4 = var1_2;
                    ** break;
                }
                case 0: 
            }
            var5_7 = var1_2;
lbl44: // 5 sources:
            ++var1_2;
        }
        return null;
    }
}

