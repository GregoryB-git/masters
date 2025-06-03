// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class p implements Parcelable
{
    public static final Parcelable$Creator<p> CREATOR;
    public ArrayList o;
    public ArrayList p;
    public b[] q;
    public int r;
    public String s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public p a(final Parcel parcel) {
                return new p(parcel);
            }
            
            public p[] b(final int n) {
                return new p[n];
            }
        };
    }
    
    public p() {
        this.s = null;
        this.t = new ArrayList();
        this.u = new ArrayList();
    }
    
    public p(final Parcel parcel) {
        this.s = null;
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.o = parcel.createTypedArrayList((Parcelable$Creator)androidx.fragment.app.s.CREATOR);
        this.p = parcel.createStringArrayList();
        this.q = (b[])parcel.createTypedArray((Parcelable$Creator)b.CREATOR);
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.createStringArrayList();
        this.u = parcel.createTypedArrayList(Bundle.CREATOR);
        this.v = parcel.createTypedArrayList((Parcelable$Creator)n.m.CREATOR);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.o);
        parcel.writeStringList((List)this.p);
        parcel.writeTypedArray((Parcelable[])this.q, n);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeStringList((List)this.t);
        parcel.writeTypedList((List)this.u);
        parcel.writeTypedList((List)this.v);
    }
}
