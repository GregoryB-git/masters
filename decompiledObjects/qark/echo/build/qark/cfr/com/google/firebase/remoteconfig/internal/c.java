/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.format.DateUtils
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.remoteconfig.internal;

import E2.e;
import P4.n;
import P4.o;
import P4.p;
import P4.r;
import Q4.f;
import Q4.g;
import Q4.h;
import V2.j;
import V2.m;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.d;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s4.i;

public class c {
    public static final long j = TimeUnit.HOURS.toSeconds(12L);
    public static final int[] k = new int[]{2, 4, 8, 16, 32, 64, 128, 256};
    public final i a;
    public final r4.b b;
    public final Executor c;
    public final e d;
    public final Random e;
    public final Q4.e f;
    public final ConfigFetchHttpClient g;
    public final d h;
    public final Map i;

    public c(i i8, r4.b b8, Executor executor, e e8, Random random, Q4.e e9, ConfigFetchHttpClient configFetchHttpClient, d d8, Map map) {
        this.a = i8;
        this.b = b8;
        this.c = executor;
        this.d = e8;
        this.e = random;
        this.f = e9;
        this.g = configFetchHttpClient;
        this.h = d8;
        this.i = map;
    }

    public static /* synthetic */ j a(c c8, j j8, j j9, Date date, Map map, j j10) {
        return c8.w(j8, j9, date, map, j10);
    }

    public static /* synthetic */ j b(a a8, com.google.firebase.remoteconfig.internal.b b8) {
        return c.v(a8, b8);
    }

    public static /* synthetic */ j c(c c8, Date date, j j8) {
        return c8.x(date, j8);
    }

    public static /* synthetic */ j d(c c8, Map map, j j8) {
        return c8.y(map, j8);
    }

    public static /* synthetic */ j e(c c8, long l8, Map map, j j8) {
        return c8.u(l8, map, j8);
    }

    public static /* synthetic */ j v(a a8, com.google.firebase.remoteconfig.internal.b b8) {
        return m.e(a8);
    }

    public final d.a A(int n8, Date date) {
        if (this.t(n8)) {
            this.B(date);
        }
        return this.h.a();
    }

    public final void B(Date date) {
        int n8 = this.h.a().b() + 1;
        long l8 = this.q(n8);
        date = new Date(date.getTime() + l8);
        this.h.k(n8, date);
    }

    public final void C(j j8, Date date) {
        if (j8.n()) {
            this.h.q(date);
            return;
        }
        if ((j8 = j8.i()) == null) {
            return;
        }
        if (j8 instanceof p) {
            this.h.r();
            return;
        }
        this.h.p();
    }

    public final boolean f(long l8, Date date) {
        Date date2 = this.h.e();
        if (date2.equals((Object)d.e)) {
            return false;
        }
        return date.before(new Date(date2.getTime() + TimeUnit.SECONDS.toMillis(l8)));
    }

    public final r g(r r8) {
        String string2;
        int n8;
        block7 : {
            block3 : {
                block4 : {
                    block5 : {
                        block6 : {
                            n8 = r8.a();
                            if (n8 == 401) break block3;
                            if (n8 == 403) break block4;
                            if (n8 == 429) break block5;
                            if (n8 == 500) break block6;
                            switch (n8) {
                                default: {
                                    string2 = "The server returned an unexpected error.";
                                    break block7;
                                }
                                case 502: 
                                case 503: 
                                case 504: 
                            }
                            string2 = "The server is unavailable. Please try again later.";
                            break block7;
                        }
                        string2 = "There was an internal server error.";
                        break block7;
                    }
                    throw new n("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                string2 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                break block7;
            }
            string2 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        n8 = r8.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fetch failed: ");
        stringBuilder.append(string2);
        return new r(n8, stringBuilder.toString(), (Throwable)r8);
    }

    public final String h(long l8) {
        return String.format((String)"Fetch is throttled. Please wait before calling fetch again: %s", (Object[])new Object[]{DateUtils.formatElapsedTime((long)TimeUnit.MILLISECONDS.toSeconds(l8))});
    }

    public j i() {
        return this.j(this.h.g());
    }

    public j j(long l8) {
        HashMap hashMap = new HashMap(this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b.p.c());
        stringBuilder.append("/");
        stringBuilder.append(1);
        hashMap.put((Object)"X-Firebase-RC-Fetch-Type", (Object)stringBuilder.toString());
        return this.f.e().h(this.c, new f(this, l8, (Map)hashMap));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a k(String object, String object2, Date date, Map map) {
        try {
            HttpURLConnection httpURLConnection = this.g.d();
            object = this.g.fetch(httpURLConnection, (String)object, (String)object2, this.s(), this.h.d(), map, this.p(), date);
            if (object.d() != null) {
                this.h.n(object.d().i());
            }
            if (object.e() != null) {
                this.h.m(object.e());
            }
            this.h.i();
            return object;
        }
        catch (r r8) {}
        object2 = this.A(r8.a(), date);
        if (this.z((d.a)object2, r8.a())) {
            throw new p(object2.a().getTime());
        }
        throw this.g(r8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final j l(String object, String string2, Date date, Map map) {
        try {
            object = this.k((String)object, string2, date, map);
            if (object.f() == 0) return this.f.k(object.d()).p(this.c, new Q4.j((a)object));
            return m.e(object);
        }
        catch (o o8) {
            return m.d(o8);
        }
    }

    public final j m(j j8, long l8, Map map) {
        Date date = new Date(this.d.a());
        if (j8.n() && this.f(l8, date)) {
            return m.e(a.c(date));
        }
        j8 = this.o(date);
        if (j8 != null) {
            j8 = m.d(new p(this.h(j8.getTime() - date.getTime()), j8.getTime()));
        } else {
            j8 = this.a.a();
            j j9 = this.a.b(false);
            j8 = m.i(j8, j9).h(this.c, new h(this, j8, j9, date, map));
        }
        return j8.h(this.c, new Q4.i(this, date));
    }

    public j n(b b8, int n8) {
        HashMap hashMap = new HashMap(this.i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b8.c());
        stringBuilder.append("/");
        stringBuilder.append(n8);
        hashMap.put((Object)"X-Firebase-RC-Fetch-Type", (Object)stringBuilder.toString());
        return this.f.e().h(this.c, new g(this, (Map)hashMap));
    }

    public final Date o(Date date) {
        Date date2 = this.h.a().a();
        if (date.before(date2)) {
            return date2;
        }
        return null;
    }

    public final Long p() {
        w3.a a8 = (w3.a)this.b.get();
        if (a8 == null) {
            return null;
        }
        return (Long)a8.a(true).get((Object)"_fot");
    }

    public final long q(int n8) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] arrn = k;
        long l8 = timeUnit.toMillis((long)arrn[Math.min((int)n8, (int)arrn.length) - 1]);
        return l8 / 2L + (long)this.e.nextInt((int)l8);
    }

    public long r() {
        return this.h.f();
    }

    public final Map s() {
        HashMap hashMap = new HashMap();
        w3.a a8 = (w3.a)this.b.get();
        if (a8 == null) {
            return hashMap;
        }
        for (Map.Entry entry : a8.a(false).entrySet()) {
            hashMap.put((Object)((String)entry.getKey()), (Object)entry.getValue().toString());
        }
        return hashMap;
    }

    public final boolean t(int n8) {
        if (n8 != 429 && n8 != 502 && n8 != 503 && n8 != 504) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ j u(long l8, Map map, j j8) {
        return this.m(j8, l8, map);
    }

    public final /* synthetic */ j w(j j8, j j9, Date date, Map map, j j10) {
        if (!j8.n()) {
            return m.d(new n("Firebase Installations failed to get installation ID for fetch.", (Throwable)j8.i()));
        }
        if (!j9.n()) {
            return m.d(new n("Firebase Installations failed to get installation auth token for fetch.", (Throwable)j9.i()));
        }
        return this.l((String)j8.j(), ((s4.n)j9.j()).b(), date, map);
    }

    public final /* synthetic */ j x(Date date, j j8) {
        this.C(j8, date);
        return j8;
    }

    public final /* synthetic */ j y(Map map, j j8) {
        return this.m(j8, 0L, map);
    }

    public final boolean z(d.a a8, int n8) {
        int n9 = a8.b();
        boolean bl = true;
        if (n9 <= 1) {
            if (n8 == 429) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public static class a {
        public final Date a;
        public final int b;
        public final com.google.firebase.remoteconfig.internal.b c;
        public final String d;

        public a(Date date, int n8, com.google.firebase.remoteconfig.internal.b b8, String string2) {
            this.a = date;
            this.b = n8;
            this.c = b8;
            this.d = string2;
        }

        public static a a(Date date, com.google.firebase.remoteconfig.internal.b b8) {
            return new a(date, 1, b8, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.b b8, String string2) {
            return new a(b8.g(), 0, b8, string2);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.b d() {
            return this.c;
        }

        public String e() {
            return this.d;
        }

        public int f() {
            return this.b;
        }
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* synthetic */ b[] r;
        public final String o;

        static {
            b b8;
            b b9;
            p = b8 = new b("BASE");
            q = b9 = new b("REALTIME");
            r = new b[]{b8, b9};
        }

        public b(String string3) {
            this.o = string3;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])r.clone();
        }

        public String c() {
            return this.o;
        }
    }

}

