/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c1;

import android.os.Bundle;
import android.os.Parcel;
import c1.a;
import c1.e;
import java.util.ArrayList;
import java.util.List;

public final class b {
    public e a(long l8, byte[] bundle, int n8, int n9) {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall((byte[])bundle, n8, n9);
        parcel.setDataPosition(0);
        bundle = parcel.readBundle(Bundle.class.getClassLoader());
        parcel.recycle();
        parcel = (ArrayList)g0.a.e((Object)bundle.getParcelableArrayList("c"));
        return new e(g0.b.a(new a(), (List)parcel), l8, bundle.getLong("d"));
    }
}

