/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import O1.Q;
import W5.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.M;
import x1.N;
import x1.g;
import x1.h;
import x1.o;

public final class a
implements Parcelable {
    public static final Date A;
    public static final Date B;
    public static final Date C;
    @NotNull
    public static final Parcelable.Creator<a> CREATOR;
    public static final h D;
    public static final c z;
    public final Date o;
    public final Set p;
    public final Set q;
    public final Set r;
    public final String s;
    public final h t;
    public final Date u;
    public final String v;
    public final String w;
    public final Date x;
    public final String y;

    static {
        Date date;
        z = new c(null);
        A = date = new Date(Long.MAX_VALUE);
        B = date;
        C = new Date();
        D = h.q;
        CREATOR = new Parcelable.Creator(){

            public a a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
    }

    public a(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        this.o = new Date(parcel.readLong());
        Object object = new ArrayList();
        parcel.readStringList((List)object);
        Set set = Collections.unmodifiableSet((Set)new HashSet((Collection)object));
        Intrinsics.checkNotNullExpressionValue((Object)set, "unmodifiableSet(HashSet(permissionsList))");
        this.p = set;
        object.clear();
        parcel.readStringList((List)object);
        set = Collections.unmodifiableSet((Set)new HashSet((Collection)object));
        Intrinsics.checkNotNullExpressionValue((Object)set, "unmodifiableSet(HashSet(permissionsList))");
        this.q = set;
        object.clear();
        parcel.readStringList((List)object);
        object = Collections.unmodifiableSet((Set)new HashSet((Collection)object));
        Intrinsics.checkNotNullExpressionValue(object, "unmodifiableSet(HashSet(permissionsList))");
        this.r = object;
        this.s = Q.k(parcel.readString(), "token");
        object = parcel.readString();
        object = object != null ? h.valueOf((String)object) : D;
        this.t = object;
        this.u = new Date(parcel.readLong());
        this.v = Q.k(parcel.readString(), "applicationId");
        this.w = Q.k(parcel.readString(), "userId");
        this.x = new Date(parcel.readLong());
        this.y = parcel.readString();
    }

    public a(String object, String string2, String string3, Collection collection, Collection collection2, Collection collection3, h h8, Date date, Date date2, Date date3, String string4) {
        Intrinsics.checkNotNullParameter(object, "accessToken");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Intrinsics.checkNotNullParameter(string3, "userId");
        Q.g((String)object, "accessToken");
        Q.g(string2, "applicationId");
        Q.g(string3, "userId");
        Date date4 = date;
        if (date == null) {
            date4 = B;
        }
        this.o = date4;
        collection = collection != null ? new HashSet(collection) : new HashSet();
        collection = Collections.unmodifiableSet((Set)collection);
        Intrinsics.checkNotNullExpressionValue((Object)collection, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.p = collection;
        collection = collection2 != null ? new HashSet(collection2) : new HashSet();
        collection = Collections.unmodifiableSet((Set)collection);
        Intrinsics.checkNotNullExpressionValue((Object)collection, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.q = collection;
        collection = collection3 != null ? new HashSet(collection3) : new HashSet();
        collection = Collections.unmodifiableSet((Set)collection);
        Intrinsics.checkNotNullExpressionValue((Object)collection, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.r = collection;
        this.s = object;
        object = h8;
        if (h8 == null) {
            object = D;
        }
        this.t = this.b((h)((Object)object), string4);
        object = date2;
        if (date2 == null) {
            object = C;
        }
        this.u = object;
        this.v = string2;
        this.w = string3;
        if (date3 == null || date3.getTime() == 0L) {
            date3 = B;
        }
        this.x = date3;
        object = string4;
        if (string4 == null) {
            object = "facebook";
        }
        this.y = object;
    }

    public /* synthetic */ a(String string2, String string3, String string4, Collection collection, Collection collection2, Collection collection3, h h8, Date date, Date date2, Date date3, String string5, int n8, kotlin.jvm.internal.g g8) {
        if ((n8 & 1024) != 0) {
            string5 = "facebook";
        }
        this(string2, string3, string4, collection, collection2, collection3, h8, date, date2, date3, string5);
    }

    public final void a(StringBuilder stringBuilder) {
        stringBuilder.append(" permissions:");
        stringBuilder.append("[");
        stringBuilder.append(TextUtils.join((CharSequence)", ", (Iterable)this.p));
        stringBuilder.append("]");
    }

    public final h b(h h8, String string2) {
        h h9 = h8;
        if (string2 != null) {
            h9 = h8;
            if (string2.equals((Object)"instagram")) {
                int n8 = d.a[h8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return h8;
                        }
                        return h.A;
                    }
                    return h.z;
                }
                h9 = h.y;
            }
        }
        return h9;
    }

    public final String c() {
        return this.v;
    }

    public final Date d() {
        return this.x;
    }

    public int describeContents() {
        return 0;
    }

    public final Set e() {
        return this.q;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        Object object2 = this.o;
        object = (a)object;
        if (Intrinsics.a(object2, (Object)object.o) && Intrinsics.a((Object)this.p, (Object)object.p) && Intrinsics.a((Object)this.q, (Object)object.q) && Intrinsics.a((Object)this.r, (Object)object.r) && Intrinsics.a(this.s, object.s) && this.t == object.t && Intrinsics.a((Object)this.u, (Object)object.u) && Intrinsics.a(this.v, object.v) && Intrinsics.a(this.w, object.w) && Intrinsics.a((Object)this.x, (Object)object.x)) {
            object2 = this.y;
            object = object.y;
            if (object2 == null ? object == null : Intrinsics.a(object2, object)) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.r;
    }

    public final Date g() {
        return this.o;
    }

    public final String h() {
        return this.y;
    }

    public int hashCode() {
        int n8 = this.o.hashCode();
        int n9 = this.p.hashCode();
        int n10 = this.q.hashCode();
        int n11 = this.r.hashCode();
        int n12 = this.s.hashCode();
        int n13 = this.t.hashCode();
        int n14 = this.u.hashCode();
        int n15 = this.v.hashCode();
        int n16 = this.w.hashCode();
        int n17 = this.x.hashCode();
        String string2 = this.y;
        int n18 = string2 == null ? 0 : string2.hashCode();
        return ((((((((((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18;
    }

    public final Date i() {
        return this.u;
    }

    public final Set j() {
        return this.p;
    }

    public final h k() {
        return this.t;
    }

    public final String l() {
        return this.s;
    }

    public final String m() {
        return this.w;
    }

    public final boolean n() {
        return new Date().after(this.o);
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", (Object)this.s);
        jSONObject.put("expires_at", this.o.getTime());
        jSONObject.put("permissions", (Object)new JSONArray((Collection)this.p));
        jSONObject.put("declined_permissions", (Object)new JSONArray((Collection)this.q));
        jSONObject.put("expired_permissions", (Object)new JSONArray((Collection)this.r));
        jSONObject.put("last_refresh", this.u.getTime());
        jSONObject.put("source", (Object)this.t.name());
        jSONObject.put("application_id", (Object)this.v);
        jSONObject.put("user_id", (Object)this.w);
        jSONObject.put("data_access_expiration_time", this.x.getTime());
        String string2 = this.y;
        if (string2 != null) {
            jSONObject.put("graph_domain", (Object)string2);
        }
        return jSONObject;
    }

    public final String p() {
        B b8 = B.a;
        if (B.H(N.p)) {
            return this.s;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    public String toString() {
        Object object = new StringBuilder();
        object.append("{AccessToken");
        object.append(" token:");
        object.append(this.p());
        this.a((StringBuilder)object);
        object.append("}");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "builder.toString()");
        return object;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeLong(this.o.getTime());
        parcel.writeStringList((List)new ArrayList((Collection)this.p));
        parcel.writeStringList((List)new ArrayList((Collection)this.q));
        parcel.writeStringList((List)new ArrayList((Collection)this.r));
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeLong(this.u.getTime());
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeLong(this.x.getTime());
        parcel.writeString(this.y);
    }

    public static interface a {
        public void a(a var1);

        public void b(o var1);
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g g8) {
            this();
        }

        public final a a(a a8) {
            Intrinsics.checkNotNullParameter(a8, "current");
            return new a(a8.l(), a8.c(), a8.m(), (Collection)a8.j(), (Collection)a8.e(), (Collection)a8.f(), a8.k(), new Date(), new Date(), a8.d(), null, 1024, null);
        }

        public final a b(JSONObject object) {
            Intrinsics.checkNotNullParameter(object, "jsonObject");
            if (object.getInt("version") <= 1) {
                String string2 = object.getString("token");
                Date date = new Date(object.getLong("expires_at"));
                JSONArray jSONArray = object.getJSONArray("permissions");
                JSONArray jSONArray2 = object.getJSONArray("declined_permissions");
                JSONArray jSONArray3 = object.optJSONArray("expired_permissions");
                Date date2 = new Date(object.getLong("last_refresh"));
                Object object2 = object.getString("source");
                Intrinsics.checkNotNullExpressionValue(object2, "jsonObject.getString(SOURCE_KEY)");
                object2 = h.valueOf((String)object2);
                String string3 = object.getString("application_id");
                String string4 = object.getString("user_id");
                Date date3 = new Date(object.optLong("data_access_expiration_time", 0L));
                String string5 = object.optString("graph_domain", null);
                Intrinsics.checkNotNullExpressionValue(string2, "token");
                Intrinsics.checkNotNullExpressionValue(string3, "applicationId");
                Intrinsics.checkNotNullExpressionValue(string4, "userId");
                object = P.a;
                Intrinsics.checkNotNullExpressionValue((Object)jSONArray, "permissionsArray");
                jSONArray = (Collection)P.g0(jSONArray);
                Intrinsics.checkNotNullExpressionValue((Object)jSONArray2, "declinedPermissionsArray");
                jSONArray2 = (Collection)P.g0(jSONArray2);
                object = jSONArray3 == null ? new ArrayList() : P.g0(jSONArray3);
                return new a(string2, string3, string4, (Collection)jSONArray, (Collection)jSONArray2, (Collection)object, (h)((Object)object2), date, date2, date3, string5);
            }
            throw new o("Unknown AccessToken serialization format.");
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final a c(Bundle bundle) {
            String string3;
            String string2;
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            List list = this.f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List list2 = this.f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List list3 = this.f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            M.a a8 = M.c;
            String string4 = string3 = a8.a(bundle);
            if (P.c0(string3)) {
                string4 = B.m();
            }
            if ((string2 = a8.f(bundle)) == null) {
                return null;
            }
            string3 = P.f(string2);
            if (string3 == null) {
                string3 = null;
            } else {
                string3 = string3.getString("id");
            }
            if (string4 != null) return null;
            return null;
            catch (JSONException jSONException) {
                return null;
            }
        }

        public final void d() {
            a a8 = g.f.e().i();
            if (a8 != null) {
                this.h(this.a(a8));
            }
        }

        public final a e() {
            return g.f.e().i();
        }

        public final List f(Bundle bundle, String string2) {
            Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
            bundle = bundle.getStringArrayList(string2);
            if (bundle == null) {
                return m.f();
            }
            bundle = Collections.unmodifiableList((List)new ArrayList((Collection)bundle));
            Intrinsics.checkNotNullExpressionValue((Object)bundle, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return bundle;
        }

        public final boolean g() {
            a a8 = g.f.e().i();
            if (a8 != null && !a8.n()) {
                return true;
            }
            return false;
        }

        public final void h(a a8) {
            g.f.e().r(a8);
        }
    }

    public abstract class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[h.values().length];
            arrn[h.q.ordinal()] = 1;
            arrn[h.u.ordinal()] = 2;
            arrn[h.t.ordinal()] = 3;
            a = arrn;
        }
    }

}

