/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package o0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class n {
    public final List a;
    public final List b;
    public final List c;

    public n(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static n b(String string2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        n.c(string2, (List)arrayList, (List)arrayList2, (List)arrayList3);
        return new n((List)arrayList, (List)arrayList2, (List)arrayList3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void c(String var0, List var1_1, List var2_2, List var3_3) {
        var1_1.add((Object)"");
        var4_4 = 0;
        while (var4_4 < var0.length()) {
            block22 : {
                block23 : {
                    block21 : {
                        var6_6 = var0.indexOf("$", var4_4);
                        var5_5 = -1;
                        if (var6_6 == -1) {
                            var5_5 = var2_2.size();
                            var7_7 = new StringBuilder();
                            var7_7.append((String)var1_1.get(var2_2.size()));
                            var7_7.append(var0.substring(var4_4));
                            var1_1.set(var5_5, (Object)var7_7.toString());
                            var4_4 = var0.length();
                            continue;
                        }
                        if (var6_6 != var4_4) {
                            var5_5 = var2_2.size();
                            var7_7 = new StringBuilder();
                            var7_7.append((String)var1_1.get(var2_2.size()));
                            var7_7.append(var0.substring(var4_4, var6_6));
                            var1_1.set(var5_5, (Object)var7_7.toString());
                            var4_4 = var6_6;
                            continue;
                        }
                        if (var0.startsWith("$$", var4_4)) {
                            var5_5 = var2_2.size();
                            var7_7 = new StringBuilder();
                            var7_7.append((String)var1_1.get(var2_2.size()));
                            var7_7.append("$");
                            var1_1.set(var5_5, (Object)var7_7.toString());
                            var4_4 += 2;
                            continue;
                        }
                        var3_3.add((Object)"");
                        var6_6 = var0.indexOf("$", ++var4_4);
                        var8_8 = var0.substring(var4_4, var6_6);
                        if (!var8_8.equals((Object)"RepresentationID")) break block21;
                        var2_2.add((Object)1);
                        break block22;
                    }
                    var4_4 = var8_8.indexOf("%0");
                    if (var4_4 != -1) {
                        var9_9 = var8_8.substring(var4_4);
                        var7_7 = var9_9;
                        if (!var9_9.endsWith("d")) {
                            var7_7 = var9_9;
                            if (!var9_9.endsWith("x")) {
                                var7_7 = var9_9;
                                if (!var9_9.endsWith("X")) {
                                    var7_7 = new StringBuilder();
                                    var7_7.append(var9_9);
                                    var7_7.append("d");
                                    var7_7 = var7_7.toString();
                                }
                            }
                        }
                        var8_8 = var8_8.substring(0, var4_4);
                    } else {
                        var7_7 = "%01d";
                    }
                    var8_8.hashCode();
                    switch (var8_8.hashCode()) {
                        default: {
                            var4_4 = var5_5;
                            ** break;
                        }
                        case 38199441: {
                            if (!var8_8.equals((Object)"Bandwidth")) {
                                var4_4 = var5_5;
                                ** break;
                            }
                            var4_4 = 2;
                            ** break;
                        }
                        case 2606829: {
                            if (!var8_8.equals((Object)"Time")) {
                                var4_4 = var5_5;
                                ** break;
                            }
                            var4_4 = 1;
                            ** break;
                        }
                        case -1950496919: 
                    }
                    var4_4 = var8_8.equals((Object)"Number") == false ? var5_5 : 0;
lbl72: // 6 sources:
                    switch (var4_4) {
                        default: {
                            var1_1 = new StringBuilder();
                            var1_1.append("Invalid template: ");
                            var1_1.append(var0);
                            throw new IllegalArgumentException(var1_1.toString());
                        }
                        case 2: {
                            var4_4 = 3;
                            ** GOTO lbl83
                        }
                        case 1: {
                            var4_4 = 4;
lbl83: // 2 sources:
                            var8_8 = Integer.valueOf((int)var4_4);
                            break block23;
                        }
                        case 0: 
                    }
                    var8_8 = Integer.valueOf((int)2);
                }
                var2_2.add((Object)var8_8);
                ** break;
lbl90: // 1 sources:
                var3_3.set(var2_2.size() - 1, var7_7);
            }
            var1_1.add((Object)"");
            var4_4 = var6_6 + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String a(String string2, long l8, int n8, long l9) {
        StringBuilder stringBuilder = new StringBuilder();
        int n9 = 0;
        do {
            block6 : {
                String string3;
                block8 : {
                    block9 : {
                        block7 : {
                            block5 : {
                                if (n9 >= this.b.size()) {
                                    stringBuilder.append((String)this.a.get(this.b.size()));
                                    return stringBuilder.toString();
                                }
                                stringBuilder.append((String)this.a.get(n9));
                                if ((Integer)this.b.get(n9) != 1) break block5;
                                stringBuilder.append(string2);
                                break block6;
                            }
                            if ((Integer)this.b.get(n9) != 2) break block7;
                            string3 = String.format((Locale)Locale.US, (String)((String)this.c.get(n9)), (Object[])new Object[]{l8});
                            break block8;
                        }
                        if ((Integer)this.b.get(n9) != 3) break block9;
                        string3 = String.format((Locale)Locale.US, (String)((String)this.c.get(n9)), (Object[])new Object[]{n8});
                        break block8;
                    }
                    if ((Integer)this.b.get(n9) != 4) break block6;
                    string3 = String.format((Locale)Locale.US, (String)((String)this.c.get(n9)), (Object[])new Object[]{l9});
                }
                stringBuilder.append(string3);
            }
            ++n9;
        } while (true);
    }
}

