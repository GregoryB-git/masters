/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.DialogInterface
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.dialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vk.sdk.dialogs.VKShareDialogBuilder;
import com.vk.sdk.dialogs.VKShareDialogDelegate;

@TargetApi(value=11)
public class VKShareDialogNative
extends DialogFragment
implements VKShareDialogDelegate.DialogFragmentI {
    private VKShareDialogDelegate mDelegate;

    public VKShareDialogNative() {
        this.mDelegate = new VKShareDialogDelegate(this);
    }

    @SuppressLint(value={"ValidFragment"})
    public VKShareDialogNative(VKShareDialogBuilder vKShareDialogBuilder) {
        String string2;
        Object object = new VKShareDialogDelegate(this);
        this.mDelegate = object;
        ((VKShareDialogDelegate)object).setAttachmentImages(vKShareDialogBuilder.attachmentImages);
        this.mDelegate.setText(vKShareDialogBuilder.attachmentText);
        object = vKShareDialogBuilder.linkTitle;
        if (object != null && (string2 = vKShareDialogBuilder.linkUrl) != null) {
            this.mDelegate.setAttachmentLink((String)object, string2);
        }
        this.mDelegate.setUploadedPhotos(vKShareDialogBuilder.existingPhotos);
        this.mDelegate.setShareDialogListener(vKShareDialogBuilder.listener);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.mDelegate.onCancel(dialogInterface);
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return this.mDelegate.onCreateDialog(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mDelegate.onSaveInstanceState(bundle);
    }

    @SuppressLint(value={"NewApi"})
    public void onStart() {
        super.onStart();
        this.mDelegate.onStart();
    }
}

