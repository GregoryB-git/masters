package u3;

import android.util.SparseArray;
import defpackage.f;
import h3.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray<e> f14935a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<e, Integer> f14936b;

    static {
        HashMap<e, Integer> hashMap = new HashMap<>();
        f14936b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        f14936b.put(e.VERY_LOW, 1);
        f14936b.put(e.HIGHEST, 2);
        for (e eVar : f14936b.keySet()) {
            f14935a.append(f14936b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = f14936b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i10) {
        e eVar = f14935a.get(i10);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(f.h("Unknown Priority for value ", i10));
    }
}
