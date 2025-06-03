package g0;

import X2.AbstractC0703v;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1298b {
    public static AbstractC0703v a(W2.g gVar, List list) {
        AbstractC0703v.a M6 = AbstractC0703v.M();
        for (int i7 = 0; i7 < list.size(); i7++) {
            M6.a(gVar.apply((Bundle) AbstractC1297a.e((Bundle) list.get(i7))));
        }
        return M6.k();
    }

    public static ArrayList b(Collection collection, W2.g gVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gVar.apply(it.next()));
        }
        return arrayList;
    }
}
