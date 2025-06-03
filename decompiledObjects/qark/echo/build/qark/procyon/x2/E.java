// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import java.util.concurrent.Callable;
import H2.b;
import com.google.android.gms.dynamite.DynamiteModule;
import android.os.RemoteException;
import android.util.Log;
import java.security.MessageDigest;
import E2.j;
import A2.n;
import E2.a;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.Context;
import A2.P;

public abstract class E
{
    public static final C a;
    public static final C b;
    public static final C c;
    public static final C d;
    public static volatile P e;
    public static final Object f;
    public static Context g;
    
    static {
        a = new w(A.v("0\u0082\u0005\u00c80\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        b = new x(A.v("0\u0082\u0006\u00040\u0082\u0003\u00ec \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        c = new y(A.v("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        d = new z(A.v("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085¸l}\u00d3N\u00f50"));
        f = new Object();
    }
    
    public static O a(final String s, final A a, final boolean b, final boolean b2) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(s, a, b, b2);
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    public static O b(final String s, final boolean b, final boolean b2, final boolean b3) {
        return g(s, b, false, false, true);
    }
    
    public static void d(final Context context) {
        // monitorenter(E.class)
        // monitorexit(E.class)
        // monitorexit(E.class)
        Label_0044: {
            Label_0032: {
                try {
                    if (E.g != null) {
                        break Label_0032;
                    }
                    if (context != null) {
                        E.g = context.getApplicationContext();
                        // monitorexit(E.class)
                        return;
                    }
                }
                finally {
                    break Label_0044;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            return;
        }
    }
    // monitorexit(E.class)
    
    public static boolean e() {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                final boolean h = E.e.h();
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return h;
            }
            finally {}
        }
        catch (RemoteException ex) {}
        catch (DynamiteModule.a a) {}
        final RemoteException ex;
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return false;
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }
    
    public static O f(final String s, final A a, final boolean b, final boolean b2) {
        try {
            h();
            n.i(E.g);
            final J j = new J(s, a, b, b2);
            try {
                if (E.e.e0(j, b.Z0(E.g.getPackageManager()))) {
                    return O.b();
                }
                return new M(new v(b, s, a), null);
            }
            catch (RemoteException ex) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                return O.d("module call", (Throwable)ex);
            }
        }
        catch (DynamiteModule.a a2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)a2);
            return O.d("module init: ".concat(String.valueOf(a2.getMessage())), a2);
        }
    }
    
    public static O g(final String p0, final boolean p1, final boolean p2, final boolean p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          8
        //     5: getstatic       x2/E.g:Landroid/content/Context;
        //     8: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //    11: pop            
        //    12: invokestatic    x2/E.h:()V
        //    15: new             Lx2/F;
        //    18: dup            
        //    19: aload_0        
        //    20: iload_1        
        //    21: iconst_0       
        //    22: getstatic       x2/E.g:Landroid/content/Context;
        //    25: invokestatic    H2/b.Z0:(Ljava/lang/Object;)LH2/a;
        //    28: iconst_0       
        //    29: invokespecial   x2/F.<init>:(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
        //    32: astore_0       
        //    33: iload           4
        //    35: ifeq            51
        //    38: getstatic       x2/E.e:LA2/P;
        //    41: aload_0        
        //    42: invokeinterface A2/P.B0:(Lx2/F;)Lx2/H;
        //    47: astore_0       
        //    48: goto            61
        //    51: getstatic       x2/E.e:LA2/P;
        //    54: aload_0        
        //    55: invokeinterface A2/P.i0:(Lx2/F;)Lx2/H;
        //    60: astore_0       
        //    61: aload_0        
        //    62: invokevirtual   x2/H.d:()Z
        //    65: ifeq            79
        //    68: aload_0        
        //    69: invokevirtual   x2/H.f:()I
        //    72: invokestatic    x2/O.f:(I)Lx2/O;
        //    75: astore_0       
        //    76: goto            174
        //    79: aload_0        
        //    80: invokevirtual   x2/H.a:()Ljava/lang/String;
        //    83: astore          7
        //    85: aload_0        
        //    86: invokevirtual   x2/H.g:()I
        //    89: iconst_4       
        //    90: if_icmpne       196
        //    93: new             Landroid/content/pm/PackageManager$NameNotFoundException;
        //    96: dup            
        //    97: invokespecial   android/content/pm/PackageManager$NameNotFoundException.<init>:()V
        //   100: astore          5
        //   102: goto            199
        //   105: aload_0        
        //   106: invokevirtual   x2/H.f:()I
        //   109: aload_0        
        //   110: invokevirtual   x2/H.g:()I
        //   113: aload           6
        //   115: aload           5
        //   117: invokestatic    x2/O.g:(IILjava/lang/String;Ljava/lang/Throwable;)Lx2/O;
        //   120: astore_0       
        //   121: goto            174
        //   124: ldc             "GoogleCertificates"
        //   126: ldc             "Failed to get Google certificates from remote"
        //   128: aload_0        
        //   129: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   132: pop            
        //   133: ldc             "module call"
        //   135: astore          5
        //   137: aload           5
        //   139: aload_0        
        //   140: invokestatic    x2/O.d:(Ljava/lang/String;Ljava/lang/Throwable;)Lx2/O;
        //   143: astore_0       
        //   144: goto            174
        //   147: astore_0       
        //   148: ldc             "GoogleCertificates"
        //   150: ldc             "Failed to get Google certificates from remote"
        //   152: aload_0        
        //   153: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   156: pop            
        //   157: ldc             "module init: "
        //   159: aload_0        
        //   160: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   163: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   166: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   169: astore          5
        //   171: goto            137
        //   174: aload           8
        //   176: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   179: aload_0        
        //   180: areturn        
        //   181: aload           8
        //   183: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   186: aload_0        
        //   187: athrow         
        //   188: astore_0       
        //   189: goto            181
        //   192: astore_0       
        //   193: goto            124
        //   196: aconst_null    
        //   197: astore          5
        //   199: aload           7
        //   201: astore          6
        //   203: aload           7
        //   205: ifnonnull       105
        //   208: ldc             "error checking package certificate"
        //   210: astore          6
        //   212: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  5      12     188    192    Any
        //  12     15     147    174    Lcom/google/android/gms/dynamite/DynamiteModule$a;
        //  12     15     188    192    Any
        //  15     33     188    192    Any
        //  38     48     192    137    Landroid/os/RemoteException;
        //  38     48     188    192    Any
        //  51     61     192    137    Landroid/os/RemoteException;
        //  51     61     188    192    Any
        //  61     76     188    192    Any
        //  79     102    188    192    Any
        //  105    121    188    192    Any
        //  124    133    188    192    Any
        //  137    144    188    192    Any
        //  148    171    188    192    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void h() {
        if (E.e != null) {
            return;
        }
        n.i(E.g);
        final Object f = E.f;
        // monitorenter(f)
        while (true) {
            try {
                if (E.e == null) {
                    E.e = A2.O.o(DynamiteModule.d(E.g, DynamiteModule.f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
                // monitorexit(f)
                return;
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
