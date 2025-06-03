package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14971b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f14972c;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14971b = readString;
        this.f14972c = parcel.createByteArray();
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f14971b = str;
        this.f14972c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return e0.a(this.f14971b, kVar.f14971b) && Arrays.equals(this.f14972c, kVar.f14972c);
    }

    public final int hashCode() {
        String str = this.f14971b;
        return Arrays.hashCode(this.f14972c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": owner=" + this.f14971b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14971b);
        parcel.writeByteArray(this.f14972c);
    }
}
