/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Double
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package R2;

import B2.a;
import B2.c;
import R2.F;
import R2.G;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class D
extends a
implements Iterable {
    public static final Parcelable.Creator<D> CREATOR = new F();
    public final Bundle o;

    public D(Bundle bundle) {
        this.o = bundle;
    }

    public final int a() {
        return this.o.size();
    }

    public final Double f(String string2) {
        return this.o.getDouble(string2);
    }

    public final Bundle g() {
        return new Bundle(this.o);
    }

    public final Long i(String string2) {
        return this.o.getLong(string2);
    }

    public final Iterator iterator() {
        return new G(this);
    }

    public final Object k(String string2) {
        return this.o.get(string2);
    }

    public final String q(String string2) {
        return this.o.getString(string2);
    }

    public final String toString() {
        return this.o.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.e(parcel, 2, this.g(), false);
        c.b(parcel, n8);
    }
}

