// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.content.Context;

public class E
{
    public String a;
    
    public static String b(final Context context) {
        String installerPackageName;
        if ((installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName())) == null) {
            installerPackageName = "";
        }
        return installerPackageName;
    }
    
    public String a(final Context context) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.a == null) {
                    this.a = b(context);
                }
                String a;
                if ("".equals(this.a)) {
                    a = null;
                }
                else {
                    a = this.a;
                }
                // monitorexit(this)
                return a;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
