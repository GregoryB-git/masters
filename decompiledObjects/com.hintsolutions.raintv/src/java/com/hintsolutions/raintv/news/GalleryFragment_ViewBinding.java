/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.news.GalleryFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.GalleryFragment;

public class GalleryFragment_ViewBinding
implements Unbinder {
    private GalleryFragment target;

    @UiThread
    public GalleryFragment_ViewBinding(GalleryFragment galleryFragment, View view) {
        this.target = galleryFragment;
        galleryFragment.galleryView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296653, (String)"field 'galleryView'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        GalleryFragment galleryFragment = this.target;
        if (galleryFragment != null) {
            this.target = null;
            galleryFragment.galleryView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

