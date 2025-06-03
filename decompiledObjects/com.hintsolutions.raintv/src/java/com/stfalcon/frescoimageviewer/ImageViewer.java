/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.net.Uri
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  androidx.annotation.StyleRes
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  com.facebook.imagepipeline.request.ImageRequestBuilder
 *  com.stfalcon.frescoimageviewer.ImageViewer$1
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer;

import android.content.DialogInterface;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.stfalcon.frescoimageviewer.ImageViewer;
import com.stfalcon.frescoimageviewer.ImageViewerView;
import com.stfalcon.frescoimageviewer.OnDismissListener;

public class ImageViewer
implements OnDismissListener,
DialogInterface.OnKeyListener {
    private static final String TAG = "ImageViewer";
    private Builder builder;
    private AlertDialog dialog;
    private ImageViewerView viewer;

    public ImageViewer(Builder builder) {
        this.builder = builder;
        this.createDialog();
    }

    public static /* synthetic */ Builder access$1300(ImageViewer imageViewer) {
        return imageViewer.builder;
    }

    private void createDialog() {
        ImageViewerView imageViewerView;
        this.viewer = imageViewerView = new ImageViewerView(this.builder.context);
        imageViewerView.setDescriptionViewId(this.builder.descriptionViewId);
        this.viewer.setCustomImageRequestBuilder(this.builder.customImageRequestBuilder);
        this.viewer.setCustomDraweeHierarchyBuilder(this.builder.customHierarchyBuilder);
        this.viewer.allowZooming(this.builder.isZoomingAllowed);
        this.viewer.allowSwipeToDismiss(this.builder.isSwipeToDismissAllowed);
        this.viewer.setOnDismissListener(this);
        this.viewer.setBackgroundColor(this.builder.backgroundColor);
        this.viewer.setOverlayView(this.builder.overlayView);
        this.viewer.setImageMargin(this.builder.imageMarginPixels);
        this.viewer.setContainerPadding(this.builder.containerPaddingPixels);
        this.viewer.setUrls(this.builder.dataSet, this.builder.startPosition);
        this.viewer.setPageChangeListener((ViewPager.OnPageChangeListener)new 1(this));
        imageViewerView = new AlertDialog.Builder(this.builder.context, this.getDialogStyle()).setView((View)this.viewer).setOnKeyListener((DialogInterface.OnKeyListener)this).create();
        this.dialog = imageViewerView;
        imageViewerView.setOnDismissListener(new DialogInterface.OnDismissListener(this){
            public final ImageViewer this$0;
            {
                this.this$0 = imageViewer;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                if (Builder.access$1500(ImageViewer.access$1300(this.this$0)) != null) {
                    Builder.access$1500(ImageViewer.access$1300(this.this$0)).onDismiss();
                }
            }
        });
    }

    public static ImageRequestBuilder createImageRequestBuilder() {
        return ImageRequestBuilder.newBuilderWithSource((Uri)Uri.parse((String)""));
    }

    @StyleRes
    private int getDialogStyle() {
        int n = this.builder.shouldStatusBarHide ? 0x1030011 : 0x1030010;
        return n;
    }

    public void close() {
        this.dialog.dismiss();
    }

    public String getUrl() {
        return this.viewer.getUrl();
    }

    @Override
    public void onDismiss() {
        this.dialog.dismiss();
    }

    public boolean onKey(DialogInterface dialogInterface, int n, KeyEvent keyEvent) {
        if (n == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            if (this.viewer.isScaled()) {
                this.viewer.resetScale();
            } else {
                dialogInterface.cancel();
            }
        }
        return true;
    }

    public void show() {
        if (!this.builder.dataSet.data.isEmpty()) {
            this.dialog.show();
        } else {
            Log.w((String)TAG, (String)"Images list cannot be empty! Viewer ignored.");
        }
    }
}

