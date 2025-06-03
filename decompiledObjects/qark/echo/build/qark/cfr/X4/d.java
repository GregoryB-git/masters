/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 */
package X4;

import X4.f;
import Y4.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d {
    public static final String[] b;
    public static final int[][] c;
    public static final int[][] d;
    public static final int[][] e;
    public final byte[] a;

    static {
        int n8;
        int n9;
        b = new String[]{"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
        c = new int[][]{{0, 327708, 327710, 327709, 656318}, {590318, 0, 327710, 327709, 656318}, {262158, 590300, 0, 590301, 932798}, {327709, 327708, 656318, 0, 327710}, {327711, 656380, 656382, 656381, 0}};
        int[][] arrn = (int[][])Array.newInstance((Class)Integer.TYPE, (int[])new int[]{5, 256});
        d = arrn;
        arrn[0][32] = 1;
        for (n9 = 65; n9 <= 90; ++n9) {
            d.d[0][n9] = n9 - 63;
        }
        d.d[1][32] = 1;
        for (n9 = 97; n9 <= 122; ++n9) {
            d.d[1][n9] = n9 - 95;
        }
        d.d[2][32] = 1;
        for (n9 = 48; n9 <= 57; ++n9) {
            d.d[2][n9] = n9 - 46;
        }
        arrn = d[2];
        arrn[44] = 12;
        arrn[46] = 13;
        n9 = 0;
        while (n9 < 28) {
            d.d[3][new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127}[n9]] = n9++;
        }
        for (n9 = 0; n9 < 31; ++n9) {
            n8 = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125}[n9];
            if (n8 <= 0) continue;
            d.d[4][n8] = n9;
        }
        arrn = (int[][])Array.newInstance((Class)Integer.TYPE, (int[])new int[]{6, 6});
        e = arrn;
        n8 = arrn.length;
        for (n9 = 0; n9 < n8; ++n9) {
            Arrays.fill((int[])arrn[n9], (int)-1);
        }
        arrn = e;
        arrn[0][4] = 0;
        int[] arrn2 = arrn[1];
        arrn2[4] = 0;
        arrn2[0] = 28;
        arrn[3][4] = 0;
        arrn = arrn[2];
        arrn[4] = false;
        arrn[0] = 15;
    }

    public d(byte[] arrby) {
        this.a = arrby;
    }

    public static Collection b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        block0 : for (f f8 : iterable) {
            Iterator iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                f f9 = (f)iterator.next();
                if (f9.f(f8)) continue block0;
                if (!f8.f(f9)) continue;
                iterator.remove();
            }
            linkedList.add((Object)f8);
        }
        return linkedList;
    }

    public static void d(f f8, int n8, int n9, Collection collection) {
        f f9 = f8.b(n8);
        collection.add((Object)f9.g(4, n9));
        if (f8.e() != 4) {
            collection.add((Object)f9.h(4, n9));
        }
        if (n9 == 3 || n9 == 4) {
            collection.add((Object)f9.g(2, 16 - n9).g(2, 1));
        }
        if (f8.c() > 0) {
            collection.add((Object)f8.a(n8).a(n8 + 1));
        }
    }

    public static Collection f(Iterable iterable, int n8, int n9) {
        LinkedList linkedList = new LinkedList();
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            d.d((f)iterable.next(), n8, n9, (Collection)linkedList);
        }
        return d.b((Iterable)linkedList);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public a a() {
        var5_1 = Collections.singletonList((Object)f.e);
        var2_2 = 0;
        while (var2_2 < (var6_6 = this.a).length) {
            block8 : {
                block5 : {
                    block6 : {
                        block7 : {
                            var3_4 = var2_2 + 1;
                            var1_3 = var3_4 < var6_6.length ? var6_6[var3_4] : 0;
                            var4_5 = var6_6[var2_2];
                            if (var4_5 == 13) break block5;
                            if (var4_5 == 44) break block6;
                            if (var4_5 == 46) break block7;
                            if (var4_5 != 58 || var1_3 != 32) ** GOTO lbl-1000
                            var1_3 = 5;
                            break block8;
                        }
                        if (var1_3 != 32) ** GOTO lbl-1000
                        var1_3 = 3;
                        break block8;
                    }
                    if (var1_3 != 32) ** GOTO lbl-1000
                    var1_3 = 4;
                    break block8;
                }
                if (var1_3 == 10) {
                    var1_3 = 2;
                } else lbl-1000: // 4 sources:
                {
                    var1_3 = 0;
                }
            }
            if (var1_3 > 0) {
                var5_1 = d.f((Iterable)var5_1, var2_2, var1_3);
                var1_3 = var3_4;
            } else {
                var5_1 = this.e((Iterable)var5_1, var2_2);
                var1_3 = var2_2;
            }
            var2_2 = var1_3 + 1;
        }
        return ((f)Collections.min((Collection)var5_1, (Comparator)new Comparator(){

            public int a(f f8, f f9) {
                return f8.d() - f9.d();
            }
        })).i(this.a);
    }

    public final void c(f f8, int n8, Collection collection) {
        char c8 = (char)(this.a[n8] & 255);
        int n9 = d[f8.e()][c8];
        n9 = n9 > 0 ? 1 : 0;
        f f9 = null;
        for (int i8 = 0; i8 <= 4; ++i8) {
            int n10 = d[i8][c8];
            f f10 = f9;
            if (n10 > 0) {
                f f11 = f9;
                if (f9 == null) {
                    f11 = f8.b(n8);
                }
                if (n9 == 0 || i8 == f8.e() || i8 == 2) {
                    collection.add((Object)f11.g(i8, n10));
                }
                f10 = f11;
                if (n9 == 0) {
                    f10 = f11;
                    if (e[f8.e()][i8] >= 0) {
                        collection.add((Object)f11.h(i8, n10));
                        f10 = f11;
                    }
                }
            }
            f9 = f10;
        }
        if (f8.c() > 0 || d[f8.e()][c8] == 0) {
            collection.add((Object)f8.a(n8));
        }
    }

    public final Collection e(Iterable iterable, int n8) {
        LinkedList linkedList = new LinkedList();
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            this.c((f)iterable.next(), n8, (Collection)linkedList);
        }
        return d.b((Iterable)linkedList);
    }

}

