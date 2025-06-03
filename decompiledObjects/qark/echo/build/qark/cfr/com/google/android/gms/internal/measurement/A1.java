/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.y1;

public final class A1
extends Y3
implements K4 {
    private static final A1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private y1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        A1 a12;
        zzc = a12 = new A1();
        Y3.t(A1.class, a12);
    }

    private final void H(String string2) {
        string2.getClass();
        this.zze |= 2;
        this.zzg = string2;
    }

    public static a J() {
        return (a)zzc.w();
    }

    public final y1 I() {
        y1 y12;
        y1 y13 = y12 = this.zzh;
        if (y12 == null) {
            y13 = y1.J();
        }
        return y13;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.zzf;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object p(int var1_1, Object var2_2, Object var3_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
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

    public static final class a
    extends Y3.b
    implements K4 {
        public a() {
            super(zzc);
        }

        public /* synthetic */ a(v1 v12) {
            this();
        }

        public final a w(String string2) {
            this.s();
            ((A1)this.p).H(string2);
            return this;
        }
    }

}

