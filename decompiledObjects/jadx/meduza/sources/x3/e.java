package x3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Arrays;
import o7.m0;
import o7.t;
import o7.u;
import o7.x0;
import v5.e0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f16961c = new e(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final e f16962d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f16963e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16965b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f16966a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            t.b bVar = o7.t.f12050b;
            t.a aVar = new t.a();
            m0 m0Var = e.f16963e;
            o7.x xVar = m0Var.f12058b;
            if (xVar == null) {
                xVar = m0Var.d();
                m0Var.f12058b = xVar;
            }
            x0 it = xVar.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f16966a);
                if (isDirectPlaybackSupported) {
                    aVar.c(Integer.valueOf(intValue));
                }
            }
            aVar.c(2);
            return r7.a.F(aVar.e());
        }

        public static int b(int i10, int i11) {
            boolean isDirectPlaybackSupported;
            for (int i12 = 8; i12 > 0; i12--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(e0.o(i12)).build(), f16966a);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
            return 0;
        }
    }

    static {
        u.a aVar = new u.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        f16963e = aVar.a();
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f16964a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f16964a = new int[0];
        }
        this.f16965b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (r9 != 5) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> a(v3.i0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.t
            r0.getClass()
            java.lang.String r1 = r12.f15454q
            int r0 = v5.p.d(r0, r1)
            o7.m0 r1 = x3.e.f16963e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            r7 = 1
            r8 = 0
            if (r0 != r6) goto L32
            int[] r9 = r11.f16964a
            int r9 = java.util.Arrays.binarySearch(r9, r6)
            if (r9 < 0) goto L2d
            r9 = r7
            goto L2e
        L2d:
            r9 = r8
        L2e:
            if (r9 != 0) goto L32
            r0 = r4
            goto L42
        L32:
            if (r0 != r5) goto L42
            int[] r9 = r11.f16964a
            int r9 = java.util.Arrays.binarySearch(r9, r5)
            if (r9 < 0) goto L3e
            r9 = r7
            goto L3f
        L3e:
            r9 = r8
        L3f:
            if (r9 != 0) goto L42
            r0 = r2
        L42:
            int[] r9 = r11.f16964a
            int r9 = java.util.Arrays.binarySearch(r9, r0)
            if (r9 < 0) goto L4c
            r9 = r7
            goto L4d
        L4c:
            r9 = r8
        L4d:
            if (r9 != 0) goto L50
            return r3
        L50:
            int r9 = r12.G
            r10 = -1
            if (r9 == r10) goto L5d
            if (r0 != r6) goto L58
            goto L5d
        L58:
            int r12 = r11.f16965b
            if (r9 <= r12) goto L86
            return r3
        L5d:
            int r12 = r12.H
            if (r12 == r10) goto L62
            goto L65
        L62:
            r12 = 48000(0xbb80, float:6.7262E-41)
        L65:
            int r6 = v5.e0.f15881a
            r9 = 29
            if (r6 < r9) goto L70
            int r12 = x3.e.a.b(r0, r12)
            goto L85
        L70:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r1.getOrDefault(r12, r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r12 = r12.intValue()
        L85:
            r9 = r12
        L86:
            int r12 = v5.e0.f15881a
            r1 = 28
            if (r12 > r1) goto L9a
            if (r9 != r2) goto L90
            r4 = r5
            goto L9b
        L90:
            r1 = 3
            if (r9 == r1) goto L9b
            r1 = 4
            if (r9 == r1) goto L9b
            r1 = 5
            if (r9 != r1) goto L9a
            goto L9b
        L9a:
            r4 = r9
        L9b:
            r1 = 26
            if (r12 > r1) goto Lac
            java.lang.String r12 = v5.e0.f15882b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto Lac
            if (r4 != r7) goto Lac
            r4 = 2
        Lac:
            int r12 = v5.e0.o(r4)
            if (r12 != 0) goto Lb3
            return r3
        Lb3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r0, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.a(v3.i0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f16964a, eVar.f16964a) && this.f16965b == eVar.f16965b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f16964a) * 31) + this.f16965b;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AudioCapabilities[maxChannelCount=");
        l10.append(this.f16965b);
        l10.append(", supportedEncodings=");
        l10.append(Arrays.toString(this.f16964a));
        l10.append("]");
        return l10.toString();
    }
}
