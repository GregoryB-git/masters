package m4;

import j4.C1376b;
import j4.C1377c;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m4.InterfaceC1676d;

/* renamed from: m4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1678f implements j4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f17754f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final C1377c f17755g = C1377c.a("key").b(C1673a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    public static final C1377c f17756h = C1377c.a("value").b(C1673a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    public static final j4.d f17757i = new j4.d() { // from class: m4.e
        @Override // j4.d
        public final void a(Object obj, Object obj2) {
            C1678f.w((Map.Entry) obj, (j4.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f17758a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17759b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f17760c;

    /* renamed from: d, reason: collision with root package name */
    public final j4.d f17761d;

    /* renamed from: e, reason: collision with root package name */
    public final C1681i f17762e = new C1681i(this);

    /* renamed from: m4.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17763a;

        static {
            int[] iArr = new int[InterfaceC1676d.a.values().length];
            f17763a = iArr;
            try {
                iArr[InterfaceC1676d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17763a[InterfaceC1676d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17763a[InterfaceC1676d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C1678f(OutputStream outputStream, Map map, Map map2, j4.d dVar) {
        this.f17758a = outputStream;
        this.f17759b = map;
        this.f17760c = map2;
        this.f17761d = dVar;
    }

    public static ByteBuffer p(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static InterfaceC1676d u(C1377c c1377c) {
        InterfaceC1676d interfaceC1676d = (InterfaceC1676d) c1377c.c(InterfaceC1676d.class);
        if (interfaceC1676d != null) {
            return interfaceC1676d;
        }
        throw new C1376b("Field has no @Protobuf config");
    }

    public static int v(C1377c c1377c) {
        InterfaceC1676d interfaceC1676d = (InterfaceC1676d) c1377c.c(InterfaceC1676d.class);
        if (interfaceC1676d != null) {
            return interfaceC1676d.tag();
        }
        throw new C1376b("Field has no @Protobuf config");
    }

    public static /* synthetic */ void w(Map.Entry entry, j4.e eVar) {
        eVar.g(f17755g, entry.getKey());
        eVar.g(f17756h, entry.getValue());
    }

    @Override // j4.e
    public j4.e a(C1377c c1377c, double d7) {
        return e(c1377c, d7, true);
    }

    public j4.e e(C1377c c1377c, double d7, boolean z7) {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        x((v(c1377c) << 3) | 1);
        this.f17758a.write(p(8).putDouble(d7).array());
        return this;
    }

    @Override // j4.e
    public j4.e g(C1377c c1377c, Object obj) {
        return i(c1377c, obj, true);
    }

    public j4.e h(C1377c c1377c, float f7, boolean z7) {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        x((v(c1377c) << 3) | 5);
        this.f17758a.write(p(4).putFloat(f7).array());
        return this;
    }

    public j4.e i(C1377c c1377c, Object obj, boolean z7) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            x((v(c1377c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f17754f);
            x(bytes.length);
            this.f17758a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(c1377c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f17757i, c1377c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return e(c1377c, ((Double) obj).doubleValue(), z7);
        }
        if (obj instanceof Float) {
            return h(c1377c, ((Float) obj).floatValue(), z7);
        }
        if (obj instanceof Number) {
            return m(c1377c, ((Number) obj).longValue(), z7);
        }
        if (obj instanceof Boolean) {
            return o(c1377c, ((Boolean) obj).booleanValue(), z7);
        }
        if (!(obj instanceof byte[])) {
            j4.d dVar = (j4.d) this.f17759b.get(obj.getClass());
            if (dVar != null) {
                return r(dVar, c1377c, obj, z7);
            }
            j4.f fVar = (j4.f) this.f17760c.get(obj.getClass());
            return fVar != null ? s(fVar, c1377c, obj, z7) : obj instanceof InterfaceC1675c ? c(c1377c, ((InterfaceC1675c) obj).g()) : obj instanceof Enum ? c(c1377c, ((Enum) obj).ordinal()) : r(this.f17761d, c1377c, obj, z7);
        }
        byte[] bArr = (byte[]) obj;
        if (z7 && bArr.length == 0) {
            return this;
        }
        x((v(c1377c) << 3) | 2);
        x(bArr.length);
        this.f17758a.write(bArr);
        return this;
    }

    @Override // j4.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1678f c(C1377c c1377c, int i7) {
        return k(c1377c, i7, true);
    }

    public C1678f k(C1377c c1377c, int i7, boolean z7) {
        if (z7 && i7 == 0) {
            return this;
        }
        InterfaceC1676d u7 = u(c1377c);
        int i8 = a.f17763a[u7.intEncoding().ordinal()];
        if (i8 == 1) {
            x(u7.tag() << 3);
            x(i7);
        } else if (i8 == 2) {
            x(u7.tag() << 3);
            x((i7 << 1) ^ (i7 >> 31));
        } else if (i8 == 3) {
            x((u7.tag() << 3) | 5);
            this.f17758a.write(p(4).putInt(i7).array());
        }
        return this;
    }

    @Override // j4.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1678f b(C1377c c1377c, long j7) {
        return m(c1377c, j7, true);
    }

    public C1678f m(C1377c c1377c, long j7, boolean z7) {
        if (z7 && j7 == 0) {
            return this;
        }
        InterfaceC1676d u7 = u(c1377c);
        int i7 = a.f17763a[u7.intEncoding().ordinal()];
        if (i7 == 1) {
            x(u7.tag() << 3);
            y(j7);
        } else if (i7 == 2) {
            x(u7.tag() << 3);
            y((j7 >> 63) ^ (j7 << 1));
        } else if (i7 == 3) {
            x((u7.tag() << 3) | 1);
            this.f17758a.write(p(8).putLong(j7).array());
        }
        return this;
    }

    @Override // j4.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1678f f(C1377c c1377c, boolean z7) {
        return o(c1377c, z7, true);
    }

    public C1678f o(C1377c c1377c, boolean z7, boolean z8) {
        return k(c1377c, z7 ? 1 : 0, z8);
    }

    public final long q(j4.d dVar, Object obj) {
        C1674b c1674b = new C1674b();
        try {
            OutputStream outputStream = this.f17758a;
            this.f17758a = c1674b;
            try {
                dVar.a(obj, this);
                this.f17758a = outputStream;
                long a7 = c1674b.a();
                c1674b.close();
                return a7;
            } catch (Throwable th) {
                this.f17758a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1674b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final C1678f r(j4.d dVar, C1377c c1377c, Object obj, boolean z7) {
        long q7 = q(dVar, obj);
        if (z7 && q7 == 0) {
            return this;
        }
        x((v(c1377c) << 3) | 2);
        y(q7);
        dVar.a(obj, this);
        return this;
    }

    public final C1678f s(j4.f fVar, C1377c c1377c, Object obj, boolean z7) {
        this.f17762e.b(c1377c, z7);
        fVar.a(obj, this.f17762e);
        return this;
    }

    public C1678f t(Object obj) {
        if (obj == null) {
            return this;
        }
        j4.d dVar = (j4.d) this.f17759b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new C1376b("No encoder for " + obj.getClass());
    }

    public final void x(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f17758a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f17758a.write(i7 & 127);
    }

    public final void y(long j7) {
        while (((-128) & j7) != 0) {
            this.f17758a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f17758a.write(((int) j7) & 127);
    }
}
