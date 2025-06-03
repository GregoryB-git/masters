/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.util.Iterator
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import P4.n;
import P4.o;
import P4.r;
import Q4.e;
import V2.j;
import V2.m;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public final Set a;
    public final HttpURLConnection b;
    public final c c;
    public final e d;
    public final P4.c e;
    public final ScheduledExecutorService f;
    public final Random g;

    public a(HttpURLConnection httpURLConnection, c c8, e e8, Set set, P4.c c9, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = c8;
        this.d = e8;
        this.a = set;
        this.e = c9;
        this.f = scheduledExecutorService;
        this.g = new Random();
    }

    public static /* synthetic */ j a(a a8, j j8, j j9, long l8, int n8, j j10) {
        return a8.h(j8, j9, l8, n8, j10);
    }

    public static Boolean e(c.a a8, long l8) {
        b b8 = a8.d();
        boolean bl = false;
        boolean bl2 = false;
        if (b8 != null) {
            if (a8.d().i() >= l8) {
                bl2 = true;
            }
            return bl2;
        }
        bl2 = bl;
        if (a8.f() == 1) {
            bl2 = true;
        }
        return bl2;
    }

    public final void b(final int n8, final long l8) {
        if (n8 == 0) {
            this.k(new r("Unable to fetch the latest version of the template.", o.a.s));
            return;
        }
        int n9 = this.g.nextInt(4);
        this.f.schedule(new Runnable(){

            public void run() {
                a.this.d(n8, l8);
            }
        }, (long)n9, TimeUnit.SECONDS);
    }

    public final void c(P4.b b8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((P4.c)iterator.next()).b(b8);
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

    public j d(int n8, long l8) {
        synchronized (this) {
            --n8;
            j j8 = this.c.n(c.b.q, 3 - n8);
            j j9 = this.d.e();
            j8 = m.i(j8, j9).h((Executor)this.f, new Q4.a(this, j8, j9, l8, n8));
            return j8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream, "utf-8"));
        block2 : do {
            Object object = "";
            String string2;
            while ((string2 = bufferedReader.readLine()) != null) {
                Object object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(string2);
                object = object2 = object2.toString();
                if (!string2.contains((CharSequence)"}") || (object = this.j((String)object2)).isEmpty()) continue;
                try {
                    object = new JSONObject((String)object);
                    if (object.has("featureDisabled") && object.getBoolean("featureDisabled")) {
                        this.e.a(new r("The server is temporarily unavailable. Try again in a few minutes.", o.a.t));
                        break block2;
                    }
                    if (this.g()) break block2;
                    if (!object.has("latestTemplateVersionNumber")) continue block2;
                    long l8 = this.c.r();
                    long l9 = object.getLong("latestTemplateVersionNumber");
                    if (l9 <= l8) continue block2;
                    this.b(3, l9);
                    continue block2;
                }
                catch (JSONException jSONException) {}
                this.k(new n("Unable to parse config update message.", jSONException.getCause(), o.a.r));
                Log.e((String)"FirebaseRemoteConfig", (String)"Unable to parse latest config update message.", (Throwable)jSONException);
                continue block2;
            }
            break;
        } while (true);
        bufferedReader.close();
        inputStream.close();
    }

    public final boolean g() {
        synchronized (this) {
            boolean bl = this.a.isEmpty();
            return bl;
        }
    }

    public final /* synthetic */ j h(j object, j object2, long l8, int n8, j object3) {
        if (!object.n()) {
            return m.d(new n("Failed to auto-fetch config update.", (Throwable)object.i()));
        }
        if (!object2.n()) {
            return m.d(new n("Failed to get activated config for auto-fetch", (Throwable)object2.i()));
        }
        object3 = (c.a)object.j();
        object2 = (b)object2.j();
        if (!a.e((c.a)object3, l8).booleanValue()) {
            Log.d((String)"FirebaseRemoteConfig", (String)"Fetched template version is the same as SDK's current version. Retrying fetch.");
            this.b(n8, l8);
            return m.e(null);
        }
        if (object3.d() == null) {
            Log.d((String)"FirebaseRemoteConfig", (String)"The fetch succeeded, but the backend had no updates.");
            return m.e(null);
        }
        object = object2;
        if (object2 == null) {
            object = b.j().a();
        }
        if ((object = object.e(object3.d())).isEmpty()) {
            Log.d((String)"FirebaseRemoteConfig", (String)"Config was fetched, but no params changed.");
            return m.e(null);
        }
        this.c(P4.b.a((Set)object));
        return m.e(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void i() {
        var1_1 = this.b;
        if (var1_1 == null) {
            return;
        }
        var1_1 = var1_1.getInputStream();
        this.f((InputStream)var1_1);
        var1_1.close();
lbl8: // 2 sources:
        do {
            this.b.disconnect();
            return;
            break;
        } while (true);
        {
            catch (Throwable var1_2) {
            }
            catch (IOException var1_3) {}
            {
                Log.d((String)"FirebaseRemoteConfig", (String)"Stream was cancelled due to an exception. Retrying the connection...", (Throwable)var1_3);
                ** continue;
            }
        }
        this.b.disconnect();
        throw var1_2;
    }

    public final String j(String string2) {
        int n8 = string2.indexOf(123);
        int n9 = string2.lastIndexOf(125);
        String string3 = "";
        if (n8 >= 0) {
            if (n9 < 0) {
                return "";
            }
            if (n8 >= n9) {
                return "";
            }
            string3 = string2.substring(n8, n9 + 1);
        }
        return string3;
    }

    public final void k(o o8) {
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

}

