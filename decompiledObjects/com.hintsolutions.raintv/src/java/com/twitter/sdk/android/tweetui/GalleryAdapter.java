/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.viewpager.widget.PagerAdapter
 *  com.squareup.picasso.Picasso
 *  com.squareup.picasso.Target
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.GalleryImageView;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;
import java.util.ArrayList;
import java.util.List;

class GalleryAdapter
extends PagerAdapter {
    public final SwipeToDismissTouchListener.Callback callback;
    public final Context context;
    public final List<MediaEntity> items = new ArrayList();

    public GalleryAdapter(Context context, SwipeToDismissTouchListener.Callback callback) {
        this.context = context;
        this.callback = callback;
    }

    public void addAll(List<MediaEntity> list) {
        this.items.addAll(list);
        this.notifyDataSetChanged();
    }

    public void destroyItem(ViewGroup viewGroup, int n, Object object) {
        viewGroup.removeView((View)object);
    }

    public int getCount() {
        return this.items.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int n) {
        GalleryImageView galleryImageView = new GalleryImageView(this.context);
        galleryImageView.setSwipeToDismissCallback(this.callback);
        viewGroup.addView((View)galleryImageView);
        viewGroup = (MediaEntity)this.items.get(n);
        Picasso.with((Context)this.context).load(viewGroup.mediaUrlHttps).into((Target)galleryImageView);
        return galleryImageView;
    }

    public boolean isViewFromObject(View view, Object object) {
        boolean bl = view == object;
        return bl;
    }
}

