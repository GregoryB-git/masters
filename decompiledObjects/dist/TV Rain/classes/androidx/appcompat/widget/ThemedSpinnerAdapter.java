package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;

public abstract interface ThemedSpinnerAdapter
  extends SpinnerAdapter
{
  @Nullable
  public abstract Resources.Theme getDropDownViewTheme();
  
  public abstract void setDropDownViewTheme(@Nullable Resources.Theme paramTheme);
  
  public static final class Helper
  {
    private final Context mContext;
    private LayoutInflater mDropDownInflater;
    private final LayoutInflater mInflater;
    
    public Helper(@NonNull Context paramContext)
    {
      mContext = paramContext;
      mInflater = LayoutInflater.from(paramContext);
    }
    
    @NonNull
    public LayoutInflater getDropDownViewInflater()
    {
      LayoutInflater localLayoutInflater = mDropDownInflater;
      if (localLayoutInflater == null) {
        localLayoutInflater = mInflater;
      }
      return localLayoutInflater;
    }
    
    @Nullable
    public Resources.Theme getDropDownViewTheme()
    {
      Object localObject = mDropDownInflater;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((LayoutInflater)localObject).getContext().getTheme();
      }
      return (Resources.Theme)localObject;
    }
    
    public void setDropDownViewTheme(@Nullable Resources.Theme paramTheme)
    {
      if (paramTheme == null) {
        mDropDownInflater = null;
      } else if (paramTheme == mContext.getTheme()) {
        mDropDownInflater = mInflater;
      } else {
        mDropDownInflater = LayoutInflater.from(new ContextThemeWrapper(mContext, paramTheme));
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ThemedSpinnerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */