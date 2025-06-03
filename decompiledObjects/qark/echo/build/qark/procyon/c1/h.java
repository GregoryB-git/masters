// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import k1.g;
import g1.b;
import h1.a;
import i1.d;
import java.util.Objects;
import d0.q;

public final class h implements a
{
    @Override
    public boolean a(final q q) {
        final String n = q.n;
        return Objects.equals(n, "text/x-ssa") || Objects.equals(n, "text/vtt") || Objects.equals(n, "application/x-mp4-vtt") || Objects.equals(n, "application/x-subrip") || Objects.equals(n, "application/x-quicktime-tx3g") || Objects.equals(n, "application/pgs") || Objects.equals(n, "application/dvbsubs") || Objects.equals(n, "application/ttml+xml");
    }
    
    @Override
    public t b(final q q) {
        final String n = q.n;
        if (n != null) {
            final int hashCode = n.hashCode();
            int n2 = -1;
            switch (hashCode) {
                case 1693976202: {
                    if (!n.equals("application/ttml+xml")) {
                        break;
                    }
                    n2 = 7;
                    break;
                }
                case 1668750253: {
                    if (!n.equals("application/x-subrip")) {
                        break;
                    }
                    n2 = 6;
                    break;
                }
                case 822864842: {
                    if (!n.equals("text/x-ssa")) {
                        break;
                    }
                    n2 = 5;
                    break;
                }
                case 691401887: {
                    if (!n.equals("application/x-quicktime-tx3g")) {
                        break;
                    }
                    n2 = 4;
                    break;
                }
                case -1004728940: {
                    if (!n.equals("text/vtt")) {
                        break;
                    }
                    n2 = 3;
                    break;
                }
                case -1026075066: {
                    if (!n.equals("application/x-mp4-vtt")) {
                        break;
                    }
                    n2 = 2;
                    break;
                }
                case -1248334819: {
                    if (!n.equals("application/pgs")) {
                        break;
                    }
                    n2 = 1;
                    break;
                }
                case -1351681404: {
                    if (!n.equals("application/dvbsubs")) {
                        break;
                    }
                    n2 = 0;
                    break;
                }
            }
            switch (n2) {
                case 7: {
                    return new d();
                }
                case 6: {
                    return new h1.a();
                }
                case 5: {
                    return new g1.b(q.q);
                }
                case 4: {
                    return new j1.a(q.q);
                }
                case 3: {
                    return new g();
                }
                case 2: {
                    return new k1.a();
                }
                case 1: {
                    return new f1.a();
                }
                case 0: {
                    return new e1.a(q.q);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported MIME type: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int c(final q q) {
        final String n = q.n;
        if (n != null) {
            final int hashCode = n.hashCode();
            int n2 = -1;
            switch (hashCode) {
                case 1693976202: {
                    if (!n.equals("application/ttml+xml")) {
                        break;
                    }
                    n2 = 7;
                    break;
                }
                case 1668750253: {
                    if (!n.equals("application/x-subrip")) {
                        break;
                    }
                    n2 = 6;
                    break;
                }
                case 822864842: {
                    if (!n.equals("text/x-ssa")) {
                        break;
                    }
                    n2 = 5;
                    break;
                }
                case 691401887: {
                    if (!n.equals("application/x-quicktime-tx3g")) {
                        break;
                    }
                    n2 = 4;
                    break;
                }
                case -1004728940: {
                    if (!n.equals("text/vtt")) {
                        break;
                    }
                    n2 = 3;
                    break;
                }
                case -1026075066: {
                    if (!n.equals("application/x-mp4-vtt")) {
                        break;
                    }
                    n2 = 2;
                    break;
                }
                case -1248334819: {
                    if (!n.equals("application/pgs")) {
                        break;
                    }
                    n2 = 1;
                    break;
                }
                case -1351681404: {
                    if (!n.equals("application/dvbsubs")) {
                        break;
                    }
                    n2 = 0;
                    break;
                }
            }
            switch (n2) {
                case 5:
                case 6:
                case 7: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 3: {
                    return 1;
                }
                case 0:
                case 1:
                case 2: {
                    return 2;
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported MIME type: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
