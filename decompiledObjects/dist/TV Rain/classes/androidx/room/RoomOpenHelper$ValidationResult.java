package androidx.room;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomOpenHelper$ValidationResult
{
  @Nullable
  public final String expectedFoundMsg;
  public final boolean isValid;
  
  public RoomOpenHelper$ValidationResult(boolean paramBoolean, @Nullable String paramString)
  {
    isValid = paramBoolean;
    expectedFoundMsg = paramString;
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomOpenHelper.ValidationResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */