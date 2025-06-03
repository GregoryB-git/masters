/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URI
 */
package H4;

import F4.a;
import H4.e;
import M4.m;
import N4.h;
import android.content.Context;
import java.net.URI;

public final class c
extends e {
    public static final a c = a.e();
    public final h a;
    public final Context b;

    public c(h h8, Context context) {
        this.b = context;
        this.a = h8;
    }

    @Override
    public boolean c() {
        if (this.j(this.a.x0())) {
            a a8 = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("URL is missing:");
            stringBuilder.append(this.a.x0());
            a8.j(stringBuilder.toString());
            return false;
        }
        Object object = this.g(this.a.x0());
        if (object == null) {
            c.j("URL cannot be parsed");
            return false;
        }
        if (!this.h((URI)object, this.b)) {
            a a9 = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("URL fails allowlist rule: ");
            stringBuilder.append(object);
            a9.j(stringBuilder.toString());
            return false;
        }
        if (!this.k(object.getHost())) {
            c.j("URL host is null or invalid");
            return false;
        }
        if (!this.p(object.getScheme())) {
            c.j("URL scheme is null or invalid");
            return false;
        }
        if (!this.r(object.getUserInfo())) {
            c.j("URL user info is null");
            return false;
        }
        if (!this.o(object.getPort())) {
            c.j("URL port is less than or equal to 0");
            return false;
        }
        object = this.a.z0() ? this.a.n0() : null;
        if (!this.l((h.d)object)) {
            object = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HTTP Method is null or invalid: ");
            stringBuilder.append((Object)this.a.n0());
            object.j(stringBuilder.toString());
            return false;
        }
        if (this.a.A0() && !this.m(this.a.o0())) {
            object = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HTTP ResponseCode is a negative value:");
            stringBuilder.append(this.a.o0());
            object.j(stringBuilder.toString());
            return false;
        }
        if (this.a.B0() && !this.n(this.a.r0())) {
            object = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request Payload is a negative value:");
            stringBuilder.append(this.a.r0());
            object.j(stringBuilder.toString());
            return false;
        }
        if (this.a.C0() && !this.n(this.a.t0())) {
            object = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Response Payload is a negative value:");
            stringBuilder.append(this.a.t0());
            object.j(stringBuilder.toString());
            return false;
        }
        if (this.a.y0() && this.a.l0() > 0L) {
            if (this.a.D0() && !this.q(this.a.u0())) {
                object = c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Time to complete the request is a negative value:");
                stringBuilder.append(this.a.u0());
                object.j(stringBuilder.toString());
                return false;
            }
            if (this.a.F0() && !this.q(this.a.w0())) {
                object = c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Time from the start of the request to the start of the response is null or a negative value:");
                stringBuilder.append(this.a.w0());
                object.j(stringBuilder.toString());
                return false;
            }
            if (this.a.E0() && this.a.v0() > 0L) {
                if (!this.a.A0()) {
                    c.j("Did not receive a HTTP Response Code");
                    return false;
                }
                return true;
            }
            object = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Time from the start of the request to the end of the response is null, negative or zero:");
            stringBuilder.append(this.a.v0());
            object.j(stringBuilder.toString());
            return false;
        }
        object = c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Start time of the request is null, or zero, or a negative value:");
        stringBuilder.append(this.a.l0());
        object.j(stringBuilder.toString());
        return false;
    }

    public final URI g(String string2) {
        void var1_4;
        if (string2 == null) {
            return null;
        }
        try {
            string2 = URI.create((String)string2);
            return string2;
        }
        catch (IllegalStateException illegalStateException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        c.k("getResultUrl throws exception %s", var1_4.getMessage());
        return null;
    }

    public final boolean h(URI uRI, Context context) {
        if (uRI == null) {
            return false;
        }
        return m.a(uRI, context);
    }

    public final boolean i(String string2) {
        if (string2 == null) {
            return true;
        }
        return string2.trim().isEmpty();
    }

    public final boolean j(String string2) {
        return this.i(string2);
    }

    public final boolean k(String string2) {
        if (string2 != null && !this.i(string2) && string2.length() <= 255) {
            return true;
        }
        return false;
    }

    public boolean l(h.d d8) {
        if (d8 != null && d8 != h.d.p) {
            return true;
        }
        return false;
    }

    public final boolean m(int n8) {
        if (n8 > 0) {
            return true;
        }
        return false;
    }

    public final boolean n(long l8) {
        if (l8 >= 0L) {
            return true;
        }
        return false;
    }

    public final boolean o(int n8) {
        if (n8 != -1 && n8 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean p(String string2) {
        boolean bl = false;
        if (string2 == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(string2) || "https".equalsIgnoreCase(string2)) {
            bl = true;
        }
        return bl;
    }

    public final boolean q(long l8) {
        if (l8 >= 0L) {
            return true;
        }
        return false;
    }

    public final boolean r(String string2) {
        if (string2 == null) {
            return true;
        }
        return false;
    }
}

