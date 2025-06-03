/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;

public final class y
implements MaterialDialog.SingleButtonCallback {
    public final int a;
    public final TaskCallback b;

    public /* synthetic */ y(TaskCallback taskCallback, int n4) {
        this.a = n4;
        this.b = taskCallback;
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                BaseActivity.m(this.b, materialDialog, dialogAction);
                return;
            }
        }
        BaseActivity.o(this.b, materialDialog, dialogAction);
    }
}

