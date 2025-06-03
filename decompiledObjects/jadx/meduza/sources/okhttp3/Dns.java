package okhttp3;

import defpackage.g;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public interface Dns {

    /* renamed from: a, reason: collision with root package name */
    public static final Dns f12234a = new Dns() { // from class: okhttp3.Dns.1
        @Override // okhttp3.Dns
        public final List<InetAddress> a(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e10) {
                UnknownHostException unknownHostException = new UnknownHostException(g.d("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e10);
                throw unknownHostException;
            }
        }
    };

    List<InetAddress> a(String str);
}
