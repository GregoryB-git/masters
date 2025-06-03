/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.f2;

public final class W1
extends Y3
implements K4 {
    private static final W1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private f2 zzg;
    private f2 zzh;
    private boolean zzi;

    static {
        W1 w12;
        zzc = w12 = new W1();
        Y3.t(W1.class, w12);
    }

    private final void K(f2 f22) {
        f22.getClass();
        this.zzg = f22;
        this.zze |= 2;
    }

    private final void L(boolean bl) {
        this.zze |= 8;
        this.zzi = bl;
    }

    public static a M() {
        return (a)zzc.w();
    }

    private final void O(f2 f22) {
        f22.getClass();
        this.zzh = f22;
        this.zze |= 4;
    }

    public final void G(int n8) {
        this.zze |= 1;
        this.zzf = n8;
    }

    public final f2 Q() {
        f2 f22;
        f2 f23 = f22 = this.zzg;
        if (f22 == null) {
            f23 = f2.X();
        }
        return f23;
    }

    public final f2 R() {
        f2 f22;
        f2 f23 = f22 = this.zzh;
        if (f22 == null) {
            f23 = f2.X();
        }
        return f23;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final boolean T() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if ((this.zze & 4) != 0) {
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

        public /* synthetic */ a(T1 t12) {
            this();
        }

        public final a w(int n8) {
            this.s();
            ((W1)this.p).G(n8);
            return this;
        }

        public final a x(f2.a a8) {
            this.s();
            ((W1)this.p).K((f2)((Y3)a8.p()));
            return this;
        }

        public final a y(f2 f22) {
            this.s();
            ((W1)this.p).O(f22);
            return this;
        }

        public final a z(boolean bl) {
            this.s();
            ((W1)this.p).L(bl);
            return this;
        }
    }

}

