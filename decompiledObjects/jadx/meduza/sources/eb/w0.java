package eb;

import eb.d1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f5249d = Logger.getLogger(w0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static w0 f5250e;

    /* renamed from: a, reason: collision with root package name */
    public String f5251a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<v0> f5252b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public o7.u<String, v0> f5253c = o7.m0.f12013o;

    public static final class a implements d1.a<v0> {
        @Override // eb.d1.a
        public final boolean a(v0 v0Var) {
            return v0Var.d();
        }

        @Override // eb.d1.a
        public final int b(v0 v0Var) {
            return v0Var.e();
        }
    }

    public final synchronized void a() {
        HashMap hashMap = new HashMap();
        int i10 = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<v0> it = this.f5252b.iterator();
        while (it.hasNext()) {
            v0 next = it.next();
            next.a();
            v0 v0Var = (v0) hashMap.get("dns");
            if (v0Var == null || v0Var.e() < next.e()) {
                hashMap.put("dns", next);
            }
            if (i10 < next.e()) {
                i10 = next.e();
                next.a();
                str = "dns";
            }
        }
        this.f5253c = o7.u.b(hashMap);
        this.f5251a = str;
    }
}
