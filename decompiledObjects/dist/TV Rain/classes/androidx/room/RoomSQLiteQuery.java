package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.TreeMap;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomSQLiteQuery
  implements SupportSQLiteQuery, SupportSQLiteProgram
{
  private static final int BLOB = 5;
  @VisibleForTesting
  public static final int DESIRED_POOL_SIZE = 10;
  private static final int DOUBLE = 3;
  private static final int LONG = 2;
  private static final int NULL = 1;
  @VisibleForTesting
  public static final int POOL_LIMIT = 15;
  private static final int STRING = 4;
  @VisibleForTesting
  public static final TreeMap<Integer, RoomSQLiteQuery> sQueryPool = new TreeMap();
  @VisibleForTesting
  public int mArgCount;
  private final int[] mBindingTypes;
  @VisibleForTesting
  public final byte[][] mBlobBindings;
  @VisibleForTesting
  public final int mCapacity;
  @VisibleForTesting
  public final double[] mDoubleBindings;
  @VisibleForTesting
  public final long[] mLongBindings;
  private volatile String mQuery;
  @VisibleForTesting
  public final String[] mStringBindings;
  
  private RoomSQLiteQuery(int paramInt)
  {
    mCapacity = paramInt;
    paramInt++;
    mBindingTypes = new int[paramInt];
    mLongBindings = new long[paramInt];
    mDoubleBindings = new double[paramInt];
    mStringBindings = new String[paramInt];
    mBlobBindings = new byte[paramInt][];
  }
  
  public static RoomSQLiteQuery acquire(String paramString, int paramInt)
  {
    synchronized (sQueryPool)
    {
      Object localObject2 = ((TreeMap)???).ceilingEntry(Integer.valueOf(paramInt));
      if (localObject2 != null)
      {
        ((TreeMap)???).remove(((Map.Entry)localObject2).getKey());
        localObject2 = (RoomSQLiteQuery)((Map.Entry)localObject2).getValue();
        ((RoomSQLiteQuery)localObject2).init(paramString, paramInt);
        return (RoomSQLiteQuery)localObject2;
      }
      ??? = new RoomSQLiteQuery(paramInt);
      ((RoomSQLiteQuery)???).init(paramString, paramInt);
      return (RoomSQLiteQuery)???;
    }
  }
  
  public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = acquire(paramSupportSQLiteQuery.getSql(), paramSupportSQLiteQuery.getArgCount());
    paramSupportSQLiteQuery.bindTo(new SupportSQLiteProgram()
    {
      public void bindBlob(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        val$query.bindBlob(paramAnonymousInt, paramAnonymousArrayOfByte);
      }
      
      public void bindDouble(int paramAnonymousInt, double paramAnonymousDouble)
      {
        val$query.bindDouble(paramAnonymousInt, paramAnonymousDouble);
      }
      
      public void bindLong(int paramAnonymousInt, long paramAnonymousLong)
      {
        val$query.bindLong(paramAnonymousInt, paramAnonymousLong);
      }
      
      public void bindNull(int paramAnonymousInt)
      {
        val$query.bindNull(paramAnonymousInt);
      }
      
      public void bindString(int paramAnonymousInt, String paramAnonymousString)
      {
        val$query.bindString(paramAnonymousInt, paramAnonymousString);
      }
      
      public void clearBindings()
      {
        val$query.clearBindings();
      }
      
      public void close() {}
    });
    return localRoomSQLiteQuery;
  }
  
  private static void prunePoolLocked()
  {
    Object localObject = sQueryPool;
    if (((TreeMap)localObject).size() > 15)
    {
      int i = ((TreeMap)localObject).size() - 10;
      localObject = ((TreeMap)localObject).descendingKeySet().iterator();
      while (i > 0)
      {
        ((Iterator)localObject).next();
        ((Iterator)localObject).remove();
        i--;
      }
    }
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    mBindingTypes[paramInt] = 5;
    mBlobBindings[paramInt] = paramArrayOfByte;
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    mBindingTypes[paramInt] = 3;
    mDoubleBindings[paramInt] = paramDouble;
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    mBindingTypes[paramInt] = 2;
    mLongBindings[paramInt] = paramLong;
  }
  
  public void bindNull(int paramInt)
  {
    mBindingTypes[paramInt] = 1;
  }
  
  public void bindString(int paramInt, String paramString)
  {
    mBindingTypes[paramInt] = 4;
    mStringBindings[paramInt] = paramString;
  }
  
  public void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram)
  {
    for (int i = 1; i <= mArgCount; i++)
    {
      int j = mBindingTypes[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j == 5) {
                paramSupportSQLiteProgram.bindBlob(i, mBlobBindings[i]);
              }
            }
            else {
              paramSupportSQLiteProgram.bindString(i, mStringBindings[i]);
            }
          }
          else {
            paramSupportSQLiteProgram.bindDouble(i, mDoubleBindings[i]);
          }
        }
        else {
          paramSupportSQLiteProgram.bindLong(i, mLongBindings[i]);
        }
      }
      else {
        paramSupportSQLiteProgram.bindNull(i);
      }
    }
  }
  
  public void clearBindings()
  {
    Arrays.fill(mBindingTypes, 1);
    Arrays.fill(mStringBindings, null);
    Arrays.fill(mBlobBindings, null);
    mQuery = null;
  }
  
  public void close() {}
  
  public void copyArgumentsFrom(RoomSQLiteQuery paramRoomSQLiteQuery)
  {
    int i = paramRoomSQLiteQuery.getArgCount() + 1;
    System.arraycopy(mBindingTypes, 0, mBindingTypes, 0, i);
    System.arraycopy(mLongBindings, 0, mLongBindings, 0, i);
    System.arraycopy(mStringBindings, 0, mStringBindings, 0, i);
    System.arraycopy(mBlobBindings, 0, mBlobBindings, 0, i);
    System.arraycopy(mDoubleBindings, 0, mDoubleBindings, 0, i);
  }
  
  public int getArgCount()
  {
    return mArgCount;
  }
  
  public String getSql()
  {
    return mQuery;
  }
  
  public void init(String paramString, int paramInt)
  {
    mQuery = paramString;
    mArgCount = paramInt;
  }
  
  public void release()
  {
    synchronized (sQueryPool)
    {
      ???.put(Integer.valueOf(mCapacity), this);
      prunePoolLocked();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomSQLiteQuery
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */