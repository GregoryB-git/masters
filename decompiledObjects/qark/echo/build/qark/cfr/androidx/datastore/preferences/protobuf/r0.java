/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;

public abstract class r0 {
    public static final int a = r0.c(1, 3);
    public static final int b = r0.c(1, 4);
    public static final int c = r0.c(2, 0);
    public static final int d = r0.c(3, 2);

    public static int a(int n8) {
        return n8 >>> 3;
    }

    public static int b(int n8) {
        return n8 & 7;
    }

    public static int c(int n8, int n9) {
        return n8 << 3 | n9;
    }

    public static class b
    extends Enum {
        public static final /* enum */ b A;
        public static final /* enum */ b B;
        public static final /* enum */ b C;
        public static final /* enum */ b D;
        public static final /* enum */ b E;
        public static final /* enum */ b F;
        public static final /* enum */ b G;
        public static final /* enum */ b H;
        public static final /* synthetic */ b[] I;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* enum */ b s;
        public static final /* enum */ b t;
        public static final /* enum */ b u;
        public static final /* enum */ b v;
        public static final /* enum */ b w;
        public static final /* enum */ b x;
        public static final /* enum */ b y;
        public static final /* enum */ b z;
        public final c o;
        public final int p;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            b b16;
            b b17;
            b b18;
            b b19;
            b b20;
            b b21;
            b b22;
            q = b14 = new b(c.s, 1);
            r = b12 = new b(c.r, 5);
            Enum enum_ = c.q;
            s = b17 = new b((c)enum_, 0);
            t = b10 = new b((c)enum_, 0);
            Enum enum_2 = c.p;
            u = b20 = new b((c)enum_2, 0);
            v = b16 = new b((c)enum_, 1);
            w = b11 = new b((c)enum_2, 5);
            x = b22 = new b(c.t, 0);
            y = b21 = new b("STRING", 8, c.u, 2){};
            Enum enum_3 = c.x;
            z = b19 = new b("GROUP", 9, (c)enum_3, 3){};
            A = enum_3 = new b("MESSAGE", 10, (c)enum_3, 2){};
            B = b8 = new b("BYTES", 11, c.v, 2){};
            C = b15 = new b((c)enum_2, 0);
            D = b18 = new b(c.w, 0);
            E = b13 = new b((c)enum_2, 5);
            F = b9 = new b((c)enum_, 1);
            G = enum_2 = new b((c)enum_2, 0);
            H = enum_ = new b((c)enum_, 0);
            I = new b[]{b14, b12, b17, b10, b20, b16, b11, b22, b21, b19, enum_3, b8, b15, b18, b13, b9, enum_2, enum_};
        }

        public b(c c8, int n9) {
            this.o = c8;
            this.p = n9;
        }

        /*
         * Exception decompiling
         */
        public /* synthetic */ b(c var1, int var2, androidx.datastore.preferences.protobuf.r0$a var3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException: Synthetic arg - offset is 1, but got 3
            // org.benf.cfr.reader.bytecode.analysis.types.MethodPrototype.collectInitialSlotUsage(MethodPrototype.java:244)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiersInner(Op02WithProcessedDataAndRefs.java:1561)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.assignSSAIdentifiers(Op02WithProcessedDataAndRefs.java:1518)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:1762)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:382)
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

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])I.clone();
        }

        public c c() {
            return this.o;
        }

        public int e() {
            return this.p;
        }

    }

    public static final class c
    extends Enum {
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* enum */ c r;
        public static final /* enum */ c s;
        public static final /* enum */ c t;
        public static final /* enum */ c u;
        public static final /* enum */ c v;
        public static final /* enum */ c w;
        public static final /* enum */ c x;
        public static final /* synthetic */ c[] y;
        public final Object o;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            c c14;
            c c15;
            c c16;
            p = c14 = new c(0);
            q = c13 = new c(0L);
            r = c10 = new c((Object)Float.valueOf((float)0.0f));
            s = c16 = new c(0.0);
            t = c11 = new c((Object)Boolean.FALSE);
            u = c12 = new c("");
            v = c8 = new c(g.p);
            w = c9 = new c(null);
            x = c15 = new c(null);
            y = new c[]{c14, c13, c10, c16, c11, c12, c8, c9, c15};
        }

        public c(Object object) {
            this.o = object;
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])y.clone();
        }
    }

}

