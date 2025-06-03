// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import android.os.BaseBundle;
import java.util.List;
import W2.g;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Parcel;

public final class b
{
    public e a(final long n, final byte[] array, final int n2, final int n3) {
        final Parcel obtain = Parcel.obtain();
        obtain.unmarshall(array, n2, n3);
        obtain.setDataPosition(0);
        final Bundle bundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new e(g0.b.a(new a(), (List)g0.a.e(bundle.getParcelableArrayList("c"))), n, ((BaseBundle)bundle).getLong("d"));
    }
}
