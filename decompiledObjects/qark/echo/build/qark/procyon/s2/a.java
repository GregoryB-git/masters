// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s2;

import android.os.RemoteException;
import java.util.Map;
import java.util.HashMap;
import android.content.pm.PackageManager$NameNotFoundException;
import J2.e;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import java.io.IOException;
import x2.k;
import android.util.Log;
import android.content.ServiceConnection;
import D2.b;
import android.os.SystemClock;
import A2.n;
import android.content.Context;
import J2.f;

public class a
{
    public a a;
    public f b;
    public boolean c;
    public final Object d;
    public c e;
    public final Context f;
    public final long g;
    
    public a(final Context context, final long g, final boolean b, final boolean b2) {
        this.d = new Object();
        n.i(context);
        Context f = context;
        if (b) {
            final Context applicationContext = context.getApplicationContext();
            f = context;
            if (applicationContext != null) {
                f = applicationContext;
            }
        }
        this.f = f;
        this.c = false;
        this.g = g;
    }
    
    public static a a(Context context) {
        context = (Context)new a(context, -1L, true, false);
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            ((a)context).d(false);
            final a f = ((a)context).f(-1);
            ((a)context).e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            ((a)context).c();
            return f;
        }
        finally {
            try {
                final Throwable t;
                ((a)context).e(null, true, 0.0f, -1L, "", t);
            }
            finally {
                ((a)context).c();
            }
        }
    }
    
    public static void b(final boolean b) {
    }
    
    public final void c() {
        n.h("Calling this from your main thread can lead to deadlock");
        // monitorenter(this)
        while (true) {
            try {
                if (this.f != null && this.a != null) {
                    try {
                        if (this.c) {
                            D2.b.b().c(this.f, (ServiceConnection)this.a);
                        }
                    }
                    finally {
                        final Throwable t;
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", t);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                    // monitorexit(this)
                    return;
                }
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
    
    public final void d(final boolean b) {
        n.h("Calling this from your main thread can lead to deadlock");
        // monitorenter(this)
        try {
            if (this.c) {
                this.c();
            }
            final Context f = this.f;
            try {
                f.getPackageManager().getPackageInfo("com.android.vending", 0);
                final int h = k.f().h(f, 12451000);
                if (h != 0 && h != 2) {
                    throw new IOException("Google Play services not available");
                }
                final a a = new a();
                final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!b.b().a(f, intent, (ServiceConnection)a, 1)) {
                        goto Label_0184;
                    }
                    this.a = a;
                    try {
                        this.b = J2.e.n(a.a(10000L, TimeUnit.MILLISECONDS));
                        this.c = true;
                        if (b) {
                            this.g();
                        }
                        // monitorexit(this)
                        return;
                    }
                    catch (InterruptedException ex) {}
                }
                finally {}
            }
            catch (PackageManager$NameNotFoundException ex2) {}
            goto Label_0174;
        }
        finally {}
        goto Label_0216;
    }
    
    public final boolean e(final a a, final boolean b, final float n, final long i, String s, final Throwable t) {
        if (Math.random() <= 0.0) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            s = "1";
            hashMap.put("app_context", "1");
            if (a != null) {
                if (!a.b()) {
                    s = "0";
                }
                hashMap.put("limit_ad_tracking", s);
                final String a2 = a.a();
                if (a2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a2.length()));
                }
            }
            if (t != null) {
                hashMap.put("error", t.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(i));
            new s2.b(this, hashMap).start();
            return true;
        }
        return false;
    }
    
    public final a f(final int n) {
        n.h("Calling this from your main thread can lead to deadlock");
        // monitorenter(this)
        while (true) {
            try {
                Label_0097: {
                    if (!this.c) {
                        final Object d = this.d;
                        // monitorenter(d)
                        try {
                            final c e = this.e;
                            if (e == null || !e.r) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                            // monitorexit(d)
                            try {
                                this.d(false);
                                if (this.c) {
                                    break Label_0097;
                                }
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                            catch (Exception d) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.", (Throwable)d);
                            }
                        }
                        finally {
                            // monitorexit(d)
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                }
                n.i(this.a);
                n.i(this.b);
                try {
                    final a a = new a(this.b.c(), this.b.a0(true));
                    // monitorexit(this)
                    this.g();
                    return a;
                }
                catch (RemoteException ex) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
                    throw new IOException("Remote exception");
                }
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void finalize() {
        this.c();
        super.finalize();
    }
    
    public final void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        s2/a.d:Ljava/lang/Object;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        s2/a.e:Ls2/c;
        //    11: astore          4
        //    13: aload           4
        //    15: ifnull          41
        //    18: aload           4
        //    20: getfield        s2/c.q:Ljava/util/concurrent/CountDownLatch;
        //    23: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    26: aload_0        
        //    27: getfield        s2/a.e:Ls2/c;
        //    30: invokevirtual   java/lang/Thread.join:()V
        //    33: goto            41
        //    36: astore          4
        //    38: goto            68
        //    41: aload_0        
        //    42: getfield        s2/a.g:J
        //    45: lstore_1       
        //    46: lload_1        
        //    47: lconst_0       
        //    48: lcmp           
        //    49: ifle            65
        //    52: aload_0        
        //    53: new             Ls2/c;
        //    56: dup            
        //    57: aload_0        
        //    58: lload_1        
        //    59: invokespecial   s2/c.<init>:(Ls2/a;J)V
        //    62: putfield        s2/a.e:Ls2/c;
        //    65: aload_3        
        //    66: monitorexit    
        //    67: return         
        //    68: aload_3        
        //    69: monitorexit    
        //    70: aload           4
        //    72: athrow         
        //    73: astore          4
        //    75: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      13     36     73     Any
        //  18     26     36     73     Any
        //  26     33     73     78     Ljava/lang/InterruptedException;
        //  26     33     36     73     Any
        //  41     46     36     73     Any
        //  52     65     36     73     Any
        //  65     67     36     73     Any
        //  68     70     36     73     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        
        public a(final String a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public String a() {
            return this.a;
        }
        
        public boolean b() {
            return this.b;
        }
        
        @Override
        public String toString() {
            final String a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 7);
            sb.append("{");
            sb.append(a);
            sb.append("}");
            sb.append(b);
            return sb.toString();
        }
    }
}
