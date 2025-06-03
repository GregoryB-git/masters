/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.FrameLayout
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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.subscriptions.AgreementActivity;

public class AgreementActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private AgreementActivity target;
    private View view7f09005d;

    @UiThread
    public AgreementActivity_ViewBinding(AgreementActivity agreementActivity) {
        this(agreementActivity, agreementActivity.getWindow().getDecorView());
    }

    @UiThread
    public AgreementActivity_ViewBinding(AgreementActivity agreementActivity, View view) {
        super(agreementActivity, view);
        this.target = agreementActivity;
        agreementActivity.webView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131296348, (String)"field 'webView'", WebView.class);
        agreementActivity.mProgressFrame = (FrameLayout)Utils.findRequiredViewAsType((View)view, (int)2131297034, (String)"field 'mProgressFrame'", FrameLayout.class);
        view = Utils.findRequiredView((View)view, (int)2131296349, (String)"field 'acceptButton' and method 'onAgreeClick'");
        agreementActivity.acceptButton = (Button)Utils.castView((View)view, (int)2131296349, (String)"field 'acceptButton'", Button.class);
        this.view7f09005d = view;
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, agreementActivity){
            public final AgreementActivity_ViewBinding this$0;
            public final AgreementActivity val$target;
            {
                this.this$0 = agreementActivity_ViewBinding;
                this.val$target = agreementActivity;
            }

            public void doClick(View view) {
                this.val$target.onAgreeClick();
            }
        });
    }

    @Override
    public void unbind() {
        AgreementActivity agreementActivity = this.target;
        if (agreementActivity != null) {
            this.target = null;
            agreementActivity.webView = null;
            agreementActivity.mProgressFrame = null;
            agreementActivity.acceptButton = null;
            this.view7f09005d.setOnClickListener(null);
            this.view7f09005d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

