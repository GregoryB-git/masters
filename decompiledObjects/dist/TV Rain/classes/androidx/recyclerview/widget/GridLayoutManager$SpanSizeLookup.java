package androidx.recyclerview.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$SpanSizeLookup
{
  private boolean mCacheSpanGroupIndices = false;
  private boolean mCacheSpanIndices = false;
  public final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
  public final SparseIntArray mSpanIndexCache = new SparseIntArray();
  
  public static int findFirstKeyLessThan(SparseIntArray paramSparseIntArray, int paramInt)
  {
    int i = paramSparseIntArray.size() - 1;
    int j = 0;
    while (j <= i)
    {
      int k = j + i >>> 1;
      if (paramSparseIntArray.keyAt(k) < paramInt) {
        j = k + 1;
      } else {
        i = k - 1;
      }
    }
    paramInt = j - 1;
    if ((paramInt >= 0) && (paramInt < paramSparseIntArray.size())) {
      return paramSparseIntArray.keyAt(paramInt);
    }
    return -1;
  }
  
  public int getCachedSpanGroupIndex(int paramInt1, int paramInt2)
  {
    if (!mCacheSpanGroupIndices) {
      return getSpanGroupIndex(paramInt1, paramInt2);
    }
    int i = mSpanGroupIndexCache.get(paramInt1, -1);
    if (i != -1) {
      return i;
    }
    paramInt2 = getSpanGroupIndex(paramInt1, paramInt2);
    mSpanGroupIndexCache.put(paramInt1, paramInt2);
    return paramInt2;
  }
  
  public int getCachedSpanIndex(int paramInt1, int paramInt2)
  {
    if (!mCacheSpanIndices) {
      return getSpanIndex(paramInt1, paramInt2);
    }
    int i = mSpanIndexCache.get(paramInt1, -1);
    if (i != -1) {
      return i;
    }
    paramInt2 = getSpanIndex(paramInt1, paramInt2);
    mSpanIndexCache.put(paramInt1, paramInt2);
    return paramInt2;
  }
  
  public int getSpanGroupIndex(int paramInt1, int paramInt2)
  {
    int j;
    int n;
    if (mCacheSpanGroupIndices)
    {
      i = findFirstKeyLessThan(mSpanGroupIndexCache, paramInt1);
      if (i != -1)
      {
        j = mSpanGroupIndexCache.get(i);
        k = i + 1;
        m = getCachedSpanIndex(i, paramInt2);
        n = getSpanSize(i) + m;
        m = n;
        i = j;
        i1 = k;
        if (n != paramInt2) {
          break label95;
        }
        i = j + 1;
        m = 0;
        i1 = k;
        break label95;
      }
    }
    int m = 0;
    int i = m;
    int i1 = i;
    label95:
    int i2 = getSpanSize(paramInt1);
    int k = i1;
    while (k < paramInt1)
    {
      j = getSpanSize(k);
      n = m + j;
      if (n == paramInt2)
      {
        i1 = i + 1;
        m = 0;
      }
      else
      {
        m = n;
        i1 = i;
        if (n > paramInt2)
        {
          i1 = i + 1;
          m = j;
        }
      }
      k++;
      i = i1;
    }
    paramInt1 = i;
    if (m + i2 > paramInt2) {
      paramInt1 = i + 1;
    }
    return paramInt1;
  }
  
  public int getSpanIndex(int paramInt1, int paramInt2)
  {
    int i = getSpanSize(paramInt1);
    if (i == paramInt2) {
      return 0;
    }
    int j;
    if (mCacheSpanIndices)
    {
      j = findFirstKeyLessThan(mSpanIndexCache, paramInt1);
      if (j >= 0)
      {
        k = mSpanIndexCache.get(j);
        k = getSpanSize(j) + k;
        break label126;
      }
    }
    int m = 0;
    int k = m;
    while (m < paramInt1)
    {
      int n = getSpanSize(m);
      int i1 = k + n;
      if (i1 == paramInt2)
      {
        k = 0;
        j = m;
      }
      else
      {
        j = m;
        k = i1;
        if (i1 > paramInt2)
        {
          k = n;
          j = m;
        }
      }
      label126:
      m = j + 1;
    }
    if (i + k <= paramInt2) {
      return k;
    }
    return 0;
  }
  
  public abstract int getSpanSize(int paramInt);
  
  public void invalidateSpanGroupIndexCache()
  {
    mSpanGroupIndexCache.clear();
  }
  
  public void invalidateSpanIndexCache()
  {
    mSpanIndexCache.clear();
  }
  
  public boolean isSpanGroupIndexCacheEnabled()
  {
    return mCacheSpanGroupIndices;
  }
  
  public boolean isSpanIndexCacheEnabled()
  {
    return mCacheSpanIndices;
  }
  
  public void setSpanGroupIndexCacheEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {
      mSpanGroupIndexCache.clear();
    }
    mCacheSpanGroupIndices = paramBoolean;
  }
  
  public void setSpanIndexCacheEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {
      mSpanGroupIndexCache.clear();
    }
    mCacheSpanIndices = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */