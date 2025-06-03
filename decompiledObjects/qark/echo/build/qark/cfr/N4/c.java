/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package N4;

import N4.a;
import N4.d;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import java.util.Map;

public final class c
extends r
implements L {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private E customAttributes_ = E.f();
    private String googleAppId_ = "";

    static {
        c c8;
        DEFAULT_INSTANCE = c8 = new c();
        r.Q(c.class, c8);
    }

    public static c a0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return (b)DEFAULT_INSTANCE.u();
    }

    public a Z() {
        a a8;
        a a9 = a8 = this.androidAppInfo_;
        if (a8 == null) {
            a9 = a.X();
        }
        return a9;
    }

    public final Map b0() {
        return this.g0();
    }

    public boolean c0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean d0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean e0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean f0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final E g0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public final void i0(a a8) {
        a8.getClass();
        this.androidAppInfo_ = a8;
        this.bitField0_ |= 4;
    }

    public final void j0(String string2) {
        string2.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = string2;
    }

    public final void k0(d d8) {
        this.applicationProcessState_ = d8.g();
        this.bitField0_ |= 8;
    }

    public final void l0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = string2;
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

        public boolean D() {
            return ((c)this.p).d0();
        }

        public b E(Map map) {
            this.y();
            ((c)this.p).b0().putAll(map);
            return this;
        }

        public b F(a.b b8) {
            this.y();
            ((c)this.p).i0((a)b8.v());
            return this;
        }

        public b G(String string2) {
            this.y();
            ((c)this.p).j0(string2);
            return this;
        }

        public b H(d d8) {
            this.y();
            ((c)this.p).k0(d8);
            return this;
        }

        public b I(String string2) {
            this.y();
            ((c)this.p).l0(string2);
            return this;
        }
    }

    public static final abstract class c {
        public static final D a;

        static {
            m0.b b8 = m0.b.y;
            a = D.d(b8, "", b8, "");
        }
    }

}

