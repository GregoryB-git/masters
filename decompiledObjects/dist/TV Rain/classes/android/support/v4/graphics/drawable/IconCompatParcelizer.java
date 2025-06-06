package android.support.v4.graphics.drawable;

import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class IconCompatParcelizer
  extends androidx.core.graphics.drawable.IconCompatParcelizer
{
  public static IconCompat read(VersionedParcel paramVersionedParcel)
  {
    return androidx.core.graphics.drawable.IconCompatParcelizer.read(paramVersionedParcel);
  }
  
  public static void write(IconCompat paramIconCompat, VersionedParcel paramVersionedParcel)
  {
    androidx.core.graphics.drawable.IconCompatParcelizer.write(paramIconCompat, paramVersionedParcel);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.graphics.drawable.IconCompatParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */