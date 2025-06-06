package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TintInfo
{
  public boolean mHasTintList;
  public boolean mHasTintMode;
  public ColorStateList mTintList;
  public PorterDuff.Mode mTintMode;
  
  public void clear()
  {
    mTintList = null;
    mHasTintList = false;
    mTintMode = null;
    mHasTintMode = false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TintInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */