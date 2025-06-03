package androidx.core.content;

import android.content.LocusId;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import z2;

public final class LocusIdCompat
{
  private final String mId;
  private final LocusId mWrapped;
  
  public LocusIdCompat(@NonNull String paramString)
  {
    mId = ((String)Preconditions.checkStringNotEmpty(paramString, "id cannot be empty"));
    if (Build.VERSION.SDK_INT >= 29) {
      mWrapped = Api29Impl.create(paramString);
    } else {
      mWrapped = null;
    }
  }
  
  @NonNull
  private String getSanitizedId()
  {
    int i = mId.length();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i);
    localStringBuilder.append("_chars");
    return localStringBuilder.toString();
  }
  
  @NonNull
  @RequiresApi(29)
  public static LocusIdCompat toLocusIdCompat(@NonNull LocusId paramLocusId)
  {
    Preconditions.checkNotNull(paramLocusId, "locusId cannot be null");
    return new LocusIdCompat((String)Preconditions.checkStringNotEmpty(Api29Impl.getId(paramLocusId), "id cannot be empty"));
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (LocusIdCompat.class != paramObject.getClass()) {
      return false;
    }
    LocusIdCompat localLocusIdCompat = (LocusIdCompat)paramObject;
    paramObject = mId;
    if (paramObject == null)
    {
      if (mId != null) {
        bool = false;
      }
      return bool;
    }
    return ((String)paramObject).equals(mId);
  }
  
  @NonNull
  public String getId()
  {
    return mId;
  }
  
  public int hashCode()
  {
    String str = mId;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return 31 + i;
  }
  
  @NonNull
  @RequiresApi(29)
  public LocusId toLocusId()
  {
    return mWrapped;
  }
  
  @NonNull
  public String toString()
  {
    return z2.s(z2.t("LocusIdCompat["), getSanitizedId(), "]");
  }
  
  @RequiresApi(29)
  public static class Api29Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.content.LocusIdCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */