package y2;

import A2.AbstractC0317c;
import A2.AbstractC0328n;
import A2.C0318d;
import E2.l;
import V2.AbstractC0659j;
import V2.C0660k;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import y2.C2270a;
import z2.AbstractC2310m;
import z2.AbstractServiceConnectionC2306i;
import z2.C2294C;
import z2.C2298a;
import z2.C2299b;
import z2.C2302e;
import z2.C2313p;
import z2.C2320x;
import z2.InterfaceC2309l;
import z2.M;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21416b;

    /* renamed from: c, reason: collision with root package name */
    public final C2270a f21417c;

    /* renamed from: d, reason: collision with root package name */
    public final C2270a.d f21418d;

    /* renamed from: e, reason: collision with root package name */
    public final C2299b f21419e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f21420f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21421g;

    /* renamed from: h, reason: collision with root package name */
    public final e f21422h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2309l f21423i;

    /* renamed from: j, reason: collision with root package name */
    public final C2302e f21424j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f21425c = new C0302a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2309l f21426a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f21427b;

        /* renamed from: y2.d$a$a, reason: collision with other inner class name */
        public static class C0302a {

            /* renamed from: a, reason: collision with root package name */
            public InterfaceC2309l f21428a;

            /* renamed from: b, reason: collision with root package name */
            public Looper f21429b;

            public a a() {
                if (this.f21428a == null) {
                    this.f21428a = new C2298a();
                }
                if (this.f21429b == null) {
                    this.f21429b = Looper.getMainLooper();
                }
                return new a(this.f21428a, this.f21429b);
            }
        }

        public a(InterfaceC2309l interfaceC2309l, Account account, Looper looper) {
            this.f21426a = interfaceC2309l;
            this.f21427b = looper;
        }
    }

    public d(Context context, Activity activity, C2270a c2270a, C2270a.d dVar, a aVar) {
        AbstractC0328n.j(context, "Null context is not permitted.");
        AbstractC0328n.j(c2270a, "Api must not be null.");
        AbstractC0328n.j(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f21415a = context.getApplicationContext();
        String str = null;
        if (l.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f21416b = str;
        this.f21417c = c2270a;
        this.f21418d = dVar;
        this.f21420f = aVar.f21427b;
        C2299b a7 = C2299b.a(c2270a, dVar, str);
        this.f21419e = a7;
        this.f21422h = new C2294C(this);
        C2302e x7 = C2302e.x(this.f21415a);
        this.f21424j = x7;
        this.f21421g = x7.m();
        this.f21423i = aVar.f21426a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2313p.u(activity, x7, a7);
        }
        x7.b(this);
    }

    public C0318d.a b() {
        C0318d.a aVar = new C0318d.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f21415a.getClass().getName());
        aVar.b(this.f21415a.getPackageName());
        return aVar;
    }

    public AbstractC0659j c(AbstractC2310m abstractC2310m) {
        return i(2, abstractC2310m);
    }

    public final C2299b d() {
        return this.f21419e;
    }

    public String e() {
        return this.f21416b;
    }

    public final int f() {
        return this.f21421g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C2270a.f g(Looper looper, C2320x c2320x) {
        C2270a.f a7 = ((C2270a.AbstractC0301a) AbstractC0328n.i(this.f21417c.a())).a(this.f21415a, looper, b().a(), this.f21418d, c2320x, c2320x);
        String e7 = e();
        if (e7 != null && (a7 instanceof AbstractC0317c)) {
            ((AbstractC0317c) a7).P(e7);
        }
        if (e7 == null || !(a7 instanceof AbstractServiceConnectionC2306i)) {
            return a7;
        }
        throw null;
    }

    public final M h(Context context, Handler handler) {
        return new M(context, handler, b().a());
    }

    public final AbstractC0659j i(int i7, AbstractC2310m abstractC2310m) {
        C0660k c0660k = new C0660k();
        this.f21424j.D(this, i7, abstractC2310m, c0660k, this.f21423i);
        return c0660k.a();
    }

    public d(Context context, C2270a c2270a, C2270a.d dVar, a aVar) {
        this(context, null, c2270a, dVar, aVar);
    }
}
