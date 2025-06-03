/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 */
package T0;

import T0.c;
import T0.d;
import T0.e;
import T0.f;
import T0.g;
import T0.i;
import T0.l;
import T0.m;
import T0.n;
import T0.o;
import X2.v;
import d0.x;
import d0.z;
import g0.M;
import g0.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class h
extends O0.c {
    public static final a b = new g();
    public final a a;

    public h() {
        this(null);
    }

    public h(a a8) {
        this.a = a8;
    }

    public static /* synthetic */ boolean A(int n8, int n9, int n10, int n11, int n12) {
        return false;
    }

    public static int B(g0.z z8, int n8) {
        int n9;
        int n10;
        byte[] arrby = z8.e();
        int n11 = n9 = z8.f();
        while ((n10 = n11 + 1) < n9 + n8) {
            int n12 = n8;
            if ((arrby[n11] & 255) == 255) {
                n12 = n8;
                if (arrby[n10] == 0) {
                    System.arraycopy((Object)arrby, (int)(n11 + 2), (Object)arrby, (int)n10, (int)(n8 - (n11 - n9) - 2));
                    n12 = n8 - 1;
                }
            }
            n11 = n10;
            n8 = n12;
        }
        return n8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean C(g0.z var0, int var1_1, int var2_2, boolean var3_3) {
        var8_4 = var0.f();
        do {
            block18 : {
                block19 : {
                    block17 : {
                        block16 : {
                            var4_5 = var0.a();
                            var7_8 = 1;
                            if (var4_5 < var2_2) break;
                            if (var1_1 >= 3) {
                                var4_5 = var0.p();
                                var9_9 = var0.I();
                                var6_7 = var0.M();
                                break block16;
                            }
                            var4_5 = var0.J();
                            var5_6 = var0.J();
                            var9_9 = var5_6;
                            var6_7 = 0;
                        }
                        if (var4_5 == 0 && var9_9 == 0L && var6_7 == 0) {
                            var0.T(var8_4);
                            return true;
                        }
                        var11_10 = var9_9;
                        if (var1_1 == 4) {
                            var11_10 = var9_9;
                            if (!var3_3) {
                                if ((0x808080L & var9_9) != 0L) {
                                    var0.T(var8_4);
                                    return false;
                                }
                                var11_10 = (var9_9 >> 24 & 255L) << 21 | (var9_9 & 255L | (var9_9 >> 8 & 255L) << 7 | (var9_9 >> 16 & 255L) << 14);
                            }
                        }
                        if (var1_1 != 4) break block17;
                        var4_5 = (var6_7 & 64) != 0 ? 1 : 0;
                        var5_6 = var4_5;
                        if ((var6_7 & 1) == 0) ** GOTO lbl-1000
                        var5_6 = var7_8;
                        break block18;
                    }
                    if (var1_1 == 3) {
                        var4_5 = (var6_7 & 32) != 0 ? 1 : 0;
                        var5_6 = var4_5;
                        ** if ((var6_7 & 128) == 0) goto lbl-1000
lbl-1000: // 1 sources:
                        {
                            var5_6 = var7_8;
                            ** GOTO lbl48
                        }
                    }
                    break block19;
lbl-1000: // 2 sources:
                    {
                        var6_7 = 0;
                        var4_5 = var5_6;
                        var5_6 = var6_7;
                    }
                    break block18;
                }
                var5_6 = var4_5 = 0;
            }
            var6_7 = var4_5;
            if (var5_6 != 0) {
                var6_7 = var4_5 + 4;
            }
            if (var11_10 < (long)var6_7) {
                var0.T(var8_4);
                return false;
            }
            var4_5 = var0.a();
            if ((long)var4_5 < var11_10) {
                var0.T(var8_4);
                return false;
            }
            var4_5 = (int)var11_10;
            var0.U(var4_5);
            continue;
            break;
        } while (true);
        var0.T(var8_4);
        return true;
        catch (Throwable var13_11) {}
        var0.T(var8_4);
        throw var13_11;
    }

    public static /* synthetic */ boolean c(int n8, int n9, int n10, int n11, int n12) {
        return h.A(n8, n9, n10, n11, n12);
    }

    public static byte[] d(byte[] arrby, int n8, int n9) {
        if (n9 <= n8) {
            return M.f;
        }
        return Arrays.copyOfRange((byte[])arrby, (int)n8, (int)n9);
    }

    public static T0.a f(g0.z object, int n8, int n9) {
        int n10 = object.G();
        Charset charset = h.w(n10);
        int n11 = n8 - 1;
        byte[] arrby = new byte[n11];
        object.l(arrby, 0, n11);
        if (n9 == 2) {
            object = new StringBuilder();
            object.append("image/");
            object.append(W2.c.e(new String(arrby, 0, 3, W2.e.b)));
            String string2 = object.toString();
            object = string2;
            if ("image/jpg".equals((Object)string2)) {
                object = "image/jpeg";
            }
            n8 = 2;
        } else {
            n8 = h.z(arrby, 0);
            object = W2.c.e(new String(arrby, 0, n8, W2.e.b));
            if (object.indexOf(47) == -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("image/");
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
            }
        }
        n9 = arrby[n8 + 1];
        int n12 = h.y(arrby, n8 += 2, n10);
        return new T0.a((String)object, new String(arrby, n8, n12 - n8, charset), n9 & 255, h.d(arrby, n12 + h.v(n10), n11));
    }

    public static T0.b g(g0.z z8, int n8, String string2) {
        byte[] arrby = new byte[n8];
        z8.l(arrby, 0, n8);
        return new T0.b(string2, arrby);
    }

    public static c h(g0.z z8, int n8, int n9, boolean bl, int n10, a a8) {
        long l8;
        int n11 = z8.f();
        int n12 = h.z(z8.e(), n11);
        String string2 = new String(z8.e(), n11, n12 - n11, W2.e.b);
        z8.T(n12 + 1);
        n12 = z8.p();
        int n13 = z8.p();
        long l9 = z8.I();
        if (l9 == 0xFFFFFFFFL) {
            l9 = -1L;
        }
        if ((l8 = z8.I()) == 0xFFFFFFFFL) {
            l8 = -1L;
        }
        ArrayList arrayList = new ArrayList();
        while (z8.f() < n11 + n8) {
            i i8 = h.k(n9, z8, bl, n10, a8);
            if (i8 == null) continue;
            arrayList.add((Object)i8);
        }
        return new c(string2, n12, n13, l9, l8, (i[])arrayList.toArray((Object[])new i[0]));
    }

    public static d i(g0.z z8, int n8, int n9, boolean bl, int n10, a a8) {
        int n11 = z8.f();
        int n12 = h.z(z8.e(), n11);
        String string2 = new String(z8.e(), n11, n12 - n11, W2.e.b);
        z8.T(n12 + 1);
        n12 = z8.G();
        boolean bl2 = (n12 & 2) != 0;
        boolean bl3 = (n12 & 1) != 0;
        int n13 = z8.G();
        String[] arrstring = new String[n13];
        for (n12 = 0; n12 < n13; ++n12) {
            int n14 = z8.f();
            int n15 = h.z(z8.e(), n14);
            arrstring[n12] = new String(z8.e(), n14, n15 - n14, W2.e.b);
            z8.T(n15 + 1);
        }
        ArrayList arrayList = new ArrayList();
        while (z8.f() < n11 + n8) {
            i i8 = h.k(n9, z8, bl, n10, a8);
            if (i8 == null) continue;
            arrayList.add((Object)i8);
        }
        return new d(string2, bl2, bl3, arrstring, (i[])arrayList.toArray((Object[])new i[0]));
    }

    public static e j(g0.z object, int n8) {
        if (n8 < 4) {
            return null;
        }
        int n9 = object.G();
        Charset charset = h.w(n9);
        Object object2 = new byte[3];
        object.l((byte[])object2, 0, 3);
        object2 = new String((byte[])object2, 0, 3);
        byte[] arrby = new byte[n8 -= 4];
        object.l(arrby, 0, n8);
        n8 = h.y(arrby, 0, n9);
        object = new String(arrby, 0, n8, charset);
        return new e((String)object2, (String)object, h.p(arrby, n8, h.y(arrby, n8 += h.v(n9), n9), charset));
    }

    /*
     * Exception decompiling
     */
    public static i k(int var0, g0.z var1_1, boolean var2_2, int var3_3, a var4_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[SIMPLE_IF_TAKEN]], but top level block is 6[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static f l(g0.z object, int n8) {
        int n9 = object.G();
        Charset charset = h.w(n9);
        byte[] arrby = new byte[--n8];
        object.l(arrby, 0, n8);
        int n10 = h.z(arrby, 0);
        object = z.t(new String(arrby, 0, n10, W2.e.b));
        int n11 = h.y(arrby, ++n10, n9);
        String string2 = h.p(arrby, n10, n11, charset);
        n10 = n11 + h.v(n9);
        n11 = h.y(arrby, n10, n9);
        return new f((String)object, string2, h.p(arrby, n10, n11, charset), h.d(arrby, n11 + h.v(n9), n8));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static b m(g0.z object) {
        block10 : {
            block12 : {
                int n8;
                block16 : {
                    int n9;
                    int n10;
                    boolean bl;
                    block14 : {
                        int n11;
                        block15 : {
                            block13 : {
                                block11 : {
                                    block9 : {
                                        bl = false;
                                        if (object.a() >= 10) break block9;
                                        object = "Data too short to be an ID3 tag";
                                        break block10;
                                    }
                                    n10 = object.J();
                                    if (n10 == 4801587) break block11;
                                    object = new StringBuilder();
                                    object.append("Unexpected first three bytes of ID3 tag header: 0x");
                                    object.append(String.format((String)"%06X", (Object[])new Object[]{n10}));
                                    break block12;
                                }
                                n8 = object.G();
                                object.U(1);
                                n9 = object.G();
                                n11 = object.F();
                                if (n8 != 2) break block13;
                                n10 = n11;
                                if ((n9 & 64) == 0) break block14;
                                object = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                                break block10;
                            }
                            if (n8 != 3) break block15;
                            n10 = n11;
                            if ((n9 & 64) != 0) {
                                n10 = object.p();
                                object.U(n10);
                                n10 = n11 - (n10 + 4);
                            }
                            break block14;
                        }
                        if (n8 != 4) break block16;
                        int n12 = n11;
                        if ((n9 & 64) != 0) {
                            n10 = object.F();
                            object.U(n10 - 4);
                            n12 = n11 - n10;
                        }
                        n10 = n12;
                        if ((n9 & 16) != 0) {
                            n10 = n12 - 10;
                        }
                    }
                    boolean bl2 = bl;
                    if (n8 < 4) {
                        bl2 = bl;
                        if ((n9 & 128) != 0) {
                            bl2 = true;
                        }
                    }
                    return new b(n8, bl2, n10);
                }
                object = new StringBuilder();
                object.append("Skipped ID3 tag with unsupported majorVersion=");
                object.append(n8);
            }
            object = object.toString();
        }
        g0.o.h("Id3Decoder", (String)object);
        return null;
    }

    public static l n(g0.z arrn, int n8) {
        int n9 = arrn.M();
        int n10 = arrn.J();
        int n11 = arrn.J();
        int n12 = arrn.G();
        int n13 = arrn.G();
        y y8 = new y();
        y8.m((g0.z)arrn);
        int n14 = (n8 - 10) * 8 / (n12 + n13);
        arrn = new int[n14];
        int[] arrn2 = new int[n14];
        for (n8 = 0; n8 < n14; ++n8) {
            int n15 = y8.h(n12);
            int n16 = y8.h(n13);
            arrn[n8] = n15;
            arrn2[n8] = n16;
        }
        return new l(n9, n10, n11, arrn, arrn2);
    }

    public static m o(g0.z z8, int n8) {
        byte[] arrby = new byte[n8];
        z8.l(arrby, 0, n8);
        int n9 = h.z(arrby, 0);
        return new m(new String(arrby, 0, n9, W2.e.b), h.d(arrby, n9 + 1, n8));
    }

    public static String p(byte[] arrby, int n8, int n9, Charset charset) {
        if (n9 > n8 && n9 <= arrby.length) {
            return new String(arrby, n8, n9 - n8, charset);
        }
        return "";
    }

    public static n q(g0.z z8, int n8, String string2) {
        if (n8 < 1) {
            return null;
        }
        int n9 = z8.G();
        byte[] arrby = new byte[--n8];
        z8.l(arrby, 0, n8);
        return new n(string2, null, h.r(arrby, n9, 0));
    }

    public static v r(byte[] object, int n8, int n9) {
        int n10;
        if (n9 >= object.length) {
            return v.Z("");
        }
        Object object2 = v.M();
        while (n9 < (n10 = h.y((byte[])object, n9, n8))) {
            object2.h(new String((byte[])object, n9, n10 - n9, h.w(n8)));
            n9 = h.v(n8) + n10;
        }
        object = object2 = object2.k();
        if (object2.isEmpty()) {
            object = v.Z("");
        }
        return object;
    }

    public static n s(g0.z z8, int n8) {
        if (n8 < 1) {
            return null;
        }
        int n9 = z8.G();
        byte[] arrby = new byte[--n8];
        z8.l(arrby, 0, n8);
        n8 = h.y(arrby, 0, n9);
        return new n("TXXX", new String(arrby, 0, n8, h.w(n9)), h.r(arrby, n9, n8 + h.v(n9)));
    }

    public static o t(g0.z z8, int n8, String string2) {
        byte[] arrby = new byte[n8];
        z8.l(arrby, 0, n8);
        return new o(string2, null, new String(arrby, 0, h.z(arrby, 0), W2.e.b));
    }

    public static o u(g0.z object, int n8) {
        if (n8 < 1) {
            return null;
        }
        int n9 = object.G();
        byte[] arrby = new byte[--n8];
        object.l(arrby, 0, n8);
        n8 = h.y(arrby, 0, n9);
        object = new String(arrby, 0, n8, h.w(n9));
        return new o("WXXX", (String)object, h.p(arrby, n8, h.z(arrby, n8 += h.v(n9)), W2.e.b));
    }

    public static int v(int n8) {
        if (n8 != 0 && n8 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset w(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return W2.e.b;
                }
                return W2.e.c;
            }
            return W2.e.d;
        }
        return W2.e.f;
    }

    public static String x(int n8, int n9, int n10, int n11, int n12) {
        if (n8 == 2) {
            return String.format((Locale)Locale.US, (String)"%c%c%c", (Object[])new Object[]{n9, n10, n11});
        }
        return String.format((Locale)Locale.US, (String)"%c%c%c%c", (Object[])new Object[]{n9, n10, n11, n12});
    }

    public static int y(byte[] arrby, int n8, int n9) {
        int n10 = h.z(arrby, n8);
        if (n9 != 0) {
            int n11 = n10;
            if (n9 == 3) {
                return n10;
            }
            while (n11 < arrby.length - 1) {
                if ((n11 - n8) % 2 == 0 && arrby[n11 + 1] == 0) {
                    return n11;
                }
                n11 = h.z(arrby, n11 + 1);
            }
            return arrby.length;
        }
        return n10;
    }

    public static int z(byte[] arrby, int n8) {
        while (n8 < arrby.length) {
            if (arrby[n8] == 0) {
                return n8;
            }
            ++n8;
        }
        return arrby.length;
    }

    @Override
    public x b(O0.b b8, ByteBuffer byteBuffer) {
        return this.e(byteBuffer.array(), byteBuffer.limit());
    }

    public x e(byte[] object, int n8) {
        ArrayList arrayList = new ArrayList();
        g0.z z8 = new g0.z((byte[])object, n8);
        object = h.m(z8);
        if (object == null) {
            return null;
        }
        int n9 = z8.f();
        n8 = ((b)object).a == 2 ? 6 : 10;
        int n10 = ((b)object).c;
        if (((b)object).b) {
            n10 = h.B(z8, ((b)object).c);
        }
        z8.S(n9 + n10);
        n10 = ((b)object).a;
        boolean bl = false;
        if (!h.C(z8, n10, n8, false)) {
            if (((b)object).a == 4 && h.C(z8, 4, n8, true)) {
                bl = true;
            } else {
                arrayList = new StringBuilder();
                arrayList.append("Failed to validate ID3 tag with majorVersion=");
                arrayList.append(((b)object).a);
                g0.o.h("Id3Decoder", arrayList.toString());
                return null;
            }
        }
        while (z8.a() >= n8) {
            i i8 = h.k(((b)object).a, z8, bl, n8, this.a);
            if (i8 == null) continue;
            arrayList.add((Object)i8);
        }
        return new x((List)arrayList);
    }

    public static interface a {
        public boolean a(int var1, int var2, int var3, int var4, int var5);
    }

    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int n8, boolean bl, int n9) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
        }
    }

}

