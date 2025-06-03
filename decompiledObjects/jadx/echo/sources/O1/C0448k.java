package O1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: O1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0448k f3856a = new C0448k();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f3857b;

    static {
        HashSet c7;
        c7 = W5.K.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");
        f3857b = c7;
    }

    public static final boolean a(Context context, String packageName) {
        boolean s7;
        boolean o7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String brand = Build.BRAND;
        int i7 = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        s7 = kotlin.text.r.s(brand, "generic", false, 2, null);
        if (s7 && (i7 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet hashSet = f3857b;
                P p7 = P.f3756a;
                byte[] byteArray = signature.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                o7 = W5.w.o(hashSet, P.E0(byteArray));
                if (!o7) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
