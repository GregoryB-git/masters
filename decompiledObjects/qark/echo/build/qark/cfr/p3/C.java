/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p3.I;
import p3.y;
import p3.z;

public final class C
extends x
implements P {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d key_ = x.u();
    private int primaryKeyId_;

    static {
        C c8;
        DEFAULT_INSTANCE = c8 = new C();
        x.Q(C.class, c8);
    }

    public static b d0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static C e0(InputStream inputStream, p p8) {
        return (C)x.L(DEFAULT_INSTANCE, inputStream, p8);
    }

    public static C f0(byte[] arrby, p p8) {
        return (C)x.M(DEFAULT_INSTANCE, arrby, p8);
    }

    public final void X(c c8) {
        c8.getClass();
        this.Y();
        this.key_.add((Object)c8);
    }

    public final void Y() {
        z.d d8 = this.key_;
        if (!d8.p()) {
            this.key_ = x.G(d8);
        }
    }

    public c Z(int n8) {
        return (c)this.key_.get(n8);
    }

    public int a0() {
        return this.key_.size();
    }

    public List b0() {
        return this.key_;
    }

    public int c0() {
        return this.primaryKeyId_;
    }

    public final void g0(int n8) {
        this.primaryKeyId_ = n8;
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

        public int A() {
            return ((C)this.p).a0();
        }

        public List B() {
            return Collections.unmodifiableList((List)((C)this.p).b0());
        }

        public b C(int n8) {
            this.s();
            ((C)this.p).g0(n8);
            return this;
        }

        public b y(c c8) {
            this.s();
            ((C)this.p).X(c8);
            return this;
        }

        public c z(int n8) {
            return ((C)this.p).Z(n8);
        }
    }

    public static final class c
    extends x
    implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        static {
            c c8;
            DEFAULT_INSTANCE = c8 = new c();
            x.Q(c.class, c8);
        }

        public static a e0() {
            return (a)DEFAULT_INSTANCE.q();
        }

        private void h0(I i8) {
            this.outputPrefixType_ = i8.g();
        }

        public y Z() {
            y y8;
            y y9 = y8 = this.keyData_;
            if (y8 == null) {
                y9 = y.Y();
            }
            return y9;
        }

        public int a0() {
            return this.keyId_;
        }

        public I b0() {
            I i8;
            I i9 = i8 = I.c(this.outputPrefixType_);
            if (i8 == null) {
                i9 = I.u;
            }
            return i9;
        }

        public z c0() {
            z z8;
            z z9 = z8 = z.c(this.status_);
            if (z8 == null) {
                z9 = z.t;
            }
            return z9;
        }

        public boolean d0() {
            if (this.keyData_ != null) {
                return true;
            }
            return false;
        }

        public final void f0(y y8) {
            y8.getClass();
            this.keyData_ = y8;
        }

        public final void g0(int n8) {
            this.keyId_ = n8;
        }

        public final void i0(z z8) {
            this.status_ = z8.g();
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

            public a A(I i8) {
                this.s();
                ((c)this.p).h0(i8);
                return this;
            }

            public a B(z z8) {
                this.s();
                ((c)this.p).i0(z8);
                return this;
            }

            public a y(y y8) {
                this.s();
                ((c)this.p).f0(y8);
                return this;
            }

            public a z(int n8) {
                this.s();
                ((c)this.p).g0(n8);
                return this;
            }
        }

    }

}

