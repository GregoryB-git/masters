package androidx.browser.browseractions;

import android.app.PendingIntent;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public class BrowserActionItem
{
  private final PendingIntent mAction;
  @DrawableRes
  private final int mIconId;
  private final String mTitle;
  
  public BrowserActionItem(@NonNull String paramString, @NonNull PendingIntent paramPendingIntent)
  {
    this(paramString, paramPendingIntent, 0);
  }
  
  public BrowserActionItem(@NonNull String paramString, @NonNull PendingIntent paramPendingIntent, @DrawableRes int paramInt)
  {
    mTitle = paramString;
    mAction = paramPendingIntent;
    mIconId = paramInt;
  }
  
  public PendingIntent getAction()
  {
    return mAction;
  }
  
  public int getIconId()
  {
    return mIconId;
  }
  
  public String getTitle()
  {
    return mTitle;
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */