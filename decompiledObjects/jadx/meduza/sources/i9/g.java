package i9;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f7682a;

    /* renamed from: b, reason: collision with root package name */
    public final t8.c<j9.i, j9.g> f7683b;

    public g(int i10, t8.c<j9.i, j9.g> cVar) {
        this.f7682a = i10;
        this.f7683b = cVar;
    }

    public static g a(int i10, HashMap hashMap) {
        t8.c cVar = j9.h.f8681a;
        for (Map.Entry entry : hashMap.entrySet()) {
            cVar = cVar.n((j9.i) entry.getKey(), ((c0) entry.getValue()).f7654a);
        }
        return new g(i10, cVar);
    }
}
