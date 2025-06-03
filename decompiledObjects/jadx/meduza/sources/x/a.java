package x;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16489a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i10, int i11) {
        int i12;
        int i13;
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i14 = 255 - alpha2;
        int i15 = 255 - (((255 - alpha) * i14) / 255);
        int red = Color.red(i10);
        int red2 = Color.red(i11);
        int i16 = 0;
        if (i15 == 0) {
            i12 = 0;
        } else {
            i12 = (((red2 * alpha) * i14) + ((red * 255) * alpha2)) / (i15 * 255);
        }
        int green = Color.green(i10);
        int green2 = Color.green(i11);
        if (i15 == 0) {
            i13 = 0;
        } else {
            i13 = (((green2 * alpha) * i14) + ((green * 255) * alpha2)) / (i15 * 255);
        }
        int blue = Color.blue(i10);
        int blue2 = Color.blue(i11);
        if (i15 != 0) {
            i16 = (((blue2 * alpha) * i14) + ((blue * 255) * alpha2)) / (i15 * 255);
        }
        return Color.argb(i15, i12, i13, i16);
    }
}
