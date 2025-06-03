// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity.result;

import android.os.Parcel;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class e implements Parcelable
{
    @NonNull
    public static final Parcelable$Creator<e> CREATOR;
    public final IntentSender o;
    public final Intent p;
    public final int q;
    public final int r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public e a(final Parcel parcel) {
                return new e(parcel);
            }
            
            public e[] b(final int n) {
                return new e[n];
            }
        };
    }
    
    public e(final IntentSender o, final Intent p4, final int q, final int r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public e(final Parcel parcel) {
        this.o = (IntentSender)parcel.readParcelable(IntentSender.class.getClassLoader());
        this.p = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }
    
    public Intent a() {
        return this.p;
    }
    
    public int b() {
        return this.q;
    }
    
    public int c() {
        return this.r;
    }
    
    public IntentSender d() {
        return this.o;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.o, n);
        parcel.writeParcelable((Parcelable)this.p, n);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }
    
    public static final class b
    {
        public IntentSender a;
        public Intent b;
        public int c;
        public int d;
        
        public b(final IntentSender a) {
            this.a = a;
        }
        
        public e a() {
            return new e(this.a, this.b, this.c, this.d);
        }
        
        public b b(final Intent b) {
            this.b = b;
            return this;
        }
        
        public b c(final int d, final int c) {
            this.d = d;
            this.c = c;
            return this;
        }
    }
}
