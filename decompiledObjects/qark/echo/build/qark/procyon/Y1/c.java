// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.content.Context;
import O1.e;
import O1.x;
import com.facebook.CustomTabMainActivity;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.D;
import x1.r;
import x1.q;
import android.net.Uri;
import kotlin.text.i;
import x1.o;
import android.os.Bundle;
import O1.f;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import x1.h;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;

public final class c extends F
{
    @NotNull
    public static final Parcelable$Creator<c> CREATOR;
    public static final b y;
    public static boolean z;
    public String t;
    public String u;
    public String v;
    public final String w;
    public final h x;
    
    static {
        y = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public c a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new c(parcel);
            }
            
            public c[] b(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        super(u);
        this.w = "custom_tab";
        this.x = h.u;
        this.u = P.s(20);
        c.z = false;
        final f a = f.a;
        this.v = f.c(this.z());
    }
    
    public c(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.w = "custom_tab";
        this.x = h.u;
        this.u = parcel.readString();
        final f a = f.a;
        this.v = f.c(this.z());
    }
    
    public static final void B(final c c, final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(c, "this$0");
        Intrinsics.checkNotNullParameter(e, "$request");
        Intrinsics.checkNotNullParameter(bundle, "$values");
        try {
            c.v(e, c.k(e, bundle), null);
        }
        catch (o o) {
            c.v(e, null, o);
        }
    }
    
    public final void A(String s, final u.e e) {
        if (s == null || (!i.s(s, "fbconnect://cct.", false, 2, null) && !i.s(s, super.g(), false, 2, null))) {
            return;
        }
        final Uri parse = Uri.parse(s);
        final P a = P.a;
        final Bundle o0 = P.o0(parse.getQuery());
        o0.putAll(P.o0(parse.getFragment()));
        if (!this.C(o0)) {
            super.v(e, null, new o("Invalid state parameter"));
            return;
        }
        s = ((BaseBundle)o0).getString("error");
        String string;
        if ((string = s) == null) {
            string = ((BaseBundle)o0).getString("error_type");
        }
        if ((s = ((BaseBundle)o0).getString("error_msg")) == null) {
            s = ((BaseBundle)o0).getString("error_message");
        }
        String string2;
        if ((string2 = s) == null) {
            string2 = ((BaseBundle)o0).getString("error_description");
        }
        s = ((BaseBundle)o0).getString("error_code");
        while (true) {
            if (s == null) {
                break Label_0174;
            }
            try {
                int int1 = Integer.parseInt(s);
                while (true) {
                    if (!P.c0(string) || !P.c0(string2) || int1 != -1) {
                        o o2;
                        if (string != null && (Intrinsics.a(string, "access_denied") || Intrinsics.a(string, "OAuthAccessDeniedException"))) {
                            o2 = new q();
                        }
                        else if (int1 == 4201) {
                            o2 = new q();
                        }
                        else {
                            o2 = new D(new r(int1, string, string2), string2);
                        }
                        super.v(e, null, o2);
                        return;
                    }
                    if (((BaseBundle)o0).containsKey("access_token")) {
                        super.v(e, o0, null);
                        return;
                    }
                    B.t().execute(new Y1.b(this, e, o0));
                    return;
                    int1 = -1;
                    continue;
                }
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean C(final Bundle bundle) {
        try {
            final String string = ((BaseBundle)bundle).getString("state");
            return string != null && Intrinsics.a(new JSONObject(string).getString("7_challenge"), this.u);
        }
        catch (JSONException ex) {
            return false;
        }
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
    public boolean j(final int n, final int n2, final Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.x, false)) {
            return super.j(n, n2, intent);
        }
        if (n != 1) {
            return super.j(n, n2, intent);
        }
        final u.e o = this.d().o();
        if (o == null) {
            return false;
        }
        String stringExtra = null;
        if (n2 == -1) {
            if (intent != null) {
                stringExtra = intent.getStringExtra(CustomTabMainActivity.u);
            }
            this.A(stringExtra, o);
            return true;
        }
        super.v(o, null, new q());
        return false;
    }
    
    @Override
    public void l(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "param");
        jsonObject.put("7_challenge", (Object)this.u);
    }
    
    @Override
    public int o(final u.e e) {
        Intrinsics.checkNotNullParameter(e, "request");
        final u d = this.d();
        if (this.g().length() == 0) {
            return 0;
        }
        final Bundle p = this.p(this.q(e), e);
        if (c.z) {
            ((BaseBundle)p).putString("cct_over_app_switch", "1");
        }
        if (B.q) {
            d.a a;
            Uri uri;
            if (e.r()) {
                a = Y1.d.a;
                uri = O1.x.c.a("oauth", p);
            }
            else {
                a = Y1.d.a;
                uri = e.b.a("oauth", p);
            }
            a.b(uri);
        }
        final androidx.fragment.app.e i = d.i();
        if (i == null) {
            return 0;
        }
        final Intent intent = new Intent((Context)i, (Class)CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.r, "oauth");
        intent.putExtra(CustomTabMainActivity.s, p);
        intent.putExtra(CustomTabMainActivity.t, this.y());
        intent.putExtra(CustomTabMainActivity.v, e.k().toString());
        final Fragment k = d.k();
        if (k == null) {
            return 1;
        }
        k.startActivityForResult(intent, 1);
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
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, n);
        parcel.writeString(this.u);
    }
    
    public final String y() {
        final String t = this.t;
        if (t != null) {
            return t;
        }
        return this.t = f.a();
    }
    
    public final String z() {
        return super.g();
    }
    
    public static final class b
    {
    }
}
