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
import p3.f;
import p3.v;

public final class d
extends x
implements P {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    static {
        d d8;
        DEFAULT_INSTANCE = d8 = new d();
        x.Q(d.class, d8);
    }

    public static b b0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static d c0(h h8, p p8) {
        return (d)x.K(DEFAULT_INSTANCE, h8, p8);
    }

    private void f0(int n8) {
        this.version_ = n8;
    }

    public f Y() {
        f f8;
        f f9 = f8 = this.aesCtrKey_;
        if (f8 == null) {
            f9 = f.Y();
        }
        return f9;
    }

    public v Z() {
        v v8;
        v v9 = v8 = this.hmacKey_;
        if (v8 == null) {
            v9 = v.Y();
        }
        return v9;
    }

    public int a0() {
        return this.version_;
    }

    public final void d0(f f8) {
        f8.getClass();
        this.aesCtrKey_ = f8;
    }

    public final void e0(v v8) {
        v8.getClass();
        this.hmacKey_ = v8;
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
            ((d)this.p).f0(n8);
            return this;
        }

        public b y(f f8) {
            this.s();
            ((d)this.p).d0(f8);
            return this;
        }

        public b z(v v8) {
            this.s();
            ((d)this.p).e0(v8);
            return this;
        }
    }

}

