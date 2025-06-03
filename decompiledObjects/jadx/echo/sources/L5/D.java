package L5;

import Q3.r;
import V2.AbstractC0659j;
import V2.C0660k;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class D implements r.b {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f3395a;

    /* renamed from: b, reason: collision with root package name */
    public final C0660k f3396b = new C0660k();

    /* renamed from: c, reason: collision with root package name */
    public final int f3397c;

    public D(E5.k kVar, int i7) {
        this.f3395a = kVar;
        this.f3397c = i7;
    }

    @Override // Q3.r.b
    public r.c a(Q3.m mVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("key", mVar.a());
        hashMap.put("value", mVar.c());
        hashMap2.put("snapshot", hashMap);
        hashMap2.put("transactionKey", Integer.valueOf(this.f3397c));
        try {
            Object c7 = new C(this.f3395a).c(hashMap2);
            Objects.requireNonNull(c7);
            Map map = (Map) c7;
            Object obj = map.get("aborted");
            Objects.requireNonNull(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = map.get("exception");
            Objects.requireNonNull(obj2);
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            if (!booleanValue && !booleanValue2) {
                mVar.d(map.get("value"));
                return Q3.r.b(mVar);
            }
            return Q3.r.a();
        } catch (Exception e7) {
            Log.e("firebase_database", "An unexpected exception occurred for a transaction.", e7);
            return Q3.r.a();
        }
    }

    @Override // Q3.r.b
    public void b(Q3.c cVar, boolean z7, Q3.b bVar) {
        if (cVar != null) {
            this.f3396b.b(y.a(cVar));
        } else if (bVar != null) {
            x xVar = new x(bVar);
            HashMap hashMap = new HashMap();
            hashMap.put("committed", Boolean.valueOf(z7));
            this.f3396b.c(xVar.b(hashMap).a());
        }
    }

    public AbstractC0659j c() {
        return this.f3396b.a();
    }
}
