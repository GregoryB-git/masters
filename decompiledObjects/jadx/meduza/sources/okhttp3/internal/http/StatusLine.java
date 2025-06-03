package okhttp3.internal.http;

import defpackage.g;
import java.net.ProtocolException;
import okhttp3.Protocol;

/* loaded from: classes.dex */
public final class StatusLine {

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f12474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12475b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12476c;

    public StatusLine(Protocol protocol, int i10, String str) {
        this.f12474a = protocol;
        this.f12475b = i10;
        this.f12476c = str;
    }

    public static StatusLine a(String str) {
        String str2;
        Protocol protocol = Protocol.HTTP_1_0;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(g.d("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(g.d("Unexpected status line: ", str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(g.d("Unexpected status line: ", str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException(g.d("Unexpected status line: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                str2 = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException(g.d("Unexpected status line: ", str));
                }
                str2 = str.substring(i10 + 4);
            }
            return new StatusLine(protocol, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(g.d("Unexpected status line: ", str));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12474a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f12475b);
        if (this.f12476c != null) {
            sb2.append(' ');
            sb2.append(this.f12476c);
        }
        return sb2.toString();
    }
}
