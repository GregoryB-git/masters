package com.google.firebase.remoteconfig.internal;

import P4.n;
import P4.o;
import P4.p;
import P4.r;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.InterfaceC0658i;
import V2.m;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r4.InterfaceC1922b;
import s4.i;
import w3.InterfaceC2100a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    public static final long f11905j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f11906k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final i f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1922b f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11909c;

    /* renamed from: d, reason: collision with root package name */
    public final E2.e f11910d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f11911e;

    /* renamed from: f, reason: collision with root package name */
    public final Q4.e f11912f;

    /* renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f11913g;

    /* renamed from: h, reason: collision with root package name */
    public final d f11914h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f11915i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Date f11916a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11917b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.firebase.remoteconfig.internal.b f11918c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11919d;

        public a(Date date, int i7, com.google.firebase.remoteconfig.internal.b bVar, String str) {
            this.f11916a = date;
            this.f11917b = i7;
            this.f11918c = bVar;
            this.f11919d = str;
        }

        public static a a(Date date, com.google.firebase.remoteconfig.internal.b bVar) {
            return new a(date, 1, bVar, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.b bVar, String str) {
            return new a(bVar.g(), 0, bVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.b d() {
            return this.f11918c;
        }

        public String e() {
            return this.f11919d;
        }

        public int f() {
            return this.f11917b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* renamed from: o, reason: collision with root package name */
        public final String f11923o;

        b(String str) {
            this.f11923o = str;
        }

        public String c() {
            return this.f11923o;
        }
    }

    public c(i iVar, InterfaceC1922b interfaceC1922b, Executor executor, E2.e eVar, Random random, Q4.e eVar2, ConfigFetchHttpClient configFetchHttpClient, d dVar, Map map) {
        this.f11907a = iVar;
        this.f11908b = interfaceC1922b;
        this.f11909c = executor;
        this.f11910d = eVar;
        this.f11911e = random;
        this.f11912f = eVar2;
        this.f11913g = configFetchHttpClient;
        this.f11914h = dVar;
        this.f11915i = map;
    }

    public static /* synthetic */ AbstractC0659j v(a aVar, com.google.firebase.remoteconfig.internal.b bVar) {
        return m.e(aVar);
    }

    public final d.a A(int i7, Date date) {
        if (t(i7)) {
            B(date);
        }
        return this.f11914h.a();
    }

    public final void B(Date date) {
        int b7 = this.f11914h.a().b() + 1;
        this.f11914h.k(b7, new Date(date.getTime() + q(b7)));
    }

    public final void C(AbstractC0659j abstractC0659j, Date date) {
        if (abstractC0659j.n()) {
            this.f11914h.q(date);
            return;
        }
        Exception i7 = abstractC0659j.i();
        if (i7 == null) {
            return;
        }
        if (i7 instanceof p) {
            this.f11914h.r();
        } else {
            this.f11914h.p();
        }
    }

    public final boolean f(long j7, Date date) {
        Date e7 = this.f11914h.e();
        if (e7.equals(d.f11924e)) {
            return false;
        }
        return date.before(new Date(e7.getTime() + TimeUnit.SECONDS.toMillis(j7)));
    }

    public final r g(r rVar) {
        String str;
        int a7 = rVar.a();
        if (a7 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a7 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (a7 == 429) {
                throw new n("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (a7 != 500) {
                switch (a7) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new r(rVar.a(), "Fetch failed: " + str, rVar);
    }

    public final String h(long j7) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j7)));
    }

    public AbstractC0659j i() {
        return j(this.f11914h.g());
    }

    public AbstractC0659j j(final long j7) {
        final HashMap hashMap = new HashMap(this.f11915i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.c() + "/1");
        return this.f11912f.e().h(this.f11909c, new InterfaceC0651b() { // from class: Q4.f
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j u7;
                u7 = com.google.firebase.remoteconfig.internal.c.this.u(j7, hashMap, abstractC0659j);
                return u7;
            }
        });
    }

    public final a k(String str, String str2, Date date, Map map) {
        try {
            a fetch = this.f11913g.fetch(this.f11913g.d(), str, str2, s(), this.f11914h.d(), map, p(), date);
            if (fetch.d() != null) {
                this.f11914h.n(fetch.d().i());
            }
            if (fetch.e() != null) {
                this.f11914h.m(fetch.e());
            }
            this.f11914h.i();
            return fetch;
        } catch (r e7) {
            d.a A7 = A(e7.a(), date);
            if (z(A7, e7.a())) {
                throw new p(A7.a().getTime());
            }
            throw g(e7);
        }
    }

    public final AbstractC0659j l(String str, String str2, Date date, Map map) {
        try {
            final a k7 = k(str, str2, date, map);
            return k7.f() != 0 ? m.e(k7) : this.f11912f.k(k7.d()).p(this.f11909c, new InterfaceC0658i() { // from class: Q4.j
                @Override // V2.InterfaceC0658i
                public final AbstractC0659j a(Object obj) {
                    AbstractC0659j v7;
                    v7 = com.google.firebase.remoteconfig.internal.c.v(c.a.this, (com.google.firebase.remoteconfig.internal.b) obj);
                    return v7;
                }
            });
        } catch (o e7) {
            return m.d(e7);
        }
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractC0659j u(AbstractC0659j abstractC0659j, long j7, final Map map) {
        AbstractC0659j h7;
        final Date date = new Date(this.f11910d.a());
        if (abstractC0659j.n() && f(j7, date)) {
            return m.e(a.c(date));
        }
        Date o7 = o(date);
        if (o7 != null) {
            h7 = m.d(new p(h(o7.getTime() - date.getTime()), o7.getTime()));
        } else {
            final AbstractC0659j a7 = this.f11907a.a();
            final AbstractC0659j b7 = this.f11907a.b(false);
            h7 = m.i(a7, b7).h(this.f11909c, new InterfaceC0651b() { // from class: Q4.h
                @Override // V2.InterfaceC0651b
                public final Object a(AbstractC0659j abstractC0659j2) {
                    AbstractC0659j w7;
                    w7 = com.google.firebase.remoteconfig.internal.c.this.w(a7, b7, date, map, abstractC0659j2);
                    return w7;
                }
            });
        }
        return h7.h(this.f11909c, new InterfaceC0651b() { // from class: Q4.i
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j2) {
                AbstractC0659j x7;
                x7 = com.google.firebase.remoteconfig.internal.c.this.x(date, abstractC0659j2);
                return x7;
            }
        });
    }

    public AbstractC0659j n(b bVar, int i7) {
        final HashMap hashMap = new HashMap(this.f11915i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.c() + "/" + i7);
        return this.f11912f.e().h(this.f11909c, new InterfaceC0651b() { // from class: Q4.g
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j y7;
                y7 = com.google.firebase.remoteconfig.internal.c.this.y(hashMap, abstractC0659j);
                return y7;
            }
        });
    }

    public final Date o(Date date) {
        Date a7 = this.f11914h.a().a();
        if (date.before(a7)) {
            return a7;
        }
        return null;
    }

    public final Long p() {
        InterfaceC2100a interfaceC2100a = (InterfaceC2100a) this.f11908b.get();
        if (interfaceC2100a == null) {
            return null;
        }
        return (Long) interfaceC2100a.a(true).get("_fot");
    }

    public final long q(int i7) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f11906k;
        return (timeUnit.toMillis(iArr[Math.min(i7, iArr.length) - 1]) / 2) + this.f11911e.nextInt((int) r0);
    }

    public long r() {
        return this.f11914h.f();
    }

    public final Map s() {
        HashMap hashMap = new HashMap();
        InterfaceC2100a interfaceC2100a = (InterfaceC2100a) this.f11908b.get();
        if (interfaceC2100a == null) {
            return hashMap;
        }
        for (Map.Entry entry : interfaceC2100a.a(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    public final boolean t(int i7) {
        return i7 == 429 || i7 == 502 || i7 == 503 || i7 == 504;
    }

    public final /* synthetic */ AbstractC0659j w(AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2, Date date, Map map, AbstractC0659j abstractC0659j3) {
        return !abstractC0659j.n() ? m.d(new n("Firebase Installations failed to get installation ID for fetch.", abstractC0659j.i())) : !abstractC0659j2.n() ? m.d(new n("Firebase Installations failed to get installation auth token for fetch.", abstractC0659j2.i())) : l((String) abstractC0659j.j(), ((s4.n) abstractC0659j2.j()).b(), date, map);
    }

    public final /* synthetic */ AbstractC0659j x(Date date, AbstractC0659j abstractC0659j) {
        C(abstractC0659j, date);
        return abstractC0659j;
    }

    public final /* synthetic */ AbstractC0659j y(Map map, AbstractC0659j abstractC0659j) {
        return u(abstractC0659j, 0L, map);
    }

    public final boolean z(d.a aVar, int i7) {
        return aVar.b() > 1 || i7 == 429;
    }
}
