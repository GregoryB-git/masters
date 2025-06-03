/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.L;
import com.google.firebase.messaging.U;
import com.google.firebase.messaging.e;
import java.util.Map;
import java.util.Set;
import t.a;

public final class T
extends B2.a {
    public static final Parcelable.Creator<T> CREATOR = new U();
    public Bundle o;
    public Map p;
    public c q;

    public T(Bundle bundle) {
        this.o = bundle;
    }

    public int S() {
        String string2;
        String string3 = string2 = this.o.getString("google.original_priority");
        if (string2 == null) {
            string3 = this.o.getString("google.priority");
        }
        return this.i(string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long T() {
        Object object = this.o.get("google.sent_time");
        if (object instanceof Long) {
            return (Long)object;
        }
        if (!(object instanceof String)) return 0L;
        try {
            return Long.parseLong((String)((String)object));
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid sent time: ");
        stringBuilder.append(object);
        Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return 0L;
    }

    public String U() {
        return this.o.getString("google.to");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int V() {
        Object object = this.o.get("google.ttl");
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (!(object instanceof String)) return 0;
        try {
            return Integer.parseInt((String)((String)object));
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid TTL: ");
        stringBuilder.append(object);
        Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return 0;
    }

    public void W(Intent intent) {
        intent.putExtras(this.o);
    }

    public String a() {
        return this.o.getString("collapse_key");
    }

    public Map d() {
        if (this.p == null) {
            this.p = e.a.a(this.o);
        }
        return this.p;
    }

    public String f() {
        return this.o.getString("from");
    }

    public String g() {
        String string2;
        String string3 = string2 = this.o.getString("google.message_id");
        if (string2 == null) {
            string3 = this.o.getString("message_id");
        }
        return string3;
    }

    public final int i(String string2) {
        if ("high".equals((Object)string2)) {
            return 1;
        }
        if ("normal".equals((Object)string2)) {
            return 2;
        }
        return 0;
    }

    public String k() {
        return this.o.getString("message_type");
    }

    public c q() {
        if (this.q == null && L.t(this.o)) {
            this.q = new c(new L(this.o), null);
        }
        return this.q;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        U.c(this, parcel, n8);
    }

    public static class b {
        public final Bundle a;
        public final Map b;

        public b(String string2) {
            Bundle bundle;
            this.a = bundle = new Bundle();
            this.b = new a();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                bundle.putString("google.to", string2);
                return;
            }
            bundle = new StringBuilder();
            bundle.append("Invalid to: ");
            bundle.append(string2);
            throw new IllegalArgumentException(bundle.toString());
        }

        public T a() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.b.entrySet()) {
                bundle.putString((String)entry.getKey(), (String)entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new T(bundle);
        }

        public b b(String string2) {
            this.a.putString("collapse_key", string2);
            return this;
        }

        public b c(Map map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        public b d(String string2) {
            this.a.putString("google.message_id", string2);
            return this;
        }

        public b e(String string2) {
            this.a.putString("message_type", string2);
            return this;
        }

        public b f(int n8) {
            this.a.putString("google.ttl", String.valueOf((int)n8));
            return this;
        }
    }

    public static class c {
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

        public c(L l8) {
            this.a = l8.p("gcm.n.title");
            this.b = l8.h("gcm.n.title");
            this.c = c.j(l8, "gcm.n.title");
            this.d = l8.p("gcm.n.body");
            this.e = l8.h("gcm.n.body");
            this.f = c.j(l8, "gcm.n.body");
            this.g = l8.p("gcm.n.icon");
            this.i = l8.o();
            this.j = l8.p("gcm.n.tag");
            this.k = l8.p("gcm.n.color");
            this.l = l8.p("gcm.n.click_action");
            this.m = l8.p("gcm.n.android_channel_id");
            this.n = l8.f();
            this.h = l8.p("gcm.n.image");
            this.o = l8.p("gcm.n.ticker");
            this.p = l8.b("gcm.n.notification_priority");
            this.q = l8.b("gcm.n.visibility");
            this.r = l8.b("gcm.n.notification_count");
            this.u = l8.a("gcm.n.sticky");
            this.v = l8.a("gcm.n.local_only");
            this.w = l8.a("gcm.n.default_sound");
            this.x = l8.a("gcm.n.default_vibrate_timings");
            this.y = l8.a("gcm.n.default_light_settings");
            this.t = l8.j("gcm.n.event_time");
            this.s = l8.e();
            this.z = l8.q();
        }

        public /* synthetic */ c(L l8,  a8) {
            this(l8);
        }

        public static String[] j(L arrobject, String arrstring) {
            if ((arrobject = arrobject.g((String)arrstring)) == null) {
                return null;
            }
            arrstring = new String[arrobject.length];
            for (int i8 = 0; i8 < arrobject.length; ++i8) {
                arrstring[i8] = String.valueOf((Object)arrobject[i8]);
            }
            return arrstring;
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
            String string2 = this.h;
            if (string2 != null) {
                return Uri.parse((String)string2);
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

