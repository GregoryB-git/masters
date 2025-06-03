package r5;

import r5.j;
import v3.l1;
import v3.s1;
import v5.e0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f13775a;

    /* renamed from: b, reason: collision with root package name */
    public final l1[] f13776b;

    /* renamed from: c, reason: collision with root package name */
    public final h[] f13777c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f13778d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13779e;

    public p(l1[] l1VarArr, h[] hVarArr, s1 s1Var, j.a aVar) {
        this.f13776b = l1VarArr;
        this.f13777c = (h[]) hVarArr.clone();
        this.f13778d = s1Var;
        this.f13779e = aVar;
        this.f13775a = l1VarArr.length;
    }

    public final boolean a(p pVar, int i10) {
        return pVar != null && e0.a(this.f13776b[i10], pVar.f13776b[i10]) && e0.a(this.f13777c[i10], pVar.f13777c[i10]);
    }

    public final boolean b(int i10) {
        return this.f13776b[i10] != null;
    }
}
