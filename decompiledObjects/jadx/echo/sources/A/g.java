package A;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f8a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f9b;

        public b(char c7, float[] fArr) {
            this.f8a = c7;
            this.f9b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void a(Path path, float[] fArr, char c7, char c8, float[] fArr2) {
            int i7;
            int i8;
            int i9;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            char c9 = c8;
            boolean z7 = false;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c9) {
                case 'A':
                case ModuleDescriptor.MODULE_VERSION /* 97 */:
                    i7 = 7;
                    i8 = i7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    i8 = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i8 = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i10 = 0;
            char c10 = c7;
            while (i10 < fArr2.length) {
                if (c9 != 'A') {
                    if (c9 == 'C') {
                        i9 = i10;
                        int i11 = i9 + 2;
                        int i12 = i9 + 3;
                        int i13 = i9 + 4;
                        int i14 = i9 + 5;
                        path.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f21 = fArr2[i13];
                        float f25 = fArr2[i14];
                        float f26 = fArr2[i11];
                        float f27 = fArr2[i12];
                        f22 = f25;
                        f18 = f27;
                        f17 = f26;
                    } else if (c9 == 'H') {
                        i9 = i10;
                        path.lineTo(fArr2[i9], f22);
                        f21 = fArr2[i9];
                    } else if (c9 == 'Q') {
                        i9 = i10;
                        int i15 = i9 + 1;
                        int i16 = i9 + 2;
                        int i17 = i9 + 3;
                        path.quadTo(fArr2[i9], fArr2[i15], fArr2[i16], fArr2[i17]);
                        float f28 = fArr2[i9];
                        float f29 = fArr2[i15];
                        f21 = fArr2[i16];
                        f22 = fArr2[i17];
                        f17 = f28;
                        f18 = f29;
                    } else if (c9 == 'V') {
                        i9 = i10;
                        path.lineTo(f21, fArr2[i9]);
                        f22 = fArr2[i9];
                    } else if (c9 != 'a') {
                        if (c9 != 'c') {
                            if (c9 == 'h') {
                                path.rLineTo(fArr2[i10], 0.0f);
                                f21 += fArr2[i10];
                            } else if (c9 != 'q') {
                                if (c9 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i10]);
                                    f10 = fArr2[i10];
                                } else if (c9 == 'L') {
                                    int i18 = i10 + 1;
                                    path.lineTo(fArr2[i10], fArr2[i18]);
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i18];
                                } else if (c9 == 'M') {
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i10 + 1];
                                    if (i10 > 0) {
                                        path.lineTo(f21, f22);
                                    } else {
                                        path.moveTo(f21, f22);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c9 == 'S') {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    float f30 = f22;
                                    float f31 = f21;
                                    int i19 = i10 + 1;
                                    int i20 = i10 + 2;
                                    int i21 = i10 + 3;
                                    path.cubicTo(f31, f30, fArr2[i10], fArr2[i19], fArr2[i20], fArr2[i21]);
                                    f7 = fArr2[i10];
                                    f8 = fArr2[i19];
                                    f21 = fArr2[i20];
                                    f22 = fArr2[i21];
                                    f17 = f7;
                                    f18 = f8;
                                } else if (c9 == 'T') {
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    int i22 = i10 + 1;
                                    path.quadTo(f21, f22, fArr2[i10], fArr2[i22]);
                                    i9 = i10;
                                    f18 = f22;
                                    f17 = f21;
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i22];
                                } else if (c9 == 'l') {
                                    int i23 = i10 + 1;
                                    path.rLineTo(fArr2[i10], fArr2[i23]);
                                    f21 += fArr2[i10];
                                    f10 = fArr2[i23];
                                } else if (c9 == 'm') {
                                    float f32 = fArr2[i10];
                                    f21 += f32;
                                    float f33 = fArr2[i10 + 1];
                                    f22 += f33;
                                    if (i10 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c9 == 's') {
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        float f34 = f21 - f17;
                                        f11 = f22 - f18;
                                        f12 = f34;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i24 = i10 + 1;
                                    int i25 = i10 + 2;
                                    int i26 = i10 + 3;
                                    path.rCubicTo(f12, f11, fArr2[i10], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f7 = fArr2[i10] + f21;
                                    f8 = fArr2[i24] + f22;
                                    f21 += fArr2[i25];
                                    f9 = fArr2[i26];
                                } else if (c9 == 't') {
                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                        f13 = f21 - f17;
                                        f14 = f22 - f18;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i27 = i10 + 1;
                                    path.rQuadTo(f13, f14, fArr2[i10], fArr2[i27]);
                                    float f35 = f13 + f21;
                                    float f36 = f14 + f22;
                                    f21 += fArr2[i10];
                                    f22 += fArr2[i27];
                                    f18 = f36;
                                    f17 = f35;
                                }
                                f22 += f10;
                            } else {
                                int i28 = i10 + 1;
                                int i29 = i10 + 2;
                                int i30 = i10 + 3;
                                path.rQuadTo(fArr2[i10], fArr2[i28], fArr2[i29], fArr2[i30]);
                                f7 = fArr2[i10] + f21;
                                f8 = fArr2[i28] + f22;
                                f21 += fArr2[i29];
                                f9 = fArr2[i30];
                            }
                            i9 = i10;
                        } else {
                            int i31 = i10 + 2;
                            int i32 = i10 + 3;
                            int i33 = i10 + 4;
                            int i34 = i10 + 5;
                            path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f7 = fArr2[i31] + f21;
                            f8 = fArr2[i32] + f22;
                            f21 += fArr2[i33];
                            f9 = fArr2[i34];
                        }
                        f22 += f9;
                        f17 = f7;
                        f18 = f8;
                        i9 = i10;
                    } else {
                        int i35 = i10 + 5;
                        int i36 = i10 + 6;
                        i9 = i10;
                        c(path, f21, f22, fArr2[i35] + f21, fArr2[i36] + f22, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f21 += fArr2[i35];
                        f22 += fArr2[i36];
                    }
                    i10 = i9 + i8;
                    c10 = c8;
                    c9 = c10;
                    z7 = false;
                } else {
                    i9 = i10;
                    int i37 = i9 + 5;
                    int i38 = i9 + 6;
                    c(path, f21, f22, fArr2[i37], fArr2[i38], fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                    f21 = fArr2[i37];
                    f22 = fArr2[i38];
                }
                f18 = f22;
                f17 = f21;
                i10 = i9 + i8;
                c10 = c8;
                c9 = c10;
                z7 = false;
            }
            fArr[z7 ? 1 : 0] = f21;
            fArr[1] = f22;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }

        public static void b(Path path, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d9;
            int ceil = (int) Math.ceil(Math.abs((d15 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d13);
            double sin = Math.sin(d13);
            double cos2 = Math.cos(d14);
            double sin2 = Math.sin(d14);
            double d17 = -d16;
            double d18 = d17 * cos;
            double d19 = d10 * sin;
            double d20 = (d18 * sin2) - (d19 * cos2);
            double d21 = d17 * sin;
            double d22 = d10 * cos;
            double d23 = (sin2 * d21) + (cos2 * d22);
            double d24 = d15 / ceil;
            double d25 = d23;
            double d26 = d20;
            int i7 = 0;
            double d27 = d11;
            double d28 = d12;
            double d29 = d14;
            while (i7 < ceil) {
                double d30 = d29 + d24;
                double sin3 = Math.sin(d30);
                double cos3 = Math.cos(d30);
                double d31 = (d7 + ((d16 * cos) * cos3)) - (d19 * sin3);
                double d32 = d8 + (d16 * sin * cos3) + (d22 * sin3);
                double d33 = (d18 * sin3) - (d19 * cos3);
                double d34 = (sin3 * d21) + (cos3 * d22);
                double d35 = d30 - d29;
                double tan = Math.tan(d35 / 2.0d);
                double sin4 = (Math.sin(d35) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d36 = d27 + (d26 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d36, (float) (d28 + (d25 * sin4)), (float) (d31 - (sin4 * d33)), (float) (d32 - (sin4 * d34)), (float) d31, (float) d32);
                i7++;
                d24 = d24;
                sin = sin;
                d27 = d31;
                d21 = d21;
                cos = cos;
                d29 = d30;
                d25 = d34;
                d26 = d33;
                ceil = ceil;
                d28 = d32;
                d16 = d9;
            }
        }

        public static void c(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z7, boolean z8) {
            double d7;
            double d8;
            double radians = Math.toRadians(f13);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d9 = f7;
            double d10 = d9 * cos;
            double d11 = f8;
            double d12 = f11;
            double d13 = (d10 + (d11 * sin)) / d12;
            double d14 = ((-f7) * sin) + (d11 * cos);
            double d15 = f12;
            double d16 = d14 / d15;
            double d17 = f10;
            double d18 = ((f9 * cos) + (d17 * sin)) / d12;
            double d19 = (((-f9) * sin) + (d17 * cos)) / d15;
            double d20 = d13 - d18;
            double d21 = d16 - d19;
            double d22 = (d13 + d18) / 2.0d;
            double d23 = (d16 + d19) / 2.0d;
            double d24 = (d20 * d20) + (d21 * d21);
            if (d24 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d24);
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                c(path, f7, f8, f9, f10, f11 * sqrt, f12 * sqrt, f13, z7, z8);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d20 * sqrt2;
            double d27 = sqrt2 * d21;
            if (z7 == z8) {
                d7 = d22 - d27;
                d8 = d23 + d26;
            } else {
                d7 = d22 + d27;
                d8 = d23 - d26;
            }
            double atan2 = Math.atan2(d16 - d8, d13 - d7);
            double atan22 = Math.atan2(d19 - d8, d18 - d7) - atan2;
            if (z8 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d28 = d7 * d12;
            double d29 = d8 * d15;
            b(path, (d28 * cos) - (d29 * sin), (d28 * sin) + (d29 * cos), d12, d15, d9, d11, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c7 = 'm';
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                b bVar = bVarArr[i7];
                a(path, fArr, c7, bVar.f8a, bVar.f9b);
                c7 = bVarArr[i7].f8a;
            }
        }

        public void d(b bVar, b bVar2, float f7) {
            this.f8a = bVar.f8a;
            int i7 = 0;
            while (true) {
                float[] fArr = bVar.f9b;
                if (i7 >= fArr.length) {
                    return;
                }
                this.f9b[i7] = (fArr[i7] * (1.0f - f7)) + (bVar2.f9b[i7] * f7);
                i7++;
            }
        }

        public b(b bVar) {
            this.f8a = bVar.f8a;
            float[] fArr = bVar.f9b;
            this.f9b = g.c(fArr, 0, fArr.length);
        }
    }

    public static void a(ArrayList arrayList, char c7, float[] fArr) {
        arrayList.add(new b(c7, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            b bVar = bVarArr[i7];
            char c7 = bVar.f8a;
            b bVar2 = bVarArr2[i7];
            if (c7 != bVar2.f8a || bVar.f9b.length != bVar2.f9b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i7 < 0 || i7 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = i8 - i7;
        int min = Math.min(i9, length - i7);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, i7, fArr2, 0, min);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i8 = 0;
        while (i7 < str.length()) {
            int i9 = i(str, i7);
            String trim = str.substring(i8, i9).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i8 = i9;
            i7 = i9 + 1;
        }
        if (i7 - i8 == 1 && i8 < str.length()) {
            a(arrayList, str.charAt(i8), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d7 = d(str);
        if (d7 == null) {
            return null;
        }
        try {
            b.e(d7, path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing " + str, e7);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = new b(bVarArr[i7]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[LOOP:0: B:2:0x0007->B:14:0x0037, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.String r8, int r9, A.g.a r10) {
        /*
            r0 = 0
            r10.f7b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3a
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L34
        L27:
            r10.f7b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L34
        L2c:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            goto L27
        L31:
            r2 = r0
            goto L34
        L33:
            r2 = r7
        L34:
            if (r4 == 0) goto L37
            goto L3a
        L37:
            int r1 = r1 + 1
            goto L7
        L3a:
            r10.f6a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.g(java.lang.String, int, A.g$a):void");
    }

    public static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i7 = 1;
            int i8 = 0;
            while (i7 < length) {
                g(str, i7, aVar);
                int i9 = aVar.f6a;
                if (i7 < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i7, i9));
                    i8++;
                }
                i7 = aVar.f7b ? i9 : i9 + 1;
            }
            return c(fArr, 0, i8);
        } catch (NumberFormatException e7) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e7);
        }
    }

    public static int i(String str, int i7) {
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i7;
            }
            i7++;
        }
        return i7;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i7 = 0; i7 < bVarArr2.length; i7++) {
            bVarArr[i7].f8a = bVarArr2[i7].f8a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVarArr2[i7].f9b;
                if (i8 < fArr.length) {
                    bVarArr[i7].f9b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }
}
