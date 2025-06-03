/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.profile.SavedVideosFragment;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;

public final class f4
implements TaskCallback,
MaterialDialog.SingleButtonCallback {
    public final int a;
    public final SavedVideosFragment b;
    public final SavedVideoHolder c;

    public /* synthetic */ f4(SavedVideosFragment savedVideosFragment, SavedVideoHolder savedVideoHolder, int n4) {
        this.a = n4;
        this.b = savedVideosFragment;
        this.c = savedVideoHolder;
    }

    @Override
    public final void onActionCompleted() {
        SavedVideosFragment.f(this.b, this.c);
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                SavedVideosFragment.b(this.b, this.c, materialDialog, dialogAction);
                return;
            }
        }
        SavedVideosFragment.d(this.b, this.c, materialDialog, dialogAction);
    }
}

