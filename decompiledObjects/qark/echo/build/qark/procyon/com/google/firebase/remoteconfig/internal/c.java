// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import java.util.Iterator;
import w3.a;
import Q4.g;
import Q4.h;
import P4.o;
import Q4.f;
import java.util.HashMap;
import android.text.format.DateUtils;
import P4.n;
import P4.r;
import P4.p;
import V2.m;
import java.util.Date;
import V2.j;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.Random;
import E2.e;
import java.util.concurrent.Executor;
import r4.b;
import s4.i;

public class c
{
    public static final long j;
    public static final int[] k;
    public final i a;
    public final r4.b b;
    public final Executor c;
    public final e d;
    public final Random e;
    public final Q4.e f;
    public final ConfigFetchHttpClient g;
    public final d h;
    public final Map i;
    
    static {
        j = TimeUnit.HOURS.toSeconds(12L);
        k = new int[] { 2, 4, 8, 16, 32, 64, 128, 256 };
    }
    
    public c(final i a, final r4.b b, final Executor c, final e d, final Random e, final Q4.e f, final ConfigFetchHttpClient g, final d h, final Map i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final d.a A(final int n, final Date date) {
        if (this.t(n)) {
            this.B(date);
        }
        return this.h.a();
    }
    
    public final void B(Date date) {
        final int n = this.h.a().b() + 1;
        date = new Date(date.getTime() + this.q(n));
        this.h.k(n, date);
    }
    
    public final void C(final j j, final Date date) {
        if (j.n()) {
            this.h.q(date);
            return;
        }
        final Exception i = j.i();
        if (i == null) {
            return;
        }
        if (i instanceof p) {
            this.h.r();
            return;
        }
        this.h.p();
    }
    
    public final boolean f(final long duration, final Date date) {
        final Date e = this.h.e();
        return !e.equals(com.google.firebase.remoteconfig.internal.d.e) && date.before(new Date(e.getTime() + TimeUnit.SECONDS.toMillis(duration)));
    }
    
    public final r g(final r r) {
        final int a = r.a();
        String str;
        if (a != 401) {
            if (a != 403) {
                if (a == 429) {
                    throw new n("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (a != 500) {
                    switch (a) {
                        default: {
                            str = "The server returned an unexpected error.";
                            break;
                        }
                        case 502:
                        case 503:
                        case 504: {
                            str = "The server is unavailable. Please try again later.";
                            break;
                        }
                    }
                }
                else {
                    str = "There was an internal server error.";
                }
            }
            else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        }
        else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        final int a2 = r.a();
        final StringBuilder sb = new StringBuilder();
        sb.append("Fetch failed: ");
        sb.append(str);
        return new r(a2, sb.toString(), r);
    }
    
    public final String h(final long duration) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(duration)));
    }
    
    public j i() {
        return this.j(this.h.g());
    }
    
    public j j(final long n) {
        final HashMap<String, String> hashMap = new HashMap<String, String>(this.i);
        final StringBuilder sb = new StringBuilder();
        sb.append(com.google.firebase.remoteconfig.internal.c.b.p.c());
        sb.append("/");
        sb.append(1);
        hashMap.put("X-Firebase-RC-Fetch-Type", sb.toString());
        return this.f.e().h(this.c, new f(this, n, hashMap));
    }
    
    public final a k(final String s, final String s2, final Date date, final Map map) {
        while (true) {
            try {
                final a fetch = this.g.fetch(this.g.d(), s, s2, this.s(), this.h.d(), map, this.p(), date);
                if (fetch.d() != null) {
                    this.h.n(fetch.d().i());
                }
                if (fetch.e() != null) {
                    this.h.m(fetch.e());
                }
                this.h.i();
                return fetch;
                final r r;
                Label_0127: {
                    throw this.g(r);
                }
                final d.a a = this.A(r.a(), date);
                // iftrue(Label_0127:, !this.z(a, r.a()))
                throw new p(a.a().getTime());
            }
            catch (r r) {
                continue;
            }
            break;
        }
    }
    
    public final j l(final String s, final String s2, final Date date, final Map map) {
        try {
            final a k = this.k(s, s2, date, map);
            if (k.f() != 0) {
                return m.e(k);
            }
            return this.f.k(k.d()).p(this.c, new Q4.j(k));
        }
        catch (o o) {
            return m.d(o);
        }
    }
    
    public final j m(j j, final long n, final Map map) {
        final Date date = new Date(this.d.a());
        if (j.n() && this.f(n, date)) {
            return m.e(com.google.firebase.remoteconfig.internal.c.a.c(date));
        }
        final Date o = this.o(date);
        if (o != null) {
            j = m.d(new p(this.h(o.getTime() - date.getTime()), o.getTime()));
        }
        else {
            j = this.a.a();
            final j b = this.a.b(false);
            j = m.i(j, b).h(this.c, new h(this, j, b, date, map));
        }
        return j.h(this.c, new Q4.i(this, date));
    }
    
    public j n(final b b, final int i) {
        final HashMap<String, String> hashMap = new HashMap<String, String>(this.i);
        final StringBuilder sb = new StringBuilder();
        sb.append(b.c());
        sb.append("/");
        sb.append(i);
        hashMap.put("X-Firebase-RC-Fetch-Type", sb.toString());
        return this.f.e().h(this.c, new g(this, hashMap));
    }
    
    public final Date o(final Date date) {
        final Date a = this.h.a().a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }
    
    public final Long p() {
        final w3.a a = (w3.a)this.b.get();
        if (a == null) {
            return null;
        }
        return (Long)a.a(true).get("_fot");
    }
    
    public final long q(final int a) {
        final TimeUnit minutes = TimeUnit.MINUTES;
        final int[] k = com.google.firebase.remoteconfig.internal.c.k;
        final long millis = minutes.toMillis(k[Math.min(a, k.length) - 1]);
        return millis / 2L + this.e.nextInt((int)millis);
    }
    
    public long r() {
        return this.h.f();
    }
    
    public final Map s() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final w3.a a = (w3.a)this.b.get();
        if (a == null) {
            return hashMap;
        }
        for (final Map.Entry<String, V> entry : a.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
    
    public final boolean t(final int n) {
        return n == 429 || n == 502 || n == 503 || n == 504;
    }
    
    public final boolean z(final d.a a, final int n) {
        final int b = a.b();
        boolean b2 = true;
        if (b <= 1) {
            if (n == 429) {
                return true;
            }
            b2 = false;
        }
        return b2;
    }
    
    public static class a
    {
        public final Date a;
        public final int b;
        public final com.google.firebase.remoteconfig.internal.b c;
        public final String d;
        
        public a(final Date a, final int b, final com.google.firebase.remoteconfig.internal.b c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static a a(final Date date, final com.google.firebase.remoteconfig.internal.b b) {
            return new a(date, 1, b, null);
        }
        
        public static a b(final com.google.firebase.remoteconfig.internal.b b, final String s) {
            return new a(b.g(), 0, b, s);
        }
        
        public static a c(final Date date) {
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
    
    public enum b
    {
        p("BASE", 0, "BASE"), 
        q("REALTIME", 1, "REALTIME");
        
        public final String o;
        
        public b(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public String c() {
            return this.o;
        }
    }
}
