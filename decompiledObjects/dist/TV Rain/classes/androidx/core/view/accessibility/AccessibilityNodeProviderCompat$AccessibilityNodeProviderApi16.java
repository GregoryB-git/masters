package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(16)
class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16
  extends AccessibilityNodeProvider
{
  public final AccessibilityNodeProviderCompat mCompat;
  
  public AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
  {
    mCompat = paramAccessibilityNodeProviderCompat;
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = mCompat.createAccessibilityNodeInfo(paramInt);
    if (localAccessibilityNodeInfoCompat == null) {
      return null;
    }
    return localAccessibilityNodeInfoCompat.unwrap();
  }
  
  public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    List localList = mCompat.findAccessibilityNodeInfosByText(paramString, paramInt);
    if (localList == null) {
      return null;
    }
    paramString = new ArrayList();
    int i = localList.size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramString.add(((AccessibilityNodeInfoCompat)localList.get(paramInt)).unwrap());
    }
    return paramString;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return mCompat.performAction(paramInt1, paramInt2, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */