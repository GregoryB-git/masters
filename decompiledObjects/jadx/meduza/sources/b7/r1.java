package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 == 3) {
                bArr2 = n6.b.c(readInt, parcel);
            } else if (c10 == 4) {
                bArr3 = n6.b.c(readInt, parcel);
            } else if (c10 == 5) {
                bArr4 = n6.b.c(readInt, parcel);
            } else if (c10 != 6) {
                n6.b.t(readInt, parcel);
            } else {
                bArr5 = n6.b.c(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
