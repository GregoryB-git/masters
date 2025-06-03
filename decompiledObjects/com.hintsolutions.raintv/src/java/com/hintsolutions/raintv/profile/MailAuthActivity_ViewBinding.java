/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  android.widget.ProgressBar
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
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.profile.MailAuthActivity;

public class MailAuthActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private MailAuthActivity target;

    @UiThread
    public MailAuthActivity_ViewBinding(MailAuthActivity mailAuthActivity) {
        this(mailAuthActivity, mailAuthActivity.getWindow().getDecorView());
    }

    @UiThread
    public MailAuthActivity_ViewBinding(MailAuthActivity mailAuthActivity, View view) {
        super(mailAuthActivity, view);
        this.target = mailAuthActivity;
        mailAuthActivity.toolbar = (Toolbar)Utils.findRequiredViewAsType((View)view, (int)2131297244, (String)"field 'toolbar'", Toolbar.class);
        mailAuthActivity.webView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131297346, (String)"field 'webView'", WebView.class);
        mailAuthActivity.horizontalProgressBar = (ProgressBar)Utils.findRequiredViewAsType((View)view, (int)2131296679, (String)"field 'horizontalProgressBar'", ProgressBar.class);
    }

    @Override
    public void unbind() {
        MailAuthActivity mailAuthActivity = this.target;
        if (mailAuthActivity != null) {
            this.target = null;
            mailAuthActivity.toolbar = null;
            mailAuthActivity.webView = null;
            mailAuthActivity.horizontalProgressBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

