// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import G2.d;
import android.content.Context;

public abstract class a
{
    public static byte[] a(final Context context, final String s) {
        final PackageInfo e = d.a(context).e(s, 64);
        final Signature[] signatures = e.signatures;
        if (signatures != null && signatures.length == 1) {
            final MessageDigest b = b("SHA1");
            if (b != null) {
                return b.digest(e.signatures[0].toByteArray());
            }
        }
        return null;
    }
    
    public static MessageDigest b(final String algorithm) {
        int n = 0;
    Label_0021_Outer:
        while (true) {
            Label_0028: {
                if (n >= 2) {
                    break Label_0028;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance(algorithm);
                        if (instance == null) {
                            ++n;
                            continue Label_0021_Outer;
                        }
                        return instance;
                        return null;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
