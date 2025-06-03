/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.vk.sdk.api.VKError
 *  com.vk.sdk.api.httpClient.VKImageOperation
 *  com.vk.sdk.api.httpClient.VKImageOperation$VKImageOperationListener
 *  com.vk.sdk.dialogs.VKCaptchaDialog$5
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.R;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKImageOperation;
import com.vk.sdk.dialogs.VKCaptchaDialog;

public class VKCaptchaDialog {
    public static final boolean $assertionsDisabled = false;
    private EditText mCaptchaAnswer;
    private final VKError mCaptchaError;
    private ImageView mCaptchaImage;
    private float mDensity;
    private ProgressBar mProgressBar;

    public VKCaptchaDialog(VKError vKError) {
        this.mCaptchaError = vKError;
    }

    public static /* synthetic */ ImageView access$200(VKCaptchaDialog vKCaptchaDialog) {
        return vKCaptchaDialog.mCaptchaImage;
    }

    public static /* synthetic */ ProgressBar access$300(VKCaptchaDialog vKCaptchaDialog) {
        return vKCaptchaDialog.mProgressBar;
    }

    public static /* synthetic */ void access$400(VKCaptchaDialog vKCaptchaDialog) {
        vKCaptchaDialog.loadImage();
    }

    private void loadImage() {
        VKImageOperation vKImageOperation = new VKImageOperation(this.mCaptchaError.captchaImg);
        vKImageOperation.imageDensity = this.mDensity;
        vKImageOperation.setImageOperationListener((VKImageOperation.VKImageOperationListener)new 5(this));
        VKHttpClient.enqueueOperation((VKAbstractOperation)vKImageOperation);
    }

    private void sendAnswer() {
        VKError vKError = this.mCaptchaError;
        String string2 = this.mCaptchaAnswer.getText() != null ? this.mCaptchaAnswer.getText().toString() : "";
        vKError.answerCaptcha(string2);
    }

    public void show(@NonNull Context context, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        View view = View.inflate((Context)context, (int)R.layout.vk_captcha_dialog, null);
        this.mCaptchaAnswer = (EditText)view.findViewById(R.id.captchaAnswer);
        this.mCaptchaImage = (ImageView)view.findViewById(R.id.imageView);
        this.mProgressBar = (ProgressBar)view.findViewById(R.id.progressBar);
        this.mDensity = context.getResources().getDisplayMetrics().density;
        view = new AlertDialog.Builder(context).setView(view).create();
        this.mCaptchaAnswer.setOnFocusChangeListener(new View.OnFocusChangeListener(this, (AlertDialog)view){
            public final VKCaptchaDialog this$0;
            public final AlertDialog val$dialog;
            {
                this.this$0 = vKCaptchaDialog;
                this.val$dialog = alertDialog;
            }

            public void onFocusChange(View view, boolean bl) {
                if (bl) {
                    this.val$dialog.getWindow().setSoftInputMode(5);
                }
            }
        });
        this.mCaptchaAnswer.setOnEditorActionListener(new TextView.OnEditorActionListener(this, (AlertDialog)view){
            public final VKCaptchaDialog this$0;
            public final AlertDialog val$dialog;
            {
                this.this$0 = vKCaptchaDialog;
                this.val$dialog = alertDialog;
            }

            public boolean onEditorAction(TextView textView, int n, KeyEvent keyEvent) {
                if (n == 4) {
                    this.this$0.sendAnswer();
                    this.val$dialog.dismiss();
                    return true;
                }
                return false;
            }
        });
        view.setButton(-2, (CharSequence)context.getString(17039370), new DialogInterface.OnClickListener(this){
            public final VKCaptchaDialog this$0;
            {
                this.this$0 = vKCaptchaDialog;
            }

            public void onClick(DialogInterface dialogInterface, int n) {
                this.this$0.sendAnswer();
                dialogInterface.dismiss();
            }
        });
        view.setOnCancelListener(new DialogInterface.OnCancelListener(this, (AlertDialog)view){
            public final VKCaptchaDialog this$0;
            public final AlertDialog val$dialog;
            {
                this.this$0 = vKCaptchaDialog;
                this.val$dialog = alertDialog;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.val$dialog.dismiss();
                ((VKCaptchaDialog)this.this$0).mCaptchaError.request.cancel();
            }
        });
        if (onDismissListener != null) {
            view.setOnDismissListener(onDismissListener);
        }
        this.loadImage();
        view.show();
    }
}

