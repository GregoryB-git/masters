// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.util.Log;
import O1.P;
import org.json.JSONException;
import org.json.JSONObject;
import O1.Q;
import kotlin.jvm.internal.Intrinsics;
import android.os.Parcel;
import kotlin.jvm.internal.g;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class O implements Parcelable
{
    @NotNull
    public static final Parcelable$Creator<O> CREATOR;
    public static final b v;
    public static final String w;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final Uri t;
    public final Uri u;
    
    static {
        v = new b(null);
        w = O.class.getSimpleName();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public O a(final Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "source");
                return new O(parcel, null);
            }
            
            public O[] b(final int n) {
                return new O[n];
            }
        };
    }
    
    public O(final Parcel parcel) {
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        final String string = parcel.readString();
        final Uri uri = null;
        Uri parse;
        if (string == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(string);
        }
        this.t = parse;
        final String string2 = parcel.readString();
        Uri parse2;
        if (string2 == null) {
            parse2 = uri;
        }
        else {
            parse2 = Uri.parse(string2);
        }
        this.u = parse2;
    }
    
    public O(final String o, final String p7, final String q, final String r, final String s, final Uri t, final Uri u) {
        Q.k(o, "id");
        this.o = o;
        this.p = p7;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public O(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        final Uri uri = null;
        this.o = jsonObject.optString("id", (String)null);
        this.p = jsonObject.optString("first_name", (String)null);
        this.q = jsonObject.optString("middle_name", (String)null);
        this.r = jsonObject.optString("last_name", (String)null);
        this.s = jsonObject.optString("name", (String)null);
        final String optString = jsonObject.optString("link_uri", (String)null);
        Uri parse;
        if (optString == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(optString);
        }
        this.t = parse;
        final String optString2 = jsonObject.optString("picture_uri", (String)null);
        Uri parse2;
        if (optString2 == null) {
            parse2 = uri;
        }
        else {
            parse2 = Uri.parse(optString2);
        }
        this.u = parse2;
    }
    
    public static final /* synthetic */ String a() {
        return O.w;
    }
    
    public final JSONObject b() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", (Object)this.o);
            jsonObject.put("first_name", (Object)this.p);
            jsonObject.put("middle_name", (Object)this.q);
            jsonObject.put("last_name", (Object)this.r);
            jsonObject.put("name", (Object)this.s);
            final Uri t = this.t;
            if (t != null) {
                jsonObject.put("link_uri", (Object)t.toString());
            }
            final Uri u = this.u;
            if (u != null) {
                jsonObject.put("picture_uri", (Object)u.toString());
            }
            return jsonObject;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof O)) {
            return false;
        }
        final String o2 = this.o;
        if ((o2 == null && ((O)o).o == null) || Intrinsics.a(o2, ((O)o).o)) {
            final String p = this.p;
            if ((p == null && ((O)o).p == null) || Intrinsics.a(p, ((O)o).p)) {
                final String q = this.q;
                if ((q == null && ((O)o).q == null) || Intrinsics.a(q, ((O)o).q)) {
                    final String r = this.r;
                    if ((r == null && ((O)o).r == null) || Intrinsics.a(r, ((O)o).r)) {
                        final String s = this.s;
                        if ((s == null && ((O)o).s == null) || Intrinsics.a(s, ((O)o).s)) {
                            final Uri t = this.t;
                            if ((t == null && ((O)o).t == null) || Intrinsics.a(t, ((O)o).t)) {
                                final Uri u = this.u;
                                if (u == null && ((O)o).u == null) {
                                    return b;
                                }
                                if (Intrinsics.a(u, ((O)o).u)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public int hashCode() {
        final String o = this.o;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = 527 + hashCode;
        final String p = this.p;
        int n2 = n;
        if (p != null) {
            n2 = n * 31 + p.hashCode();
        }
        final String q = this.q;
        int n3 = n2;
        if (q != null) {
            n3 = n2 * 31 + q.hashCode();
        }
        final String r = this.r;
        int n4 = n3;
        if (r != null) {
            n4 = n3 * 31 + r.hashCode();
        }
        final String s = this.s;
        int n5 = n4;
        if (s != null) {
            n5 = n4 * 31 + s.hashCode();
        }
        final Uri t = this.t;
        int n6 = n5;
        if (t != null) {
            n6 = n5 * 31 + t.hashCode();
        }
        final Uri u = this.u;
        int n7 = n6;
        if (u != null) {
            n7 = n6 * 31 + u.hashCode();
        }
        return n7;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        final Uri t = this.t;
        final String s = null;
        String string;
        if (t == null) {
            string = null;
        }
        else {
            string = t.toString();
        }
        parcel.writeString(string);
        final Uri u = this.u;
        String string2;
        if (u == null) {
            string2 = s;
        }
        else {
            string2 = u.toString();
        }
        parcel.writeString(string2);
    }
    
    public static final class b
    {
        public final void a() {
            final a.c z = a.z;
            final a e = z.e();
            if (e == null) {
                return;
            }
            if (!z.g()) {
                this.c(null);
                return;
            }
            final P a = P.a;
            P.G(e.l(), (P.a)new P.a() {
                @Override
                public void a(final JSONObject jsonObject) {
                    Uri parse = null;
                    String optString;
                    if (jsonObject == null) {
                        optString = null;
                    }
                    else {
                        optString = jsonObject.optString("id");
                    }
                    if (optString == null) {
                        Log.w(O.a(), "No user ID returned on Me request");
                        return;
                    }
                    final String optString2 = jsonObject.optString("link");
                    final String optString3 = jsonObject.optString("profile_picture", (String)null);
                    final String optString4 = jsonObject.optString("first_name");
                    final String optString5 = jsonObject.optString("middle_name");
                    final String optString6 = jsonObject.optString("last_name");
                    final String optString7 = jsonObject.optString("name");
                    Uri parse2;
                    if (optString2 != null) {
                        parse2 = Uri.parse(optString2);
                    }
                    else {
                        parse2 = null;
                    }
                    if (optString3 != null) {
                        parse = Uri.parse(optString3);
                    }
                    O.v.c(new O(optString, optString4, optString5, optString6, optString7, parse2, parse));
                }
                
                @Override
                public void b(final o o) {
                    Log.e(O.a(), Intrinsics.i("Got unexpected exception: ", o));
                }
            });
        }
        
        public final O b() {
            return x1.Q.d.a().c();
        }
        
        public final void c(final O o) {
            x1.Q.d.a().f(o);
        }
    }
}
