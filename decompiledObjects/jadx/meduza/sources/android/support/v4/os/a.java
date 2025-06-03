package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0010a();

    /* renamed from: a, reason: collision with root package name */
    public IResultReceiver f542a;

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public class C0010a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public class b extends IResultReceiver.Stub {
        public b() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public final void a3(int i10, Bundle bundle) {
            a.this.getClass();
            a.this.a(i10, bundle);
        }
    }

    public a(Parcel parcel) {
        this.f542a = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    public void a(int i10, Bundle bundle) {
    }

    public final void b(int i10, Bundle bundle) {
        IResultReceiver iResultReceiver = this.f542a;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.a3(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f542a == null) {
                this.f542a = new b();
            }
            parcel.writeStrongBinder(this.f542a.asBinder());
        }
    }
}
