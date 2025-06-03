// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.BaseBundle;
import V2.k;
import java.util.concurrent.ScheduledFuture;
import V2.i;
import java.io.IOException;
import V2.b;
import L2.a;
import java.util.regex.Matcher;
import android.os.Parcelable;
import android.util.Log;
import android.content.Intent;
import android.os.Message;
import V2.m;
import V2.j;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import t.h;
import java.util.regex.Pattern;
import java.util.concurrent.Executor;
import android.app.PendingIntent;

public class c
{
    public static int h;
    public static PendingIntent i;
    public static final Executor j;
    public static final Pattern k;
    public final h a;
    public final Context b;
    public final x c;
    public final ScheduledExecutorService d;
    public Messenger e;
    public Messenger f;
    public w2.h g;
    
    static {
        j = D.o;
        k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public c(final Context b) {
        this.a = new h();
        this.b = b;
        this.c = new x(b);
        this.e = new Messenger((Handler)new e(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        d.setKeepAliveTime(60L, TimeUnit.SECONDS);
        d.allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    public static String g() {
        synchronized (c.class) {
            final int h = c.h;
            c.h = h + 1;
            return Integer.toString(h);
        }
    }
    
    public static void h(final Context context, final Intent intent) {
        // monitorenter(c.class)
        while (true) {
            try {
                if (c.i == null) {
                    final Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    c.i = a.a(context, 0, intent2, a.a);
                }
                intent.putExtra("app", (Parcelable)c.i);
                // monitorexit(c.class)
                return;
                // monitorexit(c.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean j(final Bundle bundle) {
        return bundle != null && ((BaseBundle)bundle).containsKey("google.messenger");
    }
    
    public j a(final Bundle bundle) {
        if (this.c.a() >= 12000000) {
            return w.b(this.b).d(1, bundle).g(w2.c.j, z.a);
        }
        if (this.c.b() != 0) {
            return this.f(bundle).h(w2.c.j, new y(this, bundle));
        }
        return m.d(new IOException("MISSING_INSTANCEID_SERVICE"));
    }
    
    public final j f(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: new             LV2/k;
        //     7: dup            
        //     8: invokespecial   V2/k.<init>:()V
        //    11: astore          4
        //    13: aload_0        
        //    14: getfield        w2/c.a:Lt/h;
        //    17: astore_2       
        //    18: aload_2        
        //    19: monitorenter   
        //    20: aload_0        
        //    21: getfield        w2/c.a:Lt/h;
        //    24: aload_3        
        //    25: aload           4
        //    27: invokevirtual   t/h.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    30: pop            
        //    31: aload_2        
        //    32: monitorexit    
        //    33: new             Landroid/content/Intent;
        //    36: dup            
        //    37: invokespecial   android/content/Intent.<init>:()V
        //    40: astore          5
        //    42: aload           5
        //    44: ldc_w           "com.google.android.gms"
        //    47: invokevirtual   android/content/Intent.setPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //    50: pop            
        //    51: aload_0        
        //    52: getfield        w2/c.c:Lw2/x;
        //    55: invokevirtual   w2/x.b:()I
        //    58: iconst_2       
        //    59: if_icmpne       76
        //    62: ldc_w           "com.google.iid.TOKEN_REQUEST"
        //    65: astore_2       
        //    66: aload           5
        //    68: aload_2        
        //    69: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //    72: pop            
        //    73: goto            83
        //    76: ldc_w           "com.google.android.c2dm.intent.REGISTER"
        //    79: astore_2       
        //    80: goto            66
        //    83: aload           5
        //    85: aload_1        
        //    86: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //    89: pop            
        //    90: aload_0        
        //    91: getfield        w2/c.b:Landroid/content/Context;
        //    94: aload           5
        //    96: invokestatic    w2/c.h:(Landroid/content/Context;Landroid/content/Intent;)V
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: aload_3        
        //   104: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   107: invokevirtual   java/lang/String.length:()I
        //   110: iconst_5       
        //   111: iadd           
        //   112: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   115: astore_1       
        //   116: aload_1        
        //   117: ldc_w           "|ID|"
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: pop            
        //   124: aload_1        
        //   125: aload_3        
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: pop            
        //   130: aload_1        
        //   131: ldc             "|"
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: pop            
        //   137: aload           5
        //   139: ldc_w           "kid"
        //   142: aload_1        
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   149: pop            
        //   150: ldc             "Rpc"
        //   152: iconst_3       
        //   153: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   156: ifeq            207
        //   159: aload           5
        //   161: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   164: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   167: astore_1       
        //   168: new             Ljava/lang/StringBuilder;
        //   171: dup            
        //   172: aload_1        
        //   173: invokevirtual   java/lang/String.length:()I
        //   176: bipush          8
        //   178: iadd           
        //   179: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   182: astore_2       
        //   183: aload_2        
        //   184: ldc_w           "Sending "
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: pop            
        //   191: aload_2        
        //   192: aload_1        
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: pop            
        //   197: ldc             "Rpc"
        //   199: aload_2        
        //   200: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   203: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   206: pop            
        //   207: aload           5
        //   209: ldc             "google.messenger"
        //   211: aload_0        
        //   212: getfield        w2/c.e:Landroid/os/Messenger;
        //   215: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   218: pop            
        //   219: aload_0        
        //   220: getfield        w2/c.f:Landroid/os/Messenger;
        //   223: ifnonnull       233
        //   226: aload_0        
        //   227: getfield        w2/c.g:Lw2/h;
        //   230: ifnull          289
        //   233: invokestatic    android/os/Message.obtain:()Landroid/os/Message;
        //   236: astore_1       
        //   237: aload_1        
        //   238: aload           5
        //   240: putfield        android/os/Message.obj:Ljava/lang/Object;
        //   243: aload_0        
        //   244: getfield        w2/c.f:Landroid/os/Messenger;
        //   247: astore_2       
        //   248: aload_2        
        //   249: ifnull          260
        //   252: aload_2        
        //   253: aload_1        
        //   254: invokevirtual   android/os/Messenger.send:(Landroid/os/Message;)V
        //   257: goto            322
        //   260: aload_0        
        //   261: getfield        w2/c.g:Lw2/h;
        //   264: aload_1        
        //   265: invokevirtual   w2/h.b:(Landroid/os/Message;)V
        //   268: goto            322
        //   271: ldc             "Rpc"
        //   273: iconst_3       
        //   274: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   277: ifeq            289
        //   280: ldc             "Rpc"
        //   282: ldc_w           "Messenger failed, fallback to startService"
        //   285: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   288: pop            
        //   289: aload_0        
        //   290: getfield        w2/c.c:Lw2/x;
        //   293: invokevirtual   w2/x.b:()I
        //   296: iconst_2       
        //   297: if_icmpne       312
        //   300: aload_0        
        //   301: getfield        w2/c.b:Landroid/content/Context;
        //   304: aload           5
        //   306: invokevirtual   android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
        //   309: goto            322
        //   312: aload_0        
        //   313: getfield        w2/c.b:Landroid/content/Context;
        //   316: aload           5
        //   318: invokevirtual   android/content/Context.startService:(Landroid/content/Intent;)Landroid/content/ComponentName;
        //   321: pop            
        //   322: aload_0        
        //   323: getfield        w2/c.d:Ljava/util/concurrent/ScheduledExecutorService;
        //   326: new             Lw2/C;
        //   329: dup            
        //   330: aload           4
        //   332: invokespecial   w2/C.<init>:(LV2/k;)V
        //   335: ldc2_w          30
        //   338: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   341: invokeinterface java/util/concurrent/ScheduledExecutorService.schedule:(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
        //   346: astore_1       
        //   347: aload           4
        //   349: invokevirtual   V2/k.a:()LV2/j;
        //   352: getstatic       w2/c.j:Ljava/util/concurrent/Executor;
        //   355: new             Lw2/A;
        //   358: dup            
        //   359: aload_0        
        //   360: aload_3        
        //   361: aload_1        
        //   362: invokespecial   w2/A.<init>:(Lw2/c;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
        //   365: invokevirtual   V2/j.c:(Ljava/util/concurrent/Executor;LV2/e;)LV2/j;
        //   368: pop            
        //   369: aload           4
        //   371: invokevirtual   V2/k.a:()LV2/j;
        //   374: areturn        
        //   375: astore_1       
        //   376: aload_2        
        //   377: monitorexit    
        //   378: aload_1        
        //   379: athrow         
        //   380: astore_1       
        //   381: goto            271
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     33     375    380    Any
        //  243    248    380    289    Landroid/os/RemoteException;
        //  252    257    380    289    Landroid/os/RemoteException;
        //  260    268    380    289    Landroid/os/RemoteException;
        //  376    378    375    380    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0260:
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
    
    public final void i(String s, final Bundle bundle) {
        final h a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final k k = (k)this.a.remove(s);
                if (k == null) {
                    s = String.valueOf(s);
                    if (s.length() != 0) {
                        s = "Missing callback for ".concat(s);
                    }
                    else {
                        s = new String("Missing callback for ");
                    }
                    Log.w("Rpc", s);
                    // monitorexit(a)
                    return;
                }
                k.c(bundle);
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
