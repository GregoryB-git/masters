package androidx.appcompat.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;
import z2;

public final class ActivityChooserModel$ActivityResolveInfo
  implements Comparable<ActivityResolveInfo>
{
  public final ResolveInfo resolveInfo;
  public float weight;
  
  public ActivityChooserModel$ActivityResolveInfo(ResolveInfo paramResolveInfo)
  {
    resolveInfo = paramResolveInfo;
  }
  
  public int compareTo(ActivityResolveInfo paramActivityResolveInfo)
  {
    return Float.floatToIntBits(weight) - Float.floatToIntBits(weight);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (ActivityResolveInfo.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (ActivityResolveInfo)paramObject;
    return Float.floatToIntBits(weight) == Float.floatToIntBits(weight);
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(weight) + 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("[", "resolveInfo:");
    localStringBuilder.append(resolveInfo.toString());
    localStringBuilder.append("; weight:");
    localStringBuilder.append(new BigDecimal(weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */