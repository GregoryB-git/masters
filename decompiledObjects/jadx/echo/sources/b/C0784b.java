package b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import b.InterfaceC0783a;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0784b implements Parcelable {
    public static final Parcelable.Creator<C0784b> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f9949o = false;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f9950p = null;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0783a f9951q;

    /* renamed from: b.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0784b createFromParcel(Parcel parcel) {
            return new C0784b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0784b[] newArray(int i7) {
            return new C0784b[i7];
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    public class BinderC0167b extends InterfaceC0783a.AbstractBinderC0165a {
        public BinderC0167b() {
        }

        @Override // b.InterfaceC0783a
        public void T0(int i7, Bundle bundle) {
            C0784b c0784b = C0784b.this;
            Handler handler = c0784b.f9950p;
            if (handler != null) {
                handler.post(c0784b.new c(i7, bundle));
            } else {
                c0784b.a(i7, bundle);
            }
        }
    }

    /* renamed from: b.b$c */
    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final int f9953o;

        /* renamed from: p, reason: collision with root package name */
        public final Bundle f9954p;

        public c(int i7, Bundle bundle) {
            this.f9953o = i7;
            this.f9954p = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0784b.this.a(this.f9953o, this.f9954p);
        }
    }

    public C0784b(Parcel parcel) {
        this.f9951q = InterfaceC0783a.AbstractBinderC0165a.n(parcel.readStrongBinder());
    }

    public void b(int i7, Bundle bundle) {
        if (this.f9949o) {
            Handler handler = this.f9950p;
            if (handler != null) {
                handler.post(new c(i7, bundle));
                return;
            } else {
                a(i7, bundle);
                return;
            }
        }
        InterfaceC0783a interfaceC0783a = this.f9951q;
        if (interfaceC0783a != null) {
            try {
                interfaceC0783a.T0(i7, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f9951q == null) {
                    this.f9951q = new BinderC0167b();
                }
                parcel.writeStrongBinder(this.f9951q.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
