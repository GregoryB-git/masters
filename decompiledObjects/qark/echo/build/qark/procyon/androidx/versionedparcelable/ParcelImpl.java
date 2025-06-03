// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.versionedparcelable;

import v1.c;
import android.os.Parcel;
import v1.d;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator<ParcelImpl> CREATOR;
    public final d o;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public ParcelImpl a(final Parcel parcel) {
                return new ParcelImpl(parcel);
            }
            
            public ParcelImpl[] b(final int n) {
                return new ParcelImpl[n];
            }
        };
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.o = new c(parcel).u();
    }
    
    public ParcelImpl(final d o) {
        this.o = o;
    }
    
    public d a() {
        return this.o;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        new c(parcel).L(this.o);
    }
}
