/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Point
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.HorizontalScrollView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  com.vk.sdk.api.VKRequest
 *  com.vk.sdk.api.httpClient.VKImageOperation
 *  com.vk.sdk.api.httpClient.VKImageOperation$VKImageOperationListener
 *  com.vk.sdk.api.model.VKApiLink
 *  com.vk.sdk.api.model.VKApiPhoto
 *  com.vk.sdk.api.model.VKAttachments
 *  com.vk.sdk.api.model.VKPhotoArray
 *  com.vk.sdk.api.photo.VKUploadImage
 *  com.vk.sdk.api.photo.VKUploadWallPhotoRequest
 *  com.vk.sdk.dialogs.VKShareDialogDelegate$1
 *  com.vk.sdk.dialogs.VKShareDialogDelegate$2
 *  com.vk.sdk.dialogs.VKShareDialogDelegate$3
 *  com.vk.sdk.dialogs.VKShareDialogDelegate$4$1
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.vk.sdk.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.sdk.R;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKImageOperation;
import com.vk.sdk.api.model.VKApiLink;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.api.model.VKApiPhoto;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKPhotoArray;
import com.vk.sdk.api.photo.VKUploadImage;
import com.vk.sdk.api.photo.VKUploadWallPhotoRequest;
import com.vk.sdk.dialogs.VKShareDialogBuilder;
import com.vk.sdk.dialogs.VKShareDialogDelegate;
import com.vk.sdk.util.VKStringJoiner;
import com.vk.sdk.util.VKUtil;
import java.util.ArrayList;
import java.util.Collection;

class VKShareDialogDelegate {
    public static final boolean $assertionsDisabled = false;
    private static final String SHARE_IMAGES_KEY = "ShareImages";
    private static final String SHARE_LINK_KEY = "ShareLink";
    private static final int SHARE_PHOTO_CORNER_RADIUS = 3;
    private static final int SHARE_PHOTO_HEIGHT = 100;
    private static final int SHARE_PHOTO_MARGIN_LEFT = 10;
    private static final String SHARE_TEXT_KEY = "ShareText";
    private static final String SHARE_UPLOADED_IMAGES_KEY = "ShareUploadedImages";
    private final DialogFragmentI dialogFragmentI;
    private VKUploadImage[] mAttachmentImages;
    private UploadingLink mAttachmentLink;
    private CharSequence mAttachmentText;
    private VKPhotoArray mExistingPhotos;
    private VKShareDialogBuilder.VKShareDialogListener mListener;
    private LinearLayout mPhotoLayout;
    private HorizontalScrollView mPhotoScroll;
    private Button mSendButton;
    private ProgressBar mSendProgress;
    private EditText mShareTextField;
    public View.OnClickListener sendButtonPress = new View.OnClickListener(this){
        public final VKShareDialogDelegate this$0;
        {
            this.this$0 = vKShareDialogDelegate;
        }

        public void onClick(View view) {
            this.this$0.setIsLoading(true);
            if (this.this$0.mAttachmentImages != null && VKSdk.getAccessToken() != null) {
                long l2 = Long.parseLong((String)VKSdk.getAccessToken().userId);
                new VKUploadWallPhotoRequest(this.this$0.mAttachmentImages, Long.valueOf((long)l2).longValue(), 0).executeWithListener((VKRequest.VKRequestListener)new 1(this));
            } else {
                this.this$0.makePostWithAttachments(null);
            }
        }
    };

    public VKShareDialogDelegate(DialogFragmentI dialogFragmentI) {
        this.dialogFragmentI = dialogFragmentI;
    }

    public static /* synthetic */ void access$000(VKShareDialogDelegate vKShareDialogDelegate, String string2) {
        vKShareDialogDelegate.loadAndAddPhoto(string2);
    }

    public static /* synthetic */ VKShareDialogBuilder.VKShareDialogListener access$100(VKShareDialogDelegate vKShareDialogDelegate) {
        return vKShareDialogDelegate.mListener;
    }

    public static /* synthetic */ void access$200(VKShareDialogDelegate vKShareDialogDelegate, String string2, int n) {
        vKShareDialogDelegate.loadAndAddPhoto(string2, n);
    }

    public static /* synthetic */ void access$300(VKShareDialogDelegate vKShareDialogDelegate, Bitmap bitmap) {
        vKShareDialogDelegate.addBitmapToPreview(bitmap);
    }

    public static /* synthetic */ DialogFragmentI access$500(VKShareDialogDelegate vKShareDialogDelegate) {
        return vKShareDialogDelegate.dialogFragmentI;
    }

    private void addBitmapToPreview(Bitmap bitmap) {
        if (this.dialogFragmentI.getActivity() == null) {
            return;
        }
        Bitmap bitmap2 = VKUIHelper.getRoundedCornerBitmap(bitmap, 100, 3);
        if (bitmap2 == null) {
            return;
        }
        bitmap = new ImageView((Context)this.dialogFragmentI.getActivity());
        bitmap.setImageBitmap(bitmap2);
        bitmap.setAdjustViewBounds(true);
        bitmap2 = new LinearLayout.LayoutParams(-2, -2);
        int n = this.mPhotoLayout.getChildCount() > 0 ? 10 : 0;
        bitmap2.setMargins(n, 0, 0, 0);
        this.mPhotoLayout.addView((View)bitmap, (ViewGroup.LayoutParams)bitmap2);
        this.mPhotoLayout.invalidate();
        this.mPhotoScroll.invalidate();
    }

    private void loadAndAddPhoto(String string2) {
        this.loadAndAddPhoto(string2, 0);
    }

    private void loadAndAddPhoto(String string2, int n) {
        if (n > 10) {
            return;
        }
        VKImageOperation vKImageOperation = new VKImageOperation(string2);
        vKImageOperation.setImageOperationListener((VKImageOperation.VKImageOperationListener)new 2(this, string2, n));
        VKHttpClient.enqueueOperation((VKAbstractOperation)vKImageOperation);
    }

    private void makePostWithAttachments(VKAttachments object) {
        VKAttachments vKAttachments = object;
        if (object == null) {
            vKAttachments = new VKAttachments();
        }
        if ((object = this.mExistingPhotos) != null) {
            vKAttachments.addAll((Collection)object);
        }
        if (this.mAttachmentLink != null) {
            vKAttachments.add((VKApiModel)new VKApiLink(this.mAttachmentLink.linkUrl));
        }
        object = this.mShareTextField.getText().toString();
        long l2 = Long.parseLong((String)VKSdk.getAccessToken().userId);
        VKApi.wall().post(VKParameters.from("owner_id", l2, "message", object, "attachments", vKAttachments.toAttachmentsString())).executeWithListener((VKRequest.VKRequestListener)new 3(this));
    }

    private void processExistingPhotos() {
        ArrayList arrayList = new ArrayList(this.mExistingPhotos.size());
        for (VKApiPhoto vKApiPhoto : this.mExistingPhotos) {
            StringBuilder stringBuilder = z2.t("");
            stringBuilder.append(vKApiPhoto.owner_id);
            stringBuilder.append('_');
            stringBuilder.append(vKApiPhoto.id);
            arrayList.add((Object)stringBuilder.toString());
        }
        new VKRequest("photos.getById", VKParameters.from("photo_sizes", 1, "photos", VKStringJoiner.join(arrayList, ",")), VKPhotoArray.class).executeWithListener((VKRequest.VKRequestListener)new 1(this));
    }

    private void setIsLoading(boolean bl) {
        if (bl) {
            this.mSendButton.setVisibility(8);
            this.mSendProgress.setVisibility(0);
            this.mShareTextField.setEnabled(false);
            this.mPhotoLayout.setEnabled(false);
        } else {
            this.mSendButton.setVisibility(0);
            this.mSendProgress.setVisibility(8);
            this.mShareTextField.setEnabled(true);
            this.mPhotoLayout.setEnabled(true);
        }
    }

    public void onCancel(DialogInterface object) {
        object = this.mListener;
        if (object != null) {
            object.onVkShareCancel();
        }
    }

    public Dialog onCreateDialog(Bundle dialog) {
        Activity activity = this.dialogFragmentI.getActivity();
        View view = View.inflate((Context)activity, (int)R.layout.vk_share_dialog, null);
        this.mSendButton = (Button)view.findViewById(R.id.sendButton);
        this.mSendProgress = (ProgressBar)view.findViewById(R.id.sendProgress);
        this.mPhotoLayout = (LinearLayout)view.findViewById(R.id.imagesContainer);
        this.mShareTextField = (EditText)view.findViewById(R.id.shareText);
        this.mPhotoScroll = (HorizontalScrollView)view.findViewById(R.id.imagesScrollView);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.attachmentLinkLayout);
        this.mSendButton.setOnClickListener(this.sendButtonPress);
        if (dialog != null) {
            this.mShareTextField.setText((CharSequence)dialog.getString(SHARE_TEXT_KEY));
            this.mAttachmentLink = (UploadingLink)dialog.getParcelable(SHARE_LINK_KEY);
            this.mAttachmentImages = (VKUploadImage[])dialog.getParcelableArray(SHARE_IMAGES_KEY);
            this.mExistingPhotos = (VKPhotoArray)dialog.getParcelable(SHARE_UPLOADED_IMAGES_KEY);
        } else {
            dialog = this.mAttachmentText;
            if (dialog != null) {
                this.mShareTextField.setText((CharSequence)dialog);
            }
        }
        this.mPhotoLayout.removeAllViews();
        dialog = this.mAttachmentImages;
        if (dialog != null) {
            int n = ((VKUploadImage[])dialog).length;
            for (int k = 0; k < n; ++k) {
                this.addBitmapToPreview(dialog[k].mImageData);
            }
            this.mPhotoLayout.setVisibility(0);
        }
        if (this.mExistingPhotos != null) {
            this.processExistingPhotos();
        }
        if (this.mExistingPhotos == null && this.mAttachmentImages == null) {
            this.mPhotoLayout.setVisibility(8);
        }
        if (this.mAttachmentLink != null) {
            TextView textView = (TextView)linearLayout.findViewById(R.id.linkTitle);
            dialog = (TextView)linearLayout.findViewById(R.id.linkHost);
            textView.setText((CharSequence)this.mAttachmentLink.linkTitle);
            dialog.setText((CharSequence)VKUtil.getHost(this.mAttachmentLink.linkUrl));
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        dialog = new Dialog((Context)activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(view);
        dialog.setCancelable(true);
        return dialog;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString(SHARE_TEXT_KEY, this.mShareTextField.getText().toString());
        VKPhotoArray vKPhotoArray = this.mAttachmentLink;
        if (vKPhotoArray != null) {
            bundle.putParcelable(SHARE_LINK_KEY, (Parcelable)vKPhotoArray);
        }
        if ((vKPhotoArray = this.mAttachmentImages) != null) {
            bundle.putParcelableArray(SHARE_IMAGES_KEY, (Parcelable[])vKPhotoArray);
        }
        if ((vKPhotoArray = this.mExistingPhotos) != null) {
            bundle.putParcelable(SHARE_UPLOADED_IMAGES_KEY, (Parcelable)vKPhotoArray);
        }
    }

    public void onStart() {
        Display display = ((WindowManager)this.dialogFragmentI.getActivity().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int n = point.x;
        int n3 = this.dialogFragmentI.getResources().getDimensionPixelSize(R.dimen.vk_share_dialog_view_padding);
        point = new WindowManager.LayoutParams();
        point.copyFrom(this.dialogFragmentI.getDialog().getWindow().getAttributes());
        point.height = -2;
        point.width = n - n3 * 2;
        this.dialogFragmentI.getDialog().getWindow().setAttributes((WindowManager.LayoutParams)point);
    }

    public void setAttachmentImages(VKUploadImage[] vKUploadImageArray) {
        this.mAttachmentImages = vKUploadImageArray;
    }

    public void setAttachmentLink(String string2, String string3) {
        this.mAttachmentLink = new UploadingLink(string2, string3);
    }

    public void setShareDialogListener(VKShareDialogBuilder.VKShareDialogListener vKShareDialogListener) {
        this.mListener = vKShareDialogListener;
    }

    public void setText(CharSequence charSequence) {
        this.mAttachmentText = charSequence;
    }

    public void setUploadedPhotos(VKPhotoArray vKPhotoArray) {
        this.mExistingPhotos = vKPhotoArray;
    }

    public static interface DialogFragmentI {
        public void dismissAllowingStateLoss();

        public Activity getActivity();

        public Dialog getDialog();

        public Resources getResources();
    }

    public static class UploadingLink
    implements Parcelable {
        public static final Parcelable.Creator<UploadingLink> CREATOR = new Parcelable.Creator<UploadingLink>(){

            public UploadingLink createFromParcel(Parcel parcel) {
                return new UploadingLink(parcel, null);
            }

            public UploadingLink[] newArray(int n) {
                return new UploadingLink[n];
            }
        };
        public String linkTitle;
        public String linkUrl;

        private UploadingLink(Parcel parcel) {
            this.linkTitle = parcel.readString();
            this.linkUrl = parcel.readString();
        }

        public /* synthetic */ UploadingLink(Parcel parcel, 1 var2_2) {
            this(parcel);
        }

        public UploadingLink(String string2, String string3) {
            this.linkTitle = string2;
            this.linkUrl = string3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n) {
            parcel.writeString(this.linkTitle);
            parcel.writeString(this.linkUrl);
        }
    }
}

