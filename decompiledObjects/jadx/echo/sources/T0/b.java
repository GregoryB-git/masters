package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f6018p;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(Parcel parcel) {
        super((String) M.i(parcel.readString()));
        this.f6018p = (byte[]) M.i(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6042o.equals(bVar.f6042o) && Arrays.equals(this.f6018p, bVar.f6018p);
    }

    public int hashCode() {
        return ((527 + this.f6042o.hashCode()) * 31) + Arrays.hashCode(this.f6018p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6042o);
        parcel.writeByteArray(this.f6018p);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f6018p = bArr;
    }
}
