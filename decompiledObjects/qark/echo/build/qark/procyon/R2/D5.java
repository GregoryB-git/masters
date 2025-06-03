// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.concurrent.Future;
import android.util.Pair;
import android.content.Intent;
import java.util.Collections;
import java.math.BigInteger;
import android.content.pm.PackageManager$NameNotFoundException;
import G2.d;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.o6;
import java.util.SortedSet;
import com.google.android.gms.internal.measurement.I1;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.s7;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.V1;
import android.os.Build$VERSION;
import android.os.Build;
import com.google.android.gms.internal.measurement.i6;
import java.util.Locale;
import com.google.android.gms.internal.measurement.M6;
import android.os.Parcelable;
import java.util.TreeSet;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.L1;
import java.net.MalformedURLException;
import t.a;
import java.net.URL;
import android.net.Uri$Builder;
import com.google.android.gms.internal.measurement.H6;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.nio.ByteBuffer;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.Y1;
import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.internal.measurement.H0;
import A2.n;
import java.util.HashSet;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class D5 implements o3
{
    public static volatile D5 H;
    public long A;
    public final Map B;
    public final Map C;
    public final Map D;
    public w4 E;
    public String F;
    public final U5 G;
    public x2 a;
    public f2 b;
    public p c;
    public j2 d;
    public x5 e;
    public b6 f;
    public final N5 g;
    public u4 h;
    public g5 i;
    public final B5 j;
    public u2 k;
    public final N2 l;
    public boolean m;
    public boolean n;
    public long o;
    public List p;
    public final Set q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public FileLock w;
    public FileChannel x;
    public List y;
    public List z;
    
    public D5(final P5 p) {
        this(p, null);
    }
    
    public D5(final P5 p2, final N2 n2) {
        this.m = false;
        this.q = new HashSet();
        this.G = new K5(this);
        A2.n.i(p2);
        this.l = N2.c(p2.a, null, null);
        this.A = -1L;
        this.j = new B5(this);
        final N5 g = new N5(this);
        g.v();
        this.g = g;
        final f2 b = new f2(this);
        b.v();
        this.b = b;
        final x2 a = new x2(this);
        a.v();
        this.a = a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        this.e().D(new G5(this, p2));
    }
    
    private final void G(final List c) {
        A2.n.a(c.isEmpty() ^ true);
        if (this.y != null) {
            this.j().G().a("Set uploading progress before finishing the previous upload");
            return;
        }
        this.y = new ArrayList(c);
    }
    
    private final void M() {
        this.e().n();
        if (this.t || this.u || this.v) {
            this.j().K().d("Not stopping services. fetch, network, upload", this.t, this.u, this.v);
            return;
        }
        this.j().K().a("Stopping uploading service(s)");
        final List p = this.p;
        if (p == null) {
            return;
        }
        final Iterator<Runnable> iterator = p.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
        ((List)A2.n.i(this.p)).clear();
    }
    
    private final void N() {
        this.e().n();
        this.p0();
        if (this.o > 0L) {
            final long l = 3600000L - Math.abs(this.b().b() - this.o);
            if (l > 0L) {
                this.j().K().b("Upload has been suspended. Will update scheduling later in approximately ms", l);
                this.v0().c();
                this.w0().z();
                return;
            }
            this.o = 0L;
        }
        if (!this.l.s() || !this.O()) {
            this.j().K().a("Nothing to upload or uploading impossible");
            this.v0().c();
            this.w0().z();
            return;
        }
        final long a = this.b().a();
        this.c0();
        final long max = Math.max(0L, (long)K.C.a(null));
        final boolean b = this.e0().W0() || this.e0().V0();
        P1 p1;
        if (b) {
            final String n = this.c0().N();
            if (!TextUtils.isEmpty((CharSequence)n) && !".none.".equals(n)) {
                this.c0();
                p1 = K.x;
            }
            else {
                this.c0();
                p1 = K.w;
            }
        }
        else {
            this.c0();
            p1 = K.v;
        }
        final long max2 = Math.max(0L, (long)p1.a(null));
        final long a2 = this.i.g.a();
        final long a3 = this.i.h.a();
        final long max3 = Math.max(this.e0().z(), this.e0().A());
        long a5 = 0L;
        Label_0520: {
            Label_0308: {
                if (max3 != 0L) {
                    final long a4 = a - Math.abs(max3 - a);
                    final long abs = Math.abs(a2 - a);
                    final long b2 = a - Math.abs(a3 - a);
                    final long max4 = Math.max(a - abs, b2);
                    long n3;
                    final long n2 = n3 = a4 + max;
                    if (b) {
                        n3 = n2;
                        if (max4 > 0L) {
                            n3 = Math.min(a4, max4) + max2;
                        }
                    }
                    if (!this.m0().b0(max4, max2)) {
                        n3 = max4 + max2;
                    }
                    a5 = n3;
                    if (b2 == 0L) {
                        break Label_0520;
                    }
                    a5 = n3;
                    if (b2 >= a4) {
                        int n4 = 0;
                        while (true) {
                            this.c0();
                            if (n4 >= Math.min(20, Math.max(0, (int)K.E.a(null)))) {
                                break Label_0308;
                            }
                            this.c0();
                            a5 = n3 + Math.max(0L, (long)K.D.a(null)) * (1L << n4);
                            if (a5 > b2) {
                                break;
                            }
                            ++n4;
                            n3 = a5;
                        }
                    }
                    break Label_0520;
                }
            }
            a5 = 0L;
        }
        if (a5 == 0L) {
            this.j().K().a("Next upload time is 0");
            this.v0().c();
            this.w0().z();
            return;
        }
        if (!this.g0().A()) {
            this.j().K().a("No network");
            this.v0().b();
            this.w0().z();
            return;
        }
        final long a6 = this.i.f.a();
        this.c0();
        final long max5 = Math.max(0L, (long)K.t.a(null));
        long max6 = a5;
        if (!this.m0().b0(a6, max5)) {
            max6 = Math.max(a5, a6 + max5);
        }
        this.v0().c();
        long max7;
        if ((max7 = max6 - this.b().a()) <= 0L) {
            this.c0();
            max7 = Math.max(0L, (long)K.y.a(null));
            this.i.g.b(this.b().a());
        }
        this.j().K().b("Upload scheduled in approximately ms", max7);
        this.w0().y(max7);
    }
    
    private final boolean O() {
        this.e().n();
        this.p0();
        return this.e0().U0() || !TextUtils.isEmpty((CharSequence)this.e0().C());
    }
    
    private final boolean P() {
        this.e().n();
        final FileLock w = this.w;
        if (w != null && w.isValid()) {
            this.j().K().a("Storage concurrent access okay");
            return true;
        }
        final File file = new File(this.l.a().getFilesDir(), "google_app_measurement.db");
        while (true) {
            try {
                final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                this.x = channel;
                final FileLock tryLock = channel.tryLock();
                this.w = tryLock;
                if (tryLock != null) {
                    this.j().K().a("Storage concurrent access okay");
                    return true;
                }
                this.j().G().a("Storage concurrent data access panic");
                return false;
                final OverlappingFileLockException ex;
                this.j().G().b("Failed to acquire storage lock", ex);
                return false;
            }
            catch (OverlappingFileLockException ex3) {}
            catch (IOException ex4) {}
            catch (FileNotFoundException ex2) {}
            final FileNotFoundException ex2;
            final OverlappingFileLockException ex = (OverlappingFileLockException)ex2;
            continue;
        }
    }
    
    public static boolean d0(final W5 w5) {
        return !TextUtils.isEmpty((CharSequence)w5.p) || !TextUtils.isEmpty((CharSequence)w5.E);
    }
    
    public static C5 i(final C5 c5) {
        if (c5 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (c5.w()) {
            return c5;
        }
        final String value = String.valueOf(c5.getClass());
        final StringBuilder sb = new StringBuilder("Component not initialized: ");
        sb.append(value);
        throw new IllegalStateException(sb.toString());
    }
    
    public static D5 k(final Context context) {
        n.i(context);
        n.i(context.getApplicationContext());
        while (true) {
            if (D5.H == null) {
                // monitorenter(D5.class)
                while (true) {
                    try {
                        if (D5.H == null) {
                            D5.H = new D5((P5)n.i(new P5(context)));
                        }
                        // monitorexit(D5.class)
                        return D5.H;
                    }
                    // monitorexit(D5.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public static void v(final Y1.a a, final int n, final String s) {
        final List l = a.L();
        for (int i = 0; i < l.size(); ++i) {
            if ("_err".equals(l.get(i).c0())) {
                return;
            }
        }
        a.C((a2)((Y3.b)a2.Z().B("_err").y(n)).p()).C((a2)((Y3.b)a2.Z().B("_ev").D(s)).p());
    }
    
    public static void w(final Y1.a a, final String s) {
        final List l = a.L();
        for (int i = 0; i < l.size(); ++i) {
            if (s.equals(l.get(i).c0())) {
                a.x(i);
                return;
            }
        }
    }
    
    public final void A(final String s, final z z) {
        this.e().n();
        this.p0();
        if (n6.a()) {
            this.C.put(s, z);
            this.e0().W(s, z);
        }
    }
    
    public final void B(final String s, final q3 q3) {
        this.e().n();
        this.p0();
        this.B.put(s, q3);
        this.e0().X(s, q3);
    }
    
    public final void C(final String s, final w4 e) {
        this.e().n();
        final String f = this.F;
        if (f == null || f.equals(s) || e != null) {
            this.F = s;
            this.E = e;
        }
    }
    
    public final void D(final String s, final W5 w5) {
        this.e().n();
        this.p0();
        if (!d0(w5)) {
            return;
        }
        if (!w5.v) {
            this.g(w5);
            return;
        }
        if ("_npa".equals(s) && w5.F != null) {
            this.j().F().a("Falling back to manifest metadata value for ad personalization");
            final long a = this.b().a();
            long l;
            if (w5.F) {
                l = 1L;
            }
            else {
                l = 0L;
            }
            this.u(new R5("_npa", a, l, "auto"), w5);
            return;
        }
        this.j().F().b("Removing user property", this.l.D().g(s));
        this.e0().Q0();
        while (true) {
            try {
                this.g(w5);
                if ("_id".equals(s)) {
                    this.e0().L0((String)A2.n.i(w5.o), "_lair");
                }
                this.e0().L0((String)A2.n.i(w5.o), s);
                this.e0().T0();
                this.j().F().b("User property removed", this.l.D().g(s));
                this.e0().R0();
                return;
                this.e0().R0();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void E(final String s, final d2.a a) {
        final Set r = this.h0().R(s);
        if (r != null) {
            a.Z(r);
        }
        if (this.h0().b0(s)) {
            a.l0();
        }
        if (this.h0().e0(s)) {
            if (this.c0().B(s, K.B0)) {
                final String w0 = a.W0();
                if (!TextUtils.isEmpty((CharSequence)w0)) {
                    final int index = w0.indexOf(".");
                    if (index != -1) {
                        a.M0(w0.substring(0, index));
                    }
                }
            }
            else {
                a.E0();
            }
        }
        if (this.h0().f0(s)) {
            final int y = N5.y(a, "_id");
            if (y != -1) {
                a.R(y);
            }
        }
        if (this.h0().d0(s)) {
            a.p0();
        }
        if (this.h0().a0(s)) {
            a.c0();
            final b b = this.D.get(s);
            b b2 = null;
            Label_0251: {
                if (b != null) {
                    b2 = b;
                    if (b.b + this.c0().x(s, K.W) >= this.b().b()) {
                        break Label_0251;
                    }
                }
                b2 = new b((M5)null);
                this.D.put(s, b2);
            }
            a.D0(b2.a);
        }
        if (this.h0().c0(s)) {
            a.N0();
        }
    }
    
    public final void F(final String s, final boolean b) {
        final I2 d0 = this.e0().D0(s);
        if (d0 != null) {
            d0.G(b);
            if (d0.s()) {
                this.e0().U(d0);
            }
        }
    }
    
    public final void H(final boolean b) {
        this.N();
    }
    
    public final void I(final boolean p0, final int p1, final Throwable p2, final byte[] p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/D5.e:()LR2/G2;
        //     4: invokevirtual   R2/m3.n:()V
        //     7: aload_0        
        //     8: invokevirtual   R2/D5.p0:()V
        //    11: aload           4
        //    13: astore          5
        //    15: aload           4
        //    17: ifnonnull       28
        //    20: iconst_0       
        //    21: newarray        B
        //    23: astore          5
        //    25: goto            28
        //    28: aload_0        
        //    29: getfield        R2/D5.y:Ljava/util/List;
        //    32: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //    35: checkcast       Ljava/util/List;
        //    38: astore          4
        //    40: aload_0        
        //    41: aconst_null    
        //    42: putfield        R2/D5.y:Ljava/util/List;
        //    45: invokestatic    com/google/android/gms/internal/measurement/i6.a:()Z
        //    48: ifeq            72
        //    51: aload_0        
        //    52: invokevirtual   R2/D5.c0:()LR2/g;
        //    55: getstatic       R2/K.Y0:LR2/P1;
        //    58: invokevirtual   R2/g.s:(LR2/P1;)Z
        //    61: istore          6
        //    63: iload           6
        //    65: ifeq            72
        //    68: iload_1        
        //    69: ifeq            90
        //    72: iload_2        
        //    73: sipush          200
        //    76: if_icmpeq       86
        //    79: iload_2        
        //    80: sipush          204
        //    83: if_icmpne       522
        //    86: aload_3        
        //    87: ifnonnull       522
        //    90: invokestatic    com/google/android/gms/internal/measurement/i6.a:()Z
        //    93: ifeq            116
        //    96: aload_0        
        //    97: invokevirtual   R2/D5.c0:()LR2/g;
        //   100: getstatic       R2/K.Y0:LR2/P1;
        //   103: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   106: ifeq            116
        //   109: iload_1        
        //   110: ifeq            135
        //   113: goto            116
        //   116: aload_0        
        //   117: getfield        R2/D5.i:LR2/g5;
        //   120: getfield        R2/g5.g:LR2/q2;
        //   123: aload_0        
        //   124: invokevirtual   R2/D5.b:()LE2/e;
        //   127: invokeinterface E2/e.a:()J
        //   132: invokevirtual   R2/q2.b:(J)V
        //   135: aload_0        
        //   136: getfield        R2/D5.i:LR2/g5;
        //   139: getfield        R2/g5.h:LR2/q2;
        //   142: lconst_0       
        //   143: invokevirtual   R2/q2.b:(J)V
        //   146: aload_0        
        //   147: invokespecial   R2/D5.N:()V
        //   150: invokestatic    com/google/android/gms/internal/measurement/i6.a:()Z
        //   153: ifeq            216
        //   156: aload_0        
        //   157: invokevirtual   R2/D5.c0:()LR2/g;
        //   160: astore_3       
        //   161: getstatic       R2/K.Y0:LR2/P1;
        //   164: astore          9
        //   166: aload_3        
        //   167: aload           9
        //   169: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   172: ifeq            216
        //   175: iload_1        
        //   176: ifeq            182
        //   179: goto            216
        //   182: invokestatic    com/google/android/gms/internal/measurement/i6.a:()Z
        //   185: ifeq            239
        //   188: aload_0        
        //   189: invokevirtual   R2/D5.c0:()LR2/g;
        //   192: aload           9
        //   194: invokevirtual   R2/g.s:(LR2/P1;)Z
        //   197: ifeq            239
        //   200: aload_0        
        //   201: invokevirtual   R2/D5.j:()LR2/Y1;
        //   204: invokevirtual   R2/Y1.K:()LR2/a2;
        //   207: ldc_w           "Purged empty bundles"
        //   210: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //   213: goto            239
        //   216: aload_0        
        //   217: invokevirtual   R2/D5.j:()LR2/Y1;
        //   220: invokevirtual   R2/Y1.K:()LR2/a2;
        //   223: ldc_w           "Successful upload. Got network response. code, size"
        //   226: iload_2        
        //   227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   230: aload           5
        //   232: arraylength    
        //   233: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   236: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   239: aload_0        
        //   240: invokevirtual   R2/D5.e0:()LR2/p;
        //   243: invokevirtual   R2/p.Q0:()V
        //   246: aload           4
        //   248: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   253: astore_3       
        //   254: aload_3        
        //   255: invokeinterface java/util/Iterator.hasNext:()Z
        //   260: ifeq            401
        //   263: aload_3        
        //   264: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   269: checkcast       Ljava/lang/Long;
        //   272: astore          4
        //   274: aload_0        
        //   275: invokevirtual   R2/D5.e0:()LR2/p;
        //   278: astore          5
        //   280: aload           4
        //   282: invokevirtual   java/lang/Long.longValue:()J
        //   285: lstore          7
        //   287: aload           5
        //   289: invokevirtual   R2/m3.n:()V
        //   292: aload           5
        //   294: invokevirtual   R2/C5.u:()V
        //   297: aload           5
        //   299: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //   302: astore          9
        //   304: aload           9
        //   306: ldc_w           "queue"
        //   309: ldc_w           "rowid=?"
        //   312: iconst_1       
        //   313: anewarray       Ljava/lang/String;
        //   316: dup            
        //   317: iconst_0       
        //   318: lload           7
        //   320: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   323: aastore        
        //   324: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   327: iconst_1       
        //   328: if_icmpne       334
        //   331: goto            254
        //   334: new             Landroid/database/sqlite/SQLiteException;
        //   337: dup            
        //   338: ldc_w           "Deleted fewer rows from queue than expected"
        //   341: invokespecial   android/database/sqlite/SQLiteException.<init>:(Ljava/lang/String;)V
        //   344: athrow         
        //   345: astore_3       
        //   346: goto            463
        //   349: astore          9
        //   351: aload           5
        //   353: invokevirtual   R2/m3.j:()LR2/Y1;
        //   356: invokevirtual   R2/Y1.G:()LR2/a2;
        //   359: ldc_w           "Failed to delete a bundle in a queue table"
        //   362: aload           9
        //   364: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   367: aload           9
        //   369: athrow         
        //   370: astore          5
        //   372: aload_0        
        //   373: getfield        R2/D5.z:Ljava/util/List;
        //   376: astore          9
        //   378: aload           9
        //   380: ifnull          398
        //   383: aload           9
        //   385: aload           4
        //   387: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   392: ifeq            398
        //   395: goto            254
        //   398: aload           5
        //   400: athrow         
        //   401: aload_0        
        //   402: invokevirtual   R2/D5.e0:()LR2/p;
        //   405: invokevirtual   R2/p.T0:()V
        //   408: aload_0        
        //   409: invokevirtual   R2/D5.e0:()LR2/p;
        //   412: invokevirtual   R2/p.R0:()V
        //   415: aload_0        
        //   416: aconst_null    
        //   417: putfield        R2/D5.z:Ljava/util/List;
        //   420: aload_0        
        //   421: invokevirtual   R2/D5.g0:()LR2/f2;
        //   424: invokevirtual   R2/f2.A:()Z
        //   427: ifeq            444
        //   430: aload_0        
        //   431: invokespecial   R2/D5.O:()Z
        //   434: ifeq            444
        //   437: aload_0        
        //   438: invokevirtual   R2/D5.t0:()V
        //   441: goto            455
        //   444: aload_0        
        //   445: ldc2_w          -1
        //   448: putfield        R2/D5.A:J
        //   451: aload_0        
        //   452: invokespecial   R2/D5.N:()V
        //   455: aload_0        
        //   456: lconst_0       
        //   457: putfield        R2/D5.o:J
        //   460: goto            605
        //   463: aload_0        
        //   464: invokevirtual   R2/D5.e0:()LR2/p;
        //   467: invokevirtual   R2/p.R0:()V
        //   470: aload_3        
        //   471: athrow         
        //   472: aload_0        
        //   473: invokevirtual   R2/D5.j:()LR2/Y1;
        //   476: invokevirtual   R2/Y1.G:()LR2/a2;
        //   479: ldc_w           "Database error while trying to delete uploaded bundles"
        //   482: aload_3        
        //   483: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   486: aload_0        
        //   487: aload_0        
        //   488: invokevirtual   R2/D5.b:()LE2/e;
        //   491: invokeinterface E2/e.b:()J
        //   496: putfield        R2/D5.o:J
        //   499: aload_0        
        //   500: invokevirtual   R2/D5.j:()LR2/Y1;
        //   503: invokevirtual   R2/Y1.K:()LR2/a2;
        //   506: ldc_w           "Disable upload, time"
        //   509: aload_0        
        //   510: getfield        R2/D5.o:J
        //   513: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   516: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   519: goto            605
        //   522: aload_0        
        //   523: invokevirtual   R2/D5.j:()LR2/Y1;
        //   526: invokevirtual   R2/Y1.K:()LR2/a2;
        //   529: ldc_w           "Network upload failed. Will retry later. code, error"
        //   532: iload_2        
        //   533: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   536: aload_3        
        //   537: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   540: aload_0        
        //   541: getfield        R2/D5.i:LR2/g5;
        //   544: getfield        R2/g5.h:LR2/q2;
        //   547: aload_0        
        //   548: invokevirtual   R2/D5.b:()LE2/e;
        //   551: invokeinterface E2/e.a:()J
        //   556: invokevirtual   R2/q2.b:(J)V
        //   559: iload_2        
        //   560: sipush          503
        //   563: if_icmpeq       573
        //   566: iload_2        
        //   567: sipush          429
        //   570: if_icmpne       592
        //   573: aload_0        
        //   574: getfield        R2/D5.i:LR2/g5;
        //   577: getfield        R2/g5.f:LR2/q2;
        //   580: aload_0        
        //   581: invokevirtual   R2/D5.b:()LE2/e;
        //   584: invokeinterface E2/e.a:()J
        //   589: invokevirtual   R2/q2.b:(J)V
        //   592: aload_0        
        //   593: invokevirtual   R2/D5.e0:()LR2/p;
        //   596: aload           4
        //   598: invokevirtual   R2/p.a0:(Ljava/util/List;)V
        //   601: aload_0        
        //   602: invokespecial   R2/D5.N:()V
        //   605: aload_0        
        //   606: iconst_0       
        //   607: putfield        R2/D5.u:Z
        //   610: aload_0        
        //   611: invokespecial   R2/D5.M:()V
        //   614: return         
        //   615: aload_0        
        //   616: iconst_0       
        //   617: putfield        R2/D5.u:Z
        //   620: aload_0        
        //   621: invokespecial   R2/D5.M:()V
        //   624: aload_3        
        //   625: athrow         
        //   626: astore_3       
        //   627: goto            615
        //   630: astore_3       
        //   631: goto            472
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     25     626    630    Any
        //  28     63     626    630    Any
        //  90     109    630    522    Landroid/database/sqlite/SQLiteException;
        //  90     109    626    630    Any
        //  116    135    630    522    Landroid/database/sqlite/SQLiteException;
        //  116    135    626    630    Any
        //  135    175    630    522    Landroid/database/sqlite/SQLiteException;
        //  135    175    626    630    Any
        //  182    213    630    522    Landroid/database/sqlite/SQLiteException;
        //  182    213    626    630    Any
        //  216    239    630    522    Landroid/database/sqlite/SQLiteException;
        //  216    239    626    630    Any
        //  239    246    630    522    Landroid/database/sqlite/SQLiteException;
        //  239    246    626    630    Any
        //  246    254    345    349    Any
        //  254    274    345    349    Any
        //  274    304    370    401    Landroid/database/sqlite/SQLiteException;
        //  274    304    345    349    Any
        //  304    331    349    370    Landroid/database/sqlite/SQLiteException;
        //  304    331    345    349    Any
        //  334    345    349    370    Landroid/database/sqlite/SQLiteException;
        //  334    345    345    349    Any
        //  351    370    370    401    Landroid/database/sqlite/SQLiteException;
        //  351    370    345    349    Any
        //  372    378    345    349    Any
        //  383    395    345    349    Any
        //  398    401    345    349    Any
        //  401    408    345    349    Any
        //  408    441    630    522    Landroid/database/sqlite/SQLiteException;
        //  408    441    626    630    Any
        //  444    455    630    522    Landroid/database/sqlite/SQLiteException;
        //  444    455    626    630    Any
        //  455    460    630    522    Landroid/database/sqlite/SQLiteException;
        //  455    460    626    630    Any
        //  463    472    630    522    Landroid/database/sqlite/SQLiteException;
        //  463    472    626    630    Any
        //  472    519    626    630    Any
        //  522    559    626    630    Any
        //  573    592    626    630    Any
        //  592    605    626    630    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0334:
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
    
    public final boolean J(final int n, final FileChannel fileChannel) {
        this.e().n();
        if (fileChannel != null && fileChannel.isOpen()) {
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(n);
            allocate.flip();
            Label_0093: {
                try {
                    fileChannel.truncate(0L);
                    fileChannel.write(allocate);
                    fileChannel.force(true);
                    if (fileChannel.size() != 4L) {
                        this.j().G().b("Error writing to channel. Bytes written", fileChannel.size());
                        return true;
                    }
                }
                catch (IOException ex) {
                    break Label_0093;
                }
                return true;
            }
            final IOException ex;
            this.j().G().b("Failed to write to channel", ex);
            return false;
        }
        this.j().G().a("Bad channel to read from");
        return false;
    }
    
    public final boolean K(final Y1.a a, final Y1.a a2) {
        A2.n.a("_e".equals(a.K()));
        this.m0();
        final a2 g = N5.G((Y1)((Y3.b)a).p(), "_sc");
        String d0 = null;
        Object d2;
        if (g == null) {
            d2 = null;
        }
        else {
            d2 = g.d0();
        }
        this.m0();
        final a2 g2 = N5.G((Y1)((Y3.b)a2).p(), "_pc");
        if (g2 != null) {
            d0 = g2.d0();
        }
        if (d0 != null && d0.equals(d2)) {
            A2.n.a("_e".equals(a.K()));
            this.m0();
            final a2 g3 = N5.G((Y1)((Y3.b)a).p(), "_et");
            if (g3 != null && g3.h0()) {
                if (g3.X() > 0L) {
                    final long x = g3.X();
                    this.m0();
                    final a2 g4 = N5.G((Y1)((Y3.b)a2).p(), "_et");
                    long l = x;
                    if (g4 != null) {
                        l = x;
                        if (g4.X() > 0L) {
                            l = x + g4.X();
                        }
                    }
                    this.m0();
                    N5.R(a2, "_et", l);
                    this.m0();
                    N5.R(a, "_fr", 1L);
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean L(final String p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          23
        //     5: aload_0        
        //     6: invokevirtual   R2/D5.e0:()LR2/p;
        //     9: invokevirtual   R2/p.Q0:()V
        //    12: new             LR2/D5$a;
        //    15: dup            
        //    16: aload_0        
        //    17: aconst_null    
        //    18: invokespecial   R2/D5$a.<init>:(LR2/D5;LR2/L5;)V
        //    21: astore          22
        //    23: aload_0        
        //    24: invokevirtual   R2/D5.e0:()LR2/p;
        //    27: astore          24
        //    29: aload_0        
        //    30: getfield        R2/D5.A:J
        //    33: lstore          12
        //    35: aload           22
        //    37: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: pop            
        //    41: aload           24
        //    43: invokevirtual   R2/m3.n:()V
        //    46: aload           24
        //    48: invokevirtual   R2/C5.u:()V
        //    51: aload           24
        //    53: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //    56: astore          25
        //    58: aconst_null    
        //    59: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    62: istore          14
        //    64: ldc_w           ""
        //    67: astore_1       
        //    68: iload           14
        //    70: ifeq            294
        //    73: lload           12
        //    75: ldc2_w          -1
        //    78: lcmp           
        //    79: istore          4
        //    81: iload           4
        //    83: ifeq            112
        //    86: iconst_2       
        //    87: anewarray       Ljava/lang/String;
        //    90: astore          17
        //    92: aload           17
        //    94: iconst_0       
        //    95: lload           12
        //    97: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   100: aastore        
        //   101: aload           17
        //   103: iconst_1       
        //   104: lload_2        
        //   105: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   108: aastore        
        //   109: goto            5486
        //   112: iconst_1       
        //   113: anewarray       Ljava/lang/String;
        //   116: astore          17
        //   118: aload           17
        //   120: iconst_0       
        //   121: lload_2        
        //   122: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   125: aastore        
        //   126: goto            5486
        //   129: new             Ljava/lang/StringBuilder;
        //   132: dup            
        //   133: ldc_w           "select app_id, metadata_fingerprint from raw_events where "
        //   136: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   139: astore          18
        //   141: aload           18
        //   143: aload_1        
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: pop            
        //   148: aload           18
        //   150: ldc_w           "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: pop            
        //   157: aload           25
        //   159: aload           18
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: aload           17
        //   166: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   169: astore_1       
        //   170: aload_1        
        //   171: astore          18
        //   173: aload_1        
        //   174: astore          17
        //   176: aload_1        
        //   177: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   182: istore          14
        //   184: iload           14
        //   186: ifne            202
        //   189: aload_1        
        //   190: invokeinterface android/database/Cursor.close:()V
        //   195: goto            1086
        //   198: astore_1       
        //   199: goto            5460
        //   202: aload_1        
        //   203: astore          18
        //   205: aload_1        
        //   206: astore          17
        //   208: aload_1        
        //   209: iconst_0       
        //   210: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   215: astore          21
        //   217: aload_1        
        //   218: astore          18
        //   220: aload_1        
        //   221: astore          19
        //   223: aload           21
        //   225: astore          20
        //   227: aload_1        
        //   228: iconst_1       
        //   229: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   234: astore          17
        //   236: aload_1        
        //   237: astore          18
        //   239: aload_1        
        //   240: astore          19
        //   242: aload           21
        //   244: astore          20
        //   246: aload_1        
        //   247: invokeinterface android/database/Cursor.close:()V
        //   252: aload           17
        //   254: astore          19
        //   256: aload           21
        //   258: astore          17
        //   260: aload_1        
        //   261: astore          18
        //   263: goto            435
        //   266: astore_1       
        //   267: goto            5446
        //   270: astore          18
        //   272: aload           20
        //   274: astore          17
        //   276: aload           19
        //   278: astore_1       
        //   279: aload           18
        //   281: astore          19
        //   283: goto            1055
        //   286: astore          19
        //   288: aload           17
        //   290: astore_1       
        //   291: goto            5480
        //   294: lload           12
        //   296: ldc2_w          -1
        //   299: lcmp           
        //   300: istore          4
        //   302: iload           4
        //   304: ifeq            330
        //   307: iconst_2       
        //   308: anewarray       Ljava/lang/String;
        //   311: astore          17
        //   313: aload           17
        //   315: iconst_0       
        //   316: aconst_null    
        //   317: aastore        
        //   318: aload           17
        //   320: iconst_1       
        //   321: lload           12
        //   323: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   326: aastore        
        //   327: goto            5498
        //   330: iconst_1       
        //   331: anewarray       Ljava/lang/String;
        //   334: dup            
        //   335: iconst_0       
        //   336: aconst_null    
        //   337: aastore        
        //   338: astore          17
        //   340: goto            5498
        //   343: new             Ljava/lang/StringBuilder;
        //   346: dup            
        //   347: ldc_w           "select metadata_fingerprint from raw_events where app_id = ?"
        //   350: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   353: astore          18
        //   355: aload           18
        //   357: aload_1        
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: aload           18
        //   364: ldc_w           " order by rowid limit 1;"
        //   367: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   370: pop            
        //   371: aload           25
        //   373: aload           18
        //   375: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   378: aload           17
        //   380: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   383: astore_1       
        //   384: aload_1        
        //   385: astore          18
        //   387: aload_1        
        //   388: astore          17
        //   390: aload_1        
        //   391: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   396: ifne            402
        //   399: goto            189
        //   402: aload_1        
        //   403: astore          18
        //   405: aload_1        
        //   406: astore          17
        //   408: aload_1        
        //   409: iconst_0       
        //   410: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   415: astore          19
        //   417: aload_1        
        //   418: astore          18
        //   420: aload_1        
        //   421: astore          17
        //   423: aload_1        
        //   424: invokeinterface android/database/Cursor.close:()V
        //   429: aconst_null    
        //   430: astore          17
        //   432: aload_1        
        //   433: astore          18
        //   435: aload           25
        //   437: ldc_w           "raw_events_metadata"
        //   440: iconst_1       
        //   441: anewarray       Ljava/lang/String;
        //   444: dup            
        //   445: iconst_0       
        //   446: ldc_w           "metadata"
        //   449: aastore        
        //   450: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   453: iconst_2       
        //   454: anewarray       Ljava/lang/String;
        //   457: dup            
        //   458: iconst_0       
        //   459: aload           17
        //   461: aastore        
        //   462: dup            
        //   463: iconst_1       
        //   464: aload           19
        //   466: aastore        
        //   467: aconst_null    
        //   468: aconst_null    
        //   469: ldc_w           "rowid"
        //   472: ldc_w           "2"
        //   475: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   478: astore_1       
        //   479: aload_1        
        //   480: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   485: istore          14
        //   487: iload           14
        //   489: ifne            536
        //   492: aload           24
        //   494: invokevirtual   R2/m3.j:()LR2/Y1;
        //   497: invokevirtual   R2/Y1.G:()LR2/a2;
        //   500: ldc_w           "Raw event metadata record is missing. appId"
        //   503: aload           17
        //   505: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   508: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   511: aload_1        
        //   512: invokeinterface android/database/Cursor.close:()V
        //   517: goto            1086
        //   520: astore          17
        //   522: aload_1        
        //   523: astore          18
        //   525: aload           17
        //   527: astore_1       
        //   528: goto            5446
        //   531: astore          19
        //   533: goto            1055
        //   536: aload_1        
        //   537: iconst_0       
        //   538: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   543: astore          18
        //   545: invokestatic    com/google/android/gms/internal/measurement/d2.A3:()Lcom/google/android/gms/internal/measurement/d2$a;
        //   548: aload           18
        //   550: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   553: checkcast       Lcom/google/android/gms/internal/measurement/d2$a;
        //   556: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   559: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   562: checkcast       Lcom/google/android/gms/internal/measurement/d2;
        //   565: astore          18
        //   567: aload_1        
        //   568: invokeinterface android/database/Cursor.moveToNext:()Z
        //   573: istore          14
        //   575: iload           14
        //   577: ifeq            599
        //   580: aload           24
        //   582: invokevirtual   R2/m3.j:()LR2/Y1;
        //   585: invokevirtual   R2/Y1.L:()LR2/a2;
        //   588: ldc_w           "Get multiple raw event metadata records, expected one. appId"
        //   591: aload           17
        //   593: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   596: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   599: aload_1        
        //   600: invokeinterface android/database/Cursor.close:()V
        //   605: aload           22
        //   607: aload           18
        //   609: invokeinterface R2/t.a:(Lcom/google/android/gms/internal/measurement/d2;)V
        //   614: lload           12
        //   616: ldc2_w          -1
        //   619: lcmp           
        //   620: ifeq            655
        //   623: ldc_w           "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
        //   626: astore          18
        //   628: iconst_3       
        //   629: anewarray       Ljava/lang/String;
        //   632: dup            
        //   633: iconst_0       
        //   634: aload           17
        //   636: aastore        
        //   637: dup            
        //   638: iconst_1       
        //   639: aload           19
        //   641: aastore        
        //   642: dup            
        //   643: iconst_2       
        //   644: lload           12
        //   646: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   649: aastore        
        //   650: astore          19
        //   652: goto            676
        //   655: iconst_2       
        //   656: anewarray       Ljava/lang/String;
        //   659: dup            
        //   660: iconst_0       
        //   661: aload           17
        //   663: aastore        
        //   664: dup            
        //   665: iconst_1       
        //   666: aload           19
        //   668: aastore        
        //   669: astore          19
        //   671: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   674: astore          18
        //   676: aload           25
        //   678: ldc_w           "raw_events"
        //   681: iconst_4       
        //   682: anewarray       Ljava/lang/String;
        //   685: dup            
        //   686: iconst_0       
        //   687: ldc_w           "rowid"
        //   690: aastore        
        //   691: dup            
        //   692: iconst_1       
        //   693: ldc_w           "name"
        //   696: aastore        
        //   697: dup            
        //   698: iconst_2       
        //   699: ldc_w           "timestamp"
        //   702: aastore        
        //   703: dup            
        //   704: iconst_3       
        //   705: ldc_w           "data"
        //   708: aastore        
        //   709: aload           18
        //   711: aload           19
        //   713: aconst_null    
        //   714: aconst_null    
        //   715: ldc_w           "rowid"
        //   718: aconst_null    
        //   719: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   722: astore          21
        //   724: aload           21
        //   726: astore          18
        //   728: aload           21
        //   730: astore          19
        //   732: aload           17
        //   734: astore          20
        //   736: aload           21
        //   738: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   743: ifne            783
        //   746: aload           21
        //   748: astore          18
        //   750: aload           21
        //   752: astore          19
        //   754: aload           17
        //   756: astore          20
        //   758: aload           24
        //   760: invokevirtual   R2/m3.j:()LR2/Y1;
        //   763: invokevirtual   R2/Y1.L:()LR2/a2;
        //   766: ldc_w           "Raw event data disappeared while in transaction. appId"
        //   769: aload           17
        //   771: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   774: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   777: aload           21
        //   779: astore_1       
        //   780: goto            189
        //   783: aload           21
        //   785: astore          18
        //   787: aload           21
        //   789: astore          19
        //   791: aload           17
        //   793: astore          20
        //   795: aload           21
        //   797: iconst_0       
        //   798: invokeinterface android/database/Cursor.getLong:(I)J
        //   803: lstore_2       
        //   804: aload           21
        //   806: astore          18
        //   808: aload           21
        //   810: astore          19
        //   812: aload           17
        //   814: astore          20
        //   816: aload           21
        //   818: iconst_3       
        //   819: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   824: astore_1       
        //   825: aload           21
        //   827: astore          18
        //   829: aload           21
        //   831: astore          19
        //   833: aload           17
        //   835: astore          20
        //   837: invokestatic    com/google/android/gms/internal/measurement/Y1.Z:()Lcom/google/android/gms/internal/measurement/Y1$a;
        //   840: aload_1        
        //   841: invokestatic    R2/N5.H:(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
        //   844: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //   847: astore_1       
        //   848: aload           21
        //   850: astore          18
        //   852: aload           21
        //   854: astore          19
        //   856: aload           17
        //   858: astore          20
        //   860: aload_1        
        //   861: aload           21
        //   863: iconst_1       
        //   864: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   869: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.E:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //   872: aload           21
        //   874: iconst_2       
        //   875: invokeinterface android/database/Cursor.getLong:(I)J
        //   880: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.G:(J)Lcom/google/android/gms/internal/measurement/Y1$a;
        //   883: pop            
        //   884: aload           21
        //   886: astore          18
        //   888: aload           21
        //   890: astore          19
        //   892: aload           17
        //   894: astore          20
        //   896: aload           22
        //   898: lload_2        
        //   899: aload_1        
        //   900: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //   903: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //   906: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //   909: invokeinterface R2/t.b:(JLcom/google/android/gms/internal/measurement/Y1;)Z
        //   914: ifne            956
        //   917: aload           21
        //   919: astore_1       
        //   920: goto            189
        //   923: astore_1       
        //   924: aload           21
        //   926: astore          18
        //   928: aload           21
        //   930: astore          19
        //   932: aload           17
        //   934: astore          20
        //   936: aload           24
        //   938: invokevirtual   R2/m3.j:()LR2/Y1;
        //   941: invokevirtual   R2/Y1.G:()LR2/a2;
        //   944: ldc_w           "Data loss. Failed to merge raw event. appId"
        //   947: aload           17
        //   949: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   952: aload_1        
        //   953: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   956: aload           21
        //   958: astore          18
        //   960: aload           21
        //   962: astore          19
        //   964: aload           17
        //   966: astore          20
        //   968: aload           21
        //   970: invokeinterface android/database/Cursor.moveToNext:()Z
        //   975: istore          14
        //   977: iload           14
        //   979: ifne            783
        //   982: aload           21
        //   984: astore_1       
        //   985: goto            189
        //   988: astore          17
        //   990: aload_1        
        //   991: astore          18
        //   993: aload           17
        //   995: astore_1       
        //   996: goto            5446
        //   999: astore          18
        //  1001: goto            279
        //  1004: astore          17
        //  1006: goto            990
        //  1009: astore          18
        //  1011: goto            1001
        //  1014: astore          18
        //  1016: aload           24
        //  1018: invokevirtual   R2/m3.j:()LR2/Y1;
        //  1021: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1024: ldc_w           "Data loss. Failed to merge raw event metadata. appId"
        //  1027: aload           17
        //  1029: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1032: aload           18
        //  1034: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1037: aload_1        
        //  1038: invokeinterface android/database/Cursor.close:()V
        //  1043: goto            1086
        //  1046: astore_1       
        //  1047: goto            5446
        //  1050: astore          19
        //  1052: aload           18
        //  1054: astore_1       
        //  1055: aload_1        
        //  1056: astore          18
        //  1058: aload           24
        //  1060: invokevirtual   R2/m3.j:()LR2/Y1;
        //  1063: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1066: ldc_w           "Data loss. Error selecting raw event. appId"
        //  1069: aload           17
        //  1071: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1074: aload           19
        //  1076: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1079: aload_1        
        //  1080: ifnull          1086
        //  1083: goto            189
        //  1086: aload           22
        //  1088: getfield        R2/D5$a.c:Ljava/util/List;
        //  1091: astore_1       
        //  1092: aload_1        
        //  1093: ifnull          5430
        //  1096: aload_1        
        //  1097: invokeinterface java/util/List.isEmpty:()Z
        //  1102: ifeq            1108
        //  1105: goto            5430
        //  1108: aload           22
        //  1110: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1113: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  1116: checkcast       Lcom/google/android/gms/internal/measurement/d2$a;
        //  1119: invokevirtual   com/google/android/gms/internal/measurement/d2$a.t0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  1122: astore          20
        //  1124: aconst_null    
        //  1125: astore          17
        //  1127: aconst_null    
        //  1128: astore          18
        //  1130: iconst_0       
        //  1131: istore          7
        //  1133: iconst_0       
        //  1134: istore          4
        //  1136: iconst_0       
        //  1137: istore          14
        //  1139: iconst_m1      
        //  1140: istore          5
        //  1142: iconst_m1      
        //  1143: istore          6
        //  1145: aload           23
        //  1147: astore_1       
        //  1148: aload           22
        //  1150: getfield        R2/D5$a.c:Ljava/util/List;
        //  1153: invokeinterface java/util/List.size:()I
        //  1158: istore          8
        //  1160: ldc_w           "_et"
        //  1163: astore          25
        //  1165: ldc_w           "_fr"
        //  1168: astore          24
        //  1170: iload           7
        //  1172: iload           8
        //  1174: if_icmpge       5670
        //  1177: aload           22
        //  1179: getfield        R2/D5$a.c:Ljava/util/List;
        //  1182: iload           7
        //  1184: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1189: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  1192: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  1195: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1198: astore          21
        //  1200: aload_0        
        //  1201: invokevirtual   R2/D5.h0:()LR2/x2;
        //  1204: aload           22
        //  1206: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1209: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1212: aload           21
        //  1214: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1217: invokevirtual   R2/x2.O:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1220: istore          15
        //  1222: iload           15
        //  1224: ifeq            1353
        //  1227: aload_0        
        //  1228: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1231: invokevirtual   R2/Y1.L:()LR2/a2;
        //  1234: ldc_w           "Dropping blocked raw event. appId"
        //  1237: aload           22
        //  1239: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1242: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1245: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1248: aload_0        
        //  1249: getfield        R2/D5.l:LR2/N2;
        //  1252: invokevirtual   R2/N2.D:()LR2/X1;
        //  1255: aload           21
        //  1257: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1260: invokevirtual   R2/X1.c:(Ljava/lang/String;)Ljava/lang/String;
        //  1263: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1266: aload_0        
        //  1267: invokevirtual   R2/D5.h0:()LR2/x2;
        //  1270: aload           22
        //  1272: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1275: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1278: invokevirtual   R2/x2.X:(Ljava/lang/String;)Z
        //  1281: ifne            5510
        //  1284: aload_0        
        //  1285: invokevirtual   R2/D5.h0:()LR2/x2;
        //  1288: aload           22
        //  1290: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1293: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1296: invokevirtual   R2/x2.Z:(Ljava/lang/String;)Z
        //  1299: ifeq            1305
        //  1302: goto            5510
        //  1305: ldc_w           "_err"
        //  1308: aload           21
        //  1310: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1313: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1316: ifne            5510
        //  1319: aload_0        
        //  1320: invokevirtual   R2/D5.n0:()LR2/S5;
        //  1323: pop            
        //  1324: aload_0        
        //  1325: getfield        R2/D5.G:LR2/U5;
        //  1328: aload           22
        //  1330: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1333: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1336: bipush          11
        //  1338: ldc_w           "_ev"
        //  1341: aload           21
        //  1343: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1346: iconst_0       
        //  1347: invokestatic    R2/S5.N:(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //  1350: goto            5510
        //  1353: aload_1        
        //  1354: astore          19
        //  1356: aload           21
        //  1358: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1361: aload_1        
        //  1362: invokestatic    R2/r3.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1365: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1368: ifeq            1491
        //  1371: aload           21
        //  1373: aload_1        
        //  1374: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.E:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1377: pop            
        //  1378: aload_0        
        //  1379: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1382: invokevirtual   R2/Y1.K:()LR2/a2;
        //  1385: ldc_w           "Renaming ad_impression to _ai"
        //  1388: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  1391: aload_1        
        //  1392: astore          19
        //  1394: aload_0        
        //  1395: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1398: iconst_5       
        //  1399: invokevirtual   R2/Y1.C:(I)Z
        //  1402: ifeq            1491
        //  1405: iconst_0       
        //  1406: istore          8
        //  1408: aload_1        
        //  1409: astore          19
        //  1411: iload           8
        //  1413: aload           21
        //  1415: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.w:()I
        //  1418: if_icmpge       1491
        //  1421: ldc_w           "ad_platform"
        //  1424: aload           21
        //  1426: iload           8
        //  1428: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1431: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  1434: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1437: ifeq            5513
        //  1440: aload           21
        //  1442: iload           8
        //  1444: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1447: invokevirtual   com/google/android/gms/internal/measurement/a2.d0:()Ljava/lang/String;
        //  1450: invokevirtual   java/lang/String.isEmpty:()Z
        //  1453: ifne            5513
        //  1456: ldc_w           "admob"
        //  1459: aload           21
        //  1461: iload           8
        //  1463: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1466: invokevirtual   com/google/android/gms/internal/measurement/a2.d0:()Ljava/lang/String;
        //  1469: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1472: ifeq            5513
        //  1475: aload_0        
        //  1476: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1479: invokevirtual   R2/Y1.M:()LR2/a2;
        //  1482: ldc_w           "AdMob ad impression logged from app. Potentially duplicative."
        //  1485: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  1488: goto            5513
        //  1491: aload           19
        //  1493: astore          23
        //  1495: aload_0        
        //  1496: invokevirtual   R2/D5.h0:()LR2/x2;
        //  1499: aload           22
        //  1501: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1504: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1507: aload           21
        //  1509: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1512: invokevirtual   R2/x2.M:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1515: istore          16
        //  1517: iload           16
        //  1519: ifne            5542
        //  1522: aload_0        
        //  1523: invokevirtual   R2/D5.m0:()LR2/N5;
        //  1526: pop            
        //  1527: aload           21
        //  1529: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1532: astore_1       
        //  1533: aload_1        
        //  1534: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1537: pop            
        //  1538: aload_1        
        //  1539: invokevirtual   java/lang/String.hashCode:()I
        //  1542: ldc_w           95027
        //  1545: if_icmpeq       1551
        //  1548: goto            5522
        //  1551: aload_1        
        //  1552: ldc_w           "_ui"
        //  1555: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1558: ifeq            5522
        //  1561: goto            5542
        //  1564: aload           21
        //  1566: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.w:()I
        //  1569: istore          11
        //  1571: iload           10
        //  1573: iload           11
        //  1575: if_icmpge       1696
        //  1578: ldc_w           "_c"
        //  1581: aload           21
        //  1583: iload           10
        //  1585: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1588: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  1591: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1594: ifeq            1637
        //  1597: aload           21
        //  1599: iload           10
        //  1601: aload           21
        //  1603: iload           10
        //  1605: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1608: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  1611: checkcast       Lcom/google/android/gms/internal/measurement/a2$a;
        //  1614: lconst_1       
        //  1615: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1618: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  1621: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  1624: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  1627: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.z:(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1630: pop            
        //  1631: iconst_1       
        //  1632: istore          8
        //  1634: goto            5561
        //  1637: ldc_w           "_r"
        //  1640: aload           21
        //  1642: iload           10
        //  1644: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1647: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  1650: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1653: ifeq            5561
        //  1656: aload           21
        //  1658: iload           10
        //  1660: aload           21
        //  1662: iload           10
        //  1664: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  1667: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  1670: checkcast       Lcom/google/android/gms/internal/measurement/a2$a;
        //  1673: lconst_1       
        //  1674: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1677: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  1680: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  1683: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  1686: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.z:(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1689: pop            
        //  1690: iconst_1       
        //  1691: istore          9
        //  1693: goto            5561
        //  1696: aload_1        
        //  1697: astore          24
        //  1699: iload           8
        //  1701: ifne            5570
        //  1704: iload           16
        //  1706: ifeq            5570
        //  1709: aload_0        
        //  1710: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1713: invokevirtual   R2/Y1.K:()LR2/a2;
        //  1716: ldc_w           "Marking event as conversion"
        //  1719: aload_0        
        //  1720: getfield        R2/D5.l:LR2/N2;
        //  1723: invokevirtual   R2/N2.D:()LR2/X1;
        //  1726: aload           21
        //  1728: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1731: invokevirtual   R2/X1.c:(Ljava/lang/String;)Ljava/lang/String;
        //  1734: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1737: aload           21
        //  1739: invokestatic    com/google/android/gms/internal/measurement/a2.Z:()Lcom/google/android/gms/internal/measurement/a2$a;
        //  1742: ldc_w           "_c"
        //  1745: invokevirtual   com/google/android/gms/internal/measurement/a2$a.B:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1748: lconst_1       
        //  1749: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1752: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.B:(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1755: pop            
        //  1756: goto            1759
        //  1759: iload           9
        //  1761: ifne            1811
        //  1764: aload_0        
        //  1765: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1768: invokevirtual   R2/Y1.K:()LR2/a2;
        //  1771: ldc_w           "Marking event as real-time"
        //  1774: aload_0        
        //  1775: getfield        R2/D5.l:LR2/N2;
        //  1778: invokevirtual   R2/N2.D:()LR2/X1;
        //  1781: aload           21
        //  1783: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1786: invokevirtual   R2/X1.c:(Ljava/lang/String;)Ljava/lang/String;
        //  1789: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1792: aload           21
        //  1794: invokestatic    com/google/android/gms/internal/measurement/a2.Z:()Lcom/google/android/gms/internal/measurement/a2$a;
        //  1797: ldc_w           "_r"
        //  1800: invokevirtual   com/google/android/gms/internal/measurement/a2$a.B:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1803: lconst_1       
        //  1804: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  1807: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.B:(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  1810: pop            
        //  1811: aload_0        
        //  1812: invokevirtual   R2/D5.e0:()LR2/p;
        //  1815: aload_0        
        //  1816: invokevirtual   R2/D5.u0:()J
        //  1819: aload           22
        //  1821: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1824: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1827: iconst_0       
        //  1828: iconst_0       
        //  1829: iconst_0       
        //  1830: iconst_0       
        //  1831: iconst_1       
        //  1832: invokevirtual   R2/p.I:(JLjava/lang/String;ZZZZZ)LR2/q;
        //  1835: getfield        R2/q.e:J
        //  1838: lstore_2       
        //  1839: aload_0        
        //  1840: invokevirtual   R2/D5.c0:()LR2/g;
        //  1843: aload           22
        //  1845: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1848: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1851: invokevirtual   R2/g.A:(Ljava/lang/String;)I
        //  1854: istore          8
        //  1856: lload_2        
        //  1857: iload           8
        //  1859: i2l            
        //  1860: lcmp           
        //  1861: ifle            5573
        //  1864: aload           21
        //  1866: ldc_w           "_r"
        //  1869: invokestatic    R2/D5.w:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
        //  1872: goto            1875
        //  1875: aload           18
        //  1877: astore_1       
        //  1878: iload           14
        //  1880: istore          15
        //  1882: aload           19
        //  1884: astore          25
        //  1886: aload           24
        //  1888: astore          26
        //  1890: aload           21
        //  1892: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  1895: invokestatic    R2/S5.J0:(Ljava/lang/String;)Z
        //  1898: ifeq            2240
        //  1901: aload           18
        //  1903: astore_1       
        //  1904: iload           14
        //  1906: istore          15
        //  1908: aload           19
        //  1910: astore          25
        //  1912: aload           24
        //  1914: astore          26
        //  1916: iload           16
        //  1918: ifeq            2240
        //  1921: aload           18
        //  1923: astore_1       
        //  1924: iload           14
        //  1926: istore          15
        //  1928: aload           19
        //  1930: astore          25
        //  1932: aload           24
        //  1934: astore          26
        //  1936: aload_0        
        //  1937: invokevirtual   R2/D5.e0:()LR2/p;
        //  1940: aload_0        
        //  1941: invokevirtual   R2/D5.u0:()J
        //  1944: aload           22
        //  1946: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1949: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1952: iconst_0       
        //  1953: iconst_0       
        //  1954: iconst_1       
        //  1955: iconst_0       
        //  1956: iconst_0       
        //  1957: invokevirtual   R2/p.I:(JLjava/lang/String;ZZZZZ)LR2/q;
        //  1960: getfield        R2/q.c:J
        //  1963: aload_0        
        //  1964: invokevirtual   R2/D5.c0:()LR2/g;
        //  1967: aload           22
        //  1969: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  1972: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  1975: getstatic       R2/K.p:LR2/P1;
        //  1978: invokevirtual   R2/g.u:(Ljava/lang/String;LR2/P1;)I
        //  1981: i2l            
        //  1982: lcmp           
        //  1983: ifle            2240
        //  1986: aload_0        
        //  1987: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1990: invokevirtual   R2/Y1.L:()LR2/a2;
        //  1993: ldc_w           "Too many conversions. Not logging as conversion. appId"
        //  1996: aload           22
        //  1998: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  2001: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  2004: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  2007: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2010: iconst_m1      
        //  2011: istore          9
        //  2013: aconst_null    
        //  2014: astore_1       
        //  2015: iconst_0       
        //  2016: istore          10
        //  2018: iconst_0       
        //  2019: istore          8
        //  2021: iload           8
        //  2023: aload           21
        //  2025: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.w:()I
        //  2028: if_icmpge       2105
        //  2031: aload           21
        //  2033: iload           8
        //  2035: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.H:(I)Lcom/google/android/gms/internal/measurement/a2;
        //  2038: astore          26
        //  2040: ldc_w           "_c"
        //  2043: aload           26
        //  2045: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  2048: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2051: ifeq            2071
        //  2054: aload           26
        //  2056: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  2059: checkcast       Lcom/google/android/gms/internal/measurement/a2$a;
        //  2062: astore          25
        //  2064: iload           8
        //  2066: istore          11
        //  2068: goto            5579
        //  2071: iload           9
        //  2073: istore          11
        //  2075: aload_1        
        //  2076: astore          25
        //  2078: ldc_w           "_err"
        //  2081: aload           26
        //  2083: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  2086: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2089: ifeq            5579
        //  2092: iconst_1       
        //  2093: istore          10
        //  2095: iload           9
        //  2097: istore          11
        //  2099: aload_1        
        //  2100: astore          25
        //  2102: goto            5579
        //  2105: iload           10
        //  2107: ifeq            2140
        //  2110: aload_1        
        //  2111: ifnull          2140
        //  2114: aload           21
        //  2116: iload           9
        //  2118: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2121: pop            
        //  2122: aload           18
        //  2124: astore_1       
        //  2125: iload           14
        //  2127: istore          15
        //  2129: aload           19
        //  2131: astore          25
        //  2133: aload           24
        //  2135: astore          26
        //  2137: goto            2240
        //  2140: aload_1        
        //  2141: ifnull          2201
        //  2144: aload           21
        //  2146: iload           9
        //  2148: aload_1        
        //  2149: invokevirtual   com/google/android/gms/internal/measurement/k3.clone:()Ljava/lang/Object;
        //  2152: checkcast       Lcom/google/android/gms/internal/measurement/Y3$b;
        //  2155: checkcast       Lcom/google/android/gms/internal/measurement/a2$a;
        //  2158: ldc_w           "_err"
        //  2161: invokevirtual   com/google/android/gms/internal/measurement/a2$a.B:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  2164: ldc2_w          10
        //  2167: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  2170: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  2173: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  2176: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2179: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.z:(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2182: pop            
        //  2183: aload           18
        //  2185: astore_1       
        //  2186: iload           14
        //  2188: istore          15
        //  2190: aload           19
        //  2192: astore          25
        //  2194: aload           24
        //  2196: astore          26
        //  2198: goto            2240
        //  2201: aload_0        
        //  2202: invokevirtual   R2/D5.j:()LR2/Y1;
        //  2205: invokevirtual   R2/Y1.G:()LR2/a2;
        //  2208: ldc_w           "Did not find conversion parameter. appId"
        //  2211: aload           22
        //  2213: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  2216: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  2219: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  2222: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2225: aload           24
        //  2227: astore          26
        //  2229: aload           19
        //  2231: astore          25
        //  2233: iload           14
        //  2235: istore          15
        //  2237: aload           18
        //  2239: astore_1       
        //  2240: iload           16
        //  2242: ifeq            5608
        //  2245: new             Ljava/util/ArrayList;
        //  2248: dup            
        //  2249: aload           21
        //  2251: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.L:()Ljava/util/List;
        //  2254: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  2257: astore          18
        //  2259: iconst_0       
        //  2260: istore          8
        //  2262: iconst_m1      
        //  2263: istore          9
        //  2265: iconst_m1      
        //  2266: istore          10
        //  2268: aload           18
        //  2270: invokeinterface java/util/List.size:()I
        //  2275: istore          11
        //  2277: iload           8
        //  2279: iload           11
        //  2281: if_icmpge       2354
        //  2284: ldc_w           "value"
        //  2287: aload           18
        //  2289: iload           8
        //  2291: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2296: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2299: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  2302: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2305: ifeq            2315
        //  2308: iload           8
        //  2310: istore          11
        //  2312: goto            5595
        //  2315: iload           9
        //  2317: istore          11
        //  2319: ldc_w           "currency"
        //  2322: aload           18
        //  2324: iload           8
        //  2326: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2331: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2334: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  2337: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2340: ifeq            5595
        //  2343: iload           8
        //  2345: istore          10
        //  2347: iload           9
        //  2349: istore          11
        //  2351: goto            5595
        //  2354: iload           9
        //  2356: iconst_m1      
        //  2357: if_icmpeq       5608
        //  2360: aload           18
        //  2362: iload           9
        //  2364: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2369: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2372: invokevirtual   com/google/android/gms/internal/measurement/a2.h0:()Z
        //  2375: ifne            5611
        //  2378: aload           18
        //  2380: iload           9
        //  2382: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2387: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2390: invokevirtual   com/google/android/gms/internal/measurement/a2.f0:()Z
        //  2393: ifne            5611
        //  2396: aload_0        
        //  2397: invokevirtual   R2/D5.j:()LR2/Y1;
        //  2400: invokevirtual   R2/Y1.M:()LR2/a2;
        //  2403: ldc_w           "Value must be specified with a numeric type."
        //  2406: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  2409: aload           21
        //  2411: iload           9
        //  2413: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2416: pop            
        //  2417: aload           21
        //  2419: ldc_w           "_c"
        //  2422: invokestatic    R2/D5.w:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
        //  2425: aload           21
        //  2427: bipush          18
        //  2429: ldc_w           "value"
        //  2432: invokestatic    R2/D5.v:(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V
        //  2435: goto            5608
        //  2438: aload           18
        //  2440: iload           10
        //  2442: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2447: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  2450: invokevirtual   com/google/android/gms/internal/measurement/a2.d0:()Ljava/lang/String;
        //  2453: astore          18
        //  2455: aload           18
        //  2457: invokevirtual   java/lang/String.length:()I
        //  2460: iconst_3       
        //  2461: if_icmpeq       5620
        //  2464: goto            2494
        //  2467: iload           8
        //  2469: aload           18
        //  2471: invokevirtual   java/lang/String.length:()I
        //  2474: if_icmpge       2549
        //  2477: aload           18
        //  2479: iload           8
        //  2481: invokevirtual   java/lang/String.codePointAt:(I)I
        //  2484: istore          10
        //  2486: iload           10
        //  2488: invokestatic    java/lang/Character.isLetter:(I)Z
        //  2491: ifne            2536
        //  2494: aload_0        
        //  2495: invokevirtual   R2/D5.j:()LR2/Y1;
        //  2498: invokevirtual   R2/Y1.M:()LR2/a2;
        //  2501: ldc_w           "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
        //  2504: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  2507: aload           21
        //  2509: iload           9
        //  2511: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2514: pop            
        //  2515: aload           21
        //  2517: ldc_w           "_c"
        //  2520: invokestatic    R2/D5.w:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
        //  2523: aload           21
        //  2525: bipush          19
        //  2527: ldc_w           "currency"
        //  2530: invokestatic    R2/D5.v:(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V
        //  2533: goto            2549
        //  2536: iload           8
        //  2538: iload           10
        //  2540: invokestatic    java/lang/Character.charCount:(I)I
        //  2543: iadd           
        //  2544: istore          8
        //  2546: goto            2467
        //  2549: ldc_w           "_e"
        //  2552: aload           21
        //  2554: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  2557: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2560: ifeq            2647
        //  2563: aload_0        
        //  2564: invokevirtual   R2/D5.m0:()LR2/N5;
        //  2567: pop            
        //  2568: aload           21
        //  2570: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  2573: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  2576: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  2579: aload           26
        //  2581: invokestatic    R2/N5.G:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
        //  2584: ifnonnull       5645
        //  2587: aload_1        
        //  2588: ifnull          5634
        //  2591: aload_1        
        //  2592: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  2595: aload           21
        //  2597: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  2600: lsub           
        //  2601: invokestatic    java/lang/Math.abs:(J)J
        //  2604: ldc2_w          1000
        //  2607: lcmp           
        //  2608: ifgt            5634
        //  2611: aload_1        
        //  2612: invokevirtual   com/google/android/gms/internal/measurement/k3.clone:()Ljava/lang/Object;
        //  2615: checkcast       Lcom/google/android/gms/internal/measurement/Y3$b;
        //  2618: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2621: astore          17
        //  2623: aload_0        
        //  2624: aload           21
        //  2626: aload           17
        //  2628: invokevirtual   R2/D5.K:(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z
        //  2631: ifeq            5634
        //  2634: aload           20
        //  2636: iload           6
        //  2638: aload           17
        //  2640: invokevirtual   com/google/android/gms/internal/measurement/d2$a.y:(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  2643: pop            
        //  2644: goto            5626
        //  2647: ldc_w           "_vs"
        //  2650: aload           21
        //  2652: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  2655: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2658: ifeq            5645
        //  2661: aload_0        
        //  2662: invokevirtual   R2/D5.m0:()LR2/N5;
        //  2665: pop            
        //  2666: aload           21
        //  2668: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  2671: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  2674: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  2677: aload           25
        //  2679: invokestatic    R2/N5.G:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
        //  2682: ifnonnull       5645
        //  2685: aload           17
        //  2687: ifnull          5648
        //  2690: aload           17
        //  2692: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  2695: aload           21
        //  2697: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  2700: lsub           
        //  2701: invokestatic    java/lang/Math.abs:(J)J
        //  2704: ldc2_w          1000
        //  2707: lcmp           
        //  2708: ifgt            5648
        //  2711: aload           17
        //  2713: invokevirtual   com/google/android/gms/internal/measurement/k3.clone:()Ljava/lang/Object;
        //  2716: checkcast       Lcom/google/android/gms/internal/measurement/Y3$b;
        //  2719: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //  2722: astore_1       
        //  2723: aload_0        
        //  2724: aload_1        
        //  2725: aload           21
        //  2727: invokevirtual   R2/D5.K:(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z
        //  2730: ifeq            5648
        //  2733: aload           20
        //  2735: iload           5
        //  2737: aload_1        
        //  2738: invokevirtual   com/google/android/gms/internal/measurement/d2$a.y:(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  2741: pop            
        //  2742: goto            5626
        //  2745: aload           22
        //  2747: getfield        R2/D5$a.c:Ljava/util/List;
        //  2750: astore          18
        //  2752: aload           21
        //  2754: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  2757: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  2760: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  2763: astore          19
        //  2765: aload           18
        //  2767: iload           7
        //  2769: aload           19
        //  2771: invokeinterface java/util/List.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  2776: pop            
        //  2777: iload           4
        //  2779: iconst_1       
        //  2780: iadd           
        //  2781: istore          4
        //  2783: aload           20
        //  2785: aload           21
        //  2787: invokevirtual   com/google/android/gms/internal/measurement/d2$a.D:(Lcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  2790: pop            
        //  2791: iload           15
        //  2793: istore          14
        //  2795: aload_1        
        //  2796: astore          18
        //  2798: aload           23
        //  2800: astore_1       
        //  2801: goto            5661
        //  2804: iload           4
        //  2806: iload           5
        //  2808: if_icmpge       2973
        //  2811: aload           20
        //  2813: iload           4
        //  2815: invokevirtual   com/google/android/gms/internal/measurement/d2$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1;
        //  2818: astore_1       
        //  2819: ldc_w           "_e"
        //  2822: aload_1        
        //  2823: invokevirtual   com/google/android/gms/internal/measurement/Y1.b0:()Ljava/lang/String;
        //  2826: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2829: ifeq            2873
        //  2832: aload_0        
        //  2833: invokevirtual   R2/D5.m0:()LR2/N5;
        //  2836: pop            
        //  2837: aload_1        
        //  2838: ldc_w           "_fr"
        //  2841: invokestatic    R2/N5.G:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
        //  2844: ifnull          2873
        //  2847: aload           20
        //  2849: iload           4
        //  2851: invokevirtual   com/google/android/gms/internal/measurement/d2$a.L:(I)Lcom/google/android/gms/internal/measurement/d2$a;
        //  2854: pop            
        //  2855: iload           5
        //  2857: iconst_1       
        //  2858: isub           
        //  2859: istore          6
        //  2861: iload           4
        //  2863: iconst_1       
        //  2864: isub           
        //  2865: istore          7
        //  2867: lload_2        
        //  2868: lstore          12
        //  2870: goto            5686
        //  2873: aload_0        
        //  2874: invokevirtual   R2/D5.m0:()LR2/N5;
        //  2877: pop            
        //  2878: aload_1        
        //  2879: ldc_w           "_et"
        //  2882: invokestatic    R2/N5.G:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
        //  2885: astore_1       
        //  2886: iload           5
        //  2888: istore          6
        //  2890: iload           4
        //  2892: istore          7
        //  2894: lload_2        
        //  2895: lstore          12
        //  2897: aload_1        
        //  2898: ifnull          5686
        //  2901: aload_1        
        //  2902: invokevirtual   com/google/android/gms/internal/measurement/a2.h0:()Z
        //  2905: ifeq            5689
        //  2908: aload_1        
        //  2909: invokevirtual   com/google/android/gms/internal/measurement/a2.X:()J
        //  2912: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2915: astore_1       
        //  2916: goto            2919
        //  2919: iload           5
        //  2921: istore          6
        //  2923: iload           4
        //  2925: istore          7
        //  2927: lload_2        
        //  2928: lstore          12
        //  2930: aload_1        
        //  2931: ifnull          5686
        //  2934: iload           5
        //  2936: istore          6
        //  2938: iload           4
        //  2940: istore          7
        //  2942: lload_2        
        //  2943: lstore          12
        //  2945: aload_1        
        //  2946: invokevirtual   java/lang/Long.longValue:()J
        //  2949: lconst_0       
        //  2950: lcmp           
        //  2951: ifle            5686
        //  2954: lload_2        
        //  2955: aload_1        
        //  2956: invokevirtual   java/lang/Long.longValue:()J
        //  2959: ladd           
        //  2960: lstore          12
        //  2962: iload           5
        //  2964: istore          6
        //  2966: iload           4
        //  2968: istore          7
        //  2970: goto            5686
        //  2973: aload_0        
        //  2974: aload           20
        //  2976: lload_2        
        //  2977: iconst_0       
        //  2978: invokevirtual   R2/D5.x:(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V
        //  2981: aload           20
        //  2983: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Y0:()Ljava/util/List;
        //  2986: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2991: astore_1       
        //  2992: aload_1        
        //  2993: invokeinterface java/util/Iterator.hasNext:()Z
        //  2998: istore          15
        //  3000: iload           15
        //  3002: ifeq            3041
        //  3005: ldc_w           "_s"
        //  3008: aload_1        
        //  3009: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3014: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  3017: invokevirtual   com/google/android/gms/internal/measurement/Y1.b0:()Ljava/lang/String;
        //  3020: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3023: ifeq            2992
        //  3026: aload_0        
        //  3027: invokevirtual   R2/D5.e0:()LR2/p;
        //  3030: aload           20
        //  3032: invokevirtual   com/google/android/gms/internal/measurement/d2$a.S0:()Ljava/lang/String;
        //  3035: ldc_w           "_se"
        //  3038: invokevirtual   R2/p.L0:(Ljava/lang/String;Ljava/lang/String;)V
        //  3041: aload           20
        //  3043: ldc_w           "_sid"
        //  3046: invokestatic    R2/N5.y:(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I
        //  3049: iflt            3063
        //  3052: aload_0        
        //  3053: aload           20
        //  3055: lload_2        
        //  3056: iconst_1       
        //  3057: invokevirtual   R2/D5.x:(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V
        //  3060: goto            3110
        //  3063: aload           20
        //  3065: ldc_w           "_se"
        //  3068: invokestatic    R2/N5.y:(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I
        //  3071: istore          4
        //  3073: iload           4
        //  3075: iflt            3110
        //  3078: aload           20
        //  3080: iload           4
        //  3082: invokevirtual   com/google/android/gms/internal/measurement/d2$a.R:(I)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3085: pop            
        //  3086: aload_0        
        //  3087: invokevirtual   R2/D5.j:()LR2/Y1;
        //  3090: invokevirtual   R2/Y1.G:()LR2/a2;
        //  3093: ldc_w           "Session engagement user property is in the bundle without session ID. appId"
        //  3096: aload           22
        //  3098: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3101: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3104: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  3107: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  3110: aload_0        
        //  3111: invokevirtual   R2/D5.m0:()LR2/N5;
        //  3114: aload           20
        //  3116: invokevirtual   R2/N5.T:(Lcom/google/android/gms/internal/measurement/d2$a;)V
        //  3119: invokestatic    com/google/android/gms/internal/measurement/n6.a:()Z
        //  3122: ifeq            3207
        //  3125: aload_0        
        //  3126: invokevirtual   R2/D5.c0:()LR2/g;
        //  3129: getstatic       R2/K.T0:LR2/P1;
        //  3132: invokevirtual   R2/g.s:(LR2/P1;)Z
        //  3135: ifeq            3207
        //  3138: aload           22
        //  3140: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3143: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3146: astore_1       
        //  3147: aload_0        
        //  3148: invokevirtual   R2/D5.e:()LR2/G2;
        //  3151: invokevirtual   R2/m3.n:()V
        //  3154: aload_0        
        //  3155: invokevirtual   R2/D5.p0:()V
        //  3158: invokestatic    com/google/android/gms/internal/measurement/n6.a:()Z
        //  3161: ifeq            3207
        //  3164: aload_0        
        //  3165: invokevirtual   R2/D5.e0:()LR2/p;
        //  3168: aload_1        
        //  3169: invokevirtual   R2/p.D0:(Ljava/lang/String;)LR2/I2;
        //  3172: astore          17
        //  3174: aload           17
        //  3176: ifnonnull       3199
        //  3179: aload_0        
        //  3180: invokevirtual   R2/D5.j:()LR2/Y1;
        //  3183: invokevirtual   R2/Y1.G:()LR2/a2;
        //  3186: ldc_w           "Cannot fix consent fields without appInfo. appId"
        //  3189: aload_1        
        //  3190: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  3193: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  3196: goto            3207
        //  3199: aload_0        
        //  3200: aload           17
        //  3202: aload           20
        //  3204: invokevirtual   R2/D5.s:(LR2/I2;Lcom/google/android/gms/internal/measurement/d2$a;)V
        //  3207: aload           20
        //  3209: ldc2_w          9223372036854775807
        //  3212: invokevirtual   com/google/android/gms/internal/measurement/d2$a.v0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3215: ldc2_w          -9223372036854775808
        //  3218: invokevirtual   com/google/android/gms/internal/measurement/d2$a.e0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3221: pop            
        //  3222: iconst_0       
        //  3223: istore          4
        //  3225: iload           4
        //  3227: aload           20
        //  3229: invokevirtual   com/google/android/gms/internal/measurement/d2$a.w:()I
        //  3232: if_icmpge       3292
        //  3235: aload           20
        //  3237: iload           4
        //  3239: invokevirtual   com/google/android/gms/internal/measurement/d2$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1;
        //  3242: astore_1       
        //  3243: aload_1        
        //  3244: invokevirtual   com/google/android/gms/internal/measurement/Y1.Y:()J
        //  3247: aload           20
        //  3249: invokevirtual   com/google/android/gms/internal/measurement/d2$a.W:()J
        //  3252: lcmp           
        //  3253: ifge            3266
        //  3256: aload           20
        //  3258: aload_1        
        //  3259: invokevirtual   com/google/android/gms/internal/measurement/Y1.Y:()J
        //  3262: invokevirtual   com/google/android/gms/internal/measurement/d2$a.v0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3265: pop            
        //  3266: aload_1        
        //  3267: invokevirtual   com/google/android/gms/internal/measurement/Y1.Y:()J
        //  3270: aload           20
        //  3272: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Q:()J
        //  3275: lcmp           
        //  3276: ifle            5710
        //  3279: aload           20
        //  3281: aload_1        
        //  3282: invokevirtual   com/google/android/gms/internal/measurement/Y1.Y:()J
        //  3285: invokevirtual   com/google/android/gms/internal/measurement/d2$a.e0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3288: pop            
        //  3289: goto            5710
        //  3292: aload           20
        //  3294: invokevirtual   com/google/android/gms/internal/measurement/d2$a.P0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  3297: pop            
        //  3298: invokestatic    com/google/android/gms/internal/measurement/g7.a:()Z
        //  3301: ifeq            3682
        //  3304: aload_0        
        //  3305: invokevirtual   R2/D5.c0:()LR2/g;
        //  3308: aload           22
        //  3310: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3313: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3316: getstatic       R2/K.L0:LR2/P1;
        //  3319: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //  3322: ifeq            3682
        //  3325: aload_0        
        //  3326: invokevirtual   R2/D5.n0:()LR2/S5;
        //  3329: pop            
        //  3330: aload           22
        //  3332: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3335: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3338: invokestatic    R2/S5.D0:(Ljava/lang/String;)Z
        //  3341: ifeq            3682
        //  3344: aload_0        
        //  3345: aload           22
        //  3347: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3350: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3353: invokevirtual   R2/D5.Q:(Ljava/lang/String;)LR2/q3;
        //  3356: invokevirtual   R2/q3.x:()Z
        //  3359: ifeq            3682
        //  3362: aload           22
        //  3364: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3367: invokevirtual   com/google/android/gms/internal/measurement/d2.u0:()Z
        //  3370: ifeq            3682
        //  3373: iconst_0       
        //  3374: istore          4
        //  3376: iload           4
        //  3378: aload           22
        //  3380: getfield        R2/D5$a.c:Ljava/util/List;
        //  3383: invokeinterface java/util/List.size:()I
        //  3388: if_icmpge       3682
        //  3391: aload           22
        //  3393: getfield        R2/D5$a.c:Ljava/util/List;
        //  3396: iload           4
        //  3398: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3403: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  3406: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  3409: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //  3412: astore          17
        //  3414: aload           17
        //  3416: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.L:()Ljava/util/List;
        //  3419: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3424: astore_1       
        //  3425: aload_1        
        //  3426: invokeinterface java/util/Iterator.hasNext:()Z
        //  3431: ifeq            5724
        //  3434: ldc_w           "_c"
        //  3437: aload_1        
        //  3438: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3443: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  3446: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  3449: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3452: ifeq            3425
        //  3455: aload           22
        //  3457: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3460: invokevirtual   com/google/android/gms/internal/measurement/d2.k:()I
        //  3463: aload_0        
        //  3464: invokevirtual   R2/D5.c0:()LR2/g;
        //  3467: aload           22
        //  3469: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3472: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3475: getstatic       R2/K.X:LR2/P1;
        //  3478: invokevirtual   R2/g.u:(Ljava/lang/String;LR2/P1;)I
        //  3481: if_icmplt       3660
        //  3484: aload_0        
        //  3485: invokevirtual   R2/D5.c0:()LR2/g;
        //  3488: aload           22
        //  3490: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3493: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3496: getstatic       R2/K.N0:LR2/P1;
        //  3499: invokevirtual   R2/g.B:(Ljava/lang/String;LR2/P1;)Z
        //  3502: ifeq            5719
        //  3505: aload_0        
        //  3506: invokevirtual   R2/D5.n0:()LR2/S5;
        //  3509: invokevirtual   R2/S5.S0:()Ljava/lang/String;
        //  3512: astore_1       
        //  3513: aload           17
        //  3515: invokestatic    com/google/android/gms/internal/measurement/a2.Z:()Lcom/google/android/gms/internal/measurement/a2$a;
        //  3518: ldc_w           "_tu"
        //  3521: invokevirtual   com/google/android/gms/internal/measurement/a2$a.B:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  3524: aload_1        
        //  3525: invokevirtual   com/google/android/gms/internal/measurement/a2$a.D:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  3528: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  3531: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  3534: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  3537: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.C:(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  3540: pop            
        //  3541: goto            3544
        //  3544: aload           17
        //  3546: invokestatic    com/google/android/gms/internal/measurement/a2.Z:()Lcom/google/android/gms/internal/measurement/a2$a;
        //  3549: ldc_w           "_tr"
        //  3552: invokevirtual   com/google/android/gms/internal/measurement/a2$a.B:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
        //  3555: lconst_1       
        //  3556: invokevirtual   com/google/android/gms/internal/measurement/a2$a.y:(J)Lcom/google/android/gms/internal/measurement/a2$a;
        //  3559: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  3562: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  3565: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  3568: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.C:(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
        //  3571: pop            
        //  3572: aload_0        
        //  3573: invokevirtual   R2/D5.m0:()LR2/N5;
        //  3576: aload           22
        //  3578: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3581: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3584: aload           22
        //  3586: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3589: aload           17
        //  3591: aload_1        
        //  3592: invokevirtual   R2/N5.C:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2;Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)LR2/v5;
        //  3595: astore_1       
        //  3596: aload_1        
        //  3597: ifnull          3660
        //  3600: aload_0        
        //  3601: invokevirtual   R2/D5.j:()LR2/Y1;
        //  3604: invokevirtual   R2/Y1.K:()LR2/a2;
        //  3607: ldc_w           "Generated trigger URI. appId, uri"
        //  3610: aload           22
        //  3612: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3615: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3618: aload_1        
        //  3619: getfield        R2/v5.o:Ljava/lang/String;
        //  3622: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  3625: aload_0        
        //  3626: invokevirtual   R2/D5.e0:()LR2/p;
        //  3629: aload           22
        //  3631: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3634: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3637: aload_1        
        //  3638: invokevirtual   R2/p.h0:(Ljava/lang/String;LR2/v5;)Z
        //  3641: pop            
        //  3642: aload_0        
        //  3643: getfield        R2/D5.q:Ljava/util/Set;
        //  3646: aload           22
        //  3648: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3651: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3654: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  3659: pop            
        //  3660: aload           20
        //  3662: iload           4
        //  3664: aload           17
        //  3666: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  3669: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  3672: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  3675: invokevirtual   com/google/android/gms/internal/measurement/d2$a.z:(ILcom/google/android/gms/internal/measurement/Y1;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3678: pop            
        //  3679: goto            5724
        //  3682: aload           20
        //  3684: invokevirtual   com/google/android/gms/internal/measurement/d2$a.h0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  3687: aload_0        
        //  3688: invokevirtual   R2/D5.X:()LR2/b6;
        //  3691: aload           20
        //  3693: invokevirtual   com/google/android/gms/internal/measurement/d2$a.S0:()Ljava/lang/String;
        //  3696: aload           20
        //  3698: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Y0:()Ljava/util/List;
        //  3701: aload           20
        //  3703: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Z0:()Ljava/util/List;
        //  3706: aload           20
        //  3708: invokevirtual   com/google/android/gms/internal/measurement/d2$a.W:()J
        //  3711: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3714: aload           20
        //  3716: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Q:()J
        //  3719: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3722: invokevirtual   R2/b6.z:(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;
        //  3725: invokevirtual   com/google/android/gms/internal/measurement/d2$a.H:(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  3728: pop            
        //  3729: aload_0        
        //  3730: invokevirtual   R2/D5.c0:()LR2/g;
        //  3733: aload           22
        //  3735: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3738: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3741: invokevirtual   R2/g.L:(Ljava/lang/String;)Z
        //  3744: ifeq            5769
        //  3747: new             Ljava/util/HashMap;
        //  3750: dup            
        //  3751: invokespecial   java/util/HashMap.<init>:()V
        //  3754: astore          21
        //  3756: new             Ljava/util/ArrayList;
        //  3759: dup            
        //  3760: invokespecial   java/util/ArrayList.<init>:()V
        //  3763: astore          23
        //  3765: aload_0        
        //  3766: invokevirtual   R2/D5.n0:()LR2/S5;
        //  3769: invokevirtual   R2/S5.U0:()Ljava/security/SecureRandom;
        //  3772: astore          24
        //  3774: iconst_0       
        //  3775: istore          4
        //  3777: aload           20
        //  3779: astore          18
        //  3781: aload           22
        //  3783: astore          17
        //  3785: iload           4
        //  3787: aload           18
        //  3789: invokevirtual   com/google/android/gms/internal/measurement/d2$a.w:()I
        //  3792: if_icmpge       4794
        //  3795: aload           18
        //  3797: iload           4
        //  3799: invokevirtual   com/google/android/gms/internal/measurement/d2$a.x:(I)Lcom/google/android/gms/internal/measurement/Y1;
        //  3802: invokevirtual   com/google/android/gms/internal/measurement/Y3.x:()Lcom/google/android/gms/internal/measurement/Y3$b;
        //  3805: checkcast       Lcom/google/android/gms/internal/measurement/Y1$a;
        //  3808: astore          20
        //  3810: aload           20
        //  3812: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  3815: ldc_w           "_ep"
        //  3818: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3821: istore          15
        //  3823: iload           15
        //  3825: ifeq            4039
        //  3828: aload_0        
        //  3829: invokevirtual   R2/D5.m0:()LR2/N5;
        //  3832: pop            
        //  3833: aload           20
        //  3835: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  3838: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  3841: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  3844: ldc_w           "_en"
        //  3847: invokestatic    R2/N5.e0:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;
        //  3850: checkcast       Ljava/lang/String;
        //  3853: astore          22
        //  3855: aload           21
        //  3857: aload           22
        //  3859: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3864: checkcast       LR2/E;
        //  3867: astore          19
        //  3869: aload           19
        //  3871: astore_1       
        //  3872: aload           19
        //  3874: ifnonnull       3925
        //  3877: aload_0        
        //  3878: invokevirtual   R2/D5.e0:()LR2/p;
        //  3881: aload           17
        //  3883: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  3886: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  3889: aload           22
        //  3891: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3894: checkcast       Ljava/lang/String;
        //  3897: invokevirtual   R2/p.C0:(Ljava/lang/String;Ljava/lang/String;)LR2/E;
        //  3900: astore          19
        //  3902: aload           19
        //  3904: astore_1       
        //  3905: aload           19
        //  3907: ifnull          3925
        //  3910: aload           21
        //  3912: aload           22
        //  3914: aload           19
        //  3916: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  3921: pop            
        //  3922: aload           19
        //  3924: astore_1       
        //  3925: aload_1        
        //  3926: ifnull          4026
        //  3929: aload_1        
        //  3930: getfield        R2/E.i:Ljava/lang/Long;
        //  3933: ifnonnull       4026
        //  3936: aload_1        
        //  3937: getfield        R2/E.j:Ljava/lang/Long;
        //  3940: astore          19
        //  3942: aload           19
        //  3944: ifnull          3974
        //  3947: aload           19
        //  3949: invokevirtual   java/lang/Long.longValue:()J
        //  3952: lconst_1       
        //  3953: lcmp           
        //  3954: ifle            3974
        //  3957: aload_0        
        //  3958: invokevirtual   R2/D5.m0:()LR2/N5;
        //  3961: pop            
        //  3962: aload           20
        //  3964: ldc_w           "_sr"
        //  3967: aload_1        
        //  3968: getfield        R2/E.j:Ljava/lang/Long;
        //  3971: invokestatic    R2/N5.R:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
        //  3974: aload_1        
        //  3975: getfield        R2/E.k:Ljava/lang/Boolean;
        //  3978: astore_1       
        //  3979: aload_1        
        //  3980: ifnull          4007
        //  3983: aload_1        
        //  3984: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3987: ifeq            4007
        //  3990: aload_0        
        //  3991: invokevirtual   R2/D5.m0:()LR2/N5;
        //  3994: pop            
        //  3995: aload           20
        //  3997: ldc_w           "_efs"
        //  4000: lconst_1       
        //  4001: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4004: invokestatic    R2/N5.R:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
        //  4007: aload           23
        //  4009: aload           20
        //  4011: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4014: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4017: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4020: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4025: pop            
        //  4026: aload           18
        //  4028: iload           4
        //  4030: aload           20
        //  4032: invokevirtual   com/google/android/gms/internal/measurement/d2$a.y:(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  4035: pop            
        //  4036: goto            5757
        //  4039: aload_0        
        //  4040: invokevirtual   R2/D5.h0:()LR2/x2;
        //  4043: aload           17
        //  4045: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4048: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4051: invokevirtual   R2/x2.y:(Ljava/lang/String;)J
        //  4054: lstore_2       
        //  4055: aload_0        
        //  4056: invokevirtual   R2/D5.n0:()LR2/S5;
        //  4059: pop            
        //  4060: aload           20
        //  4062: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  4065: lload_2        
        //  4066: invokestatic    R2/S5.y:(JJ)J
        //  4069: lstore          12
        //  4071: aload           20
        //  4073: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4076: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4079: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4082: astore_1       
        //  4083: lconst_1       
        //  4084: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4087: astore          19
        //  4089: ldc_w           "_dbg"
        //  4092: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  4095: ifne            4206
        //  4098: aload_1        
        //  4099: invokevirtual   com/google/android/gms/internal/measurement/Y1.c0:()Ljava/util/List;
        //  4102: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  4107: astore_1       
        //  4108: aload_1        
        //  4109: invokeinterface java/util/Iterator.hasNext:()Z
        //  4114: ifeq            4206
        //  4117: aload_1        
        //  4118: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4123: checkcast       Lcom/google/android/gms/internal/measurement/a2;
        //  4126: astore          22
        //  4128: ldc_w           "_dbg"
        //  4131: aload           22
        //  4133: invokevirtual   com/google/android/gms/internal/measurement/a2.c0:()Ljava/lang/String;
        //  4136: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4139: ifeq            5739
        //  4142: aload           19
        //  4144: aload           22
        //  4146: invokevirtual   com/google/android/gms/internal/measurement/a2.X:()J
        //  4149: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4152: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  4155: ifne            5733
        //  4158: aload           19
        //  4160: instanceof      Ljava/lang/String;
        //  4163: ifeq            4179
        //  4166: aload           19
        //  4168: aload           22
        //  4170: invokevirtual   com/google/android/gms/internal/measurement/a2.d0:()Ljava/lang/String;
        //  4173: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  4176: ifne            5733
        //  4179: aload           19
        //  4181: instanceof      Ljava/lang/Double;
        //  4184: ifeq            4206
        //  4187: aload           19
        //  4189: aload           22
        //  4191: invokevirtual   com/google/android/gms/internal/measurement/a2.G:()D
        //  4194: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  4197: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  4200: ifeq            4206
        //  4203: goto            5733
        //  4206: aload_0        
        //  4207: invokevirtual   R2/D5.h0:()LR2/x2;
        //  4210: aload           17
        //  4212: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4215: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4218: aload           20
        //  4220: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4223: invokevirtual   R2/x2.I:(Ljava/lang/String;Ljava/lang/String;)I
        //  4226: istore          5
        //  4228: iload           5
        //  4230: ifgt            4278
        //  4233: aload_0        
        //  4234: invokevirtual   R2/D5.j:()LR2/Y1;
        //  4237: invokevirtual   R2/Y1.L:()LR2/a2;
        //  4240: ldc_w           "Sample rate must be positive. event, rate"
        //  4243: aload           20
        //  4245: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4248: iload           5
        //  4250: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4253: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  4256: aload           23
        //  4258: aload           20
        //  4260: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4263: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4266: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4269: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4274: pop            
        //  4275: goto            4026
        //  4278: aload           21
        //  4280: aload           20
        //  4282: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4285: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4290: checkcast       LR2/E;
        //  4293: astore_1       
        //  4294: aload_1        
        //  4295: ifnonnull       5742
        //  4298: aload_0        
        //  4299: invokevirtual   R2/D5.e0:()LR2/p;
        //  4302: aload           17
        //  4304: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4307: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4310: aload           20
        //  4312: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4315: invokevirtual   R2/p.C0:(Ljava/lang/String;Ljava/lang/String;)LR2/E;
        //  4318: astore          19
        //  4320: aload           19
        //  4322: astore_1       
        //  4323: aload           19
        //  4325: ifnonnull       4391
        //  4328: aload_0        
        //  4329: invokevirtual   R2/D5.j:()LR2/Y1;
        //  4332: invokevirtual   R2/Y1.L:()LR2/a2;
        //  4335: ldc_w           "Event being bundled has no eventAggregate. appId, eventName"
        //  4338: aload           17
        //  4340: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4343: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4346: aload           20
        //  4348: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4351: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  4354: new             LR2/E;
        //  4357: dup            
        //  4358: aload           17
        //  4360: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4363: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4366: aload           20
        //  4368: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4371: lconst_1       
        //  4372: lconst_1       
        //  4373: lconst_1       
        //  4374: aload           20
        //  4376: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  4379: lconst_0       
        //  4380: aconst_null    
        //  4381: aconst_null    
        //  4382: aconst_null    
        //  4383: aconst_null    
        //  4384: invokespecial   R2/E.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  4387: astore_1       
        //  4388: goto            4391
        //  4391: aload_0        
        //  4392: invokevirtual   R2/D5.m0:()LR2/N5;
        //  4395: pop            
        //  4396: aload           20
        //  4398: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4401: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4404: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4407: ldc_w           "_eid"
        //  4410: invokestatic    R2/N5.e0:(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;
        //  4413: checkcast       Ljava/lang/Long;
        //  4416: astore          19
        //  4418: aload           19
        //  4420: ifnull          5748
        //  4423: iconst_1       
        //  4424: istore          6
        //  4426: goto            5745
        //  4429: iload           5
        //  4431: iconst_1       
        //  4432: if_icmpne       4505
        //  4435: aload           23
        //  4437: aload           20
        //  4439: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4442: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4445: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4448: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4453: pop            
        //  4454: iload           6
        //  4456: ifeq            4026
        //  4459: aload_1        
        //  4460: getfield        R2/E.i:Ljava/lang/Long;
        //  4463: ifnonnull       4480
        //  4466: aload_1        
        //  4467: getfield        R2/E.j:Ljava/lang/Long;
        //  4470: ifnonnull       4480
        //  4473: aload_1        
        //  4474: getfield        R2/E.k:Ljava/lang/Boolean;
        //  4477: ifnull          4026
        //  4480: aload_1        
        //  4481: aconst_null    
        //  4482: aconst_null    
        //  4483: aconst_null    
        //  4484: invokevirtual   R2/E.c:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
        //  4487: astore_1       
        //  4488: aload           21
        //  4490: aload           20
        //  4492: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4495: aload_1        
        //  4496: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4501: pop            
        //  4502: goto            4026
        //  4505: aload           24
        //  4507: iload           5
        //  4509: invokevirtual   java/util/Random.nextInt:(I)I
        //  4512: ifne            4603
        //  4515: aload_0        
        //  4516: invokevirtual   R2/D5.m0:()LR2/N5;
        //  4519: pop            
        //  4520: iload           5
        //  4522: i2l            
        //  4523: lstore_2       
        //  4524: aload           20
        //  4526: ldc_w           "_sr"
        //  4529: lload_2        
        //  4530: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4533: invokestatic    R2/N5.R:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
        //  4536: aload           23
        //  4538: aload           20
        //  4540: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4543: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4546: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4549: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4554: pop            
        //  4555: aload_1        
        //  4556: astore          19
        //  4558: iload           6
        //  4560: ifeq            4575
        //  4563: aload_1        
        //  4564: aconst_null    
        //  4565: lload_2        
        //  4566: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4569: aconst_null    
        //  4570: invokevirtual   R2/E.c:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
        //  4573: astore          19
        //  4575: aload           21
        //  4577: aload           20
        //  4579: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4582: aload           19
        //  4584: aload           20
        //  4586: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  4589: lload           12
        //  4591: invokevirtual   R2/E.b:(JJ)LR2/E;
        //  4594: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4599: pop            
        //  4600: goto            4781
        //  4603: aload_1        
        //  4604: getfield        R2/E.h:Ljava/lang/Long;
        //  4607: astore          22
        //  4609: aload           22
        //  4611: ifnull          4623
        //  4614: aload           22
        //  4616: invokevirtual   java/lang/Long.longValue:()J
        //  4619: lstore_2       
        //  4620: goto            4638
        //  4623: aload_0        
        //  4624: invokevirtual   R2/D5.n0:()LR2/S5;
        //  4627: pop            
        //  4628: aload           20
        //  4630: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.F:()J
        //  4633: lload_2        
        //  4634: invokestatic    R2/S5.y:(JJ)J
        //  4637: lstore_2       
        //  4638: lload_2        
        //  4639: lload           12
        //  4641: lcmp           
        //  4642: ifeq            4752
        //  4645: aload_0        
        //  4646: invokevirtual   R2/D5.m0:()LR2/N5;
        //  4649: pop            
        //  4650: aload           20
        //  4652: ldc_w           "_efs"
        //  4655: lconst_1       
        //  4656: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4659: invokestatic    R2/N5.R:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
        //  4662: aload_0        
        //  4663: invokevirtual   R2/D5.m0:()LR2/N5;
        //  4666: pop            
        //  4667: iload           5
        //  4669: i2l            
        //  4670: lstore_2       
        //  4671: aload           20
        //  4673: ldc_w           "_sr"
        //  4676: lload_2        
        //  4677: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4680: invokestatic    R2/N5.R:(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
        //  4683: aload           23
        //  4685: aload           20
        //  4687: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  4690: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  4693: checkcast       Lcom/google/android/gms/internal/measurement/Y1;
        //  4696: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4701: pop            
        //  4702: aload_1        
        //  4703: astore          19
        //  4705: iload           6
        //  4707: ifeq            4724
        //  4710: aload_1        
        //  4711: aconst_null    
        //  4712: lload_2        
        //  4713: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4716: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  4719: invokevirtual   R2/E.c:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
        //  4722: astore          19
        //  4724: aload           21
        //  4726: aload           20
        //  4728: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4731: aload           19
        //  4733: aload           20
        //  4735: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.I:()J
        //  4738: lload           12
        //  4740: invokevirtual   R2/E.b:(JJ)LR2/E;
        //  4743: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4748: pop            
        //  4749: goto            5754
        //  4752: iload           6
        //  4754: ifeq            5754
        //  4757: aload           21
        //  4759: aload           20
        //  4761: invokevirtual   com/google/android/gms/internal/measurement/Y1$a.K:()Ljava/lang/String;
        //  4764: aload_1        
        //  4765: aload           19
        //  4767: aconst_null    
        //  4768: aconst_null    
        //  4769: invokevirtual   R2/E.c:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
        //  4772: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4777: pop            
        //  4778: goto            5754
        //  4781: aload           18
        //  4783: iload           4
        //  4785: aload           20
        //  4787: invokevirtual   com/google/android/gms/internal/measurement/d2$a.y:(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  4790: pop            
        //  4791: goto            5757
        //  4794: aload           18
        //  4796: astore_1       
        //  4797: aload           23
        //  4799: invokeinterface java/util/List.size:()I
        //  4804: aload_1        
        //  4805: invokevirtual   com/google/android/gms/internal/measurement/d2$a.w:()I
        //  4808: if_icmpge       4821
        //  4811: aload_1        
        //  4812: invokevirtual   com/google/android/gms/internal/measurement/d2$a.t0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  4815: aload           23
        //  4817: invokevirtual   com/google/android/gms/internal/measurement/d2$a.N:(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  4820: pop            
        //  4821: aload           21
        //  4823: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //  4828: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  4833: astore          18
        //  4835: aload           18
        //  4837: invokeinterface java/util/Iterator.hasNext:()Z
        //  4842: ifeq            5766
        //  4845: aload           18
        //  4847: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4852: checkcast       Ljava/util/Map$Entry;
        //  4855: astore          19
        //  4857: aload_0        
        //  4858: invokevirtual   R2/D5.e0:()LR2/p;
        //  4861: aload           19
        //  4863: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //  4868: checkcast       LR2/E;
        //  4871: invokevirtual   R2/p.T:(LR2/E;)V
        //  4874: goto            4835
        //  4877: aload           17
        //  4879: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4882: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4885: astore          18
        //  4887: aload_0        
        //  4888: invokevirtual   R2/D5.e0:()LR2/p;
        //  4891: aload           18
        //  4893: invokevirtual   R2/p.D0:(Ljava/lang/String;)LR2/I2;
        //  4896: astore          19
        //  4898: aload           19
        //  4900: ifnonnull       4930
        //  4903: aload_0        
        //  4904: invokevirtual   R2/D5.j:()LR2/Y1;
        //  4907: invokevirtual   R2/Y1.G:()LR2/a2;
        //  4910: ldc_w           "Bundling raw events w/o app info. appId"
        //  4913: aload           17
        //  4915: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  4918: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  4921: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  4924: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  4927: goto            5070
        //  4930: aload_1        
        //  4931: invokevirtual   com/google/android/gms/internal/measurement/d2$a.w:()I
        //  4934: ifle            5070
        //  4937: aload           19
        //  4939: invokevirtual   R2/I2.i0:()J
        //  4942: lstore_2       
        //  4943: lload_2        
        //  4944: lconst_0       
        //  4945: lcmp           
        //  4946: ifeq            4958
        //  4949: aload_1        
        //  4950: lload_2        
        //  4951: invokevirtual   com/google/android/gms/internal/measurement/d2$a.n0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  4954: pop            
        //  4955: goto            4963
        //  4958: aload_1        
        //  4959: invokevirtual   com/google/android/gms/internal/measurement/d2$a.H0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  4962: pop            
        //  4963: aload           19
        //  4965: invokevirtual   R2/I2.m0:()J
        //  4968: lstore          12
        //  4970: lload           12
        //  4972: lconst_0       
        //  4973: lcmp           
        //  4974: ifne            5779
        //  4977: goto            4980
        //  4980: lload_2        
        //  4981: lconst_0       
        //  4982: lcmp           
        //  4983: ifeq            4995
        //  4986: aload_1        
        //  4987: lload_2        
        //  4988: invokevirtual   com/google/android/gms/internal/measurement/d2$a.r0:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  4991: pop            
        //  4992: goto            5000
        //  4995: aload_1        
        //  4996: invokevirtual   com/google/android/gms/internal/measurement/d2$a.J0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  4999: pop            
        //  5000: aload           19
        //  5002: invokevirtual   R2/I2.p:()V
        //  5005: aload_1        
        //  5006: aload           19
        //  5008: invokevirtual   R2/I2.k0:()J
        //  5011: l2i            
        //  5012: invokevirtual   com/google/android/gms/internal/measurement/d2$a.i0:(I)Lcom/google/android/gms/internal/measurement/d2$a;
        //  5015: pop            
        //  5016: aload           19
        //  5018: aload_1        
        //  5019: invokevirtual   com/google/android/gms/internal/measurement/d2$a.W:()J
        //  5022: invokevirtual   R2/I2.j0:(J)V
        //  5025: aload           19
        //  5027: aload_1        
        //  5028: invokevirtual   com/google/android/gms/internal/measurement/d2$a.Q:()J
        //  5031: invokevirtual   R2/I2.f0:(J)V
        //  5034: aload           19
        //  5036: invokevirtual   R2/I2.s0:()Ljava/lang/String;
        //  5039: astore          20
        //  5041: aload           20
        //  5043: ifnull          5056
        //  5046: aload_1        
        //  5047: aload           20
        //  5049: invokevirtual   com/google/android/gms/internal/measurement/d2$a.K0:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;
        //  5052: pop            
        //  5053: goto            5061
        //  5056: aload_1        
        //  5057: invokevirtual   com/google/android/gms/internal/measurement/d2$a.x0:()Lcom/google/android/gms/internal/measurement/d2$a;
        //  5060: pop            
        //  5061: aload_0        
        //  5062: invokevirtual   R2/D5.e0:()LR2/p;
        //  5065: aload           19
        //  5067: invokevirtual   R2/p.U:(LR2/I2;)V
        //  5070: aload_1        
        //  5071: invokevirtual   com/google/android/gms/internal/measurement/d2$a.w:()I
        //  5074: ifle            5192
        //  5077: aload_0        
        //  5078: invokevirtual   R2/D5.h0:()LR2/x2;
        //  5081: aload           17
        //  5083: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  5086: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  5089: invokevirtual   R2/x2.L:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;
        //  5092: astore          19
        //  5094: aload           19
        //  5096: ifnull          5123
        //  5099: aload           19
        //  5101: invokevirtual   com/google/android/gms/internal/measurement/L1.b0:()Z
        //  5104: ifne            5110
        //  5107: goto            5123
        //  5110: aload_1        
        //  5111: aload           19
        //  5113: invokevirtual   com/google/android/gms/internal/measurement/L1.L:()J
        //  5116: invokevirtual   com/google/android/gms/internal/measurement/d2$a.M:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  5119: pop            
        //  5120: goto            5172
        //  5123: aload           17
        //  5125: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  5128: invokevirtual   com/google/android/gms/internal/measurement/d2.k0:()Ljava/lang/String;
        //  5131: invokevirtual   java/lang/String.isEmpty:()Z
        //  5134: ifeq            5148
        //  5137: aload_1        
        //  5138: ldc2_w          -1
        //  5141: invokevirtual   com/google/android/gms/internal/measurement/d2$a.M:(J)Lcom/google/android/gms/internal/measurement/d2$a;
        //  5144: pop            
        //  5145: goto            5172
        //  5148: aload_0        
        //  5149: invokevirtual   R2/D5.j:()LR2/Y1;
        //  5152: invokevirtual   R2/Y1.L:()LR2/a2;
        //  5155: ldc_w           "Did not find measurement config or missing version info. appId"
        //  5158: aload           17
        //  5160: getfield        R2/D5$a.a:Lcom/google/android/gms/internal/measurement/d2;
        //  5163: invokevirtual   com/google/android/gms/internal/measurement/d2.D3:()Ljava/lang/String;
        //  5166: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  5169: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  5172: aload_0        
        //  5173: invokevirtual   R2/D5.e0:()LR2/p;
        //  5176: aload_1        
        //  5177: invokevirtual   com/google/android/gms/internal/measurement/Y3$b.p:()Lcom/google/android/gms/internal/measurement/I4;
        //  5180: checkcast       Lcom/google/android/gms/internal/measurement/Y3;
        //  5183: checkcast       Lcom/google/android/gms/internal/measurement/d2;
        //  5186: iload           14
        //  5188: invokevirtual   R2/p.e0:(Lcom/google/android/gms/internal/measurement/d2;Z)Z
        //  5191: pop            
        //  5192: aload_0        
        //  5193: invokevirtual   R2/D5.e0:()LR2/p;
        //  5196: astore_1       
        //  5197: aload           17
        //  5199: getfield        R2/D5$a.b:Ljava/util/List;
        //  5202: astore          17
        //  5204: aload           17
        //  5206: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5209: pop            
        //  5210: aload_1        
        //  5211: invokevirtual   R2/m3.n:()V
        //  5214: aload_1        
        //  5215: invokevirtual   R2/C5.u:()V
        //  5218: new             Ljava/lang/StringBuilder;
        //  5221: dup            
        //  5222: ldc_w           "rowid in ("
        //  5225: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  5228: astore          19
        //  5230: iconst_0       
        //  5231: istore          4
        //  5233: iload           4
        //  5235: aload           17
        //  5237: invokeinterface java/util/List.size:()I
        //  5242: if_icmpge       5289
        //  5245: iload           4
        //  5247: ifeq            5259
        //  5250: aload           19
        //  5252: ldc_w           ","
        //  5255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5258: pop            
        //  5259: aload           19
        //  5261: aload           17
        //  5263: iload           4
        //  5265: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  5270: checkcast       Ljava/lang/Long;
        //  5273: invokevirtual   java/lang/Long.longValue:()J
        //  5276: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  5279: pop            
        //  5280: iload           4
        //  5282: iconst_1       
        //  5283: iadd           
        //  5284: istore          4
        //  5286: goto            5233
        //  5289: aload           19
        //  5291: ldc_w           ")"
        //  5294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5297: pop            
        //  5298: aload_1        
        //  5299: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //  5302: ldc_w           "raw_events"
        //  5305: aload           19
        //  5307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  5310: aconst_null    
        //  5311: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //  5314: istore          4
        //  5316: iload           4
        //  5318: aload           17
        //  5320: invokeinterface java/util/List.size:()I
        //  5325: if_icmpeq       5356
        //  5328: aload_1        
        //  5329: invokevirtual   R2/m3.j:()LR2/Y1;
        //  5332: invokevirtual   R2/Y1.G:()LR2/a2;
        //  5335: ldc_w           "Deleted fewer rows from raw events table than expected"
        //  5338: iload           4
        //  5340: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5343: aload           17
        //  5345: invokeinterface java/util/List.size:()I
        //  5350: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5353: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  5356: aload_0        
        //  5357: invokevirtual   R2/D5.e0:()LR2/p;
        //  5360: astore_1       
        //  5361: aload_1        
        //  5362: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //  5365: astore          17
        //  5367: aload           17
        //  5369: ldc_w           "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
        //  5372: iconst_2       
        //  5373: anewarray       Ljava/lang/String;
        //  5376: dup            
        //  5377: iconst_0       
        //  5378: aload           18
        //  5380: aastore        
        //  5381: dup            
        //  5382: iconst_1       
        //  5383: aload           18
        //  5385: aastore        
        //  5386: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  5389: goto            5414
        //  5392: astore          17
        //  5394: aload_1        
        //  5395: invokevirtual   R2/m3.j:()LR2/Y1;
        //  5398: invokevirtual   R2/Y1.G:()LR2/a2;
        //  5401: ldc_w           "Failed to remove unused event metadata. appId"
        //  5404: aload           18
        //  5406: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  5409: aload           17
        //  5411: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  5414: aload_0        
        //  5415: invokevirtual   R2/D5.e0:()LR2/p;
        //  5418: invokevirtual   R2/p.T0:()V
        //  5421: aload_0        
        //  5422: invokevirtual   R2/D5.e0:()LR2/p;
        //  5425: invokevirtual   R2/p.R0:()V
        //  5428: iconst_1       
        //  5429: ireturn        
        //  5430: aload_0        
        //  5431: invokevirtual   R2/D5.e0:()LR2/p;
        //  5434: invokevirtual   R2/p.T0:()V
        //  5437: aload_0        
        //  5438: invokevirtual   R2/D5.e0:()LR2/p;
        //  5441: invokevirtual   R2/p.R0:()V
        //  5444: iconst_0       
        //  5445: ireturn        
        //  5446: aload           18
        //  5448: ifnull          5458
        //  5451: aload           18
        //  5453: invokeinterface android/database/Cursor.close:()V
        //  5458: aload_1        
        //  5459: athrow         
        //  5460: aload_0        
        //  5461: invokevirtual   R2/D5.e0:()LR2/p;
        //  5464: invokevirtual   R2/p.R0:()V
        //  5467: aload_1        
        //  5468: athrow         
        //  5469: astore_1       
        //  5470: aconst_null    
        //  5471: astore          18
        //  5473: goto            5446
        //  5476: astore          19
        //  5478: aconst_null    
        //  5479: astore_1       
        //  5480: aconst_null    
        //  5481: astore          17
        //  5483: goto            1055
        //  5486: iload           4
        //  5488: ifeq            129
        //  5491: ldc_w           "rowid <= ? and "
        //  5494: astore_1       
        //  5495: goto            129
        //  5498: iload           4
        //  5500: ifeq            343
        //  5503: ldc_w           " and rowid <= ?"
        //  5506: astore_1       
        //  5507: goto            343
        //  5510: goto            5661
        //  5513: iload           8
        //  5515: iconst_1       
        //  5516: iadd           
        //  5517: istore          8
        //  5519: goto            1408
        //  5522: aload           18
        //  5524: astore_1       
        //  5525: ldc_w           "_et"
        //  5528: astore          25
        //  5530: ldc_w           "_fr"
        //  5533: astore          26
        //  5535: iload           14
        //  5537: istore          15
        //  5539: goto            2240
        //  5542: iconst_0       
        //  5543: istore          8
        //  5545: iconst_0       
        //  5546: istore          9
        //  5548: iconst_0       
        //  5549: istore          10
        //  5551: aload           25
        //  5553: astore          19
        //  5555: aload           24
        //  5557: astore_1       
        //  5558: goto            1564
        //  5561: iload           10
        //  5563: iconst_1       
        //  5564: iadd           
        //  5565: istore          10
        //  5567: goto            1564
        //  5570: goto            1759
        //  5573: iconst_1       
        //  5574: istore          14
        //  5576: goto            1875
        //  5579: iload           8
        //  5581: iconst_1       
        //  5582: iadd           
        //  5583: istore          8
        //  5585: iload           11
        //  5587: istore          9
        //  5589: aload           25
        //  5591: astore_1       
        //  5592: goto            2021
        //  5595: iload           8
        //  5597: iconst_1       
        //  5598: iadd           
        //  5599: istore          8
        //  5601: iload           11
        //  5603: istore          9
        //  5605: goto            2268
        //  5608: goto            2549
        //  5611: iload           10
        //  5613: iconst_m1      
        //  5614: if_icmpne       2438
        //  5617: goto            2494
        //  5620: iconst_0       
        //  5621: istore          8
        //  5623: goto            2467
        //  5626: aconst_null    
        //  5627: astore_1       
        //  5628: aconst_null    
        //  5629: astore          17
        //  5631: goto            2745
        //  5634: iload           4
        //  5636: istore          5
        //  5638: aload           21
        //  5640: astore          17
        //  5642: goto            2745
        //  5645: goto            5658
        //  5648: iload           4
        //  5650: istore          6
        //  5652: aload           21
        //  5654: astore_1       
        //  5655: goto            2745
        //  5658: goto            5642
        //  5661: iload           7
        //  5663: iconst_1       
        //  5664: iadd           
        //  5665: istore          7
        //  5667: goto            1148
        //  5670: lconst_0       
        //  5671: lstore_2       
        //  5672: iconst_0       
        //  5673: istore          6
        //  5675: iload           4
        //  5677: istore          5
        //  5679: iload           6
        //  5681: istore          4
        //  5683: goto            2804
        //  5686: goto            5694
        //  5689: aconst_null    
        //  5690: astore_1       
        //  5691: goto            2919
        //  5694: iload           7
        //  5696: iconst_1       
        //  5697: iadd           
        //  5698: istore          4
        //  5700: iload           6
        //  5702: istore          5
        //  5704: lload           12
        //  5706: lstore_2       
        //  5707: goto            2804
        //  5710: iload           4
        //  5712: iconst_1       
        //  5713: iadd           
        //  5714: istore          4
        //  5716: goto            3225
        //  5719: aconst_null    
        //  5720: astore_1       
        //  5721: goto            3544
        //  5724: iload           4
        //  5726: iconst_1       
        //  5727: iadd           
        //  5728: istore          4
        //  5730: goto            3376
        //  5733: iconst_1       
        //  5734: istore          5
        //  5736: goto            4228
        //  5739: goto            4108
        //  5742: goto            4391
        //  5745: goto            4429
        //  5748: iconst_0       
        //  5749: istore          6
        //  5751: goto            5745
        //  5754: goto            4781
        //  5757: iload           4
        //  5759: iconst_1       
        //  5760: iadd           
        //  5761: istore          4
        //  5763: goto            3785
        //  5766: goto            4877
        //  5769: aload           20
        //  5771: astore_1       
        //  5772: aload           22
        //  5774: astore          17
        //  5776: goto            4877
        //  5779: lload           12
        //  5781: lstore_2       
        //  5782: goto            4980
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  12     51     198    202    Any
        //  51     64     5476   5480   Landroid/database/sqlite/SQLiteException;
        //  51     64     5469   5476   Any
        //  86     109    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  86     109    5469   5476   Any
        //  112    126    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  112    126    5469   5476   Any
        //  129    170    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  129    170    5469   5476   Any
        //  176    184    286    294    Landroid/database/sqlite/SQLiteException;
        //  176    184    266    270    Any
        //  189    195    198    202    Any
        //  208    217    286    294    Landroid/database/sqlite/SQLiteException;
        //  208    217    266    270    Any
        //  227    236    270    279    Landroid/database/sqlite/SQLiteException;
        //  227    236    266    270    Any
        //  246    252    270    279    Landroid/database/sqlite/SQLiteException;
        //  246    252    266    270    Any
        //  307    313    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  307    313    5469   5476   Any
        //  318    327    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  318    327    5469   5476   Any
        //  330    340    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  330    340    5469   5476   Any
        //  343    384    5476   5480   Landroid/database/sqlite/SQLiteException;
        //  343    384    5469   5476   Any
        //  390    399    286    294    Landroid/database/sqlite/SQLiteException;
        //  390    399    266    270    Any
        //  408    417    286    294    Landroid/database/sqlite/SQLiteException;
        //  408    417    266    270    Any
        //  423    429    286    294    Landroid/database/sqlite/SQLiteException;
        //  423    429    266    270    Any
        //  435    479    1050   1055   Landroid/database/sqlite/SQLiteException;
        //  435    479    1046   1050   Any
        //  479    487    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  479    487    1004   1009   Any
        //  492    511    531    536    Landroid/database/sqlite/SQLiteException;
        //  492    511    520    531    Any
        //  511    517    198    202    Any
        //  536    545    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  536    545    1004   1009   Any
        //  545    567    1014   1046   Ljava/io/IOException;
        //  545    567    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  545    567    1004   1009   Any
        //  567    575    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  567    575    1004   1009   Any
        //  580    599    531    536    Landroid/database/sqlite/SQLiteException;
        //  580    599    520    531    Any
        //  599    614    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  599    614    1004   1009   Any
        //  655    671    1009   1014   Landroid/database/sqlite/SQLiteException;
        //  655    671    1004   1009   Any
        //  676    724    999    1001   Landroid/database/sqlite/SQLiteException;
        //  676    724    988    990    Any
        //  736    746    270    279    Landroid/database/sqlite/SQLiteException;
        //  736    746    266    270    Any
        //  758    777    270    279    Landroid/database/sqlite/SQLiteException;
        //  758    777    266    270    Any
        //  795    804    270    279    Landroid/database/sqlite/SQLiteException;
        //  795    804    266    270    Any
        //  816    825    270    279    Landroid/database/sqlite/SQLiteException;
        //  816    825    266    270    Any
        //  837    848    923    956    Ljava/io/IOException;
        //  837    848    270    279    Landroid/database/sqlite/SQLiteException;
        //  837    848    266    270    Any
        //  860    884    270    279    Landroid/database/sqlite/SQLiteException;
        //  860    884    266    270    Any
        //  896    917    270    279    Landroid/database/sqlite/SQLiteException;
        //  896    917    266    270    Any
        //  936    956    270    279    Landroid/database/sqlite/SQLiteException;
        //  936    956    266    270    Any
        //  968    977    270    279    Landroid/database/sqlite/SQLiteException;
        //  968    977    266    270    Any
        //  1016   1037   999    1001   Landroid/database/sqlite/SQLiteException;
        //  1016   1037   988    990    Any
        //  1037   1043   198    202    Any
        //  1058   1079   266    270    Any
        //  1086   1092   198    202    Any
        //  1096   1105   198    202    Any
        //  1108   1124   198    202    Any
        //  1148   1160   198    202    Any
        //  1177   1222   198    202    Any
        //  1227   1302   198    202    Any
        //  1305   1350   198    202    Any
        //  1356   1391   198    202    Any
        //  1394   1405   198    202    Any
        //  1411   1488   198    202    Any
        //  1495   1517   198    202    Any
        //  1522   1548   198    202    Any
        //  1551   1561   198    202    Any
        //  1564   1571   198    202    Any
        //  1578   1631   198    202    Any
        //  1637   1690   198    202    Any
        //  1709   1756   198    202    Any
        //  1764   1811   198    202    Any
        //  1811   1856   198    202    Any
        //  1864   1872   198    202    Any
        //  1890   1901   198    202    Any
        //  1936   2010   198    202    Any
        //  2021   2064   198    202    Any
        //  2078   2092   198    202    Any
        //  2114   2122   198    202    Any
        //  2144   2183   198    202    Any
        //  2201   2225   198    202    Any
        //  2245   2259   198    202    Any
        //  2268   2277   198    202    Any
        //  2284   2308   198    202    Any
        //  2319   2343   198    202    Any
        //  2360   2435   198    202    Any
        //  2438   2464   198    202    Any
        //  2467   2494   198    202    Any
        //  2494   2533   198    202    Any
        //  2536   2546   198    202    Any
        //  2549   2587   198    202    Any
        //  2591   2644   198    202    Any
        //  2647   2685   198    202    Any
        //  2690   2742   198    202    Any
        //  2745   2765   198    202    Any
        //  2765   2777   198    202    Any
        //  2783   2791   198    202    Any
        //  2811   2855   198    202    Any
        //  2873   2886   198    202    Any
        //  2901   2916   198    202    Any
        //  2945   2962   198    202    Any
        //  2973   2992   198    202    Any
        //  2992   3000   198    202    Any
        //  3005   3041   198    202    Any
        //  3041   3060   198    202    Any
        //  3063   3073   198    202    Any
        //  3078   3110   198    202    Any
        //  3110   3174   198    202    Any
        //  3179   3196   198    202    Any
        //  3199   3207   198    202    Any
        //  3207   3222   198    202    Any
        //  3225   3266   198    202    Any
        //  3266   3289   198    202    Any
        //  3292   3373   198    202    Any
        //  3376   3425   198    202    Any
        //  3425   3541   198    202    Any
        //  3544   3596   198    202    Any
        //  3600   3660   198    202    Any
        //  3660   3679   198    202    Any
        //  3682   3774   198    202    Any
        //  3785   3823   198    202    Any
        //  3828   3869   198    202    Any
        //  3877   3902   198    202    Any
        //  3910   3922   198    202    Any
        //  3929   3942   198    202    Any
        //  3947   3974   198    202    Any
        //  3974   3979   198    202    Any
        //  3983   4007   198    202    Any
        //  4007   4026   198    202    Any
        //  4026   4036   198    202    Any
        //  4039   4108   198    202    Any
        //  4108   4179   198    202    Any
        //  4179   4203   198    202    Any
        //  4206   4228   198    202    Any
        //  4233   4275   198    202    Any
        //  4278   4294   198    202    Any
        //  4298   4320   198    202    Any
        //  4328   4388   198    202    Any
        //  4391   4418   198    202    Any
        //  4435   4454   198    202    Any
        //  4459   4480   198    202    Any
        //  4480   4502   198    202    Any
        //  4505   4520   198    202    Any
        //  4524   4555   198    202    Any
        //  4563   4575   198    202    Any
        //  4575   4600   198    202    Any
        //  4603   4609   198    202    Any
        //  4614   4620   198    202    Any
        //  4623   4638   198    202    Any
        //  4645   4667   198    202    Any
        //  4671   4702   198    202    Any
        //  4710   4724   198    202    Any
        //  4724   4749   198    202    Any
        //  4757   4778   198    202    Any
        //  4781   4791   198    202    Any
        //  4797   4821   198    202    Any
        //  4821   4835   198    202    Any
        //  4835   4874   198    202    Any
        //  4877   4898   198    202    Any
        //  4903   4927   198    202    Any
        //  4930   4943   198    202    Any
        //  4949   4955   198    202    Any
        //  4958   4963   198    202    Any
        //  4963   4970   198    202    Any
        //  4986   4992   198    202    Any
        //  4995   5000   198    202    Any
        //  5000   5041   198    202    Any
        //  5046   5053   198    202    Any
        //  5056   5061   198    202    Any
        //  5061   5070   198    202    Any
        //  5070   5094   198    202    Any
        //  5099   5107   198    202    Any
        //  5110   5120   198    202    Any
        //  5123   5145   198    202    Any
        //  5148   5172   198    202    Any
        //  5172   5192   198    202    Any
        //  5192   5230   198    202    Any
        //  5233   5245   198    202    Any
        //  5250   5259   198    202    Any
        //  5259   5280   198    202    Any
        //  5289   5356   198    202    Any
        //  5356   5367   198    202    Any
        //  5367   5389   5392   5414   Landroid/database/sqlite/SQLiteException;
        //  5367   5389   198    202    Any
        //  5394   5414   198    202    Any
        //  5414   5421   198    202    Any
        //  5430   5437   198    202    Any
        //  5451   5458   198    202    Any
        //  5458   5460   198    202    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0112:
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
    
    public final q3 Q(final String s) {
        this.e().n();
        this.p0();
        q3 q3;
        if ((q3 = this.B.get(s)) == null) {
            if ((q3 = this.e0().I0(s)) == null) {
                q3 = R2.q3.c;
            }
            this.B(s, q3);
        }
        return q3;
    }
    
    public final String R(final W5 w5) {
        Object w6 = this.e().w(new H5(this, w5));
        try {
            w6 = ((Future<String>)w6).get(30000L, TimeUnit.MILLISECONDS);
            return (String)w6;
        }
        catch (ExecutionException w6) {}
        catch (InterruptedException w6) {}
        catch (TimeoutException ex) {}
        this.j().G().c("Failed to get app instance id. appId", R2.Y1.v(w5.o), w6);
        return null;
    }
    
    public final void S(final e e) {
        final W5 w = this.W((String)A2.n.i(e.o));
        if (w != null) {
            this.T(e, w);
        }
    }
    
    public final void T(e a0, final W5 w5) {
        A2.n.i(a0);
        A2.n.e(a0.o);
        A2.n.i(a0.p);
        A2.n.i(a0.q);
        A2.n.e(a0.q.p);
        this.e().n();
        this.p0();
        if (!d0(w5)) {
            return;
        }
        if (!w5.v) {
            this.g(w5);
            return;
        }
        final e e = new e(a0);
        boolean b = false;
        e.s = false;
        this.e0().Q0();
        while (true) {
            try {
                a0 = this.e0().A0((String)A2.n.i(e.o), e.q.p);
                if (a0 != null && !a0.p.equals(e.p)) {
                    this.j().L().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.l.D().g(e.q.p), e.p, a0.p);
                }
                Label_0358: {
                    if (a0 != null) {
                        final boolean s = a0.s;
                        if (s) {
                            e.p = a0.p;
                            e.r = a0.r;
                            e.v = a0.v;
                            e.t = a0.t;
                            e.w = a0.w;
                            e.s = s;
                            final R5 q = e.q;
                            e.q = new R5(q.p, a0.q.q, q.a(), a0.q.u);
                            break Label_0358;
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence)e.t)) {
                        final R5 q2 = e.q;
                        e.q = new R5(q2.p, e.r, q2.a(), e.q.u);
                        b = true;
                        e.s = true;
                    }
                }
                if (e.s) {
                    final R5 q3 = e.q;
                    final T5 t5 = new T5((String)A2.n.i(e.o), e.p, q3.p, q3.q, A2.n.i(q3.a()));
                    R2.a2 a2;
                    String s2;
                    Object o;
                    String s3;
                    Object o2;
                    if (this.e0().d0(t5)) {
                        a2 = this.j().F();
                        s2 = "User property updated immediately";
                        o = e.o;
                        s3 = this.l.D().g(t5.c);
                        o2 = t5.e;
                    }
                    else {
                        a2 = this.j().G();
                        s2 = "(2)Too many active user properties, ignoring";
                        o = R2.Y1.v(e.o);
                        s3 = this.l.D().g(t5.c);
                        o2 = t5.e;
                    }
                    a2.d(s2, o, s3, o2);
                    if (b && e.w != null) {
                        this.Y(new I(e.w, e.r), w5);
                    }
                }
                R2.a2 a3;
                String s4;
                Object o3;
                String s5;
                Object o4;
                if (this.e0().b0(e)) {
                    a3 = this.j().F();
                    s4 = "Conditional property added";
                    o3 = e.o;
                    s5 = this.l.D().g(e.q.p);
                    o4 = e.q.a();
                }
                else {
                    a3 = this.j().G();
                    s4 = "Too many conditional properties, ignoring";
                    o3 = R2.Y1.v(e.o);
                    s5 = this.l.D().g(e.q.p);
                    o4 = e.q.a();
                }
                a3.d(s4, o3, s5, o4);
                this.e0().T0();
                this.e0().R0();
                return;
                this.e0().R0();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void U(I a, final W5 w5) {
        A2.n.e(w5.o);
        final c2 b = c2.b(a);
        this.n0().Q(b.d, this.e0().B0(w5.o));
        this.n0().K(b, this.c0().y(w5.o));
        a = b.a();
        if ("_cmp".equals(a.o) && "referrer API v2".equals(a.p.q("_cis"))) {
            final String q = a.p.q("gclid");
            if (!TextUtils.isEmpty((CharSequence)q)) {
                this.u(new R5("_lgclid", a.r, q, "auto"), w5);
            }
        }
        if (H6.a() && H6.c() && "_cmp".equals(a.o) && "referrer API v2".equals(a.p.q("_cis"))) {
            final String q2 = a.p.q("gbraid");
            if (!TextUtils.isEmpty((CharSequence)q2)) {
                this.u(new R5("_gbraid", a.r, q2, "auto"), w5);
            }
        }
        this.q(a, w5);
    }
    
    public final void V(final I2 i2) {
        this.e().n();
        if (TextUtils.isEmpty((CharSequence)i2.j()) && TextUtils.isEmpty((CharSequence)i2.r0())) {
            this.z((String)A2.n.i(i2.t0()), 204, null, null, null);
            return;
        }
        final Uri$Builder uri$Builder = new Uri$Builder();
        String str;
        if (TextUtils.isEmpty((CharSequence)(str = i2.j()))) {
            str = i2.r0();
        }
        final P1 g = K.g;
        Map<String, String> map = null;
        final Map<String, String> map2 = null;
        final Uri$Builder encodedAuthority = uri$Builder.scheme((String)g.a(null)).encodedAuthority((String)K.h.a(null));
        final StringBuilder sb = new StringBuilder("config/app/");
        sb.append(str);
        encodedAuthority.path(sb.toString()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
        final String string = uri$Builder.build().toString();
        while (true) {
            try {
                final String s = (String)A2.n.i(i2.t0());
                final URL url = new URL(string);
                this.j().K().b("Fetching remote configuration", s);
                final L1 l = this.h0().L(s);
                final String p = this.h0().P(s);
                if (l != null) {
                    Map<String, String> map3 = map2;
                    if (!TextUtils.isEmpty((CharSequence)p)) {
                        map3 = (Map<String, String>)new t.a();
                        map3.put("If-Modified-Since", p);
                    }
                    final String n = this.h0().N(s);
                    map = map3;
                    if (!TextUtils.isEmpty((CharSequence)n)) {
                        if ((map = map3) == null) {
                            map = (Map<String, String>)new t.a();
                        }
                        map.put("If-None-Match", n);
                    }
                }
                this.t = true;
                final f2 g2 = this.g0();
                final I5 i3 = new I5(this);
                g2.n();
                g2.u();
                A2.n.i(url);
                A2.n.i(i3);
                g2.e().z(new k2(g2, s, url, null, map, i3));
                return;
                this.j().G().c("Failed to parse config URL. Not fetching. appId", R2.Y1.v(i2.t0()), string);
            }
            catch (MalformedURLException ex) {
                continue;
            }
            break;
        }
    }
    
    public final W5 W(final String s) {
        String s2 = s;
        final I2 d0 = this.e0().D0(s2);
        String s3;
        R2.a2 f;
        if (d0 != null && !TextUtils.isEmpty((CharSequence)d0.h())) {
            final Boolean m = this.m(d0);
            if (m == null || m) {
                final q3 q = this.Q(s);
                String i;
                int b;
                if (n6.a() && this.c0().s(K.T0)) {
                    i = this.a0(s).i();
                    b = q.b();
                }
                else {
                    i = "";
                    b = 100;
                }
                return new W5(s, d0.j(), d0.h(), d0.z(), d0.v0(), d0.g0(), d0.a0(), null, d0.r(), false, d0.i(), d0.v(), 0L, 0, d0.q(), false, d0.r0(), d0.q0(), d0.c0(), d0.n(), null, q.v(), "", null, d0.t(), d0.p0(), b, i, d0.a(), d0.D());
            }
            final R2.a2 g = this.j().G();
            s3 = "App version does not match; dropping. appId";
            final Object v = R2.Y1.v(s);
            f = g;
            s2 = (String)v;
        }
        else {
            f = this.j().F();
            s3 = "No app data available; dropping";
        }
        f.b(s3, s2);
        return null;
    }
    
    public final b6 X() {
        return (b6)i(this.f);
    }
    
    public final void Y(I i, W5 e0) {
        A2.n.i(e0);
        A2.n.e(e0.o);
        final long nanoTime = System.nanoTime();
        this.e().n();
        this.p0();
        Object o = e0.o;
        this.m0();
        if (!N5.c0(i, e0)) {
            return;
        }
        if (!e0.v) {
            this.g(e0);
            return;
        }
        if (this.h0().O((String)o, i.o)) {
            this.j().L().c("Dropping blocked event. appId", R2.Y1.v((String)o), this.l.D().c(i.o));
            final boolean b = this.h0().X((String)o) || this.h0().Z((String)o);
            if (!b && !"_err".equals(i.o)) {
                this.n0();
                S5.N(this.G, (String)o, 11, "_ev", i.o, 0);
            }
            if (b) {
                final I2 d0 = this.e0().D0((String)o);
                if (d0 != null) {
                    final long abs = Math.abs(this.b().a() - Math.max(d0.e0(), d0.H()));
                    this.c0();
                    if (abs > (long)K.B.a(null)) {
                        this.j().F().a("Fetching config for blocked app");
                        this.V(d0);
                    }
                }
            }
            return;
        }
        final c2 b2 = c2.b(i);
        this.n0().K(b2, this.c0().y((String)o));
        int q;
        if (S6.a() && this.c0().s(K.J0)) {
            q = this.c0().q((String)o, K.S, 10, 35);
        }
        else {
            q = 0;
        }
        final Iterator<Object> iterator = new TreeSet<Object>(((BaseBundle)b2.d).keySet()).iterator();
        while (iterator.hasNext()) {
            Object anObject = iterator.next();
            if ("items".equals(anObject)) {
                final Object o2 = this.n0();
                anObject = b2.d.getParcelableArray((String)anObject);
                ((S5)o2).a0((Parcelable[])anObject, q, S6.a() && this.c0().s(K.J0));
            }
        }
        Object o3 = b2.a();
        if (this.j().C(2)) {
            this.j().K().b("Logging event", this.l.D().a((I)o3));
        }
        if (M6.a()) {
            this.c0().s(K.G0);
        }
        Object anObject;
        Object o2;
        int n;
        String q2;
        double n2;
        long n4 = 0L;
        long n3;
        String upperCase;
        String string;
        T5 t5;
        boolean b3;
        boolean b4;
        boolean j0;
        Bundle g;
        boolean b5;
        T5 t6;
        boolean b6;
        q h;
        A a;
        boolean b7;
        long n5;
        boolean b8;
        int n6;
        boolean b9;
        boolean equals;
        boolean m;
        boolean b10;
        boolean b11;
        int u;
        final I k;
        Label_2395_Outer:Label_2448_Outer:Label_2746_Outer:Label_3415_Outer:
        while (true) {
            this.e0().Q0();
            while (true) {
                Label_3614: {
                Label_2746:
                    while (true) {
                        Label_2448:Label_2420_Outer:
                        while (true) {
                        Label_2420:
                            while (true) {
                                Label_2395:Label_2295_Outer:Label_2370_Outer:
                                while (true) {
                                    Label_2370:Label_2345_Outer:
                                    while (true) {
                                    Label_2345:
                                        while (true) {
                                        Label_2320:
                                            while (true) {
                                            Label_2295:
                                                while (true) {
                                                    Label_2270:Label_2235_Outer:
                                                    while (true) {
                                                    Label_1100_Outer:
                                                        while (true) {
                                                            Label_3541: {
                                                                while (true) {
                                                                    Label_3538: {
                                                                        while (true) {
                                                                        Label_1100:
                                                                            while (true) {
                                                                            Label_3532:
                                                                                while (true) {
                                                                                    Block_50_Outer:Block_77_Outer:
                                                                                    while (true) {
                                                                                        try {
                                                                                            this.g(e0);
                                                                                            if ("ecommerce_purchase".equals(((I)o3).o) || "purchase".equals(((I)o3).o) || "refund".equals(((I)o3).o)) {
                                                                                                break Block_50_Outer;
                                                                                            }
                                                                                            n = 0;
                                                                                            if (!"_iap".equals(((I)o3).o) && n == 0) {
                                                                                                break Label_3532;
                                                                                            }
                                                                                            q2 = ((I)o3).p.q("currency");
                                                                                            if (n != 0) {
                                                                                                if ((n2 = ((I)o3).p.f("value") * 1000000.0) == 0.0) {
                                                                                                    n2 = ((I)o3).p.i("value") * 1000000.0;
                                                                                                }
                                                                                                if (n2 > 9.223372036854776E18 || n2 < -9.223372036854776E18) {
                                                                                                    this.j().L().c("Data lost. Currency value is too big. appId", R2.Y1.v((String)o), n2);
                                                                                                    this.e0().T0();
                                                                                                    this.e0().R0();
                                                                                                    return;
                                                                                                }
                                                                                                n3 = (n4 = Math.round(n2));
                                                                                                if ("refund".equals(((I)o3).o)) {
                                                                                                    n4 = -n3;
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                n4 = ((I)o3).p.i("value");
                                                                                            }
                                                                                            if (TextUtils.isEmpty((CharSequence)q2)) {
                                                                                                break Label_3532;
                                                                                            }
                                                                                            upperCase = q2.toUpperCase(Locale.US);
                                                                                            if (!upperCase.matches("[A-Z]{3}")) {
                                                                                                break Label_3532;
                                                                                            }
                                                                                            o2 = new StringBuilder("_ltv_");
                                                                                            ((StringBuilder)o2).append(upperCase);
                                                                                            string = ((StringBuilder)o2).toString();
                                                                                            o2 = this.e0().F0((String)o, string);
                                                                                            if (o2 == null) {
                                                                                                break Label_1100;
                                                                                            }
                                                                                            o2 = ((T5)o2).e;
                                                                                            if (!(o2 instanceof Long)) {
                                                                                                break Label_1100;
                                                                                            }
                                                                                            t5 = new T5((String)o, ((I)o3).q, string, this.b().a(), (long)o2 + n4);
                                                                                            break Label_3538;
                                                                                            this.e0().R0();
                                                                                            ((V1.a)o).w(b3);
                                                                                            // iftrue(Label_3596:, n4 & 0x40L == 0x0L)
                                                                                            // iftrue(Label_1784:, this.e0().v0((String)o) < (long)this.c0().p((String)o) || !j0)
                                                                                            // iftrue(Label_3572:, 0x4L & n4 == 0x0L)
                                                                                            // iftrue(Label_2469:, n4 == 0L)
                                                                                            // iftrue(Label_1531:, !this.n0().F0((String)o))
                                                                                            // iftrue(Label_3566:, 0x2L & n4 == 0x0L)
                                                                                            // iftrue(Label_3605:, !i6.a() || !this.c0().s(K.Y0) || i.b.equals((Object)"_fx") || (String)o.first.equals((Object)"00000000-0000-0000-0000-000000000000"))
                                                                                            // iftrue(Label_3590:, 0x20L & n4 == 0x0L)
                                                                                            // iftrue(Label_2623:, o3 == null)
                                                                                            // iftrue(Label_1369:, n4 <= 0L)
                                                                                            // iftrue(Label_2448:, n4 == 0L)
                                                                                            // iftrue(Label_2852:, !this.l.p())
                                                                                            // iftrue(Label_3605:, o == null || TextUtils.isEmpty((CharSequence)o.first) || !e0.C)
                                                                                            // iftrue(Label_3038:, o = o3 != null)
                                                                                            // iftrue(Label_1945:, TextUtils.isEmpty((CharSequence)e0.r))
                                                                                            // iftrue(Label_3541:, o.x())
                                                                                            // iftrue(Label_3560:, n4 & 0x1L == 0x0L)
                                                                                            // iftrue(Label_3541:, n5 == 0L)
                                                                                            // iftrue(Label_3272:, n6 >= o3.size())
                                                                                            // iftrue(Label_3102:, TextUtils.isEmpty((CharSequence)o.i()))
                                                                                            // iftrue(Label_1445:, n4 != 1L)
                                                                                            // iftrue(Label_1965:, TextUtils.isEmpty((CharSequence)e0.q))
                                                                                            // iftrue(Label_2143:, !o2.V0().isEmpty() || TextUtils.isEmpty((CharSequence)e0.E))
                                                                                            // iftrue(Label_3074:, !anObject.y() || TextUtils.isEmpty((CharSequence)o.u0()))
                                                                                            // iftrue(Label_3605:, !anObject.x() || !e0.C)
                                                                                            // iftrue(Label_1369:, !j0)
                                                                                            // iftrue(Label_3602:, !g7.a() || !this.c0().B(e0.o, K.L0))
                                                                                            // iftrue(Label_2075:, TextUtils.isEmpty((CharSequence)e0.p))
                                                                                            // iftrue(Label_3578:, 0x8L & n4 == 0x0L)
                                                                                            // iftrue(Label_3605:, o == null || !o.u())
                                                                                            // iftrue(Label_2045:, n4 == -2147483648L)
                                                                                            // iftrue(Label_1251:, n4 <= 0L)
                                                                                            // iftrue(Label_3263:, !"_sid".equals((Object)(T5)o3.get(n6).c) || o.o0() == 0L || this.m0().z(e0.L) == o.o0())
                                                                                            // iftrue(Label_1460:, n4 <= 0L)
                                                                                            // iftrue(Label_1329:, n4 % 1000L != 1L)
                                                                                            // iftrue(Label_2021:, !s7.a() || TextUtils.isEmpty((CharSequence)e0.L) || !this.c0().s(K.w0) && !this.c0().B(e0.o, K.y0))
                                                                                            // iftrue(Label_2948:, !anObject.x())
                                                                                            // iftrue(Label_2852:, TextUtils.isEmpty((CharSequence)null))
                                                                                            // iftrue(Label_3602:, !S5.D0(e0.o))
                                                                                            // iftrue(Label_1925:, TextUtils.isEmpty((CharSequence)e0.o))
                                                                                            // iftrue(Label_1593:, o2 == null || !o2.e instanceof Long)
                                                                                            // iftrue(Label_1593:, !"_s".equals((Object)o3.o))
                                                                                            // iftrue(Label_1634:, n4 <= 0L)
                                                                                            // iftrue(Label_1813:, o3 != null)
                                                                                            // iftrue(Label_1236:, n4 % 1000L != 1L)
                                                                                            // iftrue(Label_3584:, 0x10L & n4 == 0x0L)
                                                                                            // iftrue(Label_1100:, this.e0().d0((T5)i))
                                                                                            // iftrue(Label_1460:, !equals)
                                                                                        Label_1838_Outer:
                                                                                            while (true) {
                                                                                                Label_2469: {
                                                                                                Label_1838:
                                                                                                    while (true) {
                                                                                                    Label_2852_Outer:
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    Block_91: {
                                                                                                                        while (true) {
                                                                                                                        Block_48:
                                                                                                                            while (true) {
                                                                                                                                Block_55: {
                                                                                                                                    while (true) {
                                                                                                                                    Block_38_Outer:
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                            Block_37:
                                                                                                                                                while (true) {
                                                                                                                                                    Label_1634: {
                                                                                                                                                        Block_53_Outer:Label_3458_Outer:
                                                                                                                                                        while (true) {
                                                                                                                                                            while (true) {
                                                                                                                                                                Label_1531: {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        Block_93_Outer:Block_65_Outer:
                                                                                                                                                                        while (true) {
                                                                                                                                                                            while (true) {
                                                                                                                                                                                Block_64: {
                                                                                                                                                                                    Label_2623_Outer:Label_3102_Outer:Label_2011_Outer:
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        Block_92: {
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                            Block_89:
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    Block_96: {
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            Block_40: {
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        Block_97: {
                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                Label_2948: {
                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        Label_2021: {
                                                                                                                                                                                                                                            Block_52: {
                                                                                                                                                                                                                                                Block_87: {
                                                                                                                                                                                                                                                Label_1445:
                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                        Label_2045: {
                                                                                                                                                                                                                                                        Label_3118:
                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                Label_3263: {
                                                                                                                                                                                                                                                                Block_39_Outer:
                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        Block_83: {
                                                                                                                                                                                                                                                                        Label_2143:
                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                            Block_67:
                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                    Label_2501: {
                                                                                                                                                                                                                                                                                        Block_74:Block_62_Outer:
                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                Label_2075: {
                                                                                                                                                                                                                                                                                                    Label_1945: {
                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                            Block_71: {
                                                                                                                                                                                                                                                                                                                Label_3074: {
                                                                                                                                                                                                                                                                                                                    Block_66: {
                                                                                                                                                                                                                                                                                                                        Block_68: {
                                                                                                                                                                                                                                                                                                                            Block_75: {
                                                                                                                                                                                                                                                                                                                                break Block_75;
                                                                                                                                                                                                                                                                                                                                this.j().L().c("Data lost. Too many events stored on disk, deleted. appId", R2.Y1.v((String)o), n4);
                                                                                                                                                                                                                                                                                                                                break Label_1634;
                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    Label_1925: {
                                                                                                                                                                                                                                                                                                                                        Block_45: {
                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                b4 = true;
                                                                                                                                                                                                                                                                                                                                                break Label_2295;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).U((String)A2.n.i(((I2)o).u0()));
                                                                                                                                                                                                                                                                                                                                                break Label_3074;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).O(e0.o);
                                                                                                                                                                                                                                                                                                                                                break Label_1925;
                                                                                                                                                                                                                                                                                                                                                break Block_52;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).a0(e0.r);
                                                                                                                                                                                                                                                                                                                                                break Label_1945;
                                                                                                                                                                                                                                                                                                                                                ((I2)o).S(this.i.A(e0.o, e0.C));
                                                                                                                                                                                                                                                                                                                                                break Label_2948;
                                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                                    ((d2.a)o2).S(n4);
                                                                                                                                                                                                                                                                                                                                                    break Label_2469;
                                                                                                                                                                                                                                                                                                                                                    ((V1.a)o).A(b4);
                                                                                                                                                                                                                                                                                                                                                    break Block_71;
                                                                                                                                                                                                                                                                                                                                                    n4 = e0.t;
                                                                                                                                                                                                                                                                                                                                                    continue Label_2448_Outer;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                Label_1460: {
                                                                                                                                                                                                                                                                                                                                                    g = ((I)o3).p.g();
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                this.n0().R(g, "_o", ((I)o3).q);
                                                                                                                                                                                                                                                                                                                                                break Block_45;
                                                                                                                                                                                                                                                                                                                                                ((V1.a)o).y(b5);
                                                                                                                                                                                                                                                                                                                                                continue Label_2295_Outer;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            t6 = new T5((String)o, ((I)o3).q, (String)i, this.b().a(), n4);
                                                                                                                                                                                                                                                                                                                                            break Label_3538;
                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                this.e0().T0();
                                                                                                                                                                                                                                                                                                                                                this.e0().R0();
                                                                                                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                                                                                                                break Block_87;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).T((Iterable)o);
                                                                                                                                                                                                                                                                                                                                                break Label_2501;
                                                                                                                                                                                                                                                                                                                                                b6 = true;
                                                                                                                                                                                                                                                                                                                                                break Label_2370;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).I0(e0.p);
                                                                                                                                                                                                                                                                                                                                                break Label_2075;
                                                                                                                                                                                                                                                                                                                                                ((V1.a)o).x(b6);
                                                                                                                                                                                                                                                                                                                                                break Block_74;
                                                                                                                                                                                                                                                                                                                                                this.j().G().c("Data loss. Too many events logged. appId, count", R2.Y1.v((String)o), h.b);
                                                                                                                                                                                                                                                                                                                                                continue Label_2623_Outer;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            Label_1784: {
                                                                                                                                                                                                                                                                                                                                                o = new E((String)o, a.b, 0L, 0L, a.d, 0L, null, null, null, null);
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            break Label_1838;
                                                                                                                                                                                                                                                                                                                                            ((d2.a)o2).d0((int)n4);
                                                                                                                                                                                                                                                                                                                                            break Label_2045;
                                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).Q0((String)((Pair)o).first);
                                                                                                                                                                                                                                                                                                                                                o3 = ((Pair)o).second;
                                                                                                                                                                                                                                                                                                                                                break Block_83;
                                                                                                                                                                                                                                                                                                                                                n4 = h.a;
                                                                                                                                                                                                                                                                                                                                                this.c0();
                                                                                                                                                                                                                                                                                                                                                n4 -= (int)K.o.a(null);
                                                                                                                                                                                                                                                                                                                                                break Block_40;
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).J(b7);
                                                                                                                                                                                                                                                                                                                                                break Block_68;
                                                                                                                                                                                                                                                                                                                                                this.l.A().o();
                                                                                                                                                                                                                                                                                                                                                o = ((d2.a)o2).w0(Build.MODEL);
                                                                                                                                                                                                                                                                                                                                                this.l.A().o();
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o).M0(Build$VERSION.RELEASE).u0((int)this.l.A().v()).T0(this.l.A().w());
                                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).y0(e0.N);
                                                                                                                                                                                                                                                                                                                                                break Label_2623_Outer;
                                                                                                                                                                                                                                                                                                                                                o = this.i.z(e0.o, (q3)anObject);
                                                                                                                                                                                                                                                                                                                                                continue Block_39_Outer;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            o3 = this.e0().D0(e0.o);
                                                                                                                                                                                                                                                                                                                                            break Block_92;
                                                                                                                                                                                                                                                                                                                                            this.j().G().c("Too many error events logged. appId, count", R2.Y1.v((String)o), h.d);
                                                                                                                                                                                                                                                                                                                                            break Label_1445;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        this.n0().R(g, "_dbg", 1L);
                                                                                                                                                                                                                                                                                                                                        this.n0().R(g, "_r", 1L);
                                                                                                                                                                                                                                                                                                                                        break Label_1531;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    continue Block_93_Outer;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).I(e0.E);
                                                                                                                                                                                                                                                                                                                                break Label_2143;
                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).X(e0.Q);
                                                                                                                                                                                                                                                                                                                                n5 = (n4 = e0.R);
                                                                                                                                                                                                                                                                                                                                break Block_66;
                                                                                                                                                                                                                                                                                                                                ((V1.a)o).z(b8);
                                                                                                                                                                                                                                                                                                                                ((d2.a)o2).C((V1)((Y3.b)o).p());
                                                                                                                                                                                                                                                                                                                                continue Label_2448;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            b8 = true;
                                                                                                                                                                                                                                                                                                                            continue Label_2420;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        o = V1.G();
                                                                                                                                                                                                                                                                                                                        break Label_3118;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    n4 = n5;
                                                                                                                                                                                                                                                                                                                    break Block_67;
                                                                                                                                                                                                                                                                                                                    break Block_97;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                break Block_96;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            b9 = true;
                                                                                                                                                                                                                                                                                                            break Label_2320;
                                                                                                                                                                                                                                                                                                            this.j().G().c("Data loss. Too many public events logged. appId, count", R2.Y1.v((String)o), h.a);
                                                                                                                                                                                                                                                                                                            break Block_39_Outer;
                                                                                                                                                                                                                                                                                                            continue Block_62_Outer;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    break Block_55;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                o = this.Q((String)A2.n.i(e0.o)).c(q3.e(e0.J));
                                                                                                                                                                                                                                                                                                ((d2.a)o2).o0(((q3)o).v());
                                                                                                                                                                                                                                                                                                continue Block_65_Outer;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            continue Block_53_Outer;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        b3 = true;
                                                                                                                                                                                                                                                                                        continue Label_2395;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    anObject = this.Q((String)A2.n.i(e0.o)).c(q3.e(e0.J));
                                                                                                                                                                                                                                                                                    continue Label_2852_Outer;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                n4 = ((n5 & 0xFFFFFFFFFFFFFFFEL) | 0x20L);
                                                                                                                                                                                                                                                                                break Label_3541;
                                                                                                                                                                                                                                                                                o3 = this.e0().M0(e0.o);
                                                                                                                                                                                                                                                                                n6 = 0;
                                                                                                                                                                                                                                                                                continue Label_3118;
                                                                                                                                                                                                                                                                                ((d2.a)o2).N0();
                                                                                                                                                                                                                                                                                break Label_3263;
                                                                                                                                                                                                                                                                                Label_1251: {
                                                                                                                                                                                                                                                                                    continue Label_2235_Outer;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            break Block_64;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        ((d2.a)o2).V((boolean)o3);
                                                                                                                                                                                                                                                                        continue Block_77_Outer;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    this.n0();
                                                                                                                                                                                                                                                                    S5.N(this.G, (String)o, 16, "_ev", ((I)o3).o, 0);
                                                                                                                                                                                                                                                                    this.e0().T0();
                                                                                                                                                                                                                                                                    this.e0().R0();
                                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                ++n6;
                                                                                                                                                                                                                                                                continue Label_3118;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            b5 = true;
                                                                                                                                                                                                                                                            continue Label_2270;
                                                                                                                                                                                                                                                            ((d2.a)o2).R0(e0.L);
                                                                                                                                                                                                                                                            break Label_2021;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        ((d2.a)o2).j0(e0.s);
                                                                                                                                                                                                                                                        continue Block_38_Outer;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    this.e0().T0();
                                                                                                                                                                                                                                                    this.e0().R0();
                                                                                                                                                                                                                                                    return;
                                                                                                                                                                                                                                                    ((V1.a)o).B(b9);
                                                                                                                                                                                                                                                    break Label_1838;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                o = this.e0().D0(e0.o);
                                                                                                                                                                                                                                                break Block_89;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            this.j().G().d("Too many event names used, ignoring event. appId, name, supported count", R2.Y1.v((String)o), this.l.D().c(a.b), this.c0().p((String)o));
                                                                                                                                                                                                                                            this.n0();
                                                                                                                                                                                                                                            S5.N(this.G, (String)o, 8, null, null, 0);
                                                                                                                                                                                                                                            this.e0().R0();
                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                            this.e0().T0();
                                                                                                                                                                                                                                            this.e0().R0();
                                                                                                                                                                                                                                            this.N();
                                                                                                                                                                                                                                            this.j().K().b("Background event processing time, ms", (System.nanoTime() - nanoTime + 500000L) / 1000000L);
                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        n4 = e0.x;
                                                                                                                                                                                                                                        continue Label_2235_Outer;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    j0 = S5.J0(((I)o3).o);
                                                                                                                                                                                                                                    equals = "_err".equals(((I)o3).o);
                                                                                                                                                                                                                                    this.n0();
                                                                                                                                                                                                                                    n4 = S5.z(((I)o3).p);
                                                                                                                                                                                                                                    h = this.e0().H(this.u0(), (String)o, n4 + 1L, true, j0, false, equals, false);
                                                                                                                                                                                                                                    n4 = h.b;
                                                                                                                                                                                                                                    this.c0();
                                                                                                                                                                                                                                    n4 -= (int)K.m.a(null);
                                                                                                                                                                                                                                    break Block_37;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ((I2)o).h0(0L);
                                                                                                                                                                                                                                ((I2)o).j0(0L);
                                                                                                                                                                                                                                ((I2)o).f0(0L);
                                                                                                                                                                                                                                ((I2)o).F(e0.q);
                                                                                                                                                                                                                                ((I2)o).c(e0.x);
                                                                                                                                                                                                                                ((I2)o).B(e0.r);
                                                                                                                                                                                                                                ((I2)o).d0(e0.s);
                                                                                                                                                                                                                                ((I2)o).X(e0.t);
                                                                                                                                                                                                                                ((I2)o).y(e0.v);
                                                                                                                                                                                                                                ((I2)o).Z(e0.G);
                                                                                                                                                                                                                                this.e0().U((I2)o);
                                                                                                                                                                                                                                continue Label_3102_Outer;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        anObject = h2.X().z(((List<T5>)o3).get(n6).c).B(((List<T5>)o3).get(n6).d);
                                                                                                                                                                                                                        this.m0().U((h2.a)anObject, ((List<T5>)o3).get(n6).e);
                                                                                                                                                                                                                        ((d2.a)o2).F((h2.a)anObject);
                                                                                                                                                                                                                        continue Label_2011_Outer;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    n4 = h.d - Math.max(0, Math.min(1000000, this.c0().u(e0.o, K.n)));
                                                                                                                                                                                                                    continue Label_3102_Outer;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            continue Label_3102_Outer;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    ((d2.a)o2).G0((String)A2.n.i(((I2)o).i()));
                                                                                                                                                                                                    continue Label_2011_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                this.F(e0.o, false);
                                                                                                                                                                                                o = new Bundle();
                                                                                                                                                                                                ((BaseBundle)o).putLong("_r", 1L);
                                                                                                                                                                                                this.G.r(e0.o, "_fx", (Bundle)o);
                                                                                                                                                                                                continue Label_2746;
                                                                                                                                                                                                continue Label_3458_Outer;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        o = new I2(this.l, e0.o);
                                                                                                                                                                                        ((I2)o).x(this.n((q3)anObject));
                                                                                                                                                                                        ((I2)o).J(e0.y);
                                                                                                                                                                                        ((I2)o).M(e0.p);
                                                                                                                                                                                        continue Label_2448_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    ((d2.a)o2).S0();
                                                                                                                                                                                    break Block_91;
                                                                                                                                                                                }
                                                                                                                                                                                this.n0();
                                                                                                                                                                                continue Label_2420_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            this.e0().T((E)o);
                                                                                                                                                                            this.e().n();
                                                                                                                                                                            this.p0();
                                                                                                                                                                            A2.n.i(a);
                                                                                                                                                                            A2.n.i(e0);
                                                                                                                                                                            A2.n.e(a.a);
                                                                                                                                                                            A2.n.a(a.a.equals(e0.o));
                                                                                                                                                                            o2 = d2.A3().m0(1).O0("android");
                                                                                                                                                                            continue Block_50_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        o2 = this.e0().F0(e0.o, "_sno");
                                                                                                                                                                        break Block_48;
                                                                                                                                                                        try {
                                                                                                                                                                            Label_3272: {
                                                                                                                                                                                n4 = this.e0().E((d2)((Y3.b)o2).p());
                                                                                                                                                                            }
                                                                                                                                                                            e0 = (W5)this.e0();
                                                                                                                                                                            o = ((A)i).f;
                                                                                                                                                                            if (o == null) {
                                                                                                                                                                                break Label_3614;
                                                                                                                                                                            }
                                                                                                                                                                            o = ((D)o).iterator();
                                                                                                                                                                            while (((Iterator)o).hasNext()) {
                                                                                                                                                                                if ("_r".equals(((Iterator<String>)o).next())) {
                                                                                                                                                                                    break Label_2746;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            m = this.h0().M(((A)i).a, ((A)i).b);
                                                                                                                                                                            o = this.e0().I(this.u0(), ((A)i).a, false, false, false, false, false);
                                                                                                                                                                            if (m && ((q)o).e < this.c0().A(((A)i).a)) {
                                                                                                                                                                                break Label_2746;
                                                                                                                                                                            }
                                                                                                                                                                            break Label_3614;
                                                                                                                                                                            // iftrue(Label_3458:, !e0.c0((A)i, n4, b10))
                                                                                                                                                                            this.o = 0L;
                                                                                                                                                                        }
                                                                                                                                                                        catch (IOException ex) {
                                                                                                                                                                            this.j().G().c("Data loss. Failed to insert raw event metadata. appId", R2.Y1.v(((d2.a)o2).S0()), ex);
                                                                                                                                                                        }
                                                                                                                                                                        continue Label_1100_Outer;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                continue Label_3415_Outer;
                                                                                                                                                            }
                                                                                                                                                            n4 = this.e0().F((String)o);
                                                                                                                                                            continue Label_2295_Outer;
                                                                                                                                                        }
                                                                                                                                                        this.j().G().d("Too many unique user properties are set. Ignoring user property. appId", R2.Y1.v((String)o), this.l.D().g(((T5)i).c), ((T5)i).e);
                                                                                                                                                        this.n0();
                                                                                                                                                        S5.N(this.G, (String)o, 9, null, null, 0);
                                                                                                                                                        continue Label_1100;
                                                                                                                                                    }
                                                                                                                                                    a = new A(this.l, ((I)o3).q, (String)o, ((I)o3).o, ((I)o3).r, 0L, g);
                                                                                                                                                    o3 = this.e0().C0((String)o, a.b);
                                                                                                                                                    continue Label_2448_Outer;
                                                                                                                                                }
                                                                                                                                                continue Label_1838_Outer;
                                                                                                                                            }
                                                                                                                                            ((V1.a)o).C(b11);
                                                                                                                                            continue Label_2370_Outer;
                                                                                                                                        }
                                                                                                                                        continue Label_2345_Outer;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                ((d2.a)o2).g0(e0.q);
                                                                                                                                continue Label_3415_Outer;
                                                                                                                            }
                                                                                                                            this.n0().R(g, "_sno", ((T5)o2).e);
                                                                                                                            continue Label_2345_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ((d2.a)o2).z0(null);
                                                                                                                    continue Label_2420_Outer;
                                                                                                                }
                                                                                                                Label_1369: {
                                                                                                                    continue Label_3415_Outer;
                                                                                                                }
                                                                                                            }
                                                                                                            o2 = this.e0();
                                                                                                            u = this.c0().u((String)o, K.G);
                                                                                                            A2.n.e((String)o);
                                                                                                            ((m3)o2).n();
                                                                                                            ((C5)o2).u();
                                                                                                            try {
                                                                                                                ((p)o2).B().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", (Object[])new String[] { (String)o, (String)o, String.valueOf(u - 1) });
                                                                                                            }
                                                                                                            catch (SQLiteException anObject) {
                                                                                                                ((m3)o2).j().G().c("Error pruning currencies. appId", R2.Y1.v((String)o), anObject);
                                                                                                            }
                                                                                                            continue Block_77_Outer;
                                                                                                        }
                                                                                                        Label_1813: {
                                                                                                            a = a.a(this.l, ((E)o3).f);
                                                                                                        }
                                                                                                        o = ((E)o3).a(a.d);
                                                                                                        continue Label_1838;
                                                                                                    }
                                                                                                    b11 = true;
                                                                                                    continue Label_2345;
                                                                                                }
                                                                                                ((d2.a)o2).Y(e0.G);
                                                                                                o = this.m0().j0();
                                                                                                continue Label_2370_Outer;
                                                                                            }
                                                                                        }
                                                                                        // iftrue(Label_2501:, o == null)
                                                                                        finally {}
                                                                                        i = k;
                                                                                        continue Label_2395_Outer;
                                                                                    }
                                                                                    n = 1;
                                                                                    continue Label_2395_Outer;
                                                                                }
                                                                                continue Label_1100;
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                            b7 = (n4 == 1L);
                                                            continue Label_2746_Outer;
                                                        }
                                                        Label_3560: {
                                                            b5 = false;
                                                        }
                                                        continue Label_2270;
                                                    }
                                                    Label_3566: {
                                                        b4 = false;
                                                    }
                                                    continue Label_2295;
                                                }
                                                Label_3572: {
                                                    b9 = false;
                                                }
                                                continue Label_2320;
                                            }
                                            Label_3578: {
                                                b11 = false;
                                            }
                                            continue Label_2345;
                                        }
                                        Label_3584: {
                                            b6 = false;
                                        }
                                        continue Label_2370;
                                    }
                                    Label_3590: {
                                        b3 = false;
                                    }
                                    continue Label_2395;
                                }
                                Label_3596: {
                                    b8 = false;
                                }
                                continue Label_2420;
                            }
                            Label_3602: {
                                continue Label_2448;
                            }
                        }
                        Label_3605: {
                            continue Label_2746;
                        }
                    }
                    b10 = true;
                    continue;
                }
                b10 = false;
                continue;
            }
        }
    }
    
    public final void Z(final W5 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/D5.e:()LR2/G2;
        //     4: invokevirtual   R2/m3.n:()V
        //     7: aload_0        
        //     8: invokevirtual   R2/D5.p0:()V
        //    11: aload_1        
        //    12: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: pop            
        //    16: aload_1        
        //    17: getfield        R2/W5.o:Ljava/lang/String;
        //    20: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    23: pop            
        //    24: aload_1        
        //    25: invokestatic    R2/D5.d0:(LR2/W5;)Z
        //    28: ifne            32
        //    31: return         
        //    32: aload_0        
        //    33: invokevirtual   R2/D5.e0:()LR2/p;
        //    36: aload_1        
        //    37: getfield        R2/W5.o:Ljava/lang/String;
        //    40: invokevirtual   R2/p.D0:(Ljava/lang/String;)LR2/I2;
        //    43: astore          12
        //    45: aload           12
        //    47: ifnull          97
        //    50: aload           12
        //    52: invokevirtual   R2/I2.j:()Ljava/lang/String;
        //    55: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    58: ifeq            97
        //    61: aload_1        
        //    62: getfield        R2/W5.p:Ljava/lang/String;
        //    65: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    68: ifne            97
        //    71: aload           12
        //    73: lconst_0       
        //    74: invokevirtual   R2/I2.A:(J)V
        //    77: aload_0        
        //    78: invokevirtual   R2/D5.e0:()LR2/p;
        //    81: aload           12
        //    83: invokevirtual   R2/p.U:(LR2/I2;)V
        //    86: aload_0        
        //    87: invokevirtual   R2/D5.h0:()LR2/x2;
        //    90: aload_1        
        //    91: getfield        R2/W5.o:Ljava/lang/String;
        //    94: invokevirtual   R2/x2.U:(Ljava/lang/String;)V
        //    97: aload_1        
        //    98: getfield        R2/W5.v:Z
        //   101: ifne            111
        //   104: aload_0        
        //   105: aload_1        
        //   106: invokevirtual   R2/D5.g:(LR2/W5;)LR2/I2;
        //   109: pop            
        //   110: return         
        //   111: aload_1        
        //   112: getfield        R2/W5.A:J
        //   115: lstore          7
        //   117: lload           7
        //   119: lstore          5
        //   121: lload           7
        //   123: lconst_0       
        //   124: lcmp           
        //   125: ifne            139
        //   128: aload_0        
        //   129: invokevirtual   R2/D5.b:()LE2/e;
        //   132: invokeinterface E2/e.a:()J
        //   137: lstore          5
        //   139: aload_0        
        //   140: getfield        R2/D5.l:LR2/N2;
        //   143: invokevirtual   R2/N2.A:()LR2/C;
        //   146: invokevirtual   R2/C.x:()V
        //   149: aload_1        
        //   150: getfield        R2/W5.B:I
        //   153: istore_3       
        //   154: iload_3        
        //   155: istore_2       
        //   156: iload_3        
        //   157: ifeq            193
        //   160: iload_3        
        //   161: istore_2       
        //   162: iload_3        
        //   163: iconst_1       
        //   164: if_icmpeq       193
        //   167: aload_0        
        //   168: invokevirtual   R2/D5.j:()LR2/Y1;
        //   171: invokevirtual   R2/Y1.L:()LR2/a2;
        //   174: ldc_w           "Incorrect app type, assuming installed app. appId, appType"
        //   177: aload_1        
        //   178: getfield        R2/W5.o:Ljava/lang/String;
        //   181: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   184: iload_3        
        //   185: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   188: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   191: iconst_0       
        //   192: istore_2       
        //   193: aload_0        
        //   194: invokevirtual   R2/D5.e0:()LR2/p;
        //   197: invokevirtual   R2/p.Q0:()V
        //   200: aload_0        
        //   201: invokevirtual   R2/D5.e0:()LR2/p;
        //   204: aload_1        
        //   205: getfield        R2/W5.o:Ljava/lang/String;
        //   208: ldc_w           "_npa"
        //   211: invokevirtual   R2/p.F0:(Ljava/lang/String;Ljava/lang/String;)LR2/T5;
        //   214: astore          12
        //   216: aload           12
        //   218: ifnull          238
        //   221: ldc_w           "auto"
        //   224: aload           12
        //   226: getfield        R2/T5.b:Ljava/lang/String;
        //   229: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   232: ifeq            2014
        //   235: goto            238
        //   238: aload_1        
        //   239: getfield        R2/W5.F:Ljava/lang/Boolean;
        //   242: ifnull          314
        //   245: aload_1        
        //   246: getfield        R2/W5.F:Ljava/lang/Boolean;
        //   249: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   252: ifeq            2021
        //   255: lconst_1       
        //   256: lstore          7
        //   258: goto            261
        //   261: new             LR2/R5;
        //   264: dup            
        //   265: ldc_w           "_npa"
        //   268: lload           5
        //   270: lload           7
        //   272: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   275: ldc_w           "auto"
        //   278: invokespecial   R2/R5.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //   281: astore          13
        //   283: aload           12
        //   285: ifnull          304
        //   288: aload           12
        //   290: getfield        R2/T5.e:Ljava/lang/Object;
        //   293: aload           13
        //   295: getfield        R2/R5.r:Ljava/lang/Long;
        //   298: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   301: ifne            327
        //   304: aload_0        
        //   305: aload           13
        //   307: aload_1        
        //   308: invokevirtual   R2/D5.u:(LR2/R5;LR2/W5;)V
        //   311: goto            327
        //   314: aload           12
        //   316: ifnull          327
        //   319: aload_0        
        //   320: ldc_w           "_npa"
        //   323: aload_1        
        //   324: invokevirtual   R2/D5.D:(Ljava/lang/String;LR2/W5;)V
        //   327: aload_0        
        //   328: invokevirtual   R2/D5.e0:()LR2/p;
        //   331: aload_1        
        //   332: getfield        R2/W5.o:Ljava/lang/String;
        //   335: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   338: checkcast       Ljava/lang/String;
        //   341: invokevirtual   R2/p.D0:(Ljava/lang/String;)LR2/I2;
        //   344: astore          13
        //   346: aload           13
        //   348: astore          12
        //   350: aload           13
        //   352: ifnull          678
        //   355: aload_0        
        //   356: invokevirtual   R2/D5.n0:()LR2/S5;
        //   359: pop            
        //   360: aload           13
        //   362: astore          12
        //   364: aload_1        
        //   365: getfield        R2/W5.p:Ljava/lang/String;
        //   368: aload           13
        //   370: invokevirtual   R2/I2.j:()Ljava/lang/String;
        //   373: aload_1        
        //   374: getfield        R2/W5.E:Ljava/lang/String;
        //   377: aload           13
        //   379: invokevirtual   R2/I2.r0:()Ljava/lang/String;
        //   382: invokestatic    R2/S5.l0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
        //   385: ifeq            678
        //   388: aload_0        
        //   389: invokevirtual   R2/D5.j:()LR2/Y1;
        //   392: invokevirtual   R2/Y1.L:()LR2/a2;
        //   395: ldc_w           "New GMP App Id passed in. Removing cached database data. appId"
        //   398: aload           13
        //   400: invokevirtual   R2/I2.t0:()Ljava/lang/String;
        //   403: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   406: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   409: aload_0        
        //   410: invokevirtual   R2/D5.e0:()LR2/p;
        //   413: astore          12
        //   415: aload           13
        //   417: invokevirtual   R2/I2.t0:()Ljava/lang/String;
        //   420: astore          13
        //   422: aload           12
        //   424: invokevirtual   R2/C5.u:()V
        //   427: aload           12
        //   429: invokevirtual   R2/m3.n:()V
        //   432: aload           13
        //   434: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //   437: pop            
        //   438: aload           12
        //   440: invokevirtual   R2/p.B:()Landroid/database/sqlite/SQLiteDatabase;
        //   443: astore          14
        //   445: iconst_1       
        //   446: anewarray       Ljava/lang/String;
        //   449: astore          15
        //   451: aload           15
        //   453: iconst_0       
        //   454: aload           13
        //   456: aastore        
        //   457: aload           14
        //   459: ldc_w           "events"
        //   462: ldc_w           "app_id=?"
        //   465: aload           15
        //   467: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   470: aload           14
        //   472: ldc_w           "user_attributes"
        //   475: ldc_w           "app_id=?"
        //   478: aload           15
        //   480: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   483: iadd           
        //   484: aload           14
        //   486: ldc_w           "conditional_properties"
        //   489: ldc_w           "app_id=?"
        //   492: aload           15
        //   494: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   497: iadd           
        //   498: aload           14
        //   500: ldc_w           "apps"
        //   503: ldc_w           "app_id=?"
        //   506: aload           15
        //   508: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   511: iadd           
        //   512: aload           14
        //   514: ldc_w           "raw_events"
        //   517: ldc_w           "app_id=?"
        //   520: aload           15
        //   522: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   525: iadd           
        //   526: aload           14
        //   528: ldc_w           "raw_events_metadata"
        //   531: ldc_w           "app_id=?"
        //   534: aload           15
        //   536: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   539: iadd           
        //   540: aload           14
        //   542: ldc_w           "event_filters"
        //   545: ldc_w           "app_id=?"
        //   548: aload           15
        //   550: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   553: iadd           
        //   554: aload           14
        //   556: ldc_w           "property_filters"
        //   559: ldc_w           "app_id=?"
        //   562: aload           15
        //   564: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   567: iadd           
        //   568: aload           14
        //   570: ldc_w           "audience_filter_values"
        //   573: ldc_w           "app_id=?"
        //   576: aload           15
        //   578: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   581: iadd           
        //   582: aload           14
        //   584: ldc_w           "consent_settings"
        //   587: ldc_w           "app_id=?"
        //   590: aload           15
        //   592: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   595: iadd           
        //   596: aload           14
        //   598: ldc_w           "default_event_params"
        //   601: ldc_w           "app_id=?"
        //   604: aload           15
        //   606: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   609: iadd           
        //   610: aload           14
        //   612: ldc_w           "trigger_uris"
        //   615: ldc_w           "app_id=?"
        //   618: aload           15
        //   620: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   623: iadd           
        //   624: istore_3       
        //   625: iload_3        
        //   626: ifle            2027
        //   629: aload           12
        //   631: invokevirtual   R2/m3.j:()LR2/Y1;
        //   634: invokevirtual   R2/Y1.K:()LR2/a2;
        //   637: ldc_w           "Deleted application data. app, records"
        //   640: aload           13
        //   642: iload_3        
        //   643: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   646: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   649: goto            2027
        //   652: astore          14
        //   654: aload           12
        //   656: invokevirtual   R2/m3.j:()LR2/Y1;
        //   659: invokevirtual   R2/Y1.G:()LR2/a2;
        //   662: ldc_w           "Error deleting application data. appId, error"
        //   665: aload           13
        //   667: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   670: aload           14
        //   672: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   675: goto            2027
        //   678: aload           12
        //   680: ifnull          810
        //   683: aload           12
        //   685: invokevirtual   R2/I2.z:()J
        //   688: ldc2_w          -2147483648
        //   691: lcmp           
        //   692: ifeq            2033
        //   695: aload           12
        //   697: invokevirtual   R2/I2.z:()J
        //   700: aload_1        
        //   701: getfield        R2/W5.x:J
        //   704: lcmp           
        //   705: ifeq            2033
        //   708: iconst_1       
        //   709: istore_3       
        //   710: goto            713
        //   713: aload           12
        //   715: invokevirtual   R2/I2.h:()Ljava/lang/String;
        //   718: astore          13
        //   720: aload           12
        //   722: invokevirtual   R2/I2.z:()J
        //   725: ldc2_w          -2147483648
        //   728: lcmp           
        //   729: ifne            2038
        //   732: aload           13
        //   734: ifnull          2038
        //   737: aload           13
        //   739: aload_1        
        //   740: getfield        R2/W5.q:Ljava/lang/String;
        //   743: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   746: ifne            2038
        //   749: iconst_1       
        //   750: istore          4
        //   752: goto            755
        //   755: iload_3        
        //   756: iload           4
        //   758: ior            
        //   759: ifeq            810
        //   762: new             Landroid/os/Bundle;
        //   765: dup            
        //   766: invokespecial   android/os/Bundle.<init>:()V
        //   769: astore          12
        //   771: aload           12
        //   773: ldc_w           "_pv"
        //   776: aload           13
        //   778: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   781: aload_0        
        //   782: new             LR2/I;
        //   785: dup            
        //   786: ldc_w           "_au"
        //   789: new             LR2/D;
        //   792: dup            
        //   793: aload           12
        //   795: invokespecial   R2/D.<init>:(Landroid/os/Bundle;)V
        //   798: ldc_w           "auto"
        //   801: lload           5
        //   803: invokespecial   R2/I.<init>:(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V
        //   806: aload_1        
        //   807: invokevirtual   R2/D5.q:(LR2/I;LR2/W5;)V
        //   810: aload_0        
        //   811: aload_1        
        //   812: invokevirtual   R2/D5.g:(LR2/W5;)LR2/I2;
        //   815: pop            
        //   816: iload_2        
        //   817: ifne            851
        //   820: aload_0        
        //   821: invokevirtual   R2/D5.e0:()LR2/p;
        //   824: astore          12
        //   826: aload_1        
        //   827: getfield        R2/W5.o:Ljava/lang/String;
        //   830: astore          13
        //   832: ldc_w           "_f"
        //   835: astore          14
        //   837: aload           12
        //   839: aload           13
        //   841: aload           14
        //   843: invokevirtual   R2/p.C0:(Ljava/lang/String;Ljava/lang/String;)LR2/E;
        //   846: astore          12
        //   848: goto            876
        //   851: iload_2        
        //   852: iconst_1       
        //   853: if_icmpne       2044
        //   856: aload_0        
        //   857: invokevirtual   R2/D5.e0:()LR2/p;
        //   860: astore          12
        //   862: aload_1        
        //   863: getfield        R2/W5.o:Ljava/lang/String;
        //   866: astore          13
        //   868: ldc_w           "_v"
        //   871: astore          14
        //   873: goto            837
        //   876: aload           12
        //   878: ifnonnull       1949
        //   881: lload           5
        //   883: ldc2_w          3600000
        //   886: ldiv           
        //   887: lstore          7
        //   889: lload           7
        //   891: lconst_1       
        //   892: ladd           
        //   893: ldc2_w          3600000
        //   896: lmul           
        //   897: lstore          7
        //   899: iload_2        
        //   900: ifne            1820
        //   903: aload_0        
        //   904: new             LR2/R5;
        //   907: dup            
        //   908: ldc_w           "_fot"
        //   911: lload           5
        //   913: lload           7
        //   915: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   918: ldc_w           "auto"
        //   921: invokespecial   R2/R5.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //   924: aload_1        
        //   925: invokevirtual   R2/D5.u:(LR2/R5;LR2/W5;)V
        //   928: aload_0        
        //   929: invokevirtual   R2/D5.e:()LR2/G2;
        //   932: invokevirtual   R2/m3.n:()V
        //   935: aload_0        
        //   936: getfield        R2/D5.k:LR2/u2;
        //   939: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //   942: checkcast       LR2/u2;
        //   945: astore          13
        //   947: aload_1        
        //   948: getfield        R2/W5.o:Ljava/lang/String;
        //   951: astore          12
        //   953: aload           12
        //   955: ifnull          1328
        //   958: aload           12
        //   960: invokevirtual   java/lang/String.isEmpty:()Z
        //   963: ifeq            969
        //   966: goto            1328
        //   969: aload           13
        //   971: getfield        R2/u2.a:LR2/N2;
        //   974: invokevirtual   R2/N2.e:()LR2/G2;
        //   977: invokevirtual   R2/m3.n:()V
        //   980: aload           13
        //   982: invokevirtual   R2/u2.b:()Z
        //   985: ifne            1016
        //   988: aload           13
        //   990: getfield        R2/u2.a:LR2/N2;
        //   993: invokevirtual   R2/N2.j:()LR2/Y1;
        //   996: invokevirtual   R2/Y1.J:()LR2/a2;
        //   999: astore          12
        //  1001: ldc_w           "Install Referrer Reporter is not available"
        //  1004: astore          13
        //  1006: aload           12
        //  1008: aload           13
        //  1010: invokevirtual   R2/a2.a:(Ljava/lang/String;)V
        //  1013: goto            1349
        //  1016: new             LR2/t2;
        //  1019: dup            
        //  1020: aload           13
        //  1022: aload           12
        //  1024: invokespecial   R2/t2.<init>:(LR2/u2;Ljava/lang/String;)V
        //  1027: astore          12
        //  1029: aload           13
        //  1031: getfield        R2/u2.a:LR2/N2;
        //  1034: invokevirtual   R2/N2.e:()LR2/G2;
        //  1037: invokevirtual   R2/m3.n:()V
        //  1040: new             Landroid/content/Intent;
        //  1043: dup            
        //  1044: ldc_w           "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
        //  1047: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //  1050: astore          14
        //  1052: aload           14
        //  1054: new             Landroid/content/ComponentName;
        //  1057: dup            
        //  1058: ldc_w           "com.android.vending"
        //  1061: ldc_w           "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
        //  1064: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1067: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //  1070: pop            
        //  1071: aload           13
        //  1073: getfield        R2/u2.a:LR2/N2;
        //  1076: invokevirtual   R2/N2.a:()Landroid/content/Context;
        //  1079: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1082: astore          15
        //  1084: aload           15
        //  1086: ifnonnull       1110
        //  1089: aload           13
        //  1091: getfield        R2/u2.a:LR2/N2;
        //  1094: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1097: invokevirtual   R2/Y1.N:()LR2/a2;
        //  1100: astore          12
        //  1102: ldc_w           "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
        //  1105: astore          13
        //  1107: goto            1006
        //  1110: aload           15
        //  1112: aload           14
        //  1114: iconst_0       
        //  1115: invokevirtual   android/content/pm/PackageManager.queryIntentServices:(Landroid/content/Intent;I)Ljava/util/List;
        //  1118: astore          15
        //  1120: aload           15
        //  1122: ifnull          1307
        //  1125: aload           15
        //  1127: invokeinterface java/util/List.isEmpty:()Z
        //  1132: ifne            1307
        //  1135: aload           15
        //  1137: iconst_0       
        //  1138: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1143: checkcast       Landroid/content/pm/ResolveInfo;
        //  1146: getfield        android/content/pm/ResolveInfo.serviceInfo:Landroid/content/pm/ServiceInfo;
        //  1149: astore          15
        //  1151: aload           15
        //  1153: ifnull          1349
        //  1156: aload           15
        //  1158: getfield        android/content/pm/ServiceInfo.packageName:Ljava/lang/String;
        //  1161: astore          16
        //  1163: aload           15
        //  1165: getfield        android/content/pm/ServiceInfo.name:Ljava/lang/String;
        //  1168: ifnull          1286
        //  1171: ldc_w           "com.android.vending"
        //  1174: aload           16
        //  1176: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1179: ifeq            1286
        //  1182: aload           13
        //  1184: invokevirtual   R2/u2.b:()Z
        //  1187: ifeq            1286
        //  1190: new             Landroid/content/Intent;
        //  1193: dup            
        //  1194: aload           14
        //  1196: invokespecial   android/content/Intent.<init>:(Landroid/content/Intent;)V
        //  1199: astore          14
        //  1201: invokestatic    D2/b.b:()LD2/b;
        //  1204: aload           13
        //  1206: getfield        R2/u2.a:LR2/N2;
        //  1209: invokevirtual   R2/N2.a:()Landroid/content/Context;
        //  1212: aload           14
        //  1214: aload           12
        //  1216: iconst_1       
        //  1217: invokevirtual   D2/b.a:(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //  1220: istore          11
        //  1222: aload           13
        //  1224: getfield        R2/u2.a:LR2/N2;
        //  1227: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1230: invokevirtual   R2/Y1.K:()LR2/a2;
        //  1233: astore          14
        //  1235: iload           11
        //  1237: ifeq            2055
        //  1240: ldc_w           "available"
        //  1243: astore          12
        //  1245: goto            1248
        //  1248: aload           14
        //  1250: ldc_w           "Install Referrer Service is"
        //  1253: aload           12
        //  1255: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1258: goto            1349
        //  1261: aload           13
        //  1263: getfield        R2/u2.a:LR2/N2;
        //  1266: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1269: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1272: ldc_w           "Exception occurred while binding to Install Referrer Service"
        //  1275: aload           12
        //  1277: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1280: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1283: goto            1349
        //  1286: aload           13
        //  1288: getfield        R2/u2.a:LR2/N2;
        //  1291: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1294: invokevirtual   R2/Y1.L:()LR2/a2;
        //  1297: astore          12
        //  1299: ldc_w           "Play Store version 8.3.73 or higher required for Install Referrer"
        //  1302: astore          13
        //  1304: goto            1006
        //  1307: aload           13
        //  1309: getfield        R2/u2.a:LR2/N2;
        //  1312: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1315: invokevirtual   R2/Y1.J:()LR2/a2;
        //  1318: astore          12
        //  1320: ldc_w           "Play Service for fetching Install Referrer is unavailable on device"
        //  1323: astore          13
        //  1325: goto            1006
        //  1328: aload           13
        //  1330: getfield        R2/u2.a:LR2/N2;
        //  1333: invokevirtual   R2/N2.j:()LR2/Y1;
        //  1336: invokevirtual   R2/Y1.N:()LR2/a2;
        //  1339: astore          12
        //  1341: ldc_w           "Install Referrer Reporter was called with invalid app package name"
        //  1344: astore          13
        //  1346: goto            1006
        //  1349: aload_0        
        //  1350: invokevirtual   R2/D5.e:()LR2/G2;
        //  1353: invokevirtual   R2/m3.n:()V
        //  1356: aload_0        
        //  1357: invokevirtual   R2/D5.p0:()V
        //  1360: new             Landroid/os/Bundle;
        //  1363: dup            
        //  1364: invokespecial   android/os/Bundle.<init>:()V
        //  1367: astore          13
        //  1369: aload           13
        //  1371: ldc_w           "_c"
        //  1374: lconst_1       
        //  1375: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1378: aload           13
        //  1380: ldc_w           "_r"
        //  1383: lconst_1       
        //  1384: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1387: aload           13
        //  1389: ldc_w           "_uwa"
        //  1392: lconst_0       
        //  1393: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1396: aload           13
        //  1398: ldc_w           "_pfo"
        //  1401: lconst_0       
        //  1402: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1405: aload           13
        //  1407: ldc_w           "_sys"
        //  1410: lconst_0       
        //  1411: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1414: aload           13
        //  1416: ldc_w           "_sysu"
        //  1419: lconst_0       
        //  1420: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1423: aload           13
        //  1425: ldc_w           "_et"
        //  1428: lconst_1       
        //  1429: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1432: aload_1        
        //  1433: getfield        R2/W5.D:Z
        //  1436: ifeq            1448
        //  1439: aload           13
        //  1441: ldc_w           "_dac"
        //  1444: lconst_1       
        //  1445: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1448: aload_1        
        //  1449: getfield        R2/W5.o:Ljava/lang/String;
        //  1452: invokestatic    A2/n.i:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1455: checkcast       Ljava/lang/String;
        //  1458: astore          14
        //  1460: aload_0        
        //  1461: invokevirtual   R2/D5.e0:()LR2/p;
        //  1464: astore          12
        //  1466: aload           14
        //  1468: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1471: pop            
        //  1472: aload           12
        //  1474: invokevirtual   R2/m3.n:()V
        //  1477: aload           12
        //  1479: invokevirtual   R2/C5.u:()V
        //  1482: aload           12
        //  1484: aload           14
        //  1486: ldc_w           "first_open_count"
        //  1489: invokevirtual   R2/p.w0:(Ljava/lang/String;Ljava/lang/String;)J
        //  1492: lstore          9
        //  1494: aload_0        
        //  1495: getfield        R2/D5.l:LR2/N2;
        //  1498: invokevirtual   R2/N2.a:()Landroid/content/Context;
        //  1501: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1504: ifnonnull       1528
        //  1507: aload_0        
        //  1508: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1511: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1514: ldc_w           "PackageManager is null, first open report might be inaccurate. appId"
        //  1517: aload           14
        //  1519: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1522: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1525: goto            1771
        //  1528: aload_0        
        //  1529: getfield        R2/D5.l:LR2/N2;
        //  1532: invokevirtual   R2/N2.a:()Landroid/content/Context;
        //  1535: invokestatic    G2/d.a:(Landroid/content/Context;)LG2/c;
        //  1538: aload           14
        //  1540: iconst_0       
        //  1541: invokevirtual   G2/c.e:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  1544: astore          12
        //  1546: goto            1574
        //  1549: astore          12
        //  1551: aload_0        
        //  1552: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1555: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1558: ldc_w           "Package info is null, first open report might be inaccurate. appId"
        //  1561: aload           14
        //  1563: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1566: aload           12
        //  1568: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1571: aconst_null    
        //  1572: astore          12
        //  1574: aload           12
        //  1576: ifnull          1674
        //  1579: aload           12
        //  1581: getfield        android/content/pm/PackageInfo.firstInstallTime:J
        //  1584: lstore          7
        //  1586: lload           7
        //  1588: lconst_0       
        //  1589: lcmp           
        //  1590: ifeq            1674
        //  1593: lload           7
        //  1595: aload           12
        //  1597: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //  1600: lcmp           
        //  1601: ifeq            2068
        //  1604: aload_0        
        //  1605: invokevirtual   R2/D5.c0:()LR2/g;
        //  1608: getstatic       R2/K.o0:LR2/P1;
        //  1611: invokevirtual   R2/g.s:(LR2/P1;)Z
        //  1614: ifeq            1624
        //  1617: lload           9
        //  1619: lconst_0       
        //  1620: lcmp           
        //  1621: ifne            2063
        //  1624: aload           13
        //  1626: ldc_w           "_uwa"
        //  1629: lconst_1       
        //  1630: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1633: goto            2063
        //  1636: iload_2        
        //  1637: ifeq            2073
        //  1640: lconst_1       
        //  1641: lstore          7
        //  1643: goto            1646
        //  1646: aload_0        
        //  1647: new             LR2/R5;
        //  1650: dup            
        //  1651: ldc_w           "_fi"
        //  1654: lload           5
        //  1656: lload           7
        //  1658: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1661: ldc_w           "auto"
        //  1664: invokespecial   R2/R5.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //  1667: aload_1        
        //  1668: invokevirtual   R2/D5.u:(LR2/R5;LR2/W5;)V
        //  1671: goto            1674
        //  1674: aload_0        
        //  1675: getfield        R2/D5.l:LR2/N2;
        //  1678: invokevirtual   R2/N2.a:()Landroid/content/Context;
        //  1681: invokestatic    G2/d.a:(Landroid/content/Context;)LG2/c;
        //  1684: aload           14
        //  1686: iconst_0       
        //  1687: invokevirtual   G2/c.c:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //  1690: astore          12
        //  1692: goto            1720
        //  1695: astore          12
        //  1697: aload_0        
        //  1698: invokevirtual   R2/D5.j:()LR2/Y1;
        //  1701: invokevirtual   R2/Y1.G:()LR2/a2;
        //  1704: ldc_w           "Application info is null, first open report might be inaccurate. appId"
        //  1707: aload           14
        //  1709: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //  1712: aload           12
        //  1714: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1717: aconst_null    
        //  1718: astore          12
        //  1720: aload           12
        //  1722: ifnull          1525
        //  1725: aload           12
        //  1727: getfield        android/content/pm/ApplicationInfo.flags:I
        //  1730: iconst_1       
        //  1731: iand           
        //  1732: ifeq            2079
        //  1735: aload           13
        //  1737: ldc_w           "_sys"
        //  1740: lconst_1       
        //  1741: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1744: goto            1747
        //  1747: aload           12
        //  1749: getfield        android/content/pm/ApplicationInfo.flags:I
        //  1752: sipush          128
        //  1755: iand           
        //  1756: ifeq            1525
        //  1759: aload           13
        //  1761: ldc_w           "_sysu"
        //  1764: lconst_1       
        //  1765: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1768: goto            1525
        //  1771: lload           9
        //  1773: lconst_0       
        //  1774: lcmp           
        //  1775: iflt            1788
        //  1778: aload           13
        //  1780: ldc_w           "_pfo"
        //  1783: lload           9
        //  1785: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1788: aload_0        
        //  1789: new             LR2/I;
        //  1792: dup            
        //  1793: ldc_w           "_f"
        //  1796: new             LR2/D;
        //  1799: dup            
        //  1800: aload           13
        //  1802: invokespecial   R2/D.<init>:(Landroid/os/Bundle;)V
        //  1805: ldc_w           "auto"
        //  1808: lload           5
        //  1810: invokespecial   R2/I.<init>:(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V
        //  1813: aload_1        
        //  1814: invokevirtual   R2/D5.U:(LR2/I;LR2/W5;)V
        //  1817: goto            1990
        //  1820: iload_2        
        //  1821: iconst_1       
        //  1822: if_icmpne       1990
        //  1825: aload_0        
        //  1826: new             LR2/R5;
        //  1829: dup            
        //  1830: ldc_w           "_fvt"
        //  1833: lload           5
        //  1835: lload           7
        //  1837: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1840: ldc_w           "auto"
        //  1843: invokespecial   R2/R5.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //  1846: aload_1        
        //  1847: invokevirtual   R2/D5.u:(LR2/R5;LR2/W5;)V
        //  1850: aload_0        
        //  1851: invokevirtual   R2/D5.e:()LR2/G2;
        //  1854: invokevirtual   R2/m3.n:()V
        //  1857: aload_0        
        //  1858: invokevirtual   R2/D5.p0:()V
        //  1861: new             Landroid/os/Bundle;
        //  1864: dup            
        //  1865: invokespecial   android/os/Bundle.<init>:()V
        //  1868: astore          12
        //  1870: aload           12
        //  1872: ldc_w           "_c"
        //  1875: lconst_1       
        //  1876: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1879: aload           12
        //  1881: ldc_w           "_r"
        //  1884: lconst_1       
        //  1885: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1888: aload           12
        //  1890: ldc_w           "_et"
        //  1893: lconst_1       
        //  1894: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1897: aload_1        
        //  1898: getfield        R2/W5.D:Z
        //  1901: ifeq            1913
        //  1904: aload           12
        //  1906: ldc_w           "_dac"
        //  1909: lconst_1       
        //  1910: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  1913: new             LR2/I;
        //  1916: dup            
        //  1917: ldc_w           "_v"
        //  1920: new             LR2/D;
        //  1923: dup            
        //  1924: aload           12
        //  1926: invokespecial   R2/D.<init>:(Landroid/os/Bundle;)V
        //  1929: ldc_w           "auto"
        //  1932: lload           5
        //  1934: invokespecial   R2/I.<init>:(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V
        //  1937: astore          12
        //  1939: aload_0        
        //  1940: aload           12
        //  1942: aload_1        
        //  1943: invokevirtual   R2/D5.U:(LR2/I;LR2/W5;)V
        //  1946: goto            1990
        //  1949: aload_1        
        //  1950: getfield        R2/W5.w:Z
        //  1953: ifeq            1990
        //  1956: new             LR2/I;
        //  1959: dup            
        //  1960: ldc_w           "_cd"
        //  1963: new             LR2/D;
        //  1966: dup            
        //  1967: new             Landroid/os/Bundle;
        //  1970: dup            
        //  1971: invokespecial   android/os/Bundle.<init>:()V
        //  1974: invokespecial   R2/D.<init>:(Landroid/os/Bundle;)V
        //  1977: ldc_w           "auto"
        //  1980: lload           5
        //  1982: invokespecial   R2/I.<init>:(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V
        //  1985: astore          12
        //  1987: goto            1939
        //  1990: aload_0        
        //  1991: invokevirtual   R2/D5.e0:()LR2/p;
        //  1994: invokevirtual   R2/p.T0:()V
        //  1997: aload_0        
        //  1998: invokevirtual   R2/D5.e0:()LR2/p;
        //  2001: invokevirtual   R2/p.R0:()V
        //  2004: return         
        //  2005: aload_0        
        //  2006: invokevirtual   R2/D5.e0:()LR2/p;
        //  2009: invokevirtual   R2/p.R0:()V
        //  2012: aload_1        
        //  2013: athrow         
        //  2014: goto            327
        //  2017: astore_1       
        //  2018: goto            2005
        //  2021: lconst_0       
        //  2022: lstore          7
        //  2024: goto            261
        //  2027: aconst_null    
        //  2028: astore          12
        //  2030: goto            678
        //  2033: iconst_0       
        //  2034: istore_3       
        //  2035: goto            713
        //  2038: iconst_0       
        //  2039: istore          4
        //  2041: goto            755
        //  2044: aconst_null    
        //  2045: astore          12
        //  2047: goto            876
        //  2050: astore          12
        //  2052: goto            1261
        //  2055: ldc_w           "not available"
        //  2058: astore          12
        //  2060: goto            1248
        //  2063: iconst_0       
        //  2064: istore_2       
        //  2065: goto            1636
        //  2068: iconst_1       
        //  2069: istore_2       
        //  2070: goto            1636
        //  2073: lconst_0       
        //  2074: lstore          7
        //  2076: goto            1646
        //  2079: goto            1747
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  200    216    2017   2014   Any
        //  221    235    2017   2014   Any
        //  238    255    2017   2014   Any
        //  261    283    2017   2014   Any
        //  288    304    2017   2014   Any
        //  304    311    2017   2014   Any
        //  319    327    2017   2014   Any
        //  327    346    2017   2014   Any
        //  355    360    2017   2014   Any
        //  364    438    2017   2014   Any
        //  438    451    652    678    Landroid/database/sqlite/SQLiteException;
        //  438    451    2017   2014   Any
        //  457    625    652    678    Landroid/database/sqlite/SQLiteException;
        //  457    625    2017   2014   Any
        //  629    649    652    678    Landroid/database/sqlite/SQLiteException;
        //  629    649    2017   2014   Any
        //  654    675    2017   2014   Any
        //  683    708    2017   2014   Any
        //  713    732    2017   2014   Any
        //  737    749    2017   2014   Any
        //  762    810    2017   2014   Any
        //  810    816    2017   2014   Any
        //  820    832    2017   2014   Any
        //  837    848    2017   2014   Any
        //  856    868    2017   2014   Any
        //  881    889    2017   2014   Any
        //  903    953    2017   2014   Any
        //  958    966    2017   2014   Any
        //  969    1001   2017   2014   Any
        //  1006   1013   2017   2014   Any
        //  1016   1084   2017   2014   Any
        //  1089   1102   2017   2014   Any
        //  1110   1120   2017   2014   Any
        //  1125   1151   2017   2014   Any
        //  1156   1201   2017   2014   Any
        //  1201   1235   2050   1286   Ljava/lang/RuntimeException;
        //  1201   1235   2017   2014   Any
        //  1248   1258   2050   1286   Ljava/lang/RuntimeException;
        //  1248   1258   2017   2014   Any
        //  1261   1283   2017   2014   Any
        //  1286   1299   2017   2014   Any
        //  1307   1320   2017   2014   Any
        //  1328   1341   2017   2014   Any
        //  1349   1448   2017   2014   Any
        //  1448   1525   2017   2014   Any
        //  1528   1546   1549   1574   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1528   1546   2017   2014   Any
        //  1551   1571   2017   2014   Any
        //  1579   1586   2017   2014   Any
        //  1593   1617   2017   2014   Any
        //  1624   1633   2017   2014   Any
        //  1646   1671   2017   2014   Any
        //  1674   1692   1695   1720   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1674   1692   2017   2014   Any
        //  1697   1717   2017   2014   Any
        //  1725   1744   2017   2014   Any
        //  1747   1768   2017   2014   Any
        //  1778   1788   2017   2014   Any
        //  1788   1817   2017   2014   Any
        //  1825   1913   2017   2014   Any
        //  1913   1939   2017   2014   Any
        //  1939   1946   2017   2014   Any
        //  1949   1987   2017   2014   Any
        //  1990   1997   2017   2014   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1248:
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
    
    @Override
    public final Context a() {
        return this.l.a();
    }
    
    public final z a0(final String s) {
        this.e().n();
        this.p0();
        if (n6.a()) {
            z g0;
            if ((g0 = this.C.get(s)) == null) {
                g0 = this.e0().G0(s);
                this.C.put(s, g0);
            }
            return g0;
        }
        return R2.z.f;
    }
    
    @Override
    public final E2.e b() {
        return ((N2)A2.n.i(this.l)).b();
    }
    
    public final void b0(final W5 w5) {
        if (this.y != null) {
            (this.z = new ArrayList()).addAll(this.y);
        }
        final p e0 = this.e0();
        final String s = (String)A2.n.i(w5.o);
        A2.n.e(s);
        e0.n();
        e0.u();
        try {
            final SQLiteDatabase b = e0.B();
            final String[] array = { s };
            final int i = b.delete("apps", "app_id=?", array) + b.delete("events", "app_id=?", array) + b.delete("user_attributes", "app_id=?", array) + b.delete("conditional_properties", "app_id=?", array) + b.delete("raw_events", "app_id=?", array) + b.delete("raw_events_metadata", "app_id=?", array) + b.delete("queue", "app_id=?", array) + b.delete("audience_filter_values", "app_id=?", array) + b.delete("main_event_params", "app_id=?", array) + b.delete("default_event_params", "app_id=?", array) + b.delete("trigger_uris", "app_id=?", array);
            if (i > 0) {
                e0.j().K().c("Reset analytics data. app, records", s, i);
            }
        }
        catch (SQLiteException ex) {
            e0.j().G().c("Error resetting analytics data. appId, error", R2.Y1.v(s), ex);
        }
        if (w5.v) {
            this.Z(w5);
        }
    }
    
    public final int c(final FileChannel fileChannel) {
        this.e().n();
        while (true) {
            if (fileChannel != null && fileChannel.isOpen()) {
                final ByteBuffer allocate = ByteBuffer.allocate(4);
                while (true) {
                    try {
                        fileChannel.position(0L);
                        final int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            return allocate.getInt();
                        }
                        if (read != -1) {
                            this.j().L().b("Unexpected data length. Bytes read", read);
                            return 0;
                        }
                        return 0;
                        final IOException ex;
                        this.j().G().b("Failed to read from channel", ex);
                        return 0;
                        this.j().G().a("Bad channel to read from");
                        return 0;
                    }
                    catch (IOException ex2) {}
                    final IOException ex2;
                    final IOException ex = ex2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public final g c0() {
        return ((N2)A2.n.i(this.l)).z();
    }
    
    @Override
    public final f d() {
        return this.l.d();
    }
    
    @Override
    public final G2 e() {
        return ((N2)A2.n.i(this.l)).e();
    }
    
    public final p e0() {
        return (p)i(this.c);
    }
    
    public final z f(String join, final z z, final q3 q3, final l l) {
        if (!n6.a()) {
            return z.f;
        }
        final I1 j = this.h0().J(join);
        int a = 90;
        if (j == null) {
            final Boolean f = z.f();
            final Boolean false = Boolean.FALSE;
            if (f == false) {
                a = z.a();
                l.c(R2.q3.a.r, a);
            }
            else {
                l.d(R2.q3.a.r, R2.k.w);
            }
            return new z(false, a, Boolean.TRUE, "-");
        }
        final Boolean f2 = z.f();
        int a2;
        Boolean value;
        if (f2 != null) {
            a2 = z.a();
            l.c(R2.q3.a.r, a2);
            value = f2;
        }
        else {
            final x2 a3 = this.a;
            final q3.a r = R2.q3.a.r;
            Boolean s = f2;
            if (a3.A(join, r) == R2.q3.a.p) {
                s = f2;
                if (q3.s() != null) {
                    s = q3.s();
                    l.d(r, R2.k.r);
                }
            }
            value = s;
            a2 = a;
            if (s == null) {
                value = this.a.K(join, r);
                l.d(r, R2.k.q);
                a2 = a;
            }
        }
        A2.n.i(value);
        final boolean y = this.a.Y(join);
        final SortedSet s2 = this.h0().S(join);
        if (value && !s2.isEmpty()) {
            final Boolean true = Boolean.TRUE;
            join = "";
            if (y) {
                join = TextUtils.join((CharSequence)"", (Iterable)s2);
            }
            return new z(true, a2, y, join);
        }
        return new z(Boolean.FALSE, a2, y, "-");
    }
    
    public final X1 f0() {
        return this.l.D();
    }
    
    public final I2 g(final W5 w5) {
        this.e().n();
        this.p0();
        A2.n.i(w5);
        A2.n.e(w5.o);
        final boolean empty = w5.K.isEmpty();
        final List list = null;
        if (!empty) {
            this.D.put(w5.o, new b(w5.K, null));
        }
        final I2 d0 = this.e0().D0(w5.o);
        final q3 c = this.Q(w5.o).c(q3.e(w5.J));
        String a;
        if (c.x()) {
            a = this.i.A(w5.o, w5.C);
        }
        else {
            a = "";
        }
        I2 i3;
        if (d0 == null) {
            final I2 i2 = new I2(this.l, w5.o);
            if (c.y()) {
                i2.x(this.n(c));
            }
            i3 = i2;
            if (c.x()) {
                i2.S(a);
                i3 = i2;
            }
        }
        else if (c.x() && a != null && !a.equals(d0.l())) {
            d0.S(a);
            i3 = d0;
            if (w5.C) {
                i3 = d0;
                if (!"00000000-0000-0000-0000-000000000000".equals(this.i.z(w5.o, c).first)) {
                    d0.x(this.n(c));
                    i3 = d0;
                    if (this.e0().F0(w5.o, "_id") != null) {
                        i3 = d0;
                        if (this.e0().F0(w5.o, "_lair") == null) {
                            this.e0().d0(new T5(w5.o, "auto", "_lair", this.b().a(), 1L));
                            i3 = d0;
                        }
                    }
                }
            }
        }
        else {
            i3 = d0;
            if (TextUtils.isEmpty((CharSequence)d0.u0())) {
                i3 = d0;
                if (c.y()) {
                    d0.x(this.n(c));
                    i3 = d0;
                }
            }
        }
        i3.M(w5.p);
        i3.e(w5.E);
        if (!TextUtils.isEmpty((CharSequence)w5.y)) {
            i3.J(w5.y);
        }
        final long s = w5.s;
        if (s != 0L) {
            i3.d0(s);
        }
        if (!TextUtils.isEmpty((CharSequence)w5.q)) {
            i3.F(w5.q);
        }
        i3.c(w5.x);
        final String r = w5.r;
        if (r != null) {
            i3.B(r);
        }
        i3.X(w5.t);
        i3.y(w5.v);
        if (!TextUtils.isEmpty((CharSequence)w5.u)) {
            i3.P(w5.u);
        }
        i3.g(w5.C);
        i3.d(w5.F);
        i3.Z(w5.G);
        if (s7.a() && (this.c0().s(K.w0) || this.c0().B(w5.o, K.y0))) {
            i3.V(w5.L);
        }
        Label_0688: {
            List h;
            if (o6.a() && this.c0().s(K.v0)) {
                h = w5.H;
            }
            else {
                if (!o6.a() || !this.c0().s(K.u0)) {
                    break Label_0688;
                }
                h = list;
            }
            i3.f(h);
        }
        if (E7.a() && this.c0().s(K.A0)) {
            i3.C(w5.M);
        }
        if (g7.a() && this.c0().s(K.L0)) {
            i3.b(w5.Q);
        }
        i3.n0(w5.N);
        if (i3.s()) {
            this.e0().U(i3);
        }
        return i3;
    }
    
    public final f2 g0() {
        return (f2)i(this.b);
    }
    
    public final x2 h0() {
        return (x2)i(this.a);
    }
    
    public final N2 i0() {
        return this.l;
    }
    
    @Override
    public final R2.Y1 j() {
        return ((N2)A2.n.i(this.l)).j();
    }
    
    public final u4 j0() {
        return (u4)i(this.h);
    }
    
    public final g5 k0() {
        return this.i;
    }
    
    public final Bundle l(String s) {
        this.e().n();
        this.p0();
        if (!n6.a()) {
            return null;
        }
        if (this.h0().J(s) == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final q3 q = this.Q(s);
        bundle.putAll(q.p());
        bundle.putAll(this.f(s, this.a0(s), q, new l()).e());
        int equals = 0;
        Label_0146: {
            if (!this.m0().h0(s)) {
                final T5 f0 = this.e0().F0(s, "_npa");
                if (f0 != null) {
                    equals = (f0.e.equals(1L) ? 1 : 0);
                    break Label_0146;
                }
                if (this.a.K(s, q3.a.s)) {
                    equals = 0;
                    break Label_0146;
                }
            }
            equals = 1;
        }
        if (equals == 1) {
            s = "denied";
        }
        else {
            s = "granted";
        }
        ((BaseBundle)bundle).putString("ad_personalization", s);
        return bundle;
    }
    
    public final B5 l0() {
        return this.j;
    }
    
    public final Boolean m(final I2 i2) {
        try {
            if (i2.z() != -2147483648L) {
                if (i2.z() == G2.d.a(this.l.a()).e(i2.t0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            }
            else {
                final String versionName = G2.d.a(this.l.a()).e(i2.t0(), 0).versionName;
                final String h = i2.h();
                if (h != null && h.equals(versionName)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public final N5 m0() {
        return (N5)i(this.g);
    }
    
    public final String n(final q3 q3) {
        if (q3.y()) {
            final byte[] array = new byte[16];
            this.n0().U0().nextBytes(array);
            return String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        return null;
    }
    
    public final S5 n0() {
        return ((N2)A2.n.i(this.l)).L();
    }
    
    public final void o(final e e) {
        final W5 w = this.W((String)A2.n.i(e.o));
        if (w != null) {
            this.p(e, w);
        }
    }
    
    public final void o0() {
        this.e().n();
        this.p0();
        if (!this.n) {
            this.n = true;
            if (this.P()) {
                final int c = this.c(this.x);
                final int d = this.l.B().D();
                this.e().n();
                R2.a2 a2;
                Integer n;
                Integer n2;
                String s;
                if (c > d) {
                    a2 = this.j().G();
                    n = c;
                    n2 = d;
                    s = "Panic: can't downgrade version. Previous, current version";
                }
                else {
                    if (c >= d) {
                        return;
                    }
                    if (this.J(d, this.x)) {
                        a2 = this.j().K();
                        n = c;
                        n2 = d;
                        s = "Storage version upgraded. Previous, current version";
                    }
                    else {
                        a2 = this.j().G();
                        n = c;
                        n2 = d;
                        s = "Storage version upgrade failed. Previous, current version";
                    }
                }
                a2.c(s, n, n2);
            }
        }
    }
    
    public final void p(final e e, final W5 w5) {
        A2.n.i(e);
        A2.n.e(e.o);
        A2.n.i(e.q);
        A2.n.e(e.q.p);
        this.e().n();
        this.p0();
        if (!d0(w5)) {
            return;
        }
        if (!w5.v) {
            this.g(w5);
            return;
        }
        while (true) {
            this.e0().Q0();
        Label_0217_Outer:
            while (true) {
                Label_0336: {
                    while (true) {
                        while (true) {
                            try {
                                this.g(w5);
                                final String s = (String)A2.n.i(e.o);
                                final e a0 = this.e0().A0(s, e.q.p);
                                if (a0 != null) {
                                    this.j().F().c("Removing conditional user property", e.o, this.l.D().g(e.q.p));
                                    this.e0().D(s, e.q.p);
                                    if (a0.s) {
                                        this.e0().L0(s, e.q.p);
                                    }
                                    Object o = e.y;
                                    if (o != null) {
                                        o = ((I)o).p;
                                        if (o != null) {
                                            o = ((D)o).g();
                                            break Label_0333;
                                        }
                                        break Label_0336;
                                    }
                                }
                                else {
                                    this.j().L().c("Conditional user property doesn't exist", R2.Y1.v(e.o), this.l.D().g(e.q.p));
                                }
                                final e e2;
                                while (true) {
                                    this.e0().T0();
                                    this.e0().R0();
                                    return;
                                    final Object o;
                                    this.Y((I)A2.n.i(this.n0().C(s, ((I)A2.n.i(e2.y)).o, (Bundle)o, a0.p, e2.y.r, true, true)), w5);
                                    continue Label_0217_Outer;
                                }
                                this.e0().R0();
                                throw e2;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                        continue;
                    }
                }
                Object o = null;
                continue;
            }
        }
    }
    
    public final void p0() {
        if (this.m) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }
    
    public final void q(I a, final W5 w5) {
        A2.n.i(w5);
        A2.n.e(w5.o);
        this.e().n();
        this.p0();
        final String o = w5.o;
        final long r = a.r;
        final c2 b = c2.b(a);
        this.e().n();
        w4 e = null;
        Label_0087: {
            if (this.E != null) {
                final String f = this.F;
                if (f != null) {
                    if (f.equals(o)) {
                        e = this.E;
                        break Label_0087;
                    }
                }
            }
            e = null;
        }
        S5.L(e, b.d, false);
        a = b.a();
        this.m0();
        if (!N5.c0(a, w5)) {
            return;
        }
        if (!w5.v) {
            this.g(w5);
            return;
        }
        final List h = w5.H;
        if (h != null) {
            if (!h.contains(a.o)) {
                this.j().F().d("Dropping non-safelisted event. appId, event name, origin", o, a.o, a.q);
                return;
            }
            final Bundle g = a.p.g();
            ((BaseBundle)g).putLong("ga_safelisted", 1L);
            a = new I(a.o, new D(g), a.q, a.r);
        }
        this.e0().Q0();
        while (true) {
            try {
                final p e2 = this.e0();
                A2.n.e(o);
                e2.n();
                e2.u();
                final long n = lcmp(r, 0L);
                List<e> list;
                if (n < 0) {
                    e2.j().L().c("Invalid time querying timed out conditional properties", R2.Y1.v(o), r);
                    list = Collections.emptyList();
                }
                else {
                    list = (List<e>)e2.S("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { o, String.valueOf(r) });
                }
                for (final e e3 : list) {
                    if (e3 != null) {
                        this.j().K().d("User property timed out", e3.o, this.l.D().g(e3.q.p), e3.q.a());
                        if (e3.u != null) {
                            this.Y(new I(e3.u, r), w5);
                        }
                        this.e0().D(o, e3.q.p);
                    }
                }
                final p e4 = this.e0();
                A2.n.e(o);
                e4.n();
                e4.u();
                List<Object> list2;
                if (n < 0) {
                    e4.j().L().c("Invalid time querying expired conditional properties", R2.Y1.v(o), r);
                    list2 = Collections.emptyList();
                }
                else {
                    list2 = (List<Object>)e4.S("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { o, String.valueOf(r) });
                }
                final ArrayList list3 = new ArrayList<I>(list2.size());
                for (final e e5 : list2) {
                    if (e5 != null) {
                        this.j().K().d("User property expired", e5.o, this.l.D().g(e5.q.p), e5.q.a());
                        this.e0().L0(o, e5.q.p);
                        final I y = e5.y;
                        if (y != null) {
                            list3.add(y);
                        }
                        this.e0().D(o, e5.q.p);
                    }
                }
                final int size = list3.size();
                int i = 0;
                while (i < size) {
                    final I value = list3.get(i);
                    ++i;
                    this.Y(new I(value, r), w5);
                }
                final p e6 = this.e0();
                final String o2 = a.o;
                A2.n.e(o);
                A2.n.e(o2);
                e6.n();
                e6.u();
                List<Object> list4;
                if (n < 0) {
                    e6.j().L().d("Invalid time querying triggered conditional properties", R2.Y1.v(o), e6.h().c(o2), r);
                    list4 = Collections.emptyList();
                }
                else {
                    list4 = (List<Object>)e6.S("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { o, o2, String.valueOf(r) });
                }
                final ArrayList list5 = new ArrayList<I>(list4.size());
                for (final e e7 : list4) {
                    if (e7 != null) {
                        final R5 q = e7.q;
                        final T5 t5 = new T5((String)A2.n.i(e7.o), e7.p, q.p, r, A2.n.i(q.a()));
                        R2.a2 a2;
                        String s;
                        Object o3;
                        String s2;
                        Object o4;
                        if (this.e0().d0(t5)) {
                            a2 = this.j().K();
                            s = "User property triggered";
                            o3 = e7.o;
                            s2 = this.l.D().g(t5.c);
                            o4 = t5.e;
                        }
                        else {
                            a2 = this.j().G();
                            s = "Too many active user properties, ignoring";
                            o3 = R2.Y1.v(e7.o);
                            s2 = this.l.D().g(t5.c);
                            o4 = t5.e;
                        }
                        a2.d(s, o3, s2, o4);
                        final I w6 = e7.w;
                        if (w6 != null) {
                            list5.add(w6);
                        }
                        e7.q = new R5(t5);
                        e7.s = true;
                        this.e0().b0(e7);
                    }
                }
                this.Y(a, w5);
                final int size2 = list5.size();
                int j = 0;
                while (j < size2) {
                    final I value2 = list5.get(j);
                    ++j;
                    this.Y(new I(value2, r), w5);
                }
                this.e0().T0();
                this.e0().R0();
                return;
                this.e0().R0();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void q0() {
        ++this.s;
    }
    
    public final void r(final I i, final String s) {
        final I2 d0 = this.e0().D0(s);
        if (d0 != null && !TextUtils.isEmpty((CharSequence)d0.h())) {
            final Boolean m = this.m(d0);
            if (m == null) {
                if (!"_ui".equals(i.o)) {
                    this.j().L().b("Could not find package. appId", R2.Y1.v(s));
                }
            }
            else if (!m) {
                this.j().G().b("App version does not match; dropping event. appId", R2.Y1.v(s));
                return;
            }
            final q3 q = this.Q(s);
            String j;
            int b;
            if (n6.a() && this.c0().s(K.T0)) {
                j = this.a0(s).i();
                b = q.b();
            }
            else {
                j = "";
                b = 100;
            }
            this.U(i, new W5(s, d0.j(), d0.h(), d0.z(), d0.v0(), d0.g0(), d0.a0(), null, d0.r(), false, d0.i(), d0.v(), 0L, 0, d0.q(), false, d0.r0(), d0.q0(), d0.c0(), d0.n(), null, q.v(), "", null, d0.t(), d0.p0(), b, j, d0.a(), d0.D()));
            return;
        }
        this.j().F().b("No app data available; dropping event", s);
    }
    
    public final void r0() {
        ++this.r;
    }
    
    public final void s(final I2 i2, final d2.a a) {
        this.e().n();
        this.p0();
        if (n6.a()) {
            final l b = R2.l.b(a.U0());
            final String t0 = i2.t0();
            this.e().n();
            this.p0();
            if (n6.a()) {
                final q3 q = this.Q(t0);
                if (n6.a() && this.c0().s(K.V0)) {
                    a.o0(q.w());
                }
                if (q.s() != null) {
                    b.c(q3.a.p, q.b());
                }
                else {
                    b.d(q3.a.p, R2.k.w);
                }
                if (q.u() != null) {
                    b.c(q3.a.q, q.b());
                }
                else {
                    b.d(q3.a.q, R2.k.w);
                }
            }
            final String t2 = i2.t0();
            this.e().n();
            this.p0();
            if (n6.a()) {
                final z f = this.f(t2, this.a0(t2), this.Q(t2), b);
                a.P((boolean)A2.n.i(f.g()));
                if (!TextUtils.isEmpty((CharSequence)f.h())) {
                    a.s0(f.h());
                }
            }
            this.e().n();
            this.p0();
            Label_0532: {
                if (n6.a()) {
                    while (true) {
                        for (final h2 h2 : a.Z0()) {
                            if ("_npa".equals(h2.Z())) {
                                if (h2 != null) {
                                    final q3.a s = q3.a.s;
                                    if (b.a(s) == R2.k.p) {
                                        final Boolean q2 = i2.q0();
                                        k k;
                                        if (q2 != null && (q2 != Boolean.TRUE || h2.U() == 1L) && (q2 != Boolean.FALSE || h2.U() == 0L)) {
                                            k = R2.k.s;
                                        }
                                        else {
                                            k = R2.k.u;
                                        }
                                        b.d(s, k);
                                    }
                                    break Label_0532;
                                }
                                else {
                                    if (n6.a() && this.c0().s(K.W0)) {
                                        final I1 j = this.a.J(i2.t0());
                                        boolean b2 = true;
                                        if (j == null) {
                                            b.d(q3.a.s, R2.k.w);
                                        }
                                        else {
                                            final x2 a2 = this.a;
                                            final String t3 = i2.t0();
                                            final q3.a s2 = q3.a.s;
                                            b2 = (true ^ a2.K(t3, s2));
                                            b.d(s2, R2.k.q);
                                        }
                                        a.G((h2)((Y3.b)h2.X().z("_npa").B(this.b().a()).y(b2 ? 1 : 0)).p());
                                    }
                                    break Label_0532;
                                }
                            }
                        }
                        h2 h2 = null;
                        continue;
                    }
                }
            }
            a.k0(b.toString());
        }
    }
    
    public final void s0() {
        this.e().n();
        this.e0().S0();
        if (this.i.g.a() == 0L) {
            this.i.g.b(this.b().a());
        }
        this.N();
    }
    
    public final void t0() {
        Boolean w;
        R2.a2 a2;
        Object o;
        boolean x;
        long n;
        int n2;
        long g;
        int u;
        Object o2;
        long a3;
        String c;
        boolean x2;
        Object subList;
        Iterator<Y1> iterator2;
        d2 d2;
        int size;
        Object o3;
        boolean y;
        boolean b;
        int n3 = 0;
        Object u2;
        Object h;
        int n4;
        Y1 y2;
        String k;
        f2 g2;
        p e0;
        String o4;
        I2 d3;
        Label_0054_Outer:Label_0059_Outer:Label_1594_Outer:Label_0812_Outer:Label_1308_Outer:
        while (true) {
            this.e().n();
            this.p0();
            this.v = true;
        Label_1308:
            while (true) {
            Label_1164_Outer:
                while (true) {
                Label_1646:
                    while (true) {
                        Label_1643: {
                        Label_1640:
                            while (true) {
                            Label_1594:
                                while (true) {
                                    try {
                                        w = this.l.J().W();
                                        while (true) {
                                        Label_1501:
                                            while (true) {
                                            Label_1266:
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                Label_0072: {
                                                                    if (w != null) {
                                                                        break Label_0072;
                                                                    }
                                                                    try {
                                                                        a2 = this.j().L();
                                                                        o = "Upload data called on the client side before use of service was decided";
                                                                        a2.a((String)o);
                                                                        this.v = false;
                                                                        this.M();
                                                                        return;
                                                                    }
                                                                    finally {
                                                                        x = false;
                                                                        break Label_1594;
                                                                    }
                                                                }
                                                                if (w) {
                                                                    a2 = this.j().G();
                                                                    o = "Upload called in the client side when service should be used";
                                                                    continue Label_0054_Outer;
                                                                }
                                                                n = this.o;
                                                                if (n <= 0L) {
                                                                    this.e().n();
                                                                    if (this.y != null) {
                                                                        a2 = this.j().K();
                                                                        o = "Uploading requested multiple times";
                                                                        continue Label_0054_Outer;
                                                                    }
                                                                    if (!this.g0().A()) {
                                                                        this.j().K().a("Network not connected, ignoring upload request");
                                                                    }
                                                                    else {
                                                                        n = this.b().a();
                                                                        n2 = this.c0().u(null, K.U);
                                                                        this.c0();
                                                                        g = R2.g.G();
                                                                        for (int u = 0; u < n2 && this.L(null, n - g); ++u) {}
                                                                        if (g7.a()) {
                                                                            this.e().n();
                                                                            for (final Object o : this.q) {
                                                                                if (g7.a() && this.c0().B((String)o, K.L0)) {
                                                                                    this.j().F().b("Notifying app that trigger URIs are available. App ID", o);
                                                                                    o2 = new Intent();
                                                                                    ((Intent)o2).setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                                                    ((Intent)o2).setPackage((String)o);
                                                                                    this.l.a().sendBroadcast((Intent)o2);
                                                                                }
                                                                            }
                                                                            this.q.clear();
                                                                        }
                                                                        a3 = this.i.g.a();
                                                                        if (a3 != 0L) {
                                                                            this.j().F().b("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(n - a3));
                                                                        }
                                                                        c = this.e0().C();
                                                                        if (TextUtils.isEmpty((CharSequence)c)) {
                                                                            break Label_1501;
                                                                        }
                                                                        if (this.A == -1L) {
                                                                            this.A = this.e0().y();
                                                                        }
                                                                        u = this.c0().u(c, K.i);
                                                                        n2 = Math.max(0, this.c0().u(c, K.j));
                                                                        o2 = this.e0().Q(c, u, n2);
                                                                        if (((List)o2).isEmpty()) {
                                                                            break Label_1501;
                                                                        }
                                                                        x2 = this.Q(c).x();
                                                                        subList = o2;
                                                                        Label_0682: {
                                                                            if (x2) {
                                                                                iterator2 = ((List<Y1>)o2).iterator();
                                                                                while (true) {
                                                                                    while (iterator2.hasNext()) {
                                                                                        o = ((Pair)iterator2.next()).first;
                                                                                        if (!((d2)o).o0().isEmpty()) {
                                                                                            o = ((d2)o).o0();
                                                                                            subList = o2;
                                                                                            if (o == null) {
                                                                                                break Label_0682;
                                                                                            }
                                                                                            u = 0;
                                                                                            while (true) {
                                                                                                subList = o2;
                                                                                                if (u >= ((List)o2).size()) {
                                                                                                    break Label_0682;
                                                                                                }
                                                                                                d2 = (d2)((List<Pair>)o2).get(u).first;
                                                                                                if (!d2.o0().isEmpty() && !d2.o0().equals(o)) {
                                                                                                    subList = ((List<Y1>)o2).subList(0, u);
                                                                                                    break Label_0682;
                                                                                                }
                                                                                                ++u;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    o = null;
                                                                                    continue Label_0812_Outer;
                                                                                }
                                                                            }
                                                                        }
                                                                        o = com.google.android.gms.internal.measurement.c2.J();
                                                                        size = ((List)subList).size();
                                                                        o3 = new ArrayList<Long>(((List)subList).size());
                                                                        if (this.c0().K(c) && this.Q(c).x()) {
                                                                            n2 = 1;
                                                                        }
                                                                        else {
                                                                            n2 = 0;
                                                                        }
                                                                        x = this.Q(c).x();
                                                                        y = this.Q(c).y();
                                                                        b = (s7.a() && this.c0().B(c, K.y0));
                                                                        n3 = 0;
                                                                        if (n3 < size) {
                                                                            u2 = ((d2)((List<Pair>)subList).get(n3).first).x();
                                                                            ((List<Long>)o3).add((Long)((List<Pair>)subList).get(n3).second);
                                                                            this.c0();
                                                                            ((d2.a)u2).F0(82001L).C0(n).b0(false);
                                                                            if (n2 == 0) {
                                                                                ((d2.a)u2).p0();
                                                                            }
                                                                            if (!x) {
                                                                                ((d2.a)u2).L0();
                                                                                ((d2.a)u2).B0();
                                                                            }
                                                                            if (!y) {
                                                                                ((d2.a)u2).c0();
                                                                            }
                                                                            this.E(c, (d2.a)u2);
                                                                            if (!b) {
                                                                                ((d2.a)u2).N0();
                                                                            }
                                                                            if (!i6.a() || !this.c0().s(K.Y0)) {
                                                                                break Label_1643;
                                                                            }
                                                                            o2 = ((d2.a)u2).X0();
                                                                            if (TextUtils.isEmpty((CharSequence)o2) || ((String)o2).equals("00000000-0000-0000-0000-000000000000")) {
                                                                                h = new ArrayList(((d2.a)u2).Y0());
                                                                                o2 = ((List)h).iterator();
                                                                                n4 = (u = 0);
                                                                                while (((Iterator)o2).hasNext()) {
                                                                                    y2 = ((Iterator<Y1>)o2).next();
                                                                                    if ("_fx".equals(y2.b0())) {
                                                                                        ((Iterator)o2).remove();
                                                                                        n4 = 1;
                                                                                        u = 1;
                                                                                    }
                                                                                    else {
                                                                                        if ("_f".equals(y2.b0())) {
                                                                                            u = 1;
                                                                                            break Label_1594;
                                                                                        }
                                                                                        break Label_1594;
                                                                                    }
                                                                                }
                                                                                o2 = subList;
                                                                                if (n4 != 0) {
                                                                                    ((d2.a)u2).t0();
                                                                                    ((d2.a)u2).N((Iterable)h);
                                                                                }
                                                                                if (u != 0) {
                                                                                    this.F(((d2.a)u2).S0(), true);
                                                                                }
                                                                            }
                                                                            if (((d2.a)u2).w() != 0) {
                                                                                if (this.c0().B(c, K.g0)) {
                                                                                    o2 = ((d2)((Y3.b)u2).p()).h();
                                                                                    ((d2.a)u2).B(this.m0().A((byte[])o2));
                                                                                }
                                                                                ((com.google.android.gms.internal.measurement.c2.a)o).x((d2.a)u2);
                                                                            }
                                                                            break Label_1640;
                                                                        }
                                                                        else {
                                                                            if (i6.a() && this.c0().s(K.Y0) && ((com.google.android.gms.internal.measurement.c2.a)o).w() == 0) {
                                                                                this.G((List)o3);
                                                                                this.I(false, 204, null, null, c);
                                                                                break Label_1266;
                                                                            }
                                                                            if (this.j().C(2)) {
                                                                                k = this.m0().K((com.google.android.gms.internal.measurement.c2)((Y3.b)o).p());
                                                                                break Label_1308;
                                                                            }
                                                                            break Label_1164_Outer;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            this.N();
                                                            continue Label_0059_Outer;
                                                        }
                                                        this.v = false;
                                                        continue Label_1594_Outer;
                                                    }
                                                    this.m0();
                                                    h = ((com.google.android.gms.internal.measurement.c2)((Y3.b)o).p()).h();
                                                    u2 = this.j.u(c);
                                                    try {
                                                        this.G((List)o3);
                                                        this.i.h.b(n);
                                                        o2 = "?";
                                                        if (size > 0) {
                                                            o2 = ((com.google.android.gms.internal.measurement.c2.a)o).y(0).D3();
                                                        }
                                                        this.j().K().d("Uploading data. app, uncompressed size, data", o2, ((byte[])h).length, k);
                                                        this.u = true;
                                                        g2 = this.g0();
                                                        o = new URL(((E5)u2).a());
                                                        o2 = ((E5)u2).b();
                                                        o3 = new F5(this, c);
                                                        g2.n();
                                                        g2.u();
                                                        A2.n.i(o);
                                                        A2.n.i(h);
                                                        A2.n.i(o3);
                                                        g2.e().z(new k2(g2, c, (URL)o, (byte[])h, (Map)o2, (e2)o3));
                                                        continue Label_1266;
                                                        this.j().G().c("Failed to parse upload URL. Not uploading. appId", R2.Y1.v(c), ((E5)u2).a());
                                                        continue Label_1501;
                                                        this.A = -1L;
                                                        e0 = this.e0();
                                                        this.c0();
                                                        o4 = e0.O(n - R2.g.G());
                                                        // iftrue(Label_1501:, TextUtils.isEmpty((CharSequence)o4))
                                                        d3 = this.e0().D0(o4);
                                                        // iftrue(Label_1501:, d3 == null)
                                                        Block_53: {
                                                            break Block_53;
                                                            this.v = x;
                                                            this.M();
                                                            throw subList;
                                                        }
                                                        this.V(d3);
                                                        continue Label_1501;
                                                    }
                                                    catch (MalformedURLException ex) {}
                                                    break;
                                                }
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                    finally {
                                        x = false;
                                        continue Label_1594;
                                    }
                                    break;
                                }
                                continue Label_1164_Outer;
                            }
                            break Label_1646;
                        }
                        continue Label_1308_Outer;
                    }
                    ++n3;
                    continue Label_1164_Outer;
                }
                k = null;
                continue Label_1308;
            }
        }
    }
    
    public final void u(final R5 r5, final W5 w5) {
        this.e().n();
        this.p0();
        if (!d0(w5)) {
            return;
        }
        if (!w5.v) {
            this.g(w5);
            return;
        }
        final int q0 = this.n0().q0(r5.p);
        final int n = 0;
        if (q0 != 0) {
            this.n0();
            final String p2 = r5.p;
            this.c0();
            final String i = S5.I(p2, 24, true);
            final String p3 = r5.p;
            int length;
            if (p3 != null) {
                length = p3.length();
            }
            else {
                length = 0;
            }
            this.n0();
            S5.N(this.G, w5.o, q0, "_ev", i, length);
            return;
        }
        final int w6 = this.n0().w(r5.p, r5.a());
        if (w6 != 0) {
            this.n0();
            final String p4 = r5.p;
            this.c0();
            final String j = S5.I(p4, 24, true);
            final Object a = r5.a();
            int length2 = n;
            Label_0209: {
                if (a != null) {
                    if (!(a instanceof String)) {
                        length2 = n;
                        if (!(a instanceof CharSequence)) {
                            break Label_0209;
                        }
                    }
                    length2 = String.valueOf(a).length();
                }
            }
            this.n0();
            S5.N(this.G, w5.o, w6, "_ev", j, length2);
            return;
        }
        final Object a2 = this.n0().A0(r5.p, r5.a());
        if (a2 == null) {
            return;
        }
        if ("_sid".equals(r5.p)) {
            final long q2 = r5.q;
            final String u = r5.u;
            final String s = (String)A2.n.i(w5.o);
            final T5 f0 = this.e0().F0(s, "_sno");
            long l = 0L;
            Label_0414: {
                if (f0 != null) {
                    final Object e = f0.e;
                    if (e instanceof Long) {
                        l = (long)e;
                        break Label_0414;
                    }
                }
                if (f0 != null) {
                    this.j().L().b("Retrieved last session number from database does not contain a valid (long) value", f0.e);
                }
                final E c0 = this.e0().C0(s, "_s");
                if (c0 != null) {
                    l = c0.c;
                    this.j().K().b("Backfill the session number. Last used session number", l);
                }
                else {
                    l = 0L;
                }
            }
            this.u(new R5("_sno", q2, l + 1L, u), w5);
        }
        final T5 t5 = new T5((String)A2.n.i(w5.o), (String)A2.n.i(r5.u), r5.p, r5.q, a2);
        this.j().K().c("Setting user property", this.l.D().g(t5.c), a2);
        this.e0().Q0();
        while (true) {
            try {
                if ("_id".equals(t5.c)) {
                    final T5 f2 = this.e0().F0(w5.o, "_id");
                    if (f2 != null && !t5.e.equals(f2.e)) {
                        this.e0().L0(w5.o, "_lair");
                    }
                }
                this.g(w5);
                final boolean d0 = this.e0().d0(t5);
                if ("_sid".equals(r5.p)) {
                    final long z = this.m0().z(w5.L);
                    final I2 d2 = this.e0().D0(w5.o);
                    if (d2 != null) {
                        d2.l0(z);
                        if (d2.s()) {
                            this.e0().U(d2);
                        }
                    }
                }
                this.e0().T0();
                if (!d0) {
                    this.j().G().c("Too many unique user properties are set. Ignoring user property", this.l.D().g(t5.c), t5.e);
                    this.n0();
                    S5.N(this.G, w5.o, 9, null, null, 0);
                }
                this.e0().R0();
                return;
                this.e0().R0();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final long u0() {
        final long a = this.b().a();
        final g5 i = this.i;
        i.u();
        i.n();
        long a2;
        if ((a2 = i.i.a()) == 0L) {
            a2 = i.k().U0().nextInt(86400000) + 1L;
            i.i.b(a2);
        }
        return (a + a2) / 1000L / 60L / 60L / 24L;
    }
    
    public final j2 v0() {
        final j2 d = this.d;
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }
    
    public final x5 w0() {
        return (x5)i(this.e);
    }
    
    public final void x(final d2.a a, final long l, final boolean b) {
        String s;
        if (b) {
            s = "_se";
        }
        else {
            s = "_lte";
        }
        final T5 f0 = this.e0().F0(a.S0(), s);
        T5 t5;
        if (f0 != null && f0.e != null) {
            t5 = new T5(a.S0(), "auto", s, this.b().a(), (long)f0.e + l);
        }
        else {
            t5 = new T5(a.S0(), "auto", s, this.b().a(), l);
        }
        final h2 h2 = (h2)((Y3.b)com.google.android.gms.internal.measurement.h2.X().z(s).B(this.b().a()).y((long)t5.e)).p();
        final int y = N5.y(a, s);
        if (y >= 0) {
            a.A(y, h2);
        }
        else {
            a.G(h2);
        }
        if (l > 0L) {
            this.e0().d0(t5);
            String s2;
            if (b) {
                s2 = "session-scoped";
            }
            else {
                s2 = "lifetime";
            }
            this.j().K().c("Updated engagement user property. scope, value", s2, t5.e);
        }
    }
    
    public final void y(final Runnable runnable) {
        this.e().n();
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(runnable);
    }
    
    public final void z(final String p0, final int p1, final Throwable p2, final byte[] p3, final Map p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   R2/D5.e:()LR2/G2;
        //     4: invokevirtual   R2/m3.n:()V
        //     7: aload_0        
        //     8: invokevirtual   R2/D5.p0:()V
        //    11: aload_1        
        //    12: invokestatic    A2/n.e:(Ljava/lang/String;)Ljava/lang/String;
        //    15: pop            
        //    16: aload           4
        //    18: astore          8
        //    20: aload           4
        //    22: ifnonnull       33
        //    25: iconst_0       
        //    26: newarray        B
        //    28: astore          8
        //    30: goto            33
        //    33: aload_0        
        //    34: invokevirtual   R2/D5.j:()LR2/Y1;
        //    37: invokevirtual   R2/Y1.K:()LR2/a2;
        //    40: ldc_w           "onConfigFetched. Response size"
        //    43: aload           8
        //    45: arraylength    
        //    46: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    49: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //    52: aload_0        
        //    53: invokevirtual   R2/D5.e0:()LR2/p;
        //    56: invokevirtual   R2/p.Q0:()V
        //    59: aload_0        
        //    60: invokevirtual   R2/D5.e0:()LR2/p;
        //    63: aload_1        
        //    64: invokevirtual   R2/p.D0:(Ljava/lang/String;)LR2/I2;
        //    67: astore          9
        //    69: iload_2        
        //    70: sipush          200
        //    73: if_icmpeq       535
        //    76: iload_2        
        //    77: sipush          204
        //    80: if_icmpeq       535
        //    83: iload_2        
        //    84: sipush          304
        //    87: if_icmpne       545
        //    90: goto            535
        //    93: aload           9
        //    95: ifnonnull       555
        //    98: aload_0        
        //    99: invokevirtual   R2/D5.j:()LR2/Y1;
        //   102: invokevirtual   R2/Y1.L:()LR2/a2;
        //   105: ldc_w           "App does not exist in onConfigFetched. appId"
        //   108: aload_1        
        //   109: invokestatic    R2/Y1.v:(Ljava/lang/String;)Ljava/lang/Object;
        //   112: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   115: goto            496
        //   118: aload           9
        //   120: aload_0        
        //   121: invokevirtual   R2/D5.b:()LE2/e;
        //   124: invokeinterface E2/e.a:()J
        //   129: invokevirtual   R2/I2.b0:(J)V
        //   132: aload_0        
        //   133: invokevirtual   R2/D5.e0:()LR2/p;
        //   136: aload           9
        //   138: invokevirtual   R2/p.U:(LR2/I2;)V
        //   141: aload_0        
        //   142: invokevirtual   R2/D5.j:()LR2/Y1;
        //   145: invokevirtual   R2/Y1.K:()LR2/a2;
        //   148: ldc_w           "Fetching config failed. code, error"
        //   151: iload_2        
        //   152: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   155: aload_3        
        //   156: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   159: aload_0        
        //   160: invokevirtual   R2/D5.h0:()LR2/x2;
        //   163: aload_1        
        //   164: invokevirtual   R2/x2.T:(Ljava/lang/String;)V
        //   167: aload_0        
        //   168: getfield        R2/D5.i:LR2/g5;
        //   171: getfield        R2/g5.h:LR2/q2;
        //   174: aload_0        
        //   175: invokevirtual   R2/D5.b:()LE2/e;
        //   178: invokeinterface E2/e.a:()J
        //   183: invokevirtual   R2/q2.b:(J)V
        //   186: iload_2        
        //   187: sipush          503
        //   190: if_icmpeq       200
        //   193: iload_2        
        //   194: sipush          429
        //   197: if_icmpne       219
        //   200: aload_0        
        //   201: getfield        R2/D5.i:LR2/g5;
        //   204: getfield        R2/g5.f:LR2/q2;
        //   207: aload_0        
        //   208: invokevirtual   R2/D5.b:()LE2/e;
        //   211: invokeinterface E2/e.a:()J
        //   216: invokevirtual   R2/q2.b:(J)V
        //   219: aload_0        
        //   220: invokespecial   R2/D5.N:()V
        //   223: goto            496
        //   226: aload           5
        //   228: ifnull          570
        //   231: aload           5
        //   233: ldc_w           "Last-Modified"
        //   236: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   241: checkcast       Ljava/util/List;
        //   244: astore_3       
        //   245: goto            248
        //   248: aload_3        
        //   249: ifnull          575
        //   252: aload_3        
        //   253: invokeinterface java/util/List.isEmpty:()Z
        //   258: ifne            575
        //   261: aload_3        
        //   262: iconst_0       
        //   263: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   268: checkcast       Ljava/lang/String;
        //   271: astore_3       
        //   272: goto            275
        //   275: aload           5
        //   277: ifnull          580
        //   280: aload           5
        //   282: ldc_w           "ETag"
        //   285: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   290: checkcast       Ljava/util/List;
        //   293: astore          4
        //   295: goto            298
        //   298: aload           4
        //   300: ifnull          586
        //   303: aload           4
        //   305: invokeinterface java/util/List.isEmpty:()Z
        //   310: ifne            586
        //   313: aload           4
        //   315: iconst_0       
        //   316: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   321: checkcast       Ljava/lang/String;
        //   324: astore          4
        //   326: goto            589
        //   329: aload_0        
        //   330: invokevirtual   R2/D5.h0:()LR2/x2;
        //   333: aload_1        
        //   334: aload           8
        //   336: aload_3        
        //   337: aload           4
        //   339: invokevirtual   R2/x2.H:(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z
        //   342: istore          7
        //   344: iload           7
        //   346: ifne            405
        //   349: aload_0        
        //   350: invokevirtual   R2/D5.e0:()LR2/p;
        //   353: astore_1       
        //   354: aload_1        
        //   355: invokevirtual   R2/p.R0:()V
        //   358: aload_0        
        //   359: iconst_0       
        //   360: putfield        R2/D5.t:Z
        //   363: aload_0        
        //   364: invokespecial   R2/D5.M:()V
        //   367: return         
        //   368: aload_0        
        //   369: invokevirtual   R2/D5.h0:()LR2/x2;
        //   372: aload_1        
        //   373: invokevirtual   R2/x2.L:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;
        //   376: ifnonnull       405
        //   379: aload_0        
        //   380: invokevirtual   R2/D5.h0:()LR2/x2;
        //   383: aload_1        
        //   384: aconst_null    
        //   385: aconst_null    
        //   386: aconst_null    
        //   387: invokevirtual   R2/x2.H:(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z
        //   390: istore          7
        //   392: iload           7
        //   394: ifne            405
        //   397: aload_0        
        //   398: invokevirtual   R2/D5.e0:()LR2/p;
        //   401: astore_1       
        //   402: goto            354
        //   405: aload           9
        //   407: aload_0        
        //   408: invokevirtual   R2/D5.b:()LE2/e;
        //   411: invokeinterface E2/e.a:()J
        //   416: invokevirtual   R2/I2.A:(J)V
        //   419: aload_0        
        //   420: invokevirtual   R2/D5.e0:()LR2/p;
        //   423: aload           9
        //   425: invokevirtual   R2/p.U:(LR2/I2;)V
        //   428: iload_2        
        //   429: sipush          404
        //   432: if_icmpne       452
        //   435: aload_0        
        //   436: invokevirtual   R2/D5.j:()LR2/Y1;
        //   439: invokevirtual   R2/Y1.M:()LR2/a2;
        //   442: ldc_w           "Config not found. Using empty config. appId"
        //   445: aload_1        
        //   446: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   449: goto            475
        //   452: aload_0        
        //   453: invokevirtual   R2/D5.j:()LR2/Y1;
        //   456: invokevirtual   R2/Y1.K:()LR2/a2;
        //   459: ldc_w           "Successfully fetched config. Got network response. code, size"
        //   462: iload_2        
        //   463: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   466: aload           8
        //   468: arraylength    
        //   469: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   472: invokevirtual   R2/a2.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   475: aload_0        
        //   476: invokevirtual   R2/D5.g0:()LR2/f2;
        //   479: invokevirtual   R2/f2.A:()Z
        //   482: ifeq            219
        //   485: aload_0        
        //   486: invokespecial   R2/D5.O:()Z
        //   489: ifeq            219
        //   492: aload_0        
        //   493: invokevirtual   R2/D5.t0:()V
        //   496: aload_0        
        //   497: invokevirtual   R2/D5.e0:()LR2/p;
        //   500: invokevirtual   R2/p.T0:()V
        //   503: aload_0        
        //   504: invokevirtual   R2/D5.e0:()LR2/p;
        //   507: astore_1       
        //   508: goto            354
        //   511: aload_0        
        //   512: invokevirtual   R2/D5.e0:()LR2/p;
        //   515: invokevirtual   R2/p.R0:()V
        //   518: aload_1        
        //   519: athrow         
        //   520: aload_0        
        //   521: iconst_0       
        //   522: putfield        R2/D5.t:Z
        //   525: aload_0        
        //   526: invokespecial   R2/D5.M:()V
        //   529: aload_1        
        //   530: athrow         
        //   531: astore_1       
        //   532: goto            520
        //   535: aload_3        
        //   536: ifnonnull       545
        //   539: iconst_1       
        //   540: istore          6
        //   542: goto            93
        //   545: iconst_0       
        //   546: istore          6
        //   548: goto            93
        //   551: astore_1       
        //   552: goto            511
        //   555: iload           6
        //   557: ifne            226
        //   560: iload_2        
        //   561: sipush          404
        //   564: if_icmpne       118
        //   567: goto            226
        //   570: aconst_null    
        //   571: astore_3       
        //   572: goto            248
        //   575: aconst_null    
        //   576: astore_3       
        //   577: goto            275
        //   580: aconst_null    
        //   581: astore          4
        //   583: goto            298
        //   586: aconst_null    
        //   587: astore          4
        //   589: iload_2        
        //   590: sipush          404
        //   593: if_icmpeq       368
        //   596: iload_2        
        //   597: sipush          304
        //   600: if_icmpne       329
        //   603: goto            368
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  25     30     531    535    Any
        //  33     59     531    535    Any
        //  59     69     551    520    Any
        //  98     115    551    520    Any
        //  118    186    551    520    Any
        //  200    219    551    520    Any
        //  219    223    551    520    Any
        //  231    245    551    520    Any
        //  252    272    551    520    Any
        //  280    295    551    520    Any
        //  303    326    551    520    Any
        //  329    344    551    520    Any
        //  349    354    531    535    Any
        //  354    358    531    535    Any
        //  368    392    551    520    Any
        //  397    402    531    535    Any
        //  405    428    551    520    Any
        //  435    449    551    520    Any
        //  452    475    551    520    Any
        //  475    496    551    520    Any
        //  496    503    551    520    Any
        //  503    508    531    535    Any
        //  511    520    531    535    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
    
    public final class a implements t
    {
        public d2 a;
        public List b;
        public List c;
        public long d;
        
        public static long c(final Y1 y1) {
            return y1.Y() / 1000L / 60L / 60L;
        }
        
        @Override
        public final void a(final d2 a) {
            A2.n.i(a);
            this.a = a;
        }
        
        @Override
        public final boolean b(final long l, final Y1 y1) {
            A2.n.i(y1);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (!this.c.isEmpty() && c(this.c.get(0)) != c(y1)) {
                return false;
            }
            final long d = this.d + y1.a();
            D5.this.c0();
            if (d >= Math.max(0, (int)K.k.a(null))) {
                return false;
            }
            this.d = d;
            this.c.add(y1);
            this.b.add(l);
            final int size = this.c.size();
            D5.this.c0();
            return size < Math.max(1, (int)K.l.a(null));
        }
    }
    
    public final class b
    {
        public final String a;
        public long b;
        
        public b(final D5 d5) {
            this(d5, d5.n0().S0());
        }
        
        public b(final D5 d5, final String a) {
            this.a = a;
            this.b = d5.b().b();
        }
    }
}
