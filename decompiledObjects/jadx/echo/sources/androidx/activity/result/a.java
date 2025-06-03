package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new C0151a();

    /* renamed from: o, reason: collision with root package name */
    public final int f8346o;

    /* renamed from: p, reason: collision with root package name */
    public final Intent f8347p;

    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    public class C0151a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, Intent intent) {
        this.f8346o = i7;
        this.f8347p = intent;
    }

    public static String c(int i7) {
        return i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f8347p;
    }

    public int b() {
        return this.f8346o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f8346o) + ", data=" + this.f8347p + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8346o);
        parcel.writeInt(this.f8347p == null ? 0 : 1);
        Intent intent = this.f8347p;
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public a(Parcel parcel) {
        this.f8346o = parcel.readInt();
        this.f8347p = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
