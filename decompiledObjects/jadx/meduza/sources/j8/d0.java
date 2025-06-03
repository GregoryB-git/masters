package j8;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;
import m8.b;
import m8.c;
import m8.f0;
import m8.l;
import m8.m;
import m8.w;
import q8.c.a;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f8566a;

    /* renamed from: b, reason: collision with root package name */
    public final p8.c f8567b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.a f8568c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.f f8569d;

    /* renamed from: e, reason: collision with root package name */
    public final l8.n f8570e;
    public final a0 f;

    /* renamed from: g, reason: collision with root package name */
    public final k8.i f8571g;

    public d0(t tVar, p8.c cVar, q8.a aVar, l8.f fVar, l8.n nVar, a0 a0Var, k8.i iVar) {
        this.f8566a = tVar;
        this.f8567b = cVar;
        this.f8568c = aVar;
        this.f8569d = fVar;
        this.f8570e = nVar;
        this.f = a0Var;
        this.f8571g = iVar;
    }

    public static m8.l a(m8.l lVar, l8.f fVar, l8.n nVar, Map map) {
        Map<String, String> unmodifiableMap;
        l.a aVar = new l.a(lVar);
        String b10 = fVar.f9766b.b();
        int i10 = 0;
        if (b10 != null) {
            aVar.f10637e = new m8.v(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        nVar.getClass();
        if (map.isEmpty()) {
            unmodifiableMap = nVar.f9798d.a();
        } else {
            HashMap hashMap = new HashMap(nVar.f9798d.a());
            for (Map.Entry entry : map.entrySet()) {
                String a10 = l8.e.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a10)) {
                    hashMap.put(a10, l8.e.a(1024, (String) entry.getValue()));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", defpackage.f.i("Ignored ", i10, " keys when adding event specific keys. Maximum allowable: ", 1024), null);
            }
            unmodifiableMap = Collections.unmodifiableMap(hashMap);
        }
        List<f0.c> d10 = d(unmodifiableMap);
        List<f0.c> d11 = d(nVar.f9799e.a());
        if (!d10.isEmpty() || !d11.isEmpty()) {
            m.a h10 = lVar.f10630c.h();
            h10.f10646b = d10;
            h10.f10647c = d11;
            aVar.f10635c = h10.a();
        }
        return aVar.a();
    }

    public static f0.e.d b(m8.l lVar, l8.n nVar) {
        List unmodifiableList;
        l8.l lVar2 = nVar.f;
        synchronized (lVar2) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(lVar2.f9788a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
            l8.k kVar = (l8.k) unmodifiableList.get(i10);
            w.a aVar = new w.a();
            String f = kVar.f();
            if (f == null) {
                throw new NullPointerException("Null variantId");
            }
            String d10 = kVar.d();
            if (d10 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            aVar.f10707a = new m8.x(d10, f);
            String b10 = kVar.b();
            if (b10 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            aVar.f10708b = b10;
            String c10 = kVar.c();
            if (c10 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            aVar.f10709c = c10;
            aVar.f10710d = kVar.e();
            aVar.f10711e = (byte) (aVar.f10711e | 1);
            arrayList.add(aVar.a());
        }
        if (arrayList.isEmpty()) {
            return lVar;
        }
        l.a aVar2 = new l.a(lVar);
        aVar2.f = new m8.y(arrayList);
        return aVar2.a();
    }

    public static d0 c(Context context, a0 a0Var, p8.e eVar, a aVar, l8.f fVar, l8.n nVar, s8.a aVar2, r8.f fVar2, l.l lVar, j jVar, k8.i iVar) {
        t tVar = new t(context, a0Var, aVar, aVar2, fVar2);
        p8.c cVar = new p8.c(eVar, fVar2, jVar);
        n8.a aVar3 = q8.a.f13345b;
        k3.w.b(context);
        return new d0(tVar, cVar, new q8.a(new q8.c(k3.w.a().c(new i3.a(q8.a.f13346c, q8.a.f13347d)).a("FIREBASE_CRASHLYTICS_REPORT", new h3.c("json"), q8.a.f13348e), fVar2.b(), lVar)), fVar, nVar, a0Var, iVar);
    }

    public static List<f0.c> d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new NullPointerException("Null key");
            }
            String value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new m8.e(key, value));
        }
        Collections.sort(arrayList, new v4.d(7));
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(Throwable th, Thread thread, String str, final l8.c cVar, boolean z10) {
        final boolean equals = str.equals("crash");
        t tVar = this.f8566a;
        long j10 = cVar.f9759b;
        int i10 = tVar.f8641a.getResources().getConfiguration().orientation;
        s8.c cVar2 = tVar.f8644d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        z5.j jVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            jVar = new z5.j(th3.getLocalizedMessage(), th3.getClass().getName(), cVar2.b(th3.getStackTrace()), jVar);
        }
        l.a aVar = new l.a();
        aVar.f10634b = str;
        aVar.f10633a = j10;
        aVar.f10638g = (byte) (aVar.f10638g | 1);
        f0.e.d.a.c c10 = g8.e.f5913a.c(tVar.f8641a);
        Boolean valueOf = c10.a() > 0 ? Boolean.valueOf(c10.a() != 100) : null;
        ArrayList b10 = g8.e.b(tVar.f8641a);
        byte b11 = (byte) (1 | 0);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) jVar.f17811c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b12 = (byte) 1;
        List d10 = t.d(stackTraceElementArr, 4);
        if (d10 == null) {
            throw new NullPointerException("Null frames");
        }
        if (b12 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if ((b12 & 1) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
        arrayList.add(new m8.r(name, 4, d10));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                    StackTraceElement[] b13 = tVar.f8644d.b(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    List d11 = t.d(b13, 0);
                    if (d11 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b12 != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        if ((b12 & 1) == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(a0.j.l("Missing required properties:", sb3));
                    }
                    arrayList.add(new m8.r(name2, 0, d11));
                    it = it2;
                }
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        m8.p c11 = t.c(jVar, 0);
        if (b12 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if ((b12 & 1) == 0) {
                sb4.append(" address");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb4));
        }
        m8.q qVar = new m8.q("0", "0", 0L);
        List<f0.e.d.a.b.AbstractC0153a> a10 = tVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        m8.n nVar = new m8.n(unmodifiableList, c11, null, qVar, a10);
        if (b11 != 1) {
            StringBuilder sb5 = new StringBuilder();
            if ((b11 & 1) == 0) {
                sb5.append(" uiOrientation");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb5));
        }
        aVar.f10635c = new m8.m(nVar, null, null, valueOf, c10, b10, i10);
        aVar.f10636d = tVar.b(i10);
        final f0.e.d b14 = b(a(aVar.a(), this.f8569d, this.f8570e, cVar.f9760c), this.f8570e);
        if (z10) {
            this.f8567b.c(b14, cVar.f9758a, equals);
        } else {
            this.f8571g.f9141b.a(new Runnable() { // from class: j8.c0
                @Override // java.lang.Runnable
                public final void run() {
                    d0 d0Var = d0.this;
                    f0.e.d dVar = b14;
                    l8.c cVar3 = cVar;
                    boolean z11 = equals;
                    d0Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    d0Var.f8567b.c(dVar, cVar3.f9758a, z11);
                }
            });
        }
    }

    public final void f(String str, List<ApplicationExitInfo> list, l8.f fVar, l8.n nVar) {
        String str2;
        ApplicationExitInfo applicationExitInfo;
        List<f0.a.AbstractC0150a> list2;
        long lastModified = this.f8567b.f13036b.b(str, "start-time").lastModified();
        Iterator<ApplicationExitInfo> it = list.iterator();
        do {
            str2 = null;
            if (it.hasNext()) {
                applicationExitInfo = it.next();
                if (applicationExitInfo.getTimestamp() < lastModified) {
                }
            }
            applicationExitInfo = null;
            break;
        } while (applicationExitInfo.getReason() != 6);
        if (applicationExitInfo == null) {
            String d10 = defpackage.g.d("No relevant ApplicationExitInfo occurred during session: ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", d10, null);
                return;
            }
            return;
        }
        t tVar = this.f8566a;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = traceInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                str2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        } catch (IOException e10) {
            StringBuilder l10 = defpackage.f.l("Could not get input trace in application exit info: ");
            l10.append(applicationExitInfo.toString());
            l10.append(" Error: ");
            l10.append(e10);
            Log.w("FirebaseCrashlytics", l10.toString(), null);
        }
        c.a aVar = new c.a();
        aVar.f10550d = applicationExitInfo.getImportance();
        aVar.f10555j = (byte) (aVar.f10555j | 4);
        String processName = applicationExitInfo.getProcessName();
        if (processName == null) {
            throw new NullPointerException("Null processName");
        }
        aVar.f10548b = processName;
        aVar.f10549c = applicationExitInfo.getReason();
        aVar.f10555j = (byte) (aVar.f10555j | 2);
        aVar.f10552g = applicationExitInfo.getTimestamp();
        aVar.f10555j = (byte) (aVar.f10555j | 32);
        aVar.f10547a = applicationExitInfo.getPid();
        aVar.f10555j = (byte) (aVar.f10555j | 1);
        aVar.f10551e = applicationExitInfo.getPss();
        aVar.f10555j = (byte) (aVar.f10555j | 8);
        aVar.f = applicationExitInfo.getRss();
        aVar.f10555j = (byte) (aVar.f10555j | 16);
        aVar.f10553h = str2;
        m8.c a10 = aVar.a();
        int i10 = tVar.f8641a.getResources().getConfiguration().orientation;
        l.a aVar2 = new l.a();
        aVar2.f10634b = "anr";
        aVar2.f10633a = a10.f10544g;
        aVar2.f10638g = (byte) (aVar2.f10638g | 1);
        if (!((r8.f) tVar.f8645e).b().f13786b.f13792c || tVar.f8643c.f8544c.size() <= 0) {
            list2 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (e eVar : tVar.f8643c.f8544c) {
                String str3 = eVar.f8572a;
                if (str3 == null) {
                    throw new NullPointerException("Null libraryName");
                }
                String str4 = eVar.f8573b;
                if (str4 == null) {
                    throw new NullPointerException("Null arch");
                }
                String str5 = eVar.f8574c;
                if (str5 == null) {
                    throw new NullPointerException("Null buildId");
                }
                arrayList.add(new m8.d(str4, str3, str5));
            }
            list2 = Collections.unmodifiableList(arrayList);
        }
        c.a aVar3 = new c.a();
        aVar3.f10550d = a10.f10542d;
        byte b10 = (byte) (aVar3.f10555j | 4);
        aVar3.f10555j = b10;
        String str6 = a10.f10540b;
        if (str6 == null) {
            throw new NullPointerException("Null processName");
        }
        aVar3.f10548b = str6;
        aVar3.f10549c = a10.f10541c;
        aVar3.f10552g = a10.f10544g;
        aVar3.f10547a = a10.f10539a;
        aVar3.f10551e = a10.f10543e;
        aVar3.f = a10.f;
        aVar3.f10555j = (byte) (((byte) (((byte) (((byte) (((byte) (2 | b10)) | 32)) | 1)) | 8)) | 16);
        aVar3.f10553h = a10.f10545h;
        aVar3.f10554i = list2;
        m8.c a11 = aVar3.a();
        Boolean valueOf = Boolean.valueOf(a11.f10542d != 100);
        g8.e eVar2 = g8.e.f5913a;
        String str7 = a11.f10540b;
        int i11 = a11.f10539a;
        int i12 = a11.f10542d;
        ec.i.e(str7, "processName");
        m8.t a12 = g8.e.a(eVar2, str7, i11, i12, 8);
        byte b11 = (byte) (0 | 1);
        byte b12 = (byte) 1;
        if (b12 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if ((b12 & 1) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
        m8.q qVar = new m8.q("0", "0", 0L);
        List<f0.e.d.a.b.AbstractC0153a> a13 = tVar.a();
        if (a13 == null) {
            throw new NullPointerException("Null binaries");
        }
        m8.n nVar2 = new m8.n(null, null, a11, qVar, a13);
        if (b11 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if ((b11 & 1) == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb3));
        }
        aVar2.f10635c = new m8.m(nVar2, null, null, valueOf, a12, null, i10);
        aVar2.f10636d = tVar.b(i10);
        m8.l a14 = aVar2.a();
        String d11 = defpackage.g.d("Persisting anr for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d11, null);
        }
        this.f8567b.c(b(a(a14, fVar, nVar, Collections.emptyMap()), nVar), str, true);
    }

    public final Task g(k8.b bVar, String str) {
        TaskCompletionSource<u> taskCompletionSource;
        ArrayList b10 = this.f8567b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                n8.a aVar = p8.c.f13032g;
                String d10 = p8.c.d(file);
                aVar.getClass();
                arrayList.add(new b(n8.a.i(d10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u uVar = (u) it2.next();
            if (str == null || str.equals(uVar.c())) {
                q8.a aVar2 = this.f8568c;
                boolean z10 = true;
                if (uVar.a().f() == null || uVar.a().e() == null) {
                    z b11 = this.f.b(true);
                    f0 a10 = uVar.a();
                    String str2 = b11.f8665a;
                    b.a m10 = a10.m();
                    m10.f10528e = str2;
                    m8.b a11 = m10.a();
                    String str3 = b11.f8666b;
                    b.a aVar3 = new b.a(a11);
                    aVar3.f = str3;
                    uVar = new b(aVar3.a(), uVar.c(), uVar.b());
                }
                boolean z11 = str != null;
                q8.c cVar = aVar2.f13349a;
                synchronized (cVar.f) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z11) {
                        ((AtomicInteger) cVar.f13361i.f9390b).getAndIncrement();
                        if (cVar.f.size() >= cVar.f13358e) {
                            z10 = false;
                        }
                        if (z10) {
                            b.z zVar = b.z.f1660e;
                            zVar.h("Enqueueing report: " + uVar.c());
                            zVar.h("Queue size: " + cVar.f.size());
                            cVar.f13359g.execute(cVar.new a(uVar, taskCompletionSource));
                            zVar.h("Closing task for report: " + uVar.c());
                        } else {
                            cVar.a();
                            String str4 = "Dropping report due to queue being full: " + uVar.c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str4, null);
                            }
                            ((AtomicInteger) cVar.f13361i.f9391c).getAndIncrement();
                        }
                        taskCompletionSource.trySetResult(uVar);
                    } else {
                        cVar.b(uVar, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(bVar, new io.flutter.plugins.firebase.auth.g(this, 15)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
