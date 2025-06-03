package o4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f11804a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11805b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11806c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f11807d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11808e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11809g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11810h;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARN: Type inference failed for: r1v4, types: [android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int a(android.media.MediaCodecInfo.VideoCapabilities r4, final int r5, final int r6, double r7) {
            /*
                java.util.List r4 = r4.getSupportedPerformancePoints()
                r0 = 0
                if (r4 == 0) goto L5f
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto L5f
                java.lang.String r1 = v5.e0.f15882b
                java.lang.String r2 = "sabrina"
                boolean r2 = r1.equals(r2)
                r3 = 1
                if (r2 != 0) goto L3d
                java.lang.String r2 = "boreal"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3d
                java.lang.String r1 = v5.e0.f15884d
                java.lang.String r2 = "Lenovo TB-X605"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X606"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X616"
                boolean r1 = r1.startsWith(r2)
                if (r1 == 0) goto L3b
                goto L3d
            L3b:
                r1 = r0
                goto L3e
            L3d:
                r1 = r3
            L3e:
                if (r1 == 0) goto L41
                goto L5f
            L41:
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
                int r7 = (int) r7
                r1.<init>(r5, r6, r7)
            L47:
                int r5 = r4.size()
                if (r0 >= r5) goto L5e
                java.lang.Object r5 = r4.get(r0)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = (android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint) r5
                boolean r5 = r5.covers(r1)
                if (r5 == 0) goto L5b
                r4 = 2
                return r4
            L5b:
                int r0 = r0 + 1
                goto L47
            L5e:
                return r3
            L5f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.l.a.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
        }
    }

    public l(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f11804a = str;
        this.f11805b = str2;
        this.f11806c = str3;
        this.f11807d = codecCapabilities;
        this.f11809g = z10;
        this.f11808e = z11;
        this.f = z12;
        this.f11810h = v5.p.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = e0.f15881a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i13, i14) : videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (v5.e0.f15881a < 21) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r11.isFeatureSupported("secure-playback") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o4.l h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            o4.l r13 = new o4.l
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = v5.e0.f15881a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = r14
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = v5.e0.f15884d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = r14
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r6 = r14
            goto L47
        L46:
            r6 = r0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = v5.e0.f15881a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = r14
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = v5.e0.f15881a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = r14
            goto L6d
        L6c:
            r15 = r0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = r0
            goto L73
        L72:
            r7 = r14
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.l.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):o4.l");
    }

    public final z3.i b(i0 i0Var, i0 i0Var2) {
        boolean z10 = false;
        int i10 = !e0.a(i0Var.t, i0Var2.t) ? 8 : 0;
        if (this.f11810h) {
            if (i0Var.B != i0Var2.B) {
                i10 |= 1024;
            }
            if (!this.f11808e && (i0Var.f15461y != i0Var2.f15461y || i0Var.f15462z != i0Var2.f15462z)) {
                i10 |= 512;
            }
            if (!e0.a(i0Var.F, i0Var2.F)) {
                i10 |= 2048;
            }
            String str = this.f11804a;
            if (e0.f15884d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
                z10 = true;
            }
            if (z10 && !i0Var.c(i0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z3.i(this.f11804a, i0Var, i0Var2, i0Var.c(i0Var2) ? 3 : 2, 0);
            }
        } else {
            if (i0Var.G != i0Var2.G) {
                i10 |= 4096;
            }
            if (i0Var.H != i0Var2.H) {
                i10 |= 8192;
            }
            if (i0Var.I != i0Var2.I) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f11805b)) {
                Pair<Integer, Integer> d10 = p.d(i0Var);
                Pair<Integer, Integer> d11 = p.d(i0Var2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new z3.i(this.f11804a, i0Var, i0Var2, 3, 0);
                    }
                }
            }
            if (!i0Var.c(i0Var2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f11805b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z3.i(this.f11804a, i0Var, i0Var2, 1, 0);
            }
        }
        return new z3.i(this.f11804a, i0Var, i0Var2, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(v3.i0 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.l.c(v3.i0, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(v3.i0 r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.l.d(v3.i0):boolean");
    }

    public final boolean e(i0 i0Var) {
        if (this.f11810h) {
            return this.f11808e;
        }
        Pair<Integer, Integer> d10 = p.d(i0Var);
        return d10 != null && ((Integer) d10.first).intValue() == 42;
    }

    public final boolean f(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String sb3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11807d;
        if (codecCapabilities == null) {
            sb3 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (e0.f15881a >= 29) {
                    int a10 = a.a(videoCapabilities, i10, i11, d10);
                    if (a10 == 2) {
                        return true;
                    }
                    if (a10 == 1) {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    }
                }
                if (!a(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11) {
                        if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f11804a) && "mcv5a".equals(e0.f15882b)) ? false : true) && a(videoCapabilities, i11, i10, d10)) {
                            StringBuilder m10 = defpackage.f.m("AssumedSupport [", "sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10, "] [");
                            m10.append(this.f11804a);
                            m10.append(", ");
                            m10.append(this.f11805b);
                            m10.append("] [");
                            m10.append(e0.f15885e);
                            m10.append("]");
                            v5.m.b("MediaCodecInfo", m10.toString());
                        }
                    }
                    sb2 = new StringBuilder();
                    str = "sizeAndRate.support, ";
                    sb2.append(str);
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i11);
                    sb2.append("@");
                    sb2.append(d10);
                    sb3 = sb2.toString();
                }
                return true;
            }
            sb3 = "sizeAndRate.vCaps";
        }
        g(sb3);
        return false;
    }

    public final void g(String str) {
        StringBuilder m10 = defpackage.f.m("NoSupport [", str, "] [");
        m10.append(this.f11804a);
        m10.append(", ");
        m10.append(this.f11805b);
        m10.append("] [");
        m10.append(e0.f15885e);
        m10.append("]");
        v5.m.b("MediaCodecInfo", m10.toString());
    }

    public final String toString() {
        return this.f11804a;
    }
}
