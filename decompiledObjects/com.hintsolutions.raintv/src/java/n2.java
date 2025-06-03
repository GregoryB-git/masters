/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.profile.LegacyProfileFragment
 *  java.lang.Object
 */
import android.view.View;
import com.hintsolutions.raintv.profile.LegacyProfileFragment;

public final class n2
implements View.OnClickListener {
    public final int a;
    public final LegacyProfileFragment b;

    public /* synthetic */ n2(LegacyProfileFragment legacyProfileFragment, int n) {
        this.a = n;
        this.b = legacyProfileFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                LegacyProfileFragment.d((LegacyProfileFragment)this.b, (View)view);
                return;
            }
        }
        LegacyProfileFragment.c((LegacyProfileFragment)this.b, (View)view);
    }
}

