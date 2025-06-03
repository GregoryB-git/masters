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
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import p3.h;

public final class f
extends x
implements P {
    private static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.p;
    private h params_;
    private int version_;

    static {
        f f8;
        DEFAULT_INSTANCE = f8 = new f();
        x.Q(f.class, f8);
    }

    public static f Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static f d0(com.google.crypto.tink.shaded.protobuf.h h8, p p8) {
        return (f)x.K(DEFAULT_INSTANCE, h8, p8);
    }

    private void e0(com.google.crypto.tink.shaded.protobuf.h h8) {
        h8.getClass();
        this.keyValue_ = h8;
    }

    private void g0(int n8) {
        this.version_ = n8;
    }

    public com.google.crypto.tink.shaded.protobuf.h Z() {
        return this.keyValue_;
    }

    public h a0() {
        h h8;
        h h9 = h8 = this.params_;
        if (h8 == null) {
            h9 = h.W();
        }
        return h9;
    }

    public int b0() {
        return this.version_;
    }

    public final void f0(h h8) {
        h8.getClass();
        this.params_ = h8;
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
            ((f)this.p).g0(n8);
            return this;
        }

        public b y(com.google.crypto.tink.shaded.protobuf.h h8) {
            this.s();
            ((f)this.p).e0(h8);
            return this;
        }

        public b z(h h8) {
            this.s();
            ((f)this.p).f0(h8);
            return this;
        }
    }

}

