package b;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b1.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1637a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.a<Boolean> f1638b;

    /* renamed from: c, reason: collision with root package name */
    public final sb.i<p> f1639c;

    /* renamed from: d, reason: collision with root package name */
    public p f1640d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f1641e;
    public OnBackInvokedDispatcher f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1642g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1643h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1644a = new a();

        public final OnBackInvokedCallback a(dc.a<rb.h> aVar) {
            ec.i.e(aVar, "onBackInvoked");
            return new v(aVar, 0);
        }

        public final void b(Object obj, int i10, Object obj2) {
            ec.i.e(obj, "dispatcher");
            ec.i.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            ec.i.e(obj, "dispatcher");
            ec.i.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1645a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dc.l<b.b, rb.h> f1646a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ dc.l<b.b, rb.h> f1647b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ dc.a<rb.h> f1648c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ dc.a<rb.h> f1649d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(dc.l<? super b.b, rb.h> lVar, dc.l<? super b.b, rb.h> lVar2, dc.a<rb.h> aVar, dc.a<rb.h> aVar2) {
                this.f1646a = lVar;
                this.f1647b = lVar2;
                this.f1648c = aVar;
                this.f1649d = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackCancelled() {
                this.f1649d.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                this.f1648c.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackProgressed(BackEvent backEvent) {
                ec.i.e(backEvent, "backEvent");
                this.f1647b.invoke(new b.b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public final void onBackStarted(BackEvent backEvent) {
                ec.i.e(backEvent, "backEvent");
                this.f1646a.invoke(new b.b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(dc.l<? super b.b, rb.h> lVar, dc.l<? super b.b, rb.h> lVar2, dc.a<rb.h> aVar, dc.a<rb.h> aVar2) {
            ec.i.e(lVar, "onBackStarted");
            ec.i.e(lVar2, "onBackProgressed");
            ec.i.e(aVar, "onBackInvoked");
            ec.i.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    public final class c implements b1.m, b.c {

        /* renamed from: a, reason: collision with root package name */
        public final b1.k f1650a;

        /* renamed from: b, reason: collision with root package name */
        public final p f1651b;

        /* renamed from: c, reason: collision with root package name */
        public d f1652c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w f1653d;

        public c(w wVar, b1.k kVar, p pVar) {
            ec.i.e(pVar, "onBackPressedCallback");
            this.f1653d = wVar;
            this.f1650a = kVar;
            this.f1651b = pVar;
            kVar.a(this);
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            if (aVar != k.a.ON_START) {
                if (aVar != k.a.ON_STOP) {
                    if (aVar == k.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    d dVar = this.f1652c;
                    if (dVar != null) {
                        dVar.cancel();
                        return;
                    }
                    return;
                }
            }
            w wVar = this.f1653d;
            p pVar = this.f1651b;
            wVar.getClass();
            ec.i.e(pVar, "onBackPressedCallback");
            wVar.f1639c.addLast(pVar);
            d dVar2 = wVar.new d(pVar);
            pVar.addCancellable(dVar2);
            wVar.d();
            pVar.setEnabledChangedCallback$activity_release(new x(wVar));
            this.f1652c = dVar2;
        }

        @Override // b.c
        public final void cancel() {
            this.f1650a.c(this);
            this.f1651b.removeCancellable(this);
            d dVar = this.f1652c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f1652c = null;
        }
    }

    public final class d implements b.c {

        /* renamed from: a, reason: collision with root package name */
        public final p f1654a;

        public d(p pVar) {
            this.f1654a = pVar;
        }

        @Override // b.c
        public final void cancel() {
            w.this.f1639c.remove(this.f1654a);
            if (ec.i.a(w.this.f1640d, this.f1654a)) {
                this.f1654a.handleOnBackCancelled();
                w.this.f1640d = null;
            }
            this.f1654a.removeCancellable(this);
            dc.a<rb.h> enabledChangedCallback$activity_release = this.f1654a.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f1654a.setEnabledChangedCallback$activity_release(null);
        }
    }

    public /* synthetic */ class e extends ec.h implements dc.a<rb.h> {
        public e(w wVar) {
            super(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // dc.a
        public final rb.h invoke() {
            ((w) this.receiver).d();
            return rb.h.f13851a;
        }
    }

    public w() {
        this(null);
    }

    public final void a(b1.o oVar, p pVar) {
        ec.i.e(oVar, "owner");
        ec.i.e(pVar, "onBackPressedCallback");
        b1.k lifecycle = oVar.getLifecycle();
        if (lifecycle.b() == k.b.DESTROYED) {
            return;
        }
        pVar.addCancellable(new c(this, lifecycle, pVar));
        d();
        pVar.setEnabledChangedCallback$activity_release(new e(this));
    }

    public final void b() {
        p pVar;
        p pVar2 = this.f1640d;
        if (pVar2 == null) {
            sb.i<p> iVar = this.f1639c;
            ListIterator<p> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    pVar = null;
                    break;
                } else {
                    pVar = listIterator.previous();
                    if (pVar.isEnabled()) {
                        break;
                    }
                }
            }
            pVar2 = pVar;
        }
        this.f1640d = null;
        if (pVar2 != null) {
            pVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f1637a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.f1641e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f1642g) {
            a.f1644a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1642g = true;
        } else {
            if (z10 || !this.f1642g) {
                return;
            }
            a.f1644a.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1642g = false;
        }
    }

    public final void d() {
        boolean z10 = this.f1643h;
        sb.i<p> iVar = this.f1639c;
        boolean z11 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator<p> it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f1643h = z11;
        if (z11 != z10) {
            d0.a<Boolean> aVar = this.f1638b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                c(z11);
            }
        }
    }

    public w(Runnable runnable) {
        this.f1637a = runnable;
        this.f1638b = null;
        this.f1639c = new sb.i<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f1641e = i10 >= 34 ? b.f1645a.a(new q(this), new r(this), new s(this), new t(this)) : a.f1644a.a(new u(this));
        }
    }
}
