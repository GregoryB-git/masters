/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package x2;

import A2.m;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import x2.t;

public class d
extends a {
    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new t();
    public final String o;
    public final int p;
    public final long q;

    public d(String string2, int n8, long l8) {
        this.o = string2;
        this.p = n8;
        this.q = l8;
    }

    public d(String string2, long l8) {
        this.o = string2;
        this.q = l8;
        this.p = -1;
    }

    public String a() {
        return this.o;
    }

    public long d() {
        long l8;
        long l9 = l8 = this.q;
        if (l8 == -1L) {
            l9 = this.p;
        }
        return l9;
    }

    public final boolean equals(Object object) {
        if (object instanceof d) {
            object = (d)object;
            if ((this.a() != null && this.a().equals((Object)object.a()) || this.a() == null && object.a() == null) && this.d() == object.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return m.b(this.a(), this.d());
    }

    public final String toString() {
        m.a a8 = m.c(this);
        a8.a("name", this.a());
        a8.a("version", this.d());
        return a8.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 1, this.a(), false);
        c.i(parcel, 2, this.p);
        c.k(parcel, 3, this.d());
        c.b(parcel, n8);
    }
}

