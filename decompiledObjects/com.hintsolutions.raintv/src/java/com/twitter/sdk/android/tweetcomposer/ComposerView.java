/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  com.squareup.picasso.Picasso
 *  com.twitter.sdk.android.core.models.User
 *  com.twitter.sdk.android.tweetcomposer.ComposerView$5
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetcomposer.ComposerController;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.R;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import java.util.Locale;

public class ComposerView
extends LinearLayout {
    public ImageView avatarView;
    public ComposerController.ComposerCallbacks callbacks;
    public TextView charCountView;
    public ImageView closeView;
    public View divider;
    private Picasso imageLoader;
    public ImageView imageView;
    public ColorDrawable mediaBg;
    public ObservableScrollView scrollView;
    public Button tweetButton;
    public EditText tweetEditView;

    public ComposerView(Context context) {
        this(context, null);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(context);
    }

    private void init(Context context) {
        this.imageLoader = Picasso.with((Context)this.getContext());
        this.mediaBg = new ColorDrawable(context.getResources().getColor(R.color.tw__composer_light_gray));
        View.inflate((Context)context, (int)R.layout.tw__composer_view, (ViewGroup)this);
    }

    public void findSubviews() {
        this.avatarView = (ImageView)this.findViewById(R.id.tw__author_avatar);
        this.closeView = (ImageView)this.findViewById(R.id.tw__composer_close);
        this.tweetEditView = (EditText)this.findViewById(R.id.tw__edit_tweet);
        this.charCountView = (TextView)this.findViewById(R.id.tw__char_count);
        this.tweetButton = (Button)this.findViewById(R.id.tw__post_tweet);
        this.scrollView = (ObservableScrollView)this.findViewById(R.id.tw__composer_scroll_view);
        this.divider = this.findViewById(R.id.tw__composer_profile_divider);
        this.imageView = (ImageView)this.findViewById(R.id.tw__image_view);
    }

    public String getTweetText() {
        return this.tweetEditView.getText().toString();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.findSubviews();
        this.closeView.setOnClickListener(new View.OnClickListener(this){
            public final ComposerView this$0;
            {
                this.this$0 = composerView;
            }

            public void onClick(View view) {
                this.this$0.callbacks.onCloseClick();
            }
        });
        this.tweetButton.setOnClickListener(new View.OnClickListener(this){
            public final ComposerView this$0;
            {
                this.this$0 = composerView;
            }

            public void onClick(View object) {
                object = this.this$0;
                ((ComposerView)((Object)object)).callbacks.onTweetPost(((ComposerView)((Object)object)).getTweetText());
            }
        });
        this.tweetEditView.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
            public final ComposerView this$0;
            {
                this.this$0 = composerView;
            }

            public boolean onEditorAction(TextView object, int n, KeyEvent keyEvent) {
                object = this.this$0;
                ((ComposerView)((Object)object)).callbacks.onTweetPost(((ComposerView)((Object)object)).getTweetText());
                return true;
            }
        });
        this.tweetEditView.addTextChangedListener(new TextWatcher(this){
            public final ComposerView this$0;
            {
                this.this$0 = composerView;
            }

            public void afterTextChanged(Editable object) {
                object = this.this$0;
                ((ComposerView)((Object)object)).callbacks.onTextChanged(((ComposerView)((Object)object)).getTweetText());
            }

            public void beforeTextChanged(CharSequence charSequence, int n, int n2, int n3) {
            }

            public void onTextChanged(CharSequence charSequence, int n, int n2, int n3) {
            }
        });
        this.scrollView.setScrollViewListener((ObservableScrollView.ScrollViewListener)new 5(this));
    }

    public void postTweetEnabled(boolean bl) {
        this.tweetButton.setEnabled(bl);
    }

    public void setCallbacks(ComposerController.ComposerCallbacks composerCallbacks) {
        this.callbacks = composerCallbacks;
    }

    public void setCharCount(int n) {
        this.charCountView.setText((CharSequence)String.format((Locale)Locale.getDefault(), (String)"%d", (Object[])new Object[]{n}));
    }

    public void setCharCountTextStyle(int n) {
        this.charCountView.setTextAppearance(this.getContext(), n);
    }

    public void setImageView(Uri uri) {
        if (this.imageLoader != null) {
            this.imageView.setVisibility(0);
            this.imageLoader.load(uri).into(this.imageView);
        }
    }

    public void setProfilePhotoView(User user) {
        String string2 = UserUtils.getProfileImageUrlHttps(user, UserUtils.AvatarSize.REASONABLY_SMALL);
        user = this.imageLoader;
        if (user != null) {
            user.load(string2).placeholder((Drawable)this.mediaBg).into(this.avatarView);
        }
    }

    public void setTweetText(String string2) {
        this.tweetEditView.setText((CharSequence)string2);
    }
}

