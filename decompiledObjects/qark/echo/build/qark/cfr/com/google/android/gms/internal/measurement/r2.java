/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.n2;
import com.google.android.gms.internal.measurement.s2;
import com.google.android.gms.internal.measurement.u2;
import java.util.List;

public final class r2
extends Y3
implements K4 {
    private static final r2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private h4 zzg = Y3.B();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        r2 r22;
        zzc = r22 = new r2();
        Y3.t(r2.class, r22);
    }

    public final double G() {
        return this.zzk;
    }

    public final b H() {
        b b8;
        b b9 = b8 = b.c(this.zzf);
        if (b8 == null) {
            b9 = b.p;
        }
        return b9;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 4) != 0) {
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

        public /* synthetic */ a(n2 n22) {
            this();
        }
    }

    public static final class b
    extends Enum
    implements e4 {
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* enum */ b s;
        public static final /* enum */ b t;
        public static final d4 u;
        public static final /* synthetic */ b[] v;
        public final int o;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            p = b11 = new b(0);
            q = b12 = new b(1);
            r = b9 = new b(2);
            s = b8 = new b(3);
            t = b10 = new b(4);
            v = new b[]{b11, b12, b9, b8, b10};
            u = new s2();
        }

        public b(int n9) {
            this.o = n9;
        }

        public static b c(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                return null;
                            }
                            return t;
                        }
                        return s;
                    }
                    return r;
                }
                return q;
            }
            return p;
        }

        public static g4 e() {
            return u2.a;
        }

        public static b[] values() {
            return (b[])v.clone();
        }

        @Override
        public final int a() {
            return this.o;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(b.class.getName());
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

}

