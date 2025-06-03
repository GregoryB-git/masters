/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;
import p3.I;
import p3.z;

public final class D
extends x
implements P {
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d keyInfo_ = x.u();
    private int primaryKeyId_;

    static {
        D d8;
        DEFAULT_INSTANCE = d8 = new D();
        x.Q(D.class, d8);
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    private void b0(int n8) {
        this.primaryKeyId_ = n8;
    }

    public final void X(c c8) {
        c8.getClass();
        this.Y();
        this.keyInfo_.add((Object)c8);
    }

    public final void Y() {
        z.d d8 = this.keyInfo_;
        if (!d8.p()) {
            this.keyInfo_ = x.G(d8);
        }
    }

    public c Z(int n8) {
        return (c)this.keyInfo_.get(n8);
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

        public b y(c c8) {
            this.s();
            ((D)this.p).X(c8);
            return this;
        }

        public b z(int n8) {
            this.s();
            ((D)this.p).b0(n8);
            return this;
        }
    }

    public static final class c
    extends x
    implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        static {
            c c8;
            DEFAULT_INSTANCE = c8 = new c();
            x.Q(c.class, c8);
        }

        public static a a0() {
            return (a)DEFAULT_INSTANCE.q();
        }

        private void b0(int n8) {
            this.keyId_ = n8;
        }

        private void c0(I i8) {
            this.outputPrefixType_ = i8.g();
        }

        private void d0(z z8) {
            this.status_ = z8.g();
        }

        private void e0(String string2) {
            string2.getClass();
            this.typeUrl_ = string2;
        }

        public int Z() {
            return this.keyId_;
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
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public static final class a
        extends x.a
        implements P {
            public a() {
                super(DEFAULT_INSTANCE);
            }

            public /* synthetic */ a( a8) {
                this();
            }

            public a A(z z8) {
                this.s();
                ((c)this.p).d0(z8);
                return this;
            }

            public a B(String string2) {
                this.s();
                ((c)this.p).e0(string2);
                return this;
            }

            public a y(int n8) {
                this.s();
                ((c)this.p).b0(n8);
                return this;
            }

            public a z(I i8) {
                this.s();
                ((c)this.p).c0(i8);
                return this;
            }
        }

    }

}

