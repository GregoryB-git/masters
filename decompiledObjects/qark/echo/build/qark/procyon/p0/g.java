// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import java.io.IOException;
import x0.u;
import x0.r;
import android.os.SystemClock;
import android.os.Message;
import android.os.Handler;
import java.util.Arrays;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import g0.o;
import android.media.NotProvisionedException;
import g0.M;
import java.util.Collections;
import g0.a;
import j0.b;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.UUID;
import l0.y1;
import B0.m;
import g0.h;
import java.util.HashMap;
import java.util.List;

public class g implements n
{
    public final List a;
    public final F b;
    public final a c;
    public final b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final h i;
    public final m j;
    public final y1 k;
    public final Q l;
    public final UUID m;
    public final Looper n;
    public final e o;
    public int p;
    public int q;
    public HandlerThread r;
    public c s;
    public j0.b t;
    public n.a u;
    public byte[] v;
    public byte[] w;
    public F.a x;
    public F.d y;
    
    public g(final UUID m, final F b, final a c, final b d, final List list, final int e, final boolean f, final boolean g, final byte[] w, final HashMap h, final Q l, final Looper n, final m j, final y1 k) {
        if (e == 1 || e == 3) {
            g0.a.e(w);
        }
        this.m = m;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        List<Object> unmodifiableList;
        if (w != null) {
            this.w = w;
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<?>)g0.a.e(list));
        }
        this.a = unmodifiableList;
        this.h = h;
        this.l = l;
        this.i = new h();
        this.j = j;
        this.k = k;
        this.p = 2;
        this.n = n;
        this.o = new e(n);
    }
    
    public static /* synthetic */ m o(final g g) {
        return g.j;
    }
    
    public final void A() {
        if (this.e == 0 && this.p == 4) {
            M.i(this.v);
            this.r(false);
        }
    }
    
    public void B(final int n) {
        if (n != 2) {
            return;
        }
        this.A();
    }
    
    public void C() {
        if (this.F()) {
            this.r(true);
        }
    }
    
    public void D(final Exception ex, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 3;
        }
        this.x(ex, n);
    }
    
    public final void E(final Object o, final Object o2) {
        if (o == this.y) {
            if (this.p != 2 && !this.u()) {
                return;
            }
            this.y = null;
            if (o2 instanceof Exception) {
                this.c.c((Exception)o2, false);
                return;
            }
            try {
                this.b.i((byte[])o2);
                this.c.b();
            }
            catch (Exception ex) {
                this.c.c(ex, true);
            }
        }
    }
    
    public final boolean F() {
        if (this.u()) {
            return true;
        }
        try {
            final byte[] m = this.b.m();
            this.v = m;
            this.b.f(m, this.k);
            this.t = this.b.l(this.v);
            this.p = 3;
            this.q(new p0.b(3));
            g0.a.e(this.v);
            return true;
        }
        catch (NoSuchMethodError m) {
            goto Label_0087;
        }
        catch (Exception ex) {}
        catch (NotProvisionedException ex2) {
            goto Label_0094;
        }
    }
    
    public final void G(final byte[] noSuchMethodError, final int n, final boolean b) {
        try {
            this.x = this.b.j((byte[])(Object)noSuchMethodError, this.a, n, this.h);
            ((c)M.i(this.s)).b(2, g0.a.e(this.x), b);
            return;
        }
        catch (NoSuchMethodError noSuchMethodError) {}
        catch (Exception ex) {}
        this.z(noSuchMethodError, true);
    }
    
    public void H() {
        this.y = this.b.h();
        ((c)M.i(this.s)).b(1, g0.a.e(this.y), true);
    }
    
    public final boolean I() {
        try {
            this.b.c(this.v, this.w);
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {}
        catch (Exception ex) {}
        final NoSuchMethodError noSuchMethodError;
        this.x(noSuchMethodError, 1);
        return false;
    }
    
    public final void J() {
        if (Thread.currentThread() != this.n.getThread()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            sb.append(Thread.currentThread().getName());
            sb.append("\nExpected thread: ");
            sb.append(this.n.getThread().getName());
            g0.o.i("DefaultDrmSession", sb.toString(), new IllegalStateException());
        }
    }
    
    @Override
    public void a(final v.a a) {
        this.J();
        final int q = this.q;
        boolean b = false;
        if (q < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Session reference count less than zero: ");
            sb.append(this.q);
            g0.o.c("DefaultDrmSession", sb.toString());
            this.q = 0;
        }
        if (a != null) {
            this.i.a(a);
        }
        if (++this.q == 1) {
            if (this.p == 2) {
                b = true;
            }
            a.f(b);
            ((Thread)(this.r = new HandlerThread("ExoPlayer:DrmRequestHandler"))).start();
            this.s = new c(this.r.getLooper());
            if (this.F()) {
                this.r(true);
            }
        }
        else if (a != null && this.u() && this.i.d(a) == 1) {
            a.k(this.p);
        }
        this.d.a(this, this.q);
    }
    
    @Override
    public boolean b() {
        this.J();
        return this.f;
    }
    
    @Override
    public Map c() {
        this.J();
        final byte[] v = this.v;
        if (v == null) {
            return null;
        }
        return this.b.d(v);
    }
    
    @Override
    public final UUID d() {
        this.J();
        return this.m;
    }
    
    @Override
    public void e(final v.a a) {
        this.J();
        final int q = this.q;
        if (q <= 0) {
            g0.o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        if ((this.q = q - 1) == 0) {
            this.p = 0;
            ((e)M.i(this.o)).removeCallbacksAndMessages((Object)null);
            ((c)M.i(this.s)).c();
            this.s = null;
            ((HandlerThread)M.i(this.r)).quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            final byte[] v = this.v;
            if (v != null) {
                this.b.e(v);
                this.v = null;
            }
        }
        if (a != null) {
            this.i.f(a);
            if (this.i.d(a) == 0) {
                a.m();
            }
        }
        this.d.b(this, this.q);
    }
    
    @Override
    public boolean f(final String s) {
        this.J();
        return this.b.b((byte[])g0.a.h(this.v), s);
    }
    
    @Override
    public final n.a g() {
        this.J();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }
    
    @Override
    public final int getState() {
        this.J();
        return this.p;
    }
    
    @Override
    public final j0.b h() {
        this.J();
        return this.t;
    }
    
    public final void q(final g0.g g) {
        final Iterator<v.a> iterator = this.i.u().iterator();
        while (iterator.hasNext()) {
            g.accept(iterator.next());
        }
    }
    
    public final void r(final boolean b) {
        if (this.g) {
            return;
        }
        final byte[] array = (byte[])M.i(this.v);
        final int e = this.e;
        if (e != 0 && e != 1) {
            if (e != 2) {
                if (e != 3) {
                    return;
                }
                g0.a.e(this.w);
                g0.a.e(this.v);
                this.G(this.w, 3, b);
                return;
            }
            else if (this.w != null && !this.I()) {
                return;
            }
        }
        else {
            if (this.w == null) {
                this.G(array, 1, b);
                return;
            }
            if (this.p != 4 && !this.I()) {
                return;
            }
            final long s = this.s();
            if (this.e == 0 && s <= 60L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                sb.append(s);
                g0.o.b("DefaultDrmSession", sb.toString());
            }
            else {
                if (s <= 0L) {
                    this.x(new P(), 2);
                    return;
                }
                this.p = 4;
                this.q(new p0.f());
                return;
            }
        }
        this.G(array, 2, b);
    }
    
    public final long s() {
        if (!d0.g.d.equals(this.m)) {
            return Long.MAX_VALUE;
        }
        final Pair pair = (Pair)g0.a.e(U.b(this));
        return Math.min((long)pair.first, (long)pair.second);
    }
    
    public boolean t(final byte[] a2) {
        this.J();
        return Arrays.equals(this.v, a2);
    }
    
    public final boolean u() {
        final int p = this.p;
        return p == 3 || p == 4;
    }
    
    public final void x(final Throwable cause, final int n) {
        this.u = new n.a(cause, B.a(cause, n));
        g0.o.d("DefaultDrmSession", "DRM session error", cause);
        if (cause instanceof Exception) {
            this.q(new p0.e(cause));
        }
        else {
            if (!(cause instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", cause);
            }
            if (!B.c(cause)) {
                if (!B.b(cause)) {
                    throw (Error)cause;
                }
            }
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }
    
    public final void y(final Object o, final Object o2) {
        if (o != this.x) {
            return;
        }
        if (!this.u()) {
            return;
        }
        this.x = null;
        Label_0159: {
            if (o2 instanceof Exception || o2 instanceof NoSuchMethodError) {
                break Label_0159;
            }
            while (true) {
                try {
                    final byte[] array = (byte[])o2;
                    g0.g g;
                    if (this.e == 3) {
                        this.b.g((byte[])M.i(this.w), array);
                        g = new p0.c();
                    }
                    else {
                        final byte[] g2 = this.b.g(this.v, array);
                        final int e = this.e;
                        if ((e == 2 || (e == 0 && this.w != null)) && g2 != null && g2.length != 0) {
                            this.w = g2;
                        }
                        this.p = 4;
                        g = new p0.d();
                    }
                    this.q(g);
                    return;
                    this.z((Throwable)o2, false);
                    return;
                    final NoSuchMethodError noSuchMethodError;
                    this.z(noSuchMethodError, true);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    continue;
                }
                catch (Exception noSuchMethodError) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void z(final Throwable t, final boolean b) {
        if (!(t instanceof NotProvisionedException) && !B.b(t)) {
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            this.x(t, n);
            return;
        }
        this.c.a(this);
    }
    
    public interface a
    {
        void a(final g p0);
        
        void b();
        
        void c(final Exception p0, final boolean p1);
    }
    
    public interface b
    {
        void a(final g p0, final int p1);
        
        void b(final g p0, final int p1);
    }
    
    public class c extends Handler
    {
        public boolean a;
        
        public c(final Looper looper) {
            super(looper);
        }
        
        public final boolean a(final Message message, final S s) {
            final d d = (d)message.obj;
            if (!d.b) {
                return false;
            }
            if (++d.e > p0.g.o(p0.g.this).d(3)) {
                return false;
            }
            final r r = new r(d.a, s.o, s.p, s.q, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - d.c, s.r);
            final u u = new u(3);
            IOException ex;
            if (s.getCause() instanceof IOException) {
                ex = (IOException)s.getCause();
            }
            else {
                ex = new f(s.getCause());
            }
            final long c = p0.g.o(p0.g.this).c(new m.c(r, u, ex, d.e));
            if (c == -9223372036854775807L) {
                return false;
            }
            // monitorenter(this)
            while (true) {
                try {
                    if (!this.a) {
                        this.sendMessageDelayed(Message.obtain(message), c);
                        // monitorexit(this)
                        return true;
                    }
                    // monitorexit(this)
                    return false;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public void b(final int n, final Object o, final boolean b) {
            this.obtainMessage(n, (Object)new d(x0.r.a(), b, SystemClock.elapsedRealtime(), o)).sendToTarget();
        }
        
        public void c() {
            synchronized (this) {
                this.removeCallbacksAndMessages((Object)null);
                this.a = true;
            }
        }
        
        public void handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.obj:Ljava/lang/Object;
            //     4: checkcast       Lp0/g$d;
            //     7: astore          5
            //     9: aload_1        
            //    10: getfield        android/os/Message.what:I
            //    13: istore_2       
            //    14: iload_2        
            //    15: iconst_1       
            //    16: if_icmpeq       63
            //    19: iload_2        
            //    20: iconst_2       
            //    21: if_icmpne       55
            //    24: aload_0        
            //    25: getfield        p0/g$c.b:Lp0/g;
            //    28: invokestatic    p0/g.n:(Lp0/g;)Lp0/Q;
            //    31: aload_0        
            //    32: getfield        p0/g$c.b:Lp0/g;
            //    35: invokestatic    p0/g.m:(Lp0/g;)Ljava/util/UUID;
            //    38: aload           5
            //    40: getfield        p0/g$d.d:Ljava/lang/Object;
            //    43: checkcast       Lp0/F$a;
            //    46: invokeinterface p0/Q.b:(Ljava/util/UUID;Lp0/F$a;)[B
            //    51: astore_3       
            //    52: goto            119
            //    55: new             Ljava/lang/RuntimeException;
            //    58: dup            
            //    59: invokespecial   java/lang/RuntimeException.<init>:()V
            //    62: athrow         
            //    63: aload_0        
            //    64: getfield        p0/g$c.b:Lp0/g;
            //    67: invokestatic    p0/g.n:(Lp0/g;)Lp0/Q;
            //    70: aload_0        
            //    71: getfield        p0/g$c.b:Lp0/g;
            //    74: invokestatic    p0/g.m:(Lp0/g;)Ljava/util/UUID;
            //    77: aload           5
            //    79: getfield        p0/g$d.d:Ljava/lang/Object;
            //    82: checkcast       Lp0/F$d;
            //    85: invokeinterface p0/Q.a:(Ljava/util/UUID;Lp0/F$d;)[B
            //    90: astore_3       
            //    91: goto            119
            //    94: ldc             "DefaultDrmSession"
            //    96: ldc             "Key/provisioning request produced an unexpected exception. Not retrying."
            //    98: aload_3        
            //    99: invokestatic    g0/o.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   102: goto            119
            //   105: aload           4
            //   107: astore_3       
            //   108: aload_0        
            //   109: aload_1        
            //   110: aload           4
            //   112: invokevirtual   p0/g$c.a:(Landroid/os/Message;Lp0/S;)Z
            //   115: ifeq            119
            //   118: return         
            //   119: aload_0        
            //   120: getfield        p0/g$c.b:Lp0/g;
            //   123: invokestatic    p0/g.o:(Lp0/g;)LB0/m;
            //   126: aload           5
            //   128: getfield        p0/g$d.a:J
            //   131: invokeinterface B0/m.a:(J)V
            //   136: aload_0        
            //   137: monitorenter   
            //   138: aload_0        
            //   139: getfield        p0/g$c.a:Z
            //   142: ifne            174
            //   145: aload_0        
            //   146: getfield        p0/g$c.b:Lp0/g;
            //   149: invokestatic    p0/g.p:(Lp0/g;)Lp0/g$e;
            //   152: aload_1        
            //   153: getfield        android/os/Message.what:I
            //   156: aload           5
            //   158: getfield        p0/g$d.d:Ljava/lang/Object;
            //   161: aload_3        
            //   162: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
            //   165: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
            //   168: invokevirtual   android/os/Message.sendToTarget:()V
            //   171: goto            174
            //   174: aload_0        
            //   175: monitorexit    
            //   176: return         
            //   177: aload_0        
            //   178: monitorexit    
            //   179: aload_1        
            //   180: athrow         
            //   181: astore_3       
            //   182: goto            94
            //   185: astore          4
            //   187: goto            105
            //   190: astore_1       
            //   191: goto            177
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  9      14     185    119    Lp0/S;
            //  9      14     181    105    Ljava/lang/Exception;
            //  24     52     185    119    Lp0/S;
            //  24     52     181    105    Ljava/lang/Exception;
            //  55     63     185    119    Lp0/S;
            //  55     63     181    105    Ljava/lang/Exception;
            //  63     91     185    119    Lp0/S;
            //  63     91     181    105    Ljava/lang/Exception;
            //  138    171    190    181    Any
            //  174    176    190    181    Any
            //  177    179    190    181    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0174:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
    }
    
    public static final class d
    {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;
        
        public d(final long a, final boolean b, final long c, final Object d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public class e extends Handler
    {
        public e(final Looper looper) {
            super(looper);
        }
        
        public void handleMessage(final Message message) {
            final Pair pair = (Pair)message.obj;
            final Object first = pair.first;
            final Object second = pair.second;
            final int what = message.what;
            if (what == 1) {
                p0.g.this.E(first, second);
                return;
            }
            if (what != 2) {
                return;
            }
            p0.g.this.y(first, second);
        }
    }
    
    public static final class f extends IOException
    {
        public f(final Throwable cause) {
            super(cause);
        }
    }
}
