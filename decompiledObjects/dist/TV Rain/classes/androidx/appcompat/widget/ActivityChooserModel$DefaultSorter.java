package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ActivityChooserModel$DefaultSorter
  implements ActivityChooserModel.ActivitySorter
{
  private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
  private final Map<ComponentName, ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();
  
  public void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1)
  {
    paramIntent = mPackageNameToActivityMap;
    paramIntent.clear();
    int i = paramList.size();
    Object localObject1;
    Object localObject2;
    for (int j = 0; j < i; j++)
    {
      localObject1 = (ActivityChooserModel.ActivityResolveInfo)paramList.get(j);
      weight = 0.0F;
      localObject2 = resolveInfo.activityInfo;
      paramIntent.put(new ComponentName(packageName, name), localObject1);
    }
    j = paramList1.size() - 1;
    float f2;
    for (float f1 = 1.0F; j >= 0; f1 = f2)
    {
      localObject1 = (ActivityChooserModel.HistoricalRecord)paramList1.get(j);
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)paramIntent.get(activity);
      f2 = f1;
      if (localObject2 != null)
      {
        f2 = weight;
        weight = (weight * f1 + f2);
        f2 = f1 * 0.95F;
      }
      j--;
    }
    Collections.sort(paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.DefaultSorter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */