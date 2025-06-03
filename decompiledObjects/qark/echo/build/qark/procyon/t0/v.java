// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import java.util.List;
import g0.M;
import android.media.MediaCodecInfo$VideoCapabilities;

public abstract class v
{
    public static Boolean a;
    
    public static /* synthetic */ Boolean a() {
        return v.a;
    }
    
    public static /* synthetic */ Boolean b(final Boolean a) {
        return v.a = a;
    }
    
    public static int c(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, final int n, final int n2, final double n3) {
        if (M.a >= 29) {
            final Boolean a = v.a;
            if (a == null || !a) {
                return v.a.a(mediaCodecInfo$VideoCapabilities, n, n2, n3);
            }
        }
        return 0;
    }
    
    public abstract static final class a
    {
        public static int a(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int b, final int n, final double n2) {
            final List a = s.a(mediaCodecInfo$VideoCapabilities);
            if (a == null) {
                return 0;
            }
            if (a.isEmpty()) {
                return 0;
            }
            r.a();
            b = b(a, q.a(b, n, (int)n2));
            if (b == 1 && v.a() == null) {
                v.b(c());
                if (v.a()) {
                    return 0;
                }
            }
            return b;
        }
        
        public static int b(final List list, final MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint) {
            for (int i = 0; i < list.size(); ++i) {
                if (u.a(t.a(list.get(i)), mediaCodecInfo$VideoCapabilities$PerformancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
        
        public static boolean c() {
            final int a = M.a;
            boolean b = false;
            if (a >= 35) {
                return false;
            }
            try {
                final d0.q k = new d0.q.b().o0("video/avc").K();
                if (k.n != null) {
                    final List v = I.v(z.a, k, false, false);
                    for (int i = 0; i < v.size(); ++i) {
                        if (v.get(i).d != null && v.get(i).d.getVideoCapabilities() != null) {
                            final List a2 = s.a(v.get(i).d.getVideoCapabilities());
                            if (a2 != null && !a2.isEmpty()) {
                                r.a();
                                if (b(a2, q.a(1280, 720, 60)) == 1) {
                                    b = true;
                                }
                                return b;
                            }
                        }
                    }
                }
                return true;
            }
            catch (I.c c) {
                return true;
            }
        }
    }
}
