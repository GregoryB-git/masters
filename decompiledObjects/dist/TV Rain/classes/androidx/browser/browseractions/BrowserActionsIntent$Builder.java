package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

public final class BrowserActionsIntent$Builder
{
  private Context mContext;
  private final Intent mIntent = new Intent("androidx.browser.browseractions.browser_action_open");
  private ArrayList<Bundle> mMenuItems = null;
  private PendingIntent mOnItemSelectedPendingIntent = null;
  private int mType;
  private Uri mUri;
  
  public BrowserActionsIntent$Builder(Context paramContext, Uri paramUri)
  {
    mContext = paramContext;
    mUri = paramUri;
    mType = 0;
    mMenuItems = new ArrayList();
  }
  
  private Bundle getBundleFromItem(BrowserActionItem paramBrowserActionItem)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("androidx.browser.browseractions.TITLE", paramBrowserActionItem.getTitle());
    localBundle.putParcelable("androidx.browser.browseractions.ACTION", paramBrowserActionItem.getAction());
    if (paramBrowserActionItem.getIconId() != 0) {
      localBundle.putInt("androidx.browser.browseractions.ICON_ID", paramBrowserActionItem.getIconId());
    }
    return localBundle;
  }
  
  public BrowserActionsIntent build()
  {
    mIntent.setData(mUri);
    mIntent.putExtra("androidx.browser.browseractions.extra.TYPE", mType);
    mIntent.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", mMenuItems);
    PendingIntent localPendingIntent = PendingIntent.getActivity(mContext, 0, new Intent(), 0);
    mIntent.putExtra("androidx.browser.browseractions.APP_ID", localPendingIntent);
    localPendingIntent = mOnItemSelectedPendingIntent;
    if (localPendingIntent != null) {
      mIntent.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", localPendingIntent);
    }
    return new BrowserActionsIntent(mIntent);
  }
  
  public Builder setCustomItems(ArrayList<BrowserActionItem> paramArrayList)
  {
    if (paramArrayList.size() <= 5)
    {
      int i = 0;
      while (i < paramArrayList.size()) {
        if ((!TextUtils.isEmpty(((BrowserActionItem)paramArrayList.get(i)).getTitle())) && (((BrowserActionItem)paramArrayList.get(i)).getAction() != null))
        {
          mMenuItems.add(getBundleFromItem((BrowserActionItem)paramArrayList.get(i)));
          i++;
        }
        else
        {
          throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
        }
      }
      return this;
    }
    throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
  }
  
  public Builder setCustomItems(BrowserActionItem... paramVarArgs)
  {
    return setCustomItems(new ArrayList(Arrays.asList(paramVarArgs)));
  }
  
  public Builder setOnItemSelectedAction(PendingIntent paramPendingIntent)
  {
    mOnItemSelectedPendingIntent = paramPendingIntent;
    return this;
  }
  
  public Builder setUrlType(int paramInt)
  {
    mType = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsIntent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */