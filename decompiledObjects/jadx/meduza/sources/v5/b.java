package v5;

import android.os.Bundle;
import java.util.ArrayList;
import o7.l0;
import o7.t;
import v3.g;

/* loaded from: classes.dex */
public final class b {
    public static l0 a(g.a aVar, ArrayList arrayList) {
        t.b bVar = o7.t.f12050b;
        t.a aVar2 = new t.a();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            aVar2.c(aVar.f(bundle));
        }
        return aVar2.e();
    }
}
