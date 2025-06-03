/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  androidx.annotation.UiThread
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;

public class MainActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private MainActivity target;
    private View view7f0901ef;

    @UiThread
    public MainActivity_ViewBinding(MainActivity mainActivity) {
        this(mainActivity, mainActivity.getWindow().getDecorView());
    }

    @UiThread
    public MainActivity_ViewBinding(MainActivity mainActivity, View view) {
        super(mainActivity, view);
        this.target = mainActivity;
        mainActivity.mContentFrame = (FrameLayout)Utils.findRequiredViewAsType((View)view, (int)2131296507, (String)"field 'mContentFrame'", FrameLayout.class);
        mainActivity.mProgressFrame = (FrameLayout)Utils.findRequiredViewAsType((View)view, (int)2131297034, (String)"field 'mProgressFrame'", FrameLayout.class);
        this.view7f0901ef = view = Utils.findRequiredView((View)view, (int)2131296751, (String)"method 'onClickLive'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, mainActivity){
            public final MainActivity_ViewBinding this$0;
            public final MainActivity val$target;
            {
                this.this$0 = mainActivity_ViewBinding;
                this.val$target = mainActivity;
            }

            public void doClick(View view) {
                this.val$target.onClickLive();
            }
        });
    }

    @Override
    public void unbind() {
        MainActivity mainActivity = this.target;
        if (mainActivity != null) {
            this.target = null;
            mainActivity.mContentFrame = null;
            mainActivity.mProgressFrame = null;
            this.view7f0901ef.setOnClickListener(null);
            this.view7f0901ef = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

