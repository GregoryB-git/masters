// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import P4.s;
import P4.q;
import android.content.SharedPreferences;
import java.util.Date;

public class d
{
    public static final Date e;
    public static final Date f;
    public final SharedPreferences a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    static {
        e = new Date(-1L);
        f = new Date(-1L);
    }
    
    public d(final SharedPreferences a) {
        this.a = a;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }
    
    public a a() {
        synchronized (this.c) {
            return new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
    }
    
    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }
    
    public q c() {
        synchronized (this.b) {
            return com.google.firebase.remoteconfig.internal.f.d().c(this.a.getInt("last_fetch_status", 0)).d(this.a.getLong("last_fetch_time_in_millis", -1L)).b(new s.b().d(this.a.getLong("fetch_timeout_in_seconds", 60L)).e(this.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.c.j)).c()).a();
        }
    }
    
    public String d() {
        return this.a.getString("last_fetch_etag", (String)null);
    }
    
    public Date e() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }
    
    public long f() {
        return this.a.getLong("last_template_version", 0L);
    }
    
    public long g() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.c.j);
    }
    
    public b h() {
        synchronized (this.d) {
            return new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
    }
    
    public void i() {
        this.k(0, com.google.firebase.remoteconfig.internal.d.f);
    }
    
    public void j() {
        this.o(0, com.google.firebase.remoteconfig.internal.d.f);
    }
    
    public void k(final int n, final Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", n).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
    
    public void l(final s s) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", s.a()).putLong("minimum_fetch_interval_in_seconds", s.b()).commit();
        }
    }
    
    public void m(final String s) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", s).apply();
        }
    }
    
    public void n(final long n) {
        synchronized (this.b) {
            this.a.edit().putLong("last_template_version", n).apply();
        }
    }
    
    public void o(final int n, final Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", n).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
    
    public void p() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }
    
    public void q(final Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }
    
    public void r() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
    
    public static class a
    {
        public int a;
        public Date b;
        
        public a(final int a, final Date b) {
            this.a = a;
            this.b = b;
        }
        
        public Date a() {
            return this.b;
        }
        
        public int b() {
            return this.a;
        }
    }
    
    public static class b
    {
        public int a;
        public Date b;
        
        public b(final int a, final Date b) {
            this.a = a;
            this.b = b;
        }
        
        public Date a() {
            return this.b;
        }
        
        public int b() {
            return this.a;
        }
    }
}
