/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.protobuf;

import com.google.protobuf.f;

public abstract class e0 {
    public static String a(f f8) {
        return e0.b(new b(){

            @Override
            public byte a(int n8) {
                return f.this.d(n8);
            }

            @Override
            public int size() {
                return f.this.size();
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String b(b var0) {
        var4_1 = new StringBuilder(var0.size());
        var1_2 = 0;
        while (var1_2 < var0.size()) {
            block14 : {
                block15 : {
                    block11 : {
                        block12 : {
                            block13 : {
                                var2_3 = var0.a(var1_2);
                                if (var2_3 == 34) break block11;
                                if (var2_3 == 39) break block12;
                                if (var2_3 == 92) break block13;
                                switch (var2_3) {
                                    default: {
                                        if (var2_3 < 32 || var2_3 > 126) {
                                            var4_1.append('\\');
                                            var4_1.append((char)((var2_3 >>> 6 & 3) + 48));
                                            var4_1.append((char)((var2_3 >>> 3 & 7) + 48));
                                            var2_3 = (var2_3 & 7) + 48;
                                        }
                                        var4_1.append((char)var2_3);
                                        break block14;
                                    }
                                    case 13: {
                                        var3_4 = "\\r";
                                        break block15;
                                    }
                                    case 12: {
                                        var3_4 = "\\f";
                                        ** break;
                                    }
                                    case 11: {
                                        var3_4 = "\\v";
                                        ** break;
                                    }
                                    case 10: {
                                        var3_4 = "\\n";
                                        ** break;
                                    }
                                    case 9: {
                                        var3_4 = "\\t";
                                        ** break;
                                    }
                                    case 8: {
                                        var3_4 = "\\b";
                                        ** break;
                                    }
                                    case 7: 
                                }
                                var3_4 = "\\a";
                                ** break;
lbl38: // 6 sources:
                                break block15;
                            }
                            var3_4 = "\\\\";
                            break block15;
                        }
                        var3_4 = "\\'";
                        break block15;
                    }
                    var3_4 = "\\\"";
                }
                var4_1.append(var3_4);
            }
            ++var1_2;
        }
        return var4_1.toString();
    }

    public static String c(String string2) {
        return e0.a(f.i(string2));
    }

    public static interface b {
        public byte a(int var1);

        public int size();
    }

}

