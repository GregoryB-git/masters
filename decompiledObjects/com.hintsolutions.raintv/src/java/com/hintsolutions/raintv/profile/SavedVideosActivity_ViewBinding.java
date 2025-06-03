/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.UiThread
 *  androidx.appcompat.widget.Toolbar
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.profile.SavedVideosActivity;

public class SavedVideosActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private SavedVideosActivity target;

    @UiThread
    public SavedVideosActivity_ViewBinding(SavedVideosActivity savedVideosActivity) {
        this(savedVideosActivity, savedVideosActivity.getWindow().getDecorView());
    }

    @UiThread
    public SavedVideosActivity_ViewBinding(SavedVideosActivity savedVideosActivity, View view) {
        super(savedVideosActivity, view);
        this.target = savedVideosActivity;
        savedVideosActivity.toolbar = (Toolbar)Utils.findRequiredViewAsType((View)view, (int)2131297244, (String)"field 'toolbar'", Toolbar.class);
    }

    @Override
    public void unbind() {
        SavedVideosActivity savedVideosActivity = this.target;
        if (savedVideosActivity != null) {
            this.target = null;
            savedVideosActivity.toolbar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

