package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6052p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f6053q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i7) {
            return new m[i7];
        }
    }

    public m(Parcel parcel) {
        super("PRIV");
        this.f6052p = (String) M.i(parcel.readString());
        this.f6053q = (byte[]) M.i(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return M.c(this.f6052p, mVar.f6052p) && Arrays.equals(this.f6053q, mVar.f6053q);
    }

    public int hashCode() {
        String str = this.f6052p;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6053q);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": owner=" + this.f6052p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6052p);
        parcel.writeByteArray(this.f6053q);
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f6052p = str;
        this.f6053q = bArr;
    }
}
