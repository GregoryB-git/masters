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
import p3.F;

public final class E
extends x
implements P {
    private static final E DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private F params_;
    private int version_;

    static {
        E e8;
        DEFAULT_INSTANCE = e8 = new E();
        x.Q(E.class, e8);
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static E a0(h h8, p p8) {
        return (E)x.K(DEFAULT_INSTANCE, h8, p8);
    }

    private void c0(int n8) {
        this.version_ = n8;
    }

    public F X() {
        F f8;
        F f9 = f8 = this.params_;
        if (f8 == null) {
            f9 = F.V();
        }
        return f9;
    }

    public int Y() {
        return this.version_;
    }

    public final void b0(F f8) {
        f8.getClass();
        this.params_ = f8;
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

        public b y(F f8) {
            this.s();
            ((E)this.p).b0(f8);
            return this;
        }

        public b z(int n8) {
            this.s();
            ((E)this.p).c0(n8);
            return this;
        }
    }

}

