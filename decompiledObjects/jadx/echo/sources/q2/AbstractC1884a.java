package q2;

import android.util.SparseArray;
import c2.EnumC0821d;
import java.util.HashMap;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1884a {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f18821a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap f18822b;

    static {
        HashMap hashMap = new HashMap();
        f18822b = hashMap;
        hashMap.put(EnumC0821d.DEFAULT, 0);
        f18822b.put(EnumC0821d.VERY_LOW, 1);
        f18822b.put(EnumC0821d.HIGHEST, 2);
        for (EnumC0821d enumC0821d : f18822b.keySet()) {
            f18821a.append(((Integer) f18822b.get(enumC0821d)).intValue(), enumC0821d);
        }
    }

    public static int a(EnumC0821d enumC0821d) {
        Integer num = (Integer) f18822b.get(enumC0821d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC0821d);
    }

    public static EnumC0821d b(int i7) {
        EnumC0821d enumC0821d = (EnumC0821d) f18821a.get(i7);
        if (enumC0821d != null) {
            return enumC0821d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
