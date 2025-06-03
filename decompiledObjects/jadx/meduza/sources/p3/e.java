package p3;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import q3.c;
import q3.e;

/* loaded from: classes.dex */
public final class e implements m3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12989a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.a f12990b;

    public /* synthetic */ e(qb.a aVar, int i10) {
        this.f12989a = i10;
        this.f12990b = aVar;
    }

    @Override // qb.a
    public final Object get() {
        switch (this.f12989a) {
            case 0:
                t3.a aVar = (t3.a) this.f12990b.get();
                HashMap hashMap = new HashMap();
                h3.e eVar = h3.e.DEFAULT;
                c.a aVar2 = new c.a();
                Set<e.b> emptySet = Collections.emptySet();
                if (emptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar2.f13229c = emptySet;
                aVar2.f13227a = 30000L;
                aVar2.f13228b = 86400000L;
                hashMap.put(eVar, aVar2.a());
                h3.e eVar2 = h3.e.HIGHEST;
                c.a aVar3 = new c.a();
                Set<e.b> emptySet2 = Collections.emptySet();
                if (emptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar3.f13229c = emptySet2;
                aVar3.f13227a = 1000L;
                aVar3.f13228b = 86400000L;
                hashMap.put(eVar2, aVar3.a());
                h3.e eVar3 = h3.e.VERY_LOW;
                c.a aVar4 = new c.a();
                Set<e.b> emptySet3 = Collections.emptySet();
                if (emptySet3 == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar4.f13229c = emptySet3;
                aVar4.f13227a = 86400000L;
                aVar4.f13228b = 86400000L;
                Set<e.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.b.DEVICE_IDLE)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                aVar4.f13229c = unmodifiableSet;
                hashMap.put(eVar3, aVar4.a());
                if (aVar == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (hashMap.keySet().size() < h3.e.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new q3.b(aVar, hashMap);
            default:
                String packageName = ((Context) this.f12990b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
