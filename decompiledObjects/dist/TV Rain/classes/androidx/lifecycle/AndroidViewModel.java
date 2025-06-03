package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.NonNull;

public class AndroidViewModel
  extends ViewModel
{
  @SuppressLint({"StaticFieldLeak"})
  private Application mApplication;
  
  public AndroidViewModel(@NonNull Application paramApplication)
  {
    mApplication = paramApplication;
  }
  
  @NonNull
  public <T extends Application> T getApplication()
  {
    return mApplication;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.AndroidViewModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */