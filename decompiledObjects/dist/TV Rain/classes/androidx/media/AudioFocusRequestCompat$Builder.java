package androidx.media;

import a;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

public final class AudioFocusRequestCompat$Builder
{
  private AudioAttributesCompat mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
  private Handler mFocusChangeHandler;
  private int mFocusGain;
  private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
  private boolean mPauseOnDuck;
  
  public AudioFocusRequestCompat$Builder(int paramInt)
  {
    setFocusGain(paramInt);
  }
  
  public AudioFocusRequestCompat$Builder(@NonNull AudioFocusRequestCompat paramAudioFocusRequestCompat)
  {
    if (paramAudioFocusRequestCompat != null)
    {
      mFocusGain = paramAudioFocusRequestCompat.getFocusGain();
      mOnAudioFocusChangeListener = paramAudioFocusRequestCompat.getOnAudioFocusChangeListener();
      mFocusChangeHandler = paramAudioFocusRequestCompat.getFocusChangeHandler();
      mAudioAttributesCompat = paramAudioFocusRequestCompat.getAudioAttributesCompat();
      mPauseOnDuck = paramAudioFocusRequestCompat.willPauseWhenDucked();
      return;
    }
    throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
  }
  
  private static boolean isValidFocusGain(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4);
  }
  
  public AudioFocusRequestCompat build()
  {
    if (mOnAudioFocusChangeListener != null) {
      return new AudioFocusRequestCompat(mFocusGain, mOnAudioFocusChangeListener, mFocusChangeHandler, mAudioAttributesCompat, mPauseOnDuck);
    }
    throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
  }
  
  @NonNull
  public Builder setAudioAttributes(@NonNull AudioAttributesCompat paramAudioAttributesCompat)
  {
    if (paramAudioAttributesCompat != null)
    {
      mAudioAttributesCompat = paramAudioAttributesCompat;
      return this;
    }
    throw new NullPointerException("Illegal null AudioAttributes");
  }
  
  @NonNull
  public Builder setFocusGain(int paramInt)
  {
    if (isValidFocusGain(paramInt))
    {
      mFocusGain = paramInt;
      return this;
    }
    throw new IllegalArgumentException(a.f("Illegal audio focus gain type ", paramInt));
  }
  
  @NonNull
  public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener)
  {
    return setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
  }
  
  @NonNull
  public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, @NonNull Handler paramHandler)
  {
    if (paramOnAudioFocusChangeListener != null)
    {
      if (paramHandler != null)
      {
        mOnAudioFocusChangeListener = paramOnAudioFocusChangeListener;
        mFocusChangeHandler = paramHandler;
        return this;
      }
      throw new IllegalArgumentException("Handler must not be null");
    }
    throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
  }
  
  @NonNull
  public Builder setWillPauseWhenDucked(boolean paramBoolean)
  {
    mPauseOnDuck = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioFocusRequestCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */