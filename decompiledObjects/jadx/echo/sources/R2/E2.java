package R2;

import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.Q7;

/* loaded from: classes.dex */
public abstract /* synthetic */ class E2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4655a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4656b;

    static {
        int[] iArr = new int[I1.e.values().length];
        f4656b = iArr;
        try {
            iArr[I1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4656b[I1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4656b[I1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4656b[I1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[Q7.values().length];
        f4655a = iArr2;
        try {
            iArr2[Q7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4655a[Q7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f4655a[Q7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f4655a[Q7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
