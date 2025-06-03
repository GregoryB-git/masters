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
 *  com.hintsolutions.raintv.news.StoryFragment
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
import com.hintsolutions.raintv.news.StoryFragment;

public class StoryFragment_ViewBinding
implements Unbinder {
    private StoryFragment target;

    @UiThread
    public StoryFragment_ViewBinding(StoryFragment storyFragment, View view) {
        this.target = storyFragment;
        storyFragment.list = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296747, (String)"field 'list'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        StoryFragment storyFragment = this.target;
        if (storyFragment != null) {
            this.target = null;
            storyFragment.list = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

