package v1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import j3.C1371a;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2049a {
    public static d a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static d b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(AbstractC2049a.class.getClassLoader());
            return a(bundle2.getParcelable(C1371a.f15434e));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, d dVar) {
        if (dVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(C1371a.f15434e, d(dVar));
        bundle.putParcelable(str, bundle2);
    }

    public static Parcelable d(d dVar) {
        return new ParcelImpl(dVar);
    }
}
