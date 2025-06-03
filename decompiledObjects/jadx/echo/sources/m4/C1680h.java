package m4;

import j4.C1376b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import k4.InterfaceC1471a;
import k4.InterfaceC1472b;
import m4.C1680h;

/* renamed from: m4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1680h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17764a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17765b;

    /* renamed from: c, reason: collision with root package name */
    public final j4.d f17766c;

    /* renamed from: m4.h$a */
    public static final class a implements InterfaceC1472b {

        /* renamed from: d, reason: collision with root package name */
        public static final j4.d f17767d = new j4.d() { // from class: m4.g
            @Override // j4.d
            public final void a(Object obj, Object obj2) {
                C1680h.a.e(obj, (j4.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Map f17768a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f17769b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public j4.d f17770c = f17767d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, j4.e eVar) {
            throw new C1376b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public C1680h c() {
            return new C1680h(new HashMap(this.f17768a), new HashMap(this.f17769b), this.f17770c);
        }

        public a d(InterfaceC1471a interfaceC1471a) {
            interfaceC1471a.a(this);
            return this;
        }

        @Override // k4.InterfaceC1472b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, j4.d dVar) {
            this.f17768a.put(cls, dVar);
            this.f17769b.remove(cls);
            return this;
        }
    }

    public C1680h(Map map, Map map2, j4.d dVar) {
        this.f17764a = map;
        this.f17765b = map2;
        this.f17766c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new C1678f(outputStream, this.f17764a, this.f17765b, this.f17766c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
