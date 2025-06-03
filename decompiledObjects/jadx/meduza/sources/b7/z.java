package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    z EF2;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z[] f2034a = {new z()};
    public static final Parcelable.Creator<z> CREATOR = new Parcelable.Creator() { // from class: b7.y0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return z.f(parcel.readString());
            } catch (z.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new z[i10];
        }
    };

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static z f(String str) {
        for (z zVar : values()) {
            zVar.getClass();
            if (str.equals("public-key")) {
                return zVar;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f2034a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
