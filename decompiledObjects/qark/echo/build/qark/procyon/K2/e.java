// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K2;

import android.os.Build$VERSION;

public abstract class e
{
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 33 || Build$VERSION.CODENAME.charAt(0) == 'T';
    }
}
