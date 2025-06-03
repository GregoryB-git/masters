/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class t
implements x.b {
    public static final Parcelable.Creator<t> CREATOR = new Parcelable.Creator(){

        public t a(Parcel parcel) {
            return new t(parcel);
        }

        public t[] b(int n8) {
            return new t[n8];
        }
    };
    public final String o;
    public final String p;
    public final List q;

    public t(Parcel parcel) {
        this.o = parcel.readString();
        this.p = parcel.readString();
        int n8 = parcel.readInt();
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)((b)parcel.readParcelable(b.class.getClassLoader())));
        }
        this.q = Collections.unmodifiableList((List)arrayList);
    }

    public t(String string2, String string3, List list) {
        this.o = string2;
        this.p = string3;
        this.q = Collections.unmodifiableList((List)new ArrayList((Collection)list));
    }

    @Override
    public /* synthetic */ void D(w.b b8) {
        y.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (t.class != object.getClass()) {
                return false;
            }
            object = (t)object;
            if (TextUtils.equals((CharSequence)this.o, (CharSequence)object.o) && TextUtils.equals((CharSequence)this.p, (CharSequence)object.p) && this.q.equals((Object)object.q)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.o;
        int n8 = 0;
        int n9 = string2 != null ? string2.hashCode() : 0;
        string2 = this.p;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return (n9 * 31 + n8) * 31 + this.q.hashCode();
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HlsTrackMetadataEntry");
        if (this.o != null) {
            string2 = new StringBuilder();
            string2.append(" [");
            string2.append(this.o);
            string2.append(", ");
            string2.append(this.p);
            string2.append("]");
            string2 = string2.toString();
        } else {
            string2 = "";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        int n9 = this.q.size();
        parcel.writeInt(n9);
        for (n8 = 0; n8 < n9; ++n8) {
            parcel.writeParcelable((Parcelable)this.q.get(n8), 0);
        }
    }

    public static final class b
    implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };
        public final int o;
        public final int p;
        public final String q;
        public final String r;
        public final String s;
        public final String t;

        public b(int n8, int n9, String string2, String string3, String string4, String string5) {
            this.o = n8;
            this.p = n9;
            this.q = string2;
            this.r = string3;
            this.s = string4;
            this.t = string5;
        }

        public b(Parcel parcel) {
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readString();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (b.class != object.getClass()) {
                    return false;
                }
                object = (b)object;
                if (this.o == object.o && this.p == object.p && TextUtils.equals((CharSequence)this.q, (CharSequence)object.q) && TextUtils.equals((CharSequence)this.r, (CharSequence)object.r) && TextUtils.equals((CharSequence)this.s, (CharSequence)object.s) && TextUtils.equals((CharSequence)this.t, (CharSequence)object.t)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.o;
            int n9 = this.p;
            String string2 = this.q;
            int n10 = 0;
            int n11 = string2 != null ? string2.hashCode() : 0;
            string2 = this.r;
            int n12 = string2 != null ? string2.hashCode() : 0;
            string2 = this.s;
            int n13 = string2 != null ? string2.hashCode() : 0;
            string2 = this.t;
            if (string2 != null) {
                n10 = string2.hashCode();
            }
            return ((((n8 * 31 + n9) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n10;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeString(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
        }

    }

}

