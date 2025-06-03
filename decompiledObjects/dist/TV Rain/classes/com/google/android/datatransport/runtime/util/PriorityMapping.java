package com.google.android.datatransport.runtime.util;

import a;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class PriorityMapping
{
  private static HashMap<Priority, Integer> PRIORITY_INT_MAP;
  private static SparseArray<Priority> PRIORITY_MAP = new SparseArray();
  
  static
  {
    Object localObject = new HashMap();
    PRIORITY_INT_MAP = (HashMap)localObject;
    ((HashMap)localObject).put(Priority.DEFAULT, Integer.valueOf(0));
    PRIORITY_INT_MAP.put(Priority.VERY_LOW, Integer.valueOf(1));
    PRIORITY_INT_MAP.put(Priority.HIGHEST, Integer.valueOf(2));
    localObject = PRIORITY_INT_MAP.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Priority localPriority = (Priority)((Iterator)localObject).next();
      PRIORITY_MAP.append(((Integer)PRIORITY_INT_MAP.get(localPriority)).intValue(), localPriority);
    }
  }
  
  public static int toInt(@NonNull Priority paramPriority)
  {
    Object localObject = (Integer)PRIORITY_INT_MAP.get(paramPriority);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PriorityMapping is missing known Priority value ");
    ((StringBuilder)localObject).append(paramPriority);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  @NonNull
  public static Priority valueOf(int paramInt)
  {
    Priority localPriority = (Priority)PRIORITY_MAP.get(paramInt);
    if (localPriority != null) {
      return localPriority;
    }
    throw new IllegalArgumentException(a.f("Unknown Priority for value ", paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.util.PriorityMapping
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */