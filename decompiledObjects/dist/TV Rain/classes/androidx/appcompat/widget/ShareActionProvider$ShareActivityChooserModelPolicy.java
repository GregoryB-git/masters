package androidx.appcompat.widget;

import android.content.Intent;

class ShareActionProvider$ShareActivityChooserModelPolicy
  implements ActivityChooserModel.OnChooseActivityListener
{
  public ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider paramShareActionProvider) {}
  
  public boolean onChooseActivity(ActivityChooserModel paramActivityChooserModel, Intent paramIntent)
  {
    ShareActionProvider localShareActionProvider = this$0;
    paramActivityChooserModel = mOnShareTargetSelectedListener;
    if (paramActivityChooserModel != null) {
      paramActivityChooserModel.onShareTargetSelected(localShareActionProvider, paramIntent);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ShareActionProvider.ShareActivityChooserModelPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */