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
import p3.c;

public final class a
extends x
implements P {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h keyValue_ = h.p;
    private c params_;
    private int version_;

    static {
        a a8;
        DEFAULT_INSTANCE = a8 = new a();
        x.Q(a.class, a8);
    }

    public static b b0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static a c0(h h8, p p8) {
        return (a)x.K(DEFAULT_INSTANCE, h8, p8);
    }

    public h Y() {
        return this.keyValue_;
    }

    public c Z() {
        c c8;
        c c9 = c8 = this.params_;
        if (c8 == null) {
            c9 = c.W();
        }
        return c9;
    }

    public int a0() {
        return this.version_;
    }

    public final void d0(h h8) {
        h8.getClass();
        this.keyValue_ = h8;
    }

    public final void e0(c c8) {
        c8.getClass();
        this.params_ = c8;
    }

    public final void f0(int n8) {
        this.version_ = n8;
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
            ((a)this.p).f0(n8);
            return this;
        }

        public b y(h h8) {
            this.s();
            ((a)this.p).d0(h8);
            return this;
        }

        public b z(c c8) {
            this.s();
            ((a)this.p).e0(c8);
            return this;
        }
    }

}

