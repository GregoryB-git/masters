package va;

import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m.e f16012c;

    public /* synthetic */ b(d dVar, wa.c cVar, int i10) {
        this.f16010a = i10;
        this.f16011b = dVar;
        this.f16012c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16010a) {
            case 0:
                d dVar = this.f16011b;
                m.e eVar = this.f16012c;
                dVar.getClass();
                Object c10 = eVar.c("inTransaction");
                Boolean bool = c10 instanceof Boolean ? (Boolean) c10 : null;
                boolean z10 = false;
                if (Boolean.TRUE.equals(bool)) {
                    if (eVar.f() && ((Integer) eVar.c("transactionId")) == null) {
                        z10 = true;
                    }
                }
                if (z10) {
                    int i10 = dVar.f16023k + 1;
                    dVar.f16023k = i10;
                    dVar.f16024l = Integer.valueOf(i10);
                }
                if (!dVar.g(eVar)) {
                    if (z10) {
                        dVar.f16024l = null;
                        break;
                    }
                } else if (!z10) {
                    if (Boolean.FALSE.equals(bool)) {
                        dVar.f16024l = null;
                    }
                    ((wa.a) eVar).a(null);
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("transactionId", dVar.f16024l);
                    ((wa.a) eVar).a(hashMap);
                    break;
                }
                break;
            default:
                this.f16011b.f(this.f16012c);
                break;
        }
    }
}
