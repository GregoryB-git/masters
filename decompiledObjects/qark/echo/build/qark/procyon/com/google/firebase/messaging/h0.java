// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import android.util.Log;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;

public class h0 implements Runnable
{
    public static final Object t;
    public static Boolean u;
    public static Boolean v;
    public final Context o;
    public final K p;
    public final PowerManager$WakeLock q;
    public final g0 r;
    public final long s;
    
    static {
        t = new Object();
    }
    
    public h0(final g0 r, final Context o, final K p4, final long s) {
        this.r = r;
        this.o = o;
        this.s = s;
        this.p = p4;
        this.q = ((PowerManager)o.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
    
    public static /* synthetic */ g0 c(final h0 h0) {
        return h0.r;
    }
    
    public static /* synthetic */ Context d(final h0 h0) {
        return h0.o;
    }
    
    public static String e(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }
    
    public static boolean f(final Context context) {
        final Object t = h0.t;
        // monitorenter(t)
        while (true) {
            try {
                final Boolean v = h0.v;
                boolean b;
                if (v == null) {
                    b = g(context, "android.permission.ACCESS_NETWORK_STATE", v);
                }
                else {
                    b = v;
                }
                // monitorexit(t)
                return h0.v = b;
                // monitorexit(t)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean g(final Context context, final String s, final Boolean b) {
        if (b != null) {
            return b;
        }
        final boolean b2 = context.checkCallingOrSelfPermission(s) == 0;
        if (!b2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(s));
        }
        return b2;
    }
    
    public static boolean h(final Context context) {
        final Object t = h0.t;
        // monitorenter(t)
        while (true) {
            try {
                final Boolean u = h0.u;
                boolean b;
                if (u == null) {
                    b = g(context, "android.permission.WAKE_LOCK", u);
                }
                else {
                    b = u;
                }
                // monitorexit(t)
                return h0.u = b;
                // monitorexit(t)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public final boolean i() {
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0059: {
                    while (true) {
                        try {
                            final ConnectivityManager connectivityManager = (ConnectivityManager)this.o.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                // monitorexit(this)
                                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                            }
                            break Label_0059;
                            // monitorexit(this)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final NetworkInfo activeNetworkInfo = null;
                continue;
            }
        }
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //     4: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //     7: ifeq            20
        //    10: aload_0        
        //    11: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //    14: getstatic       com/google/firebase/messaging/e.a:J
        //    17: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    20: aload_0        
        //    21: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //    24: iconst_1       
        //    25: invokevirtual   com/google/firebase/messaging/g0.o:(Z)V
        //    28: aload_0        
        //    29: getfield        com/google/firebase/messaging/h0.p:Lcom/google/firebase/messaging/K;
        //    32: invokevirtual   com/google/firebase/messaging/K.g:()Z
        //    35: ifne            81
        //    38: aload_0        
        //    39: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //    42: iconst_0       
        //    43: invokevirtual   com/google/firebase/messaging/g0.o:(Z)V
        //    46: aload_0        
        //    47: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //    50: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //    53: ifeq            72
        //    56: aload_0        
        //    57: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //    60: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    63: return         
        //    64: ldc             "FirebaseMessaging"
        //    66: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //    68: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    71: pop            
        //    72: return         
        //    73: astore_1       
        //    74: goto            259
        //    77: astore_1       
        //    78: goto            198
        //    81: aload_0        
        //    82: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //    85: invokestatic    com/google/firebase/messaging/h0.f:(Landroid/content/Context;)Z
        //    88: ifeq            137
        //    91: aload_0        
        //    92: invokevirtual   com/google/firebase/messaging/h0.i:()Z
        //    95: ifne            137
        //    98: new             Lcom/google/firebase/messaging/h0$a;
        //   101: dup            
        //   102: aload_0        
        //   103: aload_0        
        //   104: invokespecial   com/google/firebase/messaging/h0$a.<init>:(Lcom/google/firebase/messaging/h0;Lcom/google/firebase/messaging/h0;)V
        //   107: invokevirtual   com/google/firebase/messaging/h0$a.a:()V
        //   110: aload_0        
        //   111: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //   114: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //   117: ifeq            136
        //   120: aload_0        
        //   121: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //   124: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   127: return         
        //   128: ldc             "FirebaseMessaging"
        //   130: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   132: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   135: pop            
        //   136: return         
        //   137: aload_0        
        //   138: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //   141: invokevirtual   com/google/firebase/messaging/g0.s:()Z
        //   144: ifeq            158
        //   147: aload_0        
        //   148: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //   151: iconst_0       
        //   152: invokevirtual   com/google/firebase/messaging/g0.o:(Z)V
        //   155: goto            169
        //   158: aload_0        
        //   159: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //   162: aload_0        
        //   163: getfield        com/google/firebase/messaging/h0.s:J
        //   166: invokevirtual   com/google/firebase/messaging/g0.t:(J)V
        //   169: aload_0        
        //   170: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //   173: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //   176: ifeq            258
        //   179: aload_0        
        //   180: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //   183: astore_1       
        //   184: aload_1        
        //   185: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   188: return         
        //   189: ldc             "FirebaseMessaging"
        //   191: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   193: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   196: pop            
        //   197: return         
        //   198: new             Ljava/lang/StringBuilder;
        //   201: dup            
        //   202: invokespecial   java/lang/StringBuilder.<init>:()V
        //   205: astore_2       
        //   206: aload_2        
        //   207: ldc             "Failed to sync topics. Won't retry sync. "
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: pop            
        //   213: aload_2        
        //   214: aload_1        
        //   215: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: pop            
        //   222: ldc             "FirebaseMessaging"
        //   224: aload_2        
        //   225: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   228: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   231: pop            
        //   232: aload_0        
        //   233: getfield        com/google/firebase/messaging/h0.r:Lcom/google/firebase/messaging/g0;
        //   236: iconst_0       
        //   237: invokevirtual   com/google/firebase/messaging/g0.o:(Z)V
        //   240: aload_0        
        //   241: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //   244: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //   247: ifeq            258
        //   250: aload_0        
        //   251: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //   254: astore_1       
        //   255: goto            184
        //   258: return         
        //   259: aload_0        
        //   260: getfield        com/google/firebase/messaging/h0.o:Landroid/content/Context;
        //   263: invokestatic    com/google/firebase/messaging/h0.h:(Landroid/content/Context;)Z
        //   266: ifeq            287
        //   269: aload_0        
        //   270: getfield        com/google/firebase/messaging/h0.q:Landroid/os/PowerManager$WakeLock;
        //   273: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   276: goto            287
        //   279: ldc             "FirebaseMessaging"
        //   281: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   283: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   286: pop            
        //   287: aload_1        
        //   288: athrow         
        //   289: astore_1       
        //   290: goto            64
        //   293: astore_1       
        //   294: goto            128
        //   297: astore_1       
        //   298: goto            189
        //   301: astore_2       
        //   302: goto            279
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     46     77     258    Ljava/io/IOException;
        //  20     46     73     289    Any
        //  56     63     289    72     Ljava/lang/RuntimeException;
        //  81     110    77     258    Ljava/io/IOException;
        //  81     110    73     289    Any
        //  120    127    293    136    Ljava/lang/RuntimeException;
        //  137    155    77     258    Ljava/io/IOException;
        //  137    155    73     289    Any
        //  158    169    77     258    Ljava/io/IOException;
        //  158    169    73     289    Any
        //  179    184    297    198    Ljava/lang/RuntimeException;
        //  184    188    297    198    Ljava/lang/RuntimeException;
        //  198    240    73     289    Any
        //  250    255    297    198    Ljava/lang/RuntimeException;
        //  269    276    301    287    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 145 out of bounds for length 145
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public class a extends BroadcastReceiver
    {
        public h0 a;
        
        public a(final h0 a) {
            this.a = a;
        }
        
        public void a() {
            if (j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h0.d(h0.this).registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public void onReceive(final Context context, final Intent intent) {
            // monitorenter(this)
            while (true) {
                try {
                    final h0 a = this.a;
                    if (a == null) {
                        // monitorexit(this)
                        return;
                    }
                    if (!a.i()) {
                        // monitorexit(this)
                        return;
                    }
                    if (j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    h0.c(this.a).m(this.a, 0L);
                    context.unregisterReceiver((BroadcastReceiver)this);
                    this.a = null;
                    // monitorexit(this)
                    return;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
