package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

public final class ajb
{
  private int a = 0;
  
  private final ajb a(Object paramObject1, Object paramObject2, Comparator<?> paramComparator)
  {
    if (a != 0) {
      return this;
    }
    if (paramObject1 == paramObject2) {
      return this;
    }
    int i = -1;
    if (paramObject1 == null)
    {
      a = -1;
      return this;
    }
    if (paramObject2 == null)
    {
      a = 1;
      return this;
    }
    if (paramObject1.getClass().isArray())
    {
      boolean bool = paramObject1 instanceof long[];
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5 = 0;
      int i6 = 0;
      if (bool)
      {
        paramObject1 = (long[])paramObject1;
        paramObject2 = (long[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2)) {
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              long l1 = paramObject1[i6];
              long l2 = paramObject2[i6];
              if (i == 0) {
                a = (l1 < l2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof int[]))
      {
        paramObject1 = (int[])paramObject1;
        paramObject2 = (int[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = k;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              k = a;
              if (k != 0) {
                break;
              }
              i = paramObject1[i6];
              m = paramObject2[i6];
              if (k == 0) {
                a = Integer.compare(i, m);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof short[]))
      {
        paramObject1 = (short[])paramObject1;
        paramObject2 = (short[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = m;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              short s1 = paramObject1[i6];
              short s2 = paramObject2[i6];
              if (i == 0) {
                a = Short.compare(s1, s2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof char[]))
      {
        paramObject1 = (char[])paramObject1;
        paramObject2 = (char[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = n;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              char c1 = paramObject1[i6];
              char c2 = paramObject2[i6];
              if (i == 0) {
                a = Character.compare(c1, c2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof byte[]))
      {
        paramObject1 = (byte[])paramObject1;
        paramObject2 = (byte[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = i1;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              byte b1 = paramObject1[i6];
              byte b2 = paramObject2[i6];
              if (i == 0) {
                a = Byte.compare(b1, b2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof double[]))
      {
        paramObject1 = (double[])paramObject1;
        paramObject2 = (double[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = i2;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              double d1 = paramObject1[i6];
              double d2 = paramObject2[i6];
              if (i == 0) {
                a = Double.compare(d1, d2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof float[]))
      {
        paramObject1 = (float[])paramObject1;
        paramObject2 = (float[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = i3;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              float f1 = paramObject1[i6];
              float f2 = paramObject2[i6];
              if (i == 0) {
                a = Float.compare(f1, f2);
              }
              i6++;
            }
          }
        }
      }
      else if ((paramObject1 instanceof boolean[]))
      {
        paramObject1 = (boolean[])paramObject1;
        paramObject2 = (boolean[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = i4;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while (i6 < paramObject1.length)
            {
              i = a;
              if (i != 0) {
                break;
              }
              int i7 = paramObject1[i6];
              int j = paramObject2[i6];
              if ((i == 0) && (i7 != j)) {
                if (i7 != 0) {
                  a = 1;
                } else {
                  a = -1;
                }
              }
              i6++;
            }
          }
        }
      }
      else
      {
        paramObject1 = (Object[])paramObject1;
        paramObject2 = (Object[])paramObject2;
        if ((a == 0) && (paramObject1 != paramObject2))
        {
          i6 = i5;
          if (paramObject1.length != paramObject2.length)
          {
            if (paramObject1.length >= paramObject2.length) {
              i = 1;
            }
            a = i;
          }
          else
          {
            while ((i6 < paramObject1.length) && (a == 0))
            {
              a(paramObject1[i6], paramObject2[i6], paramComparator);
              i6++;
            }
          }
        }
      }
    }
    else if (paramComparator == null)
    {
      a = ((Comparable)paramObject1).compareTo(paramObject2);
    }
    else
    {
      a = paramComparator.compare(paramObject1, paramObject2);
    }
    return this;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final ajb a(Object paramObject1, Object paramObject2)
  {
    return a(paramObject1, paramObject2, null);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ajb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */