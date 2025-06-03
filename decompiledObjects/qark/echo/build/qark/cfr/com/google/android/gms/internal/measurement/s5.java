/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.r5;

public abstract class s5 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String a(q3 var0) {
        var3_1 = new r5((q3)var0);
        var4_2 = new StringBuilder(var3_1.a());
        var1_3 = 0;
        while (var1_3 < var3_1.a()) {
            block14 : {
                block15 : {
                    block11 : {
                        block12 : {
                            block13 : {
                                var2_4 = var3_1.e(var1_3);
                                if (var2_4 == 34) break block11;
                                if (var2_4 == 39) break block12;
                                if (var2_4 == 92) break block13;
                                switch (var2_4) {
                                    default: {
                                        if (var2_4 < 32 || var2_4 > 126) {
                                            var4_2.append('\\');
                                            var4_2.append((char)((var2_4 >>> 6 & 3) + 48));
                                            var4_2.append((char)((var2_4 >>> 3 & 7) + 48));
                                            var2_4 = (var2_4 & 7) + 48;
                                        }
                                        var4_2.append((char)var2_4);
                                        break block14;
                                    }
                                    case 13: {
                                        var0 = "\\r";
                                        break block15;
                                    }
                                    case 12: {
                                        var0 = "\\f";
                                        ** break;
                                    }
                                    case 11: {
                                        var0 = "\\v";
                                        ** break;
                                    }
                                    case 10: {
                                        var0 = "\\n";
                                        ** break;
                                    }
                                    case 9: {
                                        var0 = "\\t";
                                        ** break;
                                    }
                                    case 8: {
                                        var0 = "\\b";
                                        ** break;
                                    }
                                    case 7: 
                                }
                                var0 = "\\a";
                                ** break;
lbl39: // 6 sources:
                                break block15;
                            }
                            var0 = "\\\\";
                            break block15;
                        }
                        var0 = "\\'";
                        break block15;
                    }
                    var0 = "\\\"";
                }
                var4_2.append((String)var0);
            }
            ++var1_3;
        }
        return var4_2.toString();
    }
}

