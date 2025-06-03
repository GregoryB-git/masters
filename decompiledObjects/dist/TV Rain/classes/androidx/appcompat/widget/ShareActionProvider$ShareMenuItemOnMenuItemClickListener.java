package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class ShareActionProvider$ShareMenuItemOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  public ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider paramShareActionProvider) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Object localObject = this$0;
    localObject = ActivityChooserModel.get(mContext, mShareHistoryFileName).chooseActivity(paramMenuItem.getItemId());
    if (localObject != null)
    {
      paramMenuItem = ((Intent)localObject).getAction();
      if (("android.intent.action.SEND".equals(paramMenuItem)) || ("android.intent.action.SEND_MULTIPLE".equals(paramMenuItem))) {
        this$0.updateIntent((Intent)localObject);
      }
      this$0.mContext.startActivity((Intent)localObject);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */