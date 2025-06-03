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
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j3;
import java.util.List;

public final class f2
extends Y3
implements K4 {
    private static final f2 zzc;
    private static volatile T4 zzd;
    private i4 zze = Y3.A();
    private i4 zzf = Y3.A();
    private h4 zzg = Y3.B();
    private h4 zzh = Y3.B();

    static {
        f2 f22;
        zzc = f22 = new f2();
        Y3.t(f2.class, f22);
    }

    private final void I(Iterable iterable) {
        h4 h42 = this.zzg;
        if (!h42.c()) {
            this.zzg = Y3.n(h42);
        }
        j3.e(iterable, this.zzg);
    }

    private final void M(Iterable iterable) {
        i4 i42 = this.zzf;
        if (!i42.c()) {
            this.zzf = Y3.o(i42);
        }
        j3.e(iterable, this.zzf);
    }

    private final void Q(Iterable iterable) {
        h4 h42 = this.zzh;
        if (!h42.c()) {
            this.zzh = Y3.n(h42);
        }
        j3.e(iterable, this.zzh);
    }

    private final void U(Iterable iterable) {
        i4 i42 = this.zze;
        if (!i42.c()) {
            this.zze = Y3.o(i42);
        }
        j3.e(iterable, this.zze);
    }

    public static a V() {
        return (a)zzc.w();
    }

    public static f2 X() {
        return zzc;
    }

    private final void c0() {
        this.zzg = Y3.B();
    }

    private final void d0() {
        this.zzf = Y3.A();
    }

    private final void f0() {
        this.zze = Y3.A();
    }

    public final int J() {
        return this.zzf.size();
    }

    public final int N() {
        return this.zzh.size();
    }

    public final int R() {
        return this.zze.size();
    }

    public final List Y() {
        return this.zzg;
    }

    public final List Z() {
        return this.zzf;
    }

    public final List a0() {
        return this.zzh;
    }

    public final List b0() {
        return this.zze;
    }

    public final void e0() {
        this.zzh = Y3.B();
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

        public final a A() {
            this.s();
            ((f2)this.p).e0();
            return this;
        }

        public final a B(Iterable iterable) {
            this.s();
            ((f2)this.p).Q(iterable);
            return this;
        }

        public final a C() {
            this.s();
            ((f2)this.p).f0();
            return this;
        }

        public final a D(Iterable iterable) {
            this.s();
            ((f2)this.p).U(iterable);
            return this;
        }

        public final a w() {
            this.s();
            ((f2)this.p).c0();
            return this;
        }

        public final a x(Iterable iterable) {
            this.s();
            ((f2)this.p).I(iterable);
            return this;
        }

        public final a y() {
            this.s();
            ((f2)this.p).d0();
            return this;
        }

        public final a z(Iterable iterable) {
            this.s();
            ((f2)this.p).M(iterable);
            return this;
        }
    }

}

