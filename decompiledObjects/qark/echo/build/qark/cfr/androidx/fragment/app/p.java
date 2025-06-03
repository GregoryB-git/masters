/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import java.util.ArrayList;
import java.util.List;

public final class p
implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator(){

        public p a(Parcel parcel) {
            return new p(parcel);
        }

        public p[] b(int n8) {
            return new p[n8];
        }
    };
    public ArrayList o;
    public ArrayList p;
    public b[] q;
    public int r;
    public String s = null;
    public ArrayList t = new ArrayList();
    public ArrayList u = new ArrayList();
    public ArrayList v;

    public p() {
    }

    public p(Parcel parcel) {
        this.o = parcel.createTypedArrayList(s.CREATOR);
        this.p = parcel.createStringArrayList();
        this.q = (b[])parcel.createTypedArray(b.CREATOR);
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.createStringArrayList();
        this.u = parcel.createTypedArrayList(Bundle.CREATOR);
        this.v = parcel.createTypedArrayList(n.m.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeTypedList((List)this.o);
        parcel.writeStringList((List)this.p);
        parcel.writeTypedArray((Parcelable[])this.q, n8);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeStringList((List)this.t);
        parcel.writeTypedList((List)this.u);
        parcel.writeTypedList((List)this.v);
    }

}

