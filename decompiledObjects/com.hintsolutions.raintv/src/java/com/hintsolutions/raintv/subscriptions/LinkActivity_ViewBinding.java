/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  androidx.annotation.UiThread
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.subscriptions;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.subscriptions.LinkActivity;

public class LinkActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private LinkActivity target;
    private View view7f090077;
    private View view7f0901d8;
    private View view7f09031d;

    @UiThread
    public LinkActivity_ViewBinding(LinkActivity linkActivity) {
        this(linkActivity, linkActivity.getWindow().getDecorView());
    }

    @UiThread
    public LinkActivity_ViewBinding(LinkActivity linkActivity, View view) {
        super(linkActivity, view);
        View view2;
        this.target = linkActivity;
        this.view7f090077 = view2 = Utils.findRequiredView((View)view, (int)2131296375, (String)"method 'startAuthorization'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, linkActivity){
            public final LinkActivity_ViewBinding this$0;
            public final LinkActivity val$target;
            {
                this.this$0 = linkActivity_ViewBinding;
                this.val$target = linkActivity;
            }

            public void doClick(View view) {
                this.val$target.startAuthorization();
            }
        });
        this.view7f09031d = view2 = Utils.findRequiredView((View)view, (int)2131297053, (String)"method 'startRegistration'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, linkActivity){
            public final LinkActivity_ViewBinding this$0;
            public final LinkActivity val$target;
            {
                this.this$0 = linkActivity_ViewBinding;
                this.val$target = linkActivity;
            }

            public void doClick(View view) {
                this.val$target.startRegistration();
            }
        });
        this.view7f0901d8 = view = Utils.findRequiredView((View)view, (int)2131296728, (String)"method 'startRestore'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, linkActivity){
            public final LinkActivity_ViewBinding this$0;
            public final LinkActivity val$target;
            {
                this.this$0 = linkActivity_ViewBinding;
                this.val$target = linkActivity;
            }

            public void doClick(View view) {
                this.val$target.startRestore();
            }
        });
    }

    @Override
    public void unbind() {
        if (this.target != null) {
            this.target = null;
            this.view7f090077.setOnClickListener(null);
            this.view7f090077 = null;
            this.view7f09031d.setOnClickListener(null);
            this.view7f09031d = null;
            this.view7f0901d8.setOnClickListener(null);
            this.view7f0901d8 = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

