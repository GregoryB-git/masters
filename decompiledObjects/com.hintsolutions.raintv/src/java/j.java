/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  java.lang.Object
 */
import android.content.DialogInterface;
import com.onesignal.AlertDialogPrepromptForAndroidSettings;

public final class j
implements DialogInterface.OnClickListener {
    public final int a;
    public final AlertDialogPrepromptForAndroidSettings.Callback b;

    public /* synthetic */ j(AlertDialogPrepromptForAndroidSettings.Callback callback, int n) {
        this.a = n;
        this.b = callback;
    }

    public final void onClick(DialogInterface dialogInterface, int n) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AlertDialogPrepromptForAndroidSettings.b(this.b, dialogInterface, n);
                return;
            }
        }
        AlertDialogPrepromptForAndroidSettings.a(this.b, dialogInterface, n);
    }
}

