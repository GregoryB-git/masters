package a9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class e implements z8.a<e> {

    /* renamed from: e, reason: collision with root package name */
    public static final a9.a f239e = new a9.a(0);
    public static final b f = new y8.f() { // from class: a9.b
        @Override // y8.a
        public final void a(Object obj, y8.g gVar) {
            gVar.f((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final c f240g = new y8.f() { // from class: a9.c
        @Override // y8.a
        public final void a(Object obj, y8.g gVar) {
            gVar.g(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final a f241h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f242a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f243b;

    /* renamed from: c, reason: collision with root package name */
    public a9.a f244c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f245d;

    public static final class a implements y8.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f246a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f246a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // y8.a
        public final void a(Object obj, y8.g gVar) {
            gVar.f(f246a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f242a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f243b = hashMap2;
        this.f244c = f239e;
        this.f245d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f240g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f241h);
        hashMap.remove(Date.class);
    }

    public final z8.a a(Class cls, y8.d dVar) {
        this.f242a.put(cls, dVar);
        this.f243b.remove(cls);
        return this;
    }
}
