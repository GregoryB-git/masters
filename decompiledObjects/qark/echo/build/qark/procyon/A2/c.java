// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.concurrent.Executor;
import android.accounts.Account;
import android.content.ServiceConnection;
import android.util.Log;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.DeadObjectException;
import java.util.Collections;
import java.util.Set;
import android.os.Bundle;
import android.text.TextUtils;
import x2.b;
import java.util.ArrayList;
import android.os.IInterface;
import android.os.Handler;
import x2.k;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import x2.d;

public abstract class c
{
    public static final String[] D;
    public static final x2.d[] E;
    public boolean A;
    public volatile a0 B;
    public AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public m0 g;
    public final Context h;
    public final Looper i;
    public final h j;
    public final k k;
    public final Handler l;
    public final Object m;
    public final Object n;
    public A2.k o;
    public c p;
    public IInterface q;
    public final ArrayList r;
    public X s;
    public int t;
    public final a u;
    public final b v;
    public final int w;
    public final String x;
    public volatile String y;
    public x2.b z;
    
    static {
        E = new x2.d[0];
        D = new String[] { "service_esmobile", "service_googleme" };
    }
    
    public c(final Context context, final Looper looper, final int n, final a a, final b b, final String s) {
        final h b2 = A2.h.b(context);
        final k f = x2.k.f();
        A2.n.i(a);
        A2.n.i(b);
        this(context, looper, b2, f, n, a, b, s);
    }
    
    public c(final Context h, final Looper i, final h j, final k k, final int w, final a u, final b v, final String x) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        A2.n.j(h, "Context must not be null");
        this.h = h;
        A2.n.j(i, "Looper must not be null");
        this.i = i;
        A2.n.j(j, "Supervisor must not be null");
        this.j = j;
        A2.n.j(k, "API availability must not be null");
        this.k = k;
        this.l = new U(this, i);
        this.w = w;
        this.u = u;
        this.v = v;
        this.x = x;
    }
    
    public Bundle A() {
        return new Bundle();
    }
    
    public String B() {
        return null;
    }
    
    public Set C() {
        return Collections.emptySet();
    }
    
    public final IInterface D() {
        final Object m = this.m;
        // monitorenter(m)
        while (true) {
            try {
                if (this.t != 5) {
                    this.r();
                    final IInterface q = this.q;
                    A2.n.j(q, "Client is connected but service is null");
                    // monitorexit(m)
                    return q;
                }
                throw new DeadObjectException();
                // monitorexit(m)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public abstract String E();
    
    public abstract String F();
    
    public String G() {
        return "com.google.android.gms";
    }
    
    public A2.e H() {
        final a0 b = this.B;
        if (b == null) {
            return null;
        }
        return b.r;
    }
    
    public boolean I() {
        return this.h() >= 211700000;
    }
    
    public boolean J() {
        return this.B != null;
    }
    
    public void K(final IInterface interface1) {
        this.c = System.currentTimeMillis();
    }
    
    public void L(final x2.b b) {
        this.d = b.a();
        this.e = System.currentTimeMillis();
    }
    
    public void M(final int a) {
        this.a = a;
        this.b = System.currentTimeMillis();
    }
    
    public void N(final int n, final IBinder binder, final Bundle bundle, final int n2) {
        final Handler l = this.l;
        l.sendMessage(l.obtainMessage(1, n2, -1, (Object)new Y(this, n, binder, bundle)));
    }
    
    public boolean O() {
        return false;
    }
    
    public void P(final String y) {
        this.y = y;
    }
    
    public void Q(final int n) {
        final Handler l = this.l;
        l.sendMessage(l.obtainMessage(6, this.C.get(), n));
    }
    
    public void R(final c p3, final int n, final PendingIntent pendingIntent) {
        n.j(p3, "Connection progress callbacks cannot be null.");
        this.p = p3;
        final Handler l = this.l;
        l.sendMessage(l.obtainMessage(3, this.C.get(), n, (Object)pendingIntent));
    }
    
    public boolean S() {
        return false;
    }
    
    public final String X() {
        String s;
        if ((s = this.x) == null) {
            s = this.h.getClass().getName();
        }
        return s;
    }
    
    public boolean a() {
        while (true) {
            synchronized (this.m) {
                if (this.t == 4) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public void b(final e e) {
        e.a();
    }
    
    public void c() {
        this.C.incrementAndGet();
        final ArrayList r = this.r;
        // monitorenter(r)
        while (true) {
            try {
                for (int size = this.r.size(), i = 0; i < size; ++i) {
                    ((V)this.r.get(i)).d();
                }
                this.r.clear();
                // monitorexit(r)
                synchronized (this.n) {
                    this.o = null;
                    // monitorexit(this.n)
                    this.i0(1, null);
                    return;
                }
                // monitorexit(r)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void e0(final int n, final Bundle bundle, final int n2) {
        final Handler l = this.l;
        l.sendMessage(l.obtainMessage(7, n2, -1, (Object)new Z(this, n, null)));
    }
    
    public void f(final String f) {
        this.f = f;
        this.c();
    }
    
    public boolean g() {
        return true;
    }
    
    public abstract int h();
    
    public boolean i() {
        while (true) {
            synchronized (this.m) {
                final int t = this.t;
                boolean b = true;
                if (t != 2) {
                    if (t != 3) {
                        return false;
                    }
                    b = b;
                }
                return b;
            }
            return false;
        }
    }
    
    public final void i0(int a, final IInterface q) {
        boolean b = false;
        if (a == 4 == (q != null)) {
            b = true;
        }
        A2.n.a(b);
        final Object m = this.m;
        // monitorenter(m)
        while (true) {
            try {
                this.t = a;
                this.q = q;
                if (a != 1) {
                    if (a != 2 && a != 3) {
                        if (a == 4) {
                            A2.n.i(q);
                            this.K(q);
                        }
                    }
                    else {
                        final X s = this.s;
                        if (s != null) {
                            final m0 g = this.g;
                            if (g != null) {
                                final String c = g.c();
                                final String b2 = g.b();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Calling connect() while still connected, missing disconnect() for ");
                                sb.append(c);
                                sb.append(" on ");
                                sb.append(b2);
                                Log.e("GmsClient", sb.toString());
                                final h j = this.j;
                                final String c2 = this.g.c();
                                A2.n.i(c2);
                                j.e(c2, this.g.b(), this.g.a(), (ServiceConnection)s, this.X(), this.g.d());
                                this.C.incrementAndGet();
                            }
                        }
                        final X s2 = new X(this, this.C.get());
                        this.s = s2;
                        m0 g2;
                        if (this.t == 3 && this.B() != null) {
                            g2 = new m0(this.y().getPackageName(), this.B(), true, A2.h.a(), false);
                        }
                        else {
                            g2 = new m0(this.G(), this.F(), false, A2.h.a(), this.I());
                        }
                        this.g = g2;
                        if (g2.d() && this.h() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.c())));
                        }
                        final h i = this.j;
                        final String c3 = this.g.c();
                        A2.n.i(c3);
                        final String b3 = this.g.b();
                        a = this.g.a();
                        if (!i.f(new e0(c3, b3, a, this.g.d()), (ServiceConnection)s2, this.X(), this.w())) {
                            final String c4 = this.g.c();
                            final String b4 = this.g.b();
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("unable to connect to service: ");
                            sb2.append(c4);
                            sb2.append(" on ");
                            sb2.append(b4);
                            Log.w("GmsClient", sb2.toString());
                            this.e0(16, null, this.C.get());
                        }
                    }
                }
                else {
                    final X s3 = this.s;
                    if (s3 != null) {
                        final h k = this.j;
                        final String c5 = this.g.c();
                        A2.n.i(c5);
                        k.e(c5, this.g.b(), this.g.a(), (ServiceConnection)s3, this.X(), this.g.d());
                        this.s = null;
                    }
                }
                // monitorexit(m)
                return;
                // monitorexit(m)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final x2.d[] j() {
        final a0 b = this.B;
        if (b == null) {
            return null;
        }
        return b.p;
    }
    
    public String k() {
        if (this.a()) {
            final m0 g = this.g;
            if (g != null) {
                return g.b();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    public String l() {
        return this.f;
    }
    
    public boolean m() {
        return false;
    }
    
    public void o(final i p0, final Set p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   A2/c.A:()Landroid/os/Bundle;
        //     4: astore          5
        //     6: aload_0        
        //     7: getfield        A2/c.w:I
        //    10: istore_3       
        //    11: aload_0        
        //    12: getfield        A2/c.y:Ljava/lang/String;
        //    15: astore          6
        //    17: getstatic       x2/k.a:I
        //    20: istore          4
        //    22: getstatic       A2/f.C:[Lcom/google/android/gms/common/api/Scope;
        //    25: astore          7
        //    27: new             Landroid/os/Bundle;
        //    30: dup            
        //    31: invokespecial   android/os/Bundle.<init>:()V
        //    34: astore          8
        //    36: getstatic       A2/f.D:[Lx2/d;
        //    39: astore          9
        //    41: new             LA2/f;
        //    44: dup            
        //    45: bipush          6
        //    47: iload_3        
        //    48: iload           4
        //    50: aconst_null    
        //    51: aconst_null    
        //    52: aload           7
        //    54: aload           8
        //    56: aconst_null    
        //    57: aload           9
        //    59: aload           9
        //    61: iconst_1       
        //    62: iconst_0       
        //    63: iconst_0       
        //    64: aload           6
        //    66: invokespecial   A2/f.<init>:(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lx2/d;[Lx2/d;ZIZLjava/lang/String;)V
        //    69: astore          6
        //    71: aload           6
        //    73: aload_0        
        //    74: getfield        A2/c.h:Landroid/content/Context;
        //    77: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    80: putfield        A2/f.r:Ljava/lang/String;
        //    83: aload           6
        //    85: aload           5
        //    87: putfield        A2/f.u:Landroid/os/Bundle;
        //    90: aload_2        
        //    91: ifnull          112
        //    94: aload           6
        //    96: aload_2        
        //    97: iconst_0       
        //    98: anewarray       Lcom/google/android/gms/common/api/Scope;
        //   101: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   106: checkcast       [Lcom/google/android/gms/common/api/Scope;
        //   109: putfield        A2/f.t:[Lcom/google/android/gms/common/api/Scope;
        //   112: aload_0        
        //   113: invokevirtual   A2/c.m:()Z
        //   116: ifeq            171
        //   119: aload_0        
        //   120: invokevirtual   A2/c.u:()Landroid/accounts/Account;
        //   123: astore          5
        //   125: aload           5
        //   127: astore_2       
        //   128: aload           5
        //   130: ifnonnull       147
        //   133: new             Landroid/accounts/Account;
        //   136: dup            
        //   137: ldc_w           "<<default account>>"
        //   140: ldc_w           "com.google"
        //   143: invokespecial   android/accounts/Account.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   146: astore_2       
        //   147: aload           6
        //   149: aload_2        
        //   150: putfield        A2/f.v:Landroid/accounts/Account;
        //   153: aload_1        
        //   154: ifnull          187
        //   157: aload           6
        //   159: aload_1        
        //   160: invokeinterface android/os/IInterface.asBinder:()Landroid/os/IBinder;
        //   165: putfield        A2/f.s:Landroid/os/IBinder;
        //   168: goto            187
        //   171: aload_0        
        //   172: invokevirtual   A2/c.O:()Z
        //   175: ifeq            187
        //   178: aload           6
        //   180: aload_0        
        //   181: invokevirtual   A2/c.u:()Landroid/accounts/Account;
        //   184: putfield        A2/f.v:Landroid/accounts/Account;
        //   187: aload           6
        //   189: getstatic       A2/c.E:[Lx2/d;
        //   192: putfield        A2/f.w:[Lx2/d;
        //   195: aload           6
        //   197: aload_0        
        //   198: invokevirtual   A2/c.v:()[Lx2/d;
        //   201: putfield        A2/f.x:[Lx2/d;
        //   204: aload_0        
        //   205: invokevirtual   A2/c.S:()Z
        //   208: ifeq            217
        //   211: aload           6
        //   213: iconst_1       
        //   214: putfield        A2/f.A:Z
        //   217: aload_0        
        //   218: getfield        A2/c.n:Ljava/lang/Object;
        //   221: astore_1       
        //   222: aload_1        
        //   223: monitorenter   
        //   224: aload_0        
        //   225: getfield        A2/c.o:LA2/k;
        //   228: astore_2       
        //   229: aload_2        
        //   230: ifnull          259
        //   233: aload_2        
        //   234: new             LA2/W;
        //   237: dup            
        //   238: aload_0        
        //   239: aload_0        
        //   240: getfield        A2/c.C:Ljava/util/concurrent/atomic/AtomicInteger;
        //   243: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   246: invokespecial   A2/W.<init>:(LA2/c;I)V
        //   249: aload           6
        //   251: invokeinterface A2/k.h0:(LA2/j;LA2/f;)V
        //   256: goto            269
        //   259: ldc_w           "GmsClient"
        //   262: ldc_w           "mServiceBroker is null, client disconnected"
        //   265: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   268: pop            
        //   269: aload_1        
        //   270: monitorexit    
        //   271: return         
        //   272: aload_1        
        //   273: monitorexit    
        //   274: aload_2        
        //   275: athrow         
        //   276: astore_1       
        //   277: goto            292
        //   280: astore_1       
        //   281: goto            292
        //   284: astore_1       
        //   285: goto            319
        //   288: astore_1       
        //   289: goto            321
        //   292: ldc_w           "GmsClient"
        //   295: ldc_w           "IGmsServiceBroker.getService failed"
        //   298: aload_1        
        //   299: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   302: pop            
        //   303: aload_0        
        //   304: bipush          8
        //   306: aconst_null    
        //   307: aconst_null    
        //   308: aload_0        
        //   309: getfield        A2/c.C:Ljava/util/concurrent/atomic/AtomicInteger;
        //   312: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   315: invokevirtual   A2/c.N:(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
        //   318: return         
        //   319: aload_1        
        //   320: athrow         
        //   321: ldc_w           "GmsClient"
        //   324: ldc_w           "IGmsServiceBroker.getService failed"
        //   327: aload_1        
        //   328: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   331: pop            
        //   332: aload_0        
        //   333: iconst_3       
        //   334: invokevirtual   A2/c.Q:(I)V
        //   337: return         
        //   338: astore_2       
        //   339: goto            272
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  217    224    288    292    Landroid/os/DeadObjectException;
        //  217    224    284    288    Ljava/lang/SecurityException;
        //  217    224    280    284    Landroid/os/RemoteException;
        //  217    224    276    280    Ljava/lang/RuntimeException;
        //  224    229    338    276    Any
        //  233    256    338    276    Any
        //  259    269    338    276    Any
        //  269    271    338    276    Any
        //  272    274    338    276    Any
        //  274    276    288    292    Landroid/os/DeadObjectException;
        //  274    276    284    288    Ljava/lang/SecurityException;
        //  274    276    280    284    Landroid/os/RemoteException;
        //  274    276    276    280    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0259:
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
    
    public void p(final c p) {
        A2.n.j(p, "Connection progress callbacks cannot be null.");
        this.p = p;
        this.i0(2, null);
    }
    
    public void q() {
        final int h = this.k.h(this.h, this.h());
        if (h != 0) {
            this.i0(1, null);
            this.R((c)new d(), h, null);
            return;
        }
        this.p((c)new d());
    }
    
    public final void r() {
        if (this.a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    
    public abstract IInterface s(final IBinder p0);
    
    public boolean t() {
        return false;
    }
    
    public Account u() {
        return null;
    }
    
    public x2.d[] v() {
        return A2.c.E;
    }
    
    public Executor w() {
        return null;
    }
    
    public Bundle x() {
        return null;
    }
    
    public final Context y() {
        return this.h;
    }
    
    public int z() {
        return this.w;
    }
    
    public interface a
    {
        void n(final int p0);
        
        void v(final Bundle p0);
    }
    
    public interface b
    {
        void o(final x2.b p0);
    }
    
    public interface c
    {
        void b(final x2.b p0);
    }
    
    public class d implements c
    {
        @Override
        public final void b(final x2.b b) {
            if (b.i()) {
                final c a = c.this;
                a.o(null, a.C());
                return;
            }
            if (c.V(c.this) != null) {
                c.V(c.this).o(b);
            }
        }
    }
    
    public interface e
    {
        void a();
    }
}
