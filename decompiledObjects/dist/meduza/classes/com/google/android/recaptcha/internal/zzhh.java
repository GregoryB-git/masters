package com.google.android.recaptcha.internal;

import ic.d;
import ic.e;
import ic.g;
import java.util.ArrayList;
import lc.a;
import sb.m;
import sb.q;
import sb.w;

public final class zzhh
  implements zzgx
{
  public static final zzhh zza = new zzhh();
  
  private final Object zzb(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = paramObject1 instanceof Byte;
    boolean bool2;
    boolean bool3;
    if ((!bool1) || (!(paramObject2 instanceof Byte)))
    {
      bool2 = paramObject1 instanceof Short;
      if ((!bool2) || (!(paramObject2 instanceof Short)))
      {
        bool3 = paramObject1 instanceof Integer;
        if ((!bool3) || (!(paramObject2 instanceof Integer))) {
          break label80;
        }
      }
    }
    paramObject1 = Integer.valueOf(((Number)paramObject1).intValue() % ((Number)paramObject2).intValue());
    break label2105;
    label80:
    boolean bool4 = paramObject1 instanceof Long;
    if ((bool4) && ((paramObject2 instanceof Long)))
    {
      paramObject1 = Long.valueOf(((Number)paramObject1).longValue() % ((Number)paramObject2).longValue());
    }
    else
    {
      boolean bool5 = paramObject1 instanceof Float;
      if ((bool5) && ((paramObject2 instanceof Float)))
      {
        paramObject1 = Float.valueOf(((Number)paramObject1).floatValue() % ((Number)paramObject2).floatValue());
      }
      else
      {
        boolean bool6 = paramObject1 instanceof Double;
        if ((bool6) && ((paramObject2 instanceof Double)))
        {
          paramObject1 = Double.valueOf(((Number)paramObject1).doubleValue() % ((Number)paramObject2).doubleValue());
        }
        else
        {
          boolean bool7 = paramObject1 instanceof String;
          int i = 0;
          int j = 0;
          int k = 0;
          Object localObject1;
          if (bool7)
          {
            if ((paramObject2 instanceof Byte))
            {
              paramObject1 = ((String)paramObject1).getBytes(a.a);
              i = paramObject1.length;
              localObject1 = new ArrayList(i);
              while (k < i)
              {
                ((ArrayList)localObject1).add(Byte.valueOf((byte)(paramObject1[k] % ((Number)paramObject2).intValue())));
                k++;
              }
              paramObject1 = new String(q.r((ArrayList)localObject1), a.a);
              break label2105;
            }
            if ((paramObject2 instanceof Integer))
            {
              paramObject1 = ((String)paramObject1).toCharArray();
              j = paramObject1.length;
              localObject1 = new ArrayList(j);
              for (k = i; k < j; k++) {
                ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[k] % ((Number)paramObject2).intValue()));
              }
              paramObject1 = q.t((ArrayList)localObject1);
              break label2105;
            }
          }
          if ((bool1) && ((paramObject2 instanceof byte[])))
          {
            localObject1 = (byte[])paramObject2;
            i = localObject1.length;
            paramObject2 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)paramObject2).add(Integer.valueOf(localObject1[k] % ((Number)paramObject1).intValue()));
            }
            paramObject1 = ((ArrayList)paramObject2).toArray(new Integer[0]);
          }
          else if ((bool2) && ((paramObject2 instanceof short[])))
          {
            paramObject2 = (short[])paramObject2;
            i = paramObject2.length;
            localObject1 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)localObject1).add(Integer.valueOf(paramObject2[k] % ((Number)paramObject1).intValue()));
            }
            paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
          }
          else if ((bool3) && ((paramObject2 instanceof int[])))
          {
            paramObject2 = (int[])paramObject2;
            i = paramObject2.length;
            localObject1 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)localObject1).add(Integer.valueOf(paramObject2[k] % ((Number)paramObject1).intValue()));
            }
            paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
          }
          else if ((bool4) && ((paramObject2 instanceof long[])))
          {
            localObject1 = (long[])paramObject2;
            i = localObject1.length;
            paramObject2 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)paramObject2).add(Long.valueOf(localObject1[k] % ((Number)paramObject1).longValue()));
            }
            paramObject1 = ((ArrayList)paramObject2).toArray(new Long[0]);
          }
          else if ((bool5) && ((paramObject2 instanceof float[])))
          {
            localObject1 = (float[])paramObject2;
            i = localObject1.length;
            paramObject2 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)paramObject2).add(Float.valueOf(localObject1[k] % ((Number)paramObject1).floatValue()));
            }
            paramObject1 = ((ArrayList)paramObject2).toArray(new Float[0]);
          }
          else if ((bool6) && ((paramObject2 instanceof double[])))
          {
            localObject1 = (double[])paramObject2;
            i = localObject1.length;
            paramObject2 = new ArrayList(i);
            for (k = 0; k < i; k++) {
              ((ArrayList)paramObject2).add(Double.valueOf(localObject1[k] % ((Number)paramObject1).doubleValue()));
            }
            paramObject1 = ((ArrayList)paramObject2).toArray(new Double[0]);
          }
          else
          {
            bool7 = paramObject1 instanceof byte[];
            if ((bool7) && ((paramObject2 instanceof Byte)))
            {
              localObject1 = (byte[])paramObject1;
              i = localObject1.length;
              paramObject1 = new ArrayList(i);
              for (k = 0; k < i; k++) {
                ((ArrayList)paramObject1).add(Integer.valueOf(localObject1[k] % ((Number)paramObject2).intValue()));
              }
              paramObject1 = ((ArrayList)paramObject1).toArray(new Integer[0]);
            }
            else
            {
              bool2 = paramObject1 instanceof short[];
              if ((bool2) && ((paramObject2 instanceof Short)))
              {
                paramObject1 = (short[])paramObject1;
                i = paramObject1.length;
                localObject1 = new ArrayList(i);
                for (k = 0; k < i; k++) {
                  ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[k] % ((Number)paramObject2).intValue()));
                }
                paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
              }
              else
              {
                bool3 = paramObject1 instanceof int[];
                if ((bool3) && ((paramObject2 instanceof Integer)))
                {
                  localObject1 = (int[])paramObject1;
                  i = localObject1.length;
                  paramObject1 = new ArrayList(i);
                  for (k = j; k < i; k++) {
                    ((ArrayList)paramObject1).add(Integer.valueOf(localObject1[k] % ((Number)paramObject2).intValue()));
                  }
                  paramObject1 = q.t((ArrayList)paramObject1);
                }
                else
                {
                  bool5 = paramObject1 instanceof long[];
                  if ((bool5) && ((paramObject2 instanceof Long)))
                  {
                    paramObject1 = (long[])paramObject1;
                    i = paramObject1.length;
                    localObject1 = new ArrayList(i);
                    for (k = 0; k < i; k++) {
                      ((ArrayList)localObject1).add(Long.valueOf(paramObject1[k] % ((Number)paramObject2).longValue()));
                    }
                    paramObject1 = ((ArrayList)localObject1).toArray(new Long[0]);
                  }
                  else
                  {
                    bool4 = paramObject1 instanceof float[];
                    if ((bool4) && ((paramObject2 instanceof Float)))
                    {
                      localObject1 = (float[])paramObject1;
                      i = localObject1.length;
                      paramObject1 = new ArrayList(i);
                      for (k = 0; k < i; k++) {
                        ((ArrayList)paramObject1).add(Float.valueOf(localObject1[k] % ((Number)paramObject2).floatValue()));
                      }
                      paramObject1 = ((ArrayList)paramObject1).toArray(new Float[0]);
                    }
                    else
                    {
                      bool6 = paramObject1 instanceof double[];
                      if ((bool6) && ((paramObject2 instanceof Double)))
                      {
                        localObject1 = (double[])paramObject1;
                        i = localObject1.length;
                        paramObject1 = new ArrayList(i);
                        for (k = 0; k < i; k++) {
                          ((ArrayList)paramObject1).add(Double.valueOf(localObject1[k] % ((Number)paramObject2).doubleValue()));
                        }
                        paramObject1 = ((ArrayList)paramObject1).toArray(new Double[0]);
                      }
                      else
                      {
                        Object localObject2;
                        if ((bool7) && ((paramObject2 instanceof byte[])))
                        {
                          paramObject1 = (byte[])paramObject1;
                          k = paramObject1.length;
                          paramObject2 = (byte[])paramObject2;
                          zzgw.zza(this, k, paramObject2.length);
                          localObject2 = g.O(0, k);
                          localObject1 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[k] % paramObject2[k]));
                          }
                          paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
                        }
                        else if ((bool2) && ((paramObject2 instanceof short[])))
                        {
                          paramObject1 = (short[])paramObject1;
                          k = paramObject1.length;
                          paramObject2 = (short[])paramObject2;
                          zzgw.zza(this, k, paramObject2.length);
                          localObject2 = g.O(0, k);
                          localObject1 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[k] % paramObject2[k]));
                          }
                          paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
                        }
                        else if ((bool3) && ((paramObject2 instanceof int[])))
                        {
                          paramObject1 = (int[])paramObject1;
                          k = paramObject1.length;
                          paramObject2 = (int[])paramObject2;
                          zzgw.zza(this, k, paramObject2.length);
                          localObject2 = g.O(0, k);
                          localObject1 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[k] % paramObject2[k]));
                          }
                          paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
                        }
                        else if ((bool5) && ((paramObject2 instanceof long[])))
                        {
                          paramObject1 = (long[])paramObject1;
                          k = paramObject1.length;
                          localObject1 = (long[])paramObject2;
                          zzgw.zza(this, k, localObject1.length);
                          localObject2 = g.O(0, k);
                          paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)paramObject2).add(Long.valueOf(paramObject1[k] % localObject1[k]));
                          }
                          paramObject1 = ((ArrayList)paramObject2).toArray(new Long[0]);
                        }
                        else if ((bool4) && ((paramObject2 instanceof float[])))
                        {
                          paramObject1 = (float[])paramObject1;
                          k = paramObject1.length;
                          localObject1 = (float[])paramObject2;
                          zzgw.zza(this, k, localObject1.length);
                          localObject2 = g.O(0, k);
                          paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)paramObject2).add(Float.valueOf(paramObject1[k] % localObject1[k]));
                          }
                          paramObject1 = ((ArrayList)paramObject2).toArray(new Float[0]);
                        }
                        else
                        {
                          if ((!bool6) || (!(paramObject2 instanceof double[]))) {
                            break label2107;
                          }
                          paramObject1 = (double[])paramObject1;
                          k = paramObject1.length;
                          localObject1 = (double[])paramObject2;
                          zzgw.zza(this, k, localObject1.length);
                          localObject2 = g.O(0, k);
                          paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                          localObject2 = ((d)localObject2).iterator();
                          while (c)
                          {
                            k = ((w)localObject2).nextInt();
                            ((ArrayList)paramObject2).add(Double.valueOf(paramObject1[k] % localObject1[k]));
                          }
                          paramObject1 = ((ArrayList)paramObject2).toArray(new Double[0]);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label2105:
    return paramObject1;
    label2107:
    throw new zzce(4, 5, null);
  }
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof Object) {
          paramVarArgs = null;
        }
        if (paramVarArgs != null) {
          try
          {
            paramzzgd.zzc().zze(paramInt, zzb(localObject2, paramVarArgs));
            return;
          }
          catch (ArithmeticException paramzzgd)
          {
            throw new zzce(4, 6, paramzzgd);
          }
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */