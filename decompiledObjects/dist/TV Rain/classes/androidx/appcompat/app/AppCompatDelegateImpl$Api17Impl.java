package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class AppCompatDelegateImpl$Api17Impl
{
  public static Context createConfigurationContext(@NonNull Context paramContext, @NonNull Configuration paramConfiguration)
  {
    return paramContext.createConfigurationContext(paramConfiguration);
  }
  
  public static void generateConfigDelta_densityDpi(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
  {
    int i = densityDpi;
    int j = densityDpi;
    if (i != j) {
      densityDpi = j;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */