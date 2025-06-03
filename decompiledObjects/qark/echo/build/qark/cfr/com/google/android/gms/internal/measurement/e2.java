/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.m2;

public final class e2
extends Y3
implements K4 {
    private static final e2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf = 1;
    private h4 zzg = Y3.B();

    static {
        e2 e22;
        zzc = e22 = new e2();
        Y3.t(e2.class, e22);
    }

    public static b G() {
        return (b)zzc.w();
    }

    public final void H(Z1 z12) {
        z12.getClass();
        h4 h42 = this.zzg;
        if (!h42.c()) {
            this.zzg = Y3.n(h42);
        }
        this.zzg.add((Object)z12);
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
    extends Enum
    implements e4 {
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final d4 r;
        public static final /* synthetic */ a[] s;
        public final int o;

        static {
            a a8;
            a a9;
            p = a9 = new a(1);
            q = a8 = new a(2);
            s = new a[]{a9, a8};
            r = new m2();
        }

        public a(int n9) {
            this.o = n9;
        }

        public static a c(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return null;
                }
                return q;
            }
            return p;
        }

        public static g4 e() {
            return l2.a;
        }

        public static a[] values() {
            return (a[])s.clone();
        }

        @Override
        public final int a() {
            return this.o;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(a.class.getName());
            stringBuilder.append('@');
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            stringBuilder.append(" number=");
            stringBuilder.append(this.o);
            stringBuilder.append(" name=");
            stringBuilder.append(this.name());
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends Y3.b
    implements K4 {
        public b() {
            super(zzc);
        }

        public /* synthetic */ b(T1 t12) {
            this();
        }

        public final b w(Z1.a a8) {
            this.s();
            ((e2)this.p).H((Z1)((Y3)a8.p()));
            return this;
        }
    }

}

