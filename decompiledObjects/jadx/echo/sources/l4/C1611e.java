package l4;

import android.util.Base64;
import android.util.JsonWriter;
import j4.C1376b;
import j4.C1377c;
import j4.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611e implements j4.e, g {

    /* renamed from: a, reason: collision with root package name */
    public C1611e f17244a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17245b = true;

    /* renamed from: c, reason: collision with root package name */
    public final JsonWriter f17246c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f17247d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f17248e;

    /* renamed from: f, reason: collision with root package name */
    public final j4.d f17249f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17250g;

    public C1611e(Writer writer, Map map, Map map2, j4.d dVar, boolean z7) {
        this.f17246c = new JsonWriter(writer);
        this.f17247d = map;
        this.f17248e = map2;
        this.f17249f = dVar;
        this.f17250g = z7;
    }

    @Override // j4.e
    public j4.e a(C1377c c1377c, double d7) {
        return m(c1377c.b(), d7);
    }

    @Override // j4.e
    public j4.e b(C1377c c1377c, long j7) {
        return o(c1377c.b(), j7);
    }

    @Override // j4.e
    public j4.e c(C1377c c1377c, int i7) {
        return n(c1377c.b(), i7);
    }

    @Override // j4.e
    public j4.e f(C1377c c1377c, boolean z7) {
        return q(c1377c.b(), z7);
    }

    @Override // j4.e
    public j4.e g(C1377c c1377c, Object obj) {
        return p(c1377c.b(), obj);
    }

    public C1611e h(double d7) {
        y();
        this.f17246c.value(d7);
        return this;
    }

    public C1611e i(int i7) {
        y();
        this.f17246c.value(i7);
        return this;
    }

    public C1611e j(long j7) {
        y();
        this.f17246c.value(j7);
        return this;
    }

    public C1611e k(Object obj, boolean z7) {
        int i7 = 0;
        if (z7 && t(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C1376b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f17246c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f17246c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f17246c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f17246c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f17246c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e7) {
                        throw new C1376b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                this.f17246c.endObject();
                return this;
            }
            j4.d dVar = (j4.d) this.f17247d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z7);
            }
            j4.f fVar = (j4.f) this.f17248e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f17249f, obj, z7);
            }
            if (obj instanceof InterfaceC1612f) {
                i(((InterfaceC1612f) obj).g());
            } else {
                d(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f17246c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                this.f17246c.value(r7[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                j(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f17246c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f17246c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f17246c.endArray();
        return this;
    }

    @Override // j4.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1611e d(String str) {
        y();
        this.f17246c.value(str);
        return this;
    }

    public C1611e m(String str, double d7) {
        y();
        this.f17246c.name(str);
        return h(d7);
    }

    public C1611e n(String str, int i7) {
        y();
        this.f17246c.name(str);
        return i(i7);
    }

    public C1611e o(String str, long j7) {
        y();
        this.f17246c.name(str);
        return j(j7);
    }

    public C1611e p(String str, Object obj) {
        return this.f17250g ? x(str, obj) : w(str, obj);
    }

    public C1611e q(String str, boolean z7) {
        y();
        this.f17246c.name(str);
        return e(z7);
    }

    @Override // j4.g
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C1611e e(boolean z7) {
        y();
        this.f17246c.value(z7);
        return this;
    }

    public C1611e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f17246c.nullValue();
        } else {
            this.f17246c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void u() {
        y();
        this.f17246c.flush();
    }

    public C1611e v(j4.d dVar, Object obj, boolean z7) {
        if (!z7) {
            this.f17246c.beginObject();
        }
        dVar.a(obj, this);
        if (!z7) {
            this.f17246c.endObject();
        }
        return this;
    }

    public final C1611e w(String str, Object obj) {
        y();
        this.f17246c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f17246c.nullValue();
        return this;
    }

    public final C1611e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f17246c.name(str);
        return k(obj, false);
    }

    public final void y() {
        if (!this.f17245b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C1611e c1611e = this.f17244a;
        if (c1611e != null) {
            c1611e.y();
            this.f17244a.f17245b = false;
            this.f17244a = null;
            this.f17246c.endObject();
        }
    }
}
