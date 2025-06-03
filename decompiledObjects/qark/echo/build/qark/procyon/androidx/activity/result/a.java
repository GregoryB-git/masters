// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity.result;

import android.os.Parcel;
import android.content.Intent;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    @NonNull
    public static final Parcelable$Creator<a> CREATOR;
    public final int o;
    public final Intent p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int o, final Intent p2) {
        this.o = o;
        this.p = p2;
    }
    
    public a(final Parcel parcel) {
        this.o = parcel.readInt();
        Intent p;
        if (parcel.readInt() == 0) {
            p = null;
        }
        else {
            p = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.p = p;
    }
    
    public static String c(final int i) {
        if (i == -1) {
            return "RESULT_OK";
        }
        if (i != 0) {
            return String.valueOf(i);
        }
        return "RESULT_CANCELED";
    }
    
    public Intent a() {
        return this.p;
    }
    
    public int b() {
        return this.o;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        sb.append(c(this.o));
        sb.append(", data=");
        sb.append(this.p);
        sb.append('}');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        int n2;
        if (this.p == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent p2 = this.p;
        if (p2 != null) {
            p2.writeToParcel(parcel, n);
        }
    }
}
