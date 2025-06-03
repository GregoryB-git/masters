// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Parcel;
import android.os.Message;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class h implements Parcelable
{
    public static final Parcelable$Creator<h> CREATOR;
    public Messenger o;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public h(final IBinder binder) {
        this.o = new Messenger(binder);
    }
    
    public final IBinder a() {
        final Messenger o = this.o;
        o.getClass();
        return o.getBinder();
    }
    
    public final void b(final Message message) {
        final Messenger o = this.o;
        o.getClass();
        o.send(message);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.a().equals(((h)o).a());
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Messenger o = this.o;
        o.getClass();
        parcel.writeStrongBinder(o.getBinder());
    }
}
