/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Build
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package A2;

import A2.A;
import A2.z;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import z2.g;

public abstract class B
implements DialogInterface.OnClickListener {
    public static B b(Activity activity, Intent intent, int n8) {
        return new z(intent, activity, n8);
    }

    public static B c(g g8, Intent intent, int n8) {
        return new A(intent, g8, 2);
    }

    public abstract void a();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void onClick(DialogInterface dialogInterface, int n8) {
        Throwable throwable222;
        this.a();
        dialogInterface.dismiss();
        return;
        {
            catch (Throwable throwable222) {
            }
            catch (ActivityNotFoundException activityNotFoundException) {}
            String string2 = "Failed to start resolution intent.";
            {
                if (Build.FINGERPRINT.contains((CharSequence)"generic")) {
                    string2 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e((String)"DialogRedirect", (String)string2, (Throwable)activityNotFoundException);
            }
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
        throw throwable222;
    }
}

