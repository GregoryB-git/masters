package androidx.appcompat.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
public class Compatibility$Api15Impl
{
  @DoNotInline
  public static void getValueForDensity(@NonNull Resources paramResources, int paramInt1, int paramInt2, @NonNull TypedValue paramTypedValue, boolean paramBoolean)
  {
    paramResources.getValueForDensity(paramInt1, paramInt2, paramTypedValue, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.resources.Compatibility.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */