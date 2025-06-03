package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2086h implements Parcelable {
    public static final Parcelable.Creator<C2086h> CREATOR = new C2084f();

    /* renamed from: o, reason: collision with root package name */
    public Messenger f20341o;

    public C2086h(IBinder iBinder) {
        this.f20341o = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f20341o;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f20341o;
        messenger.getClass();
        messenger.send(message);
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
            return a().equals(((C2086h) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f20341o;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
