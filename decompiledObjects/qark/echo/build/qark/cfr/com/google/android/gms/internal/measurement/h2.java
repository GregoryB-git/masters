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
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;

public final class h2
extends Y3
implements K4 {
    private static final h2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        h2 h22;
        zzc = h22 = new h2();
        Y3.t(h2.class, h22);
    }

    private final void H(double d8) {
        this.zze |= 32;
        this.zzk = d8;
    }

    private final void I(long l8) {
        this.zze |= 8;
        this.zzi = l8;
    }

    private final void N(String string2) {
        string2.getClass();
        this.zze |= 2;
        this.zzg = string2;
    }

    private final void P(long l8) {
        this.zze |= 1;
        this.zzf = l8;
    }

    private final void T(String string2) {
        string2.getClass();
        this.zze |= 4;
        this.zzh = string2;
    }

    public static a X() {
        return (a)zzc.w();
    }

    private final void g0() {
        this.zze &= -33;
        this.zzk = 0.0;
    }

    private final void h0() {
        this.zze &= -9;
        this.zzi = 0L;
    }

    private final void i0() {
        this.zze &= -5;
        this.zzh = h2.zzc.zzh;
    }

    public final double G() {
        return this.zzk;
    }

    public final float O() {
        return this.zzj;
    }

    public final long U() {
        return this.zzi;
    }

    public final long W() {
        return this.zzf;
    }

    public final String Z() {
        return this.zzg;
    }

    public final String a0() {
        return this.zzh;
    }

    public final boolean b0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
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

        public /* synthetic */ a(T1 t12) {
            this();
        }

        public final a A() {
            this.s();
            ((h2)this.p).h0();
            return this;
        }

        public final a B(long l8) {
            this.s();
            ((h2)this.p).P(l8);
            return this;
        }

        public final a C(String string2) {
            this.s();
            ((h2)this.p).T(string2);
            return this;
        }

        public final a D() {
            this.s();
            ((h2)this.p).i0();
            return this;
        }

        public final a w() {
            this.s();
            ((h2)this.p).g0();
            return this;
        }

        public final a x(double d8) {
            this.s();
            ((h2)this.p).H(d8);
            return this;
        }

        public final a y(long l8) {
            this.s();
            ((h2)this.p).I(l8);
            return this;
        }

        public final a z(String string2) {
            this.s();
            ((h2)this.p).N(string2);
            return this;
        }
    }

}

