/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.List
 */
package R;

import R.e;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import java.util.List;

public final class g
extends w
implements P {
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.b strings_ = w.t();

    static {
        g g8;
        DEFAULT_INSTANCE = g8 = new g();
        w.F(g.class, g8);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a)DEFAULT_INSTANCE.p();
    }

    public final void J(Iterable iterable) {
        this.K();
        androidx.datastore.preferences.protobuf.a.e(iterable, this.strings_);
    }

    public final void K() {
        if (!this.strings_.p()) {
            this.strings_ = w.A(this.strings_);
        }
    }

    public List M() {
        return this.strings_;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object s(w.d var1_1, Object var2_3, Object var3_4) {
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
    extends w.a
    implements P {
        public a() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(e e8) {
            this();
        }

        public a A(Iterable iterable) {
            this.v();
            ((g)this.p).J(iterable);
            return this;
        }
    }

}

