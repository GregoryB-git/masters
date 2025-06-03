package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import b2.d;
import b2.e;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final e f1394a;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1394a = new d(parcel).w();
    }

    public ParcelImpl(e eVar) {
        this.f1394a = eVar;
    }

    public <T extends e> T a() {
        return (T) this.f1394a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new d(parcel).Q(this.f1394a);
    }
}
