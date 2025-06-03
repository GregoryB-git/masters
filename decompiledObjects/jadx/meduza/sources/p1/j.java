package p1;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sb.s;
import sb.t;
import sb.u;
import t1.c;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public volatile t1.b f12792a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f12793b;

    /* renamed from: c, reason: collision with root package name */
    public q f12794c;

    /* renamed from: d, reason: collision with root package name */
    public t1.c f12795d;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public List<? extends b> f12797g;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, Object> f12801k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f12802l;

    /* renamed from: e, reason: collision with root package name */
    public final e f12796e = d();

    /* renamed from: h, reason: collision with root package name */
    public LinkedHashMap f12798h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f12799i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal<Integer> f12800j = new ThreadLocal<>();

    public static class a<T extends j> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f12803a;

        /* renamed from: c, reason: collision with root package name */
        public final String f12805c;

        /* renamed from: g, reason: collision with root package name */
        public Executor f12808g;

        /* renamed from: h, reason: collision with root package name */
        public Executor f12809h;

        /* renamed from: i, reason: collision with root package name */
        public c.InterfaceC0226c f12810i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f12811j;

        /* renamed from: m, reason: collision with root package name */
        public boolean f12814m;

        /* renamed from: q, reason: collision with root package name */
        public HashSet f12818q;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f12804b = WorkDatabase.class;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f12806d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f12807e = new ArrayList();
        public ArrayList f = new ArrayList();

        /* renamed from: k, reason: collision with root package name */
        public int f12812k = 1;

        /* renamed from: l, reason: collision with root package name */
        public boolean f12813l = true;

        /* renamed from: n, reason: collision with root package name */
        public long f12815n = -1;

        /* renamed from: o, reason: collision with root package name */
        public final c f12816o = new c();

        /* renamed from: p, reason: collision with root package name */
        public LinkedHashSet f12817p = new LinkedHashSet();

        public a(Context context, String str) {
            this.f12803a = context;
            this.f12805c = str;
        }

        public final void a(q1.b... bVarArr) {
            if (this.f12818q == null) {
                this.f12818q = new HashSet();
            }
            for (q1.b bVar : bVarArr) {
                HashSet hashSet = this.f12818q;
                ec.i.b(hashSet);
                hashSet.add(Integer.valueOf(bVar.f13193a));
                HashSet hashSet2 = this.f12818q;
                ec.i.b(hashSet2);
                hashSet2.add(Integer.valueOf(bVar.f13194b));
            }
            this.f12816o.a((q1.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
    }

    public static abstract class b {
        public void a(u1.c cVar) {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f12819a = new LinkedHashMap();

        public final void a(q1.b... bVarArr) {
            ec.i.e(bVarArr, "migrations");
            for (q1.b bVar : bVarArr) {
                int i10 = bVar.f13193a;
                int i11 = bVar.f13194b;
                LinkedHashMap linkedHashMap = this.f12819a;
                Integer valueOf = Integer.valueOf(i10);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(i11))) {
                    StringBuilder l10 = defpackage.f.l("Overriding migration ");
                    l10.append(treeMap.get(Integer.valueOf(i11)));
                    l10.append(" with ");
                    l10.append(bVar);
                    Log.w("ROOM", l10.toString());
                }
                treeMap.put(Integer.valueOf(i11), bVar);
            }
        }
    }

    public interface d {
        void a();
    }

    public j() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        ec.i.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f12801k = synchronizedMap;
        this.f12802l = new LinkedHashMap();
    }

    public static Object o(Class cls, t1.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof p1.c) {
            return o(cls, ((p1.c) cVar).f());
        }
        return null;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!(g().getWritableDatabase().j0() || this.f12800j.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        t1.b writableDatabase = g().getWritableDatabase();
        this.f12796e.g(writableDatabase);
        if (writableDatabase.n0()) {
            writableDatabase.J();
        } else {
            writableDatabase.h();
        }
    }

    public abstract e d();

    public abstract t1.c e(p1.b bVar);

    public List f(LinkedHashMap linkedHashMap) {
        ec.i.e(linkedHashMap, "autoMigrationSpecs");
        return s.f14324a;
    }

    public final t1.c g() {
        t1.c cVar = this.f12795d;
        if (cVar != null) {
            return cVar;
        }
        ec.i.i("internalOpenHelper");
        throw null;
    }

    public Set<Class<? extends q1.a>> h() {
        return u.f14326a;
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return t.f14325a;
    }

    public final void j() {
        g().getWritableDatabase().X();
        if (g().getWritableDatabase().j0()) {
            return;
        }
        e eVar = this.f12796e;
        if (eVar.f.compareAndSet(false, true)) {
            Executor executor = eVar.f12767a.f12793b;
            if (executor != null) {
                executor.execute(eVar.f12779n);
            } else {
                ec.i.i("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final boolean k() {
        t1.b bVar = this.f12792a;
        return ec.i.a(bVar != null ? Boolean.valueOf(bVar.isOpen()) : null, Boolean.TRUE);
    }

    public final Cursor l(t1.e eVar, CancellationSignal cancellationSignal) {
        ec.i.e(eVar, "query");
        a();
        b();
        return cancellationSignal != null ? g().getWritableDatabase().V(eVar, cancellationSignal) : g().getWritableDatabase().y(eVar);
    }

    public final <V> V m(Callable<V> callable) {
        c();
        try {
            V call = callable.call();
            n();
            return call;
        } finally {
            j();
        }
    }

    public final void n() {
        g().getWritableDatabase().G();
    }
}
