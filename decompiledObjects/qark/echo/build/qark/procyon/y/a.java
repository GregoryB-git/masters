// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import android.content.pm.SigningInfo;
import android.os.Build$VERSION;
import android.content.pm.PackageInfo;

public abstract class a
{
    public static long a(final PackageInfo packageInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return a.b(packageInfo);
        }
        return packageInfo.versionCode;
    }
    
    public abstract static class a
    {
        public static Signature[] a(@NonNull final SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }
        
        public static long b(final PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
        
        public static Signature[] c(@NonNull final SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }
        
        public static boolean d(@NonNull final SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }
        
        public static boolean e(@NonNull final PackageManager packageManager, @NonNull final String s, @NonNull final byte[] array, final int n) {
            return packageManager.hasSigningCertificate(s, array, n);
        }
    }
}
