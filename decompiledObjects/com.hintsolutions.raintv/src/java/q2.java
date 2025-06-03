/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  com.hintsolutions.raintv.profile.LinkDialogFragment
 *  java.lang.Object
 */
import android.content.DialogInterface;
import com.hintsolutions.raintv.profile.LinkDialogFragment;

public final class q2
implements DialogInterface.OnClickListener {
    public final int a;
    public final LinkDialogFragment b;

    public /* synthetic */ q2(LinkDialogFragment linkDialogFragment, int n) {
        this.a = n;
        this.b = linkDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int n) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                LinkDialogFragment.b((LinkDialogFragment)this.b, (DialogInterface)dialogInterface, (int)n);
                return;
            }
        }
        LinkDialogFragment.a((LinkDialogFragment)this.b, (DialogInterface)dialogInterface, (int)n);
    }
}

