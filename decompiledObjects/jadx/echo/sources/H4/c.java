package H4;

import M4.m;
import N4.h;
import android.content.Context;
import java.net.URI;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final F4.a f2398c = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final h f2399a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2400b;

    public c(h hVar, Context context) {
        this.f2400b = context;
        this.f2399a = hVar;
    }

    @Override // H4.e
    public boolean c() {
        if (j(this.f2399a.x0())) {
            f2398c.j("URL is missing:" + this.f2399a.x0());
            return false;
        }
        URI g7 = g(this.f2399a.x0());
        if (g7 == null) {
            f2398c.j("URL cannot be parsed");
            return false;
        }
        if (!h(g7, this.f2400b)) {
            f2398c.j("URL fails allowlist rule: " + g7);
            return false;
        }
        if (!k(g7.getHost())) {
            f2398c.j("URL host is null or invalid");
            return false;
        }
        if (!p(g7.getScheme())) {
            f2398c.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(g7.getUserInfo())) {
            f2398c.j("URL user info is null");
            return false;
        }
        if (!o(g7.getPort())) {
            f2398c.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f2399a.z0() ? this.f2399a.n0() : null)) {
            f2398c.j("HTTP Method is null or invalid: " + this.f2399a.n0());
            return false;
        }
        if (this.f2399a.A0() && !m(this.f2399a.o0())) {
            f2398c.j("HTTP ResponseCode is a negative value:" + this.f2399a.o0());
            return false;
        }
        if (this.f2399a.B0() && !n(this.f2399a.r0())) {
            f2398c.j("Request Payload is a negative value:" + this.f2399a.r0());
            return false;
        }
        if (this.f2399a.C0() && !n(this.f2399a.t0())) {
            f2398c.j("Response Payload is a negative value:" + this.f2399a.t0());
            return false;
        }
        if (!this.f2399a.y0() || this.f2399a.l0() <= 0) {
            f2398c.j("Start time of the request is null, or zero, or a negative value:" + this.f2399a.l0());
            return false;
        }
        if (this.f2399a.D0() && !q(this.f2399a.u0())) {
            f2398c.j("Time to complete the request is a negative value:" + this.f2399a.u0());
            return false;
        }
        if (this.f2399a.F0() && !q(this.f2399a.w0())) {
            f2398c.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f2399a.w0());
            return false;
        }
        if (this.f2399a.E0() && this.f2399a.v0() > 0) {
            if (this.f2399a.A0()) {
                return true;
            }
            f2398c.j("Did not receive a HTTP Response Code");
            return false;
        }
        f2398c.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f2399a.v0());
        return false;
    }

    public final URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e7) {
            f2398c.k("getResultUrl throws exception %s", e7.getMessage());
            return null;
        }
    }

    public final boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    public final boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public final boolean j(String str) {
        return i(str);
    }

    public final boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    public boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    public final boolean m(int i7) {
        return i7 > 0;
    }

    public final boolean n(long j7) {
        return j7 >= 0;
    }

    public final boolean o(int i7) {
        return i7 == -1 || i7 > 0;
    }

    public final boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    public final boolean q(long j7) {
        return j7 >= 0;
    }

    public final boolean r(String str) {
        return str == null;
    }
}
