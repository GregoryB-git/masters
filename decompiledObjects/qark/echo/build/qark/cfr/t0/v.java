/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package t0;

import android.media.MediaCodecInfo;
import d0.q;
import g0.M;
import java.util.List;
import t0.I;
import t0.p;
import t0.q;
import t0.r;
import t0.s;
import t0.t;
import t0.u;
import t0.z;

public abstract class v {
    public static Boolean a;

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9, double d8) {
        Boolean bl;
        if (!(M.a < 29 || (bl = a) != null && bl.booleanValue())) {
            return a.a(videoCapabilities, n8, n9, d8);
        }
        return 0;
    }

    public static final abstract class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9, double d8) {
            if ((videoCapabilities = s.a(videoCapabilities)) != null) {
                if (videoCapabilities.isEmpty()) {
                    return 0;
                }
                r.a();
                n8 = a.b((List)videoCapabilities, q.a(n8, n9, (int)d8));
                if (n8 == 1 && a == null) {
                    a = a.c();
                    if (a.booleanValue()) {
                        return 0;
                    }
                }
                return n8;
            }
            return 0;
        }

        public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                if (!u.a(t.a(list.get(i8)), performancePoint)) continue;
                return 2;
            }
            return 1;
        }

        public static boolean c() {
            block7 : {
                d0.q q8;
                int n8 = M.a;
                boolean bl = false;
                if (n8 >= 35) {
                    return false;
                }
                try {
                    q8 = new q.b().o0("video/avc").K();
                    if (q8.n == null) break block7;
                    q8 = I.v(z.a, q8, false, false);
                    n8 = 0;
                }
                catch (I.c c8) {
                    return true;
                }
                do {
                    block8 : {
                        List list;
                        if (n8 >= q8.size()) break;
                        if (((p)q8.get((int)n8)).d == null || ((p)q8.get((int)n8)).d.getVideoCapabilities() == null || (list = s.a(((p)q8.get((int)n8)).d.getVideoCapabilities())) == null) break block8;
                        if (list.isEmpty()) break block8;
                        r.a();
                        n8 = a.b(list, q.a(1280, 720, 60));
                        if (n8 == 1) {
                            bl = true;
                        }
                        return bl;
                    }
                    ++n8;
                } while (true);
            }
            return true;
        }
    }

}

