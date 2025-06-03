/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Map
 */
package R;

import R.e;
import R.h;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.w;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f
extends w
implements P {
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f();

    static {
        f f8;
        DEFAULT_INSTANCE = f8 = new f();
        w.F(f.class, f8);
    }

    public static a N() {
        return (a)DEFAULT_INSTANCE.p();
    }

    public static f O(InputStream inputStream) {
        return (f)w.D(DEFAULT_INSTANCE, inputStream);
    }

    public final Map J() {
        return this.L();
    }

    public Map K() {
        return Collections.unmodifiableMap((Map)this.M());
    }

    public final I L() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.s();
        }
        return this.preferences_;
    }

    public final I M() {
        return this.preferences_;
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

        public a A(String string2, h h8) {
            string2.getClass();
            h8.getClass();
            this.v();
            ((f)this.p).J().put((Object)string2, (Object)h8);
            return this;
        }
    }

    public static final abstract class b {
        public static final H a = H.d(r0.b.y, "", r0.b.A, h.Q());
    }

}

