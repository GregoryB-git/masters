/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 *  android.os.Build
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 */
package O1;

import O1.P;
import W5.I;
import W5.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class k {
    public static final k a = new k();
    public static final HashSet b = I.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context arrsignature, String hashSet) {
        boolean bl;
        block7 : {
            block8 : {
                Intrinsics.checkNotNullParameter(arrsignature, "context");
                Intrinsics.checkNotNullParameter((Object)hashSet, "packageName");
                String arrby = Build.BRAND;
                int n8 = arrsignature.getApplicationInfo().flags;
                Intrinsics.checkNotNullExpressionValue(arrby, "brand");
                bl = false;
                if (i.s(arrby, "generic", false, 2, null) && (n8 & 2) != 0) {
                    return true;
                }
                arrsignature = arrsignature.getPackageManager().getPackageInfo((String)hashSet, 64);
                hashSet = arrsignature.signatures;
                if (hashSet == null) break block7;
                Intrinsics.checkNotNullExpressionValue((Object)hashSet, "packageInfo.signatures");
                if (hashSet.length != 0) break block8;
                return false;
            }
            try {
                arrsignature = arrsignature.signatures;
                Intrinsics.checkNotNullExpressionValue(arrsignature, "packageInfo.signatures");
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return false;
            }
            for (Signature signature : arrsignature) {
                hashSet = b;
                P p8 = P.a;
                byte[] arrby = signature.toByteArray();
                Intrinsics.checkNotNullExpressionValue(arrby, "it.toByteArray()");
                bl = m.o((Iterable)hashSet, P.E0(arrby));
                if (bl) continue;
                return false;
            }
            bl = true;
        }
        return bl;
    }
}

