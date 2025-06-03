/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.z1;
import java.util.List;

public final class x1
extends Y3
implements K4 {
    private static final x1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private h4 zzh = Y3.B();
    private boolean zzi;
    private z1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        x1 x12;
        zzc = x12 = new x1();
        Y3.t(x1.class, x12);
    }

    public static a M() {
        return (a)zzc.w();
    }

    public final y1 G(int n8) {
        return (y1)this.zzh.get(n8);
    }

    public final void H(int n8, y1 y12) {
        y12.getClass();
        h4 h42 = this.zzh;
        if (!h42.c()) {
            this.zzh = Y3.n(h42);
        }
        this.zzh.set(n8, (Object)y12);
    }

    public final void K(String string2) {
        string2.getClass();
        this.zze |= 2;
        this.zzg = string2;
    }

    public final int L() {
        return this.zzf;
    }

    public final z1 O() {
        z1 z12;
        z1 z13 = z12 = this.zzj;
        if (z12 == null) {
            z13 = z1.I();
        }
        return z13;
    }

    public final String P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzh;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return this.zzm;
    }

    public final boolean U() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.zzh.size();
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

        public final String A() {
            return ((x1)this.p).P();
        }

        public final int w() {
            return ((x1)this.p).k();
        }

        public final a x(int n8, y1 y12) {
            this.s();
            ((x1)this.p).H(n8, y12);
            return this;
        }

        public final a y(String string2) {
            this.s();
            ((x1)this.p).K(string2);
            return this;
        }

        public final y1 z(int n8) {
            return ((x1)this.p).G(n8);
        }
    }

}

