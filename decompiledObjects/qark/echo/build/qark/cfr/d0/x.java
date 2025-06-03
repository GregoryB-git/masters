/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package d0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import g0.M;
import java.util.Arrays;
import java.util.List;

public final class x
implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new Parcelable.Creator(){

        public x a(Parcel parcel) {
            return new x(parcel);
        }

        public x[] b(int n8) {
            return new x[n8];
        }
    };
    public final b[] o;
    public final long p;

    public x(long l8, List list) {
        this(l8, (b[])list.toArray((Object[])new b[0]));
    }

    public /* varargs */ x(long l8, b ... arrb) {
        this.p = l8;
        this.o = arrb;
    }

    public x(Parcel parcel) {
        b[] arrb;
        this.o = new b[parcel.readInt()];
        for (int i8 = 0; i8 < (arrb = this.o).length; ++i8) {
            arrb[i8] = (b)parcel.readParcelable(b.class.getClassLoader());
        }
        this.p = parcel.readLong();
    }

    public x(List list) {
        this((b[])list.toArray((Object[])new b[0]));
    }

    public /* varargs */ x(b ... arrb) {
        this(-9223372036854775807L, arrb);
    }

    public /* varargs */ x a(b ... arrb) {
        if (arrb.length == 0) {
            return this;
        }
        return new x(this.p, (b[])M.N0(this.o, arrb));
    }

    public x b(x x8) {
        if (x8 == null) {
            return this;
        }
        return this.a(x8.o);
    }

    public x c(long l8) {
        if (this.p == l8) {
            return this;
        }
        return new x(l8, this.o);
    }

    public b d(int n8) {
        return this.o[n8];
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.o.length;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (x.class != object.getClass()) {
                return false;
            }
            object = (x)object;
            if (Arrays.equals((Object[])this.o, (Object[])object.o) && this.p == object.p) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.o) * 31 + h.b(this.p);
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("entries=");
        stringBuilder.append(Arrays.toString((Object[])this.o));
        if (this.p == -9223372036854775807L) {
            string2 = "";
        } else {
            string2 = new StringBuilder();
            string2.append(", presentationTimeUs=");
            string2.append(this.p);
            string2 = string2.toString();
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o.length);
        b[] arrb = this.o;
        int n9 = arrb.length;
        for (n8 = 0; n8 < n9; ++n8) {
            parcel.writeParcelable((Parcelable)arrb[n8], 0);
        }
        parcel.writeLong(this.p);
    }

    public static interface b
    extends Parcelable {
        public void D(w.b var1);

        public byte[] M();

        public q s();
    }

}

