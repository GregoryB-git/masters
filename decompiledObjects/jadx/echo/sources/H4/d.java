package H4;

import N4.m;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final F4.a f2401b = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final m f2402a;

    public d(m mVar) {
        this.f2402a = mVar;
    }

    @Override // H4.e
    public boolean c() {
        F4.a aVar;
        StringBuilder sb;
        String str;
        if (!o(this.f2402a, 0)) {
            aVar = f2401b;
            sb = new StringBuilder();
            str = "Invalid Trace:";
        } else {
            if (!j(this.f2402a) || h(this.f2402a)) {
                return true;
            }
            aVar = f2401b;
            sb = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb.append(str);
        sb.append(this.f2402a.r0());
        aVar.j(sb.toString());
        return false;
    }

    public final boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                e.d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e7) {
                f2401b.j(e7.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean h(m mVar) {
        return i(mVar, 0);
    }

    public final boolean i(m mVar, int i7) {
        F4.a aVar;
        StringBuilder sb;
        String sb2;
        if (mVar == null) {
            return false;
        }
        if (i7 <= 1) {
            for (Map.Entry entry : mVar.l0().entrySet()) {
                if (!l((String) entry.getKey())) {
                    aVar = f2401b;
                    sb = new StringBuilder();
                    sb.append("invalid CounterId:");
                    sb.append((String) entry.getKey());
                } else if (!m((Long) entry.getValue())) {
                    aVar = f2401b;
                    sb = new StringBuilder();
                    sb.append("invalid CounterValue:");
                    sb.append(entry.getValue());
                }
                sb2 = sb.toString();
            }
            Iterator it = mVar.t0().iterator();
            while (it.hasNext()) {
                if (!i((m) it.next(), i7 + 1)) {
                    return false;
                }
            }
            return true;
        }
        aVar = f2401b;
        sb2 = "Exceed MAX_SUBTRACE_DEEP:1";
        aVar.j(sb2);
        return false;
    }

    public final boolean j(m mVar) {
        if (mVar.k0() > 0) {
            return true;
        }
        Iterator it = mVar.t0().iterator();
        while (it.hasNext()) {
            if (((m) it.next()).k0() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(m mVar) {
        return mVar.r0().startsWith("_st_");
    }

    public final boolean l(String str) {
        F4.a aVar;
        String str2;
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            aVar = f2401b;
            str2 = "counterId is empty";
        } else {
            if (trim.length() <= 100) {
                return true;
            }
            aVar = f2401b;
            str2 = "counterId exceeded max length 100";
        }
        aVar.j(str2);
        return false;
    }

    public final boolean m(Long l7) {
        return l7 != null;
    }

    public final boolean n(m mVar) {
        Long l7 = (Long) mVar.l0().get(M4.b.FRAMES_TOTAL.toString());
        return l7 != null && l7.compareTo((Long) 0L) > 0;
    }

    public final boolean o(m mVar, int i7) {
        if (mVar == null) {
            f2401b.j("TraceMetric is null");
            return false;
        }
        if (i7 > 1) {
            f2401b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.r0())) {
            f2401b.j("invalid TraceId:" + mVar.r0());
            return false;
        }
        if (!p(mVar)) {
            f2401b.j("invalid TraceDuration:" + mVar.o0());
            return false;
        }
        if (!mVar.u0()) {
            f2401b.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(mVar) || n(mVar)) {
            Iterator it = mVar.t0().iterator();
            while (it.hasNext()) {
                if (!o((m) it.next(), i7 + 1)) {
                    return false;
                }
            }
            return g(mVar.m0());
        }
        f2401b.j("non-positive totalFrames in screen trace " + mVar.r0());
        return false;
    }

    public final boolean p(m mVar) {
        return mVar != null && mVar.o0() > 0;
    }

    public final boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }
}
