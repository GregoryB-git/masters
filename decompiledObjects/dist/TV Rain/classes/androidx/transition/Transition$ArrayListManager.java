package androidx.transition;

import java.util.ArrayList;

class Transition$ArrayListManager
{
  public static <T> ArrayList<T> add(ArrayList<T> paramArrayList, T paramT)
  {
    Object localObject = paramArrayList;
    if (paramArrayList == null) {
      localObject = new ArrayList();
    }
    if (!((ArrayList)localObject).contains(paramT)) {
      ((ArrayList)localObject).add(paramT);
    }
    return (ArrayList<T>)localObject;
  }
  
  public static <T> ArrayList<T> remove(ArrayList<T> paramArrayList, T paramT)
  {
    ArrayList<T> localArrayList = paramArrayList;
    if (paramArrayList != null)
    {
      paramArrayList.remove(paramT);
      localArrayList = paramArrayList;
      if (paramArrayList.isEmpty()) {
        localArrayList = null;
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Transition.ArrayListManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */