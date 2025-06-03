package x;

import android.graphics.Path;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public char f16496a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f16497b;

        public a(char c10, float[] fArr) {
            this.f16496a = c10;
            this.f16497b = fArr;
        }

        public a(a aVar) {
            this.f16496a = aVar.f16496a;
            float[] fArr = aVar.f16497b;
            this.f16497b = d.b(fArr, fArr.length);
        }

        public static void a(Path path, float f, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f15);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f;
            double d13 = f10;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = f13;
            double d17 = d14 / d16;
            double d18 = f14;
            double d19 = ((d13 * cos) + ((-f) * sin)) / d18;
            double d20 = d13;
            double d21 = f12;
            double d22 = ((d21 * sin) + (f11 * cos)) / d16;
            double d23 = ((d21 * cos) + ((-f11) * sin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f, f10, f11, f12, f13 * sqrt, f14 * sqrt, f15, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d24 * sqrt2;
            double d31 = sqrt2 * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double atan2 = Math.atan2(d19 - d11, d17 - d10);
            double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
            if (z11 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d16;
            double d37 = d36 * cos2;
            double d38 = d18 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d40 = d36 * sin2;
            double d41 = d18 * cos2;
            double d42 = (cos3 * d41) + (sin3 * d40);
            double d43 = d41;
            double d44 = atan22 / ceil;
            int i10 = 0;
            while (i10 < ceil) {
                double d45 = atan2 + d44;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
                double d51 = (d37 * sin4) - (d38 * cos4);
                double d52 = (cos4 * d48) + (sin4 * d40);
                double d53 = d45 - atan2;
                double tan = Math.tan(d53 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
                i10++;
                atan2 = d45;
                d40 = d40;
                cos2 = cos2;
                ceil = ceil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        @Deprecated
        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            float[] fArr;
            char c10;
            a aVar;
            int i12;
            int i13;
            float f;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            a[] aVarArr2 = aVarArr;
            float[] fArr2 = new float[6];
            int length = aVarArr2.length;
            int i14 = 0;
            char c11 = 'm';
            while (i14 < length) {
                a aVar2 = aVarArr2[i14];
                char c12 = aVar2.f16496a;
                float[] fArr3 = aVar2.f16497b;
                float f29 = fArr2[0];
                float f30 = fArr2[1];
                float f31 = fArr2[2];
                float f32 = fArr2[3];
                float f33 = fArr2[4];
                float f34 = fArr2[5];
                switch (c12) {
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        i10 = 7;
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        i10 = 6;
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        i10 = 1;
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        i10 = 4;
                        break;
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        path.close();
                        path.moveTo(f33, f34);
                        f29 = f33;
                        f31 = f29;
                        f30 = f34;
                        f32 = f30;
                    default:
                        i10 = 2;
                        break;
                }
                float f35 = f33;
                float f36 = f34;
                float f37 = f29;
                float f38 = f30;
                int i15 = 0;
                while (i15 < fArr3.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                i11 = i15;
                                fArr = fArr3;
                                c10 = c12;
                                aVar = aVar2;
                                i12 = i14;
                                i13 = length;
                                int i16 = i11 + 0;
                                path.lineTo(fArr[i16], f38);
                                f37 = fArr[i16];
                            } else if (c12 == 'Q') {
                                i11 = i15;
                                fArr = fArr3;
                                c10 = c12;
                                aVar = aVar2;
                                i12 = i14;
                                i13 = length;
                                int i17 = i11 + 0;
                                int i18 = i11 + 1;
                                int i19 = i11 + 2;
                                int i20 = i11 + 3;
                                path.quadTo(fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                                f = fArr[i17];
                                f10 = fArr[i18];
                                f37 = fArr[i19];
                                f38 = fArr[i20];
                            } else if (c12 == 'V') {
                                i11 = i15;
                                fArr = fArr3;
                                c10 = c12;
                                aVar = aVar2;
                                i12 = i14;
                                i13 = length;
                                int i21 = i11 + 0;
                                path.lineTo(f37, fArr[i21]);
                                f38 = fArr[i21];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 == 'h') {
                                        i11 = i15;
                                        fArr = fArr3;
                                        i13 = length;
                                        int i22 = i11 + 0;
                                        path.rLineTo(fArr[i22], 0.0f);
                                        f37 += fArr[i22];
                                    } else if (c12 != 'q') {
                                        if (c12 != 'v') {
                                            if (c12 != 'L') {
                                                if (c12 == 'M') {
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                    f20 = fArr[i11 + 0];
                                                    f21 = fArr[i11 + 1];
                                                    if (i11 > 0) {
                                                        path.lineTo(f20, f21);
                                                    } else {
                                                        path.moveTo(f20, f21);
                                                        f37 = f20;
                                                        f38 = f21;
                                                    }
                                                } else if (c12 == 'S') {
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                    float f39 = f38;
                                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                        f22 = (f39 * 2.0f) - f32;
                                                        f23 = (f37 * 2.0f) - f31;
                                                    } else {
                                                        f23 = f37;
                                                        f22 = f39;
                                                    }
                                                    int i23 = i11 + 0;
                                                    int i24 = i11 + 1;
                                                    int i25 = i11 + 2;
                                                    int i26 = i11 + 3;
                                                    path.cubicTo(f23, f22, fArr[i23], fArr[i24], fArr[i25], fArr[i26]);
                                                    float f40 = fArr[i23];
                                                    float f41 = fArr[i24];
                                                    f17 = fArr[i25];
                                                    f16 = fArr[i26];
                                                    f31 = f40;
                                                    f32 = f41;
                                                    f37 = f17;
                                                    f38 = f16;
                                                } else if (c12 == 'T') {
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                    float f42 = f38;
                                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                        f37 = (f37 * 2.0f) - f31;
                                                        f24 = (f42 * 2.0f) - f32;
                                                    } else {
                                                        f24 = f42;
                                                    }
                                                    int i27 = i11 + 0;
                                                    int i28 = i11 + 1;
                                                    path.quadTo(f37, f24, fArr[i27], fArr[i28]);
                                                    f32 = f24;
                                                    c10 = c12;
                                                    aVar = aVar2;
                                                    i12 = i14;
                                                    f31 = f37;
                                                    f37 = fArr[i27];
                                                    f38 = fArr[i28];
                                                } else if (c12 == 'l') {
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                    f18 = f38;
                                                    int i29 = i11 + 0;
                                                    int i30 = i11 + 1;
                                                    path.rLineTo(fArr[i29], fArr[i30]);
                                                    f37 += fArr[i29];
                                                    f19 = fArr[i30];
                                                } else if (c12 == 'm') {
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                    float f43 = fArr[i11 + 0];
                                                    f37 += f43;
                                                    float f44 = fArr[i11 + 1];
                                                    f38 += f44;
                                                    if (i11 > 0) {
                                                        path.rLineTo(f43, f44);
                                                    } else {
                                                        path.rMoveTo(f43, f44);
                                                    }
                                                } else if (c12 != 's') {
                                                    if (c12 == 't') {
                                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                            f27 = f37 - f31;
                                                            f28 = f38 - f32;
                                                        } else {
                                                            f28 = 0.0f;
                                                            f27 = 0.0f;
                                                        }
                                                        int i31 = i15 + 0;
                                                        int i32 = i15 + 1;
                                                        path.rQuadTo(f27, f28, fArr3[i31], fArr3[i32]);
                                                        float f45 = f27 + f37;
                                                        float f46 = f28 + f38;
                                                        f37 += fArr3[i31];
                                                        f38 += fArr3[i32];
                                                        f32 = f46;
                                                        f31 = f45;
                                                    }
                                                    i11 = i15;
                                                    fArr = fArr3;
                                                    i13 = length;
                                                } else {
                                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                        f25 = f37 - f31;
                                                        f26 = f38 - f32;
                                                    } else {
                                                        f25 = 0.0f;
                                                        f26 = 0.0f;
                                                    }
                                                    int i33 = i15 + 0;
                                                    int i34 = i15 + 1;
                                                    int i35 = i15 + 2;
                                                    int i36 = i15 + 3;
                                                    i11 = i15;
                                                    i13 = length;
                                                    f11 = f38;
                                                    fArr = fArr3;
                                                    path.rCubicTo(f25, f26, fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                                    f12 = fArr[i33] + f37;
                                                    f13 = fArr[i34] + f11;
                                                    f14 = f37 + fArr[i35];
                                                    f15 = fArr[i36];
                                                }
                                                f36 = f38;
                                                c10 = c12;
                                                aVar = aVar2;
                                                i12 = i14;
                                                f35 = f37;
                                            } else {
                                                i11 = i15;
                                                fArr = fArr3;
                                                i13 = length;
                                                int i37 = i11 + 0;
                                                int i38 = i11 + 1;
                                                path.lineTo(fArr[i37], fArr[i38]);
                                                f20 = fArr[i37];
                                                f21 = fArr[i38];
                                            }
                                            f37 = f20;
                                            f38 = f21;
                                        } else {
                                            i11 = i15;
                                            fArr = fArr3;
                                            i13 = length;
                                            f18 = f38;
                                            int i39 = i11 + 0;
                                            path.rLineTo(0.0f, fArr[i39]);
                                            f19 = fArr[i39];
                                        }
                                        f38 = f18 + f19;
                                    } else {
                                        i11 = i15;
                                        fArr = fArr3;
                                        i13 = length;
                                        f11 = f38;
                                        int i40 = i11 + 0;
                                        int i41 = i11 + 1;
                                        int i42 = i11 + 2;
                                        int i43 = i11 + 3;
                                        path.rQuadTo(fArr[i40], fArr[i41], fArr[i42], fArr[i43]);
                                        f12 = fArr[i40] + f37;
                                        f13 = fArr[i41] + f11;
                                        f14 = f37 + fArr[i42];
                                        f15 = fArr[i43];
                                    }
                                    c10 = c12;
                                    aVar = aVar2;
                                    i12 = i14;
                                } else {
                                    i11 = i15;
                                    fArr = fArr3;
                                    i13 = length;
                                    f11 = f38;
                                    int i44 = i11 + 2;
                                    int i45 = i11 + 3;
                                    int i46 = i11 + 4;
                                    int i47 = i11 + 5;
                                    path.rCubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i44], fArr[i45], fArr[i46], fArr[i47]);
                                    f12 = fArr[i44] + f37;
                                    f13 = fArr[i45] + f11;
                                    f14 = f37 + fArr[i46];
                                    f15 = fArr[i47];
                                }
                                f16 = f11 + f15;
                                f31 = f12;
                                f32 = f13;
                                f17 = f14;
                                f37 = f17;
                                f38 = f16;
                                c10 = c12;
                                aVar = aVar2;
                                i12 = i14;
                            } else {
                                i11 = i15;
                                fArr = fArr3;
                                i13 = length;
                                float f47 = f38;
                                int i48 = i11 + 5;
                                int i49 = i11 + 6;
                                c10 = c12;
                                aVar = aVar2;
                                i12 = i14;
                                a(path, f37, f47, fArr[i48] + f37, fArr[i49] + f47, fArr[i11 + 0], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                                f37 += fArr[i48];
                                f38 = f47 + fArr[i49];
                            }
                            i15 = i11 + i10;
                            i14 = i12;
                            fArr3 = fArr;
                            c11 = c10;
                            c12 = c11;
                            length = i13;
                            aVar2 = aVar;
                        } else {
                            i11 = i15;
                            fArr = fArr3;
                            c10 = c12;
                            aVar = aVar2;
                            i12 = i14;
                            i13 = length;
                            int i50 = i11 + 2;
                            int i51 = i11 + 3;
                            int i52 = i11 + 4;
                            int i53 = i11 + 5;
                            path.cubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i50], fArr[i51], fArr[i52], fArr[i53]);
                            float f48 = fArr[i52];
                            float f49 = fArr[i53];
                            f = fArr[i50];
                            f37 = f48;
                            f38 = f49;
                            f10 = fArr[i51];
                        }
                        f31 = f;
                        f32 = f10;
                        i15 = i11 + i10;
                        i14 = i12;
                        fArr3 = fArr;
                        c11 = c10;
                        c12 = c11;
                        length = i13;
                        aVar2 = aVar;
                    } else {
                        i11 = i15;
                        fArr = fArr3;
                        c10 = c12;
                        aVar = aVar2;
                        i12 = i14;
                        i13 = length;
                        int i54 = i11 + 5;
                        int i55 = i11 + 6;
                        a(path, f37, f38, fArr[i54], fArr[i55], fArr[i11 + 0], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                        f37 = fArr[i54];
                        f38 = fArr[i55];
                    }
                    f32 = f38;
                    f31 = f37;
                    i15 = i11 + i10;
                    i14 = i12;
                    fArr3 = fArr;
                    c11 = c10;
                    c12 = c11;
                    length = i13;
                    aVar2 = aVar;
                }
                fArr2[0] = f37;
                fArr2[1] = f38;
                fArr2[2] = f31;
                fArr2[3] = f32;
                fArr2[4] = f35;
                fArr2[5] = f36;
                c11 = aVar2.f16496a;
                i14++;
                aVarArr2 = aVarArr;
                length = length;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            char c10 = aVar.f16496a;
            a aVar2 = aVarArr2[i10];
            if (c10 != aVar2.f16496a || aVar.f16497b.length != aVar2.f16497b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = i10 - 0;
        int min = Math.min(i11, length - 0);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        if (r13 == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: NumberFormatException -> 0x00b8, LOOP:3: B:25:0x0068->B:36:0x0093, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:22:0x0055, B:25:0x0068, B:27:0x006e, B:32:0x007c, B:36:0x0093, B:40:0x0098, B:45:0x00a8, B:57:0x00ad), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:22:0x0055, B:25:0x0068, B:27:0x006e, B:32:0x007c, B:36:0x0093, B:40:0x0098, B:45:0x00a8, B:57:0x00ad), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:22:0x0055, B:25:0x0068, B:27:0x006e, B:32:0x007c, B:36:0x0093, B:40:0x0098, B:45:0x00a8, B:57:0x00ad), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x.d.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.d.c(java.lang.String):x.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            a.b(c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(defpackage.g.d("Error in parsing ", str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
