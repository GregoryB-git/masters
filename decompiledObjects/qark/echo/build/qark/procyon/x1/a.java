// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import W5.m;
import org.json.JSONException;
import android.os.Bundle;
import O1.P;
import org.json.JSONArray;
import org.json.JSONObject;
import android.text.TextUtils;
import O1.Q;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import java.util.Date;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Date A;
    public static final Date B;
    public static final Date C;
    @NotNull
    public static final Parcelable$Creator<a> CREATOR;
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
        z = new c(null);
        B = (A = new Date(Long.MAX_VALUE));
        C = new Date();
        D = h.q;
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.o = new Date(parcel.readLong());
        final ArrayList<Object> c = new ArrayList<Object>();
        parcel.readStringList((List)c);
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(c));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.p = unmodifiableSet;
        c.clear();
        parcel.readStringList((List)c);
        final Set<Object> unmodifiableSet2 = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(c));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.q = unmodifiableSet2;
        c.clear();
        parcel.readStringList((List)c);
        final Set<Object> unmodifiableSet3 = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(c));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.r = unmodifiableSet3;
        this.s = Q.k(parcel.readString(), "token");
        final String string = parcel.readString();
        h t;
        if (string != null) {
            t = h.valueOf(string);
        }
        else {
            t = a.D;
        }
        this.t = t;
        this.u = new Date(parcel.readLong());
        this.v = Q.k(parcel.readString(), "applicationId");
        this.w = Q.k(parcel.readString(), "userId");
        this.x = new Date(parcel.readLong());
        this.y = parcel.readString();
    }
    
    public a(String s, final String v, final String w, final Collection c, final Collection c2, final Collection c3, final h h, final Date date, final Date date2, Date b, final String s2) {
        Intrinsics.checkNotNullParameter(s, "accessToken");
        Intrinsics.checkNotNullParameter(v, "applicationId");
        Intrinsics.checkNotNullParameter(w, "userId");
        Q.g(s, "accessToken");
        Q.g(v, "applicationId");
        Q.g(w, "userId");
        Date b2 = date;
        if (date == null) {
            b2 = a.B;
        }
        this.o = b2;
        HashSet<Object> s3;
        if (c != null) {
            s3 = new HashSet<Object>(c);
        }
        else {
            s3 = new HashSet<Object>();
        }
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)s3);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.p = unmodifiableSet;
        HashSet<Object> s4;
        if (c2 != null) {
            s4 = new HashSet<Object>(c2);
        }
        else {
            s4 = new HashSet<Object>();
        }
        final Set<Object> unmodifiableSet2 = Collections.unmodifiableSet((Set<?>)s4);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.q = unmodifiableSet2;
        HashSet<Object> s5;
        if (c3 != null) {
            s5 = new HashSet<Object>(c3);
        }
        else {
            s5 = new HashSet<Object>();
        }
        final Set<Object> unmodifiableSet3 = Collections.unmodifiableSet((Set<?>)s5);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.r = unmodifiableSet3;
        this.s = s;
        h d = h;
        if (h == null) {
            d = a.D;
        }
        this.t = this.b(d, s2);
        Date c4;
        if ((c4 = date2) == null) {
            c4 = a.C;
        }
        this.u = c4;
        this.v = v;
        this.w = w;
        if (b == null || b.getTime() == 0L) {
            b = a.B;
        }
        this.x = b;
        s = s2;
        if (s2 == null) {
            s = "facebook";
        }
        this.y = s;
    }
    
    public final void a(final StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join((CharSequence)", ", (Iterable)this.p));
        sb.append("]");
    }
    
    public final h b(final h h, final String s) {
        h y = h;
        if (s != null) {
            y = h;
            if (s.equals("instagram")) {
                final int n = d.a[h.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        return h.z;
                    }
                    if (n != 3) {
                        return h;
                    }
                    return h.A;
                }
                else {
                    y = h.y;
                }
            }
        }
        return y;
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final Date o2 = this.o;
        final a a = (a)o;
        if (Intrinsics.a(o2, a.o) && Intrinsics.a(this.p, a.p) && Intrinsics.a(this.q, a.q) && Intrinsics.a(this.r, a.r) && Intrinsics.a(this.s, a.s) && this.t == a.t && Intrinsics.a(this.u, a.u) && Intrinsics.a(this.v, a.v) && Intrinsics.a(this.w, a.w) && Intrinsics.a(this.x, a.x)) {
            final String y = this.y;
            final String y2 = a.y;
            if (y == null) {
                if (y2 == null) {
                    return true;
                }
            }
            else if (Intrinsics.a(y, y2)) {
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
    
    @Override
    public int hashCode() {
        final int hashCode = this.o.hashCode();
        final int hashCode2 = this.p.hashCode();
        final int hashCode3 = this.q.hashCode();
        final int hashCode4 = this.r.hashCode();
        final int hashCode5 = this.s.hashCode();
        final int hashCode6 = this.t.hashCode();
        final int hashCode7 = this.u.hashCode();
        final int hashCode8 = this.v.hashCode();
        final int hashCode9 = this.w.hashCode();
        final int hashCode10 = this.x.hashCode();
        final String y = this.y;
        int hashCode11;
        if (y == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = y.hashCode();
        }
        return ((((((((((527 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11;
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
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("version", 1);
        jsonObject.put("token", (Object)this.s);
        jsonObject.put("expires_at", this.o.getTime());
        jsonObject.put("permissions", (Object)new JSONArray((Collection)this.p));
        jsonObject.put("declined_permissions", (Object)new JSONArray((Collection)this.q));
        jsonObject.put("expired_permissions", (Object)new JSONArray((Collection)this.r));
        jsonObject.put("last_refresh", this.u.getTime());
        jsonObject.put("source", (Object)this.t.name());
        jsonObject.put("application_id", (Object)this.v);
        jsonObject.put("user_id", (Object)this.w);
        jsonObject.put("data_access_expiration_time", this.x.getTime());
        final String y = this.y;
        if (y != null) {
            jsonObject.put("graph_domain", (Object)y);
        }
        return jsonObject;
    }
    
    public final String p() {
        final B a = x1.B.a;
        if (x1.B.H(N.p)) {
            return this.s;
        }
        return "ACCESS_TOKEN_REMOVED";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(this.p());
        this.a(sb);
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.o.getTime());
        parcel.writeStringList((List)new ArrayList(this.p));
        parcel.writeStringList((List)new ArrayList(this.q));
        parcel.writeStringList((List)new ArrayList(this.r));
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeLong(this.u.getTime());
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeLong(this.x.getTime());
        parcel.writeString(this.y);
    }
    
    public interface a
    {
        void a(final x1.a p0);
        
        void b(final o p0);
    }
    
    public static final class c
    {
        public final a a(final a a) {
            Intrinsics.checkNotNullParameter(a, "current");
            return new a(a.l(), a.c(), a.m(), a.j(), a.e(), a.f(), a.k(), new Date(), new Date(), a.d(), null, 1024, null);
        }
        
        public final a b(final JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") <= 1) {
                final String string = jsonObject.getString("token");
                final Date date = new Date(jsonObject.getLong("expires_at"));
                final JSONArray jsonArray = jsonObject.getJSONArray("permissions");
                final JSONArray jsonArray2 = jsonObject.getJSONArray("declined_permissions");
                final JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
                final Date date2 = new Date(jsonObject.getLong("last_refresh"));
                final String string2 = jsonObject.getString("source");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(SOURCE_KEY)");
                final h value = h.valueOf(string2);
                final String string3 = jsonObject.getString("application_id");
                final String string4 = jsonObject.getString("user_id");
                final Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
                final String optString = jsonObject.optString("graph_domain", (String)null);
                Intrinsics.checkNotNullExpressionValue(string, "token");
                Intrinsics.checkNotNullExpressionValue(string3, "applicationId");
                Intrinsics.checkNotNullExpressionValue(string4, "userId");
                final P a = P.a;
                Intrinsics.checkNotNullExpressionValue(jsonArray, "permissionsArray");
                final List list = P.g0(jsonArray);
                Intrinsics.checkNotNullExpressionValue(jsonArray2, "declinedPermissionsArray");
                final List list2 = P.g0(jsonArray2);
                List g0;
                if (optJSONArray == null) {
                    g0 = new ArrayList();
                }
                else {
                    g0 = P.g0(optJSONArray);
                }
                return new a(string, string3, string4, list, list2, g0, value, date, date2, date3, optString);
            }
            throw new o("Unknown AccessToken serialization format.");
        }
        
        public final a c(final Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            final List f = this.f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            final List f2 = this.f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            final List f3 = this.f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            final M.a c = M.c;
            String s;
            if (P.c0(s = c.a(bundle))) {
                s = x1.B.m();
            }
            final String f4 = c.f(bundle);
            if (f4 == null) {
                return null;
            }
            final JSONObject f5 = P.f(f4);
            Label_0095: {
                if (f5 == null) {
                    final String string = null;
                    break Label_0095;
                }
                try {
                    final String string = f5.getString("id");
                    if (s == null) {
                        return null;
                    }
                    if (string == null) {
                        return null;
                    }
                    return new a(f4, s, string, f, f2, f3, c.e(bundle), c.c(bundle), c.d(bundle), null, null, 1024, null);
                }
                catch (JSONException ex) {
                    return null;
                }
            }
        }
        
        public final void d() {
            final a i = x1.g.f.e().i();
            if (i != null) {
                this.h(this.a(i));
            }
        }
        
        public final a e() {
            return x1.g.f.e().i();
        }
        
        public final List f(final Bundle bundle, final String s) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            final ArrayList stringArrayList = bundle.getStringArrayList(s);
            if (stringArrayList == null) {
                return m.f();
            }
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)new ArrayList<Object>(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }
        
        public final boolean g() {
            final a i = x1.g.f.e().i();
            return i != null && !i.n();
        }
        
        public final void h(final a a) {
            x1.g.f.e().r(a);
        }
    }
}
