package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class ViewModel
{
  @Nullable
  private final Map<String, Object> mBagOfTags = new HashMap();
  private volatile boolean mCleared;
  @Nullable
  private final Set<Closeable> mCloseables;
  
  public ViewModel()
  {
    mCloseables = new LinkedHashSet();
    mCleared = false;
  }
  
  public ViewModel(@NonNull Closeable... paramVarArgs)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    mCloseables = localLinkedHashSet;
    mCleared = false;
    localLinkedHashSet.addAll(Arrays.asList(paramVarArgs));
  }
  
  private static void closeWithRuntimeException(Object paramObject)
  {
    if ((paramObject instanceof Closeable)) {
      try
      {
        ((Closeable)paramObject).close();
      }
      catch (IOException paramObject)
      {
        throw new RuntimeException((Throwable)paramObject);
      }
    }
  }
  
  public void addCloseable(@NonNull Closeable paramCloseable)
  {
    Set localSet = mCloseables;
    if (localSet != null) {
      try
      {
        mCloseables.add(paramCloseable);
      }
      finally {}
    }
  }
  
  @MainThread
  public final void clear()
  {
    mCleared = true;
    Object localObject1 = mBagOfTags;
    if (localObject1 != null) {
      try
      {
        Iterator localIterator1 = mBagOfTags.values().iterator();
        while (localIterator1.hasNext()) {
          closeWithRuntimeException(localIterator1.next());
        }
      }
      finally {}
    }
    localObject1 = mCloseables;
    if (localObject1 != null) {
      try
      {
        Iterator localIterator2 = mCloseables.iterator();
        while (localIterator2.hasNext()) {
          closeWithRuntimeException((Closeable)localIterator2.next());
        }
      }
      finally {}
    }
    onCleared();
  }
  
  public <T> T getTag(String paramString)
  {
    Map localMap = mBagOfTags;
    if (localMap == null) {
      return null;
    }
    try
    {
      paramString = mBagOfTags.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public void onCleared() {}
  
  public <T> T setTagIfAbsent(String paramString, T paramT)
  {
    synchronized (mBagOfTags)
    {
      Object localObject = mBagOfTags.get(paramString);
      if (localObject == null) {
        mBagOfTags.put(paramString, paramT);
      }
      if (localObject != null) {
        paramT = (T)localObject;
      }
      if (mCleared) {
        closeWithRuntimeException(paramT);
      }
      return paramT;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ViewModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */