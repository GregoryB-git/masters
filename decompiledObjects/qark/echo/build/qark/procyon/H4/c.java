// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H4;

import M4.m;
import com.google.protobuf.t;
import java.net.URI;
import android.content.Context;
import N4.h;
import F4.a;

public final class c extends e
{
    public static final a c;
    public final h a;
    public final Context b;
    
    static {
        c = a.e();
    }
    
    public c(final h a, final Context b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean c() {
        if (this.j(this.a.x0())) {
            final a c = H4.c.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("URL is missing:");
            sb.append(this.a.x0());
            c.j(sb.toString());
            return false;
        }
        final URI g = this.g(this.a.x0());
        if (g == null) {
            H4.c.c.j("URL cannot be parsed");
            return false;
        }
        if (!this.h(g, this.b)) {
            final a c2 = H4.c.c;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("URL fails allowlist rule: ");
            sb2.append(g);
            c2.j(sb2.toString());
            return false;
        }
        if (!this.k(g.getHost())) {
            H4.c.c.j("URL host is null or invalid");
            return false;
        }
        if (!this.p(g.getScheme())) {
            H4.c.c.j("URL scheme is null or invalid");
            return false;
        }
        if (!this.r(g.getUserInfo())) {
            H4.c.c.j("URL user info is null");
            return false;
        }
        if (!this.o(g.getPort())) {
            H4.c.c.j("URL port is less than or equal to 0");
            return false;
        }
        t.a n0;
        if (this.a.z0()) {
            n0 = this.a.n0();
        }
        else {
            n0 = null;
        }
        if (!this.l((h.d)n0)) {
            final a c3 = H4.c.c;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("HTTP Method is null or invalid: ");
            sb3.append(this.a.n0());
            c3.j(sb3.toString());
            return false;
        }
        if (this.a.A0() && !this.m(this.a.o0())) {
            final a c4 = H4.c.c;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("HTTP ResponseCode is a negative value:");
            sb4.append(this.a.o0());
            c4.j(sb4.toString());
            return false;
        }
        if (this.a.B0() && !this.n(this.a.r0())) {
            final a c5 = H4.c.c;
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Request Payload is a negative value:");
            sb5.append(this.a.r0());
            c5.j(sb5.toString());
            return false;
        }
        if (this.a.C0() && !this.n(this.a.t0())) {
            final a c6 = H4.c.c;
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Response Payload is a negative value:");
            sb6.append(this.a.t0());
            c6.j(sb6.toString());
            return false;
        }
        if (!this.a.y0() || this.a.l0() <= 0L) {
            final a c7 = H4.c.c;
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Start time of the request is null, or zero, or a negative value:");
            sb7.append(this.a.l0());
            c7.j(sb7.toString());
            return false;
        }
        if (this.a.D0() && !this.q(this.a.u0())) {
            final a c8 = H4.c.c;
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("Time to complete the request is a negative value:");
            sb8.append(this.a.u0());
            c8.j(sb8.toString());
            return false;
        }
        if (this.a.F0() && !this.q(this.a.w0())) {
            final a c9 = H4.c.c;
            final StringBuilder sb9 = new StringBuilder();
            sb9.append("Time from the start of the request to the start of the response is null or a negative value:");
            sb9.append(this.a.w0());
            c9.j(sb9.toString());
            return false;
        }
        if (!this.a.E0() || this.a.v0() <= 0L) {
            final a c10 = H4.c.c;
            final StringBuilder sb10 = new StringBuilder();
            sb10.append("Time from the start of the request to the end of the response is null, negative or zero:");
            sb10.append(this.a.v0());
            c10.j(sb10.toString());
            return false;
        }
        if (!this.a.A0()) {
            H4.c.c.j("Did not receive a HTTP Response Code");
            return false;
        }
        return true;
    }
    
    public final URI g(String create) {
        if (create == null) {
            return null;
        }
        try {
            create = (IllegalStateException)URI.create((String)create);
            return (URI)create;
        }
        catch (IllegalStateException create) {}
        catch (IllegalArgumentException ex) {}
        H4.c.c.k("getResultUrl throws exception %s", create.getMessage());
        return null;
    }
    
    public final boolean h(final URI uri, final Context context) {
        return uri != null && m.a(uri, context);
    }
    
    public final boolean i(final String s) {
        return s == null || s.trim().isEmpty();
    }
    
    public final boolean j(final String s) {
        return this.i(s);
    }
    
    public final boolean k(final String s) {
        return s != null && !this.i(s) && s.length() <= 255;
    }
    
    public boolean l(final h.d d) {
        return d != null && d != h.d.p;
    }
    
    public final boolean m(final int n) {
        return n > 0;
    }
    
    public final boolean n(final long n) {
        return n >= 0L;
    }
    
    public final boolean o(final int n) {
        return n == -1 || n > 0;
    }
    
    public final boolean p(final String s) {
        boolean b = false;
        if (s == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s)) {
            b = true;
        }
        return b;
    }
    
    public final boolean q(final long n) {
        return n >= 0L;
    }
    
    public final boolean r(final String s) {
        return s == null;
    }
}
