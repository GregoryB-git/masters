package c7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.a;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        try {
            Parcelable.Creator<a> creator = a.CREATOR;
            for (a.EnumC0036a enumC0036a : a.EnumC0036a.values()) {
                if (readInt == enumC0036a.f2390a) {
                    return enumC0036a;
                }
            }
            throw new a.b(readInt);
        } catch (a.b e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.EnumC0036a[i10];
    }
}
