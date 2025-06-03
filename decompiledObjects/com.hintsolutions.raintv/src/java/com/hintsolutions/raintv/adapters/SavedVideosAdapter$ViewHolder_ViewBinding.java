/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.appcompat.widget.Toolbar
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.adapters.SavedVideosAdapter;

public class SavedVideosAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private SavedVideosAdapter.ViewHolder target;

    @UiThread
    public SavedVideosAdapter$ViewHolder_ViewBinding(SavedVideosAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.thumbnailImageView = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131297232, (String)"field 'thumbnailImageView'", ImageView.class);
        viewHolder.cardToolbar = (Toolbar)Utils.findRequiredViewAsType((View)view, (int)2131296430, (String)"field 'cardToolbar'", Toolbar.class);
        viewHolder.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        viewHolder.rootLayout = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131297073, (String)"field 'rootLayout'", RelativeLayout.class);
        viewHolder.position = (ProgressBar)Utils.findRequiredViewAsType((View)view, (int)2131297014, (String)"field 'position'", ProgressBar.class);
    }

    @CallSuper
    public void unbind() {
        SavedVideosAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.thumbnailImageView = null;
            viewHolder.cardToolbar = null;
            viewHolder.title = null;
            viewHolder.rootLayout = null;
            viewHolder.position = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

