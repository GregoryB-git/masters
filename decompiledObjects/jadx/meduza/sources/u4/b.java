package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14941b;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = v5.e0.f15881a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f14941b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.<init>(android.os.Parcel):void");
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f14941b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14963a.equals(bVar.f14963a) && Arrays.equals(this.f14941b, bVar.f14941b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14941b) + a0.j.e(this.f14963a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14963a);
        parcel.writeByteArray(this.f14941b);
    }
}
