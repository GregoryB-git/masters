package androidx.appcompat.app;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

@Deprecated
public abstract class ActionBar$Tab
{
  public static final int INVALID_POSITION = -1;
  
  public abstract CharSequence getContentDescription();
  
  public abstract View getCustomView();
  
  public abstract Drawable getIcon();
  
  public abstract int getPosition();
  
  public abstract Object getTag();
  
  public abstract CharSequence getText();
  
  public abstract void select();
  
  public abstract Tab setContentDescription(@StringRes int paramInt);
  
  public abstract Tab setContentDescription(CharSequence paramCharSequence);
  
  public abstract Tab setCustomView(int paramInt);
  
  public abstract Tab setCustomView(View paramView);
  
  public abstract Tab setIcon(@DrawableRes int paramInt);
  
  public abstract Tab setIcon(Drawable paramDrawable);
  
  public abstract Tab setTabListener(ActionBar.TabListener paramTabListener);
  
  public abstract Tab setTag(Object paramObject);
  
  public abstract Tab setText(int paramInt);
  
  public abstract Tab setText(CharSequence paramCharSequence);
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBar.Tab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */