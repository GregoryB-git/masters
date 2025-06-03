/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.appcompat.widget.Toolbar
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.common;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity;

public class BaseActivity_ViewBinding
implements Unbinder {
    private BaseActivity target;

    @UiThread
    public BaseActivity_ViewBinding(BaseActivity baseActivity) {
        this(baseActivity, baseActivity.getWindow().getDecorView());
    }

    @UiThread
    public BaseActivity_ViewBinding(BaseActivity baseActivity, View view) {
        this.target = baseActivity;
        baseActivity.toolbar = (Toolbar)Utils.findOptionalViewAsType((View)view, (int)2131297244, (String)"field 'toolbar'", Toolbar.class);
        baseActivity.title = (TextView)Utils.findOptionalViewAsType((View)view, (int)2131297246, (String)"field 'title'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        BaseActivity baseActivity = this.target;
        if (baseActivity != null) {
            this.target = null;
            baseActivity.toolbar = null;
            baseActivity.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

