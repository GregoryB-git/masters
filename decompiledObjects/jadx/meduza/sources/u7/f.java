package u7;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import d8.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l6.b;
import m6.h;
import r.g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f15082k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final r.b f15083l = new r.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15085b;

    /* renamed from: c, reason: collision with root package name */
    public final j f15086c;

    /* renamed from: d, reason: collision with root package name */
    public final d8.i f15087d;

    /* renamed from: g, reason: collision with root package name */
    public final o<y9.a> f15089g;

    /* renamed from: h, reason: collision with root package name */
    public final t9.b<q9.c> f15090h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15088e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f15091i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f15092j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    public static class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public static AtomicReference<b> f15093a = new AtomicReference<>();

        @Override // l6.b.a
        public final void a(boolean z10) {
            synchronized (f.f15082k) {
                Iterator it = new ArrayList(f.f15083l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f15088e.get()) {
                        fVar.l(z10);
                    }
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static AtomicReference<c> f15094b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f15095a;

        public c(Context context) {
            this.f15095a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (f.f15082k) {
                Iterator it = ((g.e) f.f15083l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).h();
                }
            }
            this.f15095a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[LOOP:0: B:11:0x00b7->B:13:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r9, u7.j r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.<init>(android.content.Context, u7.j, java.lang.String):void");
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f15082k) {
            Iterator it = ((g.e) f15083l.values()).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.a();
                arrayList.add(fVar.f15085b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f e() {
        f fVar;
        synchronized (f15082k) {
            fVar = (f) f15083l.getOrDefault("[DEFAULT]", null);
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + v6.f.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            fVar.f15090h.get().c();
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f f(String str) {
        f fVar;
        String str2;
        synchronized (f15082k) {
            fVar = (f) f15083l.getOrDefault(str.trim(), null);
            if (fVar == null) {
                ArrayList d10 = d();
                if (d10.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", d10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            fVar.f15090h.get().c();
        }
        return fVar;
    }

    public static f i(Context context) {
        synchronized (f15082k) {
            if (f15083l.containsKey("[DEFAULT]")) {
                return e();
            }
            j a10 = j.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return j(context, a10, "[DEFAULT]");
        }
    }

    public static f j(Context context, j jVar, String str) {
        f fVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f15093a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (b.f15093a.get() == null) {
                b bVar = new b();
                AtomicReference<b> atomicReference2 = b.f15093a;
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    l6.b.a(application);
                    l6.b bVar2 = l6.b.f9632e;
                    bVar2.getClass();
                    synchronized (bVar2) {
                        bVar2.f9635c.add(bVar);
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f15082k) {
            r.b bVar3 = f15083l;
            m6.j.k(true ^ bVar3.containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            m6.j.j(context, "Application context cannot be null.");
            fVar = new f(context, jVar, trim);
            bVar3.put(trim, fVar);
        }
        fVar.h();
        return fVar;
    }

    public final void a() {
        m6.j.k(!this.f.get(), "FirebaseApp was deleted");
    }

    public final void b() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (f15082k) {
                f15083l.remove(this.f15085b);
            }
            Iterator it = this.f15092j.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a();
            }
        }
    }

    public final <T> T c(Class<T> cls) {
        a();
        return (T) this.f15087d.get(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f15085b;
        f fVar = (f) obj;
        fVar.a();
        return str.equals(fVar.f15085b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f15085b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f15086c.f15097b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap hashMap;
        boolean z10 = true;
        if (!a0.o.a(this.f15084a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f15085b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f15084a;
            if (c.f15094b.get() == null) {
                c cVar = new c(context);
                AtomicReference<c> atomicReference = c.f15094b;
                while (true) {
                    if (atomicReference.compareAndSet(null, cVar)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f15085b);
        Log.i("FirebaseApp", sb3.toString());
        d8.i iVar = this.f15087d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f15085b);
        AtomicReference<Boolean> atomicReference2 = iVar.f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                break;
            } else if (atomicReference2.get() != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            synchronized (iVar) {
                hashMap = new HashMap(iVar.f3599a);
            }
            iVar.g(hashMap, equals);
        }
        this.f15090h.get().c();
    }

    public final int hashCode() {
        return this.f15085b.hashCode();
    }

    public final boolean k() {
        boolean z10;
        a();
        y9.a aVar = this.f15089g.get();
        synchronized (aVar) {
            z10 = aVar.f17452d;
        }
        return z10;
    }

    public final void l(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f15091i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public final void m(Boolean bool) {
        boolean equals;
        a();
        y9.a aVar = this.f15089g.get();
        synchronized (aVar) {
            if (bool == null) {
                aVar.f17450b.edit().remove("firebase_data_collection_default_enabled").apply();
                equals = aVar.a();
            } else {
                equals = Boolean.TRUE.equals(bool);
                aVar.f17450b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            }
            synchronized (aVar) {
                if (aVar.f17452d != equals) {
                    aVar.f17452d = equals;
                    aVar.f17451c.b(new c9.a<>(new u7.b(equals)));
                }
            }
        }
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a(this.f15085b, "name");
        aVar.a(this.f15086c, "options");
        return aVar.toString();
    }
}
