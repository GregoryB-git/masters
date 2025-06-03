package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat
{
  public static final int HOST_VIEW_ID = -1;
  @Nullable
  private final Object mProvider;
  
  public AccessibilityNodeProviderCompat()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      mProvider = new AccessibilityNodeProviderApi26(this);
    } else {
      mProvider = new AccessibilityNodeProviderApi19(this);
    }
  }
  
  public AccessibilityNodeProviderCompat(@Nullable Object paramObject)
  {
    mProvider = paramObject;
  }
  
  public void addExtraDataToAccessibilityNodeInfo(int paramInt, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, @NonNull String paramString, @Nullable Bundle paramBundle) {}
  
  @Nullable
  public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int paramInt)
  {
    return null;
  }
  
  @Nullable
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(@NonNull String paramString, int paramInt)
  {
    return null;
  }
  
  @Nullable
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    return null;
  }
  
  @Nullable
  public Object getProvider()
  {
    return mProvider;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, @Nullable Bundle paramBundle)
  {
    return false;
  }
  
  @RequiresApi(16)
  public static class AccessibilityNodeProviderApi16
    extends AccessibilityNodeProvider
  {
    public final AccessibilityNodeProviderCompat mCompat;
    
    public AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
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
  
  @RequiresApi(19)
  public static class AccessibilityNodeProviderApi19
    extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
  {
    public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
    {
      super();
    }
    
    public AccessibilityNodeInfo findFocus(int paramInt)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = mCompat.findFocus(paramInt);
      if (localAccessibilityNodeInfoCompat == null) {
        return null;
      }
      return localAccessibilityNodeInfoCompat.unwrap();
    }
  }
  
  @RequiresApi(26)
  public static class AccessibilityNodeProviderApi26
    extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19
  {
    public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
    {
      super();
    }
    
    public void addExtraDataToAccessibilityNodeInfo(int paramInt, AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString, Bundle paramBundle)
    {
      mCompat.addExtraDataToAccessibilityNodeInfo(paramInt, AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo), paramString, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */