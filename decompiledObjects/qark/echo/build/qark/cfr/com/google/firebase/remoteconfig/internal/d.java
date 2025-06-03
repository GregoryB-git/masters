/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.f;
import java.util.Date;

public class d {
    public static final Date e = new Date(-1L);
    public static final Date f = new Date(-1L);
    public final SharedPreferences a;
    public final Object b;
    public final Object c;
    public final Object d;

    public d(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a a() {
        Object object = this.c;
        synchronized (object) {
            return new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public q c() {
        Object object = this.b;
        synchronized (object) {
            long l8 = this.a.getLong("last_fetch_time_in_millis", -1L);
            int n8 = this.a.getInt("last_fetch_status", 0);
            s s8 = new s.b().d(this.a.getLong("fetch_timeout_in_seconds", 60L)).e(this.a.getLong("minimum_fetch_interval_in_seconds", c.j)).c();
            return f.d().c(n8).d(l8).b(s8).a();
        }
    }

    public String d() {
        return this.a.getString("last_fetch_etag", null);
    }

    public Date e() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long f() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", c.j);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b h() {
        Object object = this.d;
        synchronized (object) {
            return new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
    }

    public void i() {
        this.k(0, f);
    }

    public void j() {
        this.o(0, f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k(int n8, Date date) {
        Object object = this.c;
        synchronized (object) {
            this.a.edit().putInt("num_failed_fetches", n8).putLong("backoff_end_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(s s8) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putLong("fetch_timeout_in_seconds", s8.a()).putLong("minimum_fetch_interval_in_seconds", s8.b()).commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(String string2) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putString("last_fetch_etag", string2).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n(long l8) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putLong("last_template_version", l8).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void o(int n8, Date date) {
        Object object = this.d;
        synchronized (object) {
            this.a.edit().putInt("num_failed_realtime_streams", n8).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p() {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q(Date date) {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void r() {
        Object object = this.b;
        synchronized (object) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
            return;
        }
    }

    public static class a {
        public int a;
        public Date b;

        public a(int n8, Date date) {
            this.a = n8;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class b {
        public int a;
        public Date b;

        public b(int n8, Date date) {
            this.a = n8;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

}

