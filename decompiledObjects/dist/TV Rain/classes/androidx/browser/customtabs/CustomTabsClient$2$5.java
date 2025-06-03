package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;

class CustomTabsClient$2$5
  implements Runnable
{
  public CustomTabsClient$2$5(CustomTabsClient.2 param2, int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle) {}
  
  public void run()
  {
    this$1.val$callback.onRelationshipValidationResult(val$relation, val$requestedOrigin, val$result, val$extras);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsClient.2.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */