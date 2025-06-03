package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC1115e;
import java.util.Map;
import t.C1958a;

/* loaded from: classes.dex */
public final class T extends B2.a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* renamed from: o, reason: collision with root package name */
    public Bundle f11658o;

    /* renamed from: p, reason: collision with root package name */
    public Map f11659p;

    /* renamed from: q, reason: collision with root package name */
    public c f11660q;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f11661a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f11662b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f11661a = bundle;
            this.f11662b = new C1958a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public T a() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f11662b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f11661a);
            this.f11661a.remove("from");
            return new T(bundle);
        }

        public b b(String str) {
            this.f11661a.putString("collapse_key", str);
            return this;
        }

        public b c(Map map) {
            this.f11662b.clear();
            this.f11662b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.f11661a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f11661a.putString("message_type", str);
            return this;
        }

        public b f(int i7) {
            this.f11661a.putString("google.ttl", String.valueOf(i7));
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f11663a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11664b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f11665c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11666d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11667e;

        /* renamed from: f, reason: collision with root package name */
        public final String[] f11668f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11669g;

        /* renamed from: h, reason: collision with root package name */
        public final String f11670h;

        /* renamed from: i, reason: collision with root package name */
        public final String f11671i;

        /* renamed from: j, reason: collision with root package name */
        public final String f11672j;

        /* renamed from: k, reason: collision with root package name */
        public final String f11673k;

        /* renamed from: l, reason: collision with root package name */
        public final String f11674l;

        /* renamed from: m, reason: collision with root package name */
        public final String f11675m;

        /* renamed from: n, reason: collision with root package name */
        public final Uri f11676n;

        /* renamed from: o, reason: collision with root package name */
        public final String f11677o;

        /* renamed from: p, reason: collision with root package name */
        public final Integer f11678p;

        /* renamed from: q, reason: collision with root package name */
        public final Integer f11679q;

        /* renamed from: r, reason: collision with root package name */
        public final Integer f11680r;

        /* renamed from: s, reason: collision with root package name */
        public final int[] f11681s;

        /* renamed from: t, reason: collision with root package name */
        public final Long f11682t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f11683u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f11684v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f11685w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f11686x;

        /* renamed from: y, reason: collision with root package name */
        public final boolean f11687y;

        /* renamed from: z, reason: collision with root package name */
        public final long[] f11688z;

        public c(L l7) {
            this.f11663a = l7.p("gcm.n.title");
            this.f11664b = l7.h("gcm.n.title");
            this.f11665c = j(l7, "gcm.n.title");
            this.f11666d = l7.p("gcm.n.body");
            this.f11667e = l7.h("gcm.n.body");
            this.f11668f = j(l7, "gcm.n.body");
            this.f11669g = l7.p("gcm.n.icon");
            this.f11671i = l7.o();
            this.f11672j = l7.p("gcm.n.tag");
            this.f11673k = l7.p("gcm.n.color");
            this.f11674l = l7.p("gcm.n.click_action");
            this.f11675m = l7.p("gcm.n.android_channel_id");
            this.f11676n = l7.f();
            this.f11670h = l7.p("gcm.n.image");
            this.f11677o = l7.p("gcm.n.ticker");
            this.f11678p = l7.b("gcm.n.notification_priority");
            this.f11679q = l7.b("gcm.n.visibility");
            this.f11680r = l7.b("gcm.n.notification_count");
            this.f11683u = l7.a("gcm.n.sticky");
            this.f11684v = l7.a("gcm.n.local_only");
            this.f11685w = l7.a("gcm.n.default_sound");
            this.f11686x = l7.a("gcm.n.default_vibrate_timings");
            this.f11687y = l7.a("gcm.n.default_light_settings");
            this.f11682t = l7.j("gcm.n.event_time");
            this.f11681s = l7.e();
            this.f11688z = l7.q();
        }

        public static String[] j(L l7, String str) {
            Object[] g7 = l7.g(str);
            if (g7 == null) {
                return null;
            }
            String[] strArr = new String[g7.length];
            for (int i7 = 0; i7 < g7.length; i7++) {
                strArr[i7] = String.valueOf(g7[i7]);
            }
            return strArr;
        }

        public String a() {
            return this.f11666d;
        }

        public String[] b() {
            return this.f11668f;
        }

        public String c() {
            return this.f11667e;
        }

        public String d() {
            return this.f11675m;
        }

        public String e() {
            return this.f11674l;
        }

        public String f() {
            return this.f11673k;
        }

        public String g() {
            return this.f11669g;
        }

        public Uri h() {
            String str = this.f11670h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f11676n;
        }

        public Integer k() {
            return this.f11680r;
        }

        public Integer l() {
            return this.f11678p;
        }

        public String m() {
            return this.f11671i;
        }

        public String n() {
            return this.f11672j;
        }

        public String o() {
            return this.f11677o;
        }

        public String p() {
            return this.f11663a;
        }

        public String[] q() {
            return this.f11665c;
        }

        public String r() {
            return this.f11664b;
        }

        public Integer s() {
            return this.f11679q;
        }
    }

    public T(Bundle bundle) {
        this.f11658o = bundle;
    }

    public int S() {
        String string = this.f11658o.getString("google.original_priority");
        if (string == null) {
            string = this.f11658o.getString("google.priority");
        }
        return i(string);
    }

    public long T() {
        Object obj = this.f11658o.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String U() {
        return this.f11658o.getString("google.to");
    }

    public int V() {
        Object obj = this.f11658o.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public void W(Intent intent) {
        intent.putExtras(this.f11658o);
    }

    public String a() {
        return this.f11658o.getString("collapse_key");
    }

    public Map d() {
        if (this.f11659p == null) {
            this.f11659p = AbstractC1115e.a.a(this.f11658o);
        }
        return this.f11659p;
    }

    public String f() {
        return this.f11658o.getString("from");
    }

    public String g() {
        String string = this.f11658o.getString("google.message_id");
        return string == null ? this.f11658o.getString("message_id") : string;
    }

    public final int i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String k() {
        return this.f11658o.getString("message_type");
    }

    public c q() {
        if (this.f11660q == null && L.t(this.f11658o)) {
            this.f11660q = new c(new L(this.f11658o));
        }
        return this.f11660q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        U.c(this, parcel, i7);
    }
}
