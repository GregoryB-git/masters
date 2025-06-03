package androidx.media;

import a;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;

public class AudioFocusRequestCompat
{
  public static final AudioAttributesCompat FOCUS_DEFAULT_ATTR = new AudioAttributesCompat.Builder().setUsage(1).build();
  private final AudioAttributesCompat mAudioAttributesCompat;
  private final Handler mFocusChangeHandler;
  private final int mFocusGain;
  private final Object mFrameworkAudioFocusRequest;
  private final AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
  private final boolean mPauseOnDuck;
  
  public AudioFocusRequestCompat(int paramInt, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler, AudioAttributesCompat paramAudioAttributesCompat, boolean paramBoolean)
  {
    mFocusGain = paramInt;
    mFocusChangeHandler = paramHandler;
    mAudioAttributesCompat = paramAudioAttributesCompat;
    mPauseOnDuck = paramBoolean;
    int i = Build.VERSION.SDK_INT;
    if ((i < 26) && (paramHandler.getLooper() != Looper.getMainLooper())) {
      mOnAudioFocusChangeListener = new OnAudioFocusChangeListenerHandlerCompat(paramOnAudioFocusChangeListener, paramHandler);
    } else {
      mOnAudioFocusChangeListener = paramOnAudioFocusChangeListener;
    }
    if (i >= 26) {
      mFrameworkAudioFocusRequest = Api26Impl.createInstance(paramInt, getAudioAttributes(), paramBoolean, mOnAudioFocusChangeListener, paramHandler);
    } else {
      mFrameworkAudioFocusRequest = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AudioFocusRequestCompat)) {
      return false;
    }
    paramObject = (AudioFocusRequestCompat)paramObject;
    if ((mFocusGain != mFocusGain) || (mPauseOnDuck != mPauseOnDuck) || (!ObjectsCompat.equals(mOnAudioFocusChangeListener, mOnAudioFocusChangeListener)) || (!ObjectsCompat.equals(mFocusChangeHandler, mFocusChangeHandler)) || (!ObjectsCompat.equals(mAudioAttributesCompat, mAudioAttributesCompat))) {
      bool = false;
    }
    return bool;
  }
  
  @RequiresApi(21)
  public AudioAttributes getAudioAttributes()
  {
    Object localObject = mAudioAttributesCompat;
    if (localObject != null) {
      localObject = (AudioAttributes)((AudioAttributesCompat)localObject).unwrap();
    } else {
      localObject = null;
    }
    return (AudioAttributes)localObject;
  }
  
  @NonNull
  public AudioAttributesCompat getAudioAttributesCompat()
  {
    return mAudioAttributesCompat;
  }
  
  @RequiresApi(26)
  public AudioFocusRequest getAudioFocusRequest()
  {
    return (AudioFocusRequest)mFrameworkAudioFocusRequest;
  }
  
  @NonNull
  public Handler getFocusChangeHandler()
  {
    return mFocusChangeHandler;
  }
  
  public int getFocusGain()
  {
    return mFocusGain;
  }
  
  @NonNull
  public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener()
  {
    return mOnAudioFocusChangeListener;
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { Integer.valueOf(mFocusGain), mOnAudioFocusChangeListener, mFocusChangeHandler, mAudioAttributesCompat, Boolean.valueOf(mPauseOnDuck) });
  }
  
  public boolean willPauseWhenDucked()
  {
    return mPauseOnDuck;
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static AudioFocusRequest createInstance(int paramInt, AudioAttributes paramAudioAttributes, boolean paramBoolean, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
    {
      return new AudioFocusRequest.Builder(paramInt).setAudioAttributes(paramAudioAttributes).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, paramHandler).build();
    }
  }
  
  public static final class Builder
  {
    private AudioAttributesCompat mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
    private Handler mFocusChangeHandler;
    private int mFocusGain;
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private boolean mPauseOnDuck;
    
    public Builder(int paramInt)
    {
      setFocusGain(paramInt);
    }
    
    public Builder(@NonNull AudioFocusRequestCompat paramAudioFocusRequestCompat)
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
  
  public static class OnAudioFocusChangeListenerHandlerCompat
    implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
  {
    private static final int FOCUS_CHANGE = 2782386;
    private final Handler mHandler;
    private final AudioManager.OnAudioFocusChangeListener mListener;
    
    public OnAudioFocusChangeListenerHandlerCompat(@NonNull AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, @NonNull Handler paramHandler)
    {
      mListener = paramOnAudioFocusChangeListener;
      mHandler = new Handler(paramHandler.getLooper(), this);
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      if (what == 2782386)
      {
        mListener.onAudioFocusChange(arg1);
        return true;
      }
      return false;
    }
    
    public void onAudioFocusChange(int paramInt)
    {
      Handler localHandler = mHandler;
      localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioFocusRequestCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */