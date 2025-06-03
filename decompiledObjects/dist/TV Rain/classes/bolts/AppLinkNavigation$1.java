package bolts;

import android.content.Context;

final class AppLinkNavigation$1
  implements Continuation<AppLink, AppLinkNavigation.NavigationResult>
{
  public AppLinkNavigation$1(Context paramContext) {}
  
  public AppLinkNavigation.NavigationResult then(Task<AppLink> paramTask)
    throws Exception
  {
    return AppLinkNavigation.navigate(val$context, (AppLink)paramTask.getResult());
  }
}

/* Location:
 * Qualified Name:     bolts.AppLinkNavigation.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */