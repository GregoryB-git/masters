package c1;

import android.os.Bundle;
import android.os.Parcel;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.AbstractC1298b;
import j3.C1373c;
import java.util.ArrayList;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813b {
    public C0816e a(long j7, byte[] bArr, int i7, int i8) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i7, i8);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new C0816e(AbstractC1298b.a(new W2.g() { // from class: c1.a
            @Override // W2.g
            public final Object apply(Object obj) {
                return C1280a.b((Bundle) obj);
            }
        }, (ArrayList) AbstractC1297a.e(readBundle.getParcelableArrayList(C1373c.f15449d))), j7, readBundle.getLong("d"));
    }
}
