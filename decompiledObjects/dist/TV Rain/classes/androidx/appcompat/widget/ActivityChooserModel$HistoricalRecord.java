package androidx.appcompat.widget;

import android.content.ComponentName;
import java.math.BigDecimal;
import z2;

public final class ActivityChooserModel$HistoricalRecord
{
  public final ComponentName activity;
  public final long time;
  public final float weight;
  
  public ActivityChooserModel$HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    activity = paramComponentName;
    time = paramLong;
    weight = paramFloat;
  }
  
  public ActivityChooserModel$HistoricalRecord(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (HistoricalRecord.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (HistoricalRecord)paramObject;
    ComponentName localComponentName = activity;
    if (localComponentName == null)
    {
      if (activity != null) {
        return false;
      }
    }
    else if (!localComponentName.equals(activity)) {
      return false;
    }
    if (time != time) {
      return false;
    }
    return Float.floatToIntBits(weight) == Float.floatToIntBits(weight);
  }
  
  public int hashCode()
  {
    ComponentName localComponentName = activity;
    int i;
    if (localComponentName == null) {
      i = 0;
    } else {
      i = localComponentName.hashCode();
    }
    long l = time;
    int j = (int)(l ^ l >>> 32);
    return Float.floatToIntBits(weight) + ((i + 31) * 31 + j) * 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("[", "; activity:");
    localStringBuilder.append(activity);
    localStringBuilder.append("; time:");
    localStringBuilder.append(time);
    localStringBuilder.append("; weight:");
    localStringBuilder.append(new BigDecimal(weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */