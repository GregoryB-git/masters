/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.profile.AuthorizationActivity
 *  java.lang.Object
 */
import android.view.View;
import com.hintsolutions.raintv.profile.AuthorizationActivity;

public final class t
implements View.OnClickListener {
    public final int a;
    public final AuthorizationActivity b;

    public /* synthetic */ t(AuthorizationActivity authorizationActivity, int n) {
        this.a = n;
        this.b = authorizationActivity;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                AuthorizationActivity.B((AuthorizationActivity)this.b, (View)view);
                return;
            }
            case 2: {
                AuthorizationActivity.z((AuthorizationActivity)this.b, (View)view);
                return;
            }
            case 1: {
                AuthorizationActivity.K((AuthorizationActivity)this.b, (View)view);
                return;
            }
            case 0: {
                AuthorizationActivity.G((AuthorizationActivity)this.b, (View)view);
                return;
            }
        }
        AuthorizationActivity.A((AuthorizationActivity)this.b, (View)view);
    }
}

