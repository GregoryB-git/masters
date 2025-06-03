/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  com.squareup.picasso.Picasso
 *  com.twitter.sdk.android.tweetui.BaseTweetView$1
 *  com.twitter.sdk.android.tweetui.ResetTweetCallback
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.IntentUtils;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.TweetBuilder;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.AbstractTweetView;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import com.twitter.sdk.android.tweetui.ColorUtils;
import com.twitter.sdk.android.tweetui.QuoteTweetView;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.ResetTweetCallback;
import com.twitter.sdk.android.tweetui.TweetActionBarView;
import com.twitter.sdk.android.tweetui.TweetDateUtils;
import com.twitter.sdk.android.tweetui.TweetLinkClickListener;
import com.twitter.sdk.android.tweetui.TweetMediaClickListener;
import com.twitter.sdk.android.tweetui.TweetUtils;
import com.twitter.sdk.android.tweetui.Utils;

public abstract class BaseTweetView
extends AbstractTweetView {
    public ColorDrawable avatarMediaBg;
    public ImageView avatarView;
    public int birdLogoResId;
    public View bottomSeparator;
    public int containerBgColor;
    public ViewGroup quoteTweetHolder;
    public QuoteTweetView quoteTweetView;
    public int retweetIconResId;
    public TextView retweetedByView;
    public TextView timestampView;
    public TweetActionBarView tweetActionBarView;
    public ImageView twitterLogoView;

    public BaseTweetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseTweetView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n, new AbstractTweetView.DependencyProvider());
        this.initXmlAttributes(context, attributeSet);
        this.applyStyles();
    }

    public BaseTweetView(Context context, Tweet tweet) {
        this(context, tweet, AbstractTweetView.DEFAULT_STYLE);
    }

    public BaseTweetView(Context context, Tweet tweet, int n) {
        this(context, tweet, n, new AbstractTweetView.DependencyProvider());
    }

    public BaseTweetView(Context context, Tweet tweet, int n, AbstractTweetView.DependencyProvider dependencyProvider) {
        super(context, null, n, dependencyProvider);
        this.initAttributes(n);
        this.applyStyles();
        if (!this.isTweetUiEnabled()) {
            return;
        }
        this.initTweetActions();
        this.setTweet(tweet);
    }

    private void initAttributes(int n) {
        this.styleResId = n;
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(n, R.styleable.tw__TweetView);
        try {
            this.setStyleAttributes(typedArray);
            return;
        }
        finally {
            typedArray.recycle();
        }
    }

    private void initTweetActions() {
        this.setTweetActionsEnabled(this.tweetActionsEnabled);
        this.tweetActionBarView.setOnActionCallback((Callback<Tweet>)new ResetTweetCallback(this, this.dependencyProvider.getTweetUi().getTweetRepository(), null));
    }

    private void initXmlAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        context = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.tw__TweetView, 0, 0);
        try {
            this.setXmlDataAttributes((TypedArray)context);
            this.setStyleAttributes((TypedArray)context);
            return;
        }
        finally {
            context.recycle();
        }
    }

    private void loadTweet() {
        1 var1_1 = new 1(this, this.getTweetId());
        this.dependencyProvider.getTweetUi().getTweetRepository().loadTweet(this.getTweetId(), (Callback<Tweet>)var1_1);
    }

    private void setStyleAttributes(TypedArray typedArray) {
        this.containerBgColor = typedArray.getColor(R.styleable.tw__TweetView_tw__container_bg_color, this.getResources().getColor(R.color.tw__tweet_light_container_bg_color));
        this.primaryTextColor = typedArray.getColor(R.styleable.tw__TweetView_tw__primary_text_color, this.getResources().getColor(R.color.tw__tweet_light_primary_text_color));
        this.actionColor = typedArray.getColor(R.styleable.tw__TweetView_tw__action_color, this.getResources().getColor(R.color.tw__tweet_action_color));
        this.actionHighlightColor = typedArray.getColor(R.styleable.tw__TweetView_tw__action_highlight_color, this.getResources().getColor(R.color.tw__tweet_action_light_highlight_color));
        this.tweetActionsEnabled = typedArray.getBoolean(R.styleable.tw__TweetView_tw__tweet_actions_enabled, false);
        boolean bl = ColorUtils.isLightColor(this.containerBgColor);
        if (bl) {
            this.photoErrorResId = R.drawable.tw__ic_tweet_photo_error_light;
            this.birdLogoResId = R.drawable.tw__ic_logo_blue;
            this.retweetIconResId = R.drawable.tw__ic_retweet_light;
        } else {
            this.photoErrorResId = R.drawable.tw__ic_tweet_photo_error_dark;
            this.birdLogoResId = R.drawable.tw__ic_logo_white;
            this.retweetIconResId = R.drawable.tw__ic_retweet_dark;
        }
        double d = bl ? 0.4 : 0.35;
        int n = -1;
        int n2 = bl ? -1 : -16777216;
        this.secondaryTextColor = ColorUtils.calculateOpacityTransform(d, n2, this.primaryTextColor);
        d = bl ? 0.08 : 0.12;
        n2 = n;
        if (bl) {
            n2 = -16777216;
        }
        this.mediaBgColor = ColorUtils.calculateOpacityTransform(d, n2, this.containerBgColor);
        this.avatarMediaBg = new ColorDrawable(this.mediaBgColor);
    }

    private void setTimestamp(Tweet object) {
        String string2;
        if (object != null && (string2 = ((Tweet)object).createdAt) != null && TweetDateUtils.isValidTimestamp(string2)) {
            long l = TweetDateUtils.apiTimeToLong(((Tweet)object).createdAt);
            object = TweetDateUtils.dotPrefix(TweetDateUtils.getRelativeTimeString(this.getResources(), System.currentTimeMillis(), l));
        } else {
            object = "";
        }
        this.timestampView.setText((CharSequence)object);
    }

    private void setXmlDataAttributes(TypedArray typedArray) {
        long l = Utils.numberOrDefault(typedArray.getString(R.styleable.tw__TweetView_tw__tweet_id), -1L);
        if (l > 0L) {
            this.setPermalinkUri(null, l);
            this.tweet = new TweetBuilder().setId(l).build();
            return;
        }
        throw new IllegalArgumentException("Invalid tw__tweet_id");
    }

    public void applyStyles() {
        this.setBackgroundColor(this.containerBgColor);
        this.fullNameView.setTextColor(this.primaryTextColor);
        this.screenNameView.setTextColor(this.secondaryTextColor);
        this.contentView.setTextColor(this.primaryTextColor);
        this.tweetMediaView.setMediaBgColor(this.mediaBgColor);
        this.tweetMediaView.setPhotoErrorResId(this.photoErrorResId);
        this.avatarView.setImageDrawable((Drawable)this.avatarMediaBg);
        this.timestampView.setTextColor(this.secondaryTextColor);
        this.twitterLogoView.setImageResource(this.birdLogoResId);
        this.retweetedByView.setTextColor(this.secondaryTextColor);
    }

    @Override
    public void findSubviews() {
        super.findSubviews();
        this.avatarView = (ImageView)this.findViewById(R.id.tw__tweet_author_avatar);
        this.timestampView = (TextView)this.findViewById(R.id.tw__tweet_timestamp);
        this.twitterLogoView = (ImageView)this.findViewById(R.id.tw__twitter_logo);
        this.retweetedByView = (TextView)this.findViewById(R.id.tw__tweet_retweeted_by);
        this.tweetActionBarView = (TweetActionBarView)this.findViewById(R.id.tw__tweet_action_bar);
        this.quoteTweetHolder = (ViewGroup)this.findViewById(R.id.quote_tweet_holder);
        this.bottomSeparator = this.findViewById(R.id.bottom_separator);
    }

    public void linkifyProfilePhotoView(Tweet tweet) {
        if (tweet != null && tweet.user != null) {
            this.avatarView.setOnClickListener(new View.OnClickListener(this, tweet){
                public final BaseTweetView this$0;
                public final Tweet val$displayTweet;
                {
                    this.this$0 = baseTweetView;
                    this.val$displayTweet = tweet;
                }

                public void onClick(View object) {
                    object = this.this$0.tweetLinkClickListener;
                    if (object != null) {
                        Tweet tweet = this.val$displayTweet;
                        object.onLinkClick(tweet, TweetUtils.getProfilePermalink(tweet.user.screenName));
                    } else {
                        object = new Intent("android.intent.action.VIEW", Uri.parse((String)TweetUtils.getProfilePermalink(this.val$displayTweet.user.screenName)));
                        if (!IntentUtils.safeStartActivity(this.this$0.getContext(), (Intent)object)) {
                            Twitter.getLogger().e("TweetUi", "Activity cannot be found to open URL");
                        }
                    }
                }
            });
            this.avatarView.setOnTouchListener(new View.OnTouchListener(this){
                public final BaseTweetView this$0;
                {
                    this.this$0 = baseTweetView;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    block3: {
                        ImageView imageView;
                        block0: {
                            block2: {
                                block1: {
                                    imageView = (ImageView)view;
                                    int n = motionEvent.getAction();
                                    if (n == 0) break block0;
                                    if (n == 1) break block1;
                                    if (n == 3) break block2;
                                    break block3;
                                }
                                view.performClick();
                            }
                            imageView.getDrawable().clearColorFilter();
                            imageView.invalidate();
                            break block3;
                        }
                        imageView.getDrawable().setColorFilter(this.this$0.getResources().getColor(R.color.tw__black_opacity_10), PorterDuff.Mode.SRC_ATOP);
                        imageView.invalidate();
                    }
                    return false;
                }
            });
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.isTweetUiEnabled()) {
            return;
        }
        this.initTweetActions();
        this.loadTweet();
    }

    @Override
    public void render() {
        super.render();
        Tweet tweet = TweetUtils.getDisplayTweet(this.tweet);
        this.setProfilePhotoView(tweet);
        this.linkifyProfilePhotoView(tweet);
        this.setTimestamp(tweet);
        this.setTweetActions(this.tweet);
        this.showRetweetedBy(this.tweet);
        this.setQuoteTweet(this.tweet);
    }

    public void setOnActionCallback(Callback<Tweet> callback) {
        this.tweetActionBarView.setOnActionCallback((Callback<Tweet>)new ResetTweetCallback(this, this.dependencyProvider.getTweetUi().getTweetRepository(), callback));
        this.tweetActionBarView.setTweet(this.tweet);
    }

    public void setProfilePhotoView(Tweet object) {
        Picasso picasso = this.dependencyProvider.getImageLoader();
        if (picasso == null) {
            return;
        }
        object = object != null && (object = ((Tweet)object).user) != null ? UserUtils.getProfileImageUrlHttps((User)object, UserUtils.AvatarSize.REASONABLY_SMALL) : null;
        picasso.load((String)object).placeholder((Drawable)this.avatarMediaBg).into(this.avatarView);
    }

    public void setQuoteTweet(Tweet tweet) {
        this.quoteTweetView = null;
        this.quoteTweetHolder.removeAllViews();
        if (tweet != null && TweetUtils.showQuoteTweet(tweet)) {
            QuoteTweetView quoteTweetView;
            this.quoteTweetView = quoteTweetView = new QuoteTweetView(this.getContext());
            quoteTweetView.setStyle(this.primaryTextColor, this.secondaryTextColor, this.actionColor, this.actionHighlightColor, this.mediaBgColor, this.photoErrorResId);
            this.quoteTweetView.setTweet(tweet.quotedStatus);
            this.quoteTweetView.setTweetLinkClickListener(this.tweetLinkClickListener);
            this.quoteTweetView.setTweetMediaClickListener(this.tweetMediaClickListener);
            this.quoteTweetHolder.setVisibility(0);
            this.quoteTweetHolder.addView((View)this.quoteTweetView);
        } else {
            this.quoteTweetHolder.setVisibility(8);
        }
    }

    public void setTweetActions(Tweet tweet) {
        this.tweetActionBarView.setTweet(tweet);
    }

    public void setTweetActionsEnabled(boolean bl) {
        this.tweetActionsEnabled = bl;
        if (bl) {
            this.tweetActionBarView.setVisibility(0);
            this.bottomSeparator.setVisibility(8);
        } else {
            this.tweetActionBarView.setVisibility(8);
            this.bottomSeparator.setVisibility(0);
        }
    }

    @Override
    public void setTweetLinkClickListener(TweetLinkClickListener tweetLinkClickListener) {
        super.setTweetLinkClickListener(tweetLinkClickListener);
        QuoteTweetView quoteTweetView = this.quoteTweetView;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetLinkClickListener(tweetLinkClickListener);
        }
    }

    @Override
    public void setTweetMediaClickListener(TweetMediaClickListener tweetMediaClickListener) {
        super.setTweetMediaClickListener(tweetMediaClickListener);
        QuoteTweetView quoteTweetView = this.quoteTweetView;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetMediaClickListener(tweetMediaClickListener);
        }
    }

    public void showRetweetedBy(Tweet tweet) {
        if (tweet != null && tweet.retweetedStatus != null) {
            this.retweetedByView.setText((CharSequence)this.getResources().getString(R.string.tw__retweeted_by_format, new Object[]{tweet.user.name}));
            this.retweetedByView.setVisibility(0);
        } else {
            this.retweetedByView.setVisibility(8);
        }
    }
}

