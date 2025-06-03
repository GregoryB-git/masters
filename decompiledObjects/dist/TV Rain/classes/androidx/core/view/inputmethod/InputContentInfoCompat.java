package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class InputContentInfoCompat
{
  private final InputContentInfoCompatImpl mImpl;
  
  public InputContentInfoCompat(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
  {
    if (Build.VERSION.SDK_INT >= 25) {
      mImpl = new InputContentInfoCompatApi25Impl(paramUri1, paramClipDescription, paramUri2);
    } else {
      mImpl = new InputContentInfoCompatBaseImpl(paramUri1, paramClipDescription, paramUri2);
    }
  }
  
  private InputContentInfoCompat(@NonNull InputContentInfoCompatImpl paramInputContentInfoCompatImpl)
  {
    mImpl = paramInputContentInfoCompatImpl;
  }
  
  @Nullable
  public static InputContentInfoCompat wrap(@Nullable Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if (Build.VERSION.SDK_INT < 25) {
      return null;
    }
    return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(paramObject));
  }
  
  @NonNull
  public Uri getContentUri()
  {
    return mImpl.getContentUri();
  }
  
  @NonNull
  public ClipDescription getDescription()
  {
    return mImpl.getDescription();
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mImpl.getLinkUri();
  }
  
  public void releasePermission()
  {
    mImpl.releasePermission();
  }
  
  public void requestPermission()
  {
    mImpl.requestPermission();
  }
  
  @Nullable
  public Object unwrap()
  {
    return mImpl.getInputContentInfo();
  }
  
  @RequiresApi(25)
  public static final class InputContentInfoCompatApi25Impl
    implements InputContentInfoCompat.InputContentInfoCompatImpl
  {
    @NonNull
    public final InputContentInfo mObject;
    
    public InputContentInfoCompatApi25Impl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
    {
      mObject = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
    }
    
    public InputContentInfoCompatApi25Impl(@NonNull Object paramObject)
    {
      mObject = ((InputContentInfo)paramObject);
    }
    
    @NonNull
    public Uri getContentUri()
    {
      return mObject.getContentUri();
    }
    
    @NonNull
    public ClipDescription getDescription()
    {
      return mObject.getDescription();
    }
    
    @NonNull
    public Object getInputContentInfo()
    {
      return mObject;
    }
    
    @Nullable
    public Uri getLinkUri()
    {
      return mObject.getLinkUri();
    }
    
    public void releasePermission()
    {
      mObject.releasePermission();
    }
    
    public void requestPermission()
    {
      mObject.requestPermission();
    }
  }
  
  public static final class InputContentInfoCompatBaseImpl
    implements InputContentInfoCompat.InputContentInfoCompatImpl
  {
    @NonNull
    private final Uri mContentUri;
    @NonNull
    private final ClipDescription mDescription;
    @Nullable
    private final Uri mLinkUri;
    
    public InputContentInfoCompatBaseImpl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
    {
      mContentUri = paramUri1;
      mDescription = paramClipDescription;
      mLinkUri = paramUri2;
    }
    
    @NonNull
    public Uri getContentUri()
    {
      return mContentUri;
    }
    
    @NonNull
    public ClipDescription getDescription()
    {
      return mDescription;
    }
    
    @Nullable
    public Object getInputContentInfo()
    {
      return null;
    }
    
    @Nullable
    public Uri getLinkUri()
    {
      return mLinkUri;
    }
    
    public void releasePermission() {}
    
    public void requestPermission() {}
  }
  
  public static abstract interface InputContentInfoCompatImpl
  {
    @NonNull
    public abstract Uri getContentUri();
    
    @NonNull
    public abstract ClipDescription getDescription();
    
    @Nullable
    public abstract Object getInputContentInfo();
    
    @Nullable
    public abstract Uri getLinkUri();
    
    public abstract void releasePermission();
    
    public abstract void requestPermission();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */