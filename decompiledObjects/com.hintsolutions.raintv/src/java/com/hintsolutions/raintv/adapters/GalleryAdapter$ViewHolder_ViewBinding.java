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
package com.hintsolutions.raintv.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.adapters.GalleryAdapter;

public class GalleryAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private GalleryAdapter.ViewHolder target;

    @UiThread
    public GalleryAdapter$ViewHolder_ViewBinding(GalleryAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        viewHolder.author = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296374, (String)"field 'author'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        GalleryAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.image = null;
            viewHolder.author = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

