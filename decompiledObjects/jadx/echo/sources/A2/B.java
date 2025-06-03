package A2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import z2.InterfaceC2304g;

/* loaded from: classes.dex */
public abstract class B implements DialogInterface.OnClickListener {
    public static B b(Activity activity, Intent intent, int i7) {
        return new C0339z(intent, activity, i7);
    }

    public static B c(InterfaceC2304g interfaceC2304g, Intent intent, int i7) {
        return new A(intent, interfaceC2304g, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            a();
        } catch (ActivityNotFoundException e7) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
