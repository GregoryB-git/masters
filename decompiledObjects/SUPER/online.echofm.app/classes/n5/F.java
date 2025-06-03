package n5;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class F
{
  public final String a;
  public final List b;
  
  public F(String paramString, List paramList)
  {
    a = paramString;
    paramString = paramList;
    if (paramList == null) {
      paramString = new ArrayList();
    }
    b = paramString;
  }
  
  public static Object f(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = paramObject;
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      localObject = new byte[((List)paramObject).size()];
      for (int i = 0; i < ((List)paramObject).size(); i++) {
        localObject[i] = ((byte)(byte)((Integer)((List)paramObject).get(i)).intValue());
      }
    }
    return localObject;
  }
  
  public void a(SQLiteProgram paramSQLiteProgram)
  {
    Object localObject = b;
    if (localObject != null)
    {
      int i = ((List)localObject).size();
      int j = 0;
      while (j < i)
      {
        localObject = f(b.get(j));
        int k = j + 1;
        if (localObject == null)
        {
          paramSQLiteProgram.bindNull(k);
        }
        else if ((localObject instanceof byte[]))
        {
          paramSQLiteProgram.bindBlob(k, (byte[])localObject);
        }
        else if ((localObject instanceof Double))
        {
          paramSQLiteProgram.bindDouble(k, ((Double)localObject).doubleValue());
        }
        else
        {
          long l;
          if ((localObject instanceof Integer)) {
            l = ((Integer)localObject).intValue();
          }
          for (;;)
          {
            paramSQLiteProgram.bindLong(k, l);
            break;
            if ((localObject instanceof Long))
            {
              l = ((Long)localObject).longValue();
            }
            else
            {
              if ((localObject instanceof String))
              {
                paramSQLiteProgram.bindString(k, (String)localObject);
                break;
              }
              if (!(localObject instanceof Boolean)) {
                break label205;
              }
              if (((Boolean)localObject).booleanValue()) {
                l = 1L;
              } else {
                l = 0L;
              }
            }
          }
        }
        j = k;
        continue;
        label205:
        paramSQLiteProgram = new StringBuilder();
        paramSQLiteProgram.append("Could not bind ");
        paramSQLiteProgram.append(localObject);
        paramSQLiteProgram.append(" from index ");
        paramSQLiteProgram.append(j);
        paramSQLiteProgram.append(": Supported types are null, byte[], double, long, boolean and String");
        throw new IllegalArgumentException(paramSQLiteProgram.toString());
      }
    }
  }
  
  public List b()
  {
    return b;
  }
  
  public String c()
  {
    return a;
  }
  
  public Object[] d()
  {
    return e(b);
  }
  
  public final Object[] e(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(f(paramList.next()));
      }
    }
    return localArrayList.toArray(new Object[0]);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof F))
    {
      paramObject = (F)paramObject;
      String str = a;
      if (str != null)
      {
        if (!str.equals(a)) {
          return false;
        }
      }
      else if (a != null) {
        return false;
      }
      if (b.size() != b.size()) {
        return false;
      }
      for (int i = 0; i < b.size(); i++) {
        if (((b.get(i) instanceof byte[])) && ((b.get(i) instanceof byte[])))
        {
          if (!Arrays.equals((byte[])b.get(i), (byte[])b.get(i))) {
            return false;
          }
        }
        else if (!b.get(i).equals(b.get(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = a;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    Object localObject = b;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n5.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */