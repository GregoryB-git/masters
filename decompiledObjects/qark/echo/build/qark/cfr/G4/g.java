/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicLong
 */
package G4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class g
implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator(){

        public g a(Parcel parcel) {
            return new g(parcel, null);
        }

        public g[] b(int n8) {
            return new g[n8];
        }
    };
    public final String o;
    public final AtomicLong p;

    public g(Parcel parcel) {
        this.o = parcel.readString();
        this.p = new AtomicLong(parcel.readLong());
    }

    public /* synthetic */ g(Parcel parcel,  a8) {
        this(parcel);
    }

    public g(String string2) {
        this.o = string2;
        this.p = new AtomicLong(0L);
    }

    public long a() {
        return this.p.get();
    }

    public String b() {
        return this.o;
    }

    public void c(long l8) {
        this.p.addAndGet(l8);
    }

    public void d(long l8) {
        this.p.set(l8);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeLong(this.p.get());
    }

}

