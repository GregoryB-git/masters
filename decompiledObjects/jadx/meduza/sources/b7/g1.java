package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum g1 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<g1> CREATOR = new Parcelable.Creator() { // from class: b7.e1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return g1.f(parcel.readString());
            } catch (f1 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new g1[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f1963a;

    g1(String str) {
        this.f1963a = str;
    }

    public static g1 f(String str) {
        for (g1 g1Var : values()) {
            if (str.equals(g1Var.f1963a)) {
                return g1Var;
            }
        }
        throw new f1(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1963a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1963a);
    }
}
