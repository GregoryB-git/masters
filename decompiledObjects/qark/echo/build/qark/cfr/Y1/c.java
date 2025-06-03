/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Y1;

import O1.P;
import O1.e;
import O1.f;
import O1.x;
import Y1.A;
import Y1.B;
import Y1.F;
import Y1.d;
import Y1.u;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.facebook.CustomTabMainActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.D;
import x1.h;
import x1.o;
import x1.q;
import x1.r;

public final class c
extends F {
    @NotNull
    public static final Parcelable.Creator<c> CREATOR;
    public static final b y;
    public static boolean z;
    public String t;
    public String u;
    public String v;
    public final String w;
    public final h x;

    static {
        y = new b(null);
        CREATOR = new Parcelable.Creator(){

            public c a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new c(parcel);
            }

            public c[] b(int n8) {
                return new c[n8];
            }
        };
    }

    public c(u object) {
        Intrinsics.checkNotNullParameter(object, "loginClient");
        super((u)object);
        this.w = "custom_tab";
        this.x = h.u;
        this.u = P.s(20);
        z = false;
        object = f.a;
        this.v = f.c(this.z());
    }

    public c(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        this.w = "custom_tab";
        this.x = h.u;
        this.u = object.readString();
        object = f.a;
        this.v = f.c(this.z());
    }

    public static final void B(c c8, u.e e8, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c8, "this$0");
        Intrinsics.checkNotNullParameter(e8, "$request");
        Intrinsics.checkNotNullParameter((Object)bundle, "$values");
        try {
            c8.v(e8, c8.k(e8, bundle), null);
            return;
        }
        catch (o o8) {
            c8.v(e8, null, o8);
            return;
        }
    }

    public static /* synthetic */ void x(c c8, u.e e8, Bundle bundle) {
        c.B(c8, e8, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void A(String object, u.e e8) {
        Object object3;
        Bundle bundle;
        Object object2;
        int n8;
        block10 : {
            if (object == null) return;
            if (!i.s((String)object, "fbconnect://cct.", false, 2, null)) {
                if (!i.s((String)object, A.super.g(), false, 2, null)) return;
            }
            object = Uri.parse((String)object);
            object2 = P.a;
            bundle = P.o0(object.getQuery());
            bundle.putAll(P.o0(object.getFragment()));
            if (!this.C(bundle)) {
                super.v(e8, null, new o("Invalid state parameter"));
                return;
            }
            object2 = object = bundle.getString("error");
            if (object == null) {
                object2 = bundle.getString("error_type");
            }
            object = object3 = bundle.getString("error_msg");
            if (object3 == null) {
                object = bundle.getString("error_message");
            }
            object3 = object;
            if (object == null) {
                object3 = bundle.getString("error_description");
            }
            if ((object = bundle.getString("error_code")) != null) {
                try {
                    n8 = Integer.parseInt((String)object);
                    break block10;
                }
                catch (NumberFormatException numberFormatException) {}
            }
            n8 = -1;
        }
        if (P.c0((String)object2) && P.c0((String)object3) && n8 == -1) {
            if (bundle.containsKey("access_token")) {
                super.v(e8, bundle, null);
                return;
            }
            x1.B.t().execute((Runnable)new Y1.b(this, e8, bundle));
            return;
        }
        object = object2 != null && (Intrinsics.a(object2, "access_denied") || Intrinsics.a(object2, "OAuthAccessDeniedException")) ? new q() : (n8 == 4201 ? new q() : new D(new r(n8, (String)object2, (String)object3), (String)object3));
        super.v(e8, null, (o)((Object)object));
    }

    public final boolean C(Bundle object) {
        block3 : {
            try {
                object = object.getString("state");
                if (object != null) break block3;
                return false;
            }
            catch (JSONException jSONException) {
                return false;
            }
        }
        boolean bl = Intrinsics.a(new JSONObject((String)object).getString("7_challenge"), this.u);
        return bl;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public String f() {
        return this.w;
    }

    @Override
    public String g() {
        return this.v;
    }

    @Override
    public boolean j(int n8, int n9, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.x, false)) {
            return A.super.j(n8, n9, intent);
        }
        if (n8 != 1) {
            return A.super.j(n8, n9, intent);
        }
        u.e e8 = this.d().o();
        if (e8 == null) {
            return false;
        }
        String string2 = null;
        if (n9 == -1) {
            if (intent != null) {
                string2 = intent.getStringExtra(CustomTabMainActivity.u);
            }
            this.A(string2, e8);
            return true;
        }
        super.v(e8, null, new q());
        return false;
    }

    @Override
    public void l(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "param");
        jSONObject.put("7_challenge", (Object)this.u);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int o(u.e object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "request");
        u u8 = this.d();
        if (this.g().length() == 0) {
            return 0;
        }
        Bundle bundle = this.p(this.q((u.e)object), (u.e)object);
        if (z) {
            bundle.putString("cct_over_app_switch", "1");
        }
        if (x1.B.q) {
            Uri uri;
            if (object.r()) {
                object2 = d.a;
                uri = x.c.a("oauth", bundle);
            } else {
                object2 = d.a;
                uri = O1.e.b.a("oauth", bundle);
            }
            object2.b(uri);
        }
        if ((object2 = u8.i()) == null) {
            return 0;
        }
        object2 = new Intent((Context)object2, CustomTabMainActivity.class);
        object2.putExtra(CustomTabMainActivity.r, "oauth");
        object2.putExtra(CustomTabMainActivity.s, bundle);
        object2.putExtra(CustomTabMainActivity.t, this.y());
        object2.putExtra(CustomTabMainActivity.v, object.k().toString());
        object = u8.k();
        if (object == null) {
            return 1;
        }
        object.startActivityForResult((Intent)object2, 1);
        return 1;
    }

    @Override
    public String r() {
        return "chrome_custom_tab";
    }

    @Override
    public h t() {
        return this.x;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        A.super.writeToParcel(parcel, n8);
        parcel.writeString(this.u);
    }

    public final String y() {
        String string2 = this.t;
        if (string2 != null) {
            return string2;
        }
        this.t = string2 = f.a();
        return string2;
    }

    public final String z() {
        return A.super.g();
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

