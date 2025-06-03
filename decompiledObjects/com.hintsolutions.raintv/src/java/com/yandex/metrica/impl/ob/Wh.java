/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.net.TrafficStats
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.BindException
 *  java.net.ServerSocket
 *  java.net.Socket
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.coreutils.services.FirstExecutionConditionService;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Cm;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.Tl;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.bh;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.dh;
import com.yandex.metrica.impl.ob.jh;
import com.yandex.metrica.impl.ob.lh;
import com.yandex.metrica.impl.ob.mh;
import com.yandex.metrica.impl.ob.nh;
import com.yandex.metrica.impl.ob.oh;
import com.yandex.metrica.impl.ob.ph;
import com.yandex.metrica.impl.ob.qh;
import com.yandex.metrica.impl.ob.sh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.uh;
import com.yandex.metrica.impl.ob.vh;
import com.yandex.metrica.impl.ob.wh;
import com.yandex.metrica.impl.ob.ym;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class wh
implements Runnable,
th {
    private final ServiceConnection a = new ServiceConnection(this){

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final Handler b = new Handler(this, Looper.getMainLooper()){
        public final wh a;
        {
            this.a = wh2;
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                this.a.c();
                try {
                    wh.b(this.a).unbindService(wh.a(this.a));
                }
                catch (Throwable throwable) {
                    wh.c(this.a).reportEvent("socket_unbind_has_thrown_exception");
                }
            }
        }
    };
    @NonNull
    private final Runnable c = new Runnable(this){
        public final wh a;
        {
            this.a = wh2;
        }

        public void run() {
            wh wh2 = this.a;
            wh.a(wh2, wh.d(wh2));
        }
    };
    private final HashMap<String, oh> d = new HashMap<String, oh>(this){
        public final wh a;
        {
            this.a = wh2;
            this.put("p", new oh(this){
                public final d a;
                {
                    this.a = d3;
                }

                @NonNull
                public nh a(@NonNull Socket socket, @NonNull Uri uri, @NonNull uh uh2) {
                    wh wh2 = this.a.a;
                    return new dh(socket, uri, wh2, wh.d(wh2), wh.e(this.a.a).a(), uh2);
                }
            });
            this.put("i", new oh(this){
                public final d a;
                {
                    this.a = d3;
                }

                @NonNull
                public nh a(@NonNull Socket socket, @NonNull Uri uri, @NonNull uh uh2) {
                    wh wh2 = this.a.a;
                    return new qh(socket, uri, wh2, wh.d(wh2), uh2);
                }
            });
        }
    };
    private final Context e;
    private volatile boolean f;
    @Nullable
    private ServerSocket g;
    @Nullable
    private Qh h;
    @Nullable
    private ym i;
    @NonNull
    private final M0 j;
    @NonNull
    private final FirstExecutionConditionService.FirstExecutionHandler k;
    @NonNull
    private final mh l;
    @NonNull
    private final mh m;
    @NonNull
    private final sh n;
    @NonNull
    private final Cm o;
    @NonNull
    private final am<Qh, List<Integer>> p;
    @NonNull
    private final lh q;
    @NonNull
    private final vh r;
    private final String s;

    @VisibleForTesting
    public wh(@NonNull Context object, @NonNull ci ci2, @NonNull FirstExecutionConditionService firstExecutionConditionService, @NonNull Cm cm2, @NonNull M0 m0, @NonNull mh mh2, @NonNull mh mh3, @NonNull lh lh2, @NonNull vh vh2, @NonNull sh sh2, @NonNull am<Qh, List<Integer>> am2, @NonNull String string) {
        this.e = object;
        this.j = m0;
        this.l = mh2;
        this.m = mh3;
        this.n = sh2;
        this.p = am2;
        this.o = cm2;
        this.q = lh2;
        this.r = vh2;
        object = String.format((String)"[YandexUID%sServer]", (Object[])new Object[]{string});
        this.s = object;
        this.k = firstExecutionConditionService.createFirstExecutionHandler(new Runnable(this){
            public final wh a;
            {
                this.a = wh2;
            }

            public void run() {
                wh.f(this.a);
            }
        }, cm2.a(), (String)object);
        this.b(ci2.M());
        object = this.h;
        if (object != null) {
            this.c((Qh)object);
        }
    }

    public wh(@NonNull Context context, @NonNull ci ci2, @NonNull sh sh2, @NonNull am<Qh, List<Integer>> am2, @NonNull jh jh2, @NonNull jh jh3, @NonNull String string) {
        this(context, ci2, UtilityServiceLocator.getInstance().getFirstExecutionService(), F0.g().q(), bh.a(), new mh("open", jh2), new mh("port_already_in_use", jh3), new lh(context, ci2), new vh(), sh2, am2, string);
    }

    public static /* synthetic */ ServiceConnection a(wh wh2) {
        return wh2.a;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private f a(@NonNull Qh qh2) {
        wh wh2 = this;
        synchronized (wh2) {
            Iterator iterator = this.p.a(qh2).iterator();
            Object object = null;
            Object object2 = com.yandex.metrica.impl.ob.wh$f.c;
            while (true) {
                block17: {
                    block18: {
                        Object object3;
                        block14: {
                            String string;
                            Map<String, Object> map;
                            block16: {
                                block15: {
                                    boolean bl2;
                                    if (this.g != null || !(bl2 = iterator.hasNext())) break block18;
                                    map = (Map<String, Object>)iterator.next();
                                    object3 = object2;
                                    object = map;
                                    if (map == null) break block14;
                                    object3 = object2;
                                    object = object2;
                                    try {
                                        this.g = this.n.a(map.intValue());
                                        object3 = object2;
                                        object = object2;
                                        object3 = object2 = com.yandex.metrica.impl.ob.wh$f.a;
                                        object = object2;
                                        this.l.a(this, map.intValue(), qh2);
                                        object3 = object2;
                                        object = map;
                                        break block14;
                                    }
                                    catch (Throwable throwable) {
                                        object2 = object3;
                                        object = map;
                                        break block15;
                                    }
                                    catch (sh.a a2) {
                                        object2 = object;
                                        break block16;
                                    }
                                    catch (BindException bindException) {
                                        object = map;
                                        break block17;
                                    }
                                    catch (Throwable throwable) {
                                        // empty catch block
                                    }
                                }
                                map = this.a((Integer)object);
                                object3 = Log.getStackTraceString((Throwable)string);
                                ((HashMap)map).put((Object)"exception", object3);
                                this.j.reportEvent(this.b("open_error"), map);
                                object3 = object2;
                                break block14;
                                catch (sh.a a3) {
                                    map = object;
                                }
                            }
                            string = object3.getMessage();
                            Throwable throwable = object3.getCause();
                            object3 = object2;
                            object = map;
                            if (throwable != null) {
                                object3 = object2;
                                object = map;
                                if (string != null) {
                                    object = this.a((Integer)map);
                                    object3 = Log.getStackTraceString((Throwable)throwable);
                                    ((HashMap)object).put((Object)"exception", object3);
                                    this.j.reportEvent(this.b(string), (Map<String, Object>)object);
                                    object3 = object2;
                                    object = map;
                                }
                            }
                        }
                        object2 = object3;
                        continue;
                    }
                    return object2;
                    catch (BindException bindException) {}
                }
                object2 = com.yandex.metrica.impl.ob.wh$f.b;
                this.m.a(this, object.intValue(), qh2);
            }
        }
    }

    private Map<String, Object> a(int n2, @NonNull uh uh2) {
        Map<String, Object> map = this.a(n2);
        double d3 = this.r.b();
        HashMap hashMap = (HashMap)map;
        hashMap.put((Object)"idle_interval", (Object)d3);
        hashMap.put((Object)"background_interval", (Object)this.r.a());
        hashMap.put((Object)"request_read_time", (Object)uh2.d());
        hashMap.put((Object)"response_form_time", (Object)uh2.e());
        hashMap.put((Object)"response_send_time", (Object)uh2.f());
        return map;
    }

    private Map<String, Object> a(@Nullable Integer object) {
        HashMap hashMap = new HashMap();
        object = object == null ? "" : String.valueOf((Object)object);
        hashMap.put((Object)"port", object);
        return hashMap;
    }

    public static void a(wh wh2, Qh qh2) {
        wh wh3 = wh2;
        synchronized (wh3) {
            if (qh2 != null) {
                wh2.c(qh2);
            }
            return;
        }
    }

    public static /* synthetic */ Context b(wh wh2) {
        return wh2.e;
    }

    private String b(@NonNull String string) {
        return z2.o("socket_", string);
    }

    private void b(@Nullable Qh qh2) {
        this.h = qh2;
        if (qh2 != null) {
            this.k.setDelaySeconds(qh2.e);
        }
    }

    public static /* synthetic */ M0 c(wh wh2) {
        return wh2.j;
    }

    private void c(@NonNull Qh qh2) {
        wh wh2 = this;
        synchronized (wh2) {
            if (!this.f && this.k.tryExecute(qh2.f)) {
                this.f = true;
            }
            return;
        }
    }

    public static /* synthetic */ Qh d(wh wh2) {
        return wh2.h;
    }

    public static /* synthetic */ lh e(wh wh2) {
        return wh2.q;
    }

    public static void f(wh wh2) {
        wh2.getClass();
        Object object = new Intent(wh2.e, MetricaService.class);
        object.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!wh2.e.bindService(object, wh2.a, 1)) {
                wh2.j.reportEvent("socket_bind_has_failed");
            }
        }
        catch (Throwable throwable) {
            wh2.j.reportEvent("socket_bind_has_thrown_exception");
        }
        object = wh2.o.b(wh2);
        wh2.i = object;
        object.start();
        wh2.r.d();
    }

    public void a() {
        this.b.removeMessages(100);
        this.r.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull ci object) {
        wh wh2 = this;
        // MONITORENTER : wh2
        object = ((ci)object).M();
        wh2 = this;
        // MONITORENTER : wh2
        if (object != null) {
            this.c((Qh)object);
        }
        // MONITOREXIT : wh2
        // MONITOREXIT : wh2
    }

    public void a(@NonNull String string) {
        this.j.reportEvent(this.b(string));
    }

    public void a(@NonNull String string, @Nullable Integer n2) {
        this.j.reportEvent(this.b(string), this.a(n2));
    }

    public void a(@NonNull String string, String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"uri", (Object)string2);
        M0 m0 = this.j;
        string2 = new StringBuilder();
        string2.append("socket_");
        string2.append(string);
        m0.reportEvent(string2.toString(), (Map<String, Object>)hashMap);
    }

    public void a(@NonNull String string, Throwable throwable) {
        this.j.reportError(this.b(string), throwable);
    }

    public void a(@NonNull Map<String, Object> map, int n2, @NonNull uh map2) {
        map2 = this.a(n2, (uh)map2);
        ((HashMap)map2).put((Object)"params", map);
        this.j.reportEvent(this.b("reversed_sync_succeed"), map2);
    }

    public void b() {
        wh wh2 = this;
        synchronized (wh2) {
            if (this.f) {
                this.a();
                Handler handler = this.b;
                handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.h.a));
                this.r.c();
            }
            return;
        }
    }

    public void b(int n2, @NonNull uh uh2) {
        this.j.reportEvent(this.b("sync_succeed"), this.a(n2, uh2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@NonNull ci object) {
        wh wh2 = this;
        synchronized (wh2) {
            this.q.a((ci)object);
            object = ((ci)object).M();
            if (object != null) {
                this.h = object;
                this.k.setDelaySeconds(((Qh)object).e);
                this.c((Qh)object);
            } else {
                this.c();
                this.b((Qh)null);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @VisibleForTesting
    public void c() {
        wh wh2 = this;
        synchronized (wh2) {
            try {
                this.f = false;
                ym ym2 = this.i;
                if (ym2 != null) {
                    ym2.stopRunning();
                    this.i = null;
                }
                if ((ym2 = this.g) != null) {
                    ym2.close();
                    this.g = null;
                }
            }
            catch (IOException iOException) {}
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        wh wh2 = this;
        // MONITORENTER : wh2
        Object object = this.h;
        if (object != null && this.a((Qh)object) == com.yandex.metrica.impl.ob.wh$f.b) {
            this.f = false;
            long l6 = this.h.j;
            object = this.o.a();
            object.remove(this.c);
            object.executeDelayed(this.c, l6, TimeUnit.SECONDS);
            // MONITOREXIT : wh2
            return;
        }
        // MONITOREXIT : wh2
        if (A2.a(26)) {
            TrafficStats.setThreadStatsTag((int)40230);
        }
        if (this.g == null) return;
        while (this.f) {
            wh2 = this;
            // MONITORENTER : wh2
            boolean bl2 = this.f;
            object = null;
            ServerSocket serverSocket = bl2 ? this.g : null;
            // MONITOREXIT : wh2
            if (serverSocket == null) continue;
            try {
                serverSocket = serverSocket.accept();
                object = serverSocket;
                object = serverSocket;
                object = serverSocket;
                SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
                object = serverSocket;
                object = serverSocket;
                Object object2 = new Tl();
                object = serverSocket;
                uh uh2 = new uh(systemTimeProvider, (Tl)object2);
                object = serverSocket;
                if (A2.a(26)) {
                    object = serverSocket;
                    TrafficStats.tagSocket((Socket)serverSocket);
                }
                object = serverSocket;
                object = serverSocket;
                object2 = new ph((Socket)serverSocket, this, (Map<String, oh>)this.d, uh2);
                object = serverSocket;
                ((ph)object2).a();
            }
            finally {
                if (serverSocket == null) continue;
            }
            object = serverSocket;
            try {
                object.close();
            }
            catch (IOException iOException) {}
        }
    }
}

