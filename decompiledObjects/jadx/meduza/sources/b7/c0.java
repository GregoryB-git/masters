package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.c0;

/* loaded from: classes.dex */
public enum c0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<c0> CREATOR = new Parcelable.Creator() { // from class: b7.a1
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                for (c0 c0Var : c0.values()) {
                    if (readString.equals(c0Var.f1932a)) {
                        return c0Var;
                    }
                }
                throw new c0.a(readString);
            } catch (c0.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new c0[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f1932a;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    c0(String str) {
        this.f1932a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1932a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1932a);
    }
}
