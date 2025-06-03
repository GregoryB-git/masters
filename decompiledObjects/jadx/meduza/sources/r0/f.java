package r0;

import ec.i;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import n7.w;
import o0.m;
import o0.q;
import q0.d;
import q0.e;
import q0.f;
import q0.g;
import r0.d;
import rb.h;
import s0.j;
import s0.x;
import s0.y;
import sb.q;

/* loaded from: classes.dex */
public final class f implements m<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f13517a = new f();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13518a;

        static {
            int[] iArr = new int[defpackage.f._values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f13518a = iArr;
        }
    }

    @Override // o0.m
    public final r0.a a() {
        return new r0.a(true, 1);
    }

    @Override // o0.m
    public final r0.a b(FileInputStream fileInputStream) {
        d.a<?> aVar;
        Object valueOf;
        d.a<?> j10;
        Object valueOf2;
        try {
            q0.d t = q0.d.t(fileInputStream);
            r0.a aVar2 = new r0.a(false, 1);
            d.b[] bVarArr = (d.b[]) Arrays.copyOf(new d.b[0], 0);
            i.e(bVarArr, "pairs");
            aVar2.c();
            if (bVarArr.length > 0) {
                bVarArr[0].getClass();
                aVar2.e(null, null);
                throw null;
            }
            Map<String, q0.f> r10 = t.r();
            i.d(r10, "preferencesProto.preferencesMap");
            for (Map.Entry<String, q0.f> entry : r10.entrySet()) {
                String key = entry.getKey();
                q0.f value = entry.getValue();
                i.d(key, "name");
                i.d(value, "value");
                int F = value.F();
                switch (F == 0 ? -1 : a.f13518a[g.c(F)]) {
                    case -1:
                        throw new o0.a("Value case is null.");
                    case 0:
                    default:
                        throw new w();
                    case 1:
                        j10 = x6.b.j(key);
                        valueOf2 = Boolean.valueOf(value.x());
                        aVar2.e(j10, valueOf2);
                    case 2:
                        aVar = new d.a<>(key);
                        valueOf = Float.valueOf(value.A());
                        aVar2.e(aVar, valueOf);
                    case 3:
                        aVar = new d.a<>(key);
                        valueOf = Double.valueOf(value.z());
                        aVar2.e(aVar, valueOf);
                    case 4:
                        aVar = new d.a<>(key);
                        valueOf = Integer.valueOf(value.B());
                        aVar2.e(aVar, valueOf);
                    case 5:
                        aVar = new d.a<>(key);
                        valueOf = Long.valueOf(value.C());
                        aVar2.e(aVar, valueOf);
                    case 6:
                        j10 = x6.b.u0(key);
                        valueOf2 = value.D();
                        i.d(valueOf2, "value.string");
                        aVar2.e(j10, valueOf2);
                    case 7:
                        aVar = new d.a<>(key);
                        x.c s10 = value.E().s();
                        i.d(s10, "value.stringSet.stringsList");
                        valueOf = q.x(s10);
                        aVar2.e(aVar, valueOf);
                    case 8:
                        throw new o0.a("Value not set.");
                }
            }
            return new r0.a((Map<d.a<?>, Object>) new LinkedHashMap(aVar2.a()), true);
        } catch (y e10) {
            throw new o0.a(e10);
        }
    }

    @Override // o0.m
    public final h c(Object obj, q.b bVar) {
        f.a G;
        Map<d.a<?>, Object> a10 = ((d) obj).a();
        d.a s10 = q0.d.s();
        for (Map.Entry<d.a<?>, Object> entry : a10.entrySet()) {
            d.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f13513a;
            if (value instanceof Boolean) {
                G = q0.f.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.j();
                q0.f.u((q0.f) G.f14107b, booleanValue);
            } else if (value instanceof Float) {
                G = q0.f.G();
                float floatValue = ((Number) value).floatValue();
                G.j();
                q0.f.v((q0.f) G.f14107b, floatValue);
            } else if (value instanceof Double) {
                G = q0.f.G();
                double doubleValue = ((Number) value).doubleValue();
                G.j();
                q0.f.s((q0.f) G.f14107b, doubleValue);
            } else if (value instanceof Integer) {
                G = q0.f.G();
                int intValue = ((Number) value).intValue();
                G.j();
                q0.f.w((q0.f) G.f14107b, intValue);
            } else if (value instanceof Long) {
                G = q0.f.G();
                long longValue = ((Number) value).longValue();
                G.j();
                q0.f.p((q0.f) G.f14107b, longValue);
            } else if (value instanceof String) {
                G = q0.f.G();
                G.j();
                q0.f.q((q0.f) G.f14107b, (String) value);
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(i.h(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                G = q0.f.G();
                e.a t = q0.e.t();
                t.j();
                q0.e.q((q0.e) t.f14107b, (Set) value);
                G.j();
                q0.f.r((q0.f) G.f14107b, t);
            }
            q0.f h10 = G.h();
            s10.getClass();
            str.getClass();
            s10.j();
            q0.d.q((q0.d) s10.f14107b).put(str, h10);
        }
        q0.d h11 = s10.h();
        int d10 = h11.d();
        Logger logger = j.f14024c;
        if (d10 > 4096) {
            d10 = 4096;
        }
        j.d dVar = new j.d(bVar, d10);
        h11.g(dVar);
        if (dVar.f14028g > 0) {
            dVar.u0();
        }
        return h.f13851a;
    }
}
