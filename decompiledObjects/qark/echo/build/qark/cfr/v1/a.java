/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package v1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import v1.d;

public abstract class a {
    public static d a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl)parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static d b(Bundle object, String string2) {
        block3 : {
            try {
                object = (Bundle)object.getParcelable(string2);
                if (object != null) break block3;
                return null;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
        }
        object.setClassLoader(a.class.getClassLoader());
        object = a.a(object.getParcelable("a"));
        return object;
    }

    public static void c(Bundle bundle, String string2, d d8) {
        if (d8 == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", a.d(d8));
        bundle.putParcelable(string2, (Parcelable)bundle2);
    }

    public static Parcelable d(d d8) {
        return new ParcelImpl(d8);
    }
}

