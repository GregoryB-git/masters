package nc;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11549a;

    /* renamed from: b, reason: collision with root package name */
    public final i f11550b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.l<Throwable, rb.h> f11551c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11552d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f11553e;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Object obj, i iVar, dc.l<? super Throwable, rb.h> lVar, Object obj2, Throwable th) {
        this.f11549a = obj;
        this.f11550b = iVar;
        this.f11551c = lVar;
        this.f11552d = obj2;
        this.f11553e = th;
    }

    public /* synthetic */ t(Object obj, i iVar, dc.l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : iVar, (dc.l<? super Throwable, rb.h>) ((i10 & 4) != 0 ? null : lVar), (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static t a(t tVar, i iVar, CancellationException cancellationException, int i10) {
        Object obj = (i10 & 1) != 0 ? tVar.f11549a : null;
        if ((i10 & 2) != 0) {
            iVar = tVar.f11550b;
        }
        i iVar2 = iVar;
        dc.l<Throwable, rb.h> lVar = (i10 & 4) != 0 ? tVar.f11551c : null;
        Object obj2 = (i10 & 8) != 0 ? tVar.f11552d : null;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = tVar.f11553e;
        }
        tVar.getClass();
        return new t(obj, iVar2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return ec.i.a(this.f11549a, tVar.f11549a) && ec.i.a(this.f11550b, tVar.f11550b) && ec.i.a(this.f11551c, tVar.f11551c) && ec.i.a(this.f11552d, tVar.f11552d) && ec.i.a(this.f11553e, tVar.f11553e);
    }

    public final int hashCode() {
        Object obj = this.f11549a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f11550b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        dc.l<Throwable, rb.h> lVar = this.f11551c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f11552d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f11553e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CompletedContinuation(result=");
        l10.append(this.f11549a);
        l10.append(", cancelHandler=");
        l10.append(this.f11550b);
        l10.append(", onCancellation=");
        l10.append(this.f11551c);
        l10.append(", idempotentResume=");
        l10.append(this.f11552d);
        l10.append(", cancelCause=");
        l10.append(this.f11553e);
        l10.append(')');
        return l10.toString();
    }
}
