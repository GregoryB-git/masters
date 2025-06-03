/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.fragment.app.DialogFragment
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.dialogs;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import com.vk.sdk.api.model.VKPhotoArray;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.dialogs.VKShareDialogBuilder;
import com.vk.sdk.dialogs.VKShareDialogDelegate;

public class VKShareDialog
extends DialogFragment
implements VKShareDialogDelegate.DialogFragmentI {
    private VKShareDialogDelegate mDelegate;

    @Deprecated
    public VKShareDialog() {
        this.mDelegate = new VKShareDialogDelegate(this);
    }

    @SuppressLint(value={"ValidFragment"})
    public VKShareDialog(VKShareDialogBuilder vKShareDialogBuilder) {
        String string;
        Object object = new VKShareDialogDelegate(this);
        this.mDelegate = object;
        ((VKShareDialogDelegate)object).setAttachmentImages(vKShareDialogBuilder.attachmentImages);
        this.mDelegate.setText(vKShareDialogBuilder.attachmentText);
        object = vKShareDialogBuilder.linkTitle;
        if (object != null && (string = vKShareDialogBuilder.linkUrl) != null) {
            this.mDelegate.setAttachmentLink((String)object, string);
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

    public VKShareDialog setAttachmentImages(VKUploadImage[] vKUploadImageArray) {
        this.mDelegate.setAttachmentImages(vKUploadImageArray);
        return this;
    }

    public VKShareDialog setAttachmentLink(String string, String string2) {
        this.mDelegate.setAttachmentLink(string, string2);
        return this;
    }

    public VKShareDialog setShareDialogListener(VKShareDialogListener vKShareDialogListener) {
        this.mDelegate.setShareDialogListener(vKShareDialogListener);
        return this;
    }

    public VKShareDialog setText(CharSequence charSequence) {
        this.mDelegate.setText(charSequence);
        return this;
    }

    public VKShareDialog setUploadedPhotos(VKPhotoArray vKPhotoArray) {
        this.mDelegate.setUploadedPhotos(vKPhotoArray);
        return this;
    }
}

