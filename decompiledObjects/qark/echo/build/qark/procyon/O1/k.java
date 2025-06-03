// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import W5.m;
import kotlin.text.i;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import W5.I;
import java.util.HashSet;

public final class k
{
    public static final k a;
    public static final HashSet b;
    
    static {
        a = new k();
        b = I.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");
    }
    
    public static final boolean a(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(s, "packageName");
        final String brand = Build.BRAND;
        final int flags = context.getApplicationInfo().flags;
        Intrinsics.checkNotNullExpressionValue(brand, "brand");
        boolean b = false;
        if (i.s(brand, "generic", false, 2, null) && (flags & 0x2) != 0x0) {
            return true;
        }
        try {
            final PackageInfo packageInfo = context.getPackageManager().getPackageInfo(s, 64);
            final Signature[] signatures = packageInfo.signatures;
            if (signatures != null) {
                Intrinsics.checkNotNullExpressionValue(signatures, "packageInfo.signatures");
                if (signatures.length == 0) {
                    return false;
                }
                final Signature[] signatures2 = packageInfo.signatures;
                Intrinsics.checkNotNullExpressionValue(signatures2, "packageInfo.signatures");
                for (int length = signatures2.length, i = 0; i < length; ++i) {
                    final Signature signature = signatures2[i];
                    final HashSet b2 = k.b;
                    final P a = P.a;
                    final byte[] byteArray = signature.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                    if (!m.o(b2, P.E0(byteArray))) {
                        return false;
                    }
                }
                b = true;
            }
            return b;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
}
