/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.math.RoundingMode
 */
package m0;

import Z2.d;
import a3.f;
import g0.M;
import java.math.RoundingMode;
import m0.N;

public class a0
implements N.e {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public a0(a a8) {
        this.b = a8.a;
        this.c = a8.b;
        this.d = a8.c;
        this.e = a8.d;
        this.f = a8.e;
        this.g = a8.f;
        this.h = a8.g;
    }

    public static int b(int n8, int n9, int n10) {
        return f.d((long)n8 * (long)n9 * (long)n10 / 1000000L);
    }

    /*
     * Exception decompiling
     */
    public static int d(int var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
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

    @Override
    public int a(int n8, int n9, int n10, int n11, int n12, int n13, double d8) {
        return (Math.max((int)n8, (int)((int)((double)this.c(n8, n9, n10, n11, n12, n13) * d8))) + n11 - 1) / n11 * n11;
    }

    public int c(int n8, int n9, int n10, int n11, int n12, int n13) {
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 == 2) {
                    return this.f(n9, n13);
                }
                throw new IllegalArgumentException();
            }
            return this.e(n9);
        }
        return this.g(n8, n12, n11);
    }

    public int e(int n8) {
        n8 = a0.d(n8);
        return f.d((long)this.f * (long)n8 / 1000000L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int f(int n8, int n9) {
        int n10;
        block6 : {
            int n11;
            block5 : {
                block4 : {
                    n11 = this.e;
                    if (n8 != 5) break block4;
                    n10 = this.g;
                    break block5;
                }
                n10 = n11;
                if (n8 != 8) break block6;
                n10 = this.h;
            }
            n10 = n11 * n10;
        }
        if (n9 != -1) {
            n8 = d.b(n9, 8, RoundingMode.CEILING);
            return f.d((long)n10 * (long)n8 / 1000000L);
        }
        n8 = a0.d(n8);
        return f.d((long)n10 * (long)n8 / 1000000L);
    }

    public int g(int n8, int n9, int n10) {
        return M.p(n8 * this.d, a0.b(this.b, n9, n10), a0.b(this.c, n9, n10));
    }

    public static class a {
        public int a = 250000;
        public int b = 750000;
        public int c = 4;
        public int d = 250000;
        public int e = 50000000;
        public int f = 2;
        public int g = 4;

        public a0 h() {
            return new a0(this);
        }
    }

}

