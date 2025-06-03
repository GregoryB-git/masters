/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  com.twitter.sdk.android.tweetui.PlayerActivity$1
 *  com.twitter.sdk.android.tweetui.VideoScribeClientImpl
 *  com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener$Callback
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.PlayerController;
import com.twitter.sdk.android.tweetui.R;
import com.twitter.sdk.android.tweetui.TweetUi;
import com.twitter.sdk.android.tweetui.VideoScribeClient;
import com.twitter.sdk.android.tweetui.VideoScribeClientImpl;
import com.twitter.sdk.android.tweetui.internal.SwipeToDismissTouchListener;
import java.io.Serializable;

public class PlayerActivity
extends Activity {
    public static final String PLAYER_ITEM = "PLAYER_ITEM";
    public static final String SCRIBE_ITEM = "SCRIBE_ITEM";
    public static final VideoScribeClient videoScribeClient = new VideoScribeClientImpl(TweetUi.getInstance());
    public PlayerController playerController;

    private void scribeCardPlayImpression(ScribeItem scribeItem) {
        videoScribeClient.play(scribeItem);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(0, R.anim.tw__slide_out);
    }

    public void onCreate(Bundle object) {
        PlayerController playerController;
        super.onCreate(object);
        this.setContentView(R.layout.tw__player_activity);
        object = (PlayerItem)this.getIntent().getSerializableExtra(PLAYER_ITEM);
        this.playerController = playerController = new PlayerController(this.findViewById(0x1020002), (SwipeToDismissTouchListener.Callback)new 1(this));
        playerController.prepare((PlayerItem)object);
        this.scribeCardPlayImpression((ScribeItem)this.getIntent().getSerializableExtra(SCRIBE_ITEM));
    }

    public void onDestroy() {
        this.playerController.onDestroy();
        super.onDestroy();
    }

    public void onPause() {
        this.playerController.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.playerController.onResume();
    }

    public static class PlayerItem
    implements Serializable {
        public final String callToActionText;
        public final String callToActionUrl;
        public final boolean looping;
        public final boolean showVideoControls;
        public final String url;

        public PlayerItem(String string2, boolean bl, boolean bl2, String string3, String string4) {
            this.url = string2;
            this.looping = bl;
            this.showVideoControls = bl2;
            this.callToActionText = string3;
            this.callToActionUrl = string4;
        }
    }
}

