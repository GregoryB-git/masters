package com.facebook.drawee.interfaces;

import android.net.Uri;
import javax.annotation.Nullable;

public abstract interface SimpleDraweeControllerBuilder
{
  public abstract DraweeController build();
  
  public abstract SimpleDraweeControllerBuilder setCallerContext(Object paramObject);
  
  public abstract SimpleDraweeControllerBuilder setOldController(@Nullable DraweeController paramDraweeController);
  
  public abstract SimpleDraweeControllerBuilder setUri(Uri paramUri);
  
  public abstract SimpleDraweeControllerBuilder setUri(@Nullable String paramString);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */