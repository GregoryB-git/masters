package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p.s;
import p.t;
import p.v;

/* loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {

    /* renamed from: i, reason: collision with root package name */
    public static final String f412i = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        public static class a implements IEngagementSignalsCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f413a;

            public a(IBinder iBinder) {
                this.f413a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f413a;
            }
        }

        public Stub() {
            attachInterface(this, IEngagementSignalsCallback.f412i);
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.f412i);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IEngagementSignalsCallback)) ? new a(iBinder) : (IEngagementSignalsCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IEngagementSignalsCallback.f412i;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                r2 = parcel.readInt() != 0;
                final Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                t tVar = (t) this;
                Handler handler = tVar.f12742a;
                final v vVar = tVar.f12743b;
                handler.post(new Runnable() { // from class: p.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.onVerticalScrollEvent(r2, bundle);
                    }
                });
            } else if (i10 == 3) {
                int readInt = parcel.readInt();
                Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
                t tVar2 = (t) this;
                tVar2.f12742a.post(new s(tVar2.f12743b, readInt, (Bundle) createFromParcel, r2 ? 1 : 0));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                final boolean z10 = parcel.readInt() != 0;
                final Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                t tVar3 = (t) this;
                Handler handler2 = tVar3.f12742a;
                final v vVar2 = tVar3.f12743b;
                handler2.post(new Runnable() { // from class: p.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.onSessionEnded(z10, bundle2);
                    }
                });
            }
            return true;
        }
    }
}
