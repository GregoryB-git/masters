/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.Renderer
 *  com.google.android.exoplayer2.audio.AudioCapabilities
 *  com.google.android.exoplayer2.audio.AudioProcessor
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener
 *  com.google.android.exoplayer2.audio.MediaCodecAudioRenderer
 *  com.google.android.exoplayer2.drm.DrmSessionManager
 *  com.google.android.exoplayer2.drm.FrameworkMediaCrypto
 *  com.google.android.exoplayer2.mediacodec.MediaCodecSelector
 *  com.google.android.exoplayer2.metadata.MetadataDecoderFactory
 *  com.google.android.exoplayer2.metadata.MetadataOutput
 *  com.google.android.exoplayer2.metadata.MetadataRenderer
 *  com.google.android.exoplayer2.text.TextOutput
 *  com.google.android.exoplayer2.text.TextRenderer
 *  com.google.android.exoplayer2.video.MediaCodecVideoRenderer
 *  com.google.android.exoplayer2.video.VideoRendererEventListener
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.devbrackets.android.exomedia.core.renderer;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataDecoderFactory;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;
import java.util.List;

public class RendererProvider {
    @NonNull
    public AudioRendererEventListener audioRendererEventListener;
    @NonNull
    public TextOutput captionListener;
    @NonNull
    public Context context;
    @Nullable
    public DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    public int droppedFrameNotificationAmount = 50;
    @NonNull
    public Handler handler;
    @NonNull
    public MetadataOutput metadataListener;
    public int videoJoiningTimeMs = 5000;
    @NonNull
    public VideoRendererEventListener videoRendererEventListener;

    public RendererProvider(@NonNull Context context, @NonNull Handler handler, @NonNull TextOutput textOutput, @NonNull MetadataOutput metadataOutput, @NonNull AudioRendererEventListener audioRendererEventListener, @NonNull VideoRendererEventListener videoRendererEventListener) {
        this.context = context;
        this.handler = handler;
        this.captionListener = textOutput;
        this.metadataListener = metadataOutput;
        this.audioRendererEventListener = audioRendererEventListener;
        this.videoRendererEventListener = videoRendererEventListener;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public List<Renderer> buildAudioRenderers() {
        ArrayList arrayList = new ArrayList();
        Context context = this.context;
        arrayList.add((Object)new MediaCodecAudioRenderer(context, MediaCodecSelector.DEFAULT, this.drmSessionManager, true, this.handler, this.audioRendererEventListener, AudioCapabilities.getCapabilities((Context)context), new AudioProcessor[0]));
        context = (List)ExoMedia.Data.registeredRendererClasses.get((Object)ExoMedia.RendererType.AUDIO);
        if (context == null) return arrayList;
        for (String string2 : context) {
            try {
                arrayList.add((Object)((Renderer)Class.forName((String)string2).getConstructor(new Class[]{Handler.class, AudioRendererEventListener.class}).newInstance(new Object[]{this.handler, this.audioRendererEventListener})));
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }

    @NonNull
    public List<Renderer> buildCaptionRenderers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new TextRenderer(this.captionListener, this.handler.getLooper()));
        return arrayList;
    }

    @NonNull
    public List<Renderer> buildMetadataRenderers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new MetadataRenderer(this.metadataListener, this.handler.getLooper(), MetadataDecoderFactory.DEFAULT));
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public List<Renderer> buildVideoRenderers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)new MediaCodecVideoRenderer(this.context, MediaCodecSelector.DEFAULT, (long)this.videoJoiningTimeMs, this.drmSessionManager, false, this.handler, this.videoRendererEventListener, this.droppedFrameNotificationAmount));
        List list = (List)ExoMedia.Data.registeredRendererClasses.get((Object)ExoMedia.RendererType.VIDEO);
        if (list == null) return arrayList;
        for (String string2 : list) {
            try {
                arrayList.add((Object)((Renderer)Class.forName((String)string2).getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, this.videoJoiningTimeMs, this.handler, this.videoRendererEventListener, this.droppedFrameNotificationAmount})));
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }

    @NonNull
    public List<Renderer> generate() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.buildAudioRenderers());
        arrayList.addAll(this.buildVideoRenderers());
        arrayList.addAll(this.buildCaptionRenderers());
        arrayList.addAll(this.buildMetadataRenderers());
        return arrayList;
    }

    public void setDrmSessionManager(@Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager) {
        this.drmSessionManager = drmSessionManager;
    }

    public void setDroppedFrameNotificationAmount(int n) {
        this.droppedFrameNotificationAmount = n;
    }

    public void setVideoJoiningTimeMs(int n) {
        this.videoJoiningTimeMs = n;
    }
}

