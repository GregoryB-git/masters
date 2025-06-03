package eb;

import eb.j;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f5172b = new m(new j.a(), j.b.f5135a);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5173a = new ConcurrentHashMap();

    public m(l... lVarArr) {
        for (l lVar : lVarArr) {
            this.f5173a.put(lVar.a(), lVar);
        }
    }
}
