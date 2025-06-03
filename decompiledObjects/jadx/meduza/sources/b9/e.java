package b9;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements y8.e {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final y8.c f2149g = new y8.c(Constants.KEY, defpackage.g.i(defpackage.f.n(d.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final y8.c f2150h = new y8.c("value", defpackage.g.i(defpackage.f.n(d.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final a9.a f2151i = new a9.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f2152a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, y8.d<?>> f2153b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, y8.f<?>> f2154c;

    /* renamed from: d, reason: collision with root package name */
    public final y8.d<Object> f2155d;

    /* renamed from: e, reason: collision with root package name */
    public final h f2156e = new h(this);

    public e(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, y8.d dVar) {
        this.f2152a = byteArrayOutputStream;
        this.f2153b = map;
        this.f2154c = map2;
        this.f2155d = dVar;
    }

    public static int j(y8.c cVar) {
        d dVar = (d) ((Annotation) cVar.f17448b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f2145a;
        }
        throw new y8.b("Field has no @Protobuf config");
    }

    @Override // y8.e
    public final y8.e a(y8.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override // y8.e
    public final y8.e b(y8.c cVar, double d10) {
        g(cVar, d10, true);
        return this;
    }

    @Override // y8.e
    public final y8.e c(y8.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // y8.e
    public final y8.e d(y8.c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) ((Annotation) cVar.f17448b.get(d.class));
            if (dVar == null) {
                throw new y8.b("Field has no @Protobuf config");
            }
            k(((a) dVar).f2145a << 3);
            l(j10);
        }
        return this;
    }

    @Override // y8.e
    public final y8.e e(y8.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    public final e f(y8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.f2152a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f2151i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            g(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                k((j(cVar) << 3) | 5);
                this.f2152a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z10 || longValue != 0) {
                d dVar = (d) ((Annotation) cVar.f17448b.get(d.class));
                if (dVar == null) {
                    throw new y8.b("Field has no @Protobuf config");
                }
                k(((a) dVar).f2145a << 3);
                l(longValue);
            }
            return this;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f2152a.write(bArr);
            return this;
        }
        y8.d<?> dVar2 = this.f2153b.get(obj.getClass());
        if (dVar2 != null) {
            i(dVar2, cVar, obj, z10);
            return this;
        }
        y8.f<?> fVar = this.f2154c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f2156e;
            hVar.f2161a = false;
            hVar.f2163c = cVar;
            hVar.f2162b = z10;
            fVar.a(obj, hVar);
            return this;
        }
        if (obj instanceof c) {
            h(cVar, ((c) obj).a(), true);
            return this;
        }
        if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        i(this.f2155d, cVar, obj, z10);
        return this;
    }

    public final void g(y8.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f2152a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void h(y8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f17448b.get(d.class));
        if (dVar == null) {
            throw new y8.b("Field has no @Protobuf config");
        }
        k(((a) dVar).f2145a << 3);
        k(i10);
    }

    public final void i(y8.d dVar, y8.c cVar, Object obj, boolean z10) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f2152a;
            this.f2152a = bVar;
            try {
                dVar.a(obj, this);
                this.f2152a = outputStream;
                long j10 = bVar.f2146a;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f2152a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f2152a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f2152a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f2152a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f2152a.write(((int) j10) & 127);
    }
}
