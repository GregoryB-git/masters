/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R;

import R.e;
import R.g;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w;

public final class h
extends w
implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        h h8;
        DEFAULT_INSTANCE = h8 = new h();
        w.F(h.class, h8);
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a)DEFAULT_INSTANCE.p();
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return (Boolean)this.value_;
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return (Double)this.value_;
        }
        return 0.0;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float)this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return (Integer)this.value_;
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return (Long)this.value_;
        }
        return 0L;
    }

    public String V() {
        if (this.valueCase_ == 5) {
            return (String)this.value_;
        }
        return "";
    }

    public g W() {
        if (this.valueCase_ == 6) {
            return (g)this.value_;
        }
        return g.L();
    }

    public b X() {
        return b.c(this.valueCase_);
    }

    public final void Z(boolean bl) {
        this.valueCase_ = 1;
        this.value_ = bl;
    }

    public final void a0(double d8) {
        this.valueCase_ = 7;
        this.value_ = d8;
    }

    public final void b0(float f8) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf((float)f8);
    }

    public final void c0(int n8) {
        this.valueCase_ = 3;
        this.value_ = n8;
    }

    public final void d0(long l8) {
        this.valueCase_ = 4;
        this.value_ = l8;
    }

    public final void e0(String string2) {
        string2.getClass();
        this.valueCase_ = 5;
        this.value_ = string2;
    }

    public final void f0(g.a a8) {
        this.value_ = a8.s();
        this.valueCase_ = 6;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object s(w.d var1_1, Object var2_3, Object var3_4) {
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

    public static final class a
    extends w.a
    implements P {
        public a() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(e e8) {
            this();
        }

        public a A(boolean bl) {
            this.v();
            ((h)this.p).Z(bl);
            return this;
        }

        public a B(double d8) {
            this.v();
            ((h)this.p).a0(d8);
            return this;
        }

        public a C(float f8) {
            this.v();
            ((h)this.p).b0(f8);
            return this;
        }

        public a D(int n8) {
            this.v();
            ((h)this.p).c0(n8);
            return this;
        }

        public a E(long l8) {
            this.v();
            ((h)this.p).d0(l8);
            return this;
        }

        public a F(String string2) {
            this.v();
            ((h)this.p).e0(string2);
            return this;
        }

        public a G(g.a a8) {
            this.v();
            ((h)this.p).f0(a8);
            return this;
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* enum */ b s;
        public static final /* enum */ b t;
        public static final /* enum */ b u;
        public static final /* enum */ b v;
        public static final /* enum */ b w;
        public static final /* synthetic */ b[] x;
        public final int o;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            p = b11 = new b(1);
            q = b15 = new b(2);
            r = b9 = new b(3);
            s = b12 = new b(4);
            t = b13 = new b(5);
            u = b10 = new b(6);
            v = b8 = new b(7);
            w = b14 = new b(0);
            x = new b[]{b11, b15, b9, b12, b13, b10, b8, b14};
        }

        public b(int n9) {
            this.o = n9;
        }

        public static b c(int n8) {
            switch (n8) {
                default: {
                    return null;
                }
                case 7: {
                    return v;
                }
                case 6: {
                    return u;
                }
                case 5: {
                    return t;
                }
                case 4: {
                    return s;
                }
                case 3: {
                    return r;
                }
                case 2: {
                    return q;
                }
                case 1: {
                    return p;
                }
                case 0: 
            }
            return w;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])x.clone();
        }
    }

}

