// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.os.BaseBundle;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Parcelable;
import android.os.Bundle;

public abstract class j
{
    public static final Object a;
    public static final Object b;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static Bundle a(final h.a a) {
        final Bundle bundle = new Bundle();
        final IconCompat d = a.d();
        int g;
        if (d != null) {
            g = d.g();
        }
        else {
            g = 0;
        }
        ((BaseBundle)bundle).putInt("icon", g);
        bundle.putCharSequence("title", a.h());
        bundle.putParcelable("actionIntent", (Parcelable)a.a());
        Bundle bundle2;
        if (a.c() != null) {
            bundle2 = new Bundle(a.c());
        }
        else {
            bundle2 = new Bundle();
        }
        ((BaseBundle)bundle2).putBoolean("android.support.allowGeneratedReplies", a.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", (Parcelable[])c(a.e()));
        ((BaseBundle)bundle).putBoolean("showsUserInterface", a.g());
        ((BaseBundle)bundle).putInt("semanticAction", a.f());
        return bundle;
    }
    
    public static Bundle b(final l l) {
        new Bundle();
        throw null;
    }
    
    public static Bundle[] c(final l[] array) {
        if (array == null) {
            return null;
        }
        final Bundle[] array2 = new Bundle[array.length];
        for (int i = 0; i < array.length; ++i) {
            final l l = array[i];
            array2[i] = b(null);
        }
        return array2;
    }
}
