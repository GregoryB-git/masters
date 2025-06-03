/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 *  android.os.Environment
 *  android.text.Html
 *  android.text.method.LinkMovementMethod
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.core.content.FileProvider
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  com.hintsolutions.raintv.RainApplication
 *  com.hintsolutions.raintv.news.GalleryImageOverlayView$1
 *  com.squareup.picasso.Picasso
 *  com.squareup.picasso.Target
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  javax.inject.Inject
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.inject.Inject;

public class GalleryImageOverlayView
extends RelativeLayout {
    @BindView(value=2131296374)
    public TextView authorView;
    @Inject
    public Context context;
    @BindView(value=2131296536)
    public TextView descriptionView;
    private String imageShareUrl;
    private OnCloseClickListener onCloseClickListener;
    @BindView(value=2131297014)
    public TextView positionView;
    @BindView(value=2131297089)
    public ScrollView scrollView;
    @BindView(value=2131297090)
    public View scrollViewLimitLayout;

    public GalleryImageOverlayView(Context context) {
        super(context);
        this.init();
        RainApplication.getAppComponent().inject(this);
    }

    public GalleryImageOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init();
        RainApplication.getAppComponent().inject(this);
    }

    public GalleryImageOverlayView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init();
        RainApplication.getAppComponent().inject(this);
    }

    public static /* synthetic */ Uri access$000(GalleryImageOverlayView galleryImageOverlayView, Bitmap bitmap) {
        return galleryImageOverlayView.getLocalBitmapUri(bitmap);
    }

    private Uri getLocalBitmapUri(Bitmap bitmap) {
        try {
            File file = this.context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("share_image_");
            stringBuilder.append(System.currentTimeMillis());
            stringBuilder.append(".png");
            File file2 = new File(file, stringBuilder.toString());
            file = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, (OutputStream)file);
            file.close();
            file = this.context;
            bitmap = new StringBuilder();
            bitmap.append(this.context.getApplicationContext().getPackageName());
            bitmap.append(".fileprovider");
            bitmap = FileProvider.getUriForFile((Context)file, (String)bitmap.toString(), (File)file2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            bitmap = null;
        }
        return bitmap;
    }

    private void init() {
        ButterKnife.bind((Object)((Object)this), (View)View.inflate((Context)this.getContext(), (int)2131492990, (ViewGroup)this));
    }

    @OnClick(value={2131296482})
    public void onCloseClicked() {
        OnCloseClickListener onCloseClickListener = this.onCloseClickListener;
        if (onCloseClickListener != null) {
            onCloseClickListener.onClick();
        }
    }

    @OnClick(value={2131297121})
    public void onShareClick() {
        Picasso.get().load(this.imageShareUrl).into((Target)new 1(this));
    }

    public void scrollDescriptionToTop() {
        this.scrollView.scrollTo(0, 0);
    }

    public void setAuthor(String string2) {
        if (string2 != null && !string2.isEmpty()) {
            this.authorView.setText((CharSequence)string2);
            this.authorView.setVisibility(0);
        } else {
            this.authorView.setVisibility(8);
        }
    }

    public void setDescription(String string2) {
        if (string2 == null || string2.isEmpty()) {
            this.descriptionView.setVisibility(8);
        }
        this.descriptionView.setMovementMethod(LinkMovementMethod.getInstance());
        this.descriptionView.setText((CharSequence)Html.fromHtml((String)string2, (int)0));
    }

    public void setDescriptionHeight(int n) {
        this.scrollViewLimitLayout.getLayoutParams().height = n;
    }

    public void setImageShareUrl(String string2) {
        this.imageShareUrl = string2;
    }

    public void setOnCloseClickListener(OnCloseClickListener onCloseClickListener) {
        this.onCloseClickListener = onCloseClickListener;
    }

    public void setPosition(int n, int n2) {
        TextView textView = this.positionView;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n + 1);
        stringBuilder.append(" / ");
        stringBuilder.append(n2);
        textView.setText((CharSequence)stringBuilder.toString());
    }

    public static interface OnCloseClickListener {
        public void onClick();
    }
}

