package x1;

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
import x1.M;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2148a implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    public static final Date f21010A;

    /* renamed from: B, reason: collision with root package name */
    public static final Date f21011B;

    /* renamed from: C, reason: collision with root package name */
    public static final Date f21012C;

    @NotNull
    public static final Parcelable.Creator<C2148a> CREATOR;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC2155h f21013D;

    /* renamed from: z, reason: collision with root package name */
    public static final c f21014z = new c(null);

    /* renamed from: o, reason: collision with root package name */
    public final Date f21015o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f21016p;

    /* renamed from: q, reason: collision with root package name */
    public final Set f21017q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f21018r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21019s;

    /* renamed from: t, reason: collision with root package name */
    public final EnumC2155h f21020t;

    /* renamed from: u, reason: collision with root package name */
    public final Date f21021u;

    /* renamed from: v, reason: collision with root package name */
    public final String f21022v;

    /* renamed from: w, reason: collision with root package name */
    public final String f21023w;

    /* renamed from: x, reason: collision with root package name */
    public final Date f21024x;

    /* renamed from: y, reason: collision with root package name */
    public final String f21025y;

    /* renamed from: x1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0294a {
        void a(C2148a c2148a);

        void b(C2162o c2162o);
    }

    /* renamed from: x1.a$b */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2148a createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C2148a(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2148a[] newArray(int i7) {
            return new C2148a[i7];
        }
    }

    /* renamed from: x1.a$c */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C2148a a(C2148a current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new C2148a(current.l(), current.c(), current.m(), current.j(), current.e(), current.f(), current.k(), new Date(), new Date(), current.d(), null, 1024, null);
        }

        public final C2148a b(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new C2162o("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            EnumC2155h valueOf = EnumC2155h.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            O1.P p7 = O1.P.f3756a;
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List g02 = O1.P.g0(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new C2148a(token, applicationId, userId, g02, O1.P.g0(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : O1.P.g0(optJSONArray), valueOf, date, date2, date3, optString);
        }

        public final C2148a c(Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List f7 = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List f8 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List f9 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            M.a aVar = M.f20948c;
            String a7 = aVar.a(bundle);
            if (O1.P.c0(a7)) {
                a7 = C2146B.m();
            }
            String str = a7;
            String f10 = aVar.f(bundle);
            if (f10 == null) {
                return null;
            }
            JSONObject f11 = O1.P.f(f10);
            if (f11 == null) {
                string = null;
            } else {
                try {
                    string = f11.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new C2148a(f10, str, string, f7, f8, f9, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, 1024, null);
        }

        public final void d() {
            C2148a i7 = C2154g.f21044f.e().i();
            if (i7 != null) {
                h(a(i7));
            }
        }

        public final C2148a e() {
            return C2154g.f21044f.e().i();
        }

        public final List f(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return W5.o.f();
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            C2148a i7 = C2154g.f21044f.e().i();
            return (i7 == null || i7.n()) ? false : true;
        }

        public final void h(C2148a c2148a) {
            C2154g.f21044f.e().r(c2148a);
        }
    }

    /* renamed from: x1.a$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21026a;

        static {
            int[] iArr = new int[EnumC2155h.valuesCustom().length];
            iArr[EnumC2155h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC2155h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[EnumC2155h.WEB_VIEW.ordinal()] = 3;
            f21026a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f21010A = date;
        f21011B = date;
        f21012C = new Date();
        f21013D = EnumC2155h.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public C2148a(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f21015o = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f21016p = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f21017q = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f21018r = unmodifiableSet3;
        this.f21019s = O1.Q.k(parcel.readString(), "token");
        String readString = parcel.readString();
        this.f21020t = readString != null ? EnumC2155h.valueOf(readString) : f21013D;
        this.f21021u = new Date(parcel.readLong());
        this.f21022v = O1.Q.k(parcel.readString(), "applicationId");
        this.f21023w = O1.Q.k(parcel.readString(), "userId");
        this.f21024x = new Date(parcel.readLong());
        this.f21025y = parcel.readString();
    }

    public final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f21016p));
        sb.append("]");
    }

    public final EnumC2155h b(EnumC2155h enumC2155h, String str) {
        if (str == null || !str.equals("instagram")) {
            return enumC2155h;
        }
        int i7 = d.f21026a[enumC2155h.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? enumC2155h : EnumC2155h.INSTAGRAM_WEB_VIEW : EnumC2155h.INSTAGRAM_CUSTOM_CHROME_TAB : EnumC2155h.INSTAGRAM_APPLICATION_WEB;
    }

    public final String c() {
        return this.f21022v;
    }

    public final Date d() {
        return this.f21024x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set e() {
        return this.f21017q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2148a)) {
            return false;
        }
        C2148a c2148a = (C2148a) obj;
        if (Intrinsics.a(this.f21015o, c2148a.f21015o) && Intrinsics.a(this.f21016p, c2148a.f21016p) && Intrinsics.a(this.f21017q, c2148a.f21017q) && Intrinsics.a(this.f21018r, c2148a.f21018r) && Intrinsics.a(this.f21019s, c2148a.f21019s) && this.f21020t == c2148a.f21020t && Intrinsics.a(this.f21021u, c2148a.f21021u) && Intrinsics.a(this.f21022v, c2148a.f21022v) && Intrinsics.a(this.f21023w, c2148a.f21023w) && Intrinsics.a(this.f21024x, c2148a.f21024x)) {
            String str = this.f21025y;
            String str2 = c2148a.f21025y;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (Intrinsics.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.f21018r;
    }

    public final Date g() {
        return this.f21015o;
    }

    public final String h() {
        return this.f21025y;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f21015o.hashCode()) * 31) + this.f21016p.hashCode()) * 31) + this.f21017q.hashCode()) * 31) + this.f21018r.hashCode()) * 31) + this.f21019s.hashCode()) * 31) + this.f21020t.hashCode()) * 31) + this.f21021u.hashCode()) * 31) + this.f21022v.hashCode()) * 31) + this.f21023w.hashCode()) * 31) + this.f21024x.hashCode()) * 31;
        String str = this.f21025y;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Date i() {
        return this.f21021u;
    }

    public final Set j() {
        return this.f21016p;
    }

    public final EnumC2155h k() {
        return this.f21020t;
    }

    public final String l() {
        return this.f21019s;
    }

    public final String m() {
        return this.f21023w;
    }

    public final boolean n() {
        return new Date().after(this.f21015o);
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f21019s);
        jSONObject.put("expires_at", this.f21015o.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f21016p));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f21017q));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f21018r));
        jSONObject.put("last_refresh", this.f21021u.getTime());
        jSONObject.put("source", this.f21020t.name());
        jSONObject.put("application_id", this.f21022v);
        jSONObject.put("user_id", this.f21023w);
        jSONObject.put("data_access_expiration_time", this.f21024x.getTime());
        String str = this.f21025y;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final String p() {
        C2146B c2146b = C2146B.f20862a;
        return C2146B.H(N.INCLUDE_ACCESS_TOKENS) ? this.f21019s : "ACCESS_TOKEN_REMOVED";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(p());
        a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f21015o.getTime());
        dest.writeStringList(new ArrayList(this.f21016p));
        dest.writeStringList(new ArrayList(this.f21017q));
        dest.writeStringList(new ArrayList(this.f21018r));
        dest.writeString(this.f21019s);
        dest.writeString(this.f21020t.name());
        dest.writeLong(this.f21021u.getTime());
        dest.writeString(this.f21022v);
        dest.writeString(this.f21023w);
        dest.writeLong(this.f21024x.getTime());
        dest.writeString(this.f21025y);
    }

    public C2148a(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, EnumC2155h enumC2155h, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        O1.Q.g(accessToken, "accessToken");
        O1.Q.g(applicationId, "applicationId");
        O1.Q.g(userId, "userId");
        this.f21015o = date == null ? f21011B : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f21016p = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f21017q = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f21018r = unmodifiableSet3;
        this.f21019s = accessToken;
        this.f21020t = b(enumC2155h == null ? f21013D : enumC2155h, str);
        this.f21021u = date2 == null ? f21012C : date2;
        this.f21022v = applicationId;
        this.f21023w = userId;
        this.f21024x = (date3 == null || date3.getTime() == 0) ? f21011B : date3;
        this.f21025y = str == null ? "facebook" : str;
    }

    public /* synthetic */ C2148a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2155h enumC2155h, Date date, Date date2, Date date3, String str4, int i7, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, collection, collection2, collection3, enumC2155h, date, date2, date3, (i7 & 1024) != 0 ? "facebook" : str4);
    }
}
