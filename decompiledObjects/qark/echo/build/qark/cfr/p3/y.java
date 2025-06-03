/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package p3;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;

public final class y
extends x
implements P {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile X PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private h value_ = h.p;

    static {
        y y8;
        DEFAULT_INSTANCE = y8 = new y();
        x.Q(y.class, y8);
    }

    public static y Y() {
        return DEFAULT_INSTANCE;
    }

    public static b c0() {
        return (b)DEFAULT_INSTANCE.q();
    }

    public c Z() {
        c c8;
        c c9 = c8 = c.c(this.keyMaterialType_);
        if (c8 == null) {
            c9 = c.u;
        }
        return c9;
    }

    public String a0() {
        return this.typeUrl_;
    }

    public h b0() {
        return this.value_;
    }

    public final void d0(c c8) {
        this.keyMaterialType_ = c8.g();
    }

    public final void e0(String string2) {
        string2.getClass();
        this.typeUrl_ = string2;
    }

    public final void f0(h h8) {
        h8.getClass();
        this.value_ = h8;
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

        public b A(h h8) {
            this.s();
            ((y)this.p).f0(h8);
            return this;
        }

        public b y(c c8) {
            this.s();
            ((y)this.p).d0(c8);
            return this;
        }

        public b z(String string2) {
            this.s();
            ((y)this.p).e0(string2);
            return this;
        }
    }

    public static final class c
    extends Enum
    implements z.a {
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* enum */ c r;
        public static final /* enum */ c s;
        public static final /* enum */ c t;
        public static final /* enum */ c u;
        public static final z.b v;
        public static final /* synthetic */ c[] w;
        public final int o;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            p = c13 = new c(0);
            q = c11 = new c(1);
            r = c9 = new c(2);
            s = c8 = new c(3);
            t = c10 = new c(4);
            u = c12 = new c(-1);
            w = new c[]{c13, c11, c9, c8, c10, c12};
            v = new z.b(){};
        }

        public c(int n9) {
            this.o = n9;
        }

        public static c c(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                return null;
                            }
                            return t;
                        }
                        return s;
                    }
                    return r;
                }
                return q;
            }
            return p;
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])w.clone();
        }

        public final int g() {
            if (this != u) {
                return this.o;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

    }

}

