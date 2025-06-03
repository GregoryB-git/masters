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
package com.google.protobuf;

import com.google.protobuf.f;

public abstract class m0 {
    public static final int a = m0.c(1, 3);
    public static final int b = m0.c(1, 4);
    public static final int c = m0.c(2, 0);
    public static final int d = m0.c(3, 2);

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
            q = new b(c.s, 1);
            r = new b(c.r, 5);
            c c8 = c.q;
            s = new b(c8, 0);
            t = new b(c8, 0);
            c c9 = c.p;
            u = new b(c9, 0);
            v = new b(c8, 1);
            w = new b(c9, 5);
            x = new b(c.t, 0);
            y = new b("STRING", 8, c.u, 2){};
            c c10 = c.x;
            z = new b("GROUP", 9, c10, 3){};
            A = new b("MESSAGE", 10, c10, 2){};
            B = new b("BYTES", 11, c.v, 2){};
            C = new b(c9, 0);
            D = new b(c.w, 0);
            E = new b(c9, 5);
            F = new b(c8, 1);
            G = new b(c9, 0);
            H = new b(c8, 0);
            I = b.c();
        }

        public b(c c8, int n9) {
            this.o = c8;
            this.p = n9;
        }

        /*
         * Exception decompiling
         */
        public /* synthetic */ b(c var1, int var2, com.google.protobuf.m0$a var3) {
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

        public static /* synthetic */ b[] c() {
            return new b[]{q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])I.clone();
        }

        public c e() {
            return this.o;
        }

        public int h() {
            return this.p;
        }

    }

    public static final class c
    extends Enum {
        public static final /* enum */ c p = new c(0);
        public static final /* enum */ c q = new c(0L);
        public static final /* enum */ c r = new c((Object)Float.valueOf((float)0.0f));
        public static final /* enum */ c s = new c(0.0);
        public static final /* enum */ c t = new c((Object)Boolean.FALSE);
        public static final /* enum */ c u = new c("");
        public static final /* enum */ c v = new c(f.p);
        public static final /* enum */ c w = new c(null);
        public static final /* enum */ c x = new c(null);
        public static final /* synthetic */ c[] y;
        public final Object o;

        static {
            y = c.c();
        }

        public c(Object object) {
            this.o = object;
        }

        public static /* synthetic */ c[] c() {
            return new c[]{p, q, r, s, t, u, v, w, x};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])y.clone();
        }
    }

}

