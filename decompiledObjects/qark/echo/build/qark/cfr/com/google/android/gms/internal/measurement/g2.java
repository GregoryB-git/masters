/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j3;
import java.util.List;

public final class g2
extends Y3
implements K4 {
    private static final g2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private i4 zzg = Y3.A();

    static {
        g2 g22;
        zzc = g22 = new g2();
        Y3.t(g2.class, g22);
    }

    private final void J(Iterable iterable) {
        i4 i42 = this.zzg;
        if (!i42.c()) {
            this.zzg = Y3.o(i42);
        }
        j3.e(iterable, this.zzg);
    }

    private final void L(int n8) {
        this.zze |= 1;
        this.zzf = n8;
    }

    public static a M() {
        return (a)zzc.w();
    }

    public final long G(int n8) {
        return this.zzg.l(n8);
    }

    public final int K() {
        return this.zzf;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.zzg.size();
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
            ((g2)this.p).L(n8);
            return this;
        }

        public final a x(Iterable iterable) {
            this.s();
            ((g2)this.p).J(iterable);
            return this;
        }
    }

}

