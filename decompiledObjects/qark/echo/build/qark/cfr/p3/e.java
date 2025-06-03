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
import p3.g;
import p3.w;

public final class e
extends x
implements P {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    static {
        e e8;
        DEFAULT_INSTANCE = e8 = new e();
        x.Q(e.class, e8);
    }

    public static b Z() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public static e a0(h h8, p p8) {
        return (e)x.K(DEFAULT_INSTANCE, h8, p8);
    }

    public g X() {
        g g8;
        g g9 = g8 = this.aesCtrKeyFormat_;
        if (g8 == null) {
            g9 = g.X();
        }
        return g9;
    }

    public w Y() {
        w w8;
        w w9 = w8 = this.hmacKeyFormat_;
        if (w8 == null) {
            w9 = w.X();
        }
        return w9;
    }

    public final void b0(g g8) {
        g8.getClass();
        this.aesCtrKeyFormat_ = g8;
    }

    public final void c0(w w8) {
        w8.getClass();
        this.hmacKeyFormat_ = w8;
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

        public b y(g g8) {
            this.s();
            ((e)this.p).b0(g8);
            return this;
        }

        public b z(w w8) {
            this.s();
            ((e)this.p).c0(w8);
            return this;
        }
    }

}

