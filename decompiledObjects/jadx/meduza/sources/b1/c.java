package b1;

import b1.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final g[] f1718a;

    public c(g[] gVarArr) {
        this.f1718a = gVarArr;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        new HashMap();
        for (g gVar : this.f1718a) {
            gVar.a();
        }
        for (g gVar2 : this.f1718a) {
            gVar2.a();
        }
    }
}
