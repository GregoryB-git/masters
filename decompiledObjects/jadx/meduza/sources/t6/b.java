package t6;

import android.os.Parcel;
import t6.a;

/* loaded from: classes.dex */
public abstract class b extends a implements n6.c {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0230a<?, ?> c0230a : getFieldMappings().values()) {
            if (isFieldSet(c0230a)) {
                if (!aVar.isFieldSet(c0230a) || !m6.h.a(getFieldValue(c0230a), aVar.getFieldValue(c0230a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0230a)) {
                return false;
            }
        }
        return true;
    }

    @Override // t6.a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (a.C0230a<?, ?> c0230a : getFieldMappings().values()) {
            if (isFieldSet(c0230a)) {
                Object fieldValue = getFieldValue(c0230a);
                m6.j.i(fieldValue);
                i10 = (i10 * 31) + fieldValue.hashCode();
            }
        }
        return i10;
    }

    @Override // t6.a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
