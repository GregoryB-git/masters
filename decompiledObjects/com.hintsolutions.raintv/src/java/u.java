/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  com.hintsolutions.raintv.profile.AuthorizationActivity
 *  java.lang.Object
 */
import android.content.DialogInterface;
import com.hintsolutions.raintv.profile.AuthorizationActivity;

public final class u
implements DialogInterface.OnCancelListener {
    public final AuthorizationActivity a;

    public /* synthetic */ u(AuthorizationActivity authorizationActivity) {
        this.a = authorizationActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AuthorizationActivity.D((AuthorizationActivity)this.a, (DialogInterface)dialogInterface);
    }
}

