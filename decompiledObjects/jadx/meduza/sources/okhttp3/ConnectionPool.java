package okhttp3;

import defpackage.f;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

/* loaded from: classes.dex */
public final class ConnectionPool {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f12200g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.v("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    public final int f12201a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12202b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f12203c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f12204d;

    /* renamed from: e, reason: collision with root package name */
    public final RouteDatabase f12205e;
    public boolean f;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f12203c = new Runnable() { // from class: okhttp3.ConnectionPool.1
            @Override // java.lang.Runnable
            public final void run() {
                long j10;
                while (true) {
                    ConnectionPool connectionPool = ConnectionPool.this;
                    long nanoTime = System.nanoTime();
                    synchronized (connectionPool) {
                        Iterator it = connectionPool.f12204d.iterator();
                        RealConnection realConnection = null;
                        long j11 = Long.MIN_VALUE;
                        int i10 = 0;
                        int i11 = 0;
                        while (it.hasNext()) {
                            RealConnection realConnection2 = (RealConnection) it.next();
                            if (connectionPool.a(realConnection2, nanoTime) > 0) {
                                i11++;
                            } else {
                                i10++;
                                long j12 = nanoTime - realConnection2.f12424o;
                                if (j12 > j11) {
                                    realConnection = realConnection2;
                                    j11 = j12;
                                }
                            }
                        }
                        j10 = connectionPool.f12202b;
                        if (j11 < j10 && i10 <= connectionPool.f12201a) {
                            if (i10 > 0) {
                                j10 -= j11;
                            } else if (i11 <= 0) {
                                connectionPool.f = false;
                                j10 = -1;
                            }
                        }
                        connectionPool.f12204d.remove(realConnection);
                        Util.f(realConnection.f12415e);
                        j10 = 0;
                    }
                    if (j10 == -1) {
                        return;
                    }
                    if (j10 > 0) {
                        long j13 = j10 / 1000000;
                        long j14 = j10 - (1000000 * j13);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j13, (int) j14);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.f12204d = new ArrayDeque();
        this.f12205e = new RouteDatabase();
        this.f12201a = 5;
        this.f12202b = timeUnit.toNanos(5L);
    }

    public final int a(RealConnection realConnection, long j10) {
        ArrayList arrayList = realConnection.f12423n;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder l10 = f.l("A connection to ");
                l10.append(realConnection.f12413c.f12361a.f12148a);
                l10.append(" was leaked. Did you forget to close a response body?");
                Platform.f12669a.m(((StreamAllocation.StreamAllocationReference) reference).f12450a, l10.toString());
                arrayList.remove(i10);
                realConnection.f12420k = true;
                if (arrayList.isEmpty()) {
                    realConnection.f12424o = j10 - this.f12202b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
