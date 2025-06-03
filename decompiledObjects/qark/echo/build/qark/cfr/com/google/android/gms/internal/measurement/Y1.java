/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.j3;
import java.util.Collections;
import java.util.List;

public final class Y1
extends Y3
implements K4 {
    private static final Y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf = Y3.B();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        Y1 y12;
        zzc = y12 = new Y1();
        Y3.t(Y1.class, y12);
    }

    private final void I(long l8) {
        this.zze |= 4;
        this.zzi = l8;
    }

    private final void Q(a2 a22) {
        a22.getClass();
        this.h0();
        this.zzf.add((Object)a22);
    }

    private final void S(String string2) {
        string2.getClass();
        this.zze |= 1;
        this.zzg = string2;
    }

    public static a Z() {
        return (a)zzc.w();
    }

    public final a2 G(int n8) {
        return (a2)this.zzf.get(n8);
    }

    public final void H(int n8, a2 a22) {
        a22.getClass();
        this.h0();
        this.zzf.set(n8, (Object)a22);
    }

    public final void R(Iterable iterable) {
        this.h0();
        j3.e(iterable, this.zzf);
    }

    public final int T() {
        return this.zzf.size();
    }

    public final void U(int n8) {
        this.h0();
        this.zzf.remove(n8);
    }

    public final void V(long l8) {
        this.zze |= 2;
        this.zzh = l8;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Y() {
        return this.zzh;
    }

    public final String b0() {
        return this.zzg;
    }

    public final List c0() {
        return this.zzf;
    }

    public final boolean d0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void g0() {
        this.zzf = Y3.B();
    }

    public final void h0() {
        h4 h42 = this.zzf;
        if (!h42.c()) {
            this.zzf = Y3.n(h42);
        }
    }

    public final int k() {
        return this.zzj;
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

        public final a A(long l8) {
            this.s();
            ((Y1)this.p).I(l8);
            return this;
        }

        public final a B(a2.a a8) {
            this.s();
            ((Y1)this.p).Q((a2)((Y3)a8.p()));
            return this;
        }

        public final a C(a2 a22) {
            this.s();
            ((Y1)this.p).Q(a22);
            return this;
        }

        public final a D(Iterable iterable) {
            this.s();
            ((Y1)this.p).R(iterable);
            return this;
        }

        public final a E(String string2) {
            this.s();
            ((Y1)this.p).S(string2);
            return this;
        }

        public final long F() {
            return ((Y1)this.p).X();
        }

        public final a G(long l8) {
            this.s();
            ((Y1)this.p).V(l8);
            return this;
        }

        public final a2 H(int n8) {
            return ((Y1)this.p).G(n8);
        }

        public final long I() {
            return ((Y1)this.p).Y();
        }

        public final a J() {
            this.s();
            ((Y1)this.p).g0();
            return this;
        }

        public final String K() {
            return ((Y1)this.p).b0();
        }

        public final List L() {
            return Collections.unmodifiableList((List)((Y1)this.p).c0());
        }

        public final boolean M() {
            return ((Y1)this.p).f0();
        }

        public final int w() {
            return ((Y1)this.p).T();
        }

        public final a x(int n8) {
            this.s();
            ((Y1)this.p).U(n8);
            return this;
        }

        public final a y(int n8, a2.a a8) {
            this.s();
            ((Y1)this.p).H(n8, (a2)((Y3)a8.p()));
            return this;
        }

        public final a z(int n8, a2 a22) {
            this.s();
            ((Y1)this.p).H(n8, a22);
            return this;
        }
    }

}

