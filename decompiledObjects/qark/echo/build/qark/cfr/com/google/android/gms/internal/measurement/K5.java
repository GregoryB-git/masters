/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.J5;
import com.google.android.gms.internal.measurement.L5;
import com.google.android.gms.internal.measurement.M5;
import com.google.android.gms.internal.measurement.N5;
import com.google.android.gms.internal.measurement.O5;
import com.google.android.gms.internal.measurement.P5;
import com.google.android.gms.internal.measurement.Q5;
import com.google.android.gms.internal.measurement.R5;
import com.google.android.gms.internal.measurement.S5;
import com.google.android.gms.internal.measurement.U5;

public class K5
extends Enum {
    public static final /* enum */ K5 A;
    public static final /* enum */ K5 B;
    public static final /* enum */ K5 C;
    public static final /* enum */ K5 D;
    public static final /* enum */ K5 E;
    public static final /* enum */ K5 F;
    public static final /* enum */ K5 G;
    public static final /* enum */ K5 H;
    public static final /* synthetic */ K5[] I;
    public static final /* enum */ K5 q;
    public static final /* enum */ K5 r;
    public static final /* enum */ K5 s;
    public static final /* enum */ K5 t;
    public static final /* enum */ K5 u;
    public static final /* enum */ K5 v;
    public static final /* enum */ K5 w;
    public static final /* enum */ K5 x;
    public static final /* enum */ K5 y;
    public static final /* enum */ K5 z;
    public final U5 o;
    public final int p;

    static {
        K5 k52;
        K5 k53;
        K5 k54;
        K5 k55;
        K5 k56;
        K5 k57;
        K5 k58;
        K5 k59;
        K5 k510;
        K5 k511;
        K5 k512;
        K5 k513;
        q = k55 = new K5(U5.s, 1);
        r = k58 = new K5(U5.r, 5);
        Enum enum_ = U5.q;
        s = k57 = new K5((U5)enum_, 0);
        t = k511 = new K5((U5)enum_, 0);
        Enum enum_2 = U5.p;
        u = k53 = new K5((U5)enum_2, 0);
        v = k59 = new K5((U5)enum_, 1);
        w = k512 = new K5((U5)enum_2, 5);
        x = k513 = new K5(U5.t, 0);
        J5 j52 = new J5("STRING", 8, U5.u, 2, null);
        y = j52;
        Enum enum_3 = U5.x;
        L5 l52 = new L5("GROUP", 9, (U5)enum_3, 3, null);
        z = l52;
        A = enum_3 = new N5("MESSAGE", 10, (U5)enum_3, 2, null);
        P5 p52 = new P5("BYTES", 11, U5.v, 2, null);
        B = p52;
        C = k56 = new K5((U5)enum_2, 0);
        D = k52 = new K5(U5.w, 0);
        E = k54 = new K5((U5)enum_2, 5);
        F = k510 = new K5((U5)enum_, 1);
        G = enum_2 = new K5((U5)enum_2, 0);
        H = enum_ = new K5((U5)enum_, 0);
        I = new K5[]{k55, k58, k57, k511, k53, k59, k512, k513, j52, l52, enum_3, p52, k56, k52, k54, k510, enum_2, enum_};
    }

    public K5(U5 u52, int n9) {
        this.o = u52;
        this.p = n9;
    }

    /*
     * Exception decompiling
     */
    public /* synthetic */ K5(U5 var1, int var2, R5 var3) {
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
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static K5[] values() {
        return (K5[])I.clone();
    }

    public final U5 c() {
        return this.o;
    }
}

