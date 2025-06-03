// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.net.Uri;
import java.util.Iterator;
import android.text.TextUtils;
import android.os.Parcel;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import B2.a;

public final class T extends a
{
    public static final Parcelable$Creator<T> CREATOR;
    public Bundle o;
    public Map p;
    public c q;
    
    static {
        CREATOR = (Parcelable$Creator)new U();
    }
    
    public T(final Bundle o) {
        this.o = o;
    }
    
    public int S() {
        String s;
        if ((s = ((BaseBundle)this.o).getString("google.original_priority")) == null) {
            s = ((BaseBundle)this.o).getString("google.priority");
        }
        return this.i(s);
    }
    
    public long T() {
        final Object value = ((BaseBundle)this.o).get("google.sent_time");
        if (value instanceof Long) {
            return (long)value;
        }
        if (!(value instanceof String)) {
            return 0L;
        }
        while (true) {
            while (true) {
                try {
                    return Long.parseLong((String)value);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid sent time: ");
                    sb.append(value);
                    Log.w("FirebaseMessaging", sb.toString());
                    return 0L;
                }
                catch (NumberFormatException ex) {}
                continue;
            }
        }
    }
    
    public String U() {
        return ((BaseBundle)this.o).getString("google.to");
    }
    
    public int V() {
        final Object value = ((BaseBundle)this.o).get("google.ttl");
        if (value instanceof Integer) {
            return (int)value;
        }
        if (!(value instanceof String)) {
            return 0;
        }
        while (true) {
            while (true) {
                try {
                    return Integer.parseInt((String)value);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid TTL: ");
                    sb.append(value);
                    Log.w("FirebaseMessaging", sb.toString());
                    return 0;
                }
                catch (NumberFormatException ex) {}
                continue;
            }
        }
    }
    
    public void W(final Intent intent) {
        intent.putExtras(this.o);
    }
    
    public String a() {
        return ((BaseBundle)this.o).getString("collapse_key");
    }
    
    public Map d() {
        if (this.p == null) {
            this.p = e.a.a(this.o);
        }
        return this.p;
    }
    
    public String f() {
        return ((BaseBundle)this.o).getString("from");
    }
    
    public String g() {
        String s;
        if ((s = ((BaseBundle)this.o).getString("google.message_id")) == null) {
            s = ((BaseBundle)this.o).getString("message_id");
        }
        return s;
    }
    
    public final int i(final String s) {
        if ("high".equals(s)) {
            return 1;
        }
        if ("normal".equals(s)) {
            return 2;
        }
        return 0;
    }
    
    public String k() {
        return ((BaseBundle)this.o).getString("message_type");
    }
    
    public c q() {
        if (this.q == null && L.t(this.o)) {
            this.q = new c(new L(this.o), null);
        }
        return this.q;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        U.c(this, parcel, n);
    }
    
    public static class b
    {
        public final Bundle a;
        public final Map b;
        
        public b(final String str) {
            final Bundle a = new Bundle();
            this.a = a;
            this.b = new t.a();
            if (!TextUtils.isEmpty((CharSequence)str)) {
                ((BaseBundle)a).putString("google.to", str);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid to: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public T a() {
            final Bundle bundle = new Bundle();
            for (final Map.Entry<String, V> entry : this.b.entrySet()) {
                ((BaseBundle)bundle).putString((String)entry.getKey(), (String)entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new T(bundle);
        }
        
        public b b(final String s) {
            ((BaseBundle)this.a).putString("collapse_key", s);
            return this;
        }
        
        public b c(final Map map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }
        
        public b d(final String s) {
            ((BaseBundle)this.a).putString("google.message_id", s);
            return this;
        }
        
        public b e(final String s) {
            ((BaseBundle)this.a).putString("message_type", s);
            return this;
        }
        
        public b f(final int i) {
            ((BaseBundle)this.a).putString("google.ttl", String.valueOf(i));
            return this;
        }
    }
    
    public static class c
    {
        public final String a;
        public final String b;
        public final String[] c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Uri n;
        public final String o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;
        
        public c(final L l) {
            this.a = l.p("gcm.n.title");
            this.b = l.h("gcm.n.title");
            this.c = j(l, "gcm.n.title");
            this.d = l.p("gcm.n.body");
            this.e = l.h("gcm.n.body");
            this.f = j(l, "gcm.n.body");
            this.g = l.p("gcm.n.icon");
            this.i = l.o();
            this.j = l.p("gcm.n.tag");
            this.k = l.p("gcm.n.color");
            this.l = l.p("gcm.n.click_action");
            this.m = l.p("gcm.n.android_channel_id");
            this.n = l.f();
            this.h = l.p("gcm.n.image");
            this.o = l.p("gcm.n.ticker");
            this.p = l.b("gcm.n.notification_priority");
            this.q = l.b("gcm.n.visibility");
            this.r = l.b("gcm.n.notification_count");
            this.u = l.a("gcm.n.sticky");
            this.v = l.a("gcm.n.local_only");
            this.w = l.a("gcm.n.default_sound");
            this.x = l.a("gcm.n.default_vibrate_timings");
            this.y = l.a("gcm.n.default_light_settings");
            this.t = l.j("gcm.n.event_time");
            this.s = l.e();
            this.z = l.q();
        }
        
        public static String[] j(final L l, final String s) {
            final Object[] g = l.g(s);
            if (g == null) {
                return null;
            }
            final String[] array = new String[g.length];
            for (int i = 0; i < g.length; ++i) {
                array[i] = String.valueOf(g[i]);
            }
            return array;
        }
        
        public String a() {
            return this.d;
        }
        
        public String[] b() {
            return this.f;
        }
        
        public String c() {
            return this.e;
        }
        
        public String d() {
            return this.m;
        }
        
        public String e() {
            return this.l;
        }
        
        public String f() {
            return this.k;
        }
        
        public String g() {
            return this.g;
        }
        
        public Uri h() {
            final String h = this.h;
            if (h != null) {
                return Uri.parse(h);
            }
            return null;
        }
        
        public Uri i() {
            return this.n;
        }
        
        public Integer k() {
            return this.r;
        }
        
        public Integer l() {
            return this.p;
        }
        
        public String m() {
            return this.i;
        }
        
        public String n() {
            return this.j;
        }
        
        public String o() {
            return this.o;
        }
        
        public String p() {
            return this.a;
        }
        
        public String[] q() {
            return this.c;
        }
        
        public String r() {
            return this.b;
        }
        
        public Integer s() {
            return this.q;
        }
    }
}
