/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.promos;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.promos.GiftSubscriptionActivity;

public class GiftSubscriptionActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private GiftSubscriptionActivity target;
    private View view7f0901e9;
    private View view7f090361;

    @UiThread
    public GiftSubscriptionActivity_ViewBinding(GiftSubscriptionActivity giftSubscriptionActivity) {
        this(giftSubscriptionActivity, giftSubscriptionActivity.getWindow().getDecorView());
    }

    @UiThread
    public GiftSubscriptionActivity_ViewBinding(GiftSubscriptionActivity giftSubscriptionActivity, View view) {
        super(giftSubscriptionActivity, view);
        this.target = giftSubscriptionActivity;
        View view2 = Utils.findRequiredView((View)view, (int)2131296745, (String)"field 'linkTextView' and method 'onLinkClicked'");
        giftSubscriptionActivity.linkTextView = (TextView)Utils.castView((View)view2, (int)2131296745, (String)"field 'linkTextView'", TextView.class);
        this.view7f0901e9 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, giftSubscriptionActivity){
            public final GiftSubscriptionActivity_ViewBinding this$0;
            public final GiftSubscriptionActivity val$target;
            {
                this.this$0 = giftSubscriptionActivity_ViewBinding;
                this.val$target = giftSubscriptionActivity;
            }

            public void doClick(View view) {
                this.val$target.onLinkClicked();
            }
        });
        giftSubscriptionActivity.registeredAmount = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297052, (String)"field 'registeredAmount'", TextView.class);
        giftSubscriptionActivity.boughtAmount = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296400, (String)"field 'boughtAmount'", TextView.class);
        view = Utils.findRequiredView((View)view, (int)2131297121, (String)"field 'share' and method 'onShareClicked'");
        giftSubscriptionActivity.share = (Button)Utils.castView((View)view, (int)2131297121, (String)"field 'share'", Button.class);
        this.view7f090361 = view;
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, giftSubscriptionActivity){
            public final GiftSubscriptionActivity_ViewBinding this$0;
            public final GiftSubscriptionActivity val$target;
            {
                this.this$0 = giftSubscriptionActivity_ViewBinding;
                this.val$target = giftSubscriptionActivity;
            }

            public void doClick(View view) {
                this.val$target.onShareClicked();
            }
        });
    }

    @Override
    public void unbind() {
        GiftSubscriptionActivity giftSubscriptionActivity = this.target;
        if (giftSubscriptionActivity != null) {
            this.target = null;
            giftSubscriptionActivity.linkTextView = null;
            giftSubscriptionActivity.registeredAmount = null;
            giftSubscriptionActivity.boughtAmount = null;
            giftSubscriptionActivity.share = null;
            this.view7f0901e9.setOnClickListener(null);
            this.view7f0901e9 = null;
            this.view7f090361.setOnClickListener(null);
            this.view7f090361 = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

