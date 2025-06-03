/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.v1;
import com.google.android.gms.internal.measurement.z1;

public final class y1
extends Y3
implements K4 {
    private static final y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private B1 zzf;
    private z1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        y1 y12;
        zzc = y12 = new y1();
        Y3.t(y1.class, y12);
    }

    private final void I(String string2) {
        string2.getClass();
        this.zze |= 8;
        this.zzi = string2;
    }

    public static y1 J() {
        return zzc;
    }

    public final z1 K() {
        z1 z12;
        z1 z13 = z12 = this.zzg;
        if (z12 == null) {
            z13 = z1.I();
        }
        return z13;
    }

    public final B1 L() {
        B1 b12;
        B1 b13 = b12 = this.zzf;
        if (b12 == null) {
            b13 = B1.I();
        }
        return b13;
    }

    public final String M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 1) != 0) {
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

        public /* synthetic */ a(v1 v12) {
            this();
        }

        public final a w(String string2) {
            this.s();
            ((y1)this.p).I(string2);
            return this;
        }
    }

}

