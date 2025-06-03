/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  com.squareup.picasso.Picasso
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.tweetui.AbstractTweetView$1
 *  com.twitter.sdk.android.tweetui.TweetScribeClientImpl
 *  com.twitter.sdk.android.tweetui.VideoScribeClientImpl
 *  com.twitter.sdk.android.tweetui.internal.AspectRatioFrameLayout
 *  com.twitter.sdk.android.tweetui.internal.MediaBadgeView
 *  com.twitter.sdk.android.tweetui.internal.SpanClickHandler
 *  com.twitter.sdk.android.tweetui.internal.TweetMediaUtils
 *  com.twitter.sdk.android.tweetui.internal.TweetMediaView
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.util.Collections
 *  java.util.Date
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.IntentUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.Card;
import com.twitter.sdk.android.core.models.ImageValue;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.AbstractTweetView;
import com.twitter.sdk.android.tweetui.FormattedTweetText;
import com.twitter.sdk.android.tweetui.LinkClickListener;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.TweetDateUtils;
import com.twitter.sdk.android.tweetui.TweetLinkClickListener;
import com.twitter.sdk.android.tweetui.TweetMediaClickListener;
import com.twitter.sdk.android.tweetui.TweetScribeClient;
import com.twitter.sdk.android.tweetui.TweetScribeClientImpl;
import com.twitter.sdk.android.tweetui.TweetTextLinkifier;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.TweetUtils;
import com.twitter.sdk.android.tweetui.Utils;
import com.twitter.sdk.android.tweetui.VideoScribeClient;
import com.twitter.sdk.android.tweetui.VideoScribeClientImpl;
import com.twitter.sdk.android.tweetui.internal.AspectRatioFrameLayout;
import com.twitter.sdk.android.tweetui.internal.MediaBadgeView;
import com.twitter.sdk.android.tweetui.internal.SpanClickHandler;
import com.twitter.sdk.android.tweetui.internal.TweetMediaUtils;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

abstract class AbstractTweetView
extends RelativeLayout {
    public static final double DEFAULT_ASPECT_RATIO = 1.7777777777777777;
    public static final int DEFAULT_STYLE = R.style.tw__TweetLightStyle;
    public static final String EMPTY_STRING = "";
    public static final long INVALID_ID = -1L;
    public static final double MEDIA_BG_DARK_OPACITY = 0.12;
    public static final double MEDIA_BG_LIGHT_OPACITY = 0.08;
    public static final double SECONDARY_TEXT_COLOR_DARK_OPACITY = 0.35;
    public static final double SECONDARY_TEXT_COLOR_LIGHT_OPACITY = 0.4;
    public static final String TAG = "TweetUi";
    public int actionColor;
    public int actionHighlightColor;
    public TextView contentView;
    public final DependencyProvider dependencyProvider;
    public TextView fullNameView;
    private LinkClickListener linkClickListener;
    public MediaBadgeView mediaBadgeView;
    public int mediaBgColor;
    public AspectRatioFrameLayout mediaContainer;
    private Uri permalinkUri;
    public int photoErrorResId;
    public int primaryTextColor;
    public TextView screenNameView;
    public int secondaryTextColor;
    public int styleResId;
    public Tweet tweet;
    public boolean tweetActionsEnabled;
    public TweetLinkClickListener tweetLinkClickListener;
    public TweetMediaClickListener tweetMediaClickListener;
    public TweetMediaView tweetMediaView;

    public AbstractTweetView(Context context, AttributeSet attributeSet, int n, DependencyProvider dependencyProvider) {
        super(context, attributeSet, n);
        this.dependencyProvider = dependencyProvider;
        this.inflateView(context);
        this.findSubviews();
    }

    private void inflateView(Context context) {
        LayoutInflater.from((Context)context).inflate(this.getLayout(), (ViewGroup)this, true);
    }

    private void setName(Tweet tweet) {
        if (tweet != null && (tweet = tweet.user) != null) {
            this.fullNameView.setText((CharSequence)Utils.stringOrEmpty(tweet.name));
        } else {
            this.fullNameView.setText((CharSequence)EMPTY_STRING);
        }
    }

    private void setPermalinkLauncher() {
        this.setOnClickListener(new PermalinkClickListener(this));
    }

    private void setScreenName(Tweet tweet) {
        if (tweet != null && (tweet = tweet.user) != null) {
            this.screenNameView.setText(UserUtils.formatScreenName(Utils.stringOrEmpty(tweet.screenName)));
        } else {
            this.screenNameView.setText((CharSequence)EMPTY_STRING);
        }
    }

    @TargetApi(value=16)
    private void setText(Tweet tweet) {
        this.contentView.setImportantForAccessibility(2);
        tweet = Utils.charSeqOrEmpty(this.getLinkifiedText(tweet));
        SpanClickHandler.enableClicksOnSpans((TextView)this.contentView);
        if (!TextUtils.isEmpty((CharSequence)tweet)) {
            this.contentView.setText((CharSequence)tweet);
            this.contentView.setVisibility(0);
        } else {
            this.contentView.setText((CharSequence)EMPTY_STRING);
            this.contentView.setVisibility(8);
        }
    }

    public void clearTweetMedia() {
        this.mediaContainer.setVisibility(8);
    }

    public void findSubviews() {
        this.fullNameView = (TextView)this.findViewById(R.id.tw__tweet_author_full_name);
        this.screenNameView = (TextView)this.findViewById(R.id.tw__tweet_author_screen_name);
        this.mediaContainer = (AspectRatioFrameLayout)this.findViewById(R.id.tw__aspect_ratio_media_container);
        this.tweetMediaView = (TweetMediaView)this.findViewById(R.id.tweet_media_view);
        this.contentView = (TextView)this.findViewById(R.id.tw__tweet_text);
        this.mediaBadgeView = (MediaBadgeView)this.findViewById(R.id.tw__tweet_media_badge);
    }

    public double getAspectRatio(ImageValue imageValue) {
        int n;
        int n2;
        if (imageValue != null && (n2 = imageValue.width) != 0 && (n = imageValue.height) != 0) {
            return (double)n2 / (double)n;
        }
        return 1.7777777777777777;
    }

    public double getAspectRatio(MediaEntity object) {
        int n;
        int n2;
        if (object != null && (object = object.sizes) != null && (object = object.medium) != null && (n2 = object.w) != 0 && (n = object.h) != 0) {
            return (double)n2 / (double)n;
        }
        return 1.7777777777777777;
    }

    public abstract double getAspectRatioForPhotoEntity(int var1);

    public abstract int getLayout();

    public LinkClickListener getLinkClickListener() {
        if (this.linkClickListener == null) {
            this.linkClickListener = new 1(this);
        }
        return this.linkClickListener;
    }

    public CharSequence getLinkifiedText(Tweet tweet) {
        FormattedTweetText formattedTweetText = this.dependencyProvider.getTweetUi().getTweetRepository().formatTweetText(tweet);
        if (formattedTweetText == null) {
            return null;
        }
        Card card = tweet.card;
        boolean bl = card != null && VineCardUtils.isVine(card);
        boolean bl2 = TweetUtils.showQuoteTweet(tweet);
        return TweetTextLinkifier.linkifyUrls(formattedTweetText, this.getLinkClickListener(), this.actionColor, this.actionHighlightColor, bl2, bl);
    }

    public Uri getPermalinkUri() {
        return this.permalinkUri;
    }

    public Tweet getTweet() {
        return this.tweet;
    }

    public long getTweetId() {
        Tweet tweet = this.tweet;
        if (tweet == null) {
            return -1L;
        }
        return tweet.id;
    }

    public abstract String getViewTypeName();

    public boolean isTweetUiEnabled() {
        if (this.isInEditMode()) {
            return false;
        }
        try {
            this.dependencyProvider.getTweetUi();
            return true;
        }
        catch (IllegalStateException illegalStateException) {
            Twitter.getLogger().e(TAG, illegalStateException.getMessage());
            this.setEnabled(false);
            return false;
        }
    }

    public void launchPermalink() {
        Intent intent = new Intent("android.intent.action.VIEW", this.getPermalinkUri());
        if (!IntentUtils.safeStartActivity(this.getContext(), intent)) {
            Twitter.getLogger().e(TAG, "Activity cannot be found to open permalink URI");
        }
    }

    public void render() {
        Tweet tweet = TweetUtils.getDisplayTweet(this.tweet);
        this.setName(tweet);
        this.setScreenName(tweet);
        this.setTweetMedia(tweet);
        this.setText(tweet);
        this.setContentDescription(tweet);
        if (TweetUtils.isTweetResolvable(this.tweet)) {
            this.setPermalinkUri(this.tweet.user.screenName, this.getTweetId());
        } else {
            this.permalinkUri = null;
        }
        this.setPermalinkLauncher();
        this.scribeImpression();
    }

    public void scribeCardImpression(Long object, Card card) {
        object = ScribeItem.fromTweetCard(object, card);
        this.dependencyProvider.getVideoScribeClient().impression((ScribeItem)object);
    }

    public void scribeImpression() {
        if (this.tweet != null) {
            this.dependencyProvider.getTweetScribeClient().impression(this.tweet, this.getViewTypeName(), this.tweetActionsEnabled);
        }
    }

    public void scribeMediaEntityImpression(long l, MediaEntity object) {
        object = ScribeItem.fromMediaEntity(l, object);
        this.dependencyProvider.getVideoScribeClient().impression((ScribeItem)object);
    }

    public void scribePermalinkClick() {
        if (this.tweet != null) {
            this.dependencyProvider.getTweetScribeClient().click(this.tweet, this.getViewTypeName());
        }
    }

    public void setContentDescription(Tweet tweet) {
        if (!TweetUtils.isTweetResolvable(tweet)) {
            this.setContentDescription(this.getResources().getString(R.string.tw__loading_tweet));
            return;
        }
        Object object = this.dependencyProvider.getTweetUi().getTweetRepository().formatTweetText(tweet);
        String string2 = null;
        object = object != null ? ((FormattedTweetText)object).text : null;
        long l = TweetDateUtils.apiTimeToLong(tweet.createdAt);
        if (l != -1L) {
            string2 = DateFormat.getDateInstance().format(new Date(l));
        }
        this.setContentDescription(this.getResources().getString(R.string.tw__tweet_content_description, new Object[]{Utils.stringOrEmpty(tweet.user.name), Utils.stringOrEmpty((String)object), Utils.stringOrEmpty(string2)}));
    }

    public void setPermalinkUri(String string2, Long l) {
        if (l <= 0L) {
            return;
        }
        this.permalinkUri = TweetUtils.getPermalink(string2, l);
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
        this.render();
    }

    public void setTweetLinkClickListener(TweetLinkClickListener tweetLinkClickListener) {
        this.tweetLinkClickListener = tweetLinkClickListener;
    }

    public final void setTweetMedia(Tweet tweet) {
        this.clearTweetMedia();
        if (tweet == null) {
            return;
        }
        Card card = tweet.card;
        if (card != null && VineCardUtils.isVine(card)) {
            card = tweet.card;
            ImageValue imageValue = VineCardUtils.getImageValue(card);
            String string2 = VineCardUtils.getStreamUrl(card);
            if (imageValue != null && !TextUtils.isEmpty((CharSequence)string2)) {
                this.setViewsForMedia(this.getAspectRatio(imageValue));
                this.tweetMediaView.setVineCard(tweet);
                this.mediaBadgeView.setVisibility(0);
                this.mediaBadgeView.setCard(card);
                this.scribeCardImpression(tweet.id, card);
            }
        } else if (TweetMediaUtils.hasSupportedVideo((Tweet)tweet)) {
            card = TweetMediaUtils.getVideoEntity((Tweet)tweet);
            this.setViewsForMedia(this.getAspectRatio((MediaEntity)card));
            this.tweetMediaView.setTweetMediaEntities(this.tweet, Collections.singletonList((Object)card));
            this.mediaBadgeView.setVisibility(0);
            this.mediaBadgeView.setMediaEntity((MediaEntity)card);
            this.scribeMediaEntityImpression(tweet.id, (MediaEntity)card);
        } else if (TweetMediaUtils.hasPhoto((Tweet)tweet)) {
            card = TweetMediaUtils.getPhotoEntities((Tweet)tweet);
            this.setViewsForMedia(this.getAspectRatioForPhotoEntity(card.size()));
            this.tweetMediaView.setTweetMediaEntities(tweet, (List)card);
            this.mediaBadgeView.setVisibility(8);
        }
    }

    public void setTweetMediaClickListener(TweetMediaClickListener tweetMediaClickListener) {
        this.tweetMediaClickListener = tweetMediaClickListener;
        this.tweetMediaView.setTweetMediaClickListener(tweetMediaClickListener);
    }

    public void setViewsForMedia(double d) {
        this.mediaContainer.setVisibility(0);
        this.mediaContainer.setAspectRatio(d);
        this.tweetMediaView.setVisibility(0);
    }

    public static class DependencyProvider {
        public TweetScribeClient tweetScribeClient;
        public VideoScribeClient videoScribeClient;

        public Picasso getImageLoader() {
            return TweetUi.getInstance().getImageLoader();
        }

        public TweetScribeClient getTweetScribeClient() {
            if (this.tweetScribeClient == null) {
                this.tweetScribeClient = new TweetScribeClientImpl(this.getTweetUi());
            }
            return this.tweetScribeClient;
        }

        public TweetUi getTweetUi() {
            return TweetUi.getInstance();
        }

        public VideoScribeClient getVideoScribeClient() {
            if (this.videoScribeClient == null) {
                this.videoScribeClient = new VideoScribeClientImpl(this.getTweetUi());
            }
            return this.videoScribeClient;
        }
    }

    public class PermalinkClickListener
    implements View.OnClickListener {
        public final AbstractTweetView this$0;

        public PermalinkClickListener(AbstractTweetView abstractTweetView) {
            this.this$0 = abstractTweetView;
        }

        public void onClick(View view) {
            if (this.this$0.getPermalinkUri() == null) {
                return;
            }
            this.this$0.scribePermalinkClick();
            this.this$0.launchPermalink();
        }
    }
}

