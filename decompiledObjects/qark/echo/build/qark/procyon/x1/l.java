// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import org.json.JSONException;
import org.json.JSONObject;
import kotlin.text.b;
import android.util.Base64;
import O1.Q;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class l implements Parcelable
{
    @NotNull
    public static final Parcelable$Creator<l> CREATOR;
    public static final b r;
    public final String o;
    public final String p;
    public final String q;
    
    static {
        r = new b(null);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public l a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new l(parcel);
            }
            
            public l[] b(final int n) {
                return new l[n];
            }
        };
    }
    
    public l(final Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.o = Q.k(parcel.readString(), "alg");
        this.p = Q.k(parcel.readString(), "typ");
        this.q = Q.k(parcel.readString(), "kid");
    }
    
    public l(String string) {
        Intrinsics.checkNotNullParameter(string, "encodedHeaderString");
        if (this.b(string)) {
            final byte[] decode = Base64.decode(string, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decodedBytes");
            final JSONObject jsonObject = new JSONObject(new String(decode, kotlin.text.b.b));
            final String string2 = jsonObject.getString("alg");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"alg\")");
            this.o = string2;
            final String string3 = jsonObject.getString("typ");
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"typ\")");
            this.p = string3;
            string = jsonObject.getString("kid");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"kid\")");
            this.q = string;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }
    
    public final String a() {
        return this.q;
    }
    
    public final boolean b(String optString) {
    Label_0112_Outer:
        while (true) {
            Q.g(optString, "encodedHeaderString");
            final boolean b = false;
            final byte[] decode = Base64.decode(optString, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decodedBytes");
            optString = new String(decode, kotlin.text.b.b);
            while (true) {
            Label_0186:
                while (true) {
                    try {
                        final JSONObject jsonObject = new JSONObject(optString);
                        final String optString2 = jsonObject.optString("alg");
                        Intrinsics.checkNotNullExpressionValue(optString2, "alg");
                        if (optString2.length() > 0 && Intrinsics.a(optString2, "RS256")) {
                            final int n = 1;
                            final String optString3 = jsonObject.optString("kid");
                            Intrinsics.checkNotNullExpressionValue(optString3, "jsonObj.optString(\"kid\")");
                            if (optString3.length() > 0) {
                                final int n2 = 1;
                                optString = jsonObject.optString("typ");
                                Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"typ\")");
                                final boolean b2 = optString.length() > 0;
                                boolean b3 = b;
                                if (n != 0) {
                                    b3 = b;
                                    if (n2 != 0) {
                                        b3 = b;
                                        if (b2) {
                                            b3 = true;
                                        }
                                    }
                                }
                                return b3;
                            }
                            break Label_0186;
                        }
                    }
                    catch (JSONException ex) {
                        return false;
                    }
                    final int n = 0;
                    continue Label_0112_Outer;
                }
                final int n2 = 0;
                continue;
            }
        }
    }
    
    public final JSONObject c() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("alg", (Object)this.o);
        jsonObject.put("typ", (Object)this.p);
        jsonObject.put("kid", (Object)this.q);
        return jsonObject;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final String o2 = this.o;
        final l l = (l)o;
        return Intrinsics.a(o2, l.o) && Intrinsics.a(this.p, l.p) && Intrinsics.a(this.q, l.q);
    }
    
    @Override
    public int hashCode() {
        return ((527 + this.o.hashCode()) * 31 + this.p.hashCode()) * 31 + this.q.hashCode();
    }
    
    @Override
    public String toString() {
        final String string = this.c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "headerJsonObject.toString()");
        return string;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }
    
    public static final class b
    {
    }
}
