package c1;

import c1.t;
import d0.C1194q;
import e1.C1241a;
import f1.C1287a;
import g1.C1312b;
import h1.C1331a;
import i1.C1345d;
import j1.C1369a;
import java.util.Objects;
import k1.C1450a;
import k1.C1456g;

/* loaded from: classes.dex */
public final class h implements t.a {
    @Override // c1.t.a
    public boolean a(C1194q c1194q) {
        String str = c1194q.f12726n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // c1.t.a
    public t b(C1194q c1194q) {
        String str = c1194q.f12726n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C1241a(c1194q.f12729q);
                case "application/pgs":
                    return new C1287a();
                case "application/x-mp4-vtt":
                    return new C1450a();
                case "text/vtt":
                    return new C1456g();
                case "application/x-quicktime-tx3g":
                    return new C1369a(c1194q.f12729q);
                case "text/x-ssa":
                    return new C1312b(c1194q.f12729q);
                case "application/x-subrip":
                    return new C1331a();
                case "application/ttml+xml":
                    return new C1345d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // c1.t.a
    public int c(C1194q c1194q) {
        String str = c1194q.f12726n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
