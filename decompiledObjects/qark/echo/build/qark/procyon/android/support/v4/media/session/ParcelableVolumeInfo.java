// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public class ParcelableVolumeInfo implements Parcelable
{
    public static final Parcelable$Creator<ParcelableVolumeInfo> CREATOR;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public ParcelableVolumeInfo a(final Parcel parcel) {
                return new ParcelableVolumeInfo(parcel);
            }
            
            public ParcelableVolumeInfo[] b(final int n) {
                return new ParcelableVolumeInfo[n];
            }
        };
    }
    
    public ParcelableVolumeInfo(final Parcel parcel) {
        this.o = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.p = parcel.readInt();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.p);
    }
}
