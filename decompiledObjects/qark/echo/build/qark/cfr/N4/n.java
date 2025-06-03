/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.t;

public final class n
extends r
implements L {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile T PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        n n8;
        DEFAULT_INSTANCE = n8 = new n();
        r.Q(n.class, n8);
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
    }

    public static final class c
    extends Enum
    implements t.a {
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final t.b r;
        public static final /* synthetic */ c[] s;
        public final int o;

        static {
            c c8;
            c c9;
            p = c9 = new c(0);
            q = c8 = new c(1);
            s = new c[]{c9, c8};
            r = new t.b(){};
        }

        public c(int n9) {
            this.o = n9;
        }

        public static t.c c() {
            return b.a;
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])s.clone();
        }

        @Override
        public final int g() {
            return this.o;
        }

        public static final class b
        implements t.c {
            public static final t.c a = new b();
        }

    }

}

