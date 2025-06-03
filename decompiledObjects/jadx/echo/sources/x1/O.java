package x1;

import O1.P;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2148a;

/* loaded from: classes.dex */
public final class O implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    public final String f20963o;

    /* renamed from: p, reason: collision with root package name */
    public final String f20964p;

    /* renamed from: q, reason: collision with root package name */
    public final String f20965q;

    /* renamed from: r, reason: collision with root package name */
    public final String f20966r;

    /* renamed from: s, reason: collision with root package name */
    public final String f20967s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f20968t;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f20969u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f20961v = new b(null);

    /* renamed from: w, reason: collision with root package name */
    public static final String f20962w = O.class.getSimpleName();

    @NotNull
    public static final Parcelable.Creator<O> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public O createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new O(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public O[] newArray(int i7) {
            return new O[i7];
        }
    }

    public static final class b {

        public static final class a implements P.a {
            @Override // O1.P.a
            public void a(JSONObject jSONObject) {
                String optString = jSONObject == null ? null : jSONObject.optString("id");
                if (optString == null) {
                    Log.w(O.f20962w, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                O.f20961v.c(new O(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
            }

            @Override // O1.P.a
            public void b(C2162o c2162o) {
                Log.e(O.f20962w, Intrinsics.i("Got unexpected exception: ", c2162o));
            }
        }

        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            C2148a.c cVar = C2148a.f21014z;
            C2148a e7 = cVar.e();
            if (e7 == null) {
                return;
            }
            if (!cVar.g()) {
                c(null);
            } else {
                O1.P p7 = O1.P.f3756a;
                O1.P.G(e7.l(), new a());
            }
        }

        public final O b() {
            return Q.f20972d.a().c();
        }

        public final void c(O o7) {
            Q.f20972d.a().f(o7);
        }
    }

    public O(Parcel parcel) {
        this.f20963o = parcel.readString();
        this.f20964p = parcel.readString();
        this.f20965q = parcel.readString();
        this.f20966r = parcel.readString();
        this.f20967s = parcel.readString();
        String readString = parcel.readString();
        this.f20968t = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f20969u = readString2 != null ? Uri.parse(readString2) : null;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f20963o);
            jSONObject.put("first_name", this.f20964p);
            jSONObject.put("middle_name", this.f20965q);
            jSONObject.put("last_name", this.f20966r);
            jSONObject.put("name", this.f20967s);
            Uri uri = this.f20968t;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f20969u;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        String str5 = this.f20963o;
        return ((str5 == null && ((O) obj).f20963o == null) || Intrinsics.a(str5, ((O) obj).f20963o)) && (((str = this.f20964p) == null && ((O) obj).f20964p == null) || Intrinsics.a(str, ((O) obj).f20964p)) && ((((str2 = this.f20965q) == null && ((O) obj).f20965q == null) || Intrinsics.a(str2, ((O) obj).f20965q)) && ((((str3 = this.f20966r) == null && ((O) obj).f20966r == null) || Intrinsics.a(str3, ((O) obj).f20966r)) && ((((str4 = this.f20967s) == null && ((O) obj).f20967s == null) || Intrinsics.a(str4, ((O) obj).f20967s)) && ((((uri = this.f20968t) == null && ((O) obj).f20968t == null) || Intrinsics.a(uri, ((O) obj).f20968t)) && (((uri2 = this.f20969u) == null && ((O) obj).f20969u == null) || Intrinsics.a(uri2, ((O) obj).f20969u))))));
    }

    public int hashCode() {
        String str = this.f20963o;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f20964p;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f20965q;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f20966r;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f20967s;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f20968t;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f20969u;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f20963o);
        dest.writeString(this.f20964p);
        dest.writeString(this.f20965q);
        dest.writeString(this.f20966r);
        dest.writeString(this.f20967s);
        Uri uri = this.f20968t;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f20969u;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public /* synthetic */ O(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public O(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        O1.Q.k(str, "id");
        this.f20963o = str;
        this.f20964p = str2;
        this.f20965q = str3;
        this.f20966r = str4;
        this.f20967s = str5;
        this.f20968t = uri;
        this.f20969u = uri2;
    }

    public O(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f20963o = jsonObject.optString("id", null);
        this.f20964p = jsonObject.optString("first_name", null);
        this.f20965q = jsonObject.optString("middle_name", null);
        this.f20966r = jsonObject.optString("last_name", null);
        this.f20967s = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f20968t = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f20969u = optString2 != null ? Uri.parse(optString2) : null;
    }
}
