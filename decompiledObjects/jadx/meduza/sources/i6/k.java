package i6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public Messenger f7587a;

    public k(IBinder iBinder) {
        this.f7587a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f7587a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((k) obj).f7587a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f7587a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f7587a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
