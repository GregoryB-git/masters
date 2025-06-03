/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package N4;

import N4.l;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.t;
import com.google.protobuf.u;

public final class k
extends r
implements L {
    private static final k DEFAULT_INSTANCE;
    private static volatile T PARSER;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final u sessionVerbosity_converter_;
    private int bitField0_;
    private String sessionId_ = "";
    private t.d sessionVerbosity_ = r.y();

    static {
        k k8;
        sessionVerbosity_converter_ = new u(){};
        DEFAULT_INSTANCE = k8 = new k();
        r.Q(k.class, k8);
    }

    public static c a0() {
        return (c)DEFAULT_INSTANCE.u();
    }

    private void b0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = string2;
    }

    public final void W(l l8) {
        l8.getClass();
        this.X();
        this.sessionVerbosity_.z(l8.g());
    }

    public final void X() {
        t.d d8 = this.sessionVerbosity_;
        if (!d8.p()) {
            this.sessionVerbosity_ = r.L(d8);
        }
    }

    public l Y(int n8) {
        l l8;
        l l9 = l8 = l.c(this.sessionVerbosity_.F(n8));
        if (l8 == null) {
            l9 = l.p;
        }
        return l9;
    }

    public int Z() {
        return this.sessionVerbosity_.size();
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object x(r.c var1_1, Object var2_3, Object var3_4) {
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

    public static final class c
    extends r.a
    implements L {
        public c() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public c D(l l8) {
            this.y();
            ((k)this.p).W(l8);
            return this;
        }

        public c E(String string2) {
            this.y();
            ((k)this.p).b0(string2);
            return this;
        }
    }

}

