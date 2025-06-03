package androidx.core.view.accessibility;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public abstract interface AccessibilityViewCommand
{
  public abstract boolean perform(@NonNull View paramView, @Nullable CommandArguments paramCommandArguments);
  
  public static abstract class CommandArguments
  {
    public Bundle mBundle;
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setBundle(@Nullable Bundle paramBundle)
    {
      mBundle = paramBundle;
    }
  }
  
  public static final class MoveAtGranularityArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    public boolean getExtendSelection()
    {
      return mBundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
    }
    
    public int getGranularity()
    {
      return mBundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
    }
  }
  
  public static final class MoveHtmlArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    @Nullable
    public String getHTMLElement()
    {
      return mBundle.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
    }
  }
  
  public static final class MoveWindowArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    public int getX()
    {
      return mBundle.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
    }
    
    public int getY()
    {
      return mBundle.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
    }
  }
  
  public static final class ScrollToPositionArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    public int getColumn()
    {
      return mBundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
    }
    
    public int getRow()
    {
      return mBundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
    }
  }
  
  public static final class SetProgressArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    public float getProgress()
    {
      return mBundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
    }
  }
  
  public static final class SetSelectionArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    public int getEnd()
    {
      return mBundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
    }
    
    public int getStart()
    {
      return mBundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
    }
  }
  
  public static final class SetTextArguments
    extends AccessibilityViewCommand.CommandArguments
  {
    @Nullable
    public CharSequence getText()
    {
      return mBundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityViewCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */