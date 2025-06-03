package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

public abstract interface MenuProvider
{
  public abstract void onCreateMenu(@NonNull Menu paramMenu, @NonNull MenuInflater paramMenuInflater);
  
  public void onMenuClosed(@NonNull Menu paramMenu) {}
  
  public abstract boolean onMenuItemSelected(@NonNull MenuItem paramMenuItem);
  
  public void onPrepareMenu(@NonNull Menu paramMenu) {}
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */