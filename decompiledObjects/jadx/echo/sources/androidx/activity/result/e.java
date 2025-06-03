package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class e implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final IntentSender f8348o;

    /* renamed from: p, reason: collision with root package name */
    public final Intent f8349p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8350q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8351r;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public IntentSender f8352a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f8353b;

        /* renamed from: c, reason: collision with root package name */
        public int f8354c;

        /* renamed from: d, reason: collision with root package name */
        public int f8355d;

        public b(IntentSender intentSender) {
            this.f8352a = intentSender;
        }

        public e a() {
            return new e(this.f8352a, this.f8353b, this.f8354c, this.f8355d);
        }

        public b b(Intent intent) {
            this.f8353b = intent;
            return this;
        }

        public b c(int i7, int i8) {
            this.f8355d = i7;
            this.f8354c = i8;
            return this;
        }
    }

    public e(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f8348o = intentSender;
        this.f8349p = intent;
        this.f8350q = i7;
        this.f8351r = i8;
    }

    public Intent a() {
        return this.f8349p;
    }

    public int b() {
        return this.f8350q;
    }

    public int c() {
        return this.f8351r;
    }

    public IntentSender d() {
        return this.f8348o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f8348o, i7);
        parcel.writeParcelable(this.f8349p, i7);
        parcel.writeInt(this.f8350q);
        parcel.writeInt(this.f8351r);
    }

    public e(Parcel parcel) {
        this.f8348o = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f8349p = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f8350q = parcel.readInt();
        this.f8351r = parcel.readInt();
    }
}
