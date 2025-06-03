/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R0;

import W2.c;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.M;

public class b
implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final String o;
    public final String p;

    public b(Parcel parcel) {
        this.o = (String)M.i(parcel.readString());
        this.p = (String)M.i(parcel.readString());
    }

    public b(String string2, String string3) {
        this.o = c.f(string2);
        this.p = string3;
    }

    @Override
    public void D(w.b b8) {
        String string2 = this.o;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1939198791: {
                if (!string2.equals((Object)"ARTIST")) break;
                n9 = 4;
                break;
            }
            case 1746739798: {
                if (!string2.equals((Object)"ALBUMARTIST")) break;
                n9 = 3;
                break;
            }
            case 428414940: {
                if (!string2.equals((Object)"DESCRIPTION")) break;
                n9 = 2;
                break;
            }
            case 79833656: {
                if (!string2.equals((Object)"TITLE")) break;
                n9 = 1;
                break;
            }
            case 62359119: {
                if (!string2.equals((Object)"ALBUM")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return;
            }
            case 4: {
                b8.P(this.p);
                return;
            }
            case 3: {
                b8.N(this.p);
                return;
            }
            case 2: {
                b8.V(this.p);
                return;
            }
            case 1: {
                b8.n0(this.p);
                return;
            }
            case 0: 
        }
        b8.O(this.p);
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
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (b)object;
            if (this.o.equals((Object)object.o) && this.p.equals((Object)object.p)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.o.hashCode()) * 31 + this.p.hashCode();
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VC: ");
        stringBuilder.append(this.o);
        stringBuilder.append("=");
        stringBuilder.append(this.p);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
    }

}

