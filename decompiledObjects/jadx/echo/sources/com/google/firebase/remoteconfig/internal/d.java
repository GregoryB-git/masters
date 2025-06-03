package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;
import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f11924e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f11925f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11926a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11927b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f11928c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f11929d = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11930a;

        /* renamed from: b, reason: collision with root package name */
        public Date f11931b;

        public a(int i7, Date date) {
            this.f11930a = i7;
            this.f11931b = date;
        }

        public Date a() {
            return this.f11931b;
        }

        public int b() {
            return this.f11930a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f11932a;

        /* renamed from: b, reason: collision with root package name */
        public Date f11933b;

        public b(int i7, Date date) {
            this.f11932a = i7;
            this.f11933b = date;
        }

        public Date a() {
            return this.f11933b;
        }

        public int b() {
            return this.f11932a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.f11926a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f11928c) {
            aVar = new a(this.f11926a.getInt("num_failed_fetches", 0), new Date(this.f11926a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f11926a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public q c() {
        f a7;
        synchronized (this.f11927b) {
            long j7 = this.f11926a.getLong("last_fetch_time_in_millis", -1L);
            int i7 = this.f11926a.getInt("last_fetch_status", 0);
            a7 = f.d().c(i7).d(j7).b(new s.b().d(this.f11926a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f11926a.getLong("minimum_fetch_interval_in_seconds", c.f11905j)).c()).a();
        }
        return a7;
    }

    public String d() {
        return this.f11926a.getString("last_fetch_etag", null);
    }

    public Date e() {
        return new Date(this.f11926a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long f() {
        return this.f11926a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.f11926a.getLong("minimum_fetch_interval_in_seconds", c.f11905j);
    }

    public b h() {
        b bVar;
        synchronized (this.f11929d) {
            bVar = new b(this.f11926a.getInt("num_failed_realtime_streams", 0), new Date(this.f11926a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    public void i() {
        k(0, f11925f);
    }

    public void j() {
        o(0, f11925f);
    }

    public void k(int i7, Date date) {
        synchronized (this.f11928c) {
            this.f11926a.edit().putInt("num_failed_fetches", i7).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void l(s sVar) {
        synchronized (this.f11927b) {
            this.f11926a.edit().putLong("fetch_timeout_in_seconds", sVar.a()).putLong("minimum_fetch_interval_in_seconds", sVar.b()).commit();
        }
    }

    public void m(String str) {
        synchronized (this.f11927b) {
            this.f11926a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void n(long j7) {
        synchronized (this.f11927b) {
            this.f11926a.edit().putLong("last_template_version", j7).apply();
        }
    }

    public void o(int i7, Date date) {
        synchronized (this.f11929d) {
            this.f11926a.edit().putInt("num_failed_realtime_streams", i7).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void p() {
        synchronized (this.f11927b) {
            this.f11926a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void q(Date date) {
        synchronized (this.f11927b) {
            this.f11926a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void r() {
        synchronized (this.f11927b) {
            this.f11926a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
