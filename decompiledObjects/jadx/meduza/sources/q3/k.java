package q3;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.h;
import k3.p;
import k3.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13255a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.e f13256b;

    /* renamed from: c, reason: collision with root package name */
    public final r3.d f13257c;

    /* renamed from: d, reason: collision with root package name */
    public final n f13258d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f13259e;
    public final s3.b f;

    /* renamed from: g, reason: collision with root package name */
    public final t3.a f13260g;

    /* renamed from: h, reason: collision with root package name */
    public final t3.a f13261h;

    /* renamed from: i, reason: collision with root package name */
    public final r3.c f13262i;

    public k(Context context, l3.e eVar, r3.d dVar, n nVar, Executor executor, s3.b bVar, t3.a aVar, t3.a aVar2, r3.c cVar) {
        this.f13255a = context;
        this.f13256b = eVar;
        this.f13257c = dVar;
        this.f13258d = nVar;
        this.f13259e = executor;
        this.f = bVar;
        this.f13260g = aVar;
        this.f13261h = aVar2;
        this.f13262i = cVar;
    }

    public final void a(s sVar, int i10) {
        l3.b b10;
        l3.m a10 = this.f13256b.a(sVar.b());
        int i11 = 1;
        new l3.b(1, 0L);
        long j10 = 0;
        while (true) {
            if (!((Boolean) this.f.f(new h(r3, this, sVar))).booleanValue()) {
                this.f.f(new j(this, sVar, j10));
                return;
            }
            Iterable iterable = (Iterable) this.f.f(new k1.a(i11, this, sVar));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i12 = 2;
            if (a10 == null) {
                o3.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", sVar);
                b10 = new l3.b(3, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r3.i) it.next()).a());
                }
                if (sVar.c() != null) {
                    s3.b bVar = this.f;
                    r3.c cVar = this.f13262i;
                    Objects.requireNonNull(cVar);
                    n3.a aVar = (n3.a) bVar.f(new defpackage.d(cVar, i12));
                    h.a aVar2 = new h.a();
                    aVar2.f = new HashMap();
                    aVar2.f8885d = Long.valueOf(this.f13260g.a());
                    aVar2.f8886e = Long.valueOf(this.f13261h.a());
                    aVar2.d("GDT_CLIENT_METRICS");
                    h3.c cVar2 = new h3.c("proto");
                    aVar.getClass();
                    b9.g gVar = p.f8910a;
                    gVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        gVar.a(aVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar2.c(new k3.m(cVar2, byteArrayOutputStream.toByteArray()));
                    arrayList.add(a10.a(aVar2.b()));
                }
                b10 = a10.b(new l3.a(arrayList, sVar.c()));
            }
            if (b10.f9542a == 2) {
                this.f.f(new i(this, iterable, sVar, j10));
                this.f13258d.a(sVar, i10 + 1, true);
                return;
            }
            this.f.f(new o9.l(r3, this, iterable));
            int i13 = b10.f9542a;
            if (i13 == 1) {
                j10 = Math.max(j10, b10.f9543b);
                if ((sVar.c() != null ? 1 : 0) != 0) {
                    this.f.f(new defpackage.e(this, 3));
                }
            } else if (i13 == 4) {
                HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String k10 = ((r3.i) it2.next()).a().k();
                    hashMap.put(k10, !hashMap.containsKey(k10) ? 1 : Integer.valueOf(((Integer) hashMap.get(k10)).intValue() + 1));
                }
                this.f.f(new k1.a(i12, this, hashMap));
            }
        }
    }
}
