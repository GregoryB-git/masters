// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import android.content.Intent;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;

public final class a extends B2.a
{
    @NonNull
    public static final Parcelable$Creator<a> CREATOR;
    public Intent o;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public a(final Intent o) {
        this.o = o;
    }
    
    public Intent a() {
        return this.o;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.m(parcel, 1, (Parcelable)this.o, n, false);
        c.b(parcel, a);
    }
}
