/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.io.BufferedOutputStream
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import E2.h;
import P4.n;
import P4.o;
import P4.r;
import V2.b;
import V2.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import s3.m;
import s4.i;

public class e {
    public static final int[] q = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern r = Pattern.compile((String)"^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Set a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public final int f = 8;
    public final ScheduledExecutorService g;
    public final c h;
    public final s3.e i;
    public final i j;
    public Q4.e k;
    public final Context l;
    public final String m;
    public final Random n;
    public final E2.e o;
    public final d p;

    public e(s3.e e8, i i8, c c8, Q4.e e9, Context context, String string2, Set set, d d8, ScheduledExecutorService scheduledExecutorService) {
        this.a = set;
        this.b = false;
        this.g = scheduledExecutorService;
        this.n = new Random();
        this.c = Math.max((int)(8 - d8.h().b()), (int)1);
        this.o = h.d();
        this.i = e8;
        this.h = c8;
        this.j = i8;
        this.k = e9;
        this.l = context;
        this.m = string2;
        this.p = d8;
        this.d = false;
        this.e = false;
    }

    public static /* synthetic */ j a(e e8, j j8, j j9) {
        return e8.q(j8, j9);
    }

    public static /* synthetic */ j b(e e8, j j8, j j9, j j10) {
        return e8.r(j8, j9, j10);
    }

    public static String k(String string2) {
        if ((string2 = r.matcher((CharSequence)string2)).matches()) {
            return string2.group(1);
        }
        return null;
    }

    public void A(HttpURLConnection httpURLConnection, String arrby, String string2) {
        httpURLConnection.setRequestMethod("POST");
        this.x(httpURLConnection, string2);
        arrby = this.i((String)arrby).toString().getBytes("utf-8");
        httpURLConnection = new BufferedOutputStream(httpURLConnection.getOutputStream());
        httpURLConnection.write(arrby);
        httpURLConnection.flush();
        httpURLConnection.close();
    }

    public a B(HttpURLConnection object) {
        synchronized (this) {
            P4.c c8 = new P4.c(){

                @Override
                public void a(o o8) {
                    e.this.j();
                    e.this.u(o8);
                }

                @Override
                public void b(P4.b b8) {
                }
            };
            object = new a((HttpURLConnection)object, this.h, this.k, this.a, c8, this.g);
            return object;
        }
    }

    public void C() {
        this.s(0L);
    }

    public final void D(Date date) {
        int n8 = this.p.h().b() + 1;
        long l8 = this.m(n8);
        date = new Date(date.getTime() + l8);
        this.p.o(n8, date);
    }

    public void e() {
        if (!this.f()) {
            return;
        }
        Object object = this.p.h();
        if (new Date(this.o.a()).before(object.a())) {
            this.w();
            return;
        }
        object = this.h();
        V2.m.i(new j[]{object}).g((Executor)this.g, new Q4.n(this, (j)object));
    }

    public final boolean f() {
        synchronized (this) {
            Throwable throwable2;
            block3 : {
                boolean bl;
                try {
                    bl = !this.a.isEmpty() && !this.b && !this.d && !(bl = this.e);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) return;
        httpURLConnection.disconnect();
        try {
            httpURLConnection.getInputStream().close();
            if (httpURLConnection.getErrorStream() == null) return;
            httpURLConnection.getErrorStream().close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public j h() {
        j j8 = this.j.b(false);
        j j9 = this.j.a();
        return V2.m.i(j8, j9).h((Executor)this.g, new Q4.o(this, j8, j9));
    }

    public final JSONObject i(String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"project", (Object)e.k(this.i.r().c()));
        hashMap.put((Object)"namespace", (Object)this.m);
        hashMap.put((Object)"lastKnownVersionNumber", (Object)Long.toString((long)this.h.r()));
        hashMap.put((Object)"appId", (Object)this.i.r().c());
        hashMap.put((Object)"sdkVersion", (Object)"21.5.0");
        hashMap.put((Object)"appInstanceId", (Object)string2);
        return new JSONObject((Map)hashMap);
    }

    public final void j() {
        synchronized (this) {
            this.d = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String l() {
        try {
            Object object = this.l;
            object = E2.a.a((Context)object, object.getPackageName());
            if (object != null) return E2.j.b((byte[])object, false);
            object = new StringBuilder();
            object.append("Could not get fingerprint hash for package: ");
            object.append(this.l.getPackageName());
            Log.e((String)"FirebaseRemoteConfig", (String)object.toString());
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No such package: ");
        stringBuilder.append(this.l.getPackageName());
        Log.i((String)"FirebaseRemoteConfig", (String)stringBuilder.toString());
        return null;
    }

    public final long m(int n8) {
        int[] arrn = q;
        int n9 = arrn.length;
        if (n8 >= n9) {
            n8 = n9;
        }
        long l8 = TimeUnit.MINUTES.toMillis((long)arrn[n8 - 1]);
        return l8 / 2L + (long)this.n.nextInt((int)l8);
    }

    public final String n(String string2) {
        return String.format((String)"https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", (Object[])new Object[]{e.k(this.i.r().c()), string2});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final URL o() {
        try {
            return new URL(this.n(this.m));
        }
        catch (MalformedURLException malformedURLException) {}
        Log.e((String)"FirebaseRemoteConfig", (String)"URL is malformed");
        return null;
    }

    public final boolean p(int n8) {
        if (n8 != 408 && n8 != 429 && n8 != 502 && n8 != 503 && n8 != 504) {
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ j q(j object, j j8) {
        Object object2;
        int n8;
        void var1_5;
        Object j9;
        block24 : {
            block27 : {
                block28 : {
                    block26 : {
                        block25 : {
                            block22 : {
                                block23 : {
                                    if (!object.n()) break block22;
                                    this.y(true);
                                    j8 = (HttpURLConnection)object.j();
                                    n8 = j8.getResponseCode();
                                    object = n8;
                                    if (n8 != 200) break block23;
                                    j9 = object;
                                    object2 = j8;
                                    this.v();
                                    j9 = object;
                                    object2 = j8;
                                    this.p.j();
                                    j9 = object;
                                    object2 = j8;
                                    this.B((HttpURLConnection)j8).i();
                                }
                                this.g((HttpURLConnection)j8);
                                this.y(false);
                                boolean bl = this.p(n8);
                                if (bl) {
                                    this.D(new Date(this.o.a()));
                                }
                                if (bl || n8 == 200) break block26;
                                object = String.format((String)"Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", (Object[])new Object[]{object});
                                if (n8 == 403) {
                                    object = this.t(j8.getErrorStream());
                                }
                                object = new r(n8, (String)object, o.a.q);
                                break block27;
                                catch (Throwable throwable) {
                                    j9 = null;
                                    break block24;
                                }
                                catch (IOException iOException) {
                                    object = null;
                                    break block25;
                                }
                            }
                            try {
                                throw new IOException((Throwable)object.i());
                            }
                            catch (Throwable throwable) {}
                            catch (IOException iOException) {}
                            finally {
                                j9 = null;
                                j8 = j9;
                                break block24;
                            }
                            catch (Throwable throwable) {
                                j8 = object2;
                                break block24;
                            }
                            catch (IOException iOException) {}
                        }
                        j9 = object;
                        object2 = j8;
                        {
                            void var6_13;
                            Log.d((String)"FirebaseRemoteConfig", (String)"Exception connecting to real-time RC backend. Retrying the connection...", (Throwable)var6_13);
                        }
                        this.g((HttpURLConnection)j8);
                        this.y(false);
                        n8 = object != null && !this.p(object.intValue()) ? 0 : 1;
                        if (n8 != 0) {
                            this.D(new Date(this.o.a()));
                        }
                        if (n8 == 0 && object.intValue() != 200) break block28;
                    }
                    this.w();
                    return V2.m.e(null);
                }
                object2 = String.format((String)"Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", (Object[])new Object[]{object});
                if (object.intValue() == 403) {
                    object2 = this.t(j8.getErrorStream());
                }
                object = new r(object.intValue(), (String)object2, o.a.q);
            }
            this.u((o)((Object)object));
            return V2.m.e(null);
        }
        this.g((HttpURLConnection)j8);
        this.y(false);
        n8 = j9 != null && !this.p(j9.intValue()) ? 0 : 1;
        if (n8 != 0) {
            this.D(new Date(this.o.a()));
        }
        if (n8 == 0 && j9.intValue() != 200) {
            object2 = String.format((String)"Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", (Object[])new Object[]{j9});
            if (j9.intValue() == 403) {
                object2 = this.t(j8.getErrorStream());
            }
            this.u(new r(j9.intValue(), (String)object2, o.a.q));
            throw var1_5;
        }
        this.w();
        throw var1_5;
    }

    public final /* synthetic */ j r(j object, j j8, j j9) {
        if (!object.n()) {
            return V2.m.d(new n("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable)object.i()));
        }
        if (!j8.n()) {
            return V2.m.d(new n("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable)j8.i()));
        }
        try {
            j9 = (HttpURLConnection)this.o().openConnection();
            object = ((s4.n)object.j()).b();
            this.A((HttpURLConnection)j9, (String)j8.j(), (String)object);
        }
        catch (IOException iOException) {
            return V2.m.d(new n("Failed to open HTTP stream connection", (Throwable)iOException));
        }
        return V2.m.e(j9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block7 : {
                try {
                    boolean bl = this.f();
                    if (bl) break block7;
                }
                catch (Throwable throwable2) {}
                return;
            }
            int n8 = this.c;
            if (n8 > 0) {
                this.c = n8 - 1;
                this.g.schedule(new Runnable(){

                    public void run() {
                        e.this.e();
                    }
                }, l8, TimeUnit.MILLISECONDS);
            } else if (!this.e) {
                this.u(new n("Unable to connect to the server. Check your connection and try again.", o.a.q));
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String t(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String string2;
            inputStream = new BufferedReader((Reader)new InputStreamReader(inputStream));
            while ((string2 = inputStream.readLine()) != null) {
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        catch (IOException iOException) {}
        if (stringBuilder.length() != 0) return stringBuilder.toString();
        return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
    }

    public final void u(o o8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((P4.c)iterator.next()).a(o8);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void v() {
        synchronized (this) {
            this.c = 8;
            return;
        }
    }

    public void w() {
        synchronized (this) {
            Date date = new Date(this.o.a());
            this.s(Math.max((long)0L, (long)(this.p.h().a().getTime() - date.getTime())));
            return;
        }
    }

    public final void x(HttpURLConnection httpURLConnection, String string2) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", string2);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.i.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void y(boolean bl) {
        synchronized (this) {
            this.b = bl;
            return;
        }
    }

    public void z(boolean bl) {
        this.e = bl;
    }

}

