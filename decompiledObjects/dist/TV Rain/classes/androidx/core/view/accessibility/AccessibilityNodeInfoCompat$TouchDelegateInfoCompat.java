package androidx.core.view.accessibility;

import android.graphics.Region;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public final class AccessibilityNodeInfoCompat$TouchDelegateInfoCompat
{
  public final AccessibilityNodeInfo.TouchDelegateInfo mInfo;
  
  public AccessibilityNodeInfoCompat$TouchDelegateInfoCompat(@NonNull AccessibilityNodeInfo.TouchDelegateInfo paramTouchDelegateInfo)
  {
    mInfo = paramTouchDelegateInfo;
  }
  
  public AccessibilityNodeInfoCompat$TouchDelegateInfoCompat(@NonNull Map<Region, View> paramMap)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      mInfo = new AccessibilityNodeInfo.TouchDelegateInfo(paramMap);
    } else {
      mInfo = null;
    }
  }
  
  @Nullable
  public Region getRegionAt(@IntRange(from=0L) int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return mInfo.getRegionAt(paramInt);
    }
    return null;
  }
  
  @IntRange(from=0L)
  public int getRegionCount()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return mInfo.getRegionCount();
    }
    return 0;
  }
  
  @Nullable
  public AccessibilityNodeInfoCompat getTargetForRegion(@NonNull Region paramRegion)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      paramRegion = mInfo.getTargetForRegion(paramRegion);
      if (paramRegion != null) {
        return AccessibilityNodeInfoCompat.wrap(paramRegion);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */