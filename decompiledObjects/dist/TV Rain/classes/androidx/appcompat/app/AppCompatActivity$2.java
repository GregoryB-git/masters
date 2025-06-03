package androidx.appcompat.app;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.savedstate.SavedStateRegistry;

class AppCompatActivity$2
  implements OnContextAvailableListener
{
  public AppCompatActivity$2(AppCompatActivity paramAppCompatActivity) {}
  
  public void onContextAvailable(@NonNull Context paramContext)
  {
    paramContext = this$0.getDelegate();
    paramContext.installViewFactory();
    paramContext.onCreate(this$0.getSavedStateRegistry().consumeRestoredStateForKey("androidx:appcompat"));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */