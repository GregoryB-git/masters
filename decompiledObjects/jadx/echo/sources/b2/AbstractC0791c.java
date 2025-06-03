package b2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0791c {
    static {
        AbstractC0791c.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
