package android.support.v4.media.session;

import androidx.annotation.NonNull;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompat.Builder;

public final class MediaControllerCompat$PlaybackInfo
{
  public static final int PLAYBACK_TYPE_LOCAL = 1;
  public static final int PLAYBACK_TYPE_REMOTE = 2;
  private final AudioAttributesCompat mAudioAttrsCompat;
  private final int mCurrentVolume;
  private final int mMaxVolume;
  private final int mPlaybackType;
  private final int mVolumeControl;
  
  public MediaControllerCompat$PlaybackInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this(paramInt1, new AudioAttributesCompat.Builder().setLegacyStreamType(paramInt2).build(), paramInt3, paramInt4, paramInt5);
  }
  
  public MediaControllerCompat$PlaybackInfo(int paramInt1, @NonNull AudioAttributesCompat paramAudioAttributesCompat, int paramInt2, int paramInt3, int paramInt4)
  {
    mPlaybackType = paramInt1;
    mAudioAttrsCompat = paramAudioAttributesCompat;
    mVolumeControl = paramInt2;
    mMaxVolume = paramInt3;
    mCurrentVolume = paramInt4;
  }
  
  @NonNull
  public AudioAttributesCompat getAudioAttributes()
  {
    return mAudioAttrsCompat;
  }
  
  @Deprecated
  public int getAudioStream()
  {
    return mAudioAttrsCompat.getLegacyStreamType();
  }
  
  public int getCurrentVolume()
  {
    return mCurrentVolume;
  }
  
  public int getMaxVolume()
  {
    return mMaxVolume;
  }
  
  public int getPlaybackType()
  {
    return mPlaybackType;
  }
  
  public int getVolumeControl()
  {
    return mVolumeControl;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.PlaybackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */