package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f3324a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f3325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3326c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3327d;

    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            ec.i.e(parcel, "inParcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            ec.i.b(readParcelable);
            return new i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(IntentSender intentSender, Intent intent, int i10, int i11) {
        ec.i.e(intentSender, "intentSender");
        this.f3324a = intentSender;
        this.f3325b = intent;
        this.f3326c = i10;
        this.f3327d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ec.i.e(parcel, "dest");
        parcel.writeParcelable(this.f3324a, i10);
        parcel.writeParcelable(this.f3325b, i10);
        parcel.writeInt(this.f3326c);
        parcel.writeInt(this.f3327d);
    }
}
