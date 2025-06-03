/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Color
 *  android.graphics.ColorSpace
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest
 *  android.media.AudioManager
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityWindowInfo
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.TextView;
import java.util.List;

public final class b {
    public static /* bridge */ /* synthetic */ float A(long l) {
        return Color.green((long)l);
    }

    public static /* bridge */ /* synthetic */ float B(Color color2) {
        return color2.getComponent(2);
    }

    public static /* bridge */ /* synthetic */ float C(long l) {
        return Color.blue((long)l);
    }

    public static /* bridge */ /* synthetic */ float D(Color color2) {
        return color2.getComponent(1);
    }

    public static /* bridge */ /* synthetic */ float a(long l) {
        return Color.luminance((long)l);
    }

    public static /* bridge */ /* synthetic */ float b(Color color2) {
        return color2.getComponent(3);
    }

    public static /* bridge */ /* synthetic */ int c(long l) {
        return Color.toArgb((long)l);
    }

    public static /* bridge */ /* synthetic */ int d(Color color2) {
        return color2.toArgb();
    }

    public static /* bridge */ /* synthetic */ int e(AudioAttributes audioAttributes) {
        return audioAttributes.getVolumeControlStream();
    }

    public static /* bridge */ /* synthetic */ int f(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ int g(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static /* bridge */ /* synthetic */ long h(int n, ColorSpace colorSpace) {
        return Color.convert((int)n, (ColorSpace)colorSpace);
    }

    public static /* bridge */ /* synthetic */ Bitmap i(int n, int n2, Bitmap.Config config, boolean bl, ColorSpace colorSpace) {
        return Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)config, (boolean)bl, (ColorSpace)colorSpace);
    }

    public static /* bridge */ /* synthetic */ Color j(int n) {
        return Color.valueOf((int)n);
    }

    public static /* bridge */ /* synthetic */ Color k(Color color2, ColorSpace colorSpace) {
        return color2.convert(colorSpace);
    }

    public static /* bridge */ /* synthetic */ ColorSpace l(long l) {
        return Color.colorSpace((long)l);
    }

    public static /* bridge */ /* synthetic */ CharSequence m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getHintText();
    }

    public static /* bridge */ /* synthetic */ List n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getAvailableExtraData();
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo accessibilityNodeInfo, List list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }

    public static /* bridge */ /* synthetic */ void q(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setShowingHintText(bl);
    }

    public static /* bridge */ /* synthetic */ void r(TextView textView, int n, int n2, int n3, int n4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void s(TextView textView, int[] nArray, int n) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n);
    }

    public static /* bridge */ /* synthetic */ boolean t(long l) {
        return Color.isWideGamut((long)l);
    }

    public static /* bridge */ /* synthetic */ boolean u(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }

    public static /* bridge */ /* synthetic */ boolean v(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.isInPictureInPictureMode();
    }

    public static /* bridge */ /* synthetic */ boolean w(TextView textView, String string2) {
        return textView.setFontVariationSettings(string2);
    }

    public static /* bridge */ /* synthetic */ float x(long l) {
        return Color.red((long)l);
    }

    public static /* bridge */ /* synthetic */ float y(Color color2) {
        return color2.getComponent(0);
    }

    public static /* bridge */ /* synthetic */ int z(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }
}

