/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.RectF
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  com.squareup.picasso.Callback
 *  com.squareup.picasso.Picasso
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.IntentUtils;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.ImageValue;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.TweetMediaClickListener;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.internal.OverlayImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaUtils;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class TweetMediaView
extends ViewGroup
implements View.OnClickListener {
    public static final int MAX_IMAGE_VIEW_COUNT = 4;
    public static final String SIZED_IMAGE_SMALL = ":small";
    public final DependencyProvider dependencyProvider;
    private int imageCount;
    private final OverlayImageView[] imageViews = new OverlayImageView[4];
    public boolean internalRoundedCornersEnabled;
    public int mediaBgColor = -16777216;
    private final int mediaDividerSize;
    private List<MediaEntity> mediaEntities = Collections.emptyList();
    private final Path path = new Path();
    public int photoErrorResId;
    public final float[] radii;
    private final RectF rect = new RectF();
    public Tweet tweet;
    public TweetMediaClickListener tweetMediaClickListener;

    public TweetMediaView(Context context) {
        this(context, null);
    }

    public TweetMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new DependencyProvider());
    }

    public TweetMediaView(Context context, AttributeSet attributeSet, DependencyProvider dependencyProvider) {
        super(context, attributeSet);
        this.radii = new float[8];
        this.dependencyProvider = dependencyProvider;
        this.mediaDividerSize = this.getResources().getDimensionPixelSize(R.dimen.tw__media_view_divider_size);
        this.photoErrorResId = R.drawable.tw__ic_tweet_photo_error_dark;
    }

    public void clearImageViews() {
        for (int k = 0; k < this.imageCount; ++k) {
            OverlayImageView overlayImageView = this.imageViews[k];
            if (overlayImageView == null) continue;
            overlayImageView.setVisibility(8);
        }
        this.imageCount = 0;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.internalRoundedCornersEnabled) {
            int n = canvas.save();
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(n);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public OverlayImageView getOrCreateImageView(int n) {
        OverlayImageView overlayImageView = this.imageViews[n];
        if (overlayImageView == null) {
            overlayImageView = new OverlayImageView(this.getContext());
            overlayImageView.setLayoutParams(this.generateDefaultLayoutParams());
            overlayImageView.setOnClickListener(this);
            this.imageViews[n] = overlayImageView;
            this.addView((View)overlayImageView, n);
        } else {
            this.measureImageView(n, 0, 0);
            this.layoutImage(n, 0, 0, 0, 0);
        }
        overlayImageView.setVisibility(0);
        overlayImageView.setBackgroundColor(this.mediaBgColor);
        overlayImageView.setTag(R.id.tw__entity_index, n);
        return overlayImageView;
    }

    public String getSizedImagePath(MediaEntity mediaEntity) {
        if (this.imageCount > 1) {
            return z2.s(new StringBuilder(), mediaEntity.mediaUrlHttps, SIZED_IMAGE_SMALL);
        }
        return mediaEntity.mediaUrlHttps;
    }

    public void initializeImageViews(Card object) {
        this.imageCount = 1;
        OverlayImageView overlayImageView = this.getOrCreateImageView(0);
        object = VineCardUtils.getImageValue((Card)object);
        this.setAltText(overlayImageView, ((ImageValue)object).alt);
        this.setMediaImage(overlayImageView, ((ImageValue)object).url);
        this.setOverlayImage(overlayImageView, true);
    }

    public void initializeImageViews(List<MediaEntity> list) {
        this.imageCount = Math.min((int)4, (int)list.size());
        for (int k = 0; k < this.imageCount; ++k) {
            OverlayImageView overlayImageView = this.getOrCreateImageView(k);
            MediaEntity mediaEntity = (MediaEntity)list.get(k);
            this.setAltText(overlayImageView, mediaEntity.altText);
            this.setMediaImage(overlayImageView, this.getSizedImagePath(mediaEntity));
            this.setOverlayImage(overlayImageView, TweetMediaUtils.isVideoType(mediaEntity));
        }
    }

    public void launchPhotoGallery(int n) {
        Intent intent = new Intent(this.getContext(), GalleryActivity.class);
        intent.putExtra("GALLERY_ITEM", (Serializable)new GalleryActivity.GalleryItem(this.tweet.id, n, this.mediaEntities));
        IntentUtils.safeStartActivity(this.getContext(), intent);
    }

    public void launchVideoPlayer(MediaEntity mediaEntity) {
        if (TweetMediaUtils.getSupportedVariant(mediaEntity) != null) {
            Intent intent = new Intent(this.getContext(), PlayerActivity.class);
            boolean bl = TweetMediaUtils.isLooping(mediaEntity);
            boolean bl2 = TweetMediaUtils.showVideoControls(mediaEntity);
            intent.putExtra("PLAYER_ITEM", (Serializable)new PlayerActivity.PlayerItem(TweetMediaUtils.getSupportedVariant((MediaEntity)mediaEntity).url, bl, bl2, null, null));
            IntentUtils.safeStartActivity(this.getContext(), intent);
        }
    }

    public void launchVideoPlayer(Tweet tweet) {
        Card card = tweet.card;
        Intent intent = new Intent(this.getContext(), PlayerActivity.class);
        intent.putExtra("PLAYER_ITEM", (Serializable)new PlayerActivity.PlayerItem(VineCardUtils.getStreamUrl(card), true, false, null, null));
        intent.putExtra("SCRIBE_ITEM", (Serializable)ScribeItem.fromTweetCard(tweet.id, card));
        IntentUtils.safeStartActivity(this.getContext(), intent);
    }

    public void layoutImage(int n, int n3, int n4, int n5, int n6) {
        OverlayImageView overlayImageView = this.imageViews[n];
        if (overlayImageView.getLeft() == n3 && overlayImageView.getTop() == n4 && overlayImageView.getRight() == n5 && overlayImageView.getBottom() == n6) {
            return;
        }
        overlayImageView.layout(n3, n4, n5, n6);
    }

    public void layoutImages() {
        int n = this.getMeasuredWidth();
        int n3 = this.getMeasuredHeight();
        int n4 = this.mediaDividerSize;
        int n5 = (n - n4) / 2;
        int n6 = (n3 - n4) / 2;
        n4 = n5 + n4;
        int n7 = this.imageCount;
        if (n7 != 1) {
            if (n7 != 2) {
                if (n7 != 3) {
                    if (n7 == 4) {
                        this.layoutImage(0, 0, 0, n5, n6);
                        this.layoutImage(2, 0, n6 + this.mediaDividerSize, n5, n3);
                        this.layoutImage(1, n4, 0, n, n6);
                        this.layoutImage(3, n4, n6 + this.mediaDividerSize, n, n3);
                    }
                } else {
                    this.layoutImage(0, 0, 0, n5, n3);
                    this.layoutImage(1, n4, 0, n, n6);
                    this.layoutImage(2, n4, n6 + this.mediaDividerSize, n, n3);
                }
            } else {
                this.layoutImage(0, 0, 0, n5, n3);
                this.layoutImage(1, n5 + this.mediaDividerSize, 0, n, n3);
            }
        } else {
            this.layoutImage(0, 0, 0, n, n3);
        }
    }

    public void measureImageView(int n, int n3, int n4) {
        this.imageViews[n].measure(View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n4, (int)0x40000000));
    }

    public Size measureImages(int n, int n3) {
        n = View.MeasureSpec.getSize((int)n);
        int n4 = View.MeasureSpec.getSize((int)n3);
        int n5 = this.mediaDividerSize;
        n3 = (n - n5) / 2;
        n5 = (n4 - n5) / 2;
        int n6 = this.imageCount;
        if (n6 != 1) {
            if (n6 != 2) {
                if (n6 != 3) {
                    if (n6 == 4) {
                        this.measureImageView(0, n3, n5);
                        this.measureImageView(1, n3, n5);
                        this.measureImageView(2, n3, n5);
                        this.measureImageView(3, n3, n5);
                    }
                } else {
                    this.measureImageView(0, n3, n4);
                    this.measureImageView(1, n3, n5);
                    this.measureImageView(2, n3, n5);
                }
            } else {
                this.measureImageView(0, n3, n4);
                this.measureImageView(1, n3, n4);
            }
        } else {
            this.measureImageView(0, n, n4);
        }
        return Size.fromSize(n, n4);
    }

    public void onClick(View object) {
        object = (Integer)object.getTag(R.id.tw__entity_index);
        if (this.tweetMediaClickListener != null) {
            object = !this.mediaEntities.isEmpty() ? (MediaEntity)this.mediaEntities.get(object.intValue()) : null;
            this.tweetMediaClickListener.onMediaEntityClick(this.tweet, (MediaEntity)object);
        } else if (!this.mediaEntities.isEmpty()) {
            MediaEntity mediaEntity = (MediaEntity)this.mediaEntities.get(object.intValue());
            if (TweetMediaUtils.isVideoType(mediaEntity)) {
                this.launchVideoPlayer(mediaEntity);
            } else if (TweetMediaUtils.isPhotoType(mediaEntity)) {
                this.launchPhotoGallery(object.intValue());
            }
        } else {
            this.launchVideoPlayer(this.tweet);
        }
    }

    public void onLayout(boolean bl, int n, int n3, int n4, int n5) {
        if (this.imageCount > 0) {
            this.layoutImages();
        }
    }

    public void onMeasure(int n, int n3) {
        Size size = this.imageCount > 0 ? this.measureImages(n, n3) : Size.EMPTY;
        this.setMeasuredDimension(size.width, size.height);
    }

    public void onSizeChanged(int n, int n3, int n4, int n5) {
        super.onSizeChanged(n, n3, n4, n5);
        this.path.reset();
        this.rect.set(0.0f, 0.0f, (float)n, (float)n3);
        this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
        this.path.close();
    }

    public void setAltText(ImageView imageView, String string2) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            imageView.setContentDescription((CharSequence)string2);
        } else {
            imageView.setContentDescription((CharSequence)this.getResources().getString(R.string.tw__tweet_media));
        }
    }

    public void setMediaBgColor(int n) {
        this.mediaBgColor = n;
    }

    public void setMediaImage(ImageView imageView, String string2) {
        Picasso picasso = this.dependencyProvider.getImageLoader();
        if (picasso == null) {
            return;
        }
        picasso.load(string2).fit().centerCrop().error(this.photoErrorResId).into(imageView, (Callback)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void setOverlayImage(OverlayImageView overlayImageView, boolean bl) {
        if (bl) {
            overlayImageView.setOverlayDrawable(this.getContext().getResources().getDrawable(R.drawable.tw__player_overlay));
        } else {
            overlayImageView.setOverlayDrawable(null);
        }
    }

    public void setPhotoErrorResId(int n) {
        this.photoErrorResId = n;
    }

    public void setRoundedCornersRadii(int n, int n3, int n4, int n5) {
        float f2;
        float[] fArray = this.radii;
        fArray[0] = f2 = (float)n;
        fArray[1] = f2;
        fArray[2] = f2 = (float)n3;
        fArray[3] = f2;
        fArray[4] = f2 = (float)n4;
        fArray[5] = f2;
        fArray[6] = f2 = (float)n5;
        fArray[7] = f2;
        this.requestLayout();
    }

    public void setTweetMediaClickListener(TweetMediaClickListener tweetMediaClickListener) {
        this.tweetMediaClickListener = tweetMediaClickListener;
    }

    public void setTweetMediaEntities(Tweet tweet, List<MediaEntity> list) {
        if (tweet != null && list != null && !list.isEmpty() && !list.equals(this.mediaEntities)) {
            this.tweet = tweet;
            this.mediaEntities = list;
            this.clearImageViews();
            this.initializeImageViews(list);
            this.internalRoundedCornersEnabled = TweetMediaUtils.isPhotoType((MediaEntity)list.get(0));
            this.requestLayout();
        }
    }

    public void setVineCard(Tweet tweet) {
        Card card;
        if (tweet != null && (card = tweet.card) != null && VineCardUtils.isVine(card)) {
            this.tweet = tweet;
            this.mediaEntities = Collections.emptyList();
            this.clearImageViews();
            this.initializeImageViews(tweet.card);
            this.internalRoundedCornersEnabled = false;
            this.requestLayout();
        }
    }

    public static class DependencyProvider {
        public Picasso getImageLoader() {
            return TweetUi.getInstance().getImageLoader();
        }
    }

    public static class Size {
        public static final Size EMPTY = new Size();
        public final int height;
        public final int width;

        private Size() {
            this(0, 0);
        }

        private Size(int n, int n3) {
            this.width = n;
            this.height = n3;
        }

        public static Size fromSize(int n, int n3) {
            n = Math.max((int)n, (int)0);
            n3 = Math.max((int)n3, (int)0);
            Size size = n == 0 && n3 == 0 ? EMPTY : new Size(n, n3);
            return size;
        }
    }
}

