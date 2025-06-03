/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.j3;
import java.util.List;

public final class a2
extends Y3
implements K4 {
    private static final a2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private h4 zzk = Y3.B();

    static {
        a2 a22;
        zzc = a22 = new a2();
        Y3.t(a2.class, a22);
    }

    private final void I(long l8) {
        this.zze |= 4;
        this.zzh = l8;
    }

    private final void P(Iterable iterable) {
        this.o0();
        j3.e(iterable, this.zzk);
    }

    private final void Q(String string2) {
        string2.getClass();
        this.zze |= 1;
        this.zzf = string2;
    }

    public static a Z() {
        return (a)zzc.w();
    }

    public final double G() {
        return this.zzj;
    }

    public final void H(double d8) {
        this.zze |= 16;
        this.zzj = d8;
    }

    public final float R() {
        return this.zzi;
    }

    public final void U(String string2) {
        string2.getClass();
        this.zze |= 2;
        this.zzg = string2;
    }

    public final int V() {
        return this.zzk.size();
    }

    public final long X() {
        return this.zzh;
    }

    public final void a0(a2 a22) {
        a22.getClass();
        this.o0();
        this.zzk.add((Object)a22);
    }

    public final String c0() {
        return this.zzf;
    }

    public final String d0() {
        return this.zzg;
    }

    public final List e0() {
        return this.zzk;
    }

    public final boolean f0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void k0() {
        this.zze &= -17;
        this.zzj = 0.0;
    }

    public final void l0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    public final void m0() {
        this.zzk = Y3.B();
    }

    public final void n0() {
        this.zze &= -3;
        this.zzg = a2.zzc.zzg;
    }

    public final void o0() {
        h4 h42 = this.zzk;
        if (!h42.c()) {
            this.zzk = Y3.n(h42);
        }
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

        public final a A(Iterable iterable) {
            this.s();
            ((a2)this.p).P(iterable);
            return this;
        }

        public final a B(String string2) {
            this.s();
            ((a2)this.p).Q(string2);
            return this;
        }

        public final a C() {
            this.s();
            ((a2)this.p).k0();
            return this;
        }

        public final a D(String string2) {
            this.s();
            ((a2)this.p).U(string2);
            return this;
        }

        public final a E() {
            this.s();
            ((a2)this.p).l0();
            return this;
        }

        public final a F() {
            this.s();
            ((a2)this.p).m0();
            return this;
        }

        public final a G() {
            this.s();
            ((a2)this.p).n0();
            return this;
        }

        public final int w() {
            return ((a2)this.p).V();
        }

        public final a x(double d8) {
            this.s();
            ((a2)this.p).H(d8);
            return this;
        }

        public final a y(long l8) {
            this.s();
            ((a2)this.p).I(l8);
            return this;
        }

        public final a z(a a8) {
            this.s();
            ((a2)this.p).a0((a2)((Y3)a8.p()));
            return this;
        }
    }

}

