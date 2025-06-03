/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Matrix
 *  android.media.MediaCodecInfo
 *  android.telephony.CellSignalStrengthLte
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.WindowInsets
 *  java.lang.Object
 */
import android.graphics.Insets;
import android.graphics.Matrix;
import android.media.MediaCodecInfo;
import android.telephony.CellSignalStrengthLte;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

public final class o5 {
    public static /* bridge */ /* synthetic */ float a(View view) {
        return view.getTransitionAlpha();
    }

    public static /* bridge */ /* synthetic */ int b(CellSignalStrengthLte cellSignalStrengthLte) {
        return cellSignalStrengthLte.getRssi();
    }

    public static /* bridge */ /* synthetic */ Insets c(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsets d(WindowInsets windowInsets, int n, int n2, int n3, int n4) {
        return windowInsets.inset(n, n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void e(int n, View view) {
        view.setTransitionVisibility(n);
    }

    public static /* bridge */ /* synthetic */ void f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public static /* bridge */ /* synthetic */ void g(View view, int n, int n2, int n3, int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void h(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static /* bridge */ /* synthetic */ void i(ViewGroup viewGroup, boolean bl) {
        viewGroup.suppressLayout(bl);
    }

    public static /* bridge */ /* synthetic */ boolean j(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static /* bridge */ /* synthetic */ Insets k(WindowInsets windowInsets) {
        return windowInsets.getTappableElementInsets();
    }

    public static /* bridge */ /* synthetic */ void l(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static /* bridge */ /* synthetic */ boolean m(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* bridge */ /* synthetic */ Insets n(WindowInsets windowInsets) {
        return windowInsets.getMandatorySystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ void o(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static /* bridge */ /* synthetic */ boolean p(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}

