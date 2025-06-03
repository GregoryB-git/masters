/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<l> CREATOR;
    public static final b r;
    public final String o;
    public final String p;
    public final String q;

    static {
        r = new b(null);
        CREATOR = new Parcelable.Creator(){

            public l a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new l(parcel);
            }

            public l[] b(int n8) {
                return new l[n8];
            }
        };
    }

    public l(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        this.o = Q.k(parcel.readString(), "alg");
        this.p = Q.k(parcel.readString(), "typ");
        this.q = Q.k(parcel.readString(), "kid");
    }

    public l(String object) {
        Intrinsics.checkNotNullParameter(object, "encodedHeaderString");
        if (this.b((String)object)) {
            object = Base64.decode((String)object, (int)0);
            Intrinsics.checkNotNullExpressionValue(object, "decodedBytes");
            object = new JSONObject(new String((byte[])object, kotlin.text.b.b));
            String string2 = object.getString("alg");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"alg\")");
            this.o = string2;
            string2 = object.getString("typ");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
            this.p = string2;
            object = object.getString("kid");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.getString(\"kid\")");
            this.q = object;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    public final String a() {
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(String object) {
        Q.g((String)object, "encodedHeaderString");
        boolean bl = false;
        object = Base64.decode((String)object, (int)0);
        Intrinsics.checkNotNullExpressionValue(object, "decodedBytes");
        object = new String((byte[])object, kotlin.text.b.b);
        try {
            object = new JSONObject((String)object);
            String string2 = object.optString("alg");
            Intrinsics.checkNotNullExpressionValue(string2, "alg");
            boolean bl2 = string2.length() > 0 && Intrinsics.a(string2, "RS256");
            string2 = object.optString("kid");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.optString(\"kid\")");
            boolean bl3 = string2.length() > 0;
            object = object.optString("typ");
            Intrinsics.checkNotNullExpressionValue(object, "jsonObj.optString(\"typ\")");
            int n8 = object.length();
            n8 = n8 > 0 ? 1 : 0;
            boolean bl4 = bl;
            if (!bl2) return bl4;
            bl4 = bl;
            if (!bl3) return bl4;
            bl4 = bl;
            if (n8 == 0) return bl4;
            return true;
        }
        catch (JSONException jSONException) {
            return false;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", (Object)this.o);
        jSONObject.put("typ", (Object)this.p);
        jSONObject.put("kid", (Object)this.q);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        String string2 = this.o;
        object = (l)object;
        if (Intrinsics.a(string2, object.o) && Intrinsics.a(this.p, object.p) && Intrinsics.a(this.q, object.q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.o.hashCode()) * 31 + this.p.hashCode()) * 31 + this.q.hashCode();
    }

    public String toString() {
        String string2 = this.c().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "headerJsonObject.toString()");
        return string2;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

}

