/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.util.Base64
 *  android.util.Log
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Y1;

import O1.P;
import W5.C;
import W5.m;
import Y1.E;
import Y1.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.e;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.b;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.D;
import x1.K;
import x1.h;
import x1.o;
import x1.r;
import y1.F;

public abstract class A
implements Parcelable {
    public static final a q = new a(null);
    public Map o;
    public u p;

    public A(u u8) {
        Intrinsics.checkNotNullParameter(u8, "loginClient");
        this.m(u8);
    }

    public A(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "source");
        parcel = P.t0(parcel);
        parcel = parcel == null ? null : C.o((Map)parcel);
        this.o = parcel;
    }

    public void a(String string2, Object object) {
        Map map;
        if (this.o == null) {
            this.o = new HashMap();
        }
        if ((map = this.o) == null) {
            return;
        }
        object = object == null ? null : object.toString();
        string2 = (String)map.put((Object)string2, object);
    }

    public void b() {
    }

    public String c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", (Object)string2);
            jSONObject.put("3_method", (Object)this.f());
            this.l(jSONObject);
        }
        catch (JSONException jSONException) {
            Log.w((String)"LoginMethodHandler", (String)Intrinsics.i("Error creating client state json: ", jSONException.getMessage()));
        }
        string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "param.toString()");
        return string2;
    }

    public final u d() {
        u u8 = this.p;
        if (u8 != null) {
            return u8;
        }
        Intrinsics.n("loginClient");
        throw null;
    }

    public final Map e() {
        return this.o;
    }

    public abstract String f();

    public String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fb");
        stringBuilder.append(B.m());
        stringBuilder.append("://authorize/");
        return stringBuilder.toString();
    }

    public void h(String string2) {
        Object object = this.d().o();
        object = object == null ? null : object.a();
        Object object2 = object;
        if (object == null) {
            object2 = B.m();
        }
        object = new F((Context)this.d().i(), (String)object2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", string2);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", (String)object2);
        object.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean i() {
        return false;
    }

    public boolean j(int n8, int n9, Intent intent) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Bundle k(u.e object, Bundle bundle) {
        block12 : {
            Object object2;
            block11 : {
                block10 : {
                    Intrinsics.checkNotNullParameter(object, "request");
                    Intrinsics.checkNotNullParameter((Object)bundle, "values");
                    String string2 = bundle.getString("code");
                    if (P.c0(string2)) throw new o("No code param found from the request");
                    Object var3_5 = null;
                    if (string2 == null) {
                        object = null;
                    } else {
                        object2 = E.a;
                        String string3 = this.g();
                        object = object2 = object.f();
                        if (object2 == null) {
                            object = "";
                        }
                        object = E.a(string2, string3, (String)object);
                    }
                    if (object == null) throw new o("Failed to create code exchange request");
                    object2 = (object = object.k()).b();
                    if (object2 != null) throw new D((r)object2, object2.c());
                    try {
                        object2 = object.c();
                        if (object2 != null) break block10;
                        object = var3_5;
                        break block11;
                    }
                    catch (JSONException jSONException) {
                        throw new o(Intrinsics.i("Fail to process code exchange response: ", jSONException.getMessage()));
                    }
                }
                object = object2.getString("access_token");
            }
            if (object2 != null) {
                if (P.c0((String)object)) break block12;
                bundle.putString("access_token", (String)object);
                if (!object2.has("id_token")) return bundle;
                bundle.putString("id_token", object2.getString("id_token"));
                return bundle;
            }
        }
        throw new o("No access token found from result");
    }

    public void l(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "param");
    }

    public final void m(u u8) {
        Intrinsics.checkNotNullParameter(u8, "<set-?>");
        this.p = u8;
    }

    public boolean n() {
        return false;
    }

    public abstract int o(u.e var1);

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        P p8 = P.a;
        P.H0(parcel, this.o);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final x1.a a(Bundle object, h h8, String string2) {
            Intrinsics.checkNotNullParameter(object, "bundle");
            Intrinsics.checkNotNullParameter(string2, "applicationId");
            P p8 = P.a;
            p8 = P.x((Bundle)object, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList arrayList = object.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string3 = object.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date date = P.x((Bundle)object, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string3 != null) {
                if (string3.length() == 0) {
                    return null;
                }
                String string4 = object.getString("com.facebook.platform.extra.USER_ID");
                if (string4 != null) {
                    if (string4.length() == 0) {
                        return null;
                    }
                    object = object.getString("graph_domain");
                    return new x1.a(string3, string2, string4, (Collection)arrayList, null, null, h8, (Date)p8, new Date(), date, (String)object);
                }
            }
            return null;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final x1.a b(Collection arrobject, Bundle bundle, h h8, String string2) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            Intrinsics.checkNotNullParameter(string2, "applicationId");
            Object object = P.a;
            Date date = P.x(bundle, "expires_in", new Date());
            String string3 = bundle.getString("access_token");
            if (string3 == null) {
                return null;
            }
            Date date2 = P.x(bundle, "data_access_expiration_time", new Date(0L));
            object = bundle.getString("granted_scopes");
            if (object != null && object.length() > 0) {
                arrobject = ((Collection)i.V((CharSequence)object, new String[]{","}, false, 0, 6, null)).toArray((Object[])new String[0]);
                if (arrobject == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                arrobject = (String[])arrobject;
                arrobject = m.d(Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            }
            if ((object = bundle.getString("denied_scopes")) != null && object.length() > 0) {
                if ((object = ((Collection)i.V((CharSequence)object, new String[]{","}, false, 0, 6, null)).toArray((Object[])new String[0])) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                object = (String[])object;
                object = m.d(Arrays.copyOf((Object[])object, (int)object.length));
            } else {
                object = null;
            }
            ArrayList arrayList = bundle.getString("expired_scopes");
            if (arrayList != null && arrayList.length() > 0) {
                if ((arrayList = ((Collection)i.V((CharSequence)arrayList, new String[]{","}, false, 0, 6, null)).toArray((Object[])new String[0])) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                arrayList = (String[])arrayList;
                arrayList = m.d(Arrays.copyOf((Object[])arrayList, (int)arrayList.length));
            } else {
                arrayList = null;
            }
            if (P.c0(string3)) {
                return null;
            }
            String string4 = bundle.getString("graph_domain");
            return new x1.a(string3, string2, this.e(bundle.getString("signed_request")), (Collection)arrobject, (Collection)object, (Collection)arrayList, h8, date, new Date(), date2, string4);
        }

        public final x1.i c(Bundle object, String string2) {
            Intrinsics.checkNotNullParameter(object, "bundle");
            object = object.getString("com.facebook.platform.extra.ID_TOKEN");
            if (object != null && object.length() != 0 && string2 != null && string2.length() != 0) {
                try {
                    object = new x1.i((String)object, string2);
                    return object;
                }
                catch (Exception exception) {
                    throw new o(exception.getMessage());
                }
            }
            return null;
        }

        public final x1.i d(Bundle object, String string2) {
            Intrinsics.checkNotNullParameter(object, "bundle");
            object = object.getString("id_token");
            if (object != null && object.length() != 0 && string2 != null && string2.length() != 0) {
                try {
                    object = new x1.i((String)object, string2);
                    return object;
                }
                catch (Exception exception) {
                    throw new o(exception.getMessage(), (Throwable)exception);
                }
            }
            return null;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final String e(String object) {
            block6 : {
                if (object == null || object.length() == 0) throw new o("Authorization response does not contain the signed_request");
                object = ((Collection)i.V((CharSequence)object, new String[]{"."}, false, 0, 6, null)).toArray((Object[])new String[0]);
                if (object == null) break block6;
                object = (String[])object;
                if (object.length != 2) throw new o("Failed to retrieve user_id from signed_request");
                {
                    object = Base64.decode((String)object[1], (int)0);
                    Intrinsics.checkNotNullExpressionValue(object, "data");
                    object = new JSONObject(new String((byte[])object, b.b)).getString("user_id");
                    Intrinsics.checkNotNullExpressionValue(object, "jsonObject.getString(\"user_id\")");
                    return object;
                }
            }
            try {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            catch (UnsupportedEncodingException | JSONException jSONException) {
                throw new o("Failed to retrieve user_id from signed_request");
            }
        }
    }

}

