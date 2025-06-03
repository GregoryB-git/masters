// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X1;

import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Base64;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public static final String a(final Context context) {
        Intrinsics.checkNotNullParameter(context, "ctx");
        try {
            final Signature[] signatures = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            final StringBuilder sb = new StringBuilder();
            final MessageDigest instance = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            final int length = signatures.length;
            int i = 0;
            while (i < length) {
                final Signature signature = signatures[i];
                ++i;
                instance.update(signature.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            final String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
        catch (PackageManager$NameNotFoundException | NoSuchAlgorithmException ex) {
            return "";
        }
    }
}
