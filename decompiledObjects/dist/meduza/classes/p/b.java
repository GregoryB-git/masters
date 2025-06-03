package p;

import android.net.Uri;
import android.os.Bundle;

public class b
{
  public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
  public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
  public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
  public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
  public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
  public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
  public static final int NAVIGATION_ABORTED = 4;
  public static final int NAVIGATION_FAILED = 3;
  public static final int NAVIGATION_FINISHED = 2;
  public static final int NAVIGATION_STARTED = 1;
  public static final String ONLINE_EXTRAS_KEY = "online";
  public static final int TAB_HIDDEN = 6;
  public static final int TAB_SHOWN = 5;
  
  public void extraCallback(String paramString, Bundle paramBundle) {}
  
  public Bundle extraCallbackWithResult(String paramString, Bundle paramBundle)
  {
    return null;
  }
  
  public void onActivityLayout(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Bundle paramBundle) {}
  
  public void onActivityResized(int paramInt1, int paramInt2, Bundle paramBundle) {}
  
  public void onMessageChannelReady(Bundle paramBundle) {}
  
  public void onMinimized(Bundle paramBundle) {}
  
  public void onNavigationEvent(int paramInt, Bundle paramBundle) {}
  
  public void onPostMessage(String paramString, Bundle paramBundle) {}
  
  public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle) {}
  
  public void onUnminimized(Bundle paramBundle) {}
  
  public void onWarmupCompleted(Bundle paramBundle) {}
}

/* Location:
 * Qualified Name:     p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */