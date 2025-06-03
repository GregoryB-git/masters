package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        while (true) {
            byte[][] bArr = null;
            while (parcel.dataPosition() < u10) {
                int readInt = parcel.readInt();
                if (((char) readInt) != 1) {
                    n6.b.t(readInt, parcel);
                } else {
                    int s10 = n6.b.s(readInt, parcel);
                    int dataPosition = parcel.dataPosition();
                    if (s10 == 0) {
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    byte[][] bArr2 = new byte[readInt2][];
                    for (int i10 = 0; i10 < readInt2; i10++) {
                        bArr2[i10] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + s10);
                    bArr = bArr2;
                }
            }
            n6.b.j(u10, parcel);
            return new q0(bArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q0[i10];
    }
}
