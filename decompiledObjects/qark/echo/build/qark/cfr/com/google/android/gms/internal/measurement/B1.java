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

import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.G1;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.T4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.v1;
import java.util.List;

public final class B1
extends Y3
implements K4 {
    private static final B1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private h4 zzi = Y3.B();

    static {
        B1 b12;
        zzc = b12 = new B1();
        Y3.t(B1.class, b12);
    }

    public static B1 I() {
        return zzc;
    }

    public final a G() {
        a a8;
        a a9 = a8 = a.c(this.zzf);
        if (a8 == null) {
            a9 = a.p;
        }
        return a9;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.zzi.size();
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
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* enum */ a t;
        public static final /* enum */ a u;
        public static final /* enum */ a v;
        public static final d4 w;
        public static final /* synthetic */ a[] x;
        public final int o;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            p = a12 = new a(0);
            q = a9 = new a(1);
            r = a14 = new a(2);
            s = a11 = new a(3);
            t = a8 = new a(4);
            u = a10 = new a(5);
            v = a13 = new a(6);
            x = new a[]{a12, a9, a14, a11, a8, a10, a13};
            w = new G1();
        }

        public a(int n9) {
            this.o = n9;
        }

        public static a c(int n8) {
            switch (n8) {
                default: {
                    return null;
                }
                case 6: {
                    return v;
                }
                case 5: {
                    return u;
                }
                case 4: {
                    return t;
                }
                case 3: {
                    return s;
                }
                case 2: {
                    return r;
                }
                case 1: {
                    return q;
                }
                case 0: 
            }
            return p;
        }

        public static g4 e() {
            return E1.a;
        }

        public static a[] values() {
            return (a[])x.clone();
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

        public /* synthetic */ b(v1 v12) {
            this();
        }
    }

}

