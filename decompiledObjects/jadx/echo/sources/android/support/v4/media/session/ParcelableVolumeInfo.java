package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public int f8248o;

    /* renamed from: p, reason: collision with root package name */
    public int f8249p;

    /* renamed from: q, reason: collision with root package name */
    public int f8250q;

    /* renamed from: r, reason: collision with root package name */
    public int f8251r;

    /* renamed from: s, reason: collision with root package name */
    public int f8252s;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i7) {
            return new ParcelableVolumeInfo[i7];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f8248o = parcel.readInt();
        this.f8250q = parcel.readInt();
        this.f8251r = parcel.readInt();
        this.f8252s = parcel.readInt();
        this.f8249p = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8248o);
        parcel.writeInt(this.f8250q);
        parcel.writeInt(this.f8251r);
        parcel.writeInt(this.f8252s);
        parcel.writeInt(this.f8249p);
    }
}
