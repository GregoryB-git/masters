/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;

public class BestNewsAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private BestNewsAdapter.ViewHolder target;

    @UiThread
    public BestNewsAdapter$ViewHolder_ViewBinding(BestNewsAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.newsImageView = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296961, (String)"field 'newsImageView'", ImageView.class);
        viewHolder.nameTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296947, (String)"field 'nameTextView'", TextView.class);
        viewHolder.rootLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131297073, (String)"field 'rootLayout'", LinearLayout.class);
        viewHolder.addToFavorites = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296344, (String)"field 'addToFavorites'", ImageView.class);
        viewHolder.programTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297023, (String)"field 'programTextView'", TextView.class);
        viewHolder.delimiter = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'delimiter'");
    }

    @CallSuper
    public void unbind() {
        BestNewsAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.newsImageView = null;
            viewHolder.nameTextView = null;
            viewHolder.rootLayout = null;
            viewHolder.addToFavorites = null;
            viewHolder.programTextView = null;
            viewHolder.delimiter = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

