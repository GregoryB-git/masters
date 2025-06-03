/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;

public final class K1
extends Y3
implements K4 {
    private static final K1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        K1 k12;
        zzc = k12 = new K1();
        Y3.t(K1.class, k12);
    }

    private final void H(String string2) {
        string2.getClass();
        this.zze |= 1;
        this.zzf = string2;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int k() {
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

        public /* synthetic */ a(H1 h12) {
            this();
        }

        public final boolean A() {
            return ((K1)this.p).L();
        }

        public final boolean B() {
            return ((K1)this.p).M();
        }

        public final boolean C() {
            return ((K1)this.p).N();
        }

        public final boolean D() {
            return ((K1)this.p).O();
        }

        public final int w() {
            return ((K1)this.p).k();
        }

        public final a x(String string2) {
            this.s();
            ((K1)this.p).H(string2);
            return this;
        }

        public final String y() {
            return ((K1)this.p).J();
        }

        public final boolean z() {
            return ((K1)this.p).K();
        }
    }

}

