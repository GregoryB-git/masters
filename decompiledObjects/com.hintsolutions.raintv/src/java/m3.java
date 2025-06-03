/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.news.NewsActivity;

public final class m3
implements MaterialDialog.SingleButtonCallback {
    public final NewsActivity a;
    public final boolean b;
    public final long c;

    public /* synthetic */ m3(NewsActivity newsActivity, boolean bl, long l4) {
        this.a = newsActivity;
        this.b = bl;
        this.c = l4;
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        NewsActivity.R(this.a, this.b, this.c, materialDialog, dialogAction);
    }
}

