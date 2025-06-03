// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I1;

import android.content.ComponentName;
import java.util.concurrent.TimeUnit;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import android.content.ServiceConnection;
import java.util.Arrays;
import android.content.pm.PackageManager;
import O1.k;
import android.content.Intent;
import android.content.Context;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import x1.B;
import T1.a;

public final class e
{
    public static final e a;
    public static final String b;
    public static Boolean c;
    
    static {
        a = new e();
        b = e.class.getSimpleName();
    }
    
    public static final boolean b() {
        if (T1.a.d(e.class)) {
            return false;
        }
        while (true) {
            try {
                if (e.c == null) {
                    e.c = (e.a.a(B.l()) != null);
                }
                final Boolean c = e.c;
                return c != null && c;
                final Throwable t;
                T1.a.b(t, e.class);
                return false;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final c c(final String s, final List list) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "applicationId");
            Intrinsics.checkNotNullParameter(list, "appEvents");
            return e.a.d(e.a.q, s, list);
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return null;
        }
    }
    
    public static final c e(final String s) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "applicationId");
            return e.a.d(e.a.p, s, m.f());
        }
        finally {
            final Throwable t;
            T1.a.b(t, e.class);
            return null;
        }
    }
    
    public final Intent a(final Context context) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    final Intent intent = new Intent("ReceiverService");
                    intent.setPackage("com.facebook.katana");
                    if (packageManager.resolveService(intent, 0) != null && k.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                    final Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage("com.facebook.wakizashi");
                    if (packageManager.resolveService(intent2, 0) != null && k.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
                return null;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final c d(final a p0, final String p1, final List p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            9
        //     7: aconst_null    
        //     8: areturn        
        //     9: getstatic       I1/e$c.p:LI1/e$c;
        //    12: astore          5
        //    14: invokestatic    G1/g.b:()V
        //    17: invokestatic    x1/B.l:()Landroid/content/Context;
        //    20: astore          7
        //    22: aload_0        
        //    23: aload           7
        //    25: invokevirtual   I1/e.a:(Landroid/content/Context;)Landroid/content/Intent;
        //    28: astore          8
        //    30: aload           5
        //    32: astore          6
        //    34: aload           8
        //    36: ifnull          239
        //    39: new             LI1/e$b;
        //    42: dup            
        //    43: invokespecial   I1/e$b.<init>:()V
        //    46: astore          6
        //    48: aload           7
        //    50: aload           8
        //    52: aload           6
        //    54: iconst_1       
        //    55: invokevirtual   android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //    58: istore          4
        //    60: iload           4
        //    62: ifeq            234
        //    65: aload           6
        //    67: invokevirtual   I1/e$b.a:()Landroid/os/IBinder;
        //    70: astore          8
        //    72: aload           8
        //    74: ifnull          128
        //    77: aload           8
        //    79: invokestatic    Z1/a$a.n:(Landroid/os/IBinder;)LZ1/a;
        //    82: astore          5
        //    84: aload_1        
        //    85: aload_2        
        //    86: aload_3        
        //    87: invokestatic    I1/d.a:(LI1/e$a;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;
        //    90: astore_1       
        //    91: aload_1        
        //    92: ifnull          123
        //    95: aload           5
        //    97: aload_1        
        //    98: invokeinterface Z1/a.O:(Landroid/os/Bundle;)I
        //   103: pop            
        //   104: getstatic       O1/P.a:LO1/P;
        //   107: astore_2       
        //   108: getstatic       I1/e.b:Ljava/lang/String;
        //   111: ldc             "Successfully sent events to the remote service: "
        //   113: aload_1        
        //   114: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   117: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
        //   120: goto            123
        //   123: getstatic       I1/e$c.o:LI1/e$c;
        //   126: astore          5
        //   128: aload           7
        //   130: aload           6
        //   132: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //   135: getstatic       O1/P.a:LO1/P;
        //   138: astore_1       
        //   139: getstatic       I1/e.b:Ljava/lang/String;
        //   142: ldc             "Unbound from the remote service"
        //   144: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
        //   147: aload           5
        //   149: areturn        
        //   150: astore_1       
        //   151: goto            242
        //   154: getstatic       I1/e$c.q:LI1/e$c;
        //   157: astore_1       
        //   158: getstatic       O1/P.a:LO1/P;
        //   161: astore_2       
        //   162: getstatic       I1/e.b:Ljava/lang/String;
        //   165: astore_2       
        //   166: aload_2        
        //   167: aload_3        
        //   168: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   171: aload           7
        //   173: aload           6
        //   175: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //   178: aload_2        
        //   179: ldc             "Unbound from the remote service"
        //   181: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
        //   184: aload_1        
        //   185: areturn        
        //   186: getstatic       I1/e$c.q:LI1/e$c;
        //   189: astore_1       
        //   190: getstatic       O1/P.a:LO1/P;
        //   193: astore_2       
        //   194: getstatic       I1/e.b:Ljava/lang/String;
        //   197: astore_2       
        //   198: aload_2        
        //   199: aload_3        
        //   200: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   203: aload           7
        //   205: aload           6
        //   207: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //   210: goto            178
        //   213: aload           7
        //   215: aload           6
        //   217: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //   220: getstatic       O1/P.a:LO1/P;
        //   223: astore_2       
        //   224: getstatic       I1/e.b:Ljava/lang/String;
        //   227: ldc             "Unbound from the remote service"
        //   229: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
        //   232: aload_1        
        //   233: athrow         
        //   234: getstatic       I1/e$c.q:LI1/e$c;
        //   237: astore          6
        //   239: aload           6
        //   241: areturn        
        //   242: aload_1        
        //   243: aload_0        
        //   244: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   247: aconst_null    
        //   248: areturn        
        //   249: astore_1       
        //   250: goto            213
        //   253: astore_3       
        //   254: goto            154
        //   257: astore_3       
        //   258: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      30     150    154    Any
        //  39     60     150    154    Any
        //  65     72     257    213    Ljava/lang/InterruptedException;
        //  65     72     253    178    Landroid/os/RemoteException;
        //  65     72     249    234    Any
        //  77     91     257    213    Ljava/lang/InterruptedException;
        //  77     91     253    178    Landroid/os/RemoteException;
        //  77     91     249    234    Any
        //  95     120    257    213    Ljava/lang/InterruptedException;
        //  95     120    253    178    Landroid/os/RemoteException;
        //  95     120    249    234    Any
        //  123    128    257    213    Ljava/lang/InterruptedException;
        //  123    128    253    178    Landroid/os/RemoteException;
        //  123    128    249    234    Any
        //  128    147    150    154    Any
        //  154    171    249    234    Any
        //  171    178    150    154    Any
        //  178    184    150    154    Any
        //  186    203    249    234    Any
        //  203    210    150    154    Any
        //  213    234    150    154    Any
        //  234    239    150    154    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
    
    public enum a
    {
        p("MOBILE_APP_INSTALL", 0, "MOBILE_APP_INSTALL"), 
        q("CUSTOM_APP_EVENTS", 1, "CUSTOM_APP_EVENTS");
        
        public final String o;
        
        static {
            r = c();
        }
        
        public a(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.p, a.q };
        }
        
        @Override
        public String toString() {
            return this.o;
        }
    }
    
    public static final class b implements ServiceConnection
    {
        public final CountDownLatch a;
        public IBinder b;
        
        public b() {
            this.a = new CountDownLatch(1);
        }
        
        public final IBinder a() {
            this.a.await(5L, TimeUnit.SECONDS);
            return this.b;
        }
        
        public void onNullBinding(final ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            this.a.countDown();
        }
        
        public void onServiceConnected(final ComponentName componentName, final IBinder b) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            Intrinsics.checkNotNullParameter(b, "serviceBinder");
            this.b = b;
            this.a.countDown();
        }
        
        public void onServiceDisconnected(final ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "name");
        }
    }
    
    public enum c
    {
        o("OPERATION_SUCCESS", 0), 
        p("SERVICE_NOT_AVAILABLE", 1), 
        q("SERVICE_ERROR", 2);
        
        static {
            r = c();
        }
        
        public c(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ c[] c() {
            return new c[] { c.o, c.p, c.q };
        }
    }
}
