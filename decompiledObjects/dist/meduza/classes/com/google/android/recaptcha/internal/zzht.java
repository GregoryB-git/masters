package com.google.android.recaptcha.internal;

import ic.d;
import ic.e;
import ic.g;
import java.util.ArrayList;
import lc.a;
import sb.m;
import sb.q;
import sb.w;

public final class zzht
  implements zzgx
{
  public static final zzht zza = new zzht();
  
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
        if (paramVarArgs != null)
        {
          paramzzgd.zzc().zze(paramInt, zzb(localObject2, paramVarArgs));
          return;
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
  
  public final Object zzb(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = paramObject1 instanceof Byte;
    if ((bool1) && ((paramObject2 instanceof Byte)))
    {
      paramObject1 = Byte.valueOf((byte)(((Number)paramObject1).byteValue() ^ ((Number)paramObject2).byteValue()));
    }
    else
    {
      boolean bool2 = paramObject1 instanceof Short;
      if ((bool2) && ((paramObject2 instanceof Short)))
      {
        paramObject1 = Short.valueOf((short)(((Number)paramObject1).shortValue() ^ ((Number)paramObject2).shortValue()));
      }
      else
      {
        boolean bool3 = paramObject1 instanceof Integer;
        if ((bool3) && ((paramObject2 instanceof Integer)))
        {
          paramObject1 = Integer.valueOf(((Number)paramObject1).intValue() ^ ((Number)paramObject2).intValue());
        }
        else
        {
          boolean bool4 = paramObject1 instanceof Long;
          if ((bool4) && ((paramObject2 instanceof Long)))
          {
            long l = ((Number)paramObject1).longValue();
            paramObject1 = Long.valueOf(((Number)paramObject2).longValue() ^ l);
          }
          else
          {
            boolean bool5 = paramObject1 instanceof String;
            int i = 0;
            int j = 0;
            Object localObject1;
            if (bool5)
            {
              if ((paramObject2 instanceof Byte))
              {
                paramObject1 = ((String)paramObject1).getBytes(a.a);
                i = paramObject1.length;
                localObject1 = new ArrayList(i);
                while (j < i)
                {
                  ((ArrayList)localObject1).add(Byte.valueOf((byte)(paramObject1[j] ^ ((Number)paramObject2).byteValue())));
                  j++;
                }
                paramObject1 = q.r((ArrayList)localObject1);
                break label1498;
              }
              if ((paramObject2 instanceof Integer))
              {
                paramObject1 = ((String)paramObject1).toCharArray();
                int k = paramObject1.length;
                localObject1 = new ArrayList(k);
                for (j = i; j < k; j++) {
                  ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[j] ^ ((Number)paramObject2).intValue()));
                }
                paramObject1 = q.t((ArrayList)localObject1);
                break label1498;
              }
            }
            if ((bool1) && ((paramObject2 instanceof byte[])))
            {
              paramObject2 = (byte[])paramObject2;
              i = paramObject2.length;
              localObject1 = new ArrayList(i);
              for (j = 0; j < i; j++) {
                ((ArrayList)localObject1).add(Byte.valueOf((byte)(paramObject2[j] ^ ((Number)paramObject1).byteValue())));
              }
              paramObject1 = ((ArrayList)localObject1).toArray(new Byte[0]);
            }
            else if ((bool2) && ((paramObject2 instanceof short[])))
            {
              paramObject2 = (short[])paramObject2;
              i = paramObject2.length;
              localObject1 = new ArrayList(i);
              for (j = 0; j < i; j++) {
                ((ArrayList)localObject1).add(Short.valueOf((short)(paramObject2[j] ^ ((Number)paramObject1).shortValue())));
              }
              paramObject1 = ((ArrayList)localObject1).toArray(new Short[0]);
            }
            else if ((bool3) && ((paramObject2 instanceof int[])))
            {
              localObject1 = (int[])paramObject2;
              i = localObject1.length;
              paramObject2 = new ArrayList(i);
              for (j = 0; j < i; j++) {
                ((ArrayList)paramObject2).add(Integer.valueOf(localObject1[j] ^ ((Number)paramObject1).intValue()));
              }
              paramObject1 = ((ArrayList)paramObject2).toArray(new Integer[0]);
            }
            else if ((bool4) && ((paramObject2 instanceof long[])))
            {
              paramObject2 = (long[])paramObject2;
              i = paramObject2.length;
              localObject1 = new ArrayList(i);
              for (j = 0; j < i; j++) {
                ((ArrayList)localObject1).add(Long.valueOf(paramObject2[j] ^ ((Number)paramObject1).longValue()));
              }
              paramObject1 = ((ArrayList)localObject1).toArray(new Long[0]);
            }
            else
            {
              bool1 = paramObject1 instanceof byte[];
              if ((bool1) && ((paramObject2 instanceof Byte)))
              {
                localObject1 = (byte[])paramObject1;
                i = localObject1.length;
                paramObject1 = new ArrayList(i);
                for (j = 0; j < i; j++) {
                  ((ArrayList)paramObject1).add(Byte.valueOf((byte)(localObject1[j] ^ ((Number)paramObject2).byteValue())));
                }
                paramObject1 = ((ArrayList)paramObject1).toArray(new Byte[0]);
              }
              else
              {
                bool2 = paramObject1 instanceof short[];
                if ((bool2) && ((paramObject2 instanceof Short)))
                {
                  paramObject1 = (short[])paramObject1;
                  i = paramObject1.length;
                  localObject1 = new ArrayList(i);
                  for (j = 0; j < i; j++) {
                    ((ArrayList)localObject1).add(Short.valueOf((short)(paramObject1[j] ^ ((Number)paramObject2).shortValue())));
                  }
                  paramObject1 = ((ArrayList)localObject1).toArray(new Short[0]);
                }
                else
                {
                  bool4 = paramObject1 instanceof int[];
                  if ((bool4) && ((paramObject2 instanceof Integer)))
                  {
                    paramObject1 = (int[])paramObject1;
                    i = paramObject1.length;
                    localObject1 = new ArrayList(i);
                    for (j = 0; j < i; j++) {
                      ((ArrayList)localObject1).add(Integer.valueOf(paramObject1[j] ^ ((Number)paramObject2).intValue()));
                    }
                    paramObject1 = ((ArrayList)localObject1).toArray(new Integer[0]);
                  }
                  else
                  {
                    bool5 = paramObject1 instanceof long[];
                    if ((bool5) && ((paramObject2 instanceof Long)))
                    {
                      paramObject1 = (long[])paramObject1;
                      i = paramObject1.length;
                      localObject1 = new ArrayList(i);
                      for (j = 0; j < i; j++) {
                        ((ArrayList)localObject1).add(Long.valueOf(paramObject1[j] ^ ((Number)paramObject2).longValue()));
                      }
                      paramObject1 = ((ArrayList)localObject1).toArray(new Long[0]);
                    }
                    else
                    {
                      Object localObject2;
                      if ((bool1) && ((paramObject2 instanceof byte[])))
                      {
                        paramObject1 = (byte[])paramObject1;
                        j = paramObject1.length;
                        localObject1 = (byte[])paramObject2;
                        zzgw.zza(this, j, localObject1.length);
                        localObject2 = g.O(0, j);
                        paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                        localObject2 = ((d)localObject2).iterator();
                        while (c)
                        {
                          i = ((w)localObject2).nextInt();
                          j = paramObject1[i];
                          ((ArrayList)paramObject2).add(Byte.valueOf((byte)(localObject1[i] ^ j)));
                        }
                        paramObject1 = ((ArrayList)paramObject2).toArray(new Byte[0]);
                      }
                      else if ((bool2) && ((paramObject2 instanceof short[])))
                      {
                        paramObject1 = (short[])paramObject1;
                        j = paramObject1.length;
                        localObject1 = (short[])paramObject2;
                        zzgw.zza(this, j, localObject1.length);
                        localObject2 = g.O(0, j);
                        paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                        localObject2 = ((d)localObject2).iterator();
                        while (c)
                        {
                          j = ((w)localObject2).nextInt();
                          i = paramObject1[j];
                          ((ArrayList)paramObject2).add(Short.valueOf((short)(localObject1[j] ^ i)));
                        }
                        paramObject1 = ((ArrayList)paramObject2).toArray(new Short[0]);
                      }
                      else if ((bool4) && ((paramObject2 instanceof int[])))
                      {
                        paramObject1 = (int[])paramObject1;
                        j = paramObject1.length;
                        localObject1 = (int[])paramObject2;
                        zzgw.zza(this, j, localObject1.length);
                        localObject2 = g.O(0, j);
                        paramObject2 = new ArrayList(m.j((Iterable)localObject2));
                        localObject2 = ((d)localObject2).iterator();
                        while (c)
                        {
                          j = ((w)localObject2).nextInt();
                          i = paramObject1[j];
                          ((ArrayList)paramObject2).add(Integer.valueOf(localObject1[j] ^ i));
                        }
                        paramObject1 = ((ArrayList)paramObject2).toArray(new Integer[0]);
                      }
                      else
                      {
                        if ((!bool5) || (!(paramObject2 instanceof long[]))) {
                          break label1500;
                        }
                        paramObject1 = (long[])paramObject1;
                        j = paramObject1.length;
                        paramObject2 = (long[])paramObject2;
                        zzgw.zza(this, j, paramObject2.length);
                        localObject2 = g.O(0, j);
                        localObject1 = new ArrayList(m.j((Iterable)localObject2));
                        localObject2 = ((d)localObject2).iterator();
                        while (c)
                        {
                          j = ((w)localObject2).nextInt();
                          ((ArrayList)localObject1).add(Long.valueOf(paramObject1[j] ^ paramObject2[j]));
                        }
                        paramObject1 = ((ArrayList)localObject1).toArray(new Long[0]);
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
    label1498:
    return paramObject1;
    label1500:
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */