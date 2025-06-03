/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.regex.Pattern
 */
package i1;

import W2.c;
import X2.B;
import X2.a0;
import X2.y;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class b {
    public static final Pattern d = Pattern.compile((String)"\\s+");
    public static final y e = y.Z("auto", "none");
    public static final y f = y.a0("dot", "sesame", "circle");
    public static final y g = y.Z("filled", "open");
    public static final y h = y.a0("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public b(int n8, int n9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
    }

    public static b a(String string2) {
        if (string2 == null) {
            return null;
        }
        if ((string2 = c.e(string2.trim())).isEmpty()) {
            return null;
        }
        return b.b(y.U(TextUtils.split((String)string2, (Pattern)d)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static b b(y var0) {
        block17 : {
            block15 : {
                block16 : {
                    block14 : {
                        block13 : {
                            block12 : {
                                block11 : {
                                    block9 : {
                                        block10 : {
                                            var6_1 = (String)B.c((Iterable)a0.e(b.h, (Set)var0), "outside");
                                            var1_2 = var6_1.hashCode();
                                            var3_3 = 2;
                                            var5_4 = 0;
                                            var4_5 = -1;
                                            if (var1_2 == -1392885889) break block9;
                                            if (var1_2 == -1106037339) break block10;
                                            if (var1_2 != 92734940 || !var6_1.equals((Object)"after")) ** GOTO lbl-1000
                                            var1_2 = 0;
                                            break block11;
                                        }
                                        if (!var6_1.equals((Object)"outside")) ** GOTO lbl-1000
                                        var1_2 = 1;
                                        break block11;
                                    }
                                    if (var6_1.equals((Object)"before")) {
                                        var1_2 = 2;
                                    } else lbl-1000: // 3 sources:
                                    {
                                        var1_2 = -1;
                                    }
                                }
                                var2_6 = var1_2 != 0 ? (var1_2 != 1 ? 1 : -2) : 2;
                                var6_1 = a0.e(b.e, (Set)var0);
                                if (!var6_1.isEmpty()) {
                                    var0 = (String)var6_1.iterator().next();
                                    var1_2 = var0.hashCode();
                                    if (var1_2 == 3005871) {
                                        var0.equals((Object)"auto");
                                        var1_2 = var4_5;
                                        return new b(var1_2, 0, var2_6);
                                    }
                                    if (var1_2 != 3387192) {
                                        var1_2 = var4_5;
                                        return new b(var1_2, 0, var2_6);
                                    }
                                    var1_2 = var4_5;
                                    if (var0.equals((Object)"none") == false) return new b(var1_2, 0, var2_6);
                                    var1_2 = 0;
                                    return new b(var1_2, 0, var2_6);
                                }
                                var6_1 = a0.e(b.g, (Set)var0);
                                var0 = a0.e(b.f, (Set)var0);
                                if (var6_1.isEmpty() && var0.isEmpty()) {
                                    return new b(-1, 0, var2_6);
                                }
                                var1_2 = (var6_1 = (String)B.c((Iterable)var6_1, "filled")).hashCode();
                                if (var1_2 == -1274499742) break block12;
                                if (var1_2 != 3417674 || !var6_1.equals((Object)"open")) break block13;
                                var4_5 = 2;
                                break block14;
                            }
                            var6_1.equals((Object)"filled");
                        }
                        var4_5 = 1;
                    }
                    var0 = (String)B.c((Iterable)var0, "circle");
                    var1_2 = var0.hashCode();
                    if (var1_2 == -1360216880) break block15;
                    if (var1_2 == -905816648) break block16;
                    if (var1_2 != 99657 || !var0.equals((Object)"dot")) ** GOTO lbl-1000
                    var1_2 = var5_4;
                    break block17;
                }
                if (!var0.equals((Object)"sesame")) ** GOTO lbl-1000
                var1_2 = 1;
                break block17;
            }
            if (var0.equals((Object)"circle")) {
                var1_2 = 2;
            } else lbl-1000: // 3 sources:
            {
                var1_2 = -1;
            }
        }
        if (var1_2 == 0) return new b(var3_3, var4_5, var2_6);
        if (var1_2 != 1) {
            var3_3 = 1;
            return new b(var3_3, var4_5, var2_6);
        }
        var3_3 = 3;
        return new b(var3_3, var4_5, var2_6);
    }
}

