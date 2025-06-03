package x1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2159l implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    public final String f21102o;

    /* renamed from: p, reason: collision with root package name */
    public final String f21103p;

    /* renamed from: q, reason: collision with root package name */
    public final String f21104q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f21101r = new b(null);

    @NotNull
    public static final Parcelable.Creator<C2159l> CREATOR = new a();

    /* renamed from: x1.l$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2159l createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C2159l(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2159l[] newArray(int i7) {
            return new C2159l[i7];
        }
    }

    /* renamed from: x1.l$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2159l(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f21102o = O1.Q.k(parcel.readString(), "alg");
        this.f21103p = O1.Q.k(parcel.readString(), "typ");
        this.f21104q = O1.Q.k(parcel.readString(), "kid");
    }

    public final String a() {
        return this.f21104q;
    }

    public final boolean b(String str) {
        O1.Q.g(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, kotlin.text.b.f16240b));
            String alg = jSONObject.optString("alg");
            Intrinsics.checkNotNullExpressionValue(alg, "alg");
            boolean z7 = alg.length() > 0 && Intrinsics.a(alg, "RS256");
            String optString = jSONObject.optString("kid");
            Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"kid\")");
            boolean z8 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            Intrinsics.checkNotNullExpressionValue(optString2, "jsonObj.optString(\"typ\")");
            return z7 && z8 && (optString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f21102o);
        jSONObject.put("typ", this.f21103p);
        jSONObject.put("kid", this.f21104q);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2159l)) {
            return false;
        }
        C2159l c2159l = (C2159l) obj;
        return Intrinsics.a(this.f21102o, c2159l.f21102o) && Intrinsics.a(this.f21103p, c2159l.f21103p) && Intrinsics.a(this.f21104q, c2159l.f21104q);
    }

    public int hashCode() {
        return ((((527 + this.f21102o.hashCode()) * 31) + this.f21103p.hashCode()) * 31) + this.f21104q.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f21102o);
        dest.writeString(this.f21103p);
        dest.writeString(this.f21104q);
    }

    public C2159l(String encodedHeaderString) {
        Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        if (!b(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, kotlin.text.b.f16240b));
        String string = jSONObject.getString("alg");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
        this.f21102o = string;
        String string2 = jSONObject.getString("typ");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
        this.f21103p = string2;
        String string3 = jSONObject.getString("kid");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
        this.f21104q = string3;
    }
}
