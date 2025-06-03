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

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class a
extends r
implements L {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        a a8;
        DEFAULT_INSTANCE = a8 = new a();
        r.Q(a.class, a8);
    }

    public static a X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.u();
    }

    public boolean Y() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void b0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = string2;
    }

    public final void c0(String string2) {
        string2.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = string2;
    }

    public final void d0(String string2) {
        string2.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = string2;
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

    public static final class b
    extends r.a
    implements L {
        public b() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public b D(String string2) {
            this.y();
            ((a)this.p).b0(string2);
            return this;
        }

        public b E(String string2) {
            this.y();
            ((a)this.p).c0(string2);
            return this;
        }

        public b F(String string2) {
            this.y();
            ((a)this.p).d0(string2);
            return this;
        }
    }

}

