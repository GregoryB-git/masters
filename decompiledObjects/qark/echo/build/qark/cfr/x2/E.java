/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.util.concurrent.Callable
 */
package x2;

import A2.P;
import A2.n;
import E2.j;
import H2.a;
import H2.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import x2.A;
import x2.C;
import x2.J;
import x2.L;
import x2.M;
import x2.O;
import x2.v;
import x2.w;
import x2.x;
import x2.y;
import x2.z;

public abstract class E {
    public static final C a = new w(A.v("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
    public static final C b = new x(A.v("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"));
    public static final C c = new y(A.v("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
    public static final C d = new z(A.v("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"));
    public static volatile P e;
    public static final Object f;
    public static Context g;

    static {
        f = new Object();
    }

    public static O a(String object, A a8, boolean bl, boolean bl2) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            object = E.f((String)object, a8, bl, bl2);
            return object;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public static O b(String string2, boolean bl, boolean bl2, boolean bl3) {
        return E.g(string2, bl, false, false, true);
    }

    public static /* synthetic */ String c(boolean bl, String string2, A a8) {
        String string3 = !bl && E.f((String)string2, (A)a8, (boolean)true, (boolean)false).a ? "debug cert rejected" : "not allowed";
        MessageDigest messageDigest = E2.a.b("SHA-256");
        n.i((Object)messageDigest);
        return String.format((String)"%s: pkg=%s, sha256=%s, atk=%s, ver=%s", (Object[])new Object[]{string3, string2, j.a(messageDigest.digest(a8.Z0())), bl, "12451000.false"});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(Context context) {
        synchronized (E.class) {
            Throwable throwable2;
            block7 : {
                block6 : {
                    block4 : {
                        block5 : {
                            try {
                                if (g != null) break block4;
                                if (context == null) break block5;
                                g = context.getApplicationContext();
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        return;
                    }
                    Log.w((String)"GoogleCertificates", (String)"GoogleCertificates has been initialized already");
                    break block6;
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean e() {
        StrictMode.ThreadPolicy threadPolicy;
        Throwable throwable2;
        block5 : {
            boolean bl;
            threadPolicy = StrictMode.allowThreadDiskReads();
            try {
                E.h();
                bl = e.h();
            }
            catch (Throwable throwable2) {
                break block5;
            }
            catch (RemoteException remoteException) {
            }
            catch (DynamiteModule.a a8) {
                // empty catch block
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return bl;
            {
                void var1_5;
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)var1_5);
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return false;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    public static O f(String string2, A a8, boolean bl, boolean bl2) {
        block4 : {
            try {
                E.h();
            }
            catch (DynamiteModule.a a9) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)a9);
                return O.d("module init: ".concat(String.valueOf((Object)a9.getMessage())), (Throwable)a9);
            }
            n.i((Object)g);
            J j8 = new J(string2, a8, bl, bl2);
            try {
                bl2 = e.e0(j8, b.Z0((Object)g.getPackageManager()));
                if (!bl2) break block4;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
                return O.d("module call", (Throwable)remoteException);
            }
            return O.b();
        }
        return new M(new v(bl, string2, a8), null);
    }

    /*
     * Exception decompiling
     */
    public static O g(String var0, boolean var1_4, boolean var2_5, boolean var3_6, boolean var4_7) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[SIMPLE_IF_TAKEN]], but top level block is 2[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h() {
        if (e != null) {
            return;
        }
        n.i((Object)g);
        Object object = f;
        synchronized (object) {
            try {
                if (e == null) {
                    e = A2.O.o(DynamiteModule.d(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

