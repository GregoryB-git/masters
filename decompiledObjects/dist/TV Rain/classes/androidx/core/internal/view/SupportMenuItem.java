package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ActionProvider;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface SupportMenuItem
  extends MenuItem
{
  public static final int SHOW_AS_ACTION_ALWAYS = 2;
  public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
  public static final int SHOW_AS_ACTION_IF_ROOM = 1;
  public static final int SHOW_AS_ACTION_NEVER = 0;
  public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
  
  public abstract boolean collapseActionView();
  
  public abstract boolean expandActionView();
  
  @Nullable
  public abstract View getActionView();
  
  public abstract int getAlphabeticModifiers();
  
  @Nullable
  public abstract CharSequence getContentDescription();
  
  @Nullable
  public abstract ColorStateList getIconTintList();
  
  @Nullable
  public abstract PorterDuff.Mode getIconTintMode();
  
  public abstract int getNumericModifiers();
  
  @Nullable
  public abstract ActionProvider getSupportActionProvider();
  
  @Nullable
  public abstract CharSequence getTooltipText();
  
  public abstract boolean isActionViewExpanded();
  
  public abstract boolean requiresActionButton();
  
  public abstract boolean requiresOverflow();
  
  @NonNull
  public abstract MenuItem setActionView(int paramInt);
  
  @NonNull
  public abstract MenuItem setActionView(@Nullable View paramView);
  
  @NonNull
  public abstract MenuItem setAlphabeticShortcut(char paramChar, int paramInt);
  
  @NonNull
  public abstract SupportMenuItem setContentDescription(@Nullable CharSequence paramCharSequence);
  
  @NonNull
  public abstract MenuItem setIconTintList(@Nullable ColorStateList paramColorStateList);
  
  @NonNull
  public abstract MenuItem setIconTintMode(@Nullable PorterDuff.Mode paramMode);
  
  @NonNull
  public abstract MenuItem setNumericShortcut(char paramChar, int paramInt);
  
  @NonNull
  public abstract MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2);
  
  public abstract void setShowAsAction(int paramInt);
  
  @NonNull
  public abstract MenuItem setShowAsActionFlags(int paramInt);
  
  @NonNull
  public abstract SupportMenuItem setSupportActionProvider(@Nullable ActionProvider paramActionProvider);
  
  @NonNull
  public abstract SupportMenuItem setTooltipText(@Nullable CharSequence paramCharSequence);
}

/* Location:
 * Qualified Name:     androidx.core.internal.view.SupportMenuItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */