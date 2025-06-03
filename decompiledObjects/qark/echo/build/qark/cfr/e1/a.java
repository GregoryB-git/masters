/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Xfermode
 *  android.util.SparseArray
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package e1;

import X2.v;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.SparseArray;
import c1.k;
import c1.s;
import c1.t;
import f0.a;
import g0.M;
import g0.o;
import g0.y;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class a
implements t {
    public static final byte[] h = new byte[]{0, 7, 8, 15};
    public static final byte[] i = new byte[]{0, 119, -120, -1};
    public static final byte[] j = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    public a(List object) {
        object = new z((byte[])object.get(0));
        int n8 = object.M();
        int n9 = object.M();
        this.a = object = new Paint();
        object.setStyle(Paint.Style.FILL_AND_STROKE);
        object.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC));
        object.setPathEffect(null);
        this.b = object = new Paint();
        object.setStyle(Paint.Style.FILL);
        object.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        object.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, a.f(), a.g(), a.h());
        this.f = new h(n8, n9);
    }

    public static byte[] e(int n8, int n9, y y8) {
        byte[] arrby = new byte[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrby[i8] = (byte)y8.h(n9);
        }
        return arrby;
    }

    public static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] g() {
        int[] arrn = new int[16];
        arrn[0] = 0;
        for (int i8 = 1; i8 < 16; ++i8) {
            int n8;
            int n9;
            int n10;
            if (i8 < 8) {
                n9 = (i8 & 1) != 0 ? 255 : 0;
                n8 = (i8 & 2) != 0 ? 255 : 0;
                n10 = (i8 & 4) != 0 ? 255 : 0;
                arrn[i8] = a.i(255, n9, n8, n10);
                continue;
            }
            n10 = 127;
            n9 = (i8 & 1) != 0 ? 127 : 0;
            n8 = (i8 & 2) != 0 ? 127 : 0;
            if ((i8 & 4) == 0) {
                n10 = 0;
            }
            arrn[i8] = a.i(255, n9, n8, n10);
        }
        return arrn;
    }

    public static int[] h() {
        int[] arrn = new int[256];
        arrn[0] = 0;
        for (int i8 = 0; i8 < 256; ++i8) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13 = 255;
            if (i8 < 8) {
                n11 = (i8 & 1) != 0 ? 255 : 0;
                n8 = (i8 & 2) != 0 ? 255 : 0;
                if ((i8 & 4) == 0) {
                    n13 = 0;
                }
                arrn[i8] = a.i(63, n11, n8, n13);
                continue;
            }
            n13 = i8 & 136;
            n8 = 170;
            n11 = 85;
            if (n13 != 0) {
                if (n13 != 8) {
                    n8 = 43;
                    if (n13 != 128) {
                        if (n13 != 136) continue;
                        n13 = (i8 & 1) != 0 ? 43 : 0;
                        n10 = (i8 & 16) != 0 ? 85 : 0;
                        n12 = (i8 & 2) != 0 ? 43 : 0;
                        n9 = (i8 & 32) != 0 ? 85 : 0;
                        if ((i8 & 4) == 0) {
                            n8 = 0;
                        }
                        if ((i8 & 64) == 0) {
                            n11 = 0;
                        }
                        arrn[i8] = a.i(255, n13 + n10, n12 + n9, n8 + n11);
                        continue;
                    }
                    n13 = (i8 & 1) != 0 ? 43 : 0;
                    n10 = (i8 & 16) != 0 ? 85 : 0;
                    n12 = (i8 & 2) != 0 ? 43 : 0;
                    n9 = (i8 & 32) != 0 ? 85 : 0;
                    if ((i8 & 4) == 0) {
                        n8 = 0;
                    }
                    if ((i8 & 64) == 0) {
                        n11 = 0;
                    }
                    arrn[i8] = a.i(255, n13 + 127 + n10, n12 + 127 + n9, n8 + 127 + n11);
                    continue;
                }
                n13 = (i8 & 1) != 0 ? 85 : 0;
                n10 = (i8 & 16) != 0 ? 170 : 0;
                n12 = (i8 & 2) != 0 ? 85 : 0;
                n9 = (i8 & 32) != 0 ? 170 : 0;
                if ((i8 & 4) == 0) {
                    n11 = 0;
                }
                if ((i8 & 64) == 0) {
                    n8 = 0;
                }
                arrn[i8] = a.i(127, n13 + n10, n12 + n9, n11 + n8);
                continue;
            }
            n13 = (i8 & 1) != 0 ? 85 : 0;
            n10 = (i8 & 16) != 0 ? 170 : 0;
            n12 = (i8 & 2) != 0 ? 85 : 0;
            n9 = (i8 & 32) != 0 ? 170 : 0;
            if ((i8 & 4) == 0) {
                n11 = 0;
            }
            if ((i8 & 64) == 0) {
                n8 = 0;
            }
            arrn[i8] = a.i(255, n13 + n10, n12 + n9, n11 + n8);
        }
        return arrn;
    }

    public static int i(int n8, int n9, int n10, int n11) {
        return n8 << 24 | n9 << 16 | n10 << 8 | n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int j(y y8, int[] arrn, byte[] arrby, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        do {
            int n12;
            int n13;
            block5 : {
                block14 : {
                    block10 : {
                        block9 : {
                            block11 : {
                                block7 : {
                                    block12 : {
                                        block13 : {
                                            block8 : {
                                                block6 : {
                                                    block4 : {
                                                        if ((n12 = y8.h(2)) == 0) break block4;
                                                        n10 = n8;
                                                        n13 = 1;
                                                        n8 = n12;
                                                        break block5;
                                                    }
                                                    if (!y8.g()) break block6;
                                                    n10 = y8.h(3) + 3;
                                                    break block7;
                                                }
                                                if (!y8.g()) break block8;
                                                n13 = 1;
                                                break block9;
                                            }
                                            n10 = y8.h(2);
                                            if (n10 == 0) break block10;
                                            if (n10 == 1) break block11;
                                            if (n10 == 2) break block12;
                                            if (n10 == 3) break block13;
                                            n10 = n8;
                                            break block14;
                                        }
                                        n10 = y8.h(8) + 29;
                                        break block7;
                                    }
                                    n10 = y8.h(4) + 12;
                                }
                                int n14 = y8.h(2);
                                n13 = n8;
                                n12 = n10;
                                n8 = n14;
                                n10 = n13;
                                n13 = n12;
                                break block5;
                            }
                            n13 = 2;
                        }
                        n10 = n8;
                        n8 = 0;
                        break block5;
                    }
                    n10 = 1;
                }
                n13 = n8 = 0;
            }
            if (n13 != 0 && paint != null) {
                n12 = n8;
                if (arrby != null) {
                    n12 = arrby[n8];
                }
                paint.setColor(arrn[n12]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n13), (float)(n9 + 1), paint);
            }
            n11 += n13;
            if (n10 != 0) {
                return n11;
            }
            n8 = n10;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int k(y y8, int[] arrn, byte[] arrby, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        do {
            int n12;
            int n13;
            block5 : {
                block8 : {
                    block12 : {
                        block13 : {
                            block11 : {
                                block14 : {
                                    block15 : {
                                        block9 : {
                                            block10 : {
                                                block6 : {
                                                    block7 : {
                                                        block4 : {
                                                            if ((n12 = y8.h(4)) == 0) break block4;
                                                            n10 = n8;
                                                            n13 = 1;
                                                            n8 = n12;
                                                            break block5;
                                                        }
                                                        if (y8.g()) break block6;
                                                        n10 = y8.h(3);
                                                        if (n10 == 0) break block7;
                                                        n13 = n10 + 2;
                                                        break block8;
                                                    }
                                                    n10 = 1;
                                                    break block9;
                                                }
                                                if (y8.g()) break block10;
                                                n10 = y8.h(2) + 4;
                                                break block11;
                                            }
                                            n10 = y8.h(2);
                                            if (n10 == 0) break block12;
                                            if (n10 == 1) break block13;
                                            if (n10 == 2) break block14;
                                            if (n10 == 3) break block15;
                                            n10 = n8;
                                        }
                                        n13 = n8 = 0;
                                        break block5;
                                    }
                                    n10 = y8.h(8) + 25;
                                    break block11;
                                }
                                n10 = y8.h(4) + 9;
                            }
                            int n14 = y8.h(4);
                            n13 = n8;
                            n12 = n10;
                            n8 = n14;
                            n10 = n13;
                            n13 = n12;
                            break block5;
                        }
                        n13 = 2;
                        break block8;
                    }
                    n13 = 1;
                }
                n10 = n8;
                n8 = 0;
            }
            if (n13 != 0 && paint != null) {
                n12 = n8;
                if (arrby != null) {
                    n12 = arrby[n8];
                }
                paint.setColor(arrn[n12]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n13), (float)(n9 + 1), paint);
            }
            n11 += n13;
            if (n10 != 0) {
                return n11;
            }
            n8 = n10;
        } while (true);
    }

    public static int l(y y8, int[] arrn, byte[] arrby, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        do {
            int n12;
            int n13;
            if ((n12 = y8.h(8)) != 0) {
                n10 = n8;
                n13 = 1;
                n8 = n12;
            } else if (!y8.g()) {
                n13 = y8.h(7);
                if (n13 != 0) {
                    n10 = n8;
                    n8 = 0;
                } else {
                    n10 = 1;
                    n13 = n8 = 0;
                }
            } else {
                n13 = y8.h(7);
                n12 = y8.h(8);
                n10 = n8;
                n8 = n12;
            }
            if (n13 != 0 && paint != null) {
                n12 = n8;
                if (arrby != null) {
                    n12 = arrby[n8];
                }
                paint.setColor(arrn[n12]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n13), (float)(n9 + 1), paint);
            }
            n11 += n13;
            if (n10 != 0) {
                return n11;
            }
            n8 = n10;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void m(byte[] arrby, int[] arrn, int n8, int n9, int n10, Paint paint, Canvas canvas) {
        byte[] arrby2;
        byte[] arrby3;
        y y8 = new y(arrby);
        int n11 = n9;
        byte[] arrby4 = arrby3 = (arrby2 = null);
        int n12 = n10;
        n10 = n11;
        block10 : while (y8.b() != 0) {
            n11 = y8.h(8);
            if (n11 != 240) {
                switch (n11) {
                    default: {
                        switch (n11) {
                            default: {
                                continue block10;
                            }
                            case 34: {
                                arrby3 = a.e(16, 8, y8);
                                continue block10;
                            }
                            case 33: {
                                arrby2 = a.e(4, 8, y8);
                                continue block10;
                            }
                            case 32: 
                        }
                        arrby4 = a.e(4, 4, y8);
                        continue block10;
                    }
                    case 18: {
                        n10 = a.l(y8, arrn, null, n10, n12, paint, canvas);
                        continue block10;
                    }
                    case 17: {
                        arrby = n8 == 3 ? (arrby3 == null ? j : arrby3) : null;
                        n10 = a.k(y8, arrn, arrby, n10, n12, paint, canvas);
                        break;
                    }
                    case 16: {
                        arrby = n8 == 3 ? (arrby2 == null ? i : arrby2) : (n8 == 2 ? (arrby4 == null ? h : arrby4) : null);
                        n10 = a.j(y8, arrn, arrby, n10, n12, paint, canvas);
                    }
                }
                y8.c();
                continue;
            }
            n12 += 2;
            n10 = n9;
        }
        return;
    }

    public static void n(c c8, a arrn, int n8, int n9, int n10, Paint paint, Canvas canvas) {
        arrn = n8 == 3 ? arrn.d : (n8 == 2 ? arrn.c : arrn.b);
        a.m(c8.c, arrn, n8, n9, n10, paint, canvas);
        a.m(c8.d, arrn, n8, n9, n10 + 1, paint, canvas);
    }

    public static a p(y y8, int n8) {
        int n9 = y8.h(8);
        y8.r(8);
        n8 -= 2;
        int[] arrn = a.f();
        int[] arrn2 = a.g();
        int[] arrn3 = a.h();
        while (n8 > 0) {
            int n10;
            int n11;
            int n12;
            int n13 = y8.h(8);
            int n14 = y8.h(8);
            int[] arrn4 = (n14 & 128) != 0 ? arrn : ((n14 & 64) != 0 ? arrn2 : arrn3);
            if ((n14 & 1) != 0) {
                n12 = y8.h(8);
                n10 = y8.h(8);
                n11 = y8.h(8);
                n14 = y8.h(8);
                n8 -= 6;
            } else {
                n12 = y8.h(6);
                n10 = y8.h(4);
                n11 = y8.h(4) << 4;
                n14 = y8.h(2);
                n8 -= 4;
                n14 <<= 6;
                n12 <<= 2;
                n10 <<= 4;
            }
            if (n12 == 0) {
                n14 = 255;
                n10 = 0;
                n11 = 0;
            }
            n14 = (byte)(255 - (n14 & 255));
            double d8 = n12;
            double d9 = n10 - 128;
            n10 = (int)(d8 + 1.402 * d9);
            double d10 = n11 - 128;
            n11 = (int)(d8 - 0.34414 * d10 - d9 * 0.71414);
            n12 = (int)(d8 + d10 * 1.772);
            arrn4[n13] = a.i(n14, M.p(n10, 0, 255), M.p(n11, 0, 255), M.p(n12, 0, 255));
        }
        return new a(n9, arrn, arrn2, arrn3);
    }

    public static b q(y y8) {
        int n8;
        int n9;
        int n10;
        int n11;
        y8.r(4);
        boolean bl = y8.g();
        y8.r(3);
        int n12 = y8.h(16);
        int n13 = y8.h(16);
        if (bl) {
            n11 = y8.h(16);
            int n14 = y8.h(16);
            n10 = y8.h(16);
            n9 = y8.h(16);
            n8 = n14;
        } else {
            int n15;
            n10 = n15 = 0;
            n8 = n12;
            n9 = n13;
            n11 = n15;
        }
        return new b(n12, n13, n11, n8, n10, n9);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static c r(y arrby) {
        byte[] arrby2;
        int n8 = arrby.h(16);
        arrby.r(4);
        int n9 = arrby.h(2);
        boolean bl = arrby.g();
        arrby.r(1);
        byte[] arrby3 = M.f;
        if (n9 == 1) {
            arrby.r(arrby.h(8) * 16);
            arrby2 = arrby3;
        } else {
            arrby2 = arrby3;
            if (n9 == 0) {
                n9 = arrby.h(16);
                int n10 = arrby.h(16);
                if (n9 > 0) {
                    arrby3 = new byte[n9];
                    arrby.k(arrby3, 0, n9);
                }
                arrby2 = arrby3;
                if (n10 > 0) {
                    arrby2 = new byte[n10];
                    arrby.k(arrby2, 0, n10);
                    arrby = arrby2;
                    return new c(n8, bl, arrby3, arrby);
                }
            }
        }
        arrby = arrby2;
        arrby3 = arrby2;
        return new c(n8, bl, arrby3, arrby);
    }

    public static d s(y y8, int n8) {
        int n9 = y8.h(8);
        int n10 = y8.h(4);
        int n11 = y8.h(2);
        y8.r(2);
        n8 -= 2;
        SparseArray sparseArray = new SparseArray();
        while (n8 > 0) {
            int n12 = y8.h(8);
            y8.r(8);
            int n13 = y8.h(16);
            int n14 = y8.h(16);
            n8 -= 6;
            sparseArray.put(n12, (Object)new e(n13, n14));
        }
        return new d(n9, n10, n11, sparseArray);
    }

    public static f t(y y8, int n8) {
        int n9 = y8.h(8);
        y8.r(4);
        boolean bl = y8.g();
        y8.r(3);
        int n10 = y8.h(16);
        int n11 = y8.h(16);
        int n12 = y8.h(3);
        int n13 = y8.h(3);
        int n14 = 2;
        y8.r(2);
        int n15 = y8.h(8);
        int n16 = y8.h(8);
        int n17 = y8.h(4);
        int n18 = y8.h(2);
        y8.r(2);
        n8 -= 10;
        SparseArray sparseArray = new SparseArray();
        while (n8 > 0) {
            int n19;
            int n20 = y8.h(16);
            int n21 = y8.h(n14);
            int n22 = y8.h(n14);
            int n23 = y8.h(12);
            y8.r(4);
            int n24 = y8.h(12);
            if (n21 != 1 && n21 != 2) {
                n14 = n19 = 0;
                n8 -= 6;
            } else {
                n19 = y8.h(8);
                n14 = y8.h(8);
                int n25 = n8 - 8;
                n19 = n8 = n19;
                n8 = n25;
            }
            sparseArray.put(n20, (Object)new g(n21, n22, n23, n24, n19, n14));
            n14 = 2;
        }
        return new f(n9, bl, n10, n11, n12, n13, n15, n16, n17, n18, sparseArray);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void u(y var0, h var1_1) {
        block17 : {
            var2_2 = var0.h(8);
            var5_3 = var0.h(16);
            var3_4 = var0.h(16);
            var4_5 = var0.d();
            if (var3_4 * 8 > var0.b()) {
                o.h("DvbParser", "Data field length exceeds limit");
                var0.r(var0.b());
                return;
            }
            switch (var2_2) {
                default: {
                    ** break;
                }
                case 20: {
                    if (var5_3 == var1_1.a) {
                        var1_1.h = a.q(var0);
                        ** break;
                    }
                    break block17;
                }
                case 19: {
                    if (var5_3 != var1_1.a) ** GOTO lbl23
                    var7_6 = a.r(var0);
                    var6_9 = var1_1.e;
                    var1_1 = var7_6;
                    ** GOTO lbl28
lbl23: // 1 sources:
                    if (var5_3 != var1_1.b) break block17;
                    var6_9 = a.r(var0);
                    var7_6 = var1_1.g;
                    var1_1 = var6_9;
                    var6_9 = var7_6;
lbl28: // 2 sources:
                    var2_2 = var1_1.a;
                    var7_6 = var6_9;
                    var6_9 = var1_1;
                    ** GOTO lbl42
                }
                case 18: {
                    if (var5_3 != var1_1.a) ** GOTO lbl37
                    var6_9 = a.p(var0, var3_4);
                    var1_1 = var1_1.d;
                    ** GOTO lbl40
lbl37: // 1 sources:
                    if (var5_3 != var1_1.b) break block17;
                    var6_9 = a.p(var0, var3_4);
                    var1_1 = var1_1.f;
lbl40: // 2 sources:
                    var2_2 = var6_9.a;
                    var7_6 = var1_1;
lbl42: // 2 sources:
                    var7_6.put(var2_2, var6_9);
                    break block17;
                }
                case 17: {
                    var7_7 = var1_1.i;
                    if (var5_3 == var1_1.a && var7_7 != null) {
                        var6_10 = a.t(var0, var3_4);
                        if (var7_7.c == 0 && (var7_7 = (f)var1_1.c.get(var6_10.a)) != null) {
                            var6_10.a((f)var7_7);
                        }
                        var1_1.c.put(var6_10.a, (Object)var6_10);
                        ** break;
                    }
                    break block17;
                }
                case 16: 
            }
            if (var5_3 == var1_1.a) {
                var6_11 = var1_1.i;
                var7_8 = a.s(var0, var3_4);
                if (var7_8.c != 0) {
                    var1_1.i = var7_8;
                    var1_1.c.clear();
                    var1_1.d.clear();
                    var1_1.e.clear();
                    ** break;
                }
                if (var6_11 != null && var6_11.b != var7_8.b) {
                    var1_1.i = var7_8;
                }
            }
        }
        var0.s(var4_5 + var3_4 - var0.d());
    }

    @Override
    public /* synthetic */ k a(byte[] arrby, int n8, int n9) {
        return s.a(this, arrby, n8, n9);
    }

    @Override
    public void b() {
        this.f.a();
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, g0.g g8) {
        object = new y((byte[])object, n9 + n8);
        object.p(n8);
        g8.accept(this.o((y)object));
    }

    @Override
    public int d() {
        return 2;
    }

    public final c1.e o(y object) {
        while (object.b() >= 48 && object.h(8) == 15) {
            a.u((y)object, this.f);
        }
        Object object2 = this.f;
        object = object2.i;
        if (object == null) {
            return new c1.e(v.Y(), -9223372036854775807L, -9223372036854775807L);
        }
        object2 = object2.h;
        if (object2 == null) {
            object2 = this.d;
        }
        Object object3 = this.g;
        if (object3 == null || object2.a + 1 != object3.getWidth() || object2.b + 1 != this.g.getHeight()) {
            object3 = Bitmap.createBitmap((int)(object2.a + 1), (int)(object2.b + 1), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            this.g = object3;
            this.c.setBitmap((Bitmap)object3);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = object.d;
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            this.c.save();
            object = (e)sparseArray.valueAt(i8);
            int n8 = sparseArray.keyAt(i8);
            f f8 = (f)this.f.c.get(n8);
            int n9 = object.a + object2.c;
            int n10 = object.b + object2.e;
            n8 = Math.min((int)(f8.c + n9), (int)object2.d);
            int n11 = Math.min((int)(f8.d + n10), (int)object2.f);
            this.c.clipRect(n9, n10, n8, n11);
            object = object3 = (a)this.f.d.get(f8.g);
            if (object3 == null) {
                object = object3 = (a)this.f.f.get(f8.g);
                if (object3 == null) {
                    object = this.e;
                }
            }
            object3 = f8.k;
            for (n8 = 0; n8 < object3.size(); ++n8) {
                n11 = object3.keyAt(n8);
                g g8 = (g)object3.valueAt(n8);
                c c8 = (c)this.f.e.get(n11);
                if (c8 == null) {
                    c8 = (c)this.f.g.get(n11);
                }
                if (c8 == null) continue;
                Paint paint = c8.b ? null : this.a;
                a.n(c8, (a)object, f8.f, g8.c + n9, n10 + g8.d, paint, this.c);
            }
            if (f8.b) {
                n8 = f8.f;
                n8 = n8 == 3 ? object.d[f8.h] : (n8 == 2 ? object.c[f8.i] : object.b[f8.j]);
                this.b.setColor(n8);
                this.c.drawRect((float)n9, (float)n10, (float)(f8.c + n9), (float)(f8.d + n10), this.b);
            }
            arrayList.add((Object)new a.b().f(Bitmap.createBitmap((Bitmap)this.g, (int)n9, (int)n10, (int)f8.c, (int)f8.d)).k((float)n9 / (float)object2.a).l(0).h((float)n10 / (float)object2.b, 0).i(0).n((float)f8.c / (float)object2.a).g((float)f8.d / (float)object2.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return new c1.e((List)arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int n8, int[] arrn, int[] arrn2, int[] arrn3) {
            this.a = n8;
            this.b = arrn;
            this.c = arrn2;
            this.d = arrn3;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int n8, boolean bl, byte[] arrby, byte[] arrby2) {
            this.a = n8;
            this.b = bl;
            this.c = arrby;
            this.d = arrby2;
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public d(int n8, int n9, int n10, SparseArray sparseArray) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = sparseArray;
        }
    }

    public static final class e {
        public final int a;
        public final int b;

        public e(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public f(int n8, boolean bl, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, SparseArray sparseArray) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
            this.h = n14;
            this.i = n15;
            this.j = n16;
            this.k = sparseArray;
        }

        public void a(f f8) {
            f8 = f8.k;
            for (int i8 = 0; i8 < f8.size(); ++i8) {
                this.k.put(f8.keyAt(i8), (Object)((g)f8.valueAt(i8)));
            }
        }
    }

    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
        }
    }

    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray c;
        public final SparseArray d;
        public final SparseArray e;
        public final SparseArray f;
        public final SparseArray g;
        public b h;
        public d i;

        public h(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = new SparseArray();
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.f = new SparseArray();
            this.g = new SparseArray();
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

}

