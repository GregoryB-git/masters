package p6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1876y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18569a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1854j f18570b;

    /* renamed from: c, reason: collision with root package name */
    public final g6.l f18571c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18572d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f18573e;

    public C1876y(Object obj, AbstractC1854j abstractC1854j, g6.l lVar, Object obj2, Throwable th) {
        this.f18569a = obj;
        this.f18570b = abstractC1854j;
        this.f18571c = lVar;
        this.f18572d = obj2;
        this.f18573e = th;
    }

    public static /* synthetic */ C1876y b(C1876y c1876y, Object obj, AbstractC1854j abstractC1854j, g6.l lVar, Object obj2, Throwable th, int i7, Object obj3) {
        if ((i7 & 1) != 0) {
            obj = c1876y.f18569a;
        }
        if ((i7 & 2) != 0) {
            abstractC1854j = c1876y.f18570b;
        }
        AbstractC1854j abstractC1854j2 = abstractC1854j;
        if ((i7 & 4) != 0) {
            lVar = c1876y.f18571c;
        }
        g6.l lVar2 = lVar;
        if ((i7 & 8) != 0) {
            obj2 = c1876y.f18572d;
        }
        Object obj4 = obj2;
        if ((i7 & 16) != 0) {
            th = c1876y.f18573e;
        }
        return c1876y.a(obj, abstractC1854j2, lVar2, obj4, th);
    }

    public final C1876y a(Object obj, AbstractC1854j abstractC1854j, g6.l lVar, Object obj2, Throwable th) {
        return new C1876y(obj, abstractC1854j, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f18573e != null;
    }

    public final void d(C1860m c1860m, Throwable th) {
        AbstractC1854j abstractC1854j = this.f18570b;
        if (abstractC1854j != null) {
            c1860m.l(abstractC1854j, th);
        }
        g6.l lVar = this.f18571c;
        if (lVar != null) {
            c1860m.m(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1876y)) {
            return false;
        }
        C1876y c1876y = (C1876y) obj;
        return Intrinsics.a(this.f18569a, c1876y.f18569a) && Intrinsics.a(this.f18570b, c1876y.f18570b) && Intrinsics.a(this.f18571c, c1876y.f18571c) && Intrinsics.a(this.f18572d, c1876y.f18572d) && Intrinsics.a(this.f18573e, c1876y.f18573e);
    }

    public int hashCode() {
        Object obj = this.f18569a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1854j abstractC1854j = this.f18570b;
        int hashCode2 = (hashCode + (abstractC1854j == null ? 0 : abstractC1854j.hashCode())) * 31;
        g6.l lVar = this.f18571c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f18572d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f18573e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f18569a + ", cancelHandler=" + this.f18570b + ", onCancellation=" + this.f18571c + ", idempotentResume=" + this.f18572d + ", cancelCause=" + this.f18573e + ')';
    }

    public /* synthetic */ C1876y(Object obj, AbstractC1854j abstractC1854j, g6.l lVar, Object obj2, Throwable th, int i7, kotlin.jvm.internal.g gVar) {
        this(obj, (i7 & 2) != 0 ? null : abstractC1854j, (i7 & 4) != 0 ? null : lVar, (i7 & 8) != 0 ? null : obj2, (i7 & 16) != 0 ? null : th);
    }
}
