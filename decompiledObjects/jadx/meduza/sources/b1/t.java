package b1;

import b1.k;
import java.util.Iterator;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public abstract class t<T> {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private n.b<x<? super T>, t<T>.d> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (t.this.mDataLock) {
                obj = t.this.mPendingData;
                t.this.mPendingData = t.NOT_SET;
            }
            t.this.setValue(obj);
        }
    }

    public class b extends t<T>.d {
        public b(t tVar, x<? super T> xVar) {
            super(xVar);
        }

        @Override // b1.t.d
        public final boolean e() {
            return true;
        }
    }

    public class c extends t<T>.d implements m {

        /* renamed from: e, reason: collision with root package name */
        public final o f1792e;

        public c(o oVar, x<? super T> xVar) {
            super(xVar);
            this.f1792e = oVar;
        }

        @Override // b1.m
        public final void a(o oVar, k.a aVar) {
            k.b b10 = this.f1792e.getLifecycle().b();
            if (b10 == k.b.DESTROYED) {
                t.this.removeObserver(this.f1793a);
                return;
            }
            k.b bVar = null;
            while (bVar != b10) {
                b(e());
                bVar = b10;
                b10 = this.f1792e.getLifecycle().b();
            }
        }

        @Override // b1.t.d
        public final void c() {
            this.f1792e.getLifecycle().c(this);
        }

        @Override // b1.t.d
        public final boolean d(o oVar) {
            return this.f1792e == oVar;
        }

        @Override // b1.t.d
        public final boolean e() {
            return this.f1792e.getLifecycle().b().f(k.b.STARTED);
        }
    }

    public abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final x<? super T> f1793a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1794b;

        /* renamed from: c, reason: collision with root package name */
        public int f1795c = -1;

        public d(x<? super T> xVar) {
            this.f1793a = xVar;
        }

        public final void b(boolean z10) {
            if (z10 == this.f1794b) {
                return;
            }
            this.f1794b = z10;
            t.this.changeActiveCounter(z10 ? 1 : -1);
            if (this.f1794b) {
                t.this.dispatchingValue(this);
            }
        }

        public void c() {
        }

        public boolean d(o oVar) {
            return false;
        }

        public abstract boolean e();
    }

    public t() {
        this.mDataLock = new Object();
        this.mObservers = new n.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    public t(T t) {
        this.mDataLock = new Object();
        this.mObservers = new n.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!m.c.v().w()) {
            throw new IllegalStateException(defpackage.g.e("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(t<T>.d dVar) {
        if (dVar.f1794b) {
            if (!dVar.e()) {
                dVar.b(false);
                return;
            }
            int i10 = dVar.f1795c;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            dVar.f1795c = i11;
            dVar.f1793a.a((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(t<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                n.b<x<? super T>, t<T>.d> bVar = this.mObservers;
                bVar.getClass();
                b.d dVar2 = new b.d();
                bVar.f11166c.put(dVar2, Boolean.FALSE);
                while (dVar2.hasNext()) {
                    considerNotify((d) ((Map.Entry) dVar2.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f11167d > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(o oVar, x<? super T> xVar) {
        assertMainThread("observe");
        if (oVar.getLifecycle().b() == k.b.DESTROYED) {
            return;
        }
        c cVar = new c(oVar, xVar);
        t<T>.d h10 = this.mObservers.h(xVar, cVar);
        if (h10 != null && !h10.d(oVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h10 != null) {
            return;
        }
        oVar.getLifecycle().a(cVar);
    }

    public void observeForever(x<? super T> xVar) {
        assertMainThread("observeForever");
        b bVar = new b(this, xVar);
        t<T>.d h10 = this.mObservers.h(xVar, bVar);
        if (h10 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h10 != null) {
            return;
        }
        bVar.b(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z10) {
            m.c.v().x(this.mPostValueRunnable);
        }
    }

    public void removeObserver(x<? super T> xVar) {
        assertMainThread("removeObserver");
        t<T>.d i10 = this.mObservers.i(xVar);
        if (i10 == null) {
            return;
        }
        i10.c();
        i10.b(false);
    }

    public void removeObservers(o oVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<x<? super T>, t<T>.d>> it = this.mObservers.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            if (((d) entry.getValue()).d(oVar)) {
                removeObserver((x) entry.getKey());
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }
}
