// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import java.io.UnsupportedEncodingException;
import kotlin.text.b;
import android.util.Base64;
import W5.m;
import java.util.Arrays;
import kotlin.text.i;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import x1.a;
import x1.h;
import x1.r;
import x1.K;
import x1.D;
import x1.o;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import y1.F;
import x1.B;
import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;
import java.util.HashMap;
import W5.C;
import O1.P;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.Map;
import android.os.Parcelable;

public abstract class A implements Parcelable
{
    public static final a q;
    public Map o;
    public u p;
    
    static {
        q = new a(null);
    }
    
    public A(final u u) {
        Intrinsics.checkNotNullParameter(u, "loginClient");
        this.m(u);
    }
    
    public A(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        final Map t0 = P.t0(parcel);
        Map o;
        if (t0 == null) {
            o = null;
        }
        else {
            o = C.o(t0);
        }
        this.o = o;
    }
    
    public void a(String s, final Object o) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        final Map o2 = this.o;
        if (o2 == null) {
            return;
        }
        String string;
        if (o == null) {
            string = null;
        }
        else {
            string = o.toString();
        }
        s = o2.put(s, string);
    }
    
    public void b() {
    }
    
    public String c(String string) {
        Intrinsics.checkNotNullParameter(string, "authId");
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("0_auth_logger_id", (Object)string);
            jsonObject.put("3_method", (Object)this.f());
            this.l(jsonObject);
        }
        catch (JSONException ex) {
            Log.w("LoginMethodHandler", Intrinsics.i("Error creating client state json: ", ((Throwable)ex).getMessage()));
        }
        string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "param.toString()");
        return string;
    }
    
    public final u d() {
        final u p = this.p;
        if (p != null) {
            return p;
        }
        Intrinsics.n("loginClient");
        throw null;
    }
    
    public final Map e() {
        return this.o;
    }
    
    public abstract String f();
    
    public String g() {
        final StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(B.m());
        sb.append("://authorize/");
        return sb.toString();
    }
    
    public void h(final String s) {
        final u.e o = this.d().o();
        String a;
        if (o == null) {
            a = null;
        }
        else {
            a = o.a();
        }
        String m = a;
        if (a == null) {
            m = B.m();
        }
        final F f = new F((Context)this.d().i(), m);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("fb_web_login_e2e", s);
        ((BaseBundle)bundle).putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        ((BaseBundle)bundle).putString("app_id", m);
        f.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }
    
    public boolean i() {
        return false;
    }
    
    public boolean j(final int n, final int n2, final Intent intent) {
        return false;
    }
    
    public Bundle k(final u.e e, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(e, "request");
        Intrinsics.checkNotNullParameter(bundle, "values");
        final String string = ((BaseBundle)bundle).getString("code");
        while (true) {
            Label_0219: {
                if (P.c0(string)) {
                    break Label_0219;
                }
                final String s = null;
                x1.F a;
                if (string == null) {
                    a = null;
                }
                else {
                    final E a2 = E.a;
                    final String g = this.g();
                    String f;
                    if ((f = e.f()) == null) {
                        f = "";
                    }
                    a = E.a(string, g, f);
                }
                Label_0208: {
                    if (a == null) {
                        break Label_0208;
                    }
                    final K k = a.k();
                    final r b = k.b();
                    Label_0193: {
                        if (b != null) {
                            break Label_0193;
                        }
                        try {
                            final JSONObject c = k.c();
                            String string2;
                            if (c == null) {
                                string2 = s;
                            }
                            else {
                                string2 = c.getString("access_token");
                            }
                            if (c == null || P.c0(string2)) {
                                throw new o("No access token found from result");
                            }
                            ((BaseBundle)bundle).putString("access_token", string2);
                            if (c.has("id_token")) {
                                ((BaseBundle)bundle).putString("id_token", c.getString("id_token"));
                                return bundle;
                            }
                            return bundle;
                            throw new D(b, b.c());
                            final Throwable t;
                            throw new o(Intrinsics.i("Fail to process code exchange response: ", t.getMessage()));
                            throw new o("No code param found from the request");
                            throw new o("Failed to create code exchange request");
                        }
                        catch (JSONException ex) {}
                    }
                }
            }
            final JSONException ex;
            final Throwable t = (Throwable)ex;
            continue;
        }
    }
    
    public void l(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "param");
    }
    
    public final void m(final u p) {
        Intrinsics.checkNotNullParameter(p, "<set-?>");
        this.p = p;
    }
    
    public boolean n() {
        return false;
    }
    
    public abstract int o(final u.e p0);
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        final P a = P.a;
        P.H0(parcel, this.o);
    }
    
    public static final class a
    {
        public final x1.a a(final Bundle bundle, final h h, final String s) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(s, "applicationId");
            final P a = P.a;
            final Date x = P.x(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            final ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            final String string = ((BaseBundle)bundle).getString("com.facebook.platform.extra.ACCESS_TOKEN");
            final Date x2 = P.x(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string != null) {
                if (string.length() == 0) {
                    return null;
                }
                final String string2 = ((BaseBundle)bundle).getString("com.facebook.platform.extra.USER_ID");
                if (string2 != null) {
                    if (string2.length() == 0) {
                        return null;
                    }
                    return new x1.a(string, s, string2, stringArrayList, null, null, h, x, new Date(), x2, ((BaseBundle)bundle).getString("graph_domain"));
                }
            }
            return null;
        }
        
        public final x1.a b(Collection d, final Bundle bundle, final h h, final String s) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(s, "applicationId");
            final P a = P.a;
            final Date x = P.x(bundle, "expires_in", new Date());
            final String string = ((BaseBundle)bundle).getString("access_token");
            if (string == null) {
                return null;
            }
            final Date x2 = P.x(bundle, "data_access_expiration_time", new Date(0L));
            final String string2 = ((BaseBundle)bundle).getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                final Object[] array = i.V(string2, new String[] { "," }, false, 0, 6, null).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                final String[] original = (String[])array;
                d = m.d((Object[])Arrays.copyOf(original, original.length));
            }
            final String string3 = ((BaseBundle)bundle).getString("denied_scopes");
            ArrayList d2;
            if (string3 != null && string3.length() > 0) {
                final Object[] array2 = i.V(string3, new String[] { "," }, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                final String[] original2 = (String[])array2;
                d2 = m.d((Object[])Arrays.copyOf(original2, original2.length));
            }
            else {
                d2 = null;
            }
            final String string4 = ((BaseBundle)bundle).getString("expired_scopes");
            ArrayList d3;
            if (string4 != null && string4.length() > 0) {
                final Object[] array3 = i.V(string4, new String[] { "," }, false, 0, 6, null).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                final String[] original3 = (String[])array3;
                d3 = m.d((Object[])Arrays.copyOf(original3, original3.length));
            }
            else {
                d3 = null;
            }
            if (P.c0(string)) {
                return null;
            }
            return new x1.a(string, s, this.e(((BaseBundle)bundle).getString("signed_request")), d, d2, d3, h, x, new Date(), x2, ((BaseBundle)bundle).getString("graph_domain"));
        }
        
        public final x1.i c(final Bundle bundle, final String s) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            final String string = ((BaseBundle)bundle).getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (string.length() != 0) {
                    if (s != null) {
                        if (s.length() != 0) {
                            try {
                                return new x1.i(string, s);
                            }
                            catch (Exception ex) {
                                throw new o(ex.getMessage());
                            }
                        }
                    }
                }
            }
            return null;
        }
        
        public final x1.i d(final Bundle bundle, final String s) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            final String string = ((BaseBundle)bundle).getString("id_token");
            if (string != null) {
                if (string.length() != 0) {
                    if (s != null) {
                        if (s.length() != 0) {
                            try {
                                return new x1.i(string, s);
                            }
                            catch (Exception ex) {
                                throw new o(ex.getMessage(), ex);
                            }
                        }
                    }
                }
            }
            return null;
        }
        
        public final String e(String string) {
            Label_0125: {
                if (string == null || string.length() == 0) {
                    break Label_0125;
                }
                try {
                    final Object[] array = i.V(string, new String[] { "." }, false, 0, 6, null).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    final String[] array2 = (String[])array;
                    if (array2.length == 2) {
                        final byte[] decode = Base64.decode(array2[1], 0);
                        Intrinsics.checkNotNullExpressionValue(decode, "data");
                        string = new JSONObject(new String(decode, b.b)).getString("user_id");
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                        return string;
                    }
                    throw new o("Failed to retrieve user_id from signed_request");
                    throw new o("Authorization response does not contain the signed_request");
                }
                catch (UnsupportedEncodingException | JSONException ex) {
                    throw new o("Failed to retrieve user_id from signed_request");
                }
            }
        }
    }
}
