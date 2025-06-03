package x3;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16904a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16905b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16906c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16907d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16908e = {32, 40, 48, 56, 64, 80, 96, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f16905b;
        if (i10 >= 3 || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i12 >= 19) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f16908e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
