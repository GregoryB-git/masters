/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.H1;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.h4;
import java.util.Collections;
import java.util.List;

public final class L1
extends Y3
implements K4 {
    private static final L1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private h4 zzi = Y3.B();
    private h4 zzj = Y3.B();
    private h4 zzk = Y3.B();
    private String zzl = "";
    private boolean zzm;
    private h4 zzn = Y3.B();
    private h4 zzo = Y3.B();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private I1 zzt;
    private M1 zzu;

    static {
        L1 l12;
        zzc = l12 = new L1();
        Y3.t(L1.class, l12);
    }

    public static a N() {
        return (a)zzc.w();
    }

    public static L1 P() {
        return zzc;
    }

    public final K1 G(int n8) {
        return (K1)this.zzj.get(n8);
    }

    public final void H(int n8, K1 k12) {
        k12.getClass();
        h4 h42 = this.zzj;
        if (!h42.c()) {
            this.zzj = Y3.n(h42);
        }
        this.zzj.set(n8, (Object)k12);
    }

    public final int K() {
        return this.zzj.size();
    }

    public final long L() {
        return this.zzf;
    }

    public final I1 M() {
        I1 i12;
        I1 i13 = i12 = this.zzt;
        if (i12 == null) {
            i13 = I1.H();
        }
        return i13;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzr;
    }

    public final String S() {
        return this.zzq;
    }

    public final String T() {
        return this.zzp;
    }

    public final List U() {
        return this.zzk;
    }

    public final List V() {
        return this.zzo;
    }

    public final List W() {
        return this.zzn;
    }

    public final List X() {
        return this.zzi;
    }

    public final boolean Y() {
        return this.zzm;
    }

    public final boolean Z() {
        if ((this.zze & 512) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c0() {
        this.zzk = Y3.B();
    }

    public final int k() {
        return this.zzn.size();
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

        public final String A() {
            return ((L1)this.p).T();
        }

        public final List B() {
            return Collections.unmodifiableList((List)((L1)this.p).U());
        }

        public final List C() {
            return Collections.unmodifiableList((List)((L1)this.p).V());
        }

        public final int w() {
            return ((L1)this.p).K();
        }

        public final K1 x(int n8) {
            return ((L1)this.p).G(n8);
        }

        public final a y(int n8, K1.a a8) {
            this.s();
            ((L1)this.p).H(n8, (K1)((Y3)a8.p()));
            return this;
        }

        public final a z() {
            this.s();
            ((L1)this.p).c0();
            return this;
        }
    }

}

