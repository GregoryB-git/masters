/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.FragmentManager
 *  androidx.fragment.app.FragmentManager
 *  com.vk.sdk.api.VKError
 *  com.vk.sdk.api.model.VKPhotoArray
 *  com.vk.sdk.api.photo.VKUploadImage
 *  com.vk.sdk.dialogs.VKShareDialog
 *  com.vk.sdk.dialogs.VKShareDialogNative
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.vk.sdk.dialogs;

import android.annotation.TargetApi;
import androidx.fragment.app.FragmentManager;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.model.VKPhotoArray;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.dialogs.VKShareDialog;
import com.vk.sdk.dialogs.VKShareDialogNative;

public class VKShareDialogBuilder {
    public VKUploadImage[] attachmentImages;
    public CharSequence attachmentText;
    public VKPhotoArray existingPhotos;
    public String linkTitle;
    public String linkUrl;
    public VKShareDialogListener listener;

    public VKShareDialogBuilder setAttachmentImages(VKUploadImage[] vKUploadImageArray) {
        this.attachmentImages = vKUploadImageArray;
        return this;
    }

    public VKShareDialogBuilder setAttachmentLink(String string2, String string3) {
        this.linkTitle = string2;
        this.linkUrl = string3;
        return this;
    }

    public VKShareDialogBuilder setShareDialogListener(VKShareDialogListener vKShareDialogListener) {
        this.listener = vKShareDialogListener;
        return this;
    }

    public VKShareDialogBuilder setText(CharSequence charSequence) {
        this.attachmentText = charSequence;
        return this;
    }

    public VKShareDialogBuilder setUploadedPhotos(VKPhotoArray vKPhotoArray) {
        this.existingPhotos = vKPhotoArray;
        return this;
    }

    @TargetApi(value=11)
    public void show(android.app.FragmentManager fragmentManager, String string2) {
        new VKShareDialogNative(this).show(fragmentManager, string2);
    }

    public void show(FragmentManager fragmentManager, String string2) {
        new VKShareDialog(this).show(fragmentManager, string2);
    }

    public static interface VKShareDialogListener {
        public void onVkShareCancel();

        public void onVkShareComplete(int var1);

        public void onVkShareError(VKError var1);
    }
}

