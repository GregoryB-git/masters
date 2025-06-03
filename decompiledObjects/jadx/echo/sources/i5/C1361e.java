package i5;

import A5.a;
import E5.j;
import E5.k;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import i5.C1361e;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;

/* renamed from: i5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1361e implements k.c, A5.a {

    /* renamed from: a, reason: collision with root package name */
    public k f14885a;

    /* renamed from: b, reason: collision with root package name */
    public C1357a f14886b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f14887c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f14888d;

    /* renamed from: i5.e$a */
    public static class a implements k.d {

        /* renamed from: a, reason: collision with root package name */
        public final k.d f14889a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f14890b = new Handler(Looper.getMainLooper());

        public a(k.d dVar) {
            this.f14889a = dVar;
        }

        @Override // E5.k.d
        public void a(final Object obj) {
            this.f14890b.post(new Runnable() { // from class: i5.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1361e.a.this.g(obj);
                }
            });
        }

        @Override // E5.k.d
        public void b(final String str, final String str2, final Object obj) {
            this.f14890b.post(new Runnable() { // from class: i5.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1361e.a.this.f(str, str2, obj);
                }
            });
        }

        @Override // E5.k.d
        public void c() {
            Handler handler = this.f14890b;
            final k.d dVar = this.f14889a;
            Objects.requireNonNull(dVar);
            handler.post(new Runnable() { // from class: i5.b
                @Override // java.lang.Runnable
                public final void run() {
                    k.d.this.c();
                }
            });
        }

        public final /* synthetic */ void f(String str, String str2, Object obj) {
            this.f14889a.b(str, str2, obj);
        }

        public final /* synthetic */ void g(Object obj) {
            this.f14889a.a(obj);
        }
    }

    /* renamed from: i5.e$b */
    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final j f14891o;

        /* renamed from: p, reason: collision with root package name */
        public final k.d f14892p;

        public b(j jVar, k.d dVar) {
            this.f14891o = jVar;
            this.f14892p = dVar;
        }

        public final void a(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            this.f14892p.b("Exception encountered", this.f14891o.f1670a, stringWriter.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            Exception e7;
            k.d dVar;
            Object l7;
            k.d dVar2;
            char c7 = 0;
            try {
                try {
                    C1361e.this.f14886b.f14872e = (Map) ((Map) this.f14891o.f1671b).get("options");
                    z7 = C1361e.this.f14886b.g();
                } catch (Exception e8) {
                    z7 = false;
                    e7 = e8;
                }
                try {
                    String str = this.f14891o.f1670a;
                    switch (str.hashCode()) {
                        case -1335458389:
                            if (str.equals("delete")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -358737930:
                            if (str.equals("deleteAll")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 113399775:
                            if (str.equals("write")) {
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 208013248:
                            if (str.equals("containsKey")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1080375339:
                            if (str.equals("readAll")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    Map map = null;
                    if (c7 == 0) {
                        String e9 = C1361e.this.e(this.f14891o);
                        String f7 = C1361e.this.f(this.f14891o);
                        if (f7 == null) {
                            this.f14892p.b("null", null, null);
                            return;
                        } else {
                            C1361e.this.f14886b.n(e9, f7);
                            dVar = this.f14892p;
                        }
                    } else if (c7 == 1) {
                        String e10 = C1361e.this.e(this.f14891o);
                        if (C1361e.this.f14886b.b(e10)) {
                            l7 = C1361e.this.f14886b.l(e10);
                            dVar2 = this.f14892p;
                            dVar2.a(l7);
                            return;
                        }
                        dVar = this.f14892p;
                    } else if (c7 == 2) {
                        dVar = this.f14892p;
                        map = C1361e.this.f14886b.m();
                    } else {
                        if (c7 == 3) {
                            boolean b7 = C1361e.this.f14886b.b(C1361e.this.e(this.f14891o));
                            dVar2 = this.f14892p;
                            l7 = Boolean.valueOf(b7);
                            dVar2.a(l7);
                            return;
                        }
                        if (c7 == 4) {
                            C1361e.this.f14886b.d(C1361e.this.e(this.f14891o));
                            dVar = this.f14892p;
                        } else if (c7 != 5) {
                            this.f14892p.c();
                            return;
                        } else {
                            C1361e.this.f14886b.e();
                            dVar = this.f14892p;
                        }
                    }
                    dVar.a(map);
                } catch (Exception e11) {
                    e7 = e11;
                    if (z7) {
                        try {
                            C1361e.this.f14886b.e();
                            this.f14892p.a("Data has been reset");
                            return;
                        } catch (Exception e12) {
                            e7 = e12;
                            a(e7);
                        }
                    }
                    a(e7);
                }
            } catch (FileNotFoundException e13) {
                Log.i("Creating sharedPrefs", e13.getLocalizedMessage());
            }
        }
    }

    public final String d(String str) {
        return this.f14886b.f14871d + "_" + str;
    }

    public final String e(j jVar) {
        return d((String) ((Map) jVar.f1671b).get("key"));
    }

    public final String f(j jVar) {
        return (String) ((Map) jVar.f1671b).get("value");
    }

    public void g(E5.c cVar, Context context) {
        try {
            this.f14886b = new C1357a(context);
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f14887c = handlerThread;
            handlerThread.start();
            this.f14888d = new Handler(this.f14887c.getLooper());
            k kVar = new k(cVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f14885a = kVar;
            kVar.e(this);
        } catch (Exception e7) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e7);
        }
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        g(bVar.b(), bVar.a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f14885a != null) {
            this.f14887c.quitSafely();
            this.f14887c = null;
            this.f14885a.e(null);
            this.f14885a = null;
        }
        this.f14886b = null;
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        this.f14888d.post(new b(jVar, new a(dVar)));
    }
}
