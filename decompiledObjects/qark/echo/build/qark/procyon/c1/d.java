// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import android.os.BaseBundle;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Bundle;
import W2.g;
import java.util.Collection;
import g0.b;
import java.util.List;

public final class d
{
    public byte[] a(final List list, final long n) {
        final ArrayList b = g0.b.b(list, new c());
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", b);
        ((BaseBundle)bundle).putLong("d", n);
        final Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
