package c1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f0.C1280a;
import g0.AbstractC1298b;
import j3.C1373c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815d {
    public byte[] a(List list, long j7) {
        ArrayList<? extends Parcelable> b7 = AbstractC1298b.b(list, new W2.g() { // from class: c1.c
            @Override // W2.g
            public final Object apply(Object obj) {
                return ((C1280a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C1373c.f15449d, b7);
        bundle.putLong("d", j7);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
