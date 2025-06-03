/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.x1;
import java.util.List;

public final class w1
extends Y3
implements K4 {
    private static final w1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private h4 zzg = Y3.B();
    private h4 zzh = Y3.B();
    private boolean zzi;
    private boolean zzj;

    static {
        w1 w12;
        zzc = w12 = new w1();
        Y3.t(w1.class, w12);
    }

    public final x1 G(int n8) {
        return (x1)this.zzh.get(n8);
    }

    public final void H(int n8, x1 x12) {
        x12.getClass();
        h4 h42 = this.zzh;
        if (!h42.c()) {
            this.zzh = Y3.n(h42);
        }
        this.zzh.set(n8, (Object)x12);
    }

    public final void I(int n8, A1 a12) {
        a12.getClass();
        h4 h42 = this.zzg;
        if (!h42.c()) {
            this.zzg = Y3.n(h42);
        }
        this.zzg.set(n8, (Object)a12);
    }

    public final int L() {
        return this.zzh.size();
    }

    public final A1 M(int n8) {
        return (A1)this.zzg.get(n8);
    }

    public final int N() {
        return this.zzg.size();
    }

    public final List P() {
        return this.zzh;
    }

    public final List Q() {
        return this.zzg;
    }

    public final boolean R() {
        if ((this.zze & 1) != 0) {
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

        public final int A() {
            return ((w1)this.p).N();
        }

        public final A1 B(int n8) {
            return ((w1)this.p).M(n8);
        }

        public final int w() {
            return ((w1)this.p).L();
        }

        public final a x(int n8, x1.a a8) {
            this.s();
            ((w1)this.p).H(n8, (x1)((Y3)a8.p()));
            return this;
        }

        public final a y(int n8, A1.a a8) {
            this.s();
            ((w1)this.p).I(n8, (A1)((Y3)a8.p()));
            return this;
        }

        public final x1 z(int n8) {
            return ((w1)this.p).G(n8);
        }
    }

}

