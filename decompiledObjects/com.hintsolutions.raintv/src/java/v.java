/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Live
 *  ru.tvrain.core.data.RainUser
 *  ru.tvrain.core.data.UserInfo
 *  rx.functions.Action1
 *  tvrain.utils.PushHelper
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.UserInfo;
import rx.functions.Action1;
import tvrain.utils.PushHelper;

public final class v
implements Action1,
MaterialDialog.SingleButtonCallback,
TaskCallback {
    public final int a;
    public final BaseActivity b;

    public /* synthetic */ v(BaseActivity baseActivity, int n4) {
        this.a = n4;
        this.b = baseActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 11: {
                BaseActivity.p(this.b, (Throwable)object);
                return;
            }
            case 10: {
                BaseActivity.j(this.b, (Live)object);
                return;
            }
            case 9: {
                BaseActivity.d(this.b, (Throwable)object);
                return;
            }
            case 5: {
                BaseActivity.x(this.b, (Throwable)object);
                return;
            }
            case 4: {
                BaseActivity.s(this.b, (RainUser)object);
                return;
            }
            case 3: {
                BaseActivity.h(this.b, (Throwable)object);
                return;
            }
            case 2: {
                BaseActivity.c(this.b, (Throwable)object);
                return;
            }
            case 1: {
                BaseActivity.y(this.b, (Throwable)object);
                return;
            }
            case 0: {
                BaseActivity.q(this.b, (UserInfo)object);
                return;
            }
        }
        BaseActivity.r(this.b, (Throwable)object);
    }

    @Override
    public final void onActionCompleted() {
        switch (this.a) {
            default: {
                break;
            }
            case 12: {
                this.b.showMainActivityWithAuth();
                return;
            }
        }
        PushHelper.a((BaseActivity)this.b);
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        switch (this.a) {
            default: {
                break;
            }
            case 13: {
                BaseActivity.e(this.b, materialDialog, dialogAction);
                return;
            }
            case 8: {
                BaseActivity.w(this.b, materialDialog, dialogAction);
                return;
            }
            case 7: {
                BaseActivity.i(this.b, materialDialog, dialogAction);
                return;
            }
            case 6: {
                BaseActivity.u(this.b, materialDialog, dialogAction);
                return;
            }
        }
        BaseActivity.t(this.b, materialDialog, dialogAction);
    }
}

