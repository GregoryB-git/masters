/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.services.audio;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.pnikosis.materialishprogress.ProgressWheel;

public class AudioActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private AudioActivity target;
    private View view7f090080;
    private View view7f0902f0;

    @UiThread
    public AudioActivity_ViewBinding(AudioActivity audioActivity) {
        this(audioActivity, audioActivity.getWindow().getDecorView());
    }

    @UiThread
    public AudioActivity_ViewBinding(AudioActivity audioActivity, View view) {
        super(audioActivity, view);
        this.target = audioActivity;
        audioActivity.mAudioLinearLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131296370, (String)"field 'mAudioLinearLayout'", LinearLayout.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297008, (String)"field 'playPauseButton' and method 'togglePlayState'");
        audioActivity.playPauseButton = (ImageView)Utils.castView((View)view2, (int)2131297008, (String)"field 'playPauseButton'", ImageView.class);
        this.view7f0902f0 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, audioActivity){
            public final AudioActivity_ViewBinding this$0;
            public final AudioActivity val$target;
            {
                this.this$0 = audioActivity_ViewBinding;
                this.val$target = audioActivity;
            }

            public void doClick(View view) {
                this.val$target.togglePlayState();
            }
        });
        audioActivity.playbackProgressLayout = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131297011, (String)"field 'playbackProgressLayout'", RelativeLayout.class);
        audioActivity.startText = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297158, (String)"field 'startText'", TextView.class);
        audioActivity.endText = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296584, (String)"field 'endText'", TextView.class);
        audioActivity.seekBar = (SeekBar)Utils.findRequiredViewAsType((View)view, (int)2131297109, (String)"field 'seekBar'", SeekBar.class);
        audioActivity.progress = (ProgressWheel)((Object)Utils.findRequiredViewAsType((View)view, (int)2131297028, (String)"field 'progress'", ProgressWheel.class));
        audioActivity.programName = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297027, (String)"field 'programName'", TextView.class);
        this.view7f090080 = view = Utils.findRequiredView((View)view, (int)2131296384, (String)"method 'backToVideo'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, audioActivity){
            public final AudioActivity_ViewBinding this$0;
            public final AudioActivity val$target;
            {
                this.this$0 = audioActivity_ViewBinding;
                this.val$target = audioActivity;
            }

            public void doClick(View view) {
                this.val$target.backToVideo();
            }
        });
    }

    @Override
    public void unbind() {
        AudioActivity audioActivity = this.target;
        if (audioActivity != null) {
            this.target = null;
            audioActivity.mAudioLinearLayout = null;
            audioActivity.playPauseButton = null;
            audioActivity.playbackProgressLayout = null;
            audioActivity.startText = null;
            audioActivity.endText = null;
            audioActivity.seekBar = null;
            audioActivity.progress = null;
            audioActivity.programName = null;
            this.view7f0902f0.setOnClickListener(null);
            this.view7f0902f0 = null;
            this.view7f090080.setOnClickListener(null);
            this.view7f090080 = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

