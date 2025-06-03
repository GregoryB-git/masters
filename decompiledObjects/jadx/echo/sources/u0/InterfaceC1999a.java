package u0;

import T0.h;
import d0.C1194q;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1999a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1999a f19652a = new C0276a();

    /* renamed from: u0.a$a, reason: collision with other inner class name */
    public class C0276a implements InterfaceC1999a {
        @Override // u0.InterfaceC1999a
        public boolean a(C1194q c1194q) {
            String str = c1194q.f12726n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // u0.InterfaceC1999a
        public O0.a b(C1194q c1194q) {
            String str = c1194q.f12726n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new P0.b();
                    case "application/x-icy":
                        return new S0.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new Q0.b();
                    case "application/x-scte35":
                        return new V0.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(C1194q c1194q);

    O0.a b(C1194q c1194q);
}
