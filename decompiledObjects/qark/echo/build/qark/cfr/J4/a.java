/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 */
package J4;

import M4.l;
import N4.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.r;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel, null);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final String o;
    public final l p;
    public boolean q;

    public a(Parcel parcel) {
        boolean bl = false;
        this.q = false;
        this.o = parcel.readString();
        if (parcel.readByte() != 0) {
            bl = true;
        }
        this.q = bl;
        this.p = (l)parcel.readParcelable(l.class.getClassLoader());
    }

    public /* synthetic */ a(Parcel parcel,  a8) {
        this(parcel);
    }

    public a(String string2, M4.a a8) {
        this.q = false;
        this.o = string2;
        this.p = a8.a();
    }

    public static k[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] arrk = new k[list.size()];
        k k8 = ((a)list.get(0)).a();
        boolean bl = false;
        for (int i8 = 1; i8 < list.size(); ++i8) {
            k k9 = ((a)list.get(i8)).a();
            if (!bl && ((a)list.get(i8)).g()) {
                arrk[0] = k9;
                arrk[i8] = k8;
                bl = true;
                continue;
            }
            arrk[i8] = k9;
        }
        if (!bl) {
            arrk[0] = k8;
        }
        return arrk;
    }

    public static a c(String object) {
        object = new a(object.replace((CharSequence)"-", (CharSequence)""), new M4.a());
        object.i(a.j());
        return object;
    }

    public static boolean j() {
        C4.a a8 = C4.a.g();
        if (a8.L() && Math.random() < a8.D()) {
            return true;
        }
        return false;
    }

    public k a() {
        k.c c8 = k.a0().E(this.o);
        if (this.q) {
            c8.D(N4.l.q);
        }
        return (k)c8.v();
    }

    public l d() {
        return this.p;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.q;
    }

    public boolean f() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.p.c()) > C4.a.g().A()) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.q;
    }

    public String h() {
        return this.o;
    }

    public void i(boolean bl) {
        this.q = bl;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeByte((byte)(this.q ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.p, 0);
    }

}

