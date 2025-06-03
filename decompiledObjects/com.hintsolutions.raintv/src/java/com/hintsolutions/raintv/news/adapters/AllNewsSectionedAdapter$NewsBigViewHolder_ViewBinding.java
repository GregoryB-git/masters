/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public class AllNewsSectionedAdapter$NewsBigViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.NewsBigViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$NewsBigViewHolder_ViewBinding(AllNewsSectionedAdapter.NewsBigViewHolder newsBigViewHolder, View view) {
        this.target = newsBigViewHolder;
        newsBigViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'name'", TextView.class);
        newsBigViewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        newsBigViewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        newsBigViewHolder.programName = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297027, (String)"field 'programName'", TextView.class);
        newsBigViewHolder.addToFavorites = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296344, (String)"field 'addToFavorites'", ImageView.class);
        newsBigViewHolder.durationLayout = Utils.findRequiredView((View)view, (int)2131297317, (String)"field 'durationLayout'");
        newsBigViewHolder.duration = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297316, (String)"field 'duration'", TextView.class);
        newsBigViewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
        newsBigViewHolder.textLayout = Utils.findRequiredView((View)view, (int)2131297224, (String)"field 'textLayout'");
        newsBigViewHolder.itemLayout = Utils.findRequiredView((View)view, (int)2131296719, (String)"field 'itemLayout'");
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.NewsBigViewHolder newsBigViewHolder = this.target;
        if (newsBigViewHolder != null) {
            this.target = null;
            newsBigViewHolder.name = null;
            newsBigViewHolder.imageLayout = null;
            newsBigViewHolder.image = null;
            newsBigViewHolder.programName = null;
            newsBigViewHolder.addToFavorites = null;
            newsBigViewHolder.durationLayout = null;
            newsBigViewHolder.duration = null;
            newsBigViewHolder.elementDivider = null;
            newsBigViewHolder.textLayout = null;
            newsBigViewHolder.itemLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

