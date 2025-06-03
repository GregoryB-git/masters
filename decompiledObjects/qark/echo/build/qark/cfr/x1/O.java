/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.P;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.Q;
import x1.a;
import x1.o;

public final class O
implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<O> CREATOR;
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
        CREATOR = new Parcelable.Creator(){

            public O a(Parcel parcel) {
                Intrinsics.checkNotNullParameter((Object)parcel, "source");
                return new O(parcel, null);
            }

            public O[] b(int n8) {
                return new O[n8];
            }
        };
    }

    public O(Parcel object) {
        this.o = object.readString();
        this.p = object.readString();
        this.q = object.readString();
        this.r = object.readString();
        this.s = object.readString();
        String string2 = object.readString();
        Object var3_3 = null;
        string2 = string2 == null ? null : Uri.parse((String)string2);
        this.t = string2;
        object = object.readString();
        object = object == null ? var3_3 : Uri.parse((String)object);
        this.u = object;
    }

    public /* synthetic */ O(Parcel parcel, g g8) {
        this(parcel);
    }

    public O(String string2, String string3, String string4, String string5, String string6, Uri uri, Uri uri2) {
        O1.Q.k(string2, "id");
        this.o = string2;
        this.p = string3;
        this.q = string4;
        this.r = string5;
        this.s = string6;
        this.t = uri;
        this.u = uri2;
    }

    public O(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        Object var3_2 = null;
        this.o = object.optString("id", null);
        this.p = object.optString("first_name", null);
        this.q = object.optString("middle_name", null);
        this.r = object.optString("last_name", null);
        this.s = object.optString("name", null);
        String string2 = object.optString("link_uri", null);
        string2 = string2 == null ? null : Uri.parse((String)string2);
        this.t = string2;
        object = object.optString("picture_uri", null);
        object = object == null ? var3_2 : Uri.parse((String)object);
        this.u = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", (Object)this.o);
            jSONObject.put("first_name", (Object)this.p);
            jSONObject.put("middle_name", (Object)this.q);
            jSONObject.put("last_name", (Object)this.r);
            jSONObject.put("name", (Object)this.s);
            Uri uri = this.t;
            if (uri != null) {
                jSONObject.put("link_uri", (Object)uri.toString());
            }
            if ((uri = this.u) == null) return jSONObject;
            jSONObject.put("picture_uri", (Object)uri.toString());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof O)) {
            return false;
        }
        String string2 = this.o;
        if (string2 != null || ((O)object).o != null) {
            if (!Intrinsics.a(string2, ((O)object).o)) return false;
        }
        if ((string2 = this.p) != null || ((O)object).p != null) {
            if (!Intrinsics.a(string2, ((O)object).p)) return false;
        }
        if ((string2 = this.q) != null || ((O)object).q != null) {
            if (!Intrinsics.a(string2, ((O)object).q)) return false;
        }
        if ((string2 = this.r) != null || ((O)object).r != null) {
            if (!Intrinsics.a(string2, ((O)object).r)) return false;
        }
        if ((string2 = this.s) != null || ((O)object).s != null) {
            if (!Intrinsics.a(string2, ((O)object).s)) return false;
        }
        if ((string2 = this.t) != null || ((O)object).t != null) {
            if (!Intrinsics.a(string2, (Object)((O)object).t)) return false;
        }
        if ((string2 = this.u) == null) {
            if (((O)object).u == null) return bl;
        }
        if (!Intrinsics.a(string2, (Object)((O)object).u)) return false;
        return true;
    }

    public int hashCode() {
        String string2 = this.o;
        int n8 = string2 != null ? string2.hashCode() : 0;
        int n9 = 527 + n8;
        string2 = this.p;
        n8 = n9;
        if (string2 != null) {
            n8 = n9 * 31 + string2.hashCode();
        }
        string2 = this.q;
        n9 = n8;
        if (string2 != null) {
            n9 = n8 * 31 + string2.hashCode();
        }
        string2 = this.r;
        n8 = n9;
        if (string2 != null) {
            n8 = n9 * 31 + string2.hashCode();
        }
        string2 = this.s;
        n9 = n8;
        if (string2 != null) {
            n9 = n8 * 31 + string2.hashCode();
        }
        string2 = this.t;
        n8 = n9;
        if (string2 != null) {
            n8 = n9 * 31 + string2.hashCode();
        }
        string2 = this.u;
        n9 = n8;
        if (string2 != null) {
            n9 = n8 * 31 + string2.hashCode();
        }
        return n9;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        Intrinsics.checkNotNullParameter((Object)parcel, "dest");
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        Object object = this.t;
        Object var4_4 = null;
        object = object == null ? null : object.toString();
        parcel.writeString((String)object);
        object = this.u;
        object = object == null ? var4_4 : object.toString();
        parcel.writeString((String)object);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final void a() {
            Object object = a.z;
            a a8 = object.e();
            if (a8 == null) {
                return;
            }
            if (!object.g()) {
                this.c(null);
                return;
            }
            object = P.a;
            P.G(a8.l(), new P.a(){

                @Override
                public void a(JSONObject object) {
                    Uri uri = null;
                    String string2 = object == null ? null : object.optString("id");
                    if (string2 == null) {
                        Log.w((String)w, (String)"No user ID returned on Me request");
                        return;
                    }
                    String string3 = object.optString("link");
                    String string4 = object.optString("profile_picture", null);
                    String string5 = object.optString("first_name");
                    String string6 = object.optString("middle_name");
                    String string7 = object.optString("last_name");
                    String string8 = object.optString("name");
                    object = string3 != null ? Uri.parse((String)string3) : null;
                    if (string4 != null) {
                        uri = Uri.parse((String)string4);
                    }
                    object = new O(string2, string5, string6, string7, string8, (Uri)object, uri);
                    O.v.c((O)object);
                }

                @Override
                public void b(o o8) {
                    Log.e((String)w, (String)Intrinsics.i("Got unexpected exception: ", (Object)o8));
                }
            });
        }

        public final O b() {
            return Q.d.a().c();
        }

        public final void c(O o8) {
            Q.d.a().f(o8);
        }

    }

}

