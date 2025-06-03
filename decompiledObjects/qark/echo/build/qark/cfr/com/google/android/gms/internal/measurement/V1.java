/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;

public final class V1
extends Y3
implements K4 {
    private static final V1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        V1 v12;
        zzc = v12 = new V1();
        Y3.t(V1.class, v12);
    }

    public static a G() {
        return (a)zzc.w();
    }

    public static V1 M() {
        return zzc;
    }

    public final void I(boolean bl) {
        this.zze |= 32;
        this.zzk = bl;
    }

    public final void L(boolean bl) {
        this.zze |= 16;
        this.zzj = bl;
    }

    public final void O(boolean bl) {
        this.zze |= 1;
        this.zzf = bl;
    }

    public final void Q(boolean bl) {
        this.zze |= 64;
        this.zzl = bl;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final void T(boolean bl) {
        this.zze |= 2;
        this.zzg = bl;
    }

    public final boolean U() {
        return this.zzj;
    }

    public final void W(boolean bl) {
        this.zze |= 4;
        this.zzh = bl;
    }

    public final boolean X() {
        return this.zzf;
    }

    public final void Z(boolean bl) {
        this.zze |= 8;
        this.zzi = bl;
    }

    public final boolean a0() {
        return this.zzl;
    }

    public final boolean b0() {
        return this.zzg;
    }

    public final boolean c0() {
        return this.zzh;
    }

    public final boolean d0() {
        return this.zzi;
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

        public final a A(boolean bl) {
            this.s();
            ((V1)this.p).T(bl);
            return this;
        }

        public final a B(boolean bl) {
            this.s();
            ((V1)this.p).W(bl);
            return this;
        }

        public final a C(boolean bl) {
            this.s();
            ((V1)this.p).Z(bl);
            return this;
        }

        public final a w(boolean bl) {
            this.s();
            ((V1)this.p).I(bl);
            return this;
        }

        public final a x(boolean bl) {
            this.s();
            ((V1)this.p).L(bl);
            return this;
        }

        public final a y(boolean bl) {
            this.s();
            ((V1)this.p).O(bl);
            return this;
        }

        public final a z(boolean bl) {
            this.s();
            ((V1)this.p).Q(bl);
            return this;
        }
    }

}

