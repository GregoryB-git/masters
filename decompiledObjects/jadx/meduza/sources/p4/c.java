package p4;

import u4.g;
import v3.i0;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12998a = new a();

    public class a implements c {
        @Override // p4.c
        public final boolean a(i0 i0Var) {
            String str = i0Var.t;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p4.c
        public final e9.a b(i0 i0Var) {
            String str = i0Var.t;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new q4.b();
                    case "application/x-icy":
                        return new t4.a();
                    case "application/id3":
                        return new g(null);
                    case "application/x-emsg":
                        return new r4.b();
                    case "application/x-scte35":
                        return new w4.c();
                }
            }
            throw new IllegalArgumentException(defpackage.g.d("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(i0 i0Var);

    e9.a b(i0 i0Var);
}
