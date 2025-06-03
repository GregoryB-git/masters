// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v1;

import android.os.Bundle;
import androidx.versionedparcelable.ParcelImpl;
import android.os.Parcelable;

public abstract class a
{
    public static d a(final Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl)parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }
    
    public static d b(Bundle bundle, final String s) {
        try {
            bundle = (Bundle)bundle.getParcelable(s);
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(a.class.getClassLoader());
            return a(bundle.getParcelable("a"));
        }
        catch (RuntimeException ex) {
            return null;
        }
    }
    
    public static void c(final Bundle bundle, final String s, final d d) {
        if (d == null) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", d(d));
        bundle.putParcelable(s, (Parcelable)bundle2);
    }
    
    public static Parcelable d(final d d) {
        return (Parcelable)new ParcelImpl(d);
    }
}
