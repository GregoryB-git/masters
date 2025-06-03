/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.List
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import java.util.List;
import okhttp3.ResponseBody;
import rx.functions.Action1;

public final class w2
implements TaskCallback,
Action1,
MaterialDialog.SingleButtonCallback {
    public final int a;
    public final MainActivity b;

    public /* synthetic */ w2(MainActivity mainActivity, int n4) {
        this.a = n4;
        this.b = mainActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                MainActivity.K(this.b, (List)object);
                return;
            }
            case 1: {
                MainActivity.H(this.b, (Throwable)object);
                return;
            }
        }
        MainActivity.G(this.b, (ResponseBody)object);
    }

    @Override
    public final void onActionCompleted() {
        MainActivity.B(this.b);
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        MainActivity.E(this.b, materialDialog, dialogAction);
    }
}

