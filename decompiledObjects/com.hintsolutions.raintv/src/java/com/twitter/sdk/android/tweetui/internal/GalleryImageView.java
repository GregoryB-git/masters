/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ProgressBar
 *  com.squareup.picasso.Picasso$LoadedFrom
 *  com.squareup.picasso.Target
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.twitter.sdk.android.tweetui.internal.MultiTouchImageView;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;

public class GalleryImageView
extends FrameLayout
implements Target {
    public final MultiTouchImageView imageView;
    public final ProgressBar progressBar;

    public GalleryImageView(Context context) {
        this(context, new MultiTouchImageView(context), new ProgressBar(context));
    }

    public GalleryImageView(Context context, MultiTouchImageView multiTouchImageView, ProgressBar progressBar) {
        super(context);
        this.imageView = multiTouchImageView;
        this.progressBar = progressBar;
        progressBar.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2, 17));
        this.addView((View)progressBar);
        multiTouchImageView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1, 17));
        this.addView((View)multiTouchImageView);
    }

    public void onBitmapFailed(Drawable drawable2) {
    }

    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.imageView.setImageBitmap(bitmap);
        this.progressBar.setVisibility(8);
    }

    public void onPrepareLoad(Drawable drawable2) {
        this.imageView.setImageResource(17170445);
        this.progressBar.setVisibility(0);
    }

    public void setSwipeToDismissCallback(SwipeToDismissTouchListener.Callback object) {
        object = SwipeToDismissTouchListener.createFromView((View)this.imageView, (SwipeToDismissTouchListener.Callback)object);
        this.imageView.setOnTouchListener((View.OnTouchListener)object);
    }
}

