/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.video;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.VideoStreamActivity;

public class VideoStreamActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private VideoStreamActivity target;

    @UiThread
    public VideoStreamActivity_ViewBinding(VideoStreamActivity videoStreamActivity) {
        this(videoStreamActivity, videoStreamActivity.getWindow().getDecorView());
    }

    @UiThread
    public VideoStreamActivity_ViewBinding(VideoStreamActivity videoStreamActivity, View view) {
        super(videoStreamActivity, view);
        this.target = videoStreamActivity;
        videoStreamActivity.videoContainer = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131297314, (String)"field 'videoContainer'", RelativeLayout.class);
        videoStreamActivity.videoView = (ExoVideoView)((Object)Utils.findRequiredViewAsType((View)view, (int)2131297313, (String)"field 'videoView'", ExoVideoView.class));
        videoStreamActivity.castLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131296434, (String)"field 'castLayout'", LinearLayout.class);
        videoStreamActivity.castLabel = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296433, (String)"field 'castLabel'", TextView.class);
        videoStreamActivity.programName = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297027, (String)"field 'programName'", TextView.class);
    }

    @Override
    public void unbind() {
        VideoStreamActivity videoStreamActivity = this.target;
        if (videoStreamActivity != null) {
            this.target = null;
            videoStreamActivity.videoContainer = null;
            videoStreamActivity.videoView = null;
            videoStreamActivity.castLayout = null;
            videoStreamActivity.castLabel = null;
            videoStreamActivity.programName = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

