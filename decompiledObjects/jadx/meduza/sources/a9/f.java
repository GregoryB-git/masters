package a9;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements y8.e, y8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f247a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f248b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, y8.d<?>> f249c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, y8.f<?>> f250d;

    /* renamed from: e, reason: collision with root package name */
    public final y8.d<Object> f251e;
    public final boolean f;

    public f(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f248b = new JsonWriter(writer);
        this.f249c = hashMap;
        this.f250d = hashMap2;
        this.f251e = aVar;
        this.f = z10;
    }

    @Override // y8.e
    public final y8.e a(y8.c cVar, boolean z10) {
        String str = cVar.f17447a;
        j();
        this.f248b.name(str);
        j();
        this.f248b.value(z10);
        return this;
    }

    @Override // y8.e
    public final y8.e b(y8.c cVar, double d10) {
        String str = cVar.f17447a;
        j();
        this.f248b.name(str);
        j();
        this.f248b.value(d10);
        return this;
    }

    @Override // y8.e
    public final y8.e c(y8.c cVar, int i10) {
        String str = cVar.f17447a;
        j();
        this.f248b.name(str);
        j();
        this.f248b.value(i10);
        return this;
    }

    @Override // y8.e
    public final y8.e d(y8.c cVar, long j10) {
        String str = cVar.f17447a;
        j();
        this.f248b.name(str);
        j();
        this.f248b.value(j10);
        return this;
    }

    @Override // y8.e
    public final y8.e e(y8.c cVar, Object obj) {
        return i(obj, cVar.f17447a);
    }

    @Override // y8.g
    public final y8.g f(String str) {
        j();
        this.f248b.value(str);
        return this;
    }

    @Override // y8.g
    public final y8.g g(boolean z10) {
        j();
        this.f248b.value(z10);
        return this;
    }

    public final f h(Object obj) {
        if (obj == null) {
            this.f248b.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f248b.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f248b.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                this.f248b.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f248b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new y8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f248b.endObject();
                return this;
            }
            y8.d<?> dVar = this.f249c.get(obj.getClass());
            if (dVar != null) {
                this.f248b.beginObject();
                dVar.a(obj, this);
                this.f248b.endObject();
                return this;
            }
            y8.f<?> fVar = this.f250d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                y8.d<Object> dVar2 = this.f251e;
                this.f248b.beginObject();
                dVar2.a(obj, this);
                this.f248b.endObject();
                return this;
            }
            if (obj instanceof g) {
                int a10 = ((g) obj).a();
                j();
                this.f248b.value(a10);
            } else {
                String name = ((Enum) obj).name();
                j();
                this.f248b.value(name);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            this.f248b.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        this.f248b.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f248b.value(r7[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                j();
                this.f248b.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f248b.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f248b.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                h(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                h(objArr[i10]);
                i10++;
            }
        }
        this.f248b.endArray();
        return this;
    }

    public final f i(Object obj, String str) {
        if (this.f) {
            if (obj == null) {
                return this;
            }
            j();
            this.f248b.name(str);
            return h(obj);
        }
        j();
        this.f248b.name(str);
        if (obj != null) {
            return h(obj);
        }
        this.f248b.nullValue();
        return this;
    }

    public final void j() {
        if (!this.f247a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
