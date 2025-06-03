/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Object
 */
package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import w2.f;

public final class h
implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new f();
    public Messenger o;

    public h(IBinder iBinder) {
        this.o = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.o;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.o;
        messenger.getClass();
        messenger.send(message);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        try {
            boolean bl = this.a().equals((Object)((h)object).a());
            return bl;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public final int hashCode() {
        return this.a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        Messenger messenger = this.o;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}

