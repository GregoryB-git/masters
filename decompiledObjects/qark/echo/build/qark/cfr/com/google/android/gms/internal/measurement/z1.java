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
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.v1;

public final class z1
extends Y3
implements K4 {
    private static final z1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        z1 z12;
        zzc = z12 = new z1();
        Y3.t(z1.class, z12);
    }

    public static z1 I() {
        return zzc;
    }

    public final b G() {
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
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
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
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 8) != 0) {
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
            p = b10 = new b(0);
            q = b9 = new b(1);
            r = b12 = new b(2);
            s = b11 = new b(3);
            t = b8 = new b(4);
            v = new b[]{b10, b9, b12, b11, b8};
            u = new C1();
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
            return D1.a;
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

