package H3;

import J3.B;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0398u f2228a;

    /* renamed from: b, reason: collision with root package name */
    public final M3.e f2229b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.b f2230c;

    /* renamed from: d, reason: collision with root package name */
    public final I3.c f2231d;

    /* renamed from: e, reason: collision with root package name */
    public final I3.i f2232e;

    /* renamed from: f, reason: collision with root package name */
    public final C f2233f;

    public V(C0398u c0398u, M3.e eVar, N3.b bVar, I3.c cVar, I3.i iVar, C c7) {
        this.f2228a = c0398u;
        this.f2229b = eVar;
        this.f2230c = bVar;
        this.f2231d = cVar;
        this.f2232e = iVar;
        this.f2233f = c7;
    }

    public static B.a e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e7) {
            E3.f f7 = E3.f.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e7);
            f7.k(sb.toString());
        }
        B.a.b a7 = B.a.a();
        importance = applicationExitInfo.getImportance();
        B.a.b c7 = a7.c(importance);
        processName = applicationExitInfo.getProcessName();
        B.a.b e8 = c7.e(processName);
        reason = applicationExitInfo.getReason();
        B.a.b g7 = e8.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        B.a.b i7 = g7.i(timestamp);
        pid = applicationExitInfo.getPid();
        B.a.b d7 = i7.d(pid);
        pss = applicationExitInfo.getPss();
        B.a.b f8 = d7.f(pss);
        rss = applicationExitInfo.getRss();
        return f8.h(rss).j(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static V g(Context context, C c7, M3.g gVar, C0379a c0379a, I3.c cVar, I3.i iVar, P3.d dVar, O3.i iVar2, H h7, C0391m c0391m) {
        return new V(new C0398u(context, c7, c0379a, dVar, iVar2), new M3.e(gVar, iVar2, c0391m), N3.b.b(context, iVar2, h7), cVar, iVar, c7);
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(B.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: H3.T
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int n7;
                n7 = V.n((B.c) obj, (B.c) obj2);
                return n7;
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int n(B.c cVar, B.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public final B.e.d c(B.e.d dVar) {
        return d(dVar, this.f2231d, this.f2232e);
    }

    public final B.e.d d(B.e.d dVar, I3.c cVar, I3.i iVar) {
        B.e.d.b g7 = dVar.g();
        String c7 = cVar.c();
        if (c7 != null) {
            g7.d(B.e.d.AbstractC0056d.a().b(c7).a());
        } else {
            E3.f.f().i("No log data to include with this event.");
        }
        List l7 = l(iVar.e());
        List l8 = l(iVar.f());
        if (!l7.isEmpty() || !l8.isEmpty()) {
            g7.b(dVar.b().g().c(J3.C.a(l7)).e(J3.C.a(l8)).a());
        }
        return g7.a();
    }

    public final AbstractC0399v h(AbstractC0399v abstractC0399v) {
        if (abstractC0399v.b().g() != null) {
            return abstractC0399v;
        }
        return AbstractC0399v.a(abstractC0399v.b().r(this.f2233f.d()), abstractC0399v.d(), abstractC0399v.c());
    }

    public void i(String str, List list, B.a aVar) {
        E3.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B.d.b k7 = ((F) it.next()).k();
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        this.f2229b.l(str, B.d.a().b(J3.C.a(arrayList)).a(), aVar);
    }

    public void j(long j7, String str) {
        this.f2229b.k(str, j7);
    }

    public final ApplicationExitInfo k(String str, List list) {
        long timestamp;
        int reason;
        long q7 = this.f2229b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a7 = I.a(it.next());
            timestamp = a7.getTimestamp();
            if (timestamp < q7) {
                return null;
            }
            reason = a7.getReason();
            if (reason == 6) {
                return a7;
            }
        }
        return null;
    }

    public boolean m() {
        return this.f2229b.r();
    }

    public SortedSet o() {
        return this.f2229b.p();
    }

    public void p(String str, long j7) {
        this.f2229b.z(this.f2228a.e(str, j7));
    }

    public final boolean q(AbstractC0659j abstractC0659j) {
        if (!abstractC0659j.n()) {
            E3.f.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC0659j.i());
            return false;
        }
        AbstractC0399v abstractC0399v = (AbstractC0399v) abstractC0659j.j();
        E3.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + abstractC0399v.d());
        File c7 = abstractC0399v.c();
        if (c7.delete()) {
            E3.f.f().b("Deleted report file: " + c7.getPath());
            return true;
        }
        E3.f.f().k("Crashlytics could not delete report file: " + c7.getPath());
        return true;
    }

    public final void r(Throwable th, Thread thread, String str, String str2, long j7, boolean z7) {
        this.f2229b.y(c(this.f2228a.d(th, thread, str2, j7, 4, 8, z7)), str, str2.equals("crash"));
    }

    public void s(Throwable th, Thread thread, String str, long j7) {
        E3.f.f().i("Persisting fatal event for session " + str);
        r(th, thread, str, "crash", j7, true);
    }

    public void t(Throwable th, Thread thread, String str, long j7) {
        E3.f.f().i("Persisting non-fatal event for session " + str);
        r(th, thread, str, "error", j7, false);
    }

    public void u(String str, List list, I3.c cVar, I3.i iVar) {
        ApplicationExitInfo k7 = k(str, list);
        if (k7 == null) {
            E3.f.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        B.e.d c7 = this.f2228a.c(e(k7));
        E3.f.f().b("Persisting anr for session " + str);
        this.f2229b.y(d(c7, cVar, iVar), str, true);
    }

    public void v() {
        this.f2229b.i();
    }

    public AbstractC0659j w(Executor executor) {
        return x(executor, null);
    }

    public AbstractC0659j x(Executor executor, String str) {
        List<AbstractC0399v> w7 = this.f2229b.w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC0399v abstractC0399v : w7) {
            if (str == null || str.equals(abstractC0399v.d())) {
                arrayList.add(this.f2230c.c(h(abstractC0399v), str != null).g(executor, new InterfaceC0651b() { // from class: H3.U
                    @Override // V2.InterfaceC0651b
                    public final Object a(AbstractC0659j abstractC0659j) {
                        boolean q7;
                        q7 = V.this.q(abstractC0659j);
                        return Boolean.valueOf(q7);
                    }
                }));
            }
        }
        return V2.m.f(arrayList);
    }
}
