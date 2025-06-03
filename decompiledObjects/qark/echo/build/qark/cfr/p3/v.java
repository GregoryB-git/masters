/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import p3.x;

public final class v
extends com.google.crypto.tink.shaded.protobuf.x
implements P {
    private static final v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.p;
    private x params_;
    private int version_;

    static {
        v v8;
        DEFAULT_INSTANCE = v8 = new v();
        com.google.crypto.tink.shaded.protobuf.x.Q(v.class, v8);
    }

    public static v Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static v d0(h h8, p p8) {
        return (v)com.google.crypto.tink.shaded.protobuf.x.K(DEFAULT_INSTANCE, h8, p8);
    }

    private void e0(h h8) {
        h8.getClass();
        this.keyValue_ = h8;
    }

    private void g0(int n8) {
        this.version_ = n8;
    }

    public h Z() {
        return this.keyValue_;
    }

    public x a0() {
        x x8;
        x x9 = x8 = this.params_;
        if (x8 == null) {
            x9 = x.X();
        }
        return x9;
    }

    public int b0() {
        return this.version_;
    }

    public final void f0(x x8) {
        x8.getClass();
        this.params_ = x8;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object t(x.d var1_1, Object var2_3, Object var3_4) {
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

    public static final class b
    extends x.a
    implements P {
        public b() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public b A(int n8) {
            this.s();
            ((v)this.p).g0(n8);
            return this;
        }

        public b y(h h8) {
            this.s();
            ((v)this.p).e0(h8);
            return this;
        }

        public b z(x x8) {
            this.s();
            ((v)this.p).f0(x8);
            return this;
        }
    }

}

