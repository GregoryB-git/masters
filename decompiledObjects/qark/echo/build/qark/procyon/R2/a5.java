// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.DeadObjectException;
import android.os.Bundle;
import android.os.IBinder;
import android.content.ComponentName;
import D2.b;
import android.content.Intent;
import android.content.Context;
import A2.n;
import android.os.Looper;
import A2.c;
import android.content.ServiceConnection;

public final class a5 implements ServiceConnection, a, b
{
    public volatile boolean a;
    public volatile Z1 b;
    public final /* synthetic */ D4 c;
    
    public a5(final D4 c) {
        this.c = c;
    }
    
    public final void a() {
        this.c.n();
        final Context a = this.c.a();
        // monitorenter(this)
        while (true) {
            try {
                if (this.a) {
                    this.c.j().K().a("Connection attempt already in progress");
                    // monitorexit(this)
                    return;
                }
                if (this.b != null && (this.b.i() || this.b.a())) {
                    this.c.j().K().a("Already awaiting connection attempt");
                    // monitorexit(this)
                    return;
                }
                this.b = new Z1(a, Looper.getMainLooper(), this, this);
                this.c.j().K().a("Connecting to remote service");
                this.a = true;
                A2.n.i(this.b);
                this.b.q();
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
    
    public final void c(final Intent intent) {
        this.c.n();
        final Context a = this.c.a();
        final D2.b b = D2.b.b();
        // monitorenter(this)
        while (true) {
            try {
                if (this.a) {
                    this.c.j().K().a("Connection attempt already in progress");
                    // monitorexit(this)
                    return;
                }
                this.c.j().K().a("Using local app measurement service");
                this.a = true;
                b.a(a, intent, (ServiceConnection)D4.i0(this.c), 129);
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
    
    public final void d() {
        if (this.b != null && (this.b.a() || this.b.i())) {
            this.b.c();
        }
        this.b = null;
    }
    
    public final void n(final int n) {
        n.d("MeasurementServiceConnection.onConnectionSuspended");
        this.c.j().F().a("Service connection suspended");
        this.c.e().D(new e5(this));
    }
    
    public final void o(final x2.b b) {
        A2.n.d("MeasurementServiceConnection.onConnectionFailed");
        final Y1 e = this.c.a.E();
        if (e != null) {
            e.L().b("Service connection failed", b);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
            // monitorexit(this)
            this.c.e().D(new d5(this));
        }
    }
    
    public final void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    A2/n.d:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: ifnonnull       38
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        R2/a5.a:Z
        //    16: aload_0        
        //    17: getfield        R2/a5.c:LR2/D4;
        //    20: invokevirtual   R2/m3.j:()LR2/Y1;
        //    23: invokevirtual   R2/Y1.G:()LR2/a2;
        //    26: ldc             "Service connected with null binder"
        //    28: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //    31: aload_0        
        //    32: monitorexit    
        //    33: return         
        //    34: astore_1       
        //    35: goto            228
        //    38: aconst_null    
        //    39: astore_3       
        //    40: aconst_null    
        //    41: astore          4
        //    43: aload_3        
        //    44: astore_1       
        //    45: aload_2        
        //    46: invokeinterface android/os/IBinder.getInterfaceDescriptor:()Ljava/lang/String;
        //    51: astore          5
        //    53: aload_3        
        //    54: astore_1       
        //    55: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    57: aload           5
        //    59: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    62: ifeq            134
        //    65: aload_3        
        //    66: astore_1       
        //    67: aload_2        
        //    68: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    70: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    75: astore          4
        //    77: aload_3        
        //    78: astore_1       
        //    79: aload           4
        //    81: instanceof      LR2/R1;
        //    84: ifeq            98
        //    87: aload_3        
        //    88: astore_1       
        //    89: aload           4
        //    91: checkcast       LR2/R1;
        //    94: astore_2       
        //    95: goto            240
        //    98: aload_3        
        //    99: astore_1       
        //   100: new             LR2/T1;
        //   103: dup            
        //   104: aload_2        
        //   105: invokespecial   R2/T1.<init>:(Landroid/os/IBinder;)V
        //   108: astore_2       
        //   109: goto            240
        //   112: aload_2        
        //   113: astore_1       
        //   114: aload_0        
        //   115: getfield        R2/a5.c:LR2/D4;
        //   118: invokevirtual   R2/m3.j:()LR2/Y1;
        //   121: invokevirtual   R2/Y1.K:()LR2/a2;
        //   124: ldc             "Bound to IMeasurementService interface"
        //   126: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   129: aload_2        
        //   130: astore_1       
        //   131: goto            174
        //   134: aload_3        
        //   135: astore_1       
        //   136: aload_0        
        //   137: getfield        R2/a5.c:LR2/D4;
        //   140: invokevirtual   R2/m3.j:()LR2/Y1;
        //   143: invokevirtual   R2/Y1.G:()LR2/a2;
        //   146: ldc             "Got binder with a wrong descriptor"
        //   148: aload           5
        //   150: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   153: aload           4
        //   155: astore_1       
        //   156: goto            174
        //   159: aload_0        
        //   160: getfield        R2/a5.c:LR2/D4;
        //   163: invokevirtual   R2/m3.j:()LR2/Y1;
        //   166: invokevirtual   R2/Y1.G:()LR2/a2;
        //   169: ldc             "Service connect failed to get IMeasurementService"
        //   171: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   174: aload_1        
        //   175: ifnonnull       206
        //   178: aload_0        
        //   179: iconst_0       
        //   180: putfield        R2/a5.a:Z
        //   183: invokestatic    D2/b.b:()LD2/b;
        //   186: aload_0        
        //   187: getfield        R2/a5.c:LR2/D4;
        //   190: invokevirtual   R2/m3.a:()Landroid/content/Context;
        //   193: aload_0        
        //   194: getfield        R2/a5.c:LR2/D4;
        //   197: invokestatic    R2/D4.i0:(LR2/D4;)LR2/a5;
        //   200: invokevirtual   D2/b.c:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   203: goto            225
        //   206: aload_0        
        //   207: getfield        R2/a5.c:LR2/D4;
        //   210: invokevirtual   R2/m3.e:()LR2/G2;
        //   213: new             LR2/Z4;
        //   216: dup            
        //   217: aload_0        
        //   218: aload_1        
        //   219: invokespecial   R2/Z4.<init>:(LR2/a5;LR2/R1;)V
        //   222: invokevirtual   R2/G2.D:(Ljava/lang/Runnable;)V
        //   225: aload_0        
        //   226: monitorexit    
        //   227: return         
        //   228: aload_0        
        //   229: monitorexit    
        //   230: aload_1        
        //   231: athrow         
        //   232: astore_2       
        //   233: goto            159
        //   236: astore_1       
        //   237: goto            225
        //   240: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     33     34     232    Any
        //  45     53     232    174    Landroid/os/RemoteException;
        //  45     53     34     232    Any
        //  55     65     232    174    Landroid/os/RemoteException;
        //  55     65     34     232    Any
        //  67     77     232    174    Landroid/os/RemoteException;
        //  67     77     34     232    Any
        //  79     87     232    174    Landroid/os/RemoteException;
        //  79     87     34     232    Any
        //  89     95     232    174    Landroid/os/RemoteException;
        //  89     95     34     232    Any
        //  100    109    232    174    Landroid/os/RemoteException;
        //  100    109    34     232    Any
        //  114    129    232    174    Landroid/os/RemoteException;
        //  114    129    34     232    Any
        //  136    153    232    174    Landroid/os/RemoteException;
        //  136    153    34     232    Any
        //  159    174    34     232    Any
        //  178    183    34     232    Any
        //  183    203    236    240    Ljava/lang/IllegalArgumentException;
        //  183    203    34     232    Any
        //  206    225    34     232    Any
        //  225    227    34     232    Any
        //  228    230    34     232    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0206:
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
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        A2.n.d("MeasurementServiceConnection.onServiceDisconnected");
        this.c.j().F().a("Service disconnected");
        this.c.e().D(new c5(this, componentName));
    }
    
    public final void v(final Bundle bundle) {
        A2.n.d("MeasurementServiceConnection.onConnected");
        // monitorenter(this)
        while (true) {
            try {
                try {
                    A2.n.i(this.b);
                    this.c.e().D(new b5(this, (R1)this.b.D()));
                }
                finally {
                    // monitorexit(this)
                    // monitorexit(this)
                    return;
                    this.b = null;
                    this.a = false;
                }
            }
            catch (DeadObjectException ex) {}
            catch (IllegalStateException ex2) {}
            continue;
        }
    }
}
