/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.viewpager.widget.PagerAdapter
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.tweetui.GalleryActivity$1
 *  com.twitter.sdk.android.tweetui.GalleryActivity$2
 *  com.twitter.sdk.android.tweetui.GalleryAdapter
 *  com.twitter.sdk.android.tweetui.GalleryScribeClientImpl
 *  com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener$Callback
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.GalleryAdapter;
import com.twitter.sdk.android.tweetui.GalleryScribeClient;
import com.twitter.sdk.android.tweetui.GalleryScribeClientImpl;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class GalleryActivity
extends Activity {
    public static final String GALLERY_ITEM = "GALLERY_ITEM";
    public static final String MEDIA_ENTITY = "MEDIA_ENTITY";
    public GalleryItem galleryItem;
    public final GalleryScribeClient galleryScribeClient = new GalleryScribeClientImpl(TweetUi.getInstance());

    public GalleryItem getGalleryItem() {
        MediaEntity mediaEntity = (MediaEntity)this.getIntent().getSerializableExtra(MEDIA_ENTITY);
        if (mediaEntity != null) {
            return new GalleryItem(0, (List<MediaEntity>)Collections.singletonList((Object)mediaEntity));
        }
        return (GalleryItem)this.getIntent().getSerializableExtra(GALLERY_ITEM);
    }

    public ViewPager.OnPageChangeListener getOnPageChangeListener() {
        return new 1(this);
    }

    public SwipeToDismissTouchListener.Callback getSwipeToDismissCallback() {
        return new 2(this);
    }

    public void onBackPressed() {
        this.scribeDismissEvent();
        super.onBackPressed();
        this.overridePendingTransition(0, R.anim.tw__slide_out);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.tw__gallery_activity);
        this.galleryItem = this.getGalleryItem();
        if (bundle == null) {
            this.scribeShowEvent();
        }
        bundle = new GalleryAdapter((Context)this, this.getSwipeToDismissCallback());
        bundle.addAll(this.galleryItem.mediaEntities);
        ViewPager viewPager = (ViewPager)this.findViewById(R.id.tw__view_pager);
        viewPager.setPageMargin(this.getResources().getDimensionPixelSize(R.dimen.tw__gallery_page_margin));
        viewPager.addOnPageChangeListener(this.getOnPageChangeListener());
        viewPager.setAdapter((PagerAdapter)bundle);
        viewPager.setCurrentItem(this.galleryItem.mediaEntityIndex);
    }

    public void scribeDismissEvent() {
        this.galleryScribeClient.dismiss();
    }

    public void scribeImpressionEvent(int n) {
        Object object = (MediaEntity)this.galleryItem.mediaEntities.get(n);
        object = ScribeItem.fromMediaEntity(this.galleryItem.tweetId, object);
        this.galleryScribeClient.impression((ScribeItem)object);
    }

    public void scribeNavigateEvent() {
        this.galleryScribeClient.navigate();
    }

    public void scribeShowEvent() {
        this.galleryScribeClient.show();
    }

    public static class GalleryItem
    implements Serializable {
        public final List<MediaEntity> mediaEntities;
        public final int mediaEntityIndex;
        public final long tweetId;

        public GalleryItem(int n, List<MediaEntity> list) {
            this(0L, n, list);
        }

        public GalleryItem(long l, int n, List<MediaEntity> list) {
            this.tweetId = l;
            this.mediaEntityIndex = n;
            this.mediaEntities = list;
        }
    }
}

