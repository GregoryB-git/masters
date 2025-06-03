package b9;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, y8.d<?>> f2157a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, y8.f<?>> f2158b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.d<Object> f2159c;

    public static final class a implements z8.a<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2160a = new y8.d() { // from class: b9.f
            @Override // y8.a
            public final void a(Object obj, y8.e eVar) {
                StringBuilder l10 = defpackage.f.l("Couldn't find encoder for type ");
                l10.append(obj.getClass().getCanonicalName());
                throw new y8.b(l10.toString());
            }
        };
    }

    public g(HashMap hashMap, HashMap hashMap2, f fVar) {
        this.f2157a = hashMap;
        this.f2158b = hashMap2;
        this.f2159c = fVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, y8.d<?>> map = this.f2157a;
        e eVar = new e(byteArrayOutputStream, map, this.f2158b, this.f2159c);
        if (obj == null) {
            return;
        }
        y8.d<?> dVar = map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            StringBuilder l10 = defpackage.f.l("No encoder for ");
            l10.append(obj.getClass());
            throw new y8.b(l10.toString());
        }
    }
}
