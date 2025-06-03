package androidx.appcompat.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

class AppCompatActivity$1
  implements SavedStateRegistry.SavedStateProvider
{
  public AppCompatActivity$1(AppCompatActivity paramAppCompatActivity) {}
  
  @NonNull
  public Bundle saveState()
  {
    Bundle localBundle = new Bundle();
    this$0.getDelegate().onSaveInstanceState(localBundle);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */