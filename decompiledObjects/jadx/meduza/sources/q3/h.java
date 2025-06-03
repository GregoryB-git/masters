package q3;

import android.util.SparseArray;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.l;
import i9.m1;
import i9.q;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import k3.s;
import ka.d0;
import ka.x;
import m9.v;
import p2.m0;
import s3.b;
import v3.c1;
import v3.f1;
import v5.l;
import w3.b;
import w3.w;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements b.a, l.a, l.b, n9.l, Continuation, TransactionStreamHandler.OnTransactionStartedListener, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13247c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f13245a = i10;
        this.f13246b = obj;
        this.f13247c = obj2;
    }

    @Override // s3.b.a
    public final Object a() {
        k kVar = (k) this.f13246b;
        return Boolean.valueOf(kVar.f13257c.B((s) this.f13247c));
    }

    @Override // v5.l.b
    public final void d(Object obj, v5.h hVar) {
        w3.b bVar = (w3.b) obj;
        bVar.J((f1) this.f13247c, new b.C0252b(hVar, ((w) this.f13246b).f16232e));
    }

    @Override // n9.l
    public final Object get() {
        i9.n nVar = (i9.n) this.f13246b;
        q qVar = (q) this.f13247c;
        SparseArray<m1> sparseArray = nVar.f7752k;
        long j10 = -1;
        if (qVar.f7771b.f7777a == -1) {
            m0.y(1, "LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
        } else {
            long l10 = qVar.f7770a.l();
            if (l10 >= qVar.f7771b.f7777a) {
                long currentTimeMillis = System.currentTimeMillis();
                qVar.f7771b.getClass();
                int i10 = (int) ((10 / 100.0f) * qVar.f7770a.i());
                qVar.f7771b.getClass();
                if (i10 > 1000) {
                    StringBuilder l11 = defpackage.f.l("Capping sequence numbers to collect down to the maximum of ");
                    qVar.f7771b.getClass();
                    l11.append(1000);
                    l11.append(" from ");
                    l11.append(i10);
                    m0.y(1, "LruGarbageCollector", l11.toString(), new Object[0]);
                    qVar.f7771b.getClass();
                    i10 = 1000;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (i10 != 0) {
                    q.d dVar = new q.d(i10);
                    qVar.f7770a.g(new i9.l(dVar, 1));
                    qVar.f7770a.a(new i9.m(dVar, 1));
                    j10 = dVar.f7779a.peek().longValue();
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                int b10 = qVar.f7770a.b(j10, sparseArray);
                long currentTimeMillis4 = System.currentTimeMillis();
                int j11 = qVar.f7770a.j(j10);
                long currentTimeMillis5 = System.currentTimeMillis();
                if (m0.S()) {
                    StringBuilder g10 = defpackage.g.g("LRU Garbage Collection:\n", "\tCounted targets in ");
                    g10.append(currentTimeMillis2 - currentTimeMillis);
                    g10.append("ms\n");
                    StringBuilder l12 = defpackage.f.l(g10.toString());
                    Locale locale = Locale.ROOT;
                    l12.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(i10), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)));
                    StringBuilder l13 = defpackage.f.l(l12.toString());
                    l13.append(String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(b10), Long.valueOf(currentTimeMillis4 - currentTimeMillis3)));
                    StringBuilder l14 = defpackage.f.l(l13.toString());
                    l14.append(String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(j11), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)));
                    StringBuilder l15 = defpackage.f.l(l14.toString());
                    l15.append(String.format(locale, "Total Duration: %dms", Long.valueOf(currentTimeMillis5 - currentTimeMillis)));
                    m0.y(1, "LruGarbageCollector", l15.toString(), new Object[0]);
                }
                return new q.c();
            }
            m0.y(1, "LruGarbageCollector", "Garbage collection skipped; Cache size " + l10 + " is lower than threshold " + qVar.f7771b.f7777a, new Object[0]);
        }
        return new q.c();
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f13245a) {
            case 1:
                ((w3.b) obj).D0();
                break;
            case 2:
                ((w3.b) obj).e0((c1) this.f13247c);
                break;
            case 3:
            default:
                ((w3.b) obj).c0();
                break;
            case 4:
                ((w3.b) obj).G0();
                break;
            case 5:
                ((w3.b) obj).n0((b.a) this.f13246b, (z4.q) this.f13247c);
                break;
            case 6:
                ((w3.b) obj).A();
                break;
        }
    }

    @Override // io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler.OnTransactionStartedListener
    public final void onStarted(com.google.firebase.firestore.l lVar) {
        ((FlutterFirebaseFirestorePlugin) this.f13246b).lambda$transactionCreate$11((String) this.f13247c, lVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        m9.j jVar = (m9.j) this.f13246b;
        HashMap hashMap = (HashMap) this.f13247c;
        HashSet hashSet = m9.j.f10815d;
        jVar.getClass();
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof com.google.firebase.firestore.f) && ((com.google.firebase.firestore.f) task.getException()).f3161a == f.a.UNAUTHENTICATED) {
                v vVar = jVar.f10818c;
                vVar.f10894b.t();
                vVar.f10895c.t();
            }
            throw task.getException();
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, d0> entry : ((x) task.getResult()).H().G().entrySet()) {
            x6.b.Z("%s not present in aliasMap", hashMap.containsKey(entry.getKey()), entry.getKey());
            hashMap2.put((String) hashMap.get(entry.getKey()), entry.getValue());
        }
        return hashMap2;
    }
}
