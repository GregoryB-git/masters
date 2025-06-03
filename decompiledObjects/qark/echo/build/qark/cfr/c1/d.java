/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package c1;

import android.os.Bundle;
import android.os.Parcel;
import c1.c;
import g0.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d {
    public byte[] a(List arrby, long l8) {
        ArrayList arrayList = b.b((Collection)arrby, new c());
        arrby = new Bundle();
        arrby.putParcelableArrayList("c", arrayList);
        arrby.putLong("d", l8);
        arrayList = Parcel.obtain();
        arrayList.writeBundle((Bundle)arrby);
        arrby = arrayList.marshall();
        arrayList.recycle();
        return arrby;
    }
}

