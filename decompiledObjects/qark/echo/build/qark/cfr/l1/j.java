/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package l1;

import X2.v;
import android.util.SparseArray;
import d0.q;
import g0.d;
import g0.z;
import java.util.ArrayList;
import java.util.List;
import l1.F;
import l1.K;
import l1.M;

public final class j
implements K.c {
    public final int a;
    public final List b;

    public j(int n8) {
        this(n8, v.Y());
    }

    public j(int n8, List list) {
        this.a = n8;
        this.b = list;
    }

    @Override
    public SparseArray a() {
        return new SparseArray();
    }

    /*
     * Exception decompiling
     */
    @Override
    public K b(int var1_1, K.b var2_2) {
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

    public final F c(K.b b8) {
        return new F(this.e(b8));
    }

    public final M d(K.b b8) {
        return new M(this.e(b8));
    }

    public final List e(K.b object) {
        if (this.f(32)) {
            return this.b;
        }
        z z8 = new z(object.e);
        object = this.b;
        while (z8.a() > 0) {
            int n8 = z8.G();
            int n9 = z8.G();
            int n10 = z8.f();
            if (n8 == 134) {
                ArrayList arrayList = new ArrayList();
                int n11 = z8.G();
                n8 = 0;
                do {
                    List list;
                    object = arrayList;
                    if (n8 >= (n11 & 31)) break;
                    String string2 = z8.D(3);
                    int n12 = z8.G();
                    boolean bl = true;
                    boolean bl2 = (n12 & 128) != 0;
                    if (bl2) {
                        n12 &= 63;
                        object = "application/cea-708";
                    } else {
                        object = "application/cea-608";
                        n12 = 1;
                    }
                    byte by = (byte)z8.G();
                    z8.U(1);
                    if (bl2) {
                        if ((by & 64) == 0) {
                            bl = false;
                        }
                        list = d.b(bl);
                    } else {
                        list = null;
                    }
                    arrayList.add((Object)new q.b().o0((String)object).e0(string2).L(n12).b0(list).K());
                    ++n8;
                } while (true);
            }
            z8.T(n10 + n9);
        }
        return object;
    }

    public final boolean f(int n8) {
        if ((n8 & this.a) != 0) {
            return true;
        }
        return false;
    }
}

