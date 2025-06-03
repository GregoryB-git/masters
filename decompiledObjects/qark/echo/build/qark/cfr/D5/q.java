/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package D5;

import D5.p;
import E5.j;
import E5.k;
import E5.l;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w5.a;

public class q {
    public final k a;
    public g b;
    public final k.c c;

    public q(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            public static /* synthetic */ void a(k.d d8, c c8) {
                .e(d8, c8);
            }

            public static /* synthetic */ void e(k.d d8, c c8) {
                if (c8 == null) {
                    d8.b("error", "Failed to resize the platform view", null);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"width", (Object)Double.valueOf((double)c8.a));
                hashMap.put((Object)"height", (Object)Double.valueOf((double)c8.b));
                d8.a((Object)hashMap);
            }

            public final void b(j j8, k.d d8) {
                int n8 = (Integer)j8.b();
                try {
                    q.this.b.f(n8);
                    d8.a(null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            /*
             * Exception decompiling
             */
            public final void c(j var1_1, k.d var2_3) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[SIMPLE_IF_TAKEN]], but top level block is 0[TRYBLOCK]
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
                // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
                // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
                // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
                // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
                // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
                // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
                // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
                // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
                // org.benf.cfr.reader.Main.doJar(Main.java:134)
                // org.benf.cfr.reader.Main.main(Main.java:189)
                throw new IllegalStateException("Decompilation failed");
            }

            public final void d(j j8, k.d d8) {
                int n8 = (Integer)((Map)j8.b()).get((Object)"id");
                try {
                    q.this.b.g(n8);
                    d8.a(null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            public final void f(j j8, k.d d8) {
                j8 = (Map)j8.b();
                try {
                    q.this.b.b((Integer)j8.get((Object)"id"), (Double)j8.get((Object)"top"), (Double)j8.get((Object)"left"));
                    d8.a(null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            public final void g(j object, k.d d8) {
                object = (Map)object.b();
                object = new e((Integer)object.get((Object)"id"), (Double)object.get((Object)"width"), (Double)object.get((Object)"height"));
                try {
                    q.this.b.i((e)object, new p(d8));
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            public final void h(j j8, k.d d8) {
                j8 = (Map)j8.b();
                int n8 = (Integer)j8.get((Object)"id");
                int n9 = (Integer)j8.get((Object)"direction");
                try {
                    q.this.b.c(n8, n9);
                    d8.a(null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            public final void i(j j8, k.d d8) {
                boolean bl = (Boolean)j8.b();
                try {
                    q.this.b.a(bl);
                    d8.a(null);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    d8.b("error", q.c((Exception)illegalStateException), null);
                    return;
                }
            }

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public final void j(j object, k.d d8) {
                void var1_4;
                block4 : {
                    object = (List)object.b();
                    object = new f((Integer)object.get(0), (Number)object.get(1), (Number)object.get(2), (Integer)object.get(3), (Integer)object.get(4), object.get(5), object.get(6), (Integer)object.get(7), (Integer)object.get(8), (float)((Double)object.get(9)).doubleValue(), (float)((Double)object.get(10)).doubleValue(), (Integer)object.get(11), (Integer)object.get(12), (Integer)object.get(13), (Integer)object.get(14), ((Number)object.get(15)).longValue());
                    q.this.b.d((f)object);
                    try {
                        d8.a(null);
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {}
                    break block4;
                    catch (IllegalStateException illegalStateException) {
                        // empty catch block
                    }
                }
                d8.b("error", q.c((Exception)var1_4), null);
            }

            @Override
            public void onMethodCall(j j8, k.d d8) {
                if (q.this.b == null) {
                    return;
                }
                Object object = new StringBuilder();
                object.append("Received '");
                object.append(j8.a);
                object.append("' message.");
                t5.b.f("PlatformViewsChannel", object.toString());
                object = j8.a;
                object.hashCode();
                int n8 = object.hashCode();
                int n9 = -1;
                switch (n8) {
                    default: {
                        break;
                    }
                    case 1671767583: {
                        if (!object.equals((Object)"dispose")) break;
                        n9 = 7;
                        break;
                    }
                    case 576796989: {
                        if (!object.equals((Object)"setDirection")) break;
                        n9 = 6;
                        break;
                    }
                    case 110550847: {
                        if (!object.equals((Object)"touch")) break;
                        n9 = 5;
                        break;
                    }
                    case -308988850: {
                        if (!object.equals((Object)"synchronizeToNativeViewHierarchy")) break;
                        n9 = 4;
                        break;
                    }
                    case -756050293: {
                        if (!object.equals((Object)"clearFocus")) break;
                        n9 = 3;
                        break;
                    }
                    case -934437708: {
                        if (!object.equals((Object)"resize")) break;
                        n9 = 2;
                        break;
                    }
                    case -1019779949: {
                        if (!object.equals((Object)"offset")) break;
                        n9 = 1;
                        break;
                    }
                    case -1352294148: {
                        if (!object.equals((Object)"create")) break;
                        n9 = 0;
                    }
                }
                switch (n9) {
                    default: {
                        d8.c();
                        return;
                    }
                    case 7: {
                        this.d(j8, d8);
                        return;
                    }
                    case 6: {
                        this.h(j8, d8);
                        return;
                    }
                    case 5: {
                        this.j(j8, d8);
                        return;
                    }
                    case 4: {
                        this.i(j8, d8);
                        return;
                    }
                    case 3: {
                        this.b(j8, d8);
                        return;
                    }
                    case 2: {
                        this.g(j8, d8);
                        return;
                    }
                    case 1: {
                        this.f(j8, d8);
                        return;
                    }
                    case 0: 
                }
                this.c(j8, d8);
            }
        };
        this.a = object = new k((E5.c)object, "flutter/platform_views", E5.q.b);
        object.e(c8);
    }

    public static String c(Exception exception) {
        return t5.b.d((Throwable)exception);
    }

    public void d(g g8) {
        this.b = g8;
    }

    public static interface b {
        public void a(c var1);
    }

    public static class c {
        public final int a;
        public final int b;

        public c(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    public static class d {
        public final int a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final double f;
        public final int g;
        public final a h;
        public final ByteBuffer i;

        public d(int n8, String string2, double d8, double d9, double d10, double d11, int n9, a a8, ByteBuffer byteBuffer) {
            this.a = n8;
            this.b = string2;
            this.e = d8;
            this.f = d9;
            this.c = d10;
            this.d = d11;
            this.g = n9;
            this.h = a8;
            this.i = byteBuffer;
        }

        public static final class a
        extends Enum {
            public static final /* enum */ a o = new a();
            public static final /* enum */ a p = new a();
            public static final /* enum */ a q = new a();
            public static final /* synthetic */ a[] r;

            static {
                r = a.c();
            }

            public static /* synthetic */ a[] c() {
                return new a[]{o, p, q};
            }

            public static a valueOf(String string2) {
                return (a)Enum.valueOf(a.class, (String)string2);
            }

            public static a[] values() {
                return (a[])r.clone();
            }
        }

    }

    public static class e {
        public final int a;
        public final double b;
        public final double c;

        public e(int n8, double d8, double d9) {
            this.a = n8;
            this.b = d8;
            this.c = d9;
        }
    }

    public static class f {
        public final int a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        public f(int n8, Number number, Number number2, int n9, int n10, Object object, Object object2, int n11, int n12, float f8, float f9, int n13, int n14, int n15, int n16, long l8) {
            this.a = n8;
            this.b = number;
            this.c = number2;
            this.d = n9;
            this.e = n10;
            this.f = object;
            this.g = object2;
            this.h = n11;
            this.i = n12;
            this.j = f8;
            this.k = f9;
            this.l = n13;
            this.m = n14;
            this.n = n15;
            this.o = n16;
            this.p = l8;
        }
    }

    public static interface g {
        public void a(boolean var1);

        public void b(int var1, double var2, double var4);

        public void c(int var1, int var2);

        public void d(f var1);

        public long e(d var1);

        public void f(int var1);

        public void g(int var1);

        public void h(d var1);

        public void i(e var1, b var2);
    }

}

