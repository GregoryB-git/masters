/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package F0;

import F0.k;
import F0.l;
import F0.r;
import F0.x;
import L0.c;
import X2.v;
import Y0.f;
import Z0.h;
import a1.d;
import android.net.Uri;
import c1.t;
import g0.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C;
import l1.J;
import l1.K;
import l1.b;
import l1.e;
import l1.j;

public final class m
implements x {
    public static final int[] r = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a s = new a(new k());
    public static final a t = new a(new l());
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = 1;
    public int l;
    public v m;
    public int n = 112800;
    public boolean o = true;
    public t.a p = new c1.h();
    public int q;

    public static /* synthetic */ Constructor c() {
        return m.f();
    }

    public static /* synthetic */ Constructor d() {
        return m.g();
    }

    public static Constructor f() {
        if (Boolean.TRUE.equals(Class.forName((String)"androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object)null, new Object[0]))) {
            return Class.forName((String)"androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }

    public static Constructor g() {
        return Class.forName((String)"androidx.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor(new Class[0]);
    }

    @Override
    public r[] a() {
        synchronized (this) {
            r[] arrr = this.b(Uri.EMPTY, (Map)new HashMap());
            return arrr;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public r[] b(Uri var1_1, Map var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
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

    /*
     * Enabled aggressive block sorting
     */
    public final void e(int n8, List list) {
        Object object;
        int n9 = 2;
        int n10 = 0;
        switch (n8) {
            default: {
                return;
            }
            case 21: {
                object = new I0.a();
                break;
            }
            case 20: {
                n8 = this.h;
                if ((n8 & 2) != 0 || (n8 & 4) != 0) return;
                {
                    object = new M0.a();
                    break;
                }
            }
            case 19: {
                object = new J0.a();
                break;
            }
            case 18: {
                object = new n1.a();
                break;
            }
            case 17: {
                object = new b1.a();
                break;
            }
            case 16: {
                object = new H0.b(true ^ this.o, this.p);
                break;
            }
            case 15: {
                object = t.a(new Object[0]);
                if (object == null) return;
                {
                    break;
                }
            }
            case 14: {
                object = new N0.a(this.q);
                break;
            }
            case 12: {
                object = new m1.b();
                break;
            }
            case 11: {
                if (this.m == null) {
                    this.m = v.Y();
                }
                object = new J(this.k, this.o ^ true, this.p, new E(0L), new j(this.l, this.m), this.n);
                break;
            }
            case 10: {
                object = new C();
                break;
            }
            case 9: {
                object = new d();
                break;
            }
            case 8: {
                object = this.p;
                n9 = this.i;
                n8 = this.o ? 0 : 32;
                list.add((Object)new h((t.a)object, n9 | n8));
                object = this.p;
                n9 = this.h;
                n8 = this.o ? n10 : 16;
                object = new Z0.m((t.a)object, n9 | n8);
                break;
            }
            case 7: {
                n8 = this.j;
                int n11 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                object = new f(n8 | n11 | n9);
                break;
            }
            case 6: {
                object = this.p;
                n8 = this.g;
                if (this.o) {
                    n9 = 0;
                }
                object = new X0.e((t.a)object, n9 | n8);
                break;
            }
            case 5: {
                object = new c();
                break;
            }
            case 4: {
                object = s.a(this.f);
                if (object != null) break;
                object = new K0.d(this.f);
                break;
            }
            case 3: {
                n8 = this.e;
                int n12 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                object = new G0.b(n8 | n12 | n9);
                break;
            }
            case 2: {
                n8 = this.d;
                int n13 = this.b;
                if (!this.c) {
                    n9 = 0;
                }
                object = new l1.h(n8 | n13 | n9);
                break;
            }
            case 1: {
                object = new e();
                break;
            }
            case 0: {
                object = new b();
            }
        }
        list.add(object);
    }

    public m h(boolean bl) {
        synchronized (this) {
            this.c = bl;
            return this;
        }
    }

    public m i(boolean bl) {
        synchronized (this) {
            this.b = bl;
            return this;
        }
    }

    public m j(int n8) {
        synchronized (this) {
            this.j = n8;
            return this;
        }
    }

    public static final class F0.m$a {
        public final a a;
        public final AtomicBoolean b;
        public Constructor c;

        public F0.m$a(a a8) {
            this.a = a8;
            this.b = new AtomicBoolean(false);
        }

        public /* varargs */ r a(Object ... object) {
            Constructor constructor = this.b();
            if (constructor == null) {
                return null;
            }
            try {
                object = (r)constructor.newInstance((Object[])object);
                return object;
            }
            catch (Exception exception) {
                throw new IllegalStateException("Unexpected error creating extractor", (Throwable)exception);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final Constructor b() {
            AtomicBoolean atomicBoolean = this.b;
            // MONITORENTER : atomicBoolean
            if (this.b.get()) {
                Constructor constructor = this.c;
                // MONITOREXIT : atomicBoolean
                return constructor;
            }
            try {
                Constructor constructor = this.a.a();
                // MONITOREXIT : atomicBoolean
                return constructor;
            }
            catch (Exception exception) {
                throw new RuntimeException("Error instantiating extension", (Throwable)exception);
            }
            catch (ClassNotFoundException classNotFoundException) {}
            this.b.set(true);
            Constructor constructor = this.c;
            // MONITOREXIT : atomicBoolean
            return constructor;
        }

        public static interface a {
            public Constructor a();
        }

    }

}

