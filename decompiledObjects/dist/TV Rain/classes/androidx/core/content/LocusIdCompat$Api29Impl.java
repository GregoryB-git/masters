package androidx.core.content;

import android.content.LocusId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class LocusIdCompat$Api29Impl
{
  @NonNull
  public static LocusId create(@NonNull String paramString)
  {
    return new LocusId(paramString);
  }
  
  @NonNull
  public static String getId(@NonNull LocusId paramLocusId)
  {
    return paramLocusId.getId();
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.LocusIdCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */