package m9;

import m9.h0;
import n9.a;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public int f10751b;

    /* renamed from: c, reason: collision with root package name */
    public a.C0174a f10752c;

    /* renamed from: e, reason: collision with root package name */
    public final n9.a f10754e;
    public final a f;

    /* renamed from: a, reason: collision with root package name */
    public g9.d0 f10750a = g9.d0.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10753d = true;

    public interface a {
    }

    public b0(n9.a aVar, aa.m0 m0Var) {
        this.f10754e = aVar;
        this.f = m0Var;
    }

    public final void a(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        Object[] objArr = new Object[1];
        if (!this.f10753d) {
            objArr[0] = format;
            p2.m0.w("OnlineStateTracker", "%s", objArr);
        } else {
            objArr[0] = format;
            p2.m0.h0("OnlineStateTracker", "%s", objArr);
            this.f10753d = false;
        }
    }

    public final void b(g9.d0 d0Var) {
        if (d0Var != this.f10750a) {
            this.f10750a = d0Var;
            ((h0.a) ((aa.m0) this.f).f339b).b(d0Var);
        }
    }

    public final void c(g9.d0 d0Var) {
        a.C0174a c0174a = this.f10752c;
        if (c0174a != null) {
            c0174a.a();
            this.f10752c = null;
        }
        this.f10751b = 0;
        if (d0Var == g9.d0.ONLINE) {
            this.f10753d = false;
        }
        b(d0Var);
    }
}
