package l4;

import j4.C1376b;
import j4.InterfaceC1375a;
import j4.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k4.InterfaceC1471a;
import k4.InterfaceC1472b;

/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610d implements InterfaceC1472b {

    /* renamed from: e, reason: collision with root package name */
    public static final j4.d f17234e = new j4.d() { // from class: l4.a
        @Override // j4.d
        public final void a(Object obj, Object obj2) {
            C1610d.l(obj, (j4.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final j4.f f17235f = new j4.f() { // from class: l4.b
        @Override // j4.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).d((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final j4.f f17236g = new j4.f() { // from class: l4.c
        @Override // j4.f
        public final void a(Object obj, Object obj2) {
            C1610d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final b f17237h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f17238a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f17239b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public j4.d f17240c = f17234e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17241d = false;

    /* renamed from: l4.d$a */
    public class a implements InterfaceC1375a {
        public a() {
        }

        @Override // j4.InterfaceC1375a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // j4.InterfaceC1375a
        public void b(Object obj, Writer writer) {
            C1611e c1611e = new C1611e(writer, C1610d.this.f17238a, C1610d.this.f17239b, C1610d.this.f17240c, C1610d.this.f17241d);
            c1611e.k(obj, false);
            c1611e.u();
        }
    }

    /* renamed from: l4.d$b */
    public static final class b implements j4.f {

        /* renamed from: a, reason: collision with root package name */
        public static final DateFormat f17243a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f17243a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // j4.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.d(f17243a.format(date));
        }
    }

    public C1610d() {
        p(String.class, f17235f);
        p(Boolean.class, f17236g);
        p(Date.class, f17237h);
    }

    public static /* synthetic */ void l(Object obj, j4.e eVar) {
        throw new C1376b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.e(bool.booleanValue());
    }

    public InterfaceC1375a i() {
        return new a();
    }

    public C1610d j(InterfaceC1471a interfaceC1471a) {
        interfaceC1471a.a(this);
        return this;
    }

    public C1610d k(boolean z7) {
        this.f17241d = z7;
        return this;
    }

    @Override // k4.InterfaceC1472b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C1610d a(Class cls, j4.d dVar) {
        this.f17238a.put(cls, dVar);
        this.f17239b.remove(cls);
        return this;
    }

    public C1610d p(Class cls, j4.f fVar) {
        this.f17239b.put(cls, fVar);
        this.f17238a.remove(cls);
        return this;
    }
}
