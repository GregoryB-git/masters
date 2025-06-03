package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f515a;

    /* renamed from: b, reason: collision with root package name */
    public int f516b;

    /* renamed from: c, reason: collision with root package name */
    public int f517c;

    /* renamed from: d, reason: collision with root package name */
    public int f518d;

    /* renamed from: e, reason: collision with root package name */
    public int f519e;

    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f515a = parcel.readInt();
        this.f517c = parcel.readInt();
        this.f518d = parcel.readInt();
        this.f519e = parcel.readInt();
        this.f516b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f515a);
        parcel.writeInt(this.f517c);
        parcel.writeInt(this.f518d);
        parcel.writeInt(this.f519e);
        parcel.writeInt(this.f516b);
    }
}
