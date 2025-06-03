// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import z2.g;
import android.content.Intent;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

public abstract class B implements DialogInterface$OnClickListener
{
    public static B b(final Activity activity, final Intent intent, final int n) {
        return new z(intent, activity, n);
    }
    
    public static B c(final g g, final Intent intent, final int n) {
        return new A(intent, g, 2);
    }
    
    public abstract void a();
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.a();
                dialogInterface.dismiss();
                return;
            }
            finally {}
        }
        catch (ActivityNotFoundException ex) {
            String s = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains("generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, (Throwable)ex);
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
    }
}
