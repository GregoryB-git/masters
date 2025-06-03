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

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.h4;
import java.util.List;

public final class c2
extends Y3
implements K4 {
    private static final c2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf = Y3.B();
    private String zzg = "";

    static {
        c2 c22;
        zzc = c22 = new c2();
        Y3.t(c2.class, c22);
    }

    private final void I(d2 d22) {
        d22.getClass();
        h4 h42 = this.zzf;
        if (!h42.c()) {
            this.zzf = Y3.n(h42);
        }
        this.zzf.add((Object)d22);
    }

    public static a J() {
        return (a)zzc.w();
    }

    public final d2 G(int n8) {
        return (d2)this.zzf.get(0);
    }

    public final List L() {
        return this.zzf;
    }

    public final int k() {
        return this.zzf.size();
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

        public final int w() {
            return ((c2)this.p).k();
        }

        public final a x(d2.a a8) {
            this.s();
            ((c2)this.p).I((d2)((Y3)a8.p()));
            return this;
        }

        public final d2 y(int n8) {
            return ((c2)this.p).G(0);
        }
    }

}

