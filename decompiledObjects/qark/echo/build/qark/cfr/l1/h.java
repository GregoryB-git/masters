/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package l1;

import F0.L;
import F0.M;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import g0.a;
import g0.y;
import g0.z;
import java.util.List;
import l1.K;
import l1.g;
import l1.i;

public final class h
implements r {
    public static final x m = new g();
    public final int a;
    public final i b;
    public final z c;
    public final z d;
    public final y e;
    public t f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public h() {
        this(0);
    }

    public h(int n8) {
        z z8;
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.a = n9;
        this.b = new i(true);
        this.c = new z(2048);
        this.i = -1;
        this.h = -1L;
        this.d = z8 = new z(10);
        this.e = new y(z8.e());
    }

    public static /* synthetic */ r[] c() {
        return h.k();
    }

    private static int h(int n8, long l8) {
        return (int)((long)n8 * 8000000L / l8);
    }

    private M j(long l8, boolean bl) {
        int n8 = h.h(this.i, this.b.k());
        return new F0.i(l8, this.h, n8, this.i, bl);
    }

    private static /* synthetic */ r[] k() {
        return new r[]{new h()};
    }

    @Override
    public void a(long l8, long l9) {
        this.k = false;
        this.b.b();
        this.g = l9;
    }

    @Override
    public void b(t t8) {
        this.f = t8;
        this.b.e(t8, new K.d(0, 1));
        t8.j();
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(s var1_1) {
        var3_3 = var6_2 = this.m(var1_1);
        var2_5 = var4_4 = 0;
        var5_6 = var4_4;
        do {
            var1_1.n(this.d.e(), 0, 2);
            this.d.T(0);
            if (!i.m(this.d.M())) ** GOTO lbl-1000
            if (++var5_6 >= 4 && var2_5 > 188) {
                return true;
            }
            var1_1.n(this.d.e(), 0, 4);
            this.e.p(14);
            var4_4 = this.e.h(13);
            if (var4_4 <= 6) lbl-1000: // 2 sources:
            {
                var4_4 = var3_3 + 1;
                var1_1.h();
                var1_1.o(var4_4);
                var2_5 = var3_3 = 0;
            } else {
                var1_1.o(var4_4 - 6);
                var2_5 += var4_4;
                var4_4 = var3_3;
                var3_3 = var5_6;
            }
            var5_6 = var3_3;
            var3_3 = var4_4;
        } while (var4_4 - var6_2 < 8192);
        return false;
    }

    /*
     * Exception decompiling
     */
    public final void f(s var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 1[TRYBLOCK]
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
    public /* synthetic */ List g() {
        return q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        a.h(this.f);
        long l9 = s8.a();
        int n8 = this.a;
        if ((n8 & 2) != 0 || (n8 & 1) != 0 && l9 != -1L) {
            this.f(s8);
        }
        boolean bl = (n8 = s8.read(this.c.e(), 0, 2048)) == -1;
        this.l(l9, bl);
        if (bl) {
            return -1;
        }
        this.c.T(0);
        this.c.S(n8);
        if (!this.k) {
            this.b.d(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }

    public final void l(long l8, boolean bl) {
        if (this.l) {
            return;
        }
        int n8 = this.a;
        boolean bl2 = false;
        n8 = (n8 & 1) != 0 && this.i > 0 ? 1 : 0;
        if (n8 != 0 && this.b.k() == -9223372036854775807L && !bl) {
            return;
        }
        if (n8 != 0 && this.b.k() != -9223372036854775807L) {
            t t8 = this.f;
            bl = bl2;
            if ((this.a & 2) != 0) {
                bl = true;
            }
            t8.e(this.j(l8, bl));
        } else {
            this.f.e(new M.b(-9223372036854775807L));
        }
        this.l = true;
    }

    public final int m(s s8) {
        int n8 = 0;
        do {
            s8.n(this.d.e(), 0, 10);
            this.d.T(0);
            if (this.d.J() != 4801587) {
                s8.h();
                s8.o(n8);
                if (this.h == -1L) {
                    this.h = n8;
                }
                return n8;
            }
            this.d.U(3);
            int n9 = this.d.F();
            n8 += n9 + 10;
            s8.o(n9);
        } while (true);
    }

    @Override
    public void release() {
    }
}

