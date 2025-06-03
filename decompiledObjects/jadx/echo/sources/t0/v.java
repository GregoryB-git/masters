package t0;

import android.media.MediaCodecInfo;
import g0.M;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f19493a;

    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
            List supportedPerformancePoints;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            r.a();
            int b7 = b(supportedPerformancePoints, q.a(i7, i8, (int) d7));
            if (b7 == 1 && v.f19493a == null) {
                Boolean unused = v.f19493a = Boolean.valueOf(c());
                if (v.f19493a.booleanValue()) {
                    return 0;
                }
            }
            return b7;
        }

        public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            boolean covers;
            for (int i7 = 0; i7 < list.size(); i7++) {
                covers = t.a(list.get(i7)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            r4 = ((t0.p) r1.get(r3)).f19485d.getVideoCapabilities().getSupportedPerformancePoints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean c() {
            /*
                int r0 = g0.M.f14261a
                r1 = 35
                r2 = 0
                if (r0 < r1) goto L8
                return r2
            L8:
                r0 = 1
                d0.q$b r1 = new d0.q$b     // Catch: t0.AbstractC1968I.c -> L71
                r1.<init>()     // Catch: t0.AbstractC1968I.c -> L71
                java.lang.String r3 = "video/avc"
                d0.q$b r1 = r1.o0(r3)     // Catch: t0.AbstractC1968I.c -> L71
                d0.q r1 = r1.K()     // Catch: t0.AbstractC1968I.c -> L71
                java.lang.String r3 = r1.f12726n     // Catch: t0.AbstractC1968I.c -> L71
                if (r3 == 0) goto L71
                t0.z r3 = t0.z.f19573a     // Catch: t0.AbstractC1968I.c -> L71
                java.util.List r1 = t0.AbstractC1968I.v(r3, r1, r2, r2)     // Catch: t0.AbstractC1968I.c -> L71
                r3 = r2
            L23:
                int r4 = r1.size()     // Catch: t0.AbstractC1968I.c -> L71
                if (r3 >= r4) goto L71
                java.lang.Object r4 = r1.get(r3)     // Catch: t0.AbstractC1968I.c -> L71
                t0.p r4 = (t0.p) r4     // Catch: t0.AbstractC1968I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f19485d     // Catch: t0.AbstractC1968I.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: t0.AbstractC1968I.c -> L71
                t0.p r4 = (t0.p) r4     // Catch: t0.AbstractC1968I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f19485d     // Catch: t0.AbstractC1968I.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: t0.AbstractC1968I.c -> L71
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.get(r3)     // Catch: t0.AbstractC1968I.c -> L71
                t0.p r4 = (t0.p) r4     // Catch: t0.AbstractC1968I.c -> L71
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.f19485d     // Catch: t0.AbstractC1968I.c -> L71
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: t0.AbstractC1968I.c -> L71
                java.util.List r4 = t0.s.a(r4)     // Catch: t0.AbstractC1968I.c -> L71
                if (r4 == 0) goto L6e
                boolean r5 = r4.isEmpty()     // Catch: t0.AbstractC1968I.c -> L71
                if (r5 != 0) goto L6e
                t0.r.a()     // Catch: t0.AbstractC1968I.c -> L71
                r1 = 720(0x2d0, float:1.009E-42)
                r3 = 60
                r5 = 1280(0x500, float:1.794E-42)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = t0.q.a(r5, r1, r3)     // Catch: t0.AbstractC1968I.c -> L71
                int r1 = b(r4, r1)     // Catch: t0.AbstractC1968I.c -> L71
                if (r1 != r0) goto L6d
                r2 = r0
            L6d:
                return r2
            L6e:
                int r3 = r3 + 1
                goto L23
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.v.a.c():boolean");
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        if (M.f14261a < 29) {
            return 0;
        }
        Boolean bool = f19493a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i7, i8, d7);
        }
        return 0;
    }
}
