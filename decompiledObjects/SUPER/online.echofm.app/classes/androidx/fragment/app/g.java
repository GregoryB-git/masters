package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class g
{
  public Fragment b(Context paramContext, String paramString, Bundle paramBundle)
  {
    return Fragment.V(paramContext, paramString, paramBundle);
  }
  
  public abstract View e(int paramInt);
  
  public abstract boolean f();
}

/* Location:
 * Qualified Name:     androidx.fragment.app.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */