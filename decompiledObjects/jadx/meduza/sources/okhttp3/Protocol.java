package okhttp3;

import defpackage.g;
import java.io.IOException;

/* loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    public final String f12311a;

    Protocol(String str) {
        this.f12311a = str;
    }

    public static Protocol f(String str) {
        Protocol protocol = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return protocol;
        }
        Protocol protocol2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return protocol2;
        }
        Protocol protocol3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return protocol3;
        }
        Protocol protocol4 = HTTP_2;
        if (str.equals("h2")) {
            return protocol4;
        }
        Protocol protocol5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return protocol5;
        }
        Protocol protocol6 = QUIC;
        if (str.equals("quic")) {
            return protocol6;
        }
        throw new IOException(g.d("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12311a;
    }
}
