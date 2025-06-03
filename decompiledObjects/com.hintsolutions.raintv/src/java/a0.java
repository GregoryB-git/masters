/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.search.SearchResponse
 *  rx.functions.Action1
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.search.SearchActivity;
import ru.tvrain.core.data.search.SearchResponse;
import rx.functions.Action1;

public final class a0
implements Action1,
MaterialDialog.SingleButtonCallback {
    public final int a;
    public final boolean b;
    public final BaseActivity c;

    public /* synthetic */ a0(BaseActivity baseActivity, boolean bl, int n2) {
        this.a = n2;
        this.c = baseActivity;
        this.b = bl;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                BaseActivity.v(this.c, this.b, (Throwable)object);
                return;
            }
        }
        SearchActivity.D((SearchActivity)this.c, this.b, (SearchResponse)object);
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        NewsActivity.D((NewsActivity)this.c, this.b, materialDialog, dialogAction);
    }
}

