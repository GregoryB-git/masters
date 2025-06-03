/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.WorkSource
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicInteger
 */
package U2;

import E2.h;
import E2.n;
import E2.p;
import N2.i;
import U2.b;
import U2.c;
import U2.d;
import U2.e;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    public static final long r = TimeUnit.DAYS.toMillis(366L);
    public static volatile ScheduledExecutorService s = null;
    public static final Object t = new Object();
    public static volatile e u = new c();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public Future d;
    public long e;
    public final Set f;
    public boolean g;
    public int h;
    public N2.b i;
    public E2.e j;
    public WorkSource k;
    public final String l;
    public final String m;
    public final Context n;
    public final Map o;
    public AtomicInteger p;
    public final ScheduledExecutorService q;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public a(Context object, int n8, String string2) {
        Object object2;
        String string3 = object.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = h.d();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        A2.n.j(object, "WakeLock: context must not be null");
        A2.n.f(string2, "WakeLock: wakeLockName must not be empty");
        this.n = object.getApplicationContext();
        this.m = string2;
        this.i = null;
        if (!"com.google.android.gms".equals((Object)object.getPackageName())) {
            object2 = String.valueOf((Object)string2);
            object2 = object2.length() != 0 ? "*gcore*:".concat((String)object2) : new String("*gcore*:");
            this.l = object2;
        } else {
            this.l = string2;
        }
        object2 = (PowerManager)object.getSystemService("power");
        if (object2 == null) {
            object = new StringBuilder(29);
            object.append((CharSequence)"expected a non-null reference", 0, 29);
            throw new i(object.toString());
        }
        this.b = object2 = object2.newWakeLock(n8, string2);
        if (p.c((Context)object)) {
            string2 = string3;
            if (n.a(string3)) {
                string2 = object.getPackageName();
            }
            this.k = object = p.b((Context)object, string2);
            if (object != null) {
                a.i((PowerManager.WakeLock)object2, (WorkSource)object);
            }
        }
        string2 = s;
        object = string2;
        if (string2 == null) {
            object2 = t;
            // MONITORENTER : object2
            string2 = s;
            object = string2;
            if (string2 == null) {
                N2.h.a();
                s = object = Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService)Executors.newScheduledThreadPool((int)1));
            }
            // MONITOREXIT : object2
        }
        this.q = object;
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void e(a a8) {
        Object object = a8.a;
        synchronized (object) {
            try {
                if (!a8.b()) {
                    return;
                }
                Log.e((String)"WakeLock", (String)String.valueOf((Object)a8.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                a8.g();
                if (!a8.b()) {
                    return;
                }
                a8.c = 1;
                a8.h(0);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        void var0_3;
        try {
            wakeLock.setWorkSource(workSource);
            return;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        Log.wtf((String)"WakeLock", (String)var0_3.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(long l8) {
        long l9;
        this.p.incrementAndGet();
        long l10 = r;
        long l11 = Long.MAX_VALUE;
        l10 = l9 = Math.max((long)Math.min((long)Long.MAX_VALUE, (long)l10), (long)1L);
        if (l8 > 0L) {
            l10 = Math.min((long)l8, (long)l9);
        }
        Object object = this.a;
        synchronized (object) {
            d d8;
            try {
                d d9;
                if (!this.b()) {
                    this.i = N2.b.a(false, null);
                    this.b.acquire();
                    this.j.b();
                }
                ++this.c;
                ++this.h;
                this.f(null);
                d8 = d9 = (d)this.o.get((Object)null);
                if (d9 == null) {
                    d8 = new d(null);
                    this.o.put((Object)null, (Object)d8);
                }
                ++d8.a;
                l9 = this.j.b();
                l8 = l11;
            }
            catch (Throwable throwable) {}
            if (Long.MAX_VALUE - l9 > l10) {
                l8 = l9 + l10;
            }
            if (l8 > this.e) {
                this.e = l8;
                d8 = this.d;
                if (d8 != null) {
                    d8.cancel(false);
                }
                this.d = this.q.schedule((Runnable)new b(this), l10, TimeUnit.MILLISECONDS);
            }
            return;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b() {
        Object object = this.a;
        synchronized (object) {
            if (this.c <= 0) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        if (this.p.decrementAndGet() < 0) {
            Log.e((String)"WakeLock", (String)String.valueOf((Object)this.l).concat(" release without a matched acquire!"));
        }
        Object object = this.a;
        synchronized (object) {
            try {
                this.f(null);
                if (this.o.containsKey((Object)null)) {
                    d d8 = (d)this.o.get((Object)null);
                    if (d8 != null) {
                        int n8;
                        d8.a = n8 = d8.a - 1;
                        if (n8 == 0) {
                            this.o.remove((Object)null);
                        }
                    }
                } else {
                    Log.w((String)"WakeLock", (String)String.valueOf((Object)this.l).concat(" counter does not exist"));
                }
                this.h(0);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(boolean bl) {
        Object object = this.a;
        synchronized (object) {
            this.g = bl;
            return;
        }
    }

    public final String f(String string2) {
        if (this.g) {
            TextUtils.isEmpty((CharSequence)null);
        }
        return null;
    }

    public final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection)this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    /*
     * Exception decompiling
     */
    public final void h(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 9[CATCHBLOCK]
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
}

