/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package B0;

import B0.a;
import B0.b;
import g0.M;
import java.util.Arrays;

public final class h
implements b {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public a[] g;

    public h(boolean bl, int n8) {
        this(bl, n8, 0);
    }

    public h(boolean bl, int n8, int n9) {
        boolean bl2 = true;
        boolean bl3 = n8 > 0;
        g0.a.a(bl3);
        bl3 = n9 >= 0 ? bl2 : false;
        g0.a.a(bl3);
        this.a = bl;
        this.b = n8;
        this.f = n9;
        this.g = new a[n9 + 100];
        if (n9 > 0) {
            this.c = new byte[n9 * n8];
            for (int i8 = 0; i8 < n9; ++i8) {
                this.g[i8] = new a(this.c, i8 * n8);
            }
        } else {
            this.c = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        synchronized (this) {
            Throwable throwable2;
            int n8;
            block11 : {
                int n9;
                int n10;
                int n11;
                block10 : {
                    n8 = M.k(this.d, this.b);
                    n9 = this.e;
                    n10 = 0;
                    n11 = Math.max((int)0, (int)(n8 - n9));
                    n9 = this.f;
                    if (n11 < n9) break block10;
                    return;
                }
                n8 = n11;
                if (this.c == null) break block11;
                --n9;
                n8 = n10;
                while (n8 <= n9) {
                    a a8;
                    a a9;
                    block13 : {
                        block12 : {
                            a8 = (a)g0.a.e(this.g[n8]);
                            if (a8.a != this.c) break block12;
                            ++n8;
                            continue;
                        }
                        a9 = (a)g0.a.e(this.g[n9]);
                        if (a9.a == this.c) break block13;
                        --n9;
                        continue;
                    }
                    a[] arra = this.g;
                    arra[n8] = a9;
                    arra[n9] = a8;
                    --n9;
                    ++n8;
                }
                try {
                    n9 = Math.max((int)n11, (int)n8);
                    n11 = this.f;
                    n8 = n9;
                    if (n9 < n11) break block11;
                }
                catch (Throwable throwable2) {}
                return;
            }
            Arrays.fill((Object[])this.g, (int)n8, (int)this.f, (Object)null);
            this.f = n8;
            return;
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b(b.a var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[WHILELOOP]], but top level block is 0[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
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
    public void c(a a8) {
        synchronized (this) {
            a[] arra = this.g;
            int n8 = this.f;
            this.f = n8 + 1;
            arra[n8] = a8;
            --this.e;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public a d() {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block5 : {
                try {
                    ++this.e;
                    int n8 = this.f;
                    if (n8 > 0) {
                        object = this.g;
                        this.f = --n8;
                        object = (a)g0.a.e(object[n8]);
                        this.g[this.f] = null;
                        break block5;
                    }
                    a a8 = new a(new byte[this.b], 0);
                    n8 = this.e;
                    Object[] arrobject = this.g;
                    object = a8;
                    if (n8 <= arrobject.length) return object;
                    this.g = (a[])Arrays.copyOf((Object[])arrobject, (int)(arrobject.length * 2));
                    return a8;
                }
                catch (Throwable throwable2) {}
            }
            return object;
            throw throwable2;
        }
    }

    @Override
    public int e() {
        return this.b;
    }

    public int f() {
        synchronized (this) {
            int n8 = this.e;
            int n9 = this.b;
            return n8 * n9;
        }
    }

    public void g() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (!this.a) break block3;
                        this.h(0);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        boolean bl = n8 < this.d;
                        this.d = n8;
                        if (!bl) break block3;
                        this.a();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

