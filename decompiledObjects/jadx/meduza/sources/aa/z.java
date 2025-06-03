package aa;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class z extends n6.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public Bundle f364a;

    /* renamed from: b, reason: collision with root package name */
    public r.b f365b;

    /* renamed from: c, reason: collision with root package name */
    public a f366c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f367a;

        /* renamed from: b, reason: collision with root package name */
        public final String f368b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f369c;

        /* renamed from: d, reason: collision with root package name */
        public final String f370d;

        /* renamed from: e, reason: collision with root package name */
        public final String f371e;
        public final String[] f;

        /* renamed from: g, reason: collision with root package name */
        public final String f372g;

        /* renamed from: h, reason: collision with root package name */
        public final String f373h;

        /* renamed from: i, reason: collision with root package name */
        public final String f374i;

        /* renamed from: j, reason: collision with root package name */
        public final String f375j;

        /* renamed from: k, reason: collision with root package name */
        public final String f376k;

        /* renamed from: l, reason: collision with root package name */
        public final String f377l;

        /* renamed from: m, reason: collision with root package name */
        public final String f378m;

        /* renamed from: n, reason: collision with root package name */
        public final Uri f379n;

        /* renamed from: o, reason: collision with root package name */
        public final String f380o;

        /* renamed from: p, reason: collision with root package name */
        public final Integer f381p;

        /* renamed from: q, reason: collision with root package name */
        public final Integer f382q;

        /* renamed from: r, reason: collision with root package name */
        public final Integer f383r;

        public a(s sVar) {
            String[] strArr;
            this.f367a = sVar.j("gcm.n.title");
            this.f368b = sVar.g("gcm.n.title");
            Object[] f = sVar.f("gcm.n.title");
            String[] strArr2 = null;
            if (f == null) {
                strArr = null;
            } else {
                strArr = new String[f.length];
                for (int i10 = 0; i10 < f.length; i10++) {
                    strArr[i10] = String.valueOf(f[i10]);
                }
            }
            this.f369c = strArr;
            this.f370d = sVar.j("gcm.n.body");
            this.f371e = sVar.g("gcm.n.body");
            Object[] f10 = sVar.f("gcm.n.body");
            if (f10 != null) {
                strArr2 = new String[f10.length];
                for (int i11 = 0; i11 < f10.length; i11++) {
                    strArr2[i11] = String.valueOf(f10[i11]);
                }
            }
            this.f = strArr2;
            this.f372g = sVar.j("gcm.n.icon");
            String j10 = sVar.j("gcm.n.sound2");
            this.f374i = TextUtils.isEmpty(j10) ? sVar.j("gcm.n.sound") : j10;
            this.f375j = sVar.j("gcm.n.tag");
            this.f376k = sVar.j("gcm.n.color");
            this.f377l = sVar.j("gcm.n.click_action");
            this.f378m = sVar.j("gcm.n.android_channel_id");
            this.f379n = sVar.e();
            this.f373h = sVar.j("gcm.n.image");
            this.f380o = sVar.j("gcm.n.ticker");
            this.f381p = sVar.b("gcm.n.notification_priority");
            this.f382q = sVar.b("gcm.n.visibility");
            this.f383r = sVar.b("gcm.n.notification_count");
            sVar.a("gcm.n.sticky");
            sVar.a("gcm.n.local_only");
            sVar.a("gcm.n.default_sound");
            sVar.a("gcm.n.default_vibrate_timings");
            sVar.a("gcm.n.default_light_settings");
            sVar.h();
            sVar.d();
            sVar.k();
        }
    }

    public z(Bundle bundle) {
        this.f364a = bundle;
    }

    public final Map<String, String> D() {
        if (this.f365b == null) {
            Bundle bundle = this.f364a;
            r.b bVar = new r.b();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bVar.put(str, str2);
                    }
                }
            }
            this.f365b = bVar;
        }
        return this.f365b;
    }

    public final String E() {
        String string = this.f364a.getString("google.message_id");
        return string == null ? this.f364a.getString("message_id") : string;
    }

    public final a F() {
        if (this.f366c == null && s.l(this.f364a)) {
            this.f366c = new a(new s(this.f364a));
        }
        return this.f366c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.v(parcel, 2, this.f364a, false);
        b.z.L(J, parcel);
    }
}
