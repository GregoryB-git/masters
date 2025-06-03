package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: o, reason: collision with root package name */
    public final Parcelable f3579o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f3578p = new C0065a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: N.a$a, reason: collision with other inner class name */
    public static class C0065a extends a {
        public C0065a() {
            super((C0065a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3578p;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a() {
        this.f3579o = null;
    }

    public final Parcelable a() {
        return this.f3579o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f3579o, i7);
    }

    public /* synthetic */ a(C0065a c0065a) {
        this();
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3579o = readParcelable == null ? f3578p : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f3579o = parcelable == f3578p ? null : parcelable;
    }
}
