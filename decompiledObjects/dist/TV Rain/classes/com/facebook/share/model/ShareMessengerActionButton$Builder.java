package com.facebook.share.model;

import androidx.annotation.Nullable;

public abstract class ShareMessengerActionButton$Builder<M extends ShareMessengerActionButton, B extends Builder>
  implements ShareModelBuilder<M, B>
{
  private String title;
  
  public B readFrom(M paramM)
  {
    if (paramM == null) {
      return this;
    }
    return setTitle(paramM.getTitle());
  }
  
  public B setTitle(@Nullable String paramString)
  {
    title = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerActionButton.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */