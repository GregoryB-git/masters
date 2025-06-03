package b7;

import android.os.Parcel;
import android.os.Parcelable;
import b7.d0;

/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (d0.a aVar : d0.a.values()) {
                if (readString.equals(aVar.f1946a)) {
                    return aVar;
                }
            }
            throw new d0.b(readString);
        } catch (d0.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0.a[i10];
    }
}
