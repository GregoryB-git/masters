/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.common.BaseFragment
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  com.hintsolutions.raintv.services.audio.AudioActivity
 *  java.lang.Object
 */
import android.view.View;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.hintsolutions.raintv.services.audio.AudioActivity;

public final class c0
implements View.OnClickListener {
    public final int a;
    public final Object b;

    public /* synthetic */ c0(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AllNewsSectionedAdapter.c((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (View)view);
                return;
            }
            case 0: {
                BaseFragment.a((TaskCallback)((TaskCallback)this.b), (View)view);
                return;
            }
        }
        AudioActivity.E((AudioActivity)((AudioActivity)this.b), (View)view);
    }
}

