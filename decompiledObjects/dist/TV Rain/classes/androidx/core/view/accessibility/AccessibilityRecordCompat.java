package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

public class AccessibilityRecordCompat
{
  private final AccessibilityRecord mRecord;
  
  @Deprecated
  public AccessibilityRecordCompat(Object paramObject)
  {
    mRecord = ((AccessibilityRecord)paramObject);
  }
  
  public static int getMaxScrollX(@NonNull AccessibilityRecord paramAccessibilityRecord)
  {
    return Api15Impl.getMaxScrollX(paramAccessibilityRecord);
  }
  
  public static int getMaxScrollY(@NonNull AccessibilityRecord paramAccessibilityRecord)
  {
    return Api15Impl.getMaxScrollY(paramAccessibilityRecord);
  }
  
  @Deprecated
  public static AccessibilityRecordCompat obtain()
  {
    return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
  }
  
  @Deprecated
  public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat paramAccessibilityRecordCompat)
  {
    return new AccessibilityRecordCompat(AccessibilityRecord.obtain(mRecord));
  }
  
  public static void setMaxScrollX(@NonNull AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    Api15Impl.setMaxScrollX(paramAccessibilityRecord, paramInt);
  }
  
  public static void setMaxScrollY(@NonNull AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    Api15Impl.setMaxScrollY(paramAccessibilityRecord, paramInt);
  }
  
  public static void setSource(@NonNull AccessibilityRecord paramAccessibilityRecord, @Nullable View paramView, int paramInt)
  {
    Api16Impl.setSource(paramAccessibilityRecord, paramView, paramInt);
  }
  
  @Deprecated
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof AccessibilityRecordCompat)) {
      return false;
    }
    paramObject = (AccessibilityRecordCompat)paramObject;
    AccessibilityRecord localAccessibilityRecord = mRecord;
    if (localAccessibilityRecord == null)
    {
      if (mRecord != null) {
        bool = false;
      }
      return bool;
    }
    return localAccessibilityRecord.equals(mRecord);
  }
  
  @Deprecated
  public int getAddedCount()
  {
    return mRecord.getAddedCount();
  }
  
  @Deprecated
  public CharSequence getBeforeText()
  {
    return mRecord.getBeforeText();
  }
  
  @Deprecated
  public CharSequence getClassName()
  {
    return mRecord.getClassName();
  }
  
  @Deprecated
  public CharSequence getContentDescription()
  {
    return mRecord.getContentDescription();
  }
  
  @Deprecated
  public int getCurrentItemIndex()
  {
    return mRecord.getCurrentItemIndex();
  }
  
  @Deprecated
  public int getFromIndex()
  {
    return mRecord.getFromIndex();
  }
  
  @Deprecated
  public Object getImpl()
  {
    return mRecord;
  }
  
  @Deprecated
  public int getItemCount()
  {
    return mRecord.getItemCount();
  }
  
  @Deprecated
  public int getMaxScrollX()
  {
    return getMaxScrollX(mRecord);
  }
  
  @Deprecated
  public int getMaxScrollY()
  {
    return getMaxScrollY(mRecord);
  }
  
  @Deprecated
  public Parcelable getParcelableData()
  {
    return mRecord.getParcelableData();
  }
  
  @Deprecated
  public int getRemovedCount()
  {
    return mRecord.getRemovedCount();
  }
  
  @Deprecated
  public int getScrollX()
  {
    return mRecord.getScrollX();
  }
  
  @Deprecated
  public int getScrollY()
  {
    return mRecord.getScrollY();
  }
  
  @Deprecated
  @SuppressLint({"KotlinPropertyAccess"})
  public AccessibilityNodeInfoCompat getSource()
  {
    return AccessibilityNodeInfoCompat.wrapNonNullInstance(mRecord.getSource());
  }
  
  @Deprecated
  public List<CharSequence> getText()
  {
    return mRecord.getText();
  }
  
  @Deprecated
  public int getToIndex()
  {
    return mRecord.getToIndex();
  }
  
  @Deprecated
  public int getWindowId()
  {
    return mRecord.getWindowId();
  }
  
  @Deprecated
  public int hashCode()
  {
    AccessibilityRecord localAccessibilityRecord = mRecord;
    int i;
    if (localAccessibilityRecord == null) {
      i = 0;
    } else {
      i = localAccessibilityRecord.hashCode();
    }
    return i;
  }
  
  @Deprecated
  public boolean isChecked()
  {
    return mRecord.isChecked();
  }
  
  @Deprecated
  public boolean isEnabled()
  {
    return mRecord.isEnabled();
  }
  
  @Deprecated
  public boolean isFullScreen()
  {
    return mRecord.isFullScreen();
  }
  
  @Deprecated
  public boolean isPassword()
  {
    return mRecord.isPassword();
  }
  
  @Deprecated
  public boolean isScrollable()
  {
    return mRecord.isScrollable();
  }
  
  @Deprecated
  public void recycle()
  {
    mRecord.recycle();
  }
  
  @Deprecated
  public void setAddedCount(int paramInt)
  {
    mRecord.setAddedCount(paramInt);
  }
  
  @Deprecated
  public void setBeforeText(CharSequence paramCharSequence)
  {
    mRecord.setBeforeText(paramCharSequence);
  }
  
  @Deprecated
  public void setChecked(boolean paramBoolean)
  {
    mRecord.setChecked(paramBoolean);
  }
  
  @Deprecated
  public void setClassName(CharSequence paramCharSequence)
  {
    mRecord.setClassName(paramCharSequence);
  }
  
  @Deprecated
  public void setContentDescription(CharSequence paramCharSequence)
  {
    mRecord.setContentDescription(paramCharSequence);
  }
  
  @Deprecated
  public void setCurrentItemIndex(int paramInt)
  {
    mRecord.setCurrentItemIndex(paramInt);
  }
  
  @Deprecated
  public void setEnabled(boolean paramBoolean)
  {
    mRecord.setEnabled(paramBoolean);
  }
  
  @Deprecated
  public void setFromIndex(int paramInt)
  {
    mRecord.setFromIndex(paramInt);
  }
  
  @Deprecated
  public void setFullScreen(boolean paramBoolean)
  {
    mRecord.setFullScreen(paramBoolean);
  }
  
  @Deprecated
  public void setItemCount(int paramInt)
  {
    mRecord.setItemCount(paramInt);
  }
  
  @Deprecated
  public void setMaxScrollX(int paramInt)
  {
    setMaxScrollX(mRecord, paramInt);
  }
  
  @Deprecated
  public void setMaxScrollY(int paramInt)
  {
    setMaxScrollY(mRecord, paramInt);
  }
  
  @Deprecated
  public void setParcelableData(Parcelable paramParcelable)
  {
    mRecord.setParcelableData(paramParcelable);
  }
  
  @Deprecated
  public void setPassword(boolean paramBoolean)
  {
    mRecord.setPassword(paramBoolean);
  }
  
  @Deprecated
  public void setRemovedCount(int paramInt)
  {
    mRecord.setRemovedCount(paramInt);
  }
  
  @Deprecated
  public void setScrollX(int paramInt)
  {
    mRecord.setScrollX(paramInt);
  }
  
  @Deprecated
  public void setScrollY(int paramInt)
  {
    mRecord.setScrollY(paramInt);
  }
  
  @Deprecated
  public void setScrollable(boolean paramBoolean)
  {
    mRecord.setScrollable(paramBoolean);
  }
  
  @Deprecated
  @SuppressLint({"KotlinPropertyAccess"})
  public void setSource(View paramView)
  {
    mRecord.setSource(paramView);
  }
  
  @Deprecated
  public void setSource(View paramView, int paramInt)
  {
    setSource(mRecord, paramView, paramInt);
  }
  
  @Deprecated
  public void setToIndex(int paramInt)
  {
    mRecord.setToIndex(paramInt);
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static int getMaxScrollX(AccessibilityRecord paramAccessibilityRecord)
    {
      return paramAccessibilityRecord.getMaxScrollX();
    }
    
    @DoNotInline
    public static int getMaxScrollY(AccessibilityRecord paramAccessibilityRecord)
    {
      return paramAccessibilityRecord.getMaxScrollY();
    }
    
    @DoNotInline
    public static void setMaxScrollX(AccessibilityRecord paramAccessibilityRecord, int paramInt)
    {
      paramAccessibilityRecord.setMaxScrollX(paramInt);
    }
    
    @DoNotInline
    public static void setMaxScrollY(AccessibilityRecord paramAccessibilityRecord, int paramInt)
    {
      paramAccessibilityRecord.setMaxScrollY(paramInt);
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static void setSource(AccessibilityRecord paramAccessibilityRecord, View paramView, int paramInt)
    {
      paramAccessibilityRecord.setSource(paramView, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityRecordCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */