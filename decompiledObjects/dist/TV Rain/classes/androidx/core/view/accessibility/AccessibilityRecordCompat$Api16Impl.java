package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class AccessibilityRecordCompat$Api16Impl
{
  @DoNotInline
  public static void setSource(AccessibilityRecord paramAccessibilityRecord, View paramView, int paramInt)
  {
    paramAccessibilityRecord.setSource(paramView, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityRecordCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */