package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

public abstract interface b
  extends MenuItem
{
  public abstract MenuItem setAlphabeticShortcut(char paramChar, int paramInt);
  
  public abstract b setContentDescription(CharSequence paramCharSequence);
  
  public abstract MenuItem setIconTintList(ColorStateList paramColorStateList);
  
  public abstract MenuItem setIconTintMode(PorterDuff.Mode paramMode);
  
  public abstract MenuItem setNumericShortcut(char paramChar, int paramInt);
  
  public abstract b setTooltipText(CharSequence paramCharSequence);
}

/* Location:
 * Qualified Name:     C.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */