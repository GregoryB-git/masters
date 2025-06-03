package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final List<ParcelImpl> f1037a;

    public class a extends Binder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1038a;

        public a(int i10) {
            this.f1038a = i10;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int readInt = parcel.readInt();
            while (readInt < this.f1038a && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f1037a.get(readInt), i11);
                readInt++;
            }
            if (readInt < this.f1038a) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    public class b implements Parcelable.Creator<ParcelImplListSlice> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImplListSlice[] newArray(int i10) {
            return new ParcelImplListSlice[i10];
        }
    }

    public ParcelImplListSlice(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f1037a = new ArrayList(readInt);
        if (readInt <= 0) {
            return;
        }
        int i10 = 0;
        while (i10 < readInt && parcel.readInt() != 0) {
            this.f1037a.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
            i10++;
        }
        if (i10 >= readInt) {
            return;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        while (i10 < readInt) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                readStrongBinder.transact(1, obtain, obtain2, 0);
                while (i10 < readInt && obtain2.readInt() != 0) {
                    this.f1037a.add((ParcelImpl) obtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                    i10++;
                }
            } catch (RemoteException e10) {
                Log.w("ParcelImplListSlice", "Failure retrieving array; only received " + i10 + " of " + readInt, e10);
                return;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ParcelImplListSlice(ArrayList arrayList) {
        this.f1037a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r7.writeInt(0);
        r7.writeStrongBinder(new androidx.media2.common.ParcelImplListSlice.a(r6, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            java.util.List<androidx.versionedparcelable.ParcelImpl> r0 = r6.f1037a
            int r0 = r0.size()
            r7.writeInt(r0)
            if (r0 <= 0) goto L38
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L2b
            r3 = 1
            if (r2 >= r3) goto L2b
            int r4 = r7.dataSize()
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r5) goto L2b
            r7.writeInt(r3)
            java.util.List<androidx.versionedparcelable.ParcelImpl> r3 = r6.f1037a
            java.lang.Object r3 = r3.get(r2)
            androidx.versionedparcelable.ParcelImpl r3 = (androidx.versionedparcelable.ParcelImpl) r3
            r7.writeParcelable(r3, r8)
            int r2 = r2 + 1
            goto Ld
        L2b:
            if (r2 >= r0) goto L38
            r7.writeInt(r1)
            androidx.media2.common.ParcelImplListSlice$a r8 = new androidx.media2.common.ParcelImplListSlice$a
            r8.<init>(r0)
            r7.writeStrongBinder(r8)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media2.common.ParcelImplListSlice.writeToParcel(android.os.Parcel, int):void");
    }
}
