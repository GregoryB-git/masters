/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  com.twitter.sdk.android.core.Callback
 *  com.twitter.sdk.android.core.TwitterSession
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package com.twitter.sdk.android.core.identity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.R;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.lang.ref.WeakReference;

public class TwitterLoginButton
extends Button {
    public static final String ERROR_MSG_NO_ACTIVITY = "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.";
    public static final String TAG = "Twitter";
    public final WeakReference<Activity> activityRef = new WeakReference((Object)this.getActivity());
    public volatile TwitterAuthClient authClient;
    public Callback<TwitterSession> callback;
    public View.OnClickListener onClickListener;

    public TwitterLoginButton(Context context) {
        this(context, null);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int n) {
        this(context, attributeSet, n, null);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int n, TwitterAuthClient twitterAuthClient) {
        super(context, attributeSet, n);
        this.authClient = twitterAuthClient;
        this.setupButton();
        this.checkTwitterCoreAndEnable();
    }

    private void checkTwitterCoreAndEnable() {
        if (this.isInEditMode()) {
            return;
        }
        try {
            TwitterCore.getInstance();
        }
        catch (IllegalStateException illegalStateException) {
            Twitter.getLogger().e(TAG, illegalStateException.getMessage());
            this.setEnabled(false);
        }
    }

    @TargetApi(value=21)
    private void setupButton() {
        Resources resources = this.getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(R.drawable.tw__ic_logo_default), null, null, null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.tw__login_btn_drawable_padding));
        super.setText(R.string.tw__login_btn_txt);
        super.setTextColor(resources.getColor(R.color.tw__solid_white));
        super.setTextSize(0, (float)resources.getDimensionPixelSize(R.dimen.tw__login_btn_text_size));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(R.dimen.tw__login_btn_left_padding), 0, resources.getDimensionPixelSize(R.dimen.tw__login_btn_right_padding), 0);
        super.setBackgroundResource(R.drawable.tw__login_btn);
        super.setOnClickListener((View.OnClickListener)new LoginClickListener(this, null));
        super.setAllCaps(false);
    }

    public Activity getActivity() {
        if (this.getContext() instanceof Activity) {
            return (Activity)this.getContext();
        }
        if (this.isInEditMode()) {
            return null;
        }
        throw new IllegalStateException(ERROR_MSG_NO_ACTIVITY);
    }

    public Callback<TwitterSession> getCallback() {
        return this.callback;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TwitterAuthClient getTwitterAuthClient() {
        if (this.authClient != null) return this.authClient;
        Class<TwitterLoginButton> clazz = TwitterLoginButton.class;
        synchronized (TwitterLoginButton.class) {
            TwitterAuthClient twitterAuthClient;
            if (this.authClient != null) return this.authClient;
            this.authClient = twitterAuthClient = new TwitterAuthClient();
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return this.authClient;
        }
    }

    public void onActivityResult(int n, int n2, Intent intent) {
        if (n == this.getTwitterAuthClient().getRequestCode()) {
            this.getTwitterAuthClient().onActivityResult(n, n2, intent);
        }
    }

    public void setCallback(Callback<TwitterSession> callback) {
        if (callback != null) {
            this.callback = callback;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public class LoginClickListener
    implements View.OnClickListener {
        public final TwitterLoginButton this$0;

        private LoginClickListener(TwitterLoginButton twitterLoginButton) {
            this.this$0 = twitterLoginButton;
        }

        public /* synthetic */ LoginClickListener(TwitterLoginButton twitterLoginButton, 1 var2_2) {
            this(twitterLoginButton);
        }

        private void checkActivity(Activity activity) {
            if (activity == null || activity.isFinishing()) {
                CommonUtils.logOrThrowIllegalStateException(TwitterLoginButton.TAG, TwitterLoginButton.ERROR_MSG_NO_ACTIVITY);
            }
        }

        private void checkCallback(Callback callback) {
            if (callback == null) {
                CommonUtils.logOrThrowIllegalStateException(TwitterLoginButton.TAG, "Callback must not be null, did you call setCallback?");
            }
        }

        public void onClick(View view) {
            this.checkCallback(this.this$0.callback);
            this.checkActivity((Activity)this.this$0.activityRef.get());
            this.this$0.getTwitterAuthClient().authorize((Activity)this.this$0.activityRef.get(), this.this$0.callback);
            View.OnClickListener onClickListener = this.this$0.onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}

