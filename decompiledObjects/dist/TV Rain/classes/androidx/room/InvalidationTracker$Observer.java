package androidx.room;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Set;

public abstract class InvalidationTracker$Observer
{
  public final String[] mTables;
  
  public InvalidationTracker$Observer(@NonNull String paramString, String... paramVarArgs)
  {
    String[] arrayOfString = (String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length + 1);
    mTables = arrayOfString;
    arrayOfString[paramVarArgs.length] = paramString;
  }
  
  public InvalidationTracker$Observer(@NonNull String[] paramArrayOfString)
  {
    mTables = ((String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
  }
  
  public boolean isRemote()
  {
    return false;
  }
  
  public abstract void onInvalidated(@NonNull Set<String> paramSet);
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker.Observer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */