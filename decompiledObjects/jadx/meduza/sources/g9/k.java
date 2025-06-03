package g9;

import g9.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j0.b {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5994a;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5996c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public d0 f5997d = d0.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5995b = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5998a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5999b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6000c;

        /* renamed from: d, reason: collision with root package name */
        public d9.a0 f6001d = d9.a0.DEFAULT;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f6002a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public s0 f6003b;

        public final boolean a() {
            Iterator it = this.f6002a.iterator();
            while (it.hasNext()) {
                if (((g0) it.next()).a()) {
                    return true;
                }
            }
            return false;
        }
    }

    public k(j0 j0Var) {
        this.f5994a = j0Var;
        j0Var.f5991n = this;
    }

    public final void a(List<s0> list) {
        boolean z10 = false;
        for (s0 s0Var : list) {
            b bVar = (b) this.f5995b.get(s0Var.f6076a);
            if (bVar != null) {
                Iterator it = bVar.f6002a.iterator();
                while (it.hasNext()) {
                    if (((g0) it.next()).b(s0Var)) {
                        z10 = true;
                    }
                }
                bVar.f6003b = s0Var;
            }
        }
        if (z10) {
            b();
        }
    }

    public final void b() {
        Iterator it = this.f5996c.iterator();
        while (it.hasNext()) {
            ((d9.l) it.next()).a(null, null);
        }
    }
}
