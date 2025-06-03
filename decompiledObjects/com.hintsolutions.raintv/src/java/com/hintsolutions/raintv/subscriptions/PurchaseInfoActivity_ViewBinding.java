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
import com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity;
import com.rengwuxian.materialedittext.MaterialEditText;

public class PurchaseInfoActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private PurchaseInfoActivity target;
    private View view7f09035d;

    @UiThread
    public PurchaseInfoActivity_ViewBinding(PurchaseInfoActivity purchaseInfoActivity) {
        this(purchaseInfoActivity, purchaseInfoActivity.getWindow().getDecorView());
    }

    @UiThread
    public PurchaseInfoActivity_ViewBinding(PurchaseInfoActivity purchaseInfoActivity, View view) {
        super(purchaseInfoActivity, view);
        this.target = purchaseInfoActivity;
        purchaseInfoActivity.info = (MaterialEditText)((Object)Utils.findRequiredViewAsType((View)view, (int)2131296710, (String)"field 'info'", MaterialEditText.class));
        this.view7f09035d = view = Utils.findRequiredView((View)view, (int)2131297117, (String)"method 'onSendClick'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, purchaseInfoActivity){
            public final PurchaseInfoActivity_ViewBinding this$0;
            public final PurchaseInfoActivity val$target;
            {
                this.this$0 = purchaseInfoActivity_ViewBinding;
                this.val$target = purchaseInfoActivity;
            }

            public void doClick(View view) {
                this.val$target.onSendClick();
            }
        });
    }

    @Override
    public void unbind() {
        PurchaseInfoActivity purchaseInfoActivity = this.target;
        if (purchaseInfoActivity != null) {
            this.target = null;
            purchaseInfoActivity.info = null;
            this.view7f09035d.setOnClickListener(null);
            this.view7f09035d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

