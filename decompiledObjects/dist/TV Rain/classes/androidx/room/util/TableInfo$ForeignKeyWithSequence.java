package androidx.room.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TableInfo$ForeignKeyWithSequence
  implements Comparable<ForeignKeyWithSequence>
{
  public final String mFrom;
  public final int mId;
  public final int mSequence;
  public final String mTo;
  
  public TableInfo$ForeignKeyWithSequence(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    mId = paramInt1;
    mSequence = paramInt2;
    mFrom = paramString1;
    mTo = paramString2;
  }
  
  public int compareTo(@NonNull ForeignKeyWithSequence paramForeignKeyWithSequence)
  {
    int i = mId - mId;
    int j = i;
    if (i == 0) {
      j = mSequence - mSequence;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.TableInfo.ForeignKeyWithSequence
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */