package com.google.android.exoplayer2;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;

public abstract interface Player$VideoComponent
{
  public abstract void addVideoListener(VideoListener paramVideoListener);
  
  public abstract void clearCameraMotionListener(CameraMotionListener paramCameraMotionListener);
  
  public abstract void clearVideoFrameMetadataListener(VideoFrameMetadataListener paramVideoFrameMetadataListener);
  
  public abstract void clearVideoSurface();
  
  public abstract void clearVideoSurface(Surface paramSurface);
  
  public abstract void clearVideoSurfaceHolder(SurfaceHolder paramSurfaceHolder);
  
  public abstract void clearVideoSurfaceView(SurfaceView paramSurfaceView);
  
  public abstract void clearVideoTextureView(TextureView paramTextureView);
  
  public abstract int getVideoScalingMode();
  
  public abstract void removeVideoListener(VideoListener paramVideoListener);
  
  public abstract void setCameraMotionListener(CameraMotionListener paramCameraMotionListener);
  
  public abstract void setVideoFrameMetadataListener(VideoFrameMetadataListener paramVideoFrameMetadataListener);
  
  public abstract void setVideoScalingMode(int paramInt);
  
  public abstract void setVideoSurface(@Nullable Surface paramSurface);
  
  public abstract void setVideoSurfaceHolder(SurfaceHolder paramSurfaceHolder);
  
  public abstract void setVideoSurfaceView(SurfaceView paramSurfaceView);
  
  public abstract void setVideoTextureView(TextureView paramTextureView);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Player.VideoComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */