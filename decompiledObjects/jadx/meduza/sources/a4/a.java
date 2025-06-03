package a4;

import a4.b;
import a4.d;
import a4.e;
import a4.g;
import a4.o;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o7.t;
import t5.c0;
import v5.e0;
import w3.a0;

/* loaded from: classes.dex */
public final class a implements a4.e {

    /* renamed from: a, reason: collision with root package name */
    public final List<d.b> f103a;

    /* renamed from: b, reason: collision with root package name */
    public final o f104b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0003a f105c;

    /* renamed from: d, reason: collision with root package name */
    public final b f106d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f108g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f109h;

    /* renamed from: i, reason: collision with root package name */
    public final v5.f<g.a> f110i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f111j;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f112k;

    /* renamed from: l, reason: collision with root package name */
    public final w f113l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f114m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f115n;

    /* renamed from: o, reason: collision with root package name */
    public final e f116o;

    /* renamed from: p, reason: collision with root package name */
    public int f117p;

    /* renamed from: q, reason: collision with root package name */
    public int f118q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f119r;

    /* renamed from: s, reason: collision with root package name */
    public c f120s;
    public z3.b t;

    /* renamed from: u, reason: collision with root package name */
    public e.a f121u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f122v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f123w;

    /* renamed from: x, reason: collision with root package name */
    public o.a f124x;

    /* renamed from: y, reason: collision with root package name */
    public o.d f125y;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0003a {
    }

    public interface b {
    }

    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f126a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.a.c.handleMessage(android.os.Message):void");
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f128a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f129b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f130c;

        /* renamed from: d, reason: collision with root package name */
        public int f131d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f128a = j10;
            this.f129b = z10;
            this.f130c = obj;
        }
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<g.a> set;
            Set<g.a> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                a aVar = a.this;
                if (obj == aVar.f125y) {
                    if (aVar.f117p == 2 || aVar.b()) {
                        aVar.f125y = null;
                        if (obj2 instanceof Exception) {
                            ((b.e) aVar.f105c).a((Exception) obj2, false);
                            return;
                        }
                        try {
                            aVar.f104b.i((byte[]) obj2);
                            b.e eVar = (b.e) aVar.f105c;
                            eVar.f162b = null;
                            o7.t p10 = o7.t.p(eVar.f161a);
                            eVar.f161a.clear();
                            t.b listIterator = p10.listIterator(0);
                            while (listIterator.hasNext()) {
                                a aVar2 = (a) listIterator.next();
                                if (aVar2.m()) {
                                    aVar2.a(true);
                                }
                            }
                            return;
                        } catch (Exception e10) {
                            ((b.e) aVar.f105c).a(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != 1) {
                return;
            }
            a aVar3 = a.this;
            if (obj == aVar3.f124x && aVar3.b()) {
                aVar3.f124x = null;
                if (obj2 instanceof Exception) {
                    aVar3.d((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (aVar3.f107e == 3) {
                        o oVar = aVar3.f104b;
                        byte[] bArr2 = aVar3.f123w;
                        int i11 = e0.f15881a;
                        oVar.h(bArr2, bArr);
                        v5.f<g.a> fVar = aVar3.f110i;
                        synchronized (fVar.f15895a) {
                            set2 = fVar.f15897c;
                        }
                        Iterator<g.a> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                        return;
                    }
                    byte[] h10 = aVar3.f104b.h(aVar3.f122v, bArr);
                    int i12 = aVar3.f107e;
                    if ((i12 == 2 || (i12 == 0 && aVar3.f123w != null)) && h10 != null && h10.length != 0) {
                        aVar3.f123w = h10;
                    }
                    aVar3.f117p = 4;
                    v5.f<g.a> fVar2 = aVar3.f110i;
                    synchronized (fVar2.f15895a) {
                        set = fVar2.f15897c;
                    }
                    Iterator<g.a> it2 = set.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                    return;
                } catch (Exception e11) {
                    aVar3.d(e11, true);
                }
                aVar3.d(e11, true);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public a(UUID uuid, o oVar, b.e eVar, b.f fVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, w wVar, Looper looper, c0 c0Var, a0 a0Var) {
        List<d.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f114m = uuid;
        this.f105c = eVar;
        this.f106d = fVar;
        this.f104b = oVar;
        this.f107e = i10;
        this.f = z10;
        this.f108g = z11;
        if (bArr != null) {
            this.f123w = bArr;
            unmodifiableList = null;
        } else {
            list.getClass();
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f103a = unmodifiableList;
        this.f109h = hashMap;
        this.f113l = wVar;
        this.f110i = new v5.f<>();
        this.f111j = c0Var;
        this.f112k = a0Var;
        this.f117p = 2;
        this.f115n = looper;
        this.f116o = new e(looper);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:63|(2:64|65)|(6:67|68|69|70|(1:72)|74)|77|68|69|70|(0)|74) */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0095 A[Catch: NumberFormatException -> 0x0099, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0099, blocks: (B:70:0x008d, B:72:0x0095), top: B:69:0x008d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.a.a(boolean):void");
    }

    public final boolean b() {
        int i10 = this.f117p;
        return i10 == 3 || i10 == 4;
    }

    public final void c(int i10, Exception exc) {
        int i11;
        Set<g.a> set;
        int i12 = e0.f15881a;
        if (i12 < 21 || !k.a(exc)) {
            if (i12 < 23 || !l.a(exc)) {
                if (i12 < 18 || !j.b(exc)) {
                    if (i12 >= 18 && j.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof y) {
                        i11 = 6001;
                    } else if (exc instanceof b.c) {
                        i11 = 6003;
                    } else if (exc instanceof u) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        } else {
            i11 = k.b(exc);
        }
        this.f121u = new e.a(i11, exc);
        v5.m.d("DefaultDrmSession", "DRM session error", exc);
        v5.f<g.a> fVar = this.f110i;
        synchronized (fVar.f15895a) {
            set = fVar.f15897c;
        }
        Iterator<g.a> it = set.iterator();
        while (it.hasNext()) {
            it.next().e(exc);
        }
        if (this.f117p != 4) {
            this.f117p = 1;
        }
    }

    public final void d(Exception exc, boolean z10) {
        if (!(exc instanceof NotProvisionedException)) {
            c(z10 ? 1 : 2, exc);
            return;
        }
        b.e eVar = (b.e) this.f105c;
        eVar.f161a.add(this);
        if (eVar.f162b != null) {
            return;
        }
        eVar.f162b = this;
        o.d b10 = this.f104b.b();
        this.f125y = b10;
        c cVar = this.f120s;
        int i10 = e0.f15881a;
        b10.getClass();
        cVar.getClass();
        cVar.obtainMessage(0, new d(z4.n.f17701b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
    }

    @Override // a4.e
    public final int e() {
        p();
        return this.f117p;
    }

    @Override // a4.e
    public final void f(g.a aVar) {
        p();
        int i10 = this.f118q;
        if (i10 <= 0) {
            v5.m.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f118q = i11;
        if (i11 == 0) {
            this.f117p = 0;
            e eVar = this.f116o;
            int i12 = e0.f15881a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f120s;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f126a = true;
            }
            this.f120s = null;
            this.f119r.quit();
            this.f119r = null;
            this.t = null;
            this.f121u = null;
            this.f124x = null;
            this.f125y = null;
            byte[] bArr = this.f122v;
            if (bArr != null) {
                this.f104b.f(bArr);
                this.f122v = null;
            }
        }
        if (aVar != null) {
            v5.f<g.a> fVar = this.f110i;
            synchronized (fVar.f15895a) {
                Integer num = (Integer) fVar.f15896b.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(fVar.f15898d);
                    arrayList.remove(aVar);
                    fVar.f15898d = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        fVar.f15896b.remove(aVar);
                        HashSet hashSet = new HashSet(fVar.f15897c);
                        hashSet.remove(aVar);
                        fVar.f15897c = Collections.unmodifiableSet(hashSet);
                    } else {
                        fVar.f15896b.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f110i.a(aVar) == 0) {
                aVar.f();
            }
        }
        b bVar = this.f106d;
        int i13 = this.f118q;
        b.f fVar2 = (b.f) bVar;
        if (i13 == 1) {
            a4.b bVar2 = a4.b.this;
            if (bVar2.f146p > 0 && bVar2.f142l != -9223372036854775807L) {
                bVar2.f145o.add(this);
                Handler handler = a4.b.this.f150u;
                handler.getClass();
                handler.postAtTime(new b.d(this, 8), this, SystemClock.uptimeMillis() + a4.b.this.f142l);
                a4.b.this.k();
            }
        }
        if (i13 == 0) {
            a4.b.this.f143m.remove(this);
            a4.b bVar3 = a4.b.this;
            if (bVar3.f148r == this) {
                bVar3.f148r = null;
            }
            if (bVar3.f149s == this) {
                bVar3.f149s = null;
            }
            b.e eVar2 = bVar3.f139i;
            eVar2.f161a.remove(this);
            if (eVar2.f162b == this) {
                eVar2.f162b = null;
                if (!eVar2.f161a.isEmpty()) {
                    a aVar2 = (a) eVar2.f161a.iterator().next();
                    eVar2.f162b = aVar2;
                    o.d b10 = aVar2.f104b.b();
                    aVar2.f125y = b10;
                    c cVar2 = aVar2.f120s;
                    int i14 = e0.f15881a;
                    b10.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new d(z4.n.f17701b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
                }
            }
            a4.b bVar4 = a4.b.this;
            if (bVar4.f142l != -9223372036854775807L) {
                Handler handler2 = bVar4.f150u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                a4.b.this.f145o.remove(this);
            }
        }
        a4.b.this.k();
    }

    @Override // a4.e
    public final UUID g() {
        p();
        return this.f114m;
    }

    @Override // a4.e
    public final void h(g.a aVar) {
        p();
        if (this.f118q < 0) {
            StringBuilder l10 = defpackage.f.l("Session reference count less than zero: ");
            l10.append(this.f118q);
            v5.m.c("DefaultDrmSession", l10.toString());
            this.f118q = 0;
        }
        if (aVar != null) {
            v5.f<g.a> fVar = this.f110i;
            synchronized (fVar.f15895a) {
                ArrayList arrayList = new ArrayList(fVar.f15898d);
                arrayList.add(aVar);
                fVar.f15898d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) fVar.f15896b.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(fVar.f15897c);
                    hashSet.add(aVar);
                    fVar.f15897c = Collections.unmodifiableSet(hashSet);
                }
                fVar.f15896b.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i10 = this.f118q + 1;
        this.f118q = i10;
        if (i10 == 1) {
            x6.b.H(this.f117p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f119r = handlerThread;
            handlerThread.start();
            this.f120s = new c(this.f119r.getLooper());
            if (m()) {
                a(true);
            }
        } else if (aVar != null && b() && this.f110i.a(aVar) == 1) {
            aVar.d(this.f117p);
        }
        b.f fVar2 = (b.f) this.f106d;
        a4.b bVar = a4.b.this;
        if (bVar.f142l != -9223372036854775807L) {
            bVar.f145o.remove(this);
            Handler handler = a4.b.this.f150u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // a4.e
    public final boolean i() {
        p();
        return this.f;
    }

    @Override // a4.e
    public final boolean j(String str) {
        p();
        o oVar = this.f104b;
        byte[] bArr = this.f122v;
        x6.b.K(bArr);
        return oVar.m(str, bArr);
    }

    @Override // a4.e
    public final e.a k() {
        p();
        if (this.f117p == 1) {
            return this.f121u;
        }
        return null;
    }

    @Override // a4.e
    public final z3.b l() {
        p();
        return this.t;
    }

    public final boolean m() {
        Set<g.a> set;
        if (b()) {
            return true;
        }
        try {
            byte[] d10 = this.f104b.d();
            this.f122v = d10;
            this.f104b.j(d10, this.f112k);
            this.t = this.f104b.c(this.f122v);
            this.f117p = 3;
            v5.f<g.a> fVar = this.f110i;
            synchronized (fVar.f15895a) {
                set = fVar.f15897c;
            }
            Iterator<g.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f122v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            b.e eVar = (b.e) this.f105c;
            eVar.f161a.add(this);
            if (eVar.f162b == null) {
                eVar.f162b = this;
                o.d b10 = this.f104b.b();
                this.f125y = b10;
                c cVar = this.f120s;
                int i10 = e0.f15881a;
                b10.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(z4.n.f17701b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b10)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            c(1, e10);
            return false;
        }
    }

    public final void n(byte[] bArr, int i10, boolean z10) {
        try {
            o.a k10 = this.f104b.k(bArr, this.f103a, i10, this.f109h);
            this.f124x = k10;
            c cVar = this.f120s;
            int i11 = e0.f15881a;
            k10.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(z4.n.f17701b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k10)).sendToTarget();
        } catch (Exception e10) {
            d(e10, true);
        }
    }

    public final Map<String, String> o() {
        p();
        byte[] bArr = this.f122v;
        if (bArr == null) {
            return null;
        }
        return this.f104b.a(bArr);
    }

    public final void p() {
        if (Thread.currentThread() != this.f115n.getThread()) {
            StringBuilder l10 = defpackage.f.l("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            l10.append(Thread.currentThread().getName());
            l10.append("\nExpected thread: ");
            l10.append(this.f115n.getThread().getName());
            v5.m.g("DefaultDrmSession", l10.toString(), new IllegalStateException());
        }
    }
}
