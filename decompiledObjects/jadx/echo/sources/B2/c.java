package B2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int i7) {
        s(parcel, i7);
    }

    public static void c(Parcel parcel, int i7, boolean z7) {
        t(parcel, i7, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i7, Boolean bool, boolean z7) {
        if (bool != null) {
            t(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            t(parcel, i7, 0);
        }
    }

    public static void e(Parcel parcel, int i7, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcel.writeBundle(bundle);
            s(parcel, r7);
        }
    }

    public static void f(Parcel parcel, int i7, Double d7, boolean z7) {
        if (d7 != null) {
            t(parcel, i7, 8);
            parcel.writeDouble(d7.doubleValue());
        } else if (z7) {
            t(parcel, i7, 0);
        }
    }

    public static void g(Parcel parcel, int i7, Float f7, boolean z7) {
        if (f7 != null) {
            t(parcel, i7, 4);
            parcel.writeFloat(f7.floatValue());
        } else if (z7) {
            t(parcel, i7, 0);
        }
    }

    public static void h(Parcel parcel, int i7, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            s(parcel, r7);
        }
    }

    public static void i(Parcel parcel, int i7, int i8) {
        t(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    public static void j(Parcel parcel, int i7, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcel.writeIntArray(iArr);
            s(parcel, r7);
        }
    }

    public static void k(Parcel parcel, int i7, long j7) {
        t(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    public static void l(Parcel parcel, int i7, Long l7, boolean z7) {
        if (l7 != null) {
            t(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z7) {
            t(parcel, i7, 0);
        }
    }

    public static void m(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            s(parcel, r7);
        }
    }

    public static void n(Parcel parcel, int i7, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcel.writeString(str);
            s(parcel, r7);
        }
    }

    public static void o(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                t(parcel, i7, 0);
            }
        } else {
            int r7 = r(parcel, i7);
            parcel.writeStringList(list);
            s(parcel, r7);
        }
    }

    public static void p(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8, boolean z7) {
        if (parcelableArr == null) {
            if (z7) {
                t(parcel, i7, 0);
                return;
            }
            return;
        }
        int r7 = r(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, parcelable, i8);
            }
        }
        s(parcel, r7);
    }

    public static void q(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                t(parcel, i7, 0);
                return;
            }
            return;
        }
        int r7 = r(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, parcelable, 0);
            }
        }
        s(parcel, r7);
    }

    public static int r(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void t(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static void u(Parcel parcel, Parcelable parcelable, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
