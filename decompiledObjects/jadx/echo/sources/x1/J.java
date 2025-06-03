package x1;

import W5.C0680j;
import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J extends AbstractList {

    /* renamed from: u, reason: collision with root package name */
    public static final b f20926u = new b(null);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f20927v = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public Handler f20928o;

    /* renamed from: p, reason: collision with root package name */
    public int f20929p;

    /* renamed from: q, reason: collision with root package name */
    public final String f20930q;

    /* renamed from: r, reason: collision with root package name */
    public List f20931r;

    /* renamed from: s, reason: collision with root package name */
    public List f20932s;

    /* renamed from: t, reason: collision with root package name */
    public String f20933t;

    public interface a {
        void a(J j7);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public J(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20930q = String.valueOf(Integer.valueOf(f20927v.incrementAndGet()));
        this.f20932s = new ArrayList();
        this.f20931r = new ArrayList(requests);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public F get(int i7) {
        return (F) this.f20931r.get(i7);
    }

    public final String M() {
        return this.f20933t;
    }

    public final Handler S() {
        return this.f20928o;
    }

    public final List T() {
        return this.f20932s;
    }

    public final String U() {
        return this.f20930q;
    }

    public final List V() {
        return this.f20931r;
    }

    public int W() {
        return this.f20931r.size();
    }

    public final int X() {
        return this.f20929p;
    }

    public /* bridge */ int Y(F f7) {
        return super.indexOf(f7);
    }

    public /* bridge */ int Z(F f7) {
        return super.lastIndexOf(f7);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i7, F element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f20931r.add(i7, element);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ F remove(int i7) {
        return c0(i7);
    }

    public /* bridge */ boolean b0(F f7) {
        return super.remove(f7);
    }

    public F c0(int i7) {
        return (F) this.f20931r.remove(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f20931r.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof F)) {
            return g((F) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(F element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f20931r.add(element);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public F set(int i7, F element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (F) this.f20931r.set(i7, element);
    }

    public final void e0(Handler handler) {
        this.f20928o = handler;
    }

    public final void f(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f20932s.contains(callback)) {
            return;
        }
        this.f20932s.add(callback);
    }

    public /* bridge */ boolean g(F f7) {
        return super.contains(f7);
    }

    public final List i() {
        return k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof F)) {
            return Y((F) obj);
        }
        return -1;
    }

    public final List k() {
        return F.f20890n.j(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof F)) {
            return Z((F) obj);
        }
        return -1;
    }

    public final I q() {
        return s();
    }

    public final I s() {
        return F.f20890n.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return W();
    }

    public J(F... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20930q = String.valueOf(Integer.valueOf(f20927v.incrementAndGet()));
        this.f20932s = new ArrayList();
        this.f20931r = new ArrayList(C0680j.b(requests));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof F)) {
            return b0((F) obj);
        }
        return false;
    }
}
