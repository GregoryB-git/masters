package com.google.android.gms.internal.measurement;

import g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class zzlr
{
  private static final char[] zza;
  
  static
  {
    char[] arrayOfChar = new char[80];
    zza = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static String zza(zzlm paramzzlm, String paramString)
  {
    paramString = g.g("# ", paramString);
    zza(paramzzlm, paramString, 0);
    return paramString.toString();
  }
  
  private static void zza(int paramInt, StringBuilder paramStringBuilder)
  {
    while (paramInt > 0)
    {
      char[] arrayOfChar = zza;
      int i;
      if (paramInt > arrayOfChar.length) {
        i = arrayOfChar.length;
      } else {
        i = paramInt;
      }
      paramStringBuilder.append(arrayOfChar, 0, i);
      paramInt -= i;
    }
  }
  
  private static void zza(zzlm paramzzlm, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject1 = paramzzlm.getClass().getDeclaredMethods();
    int i = localObject1.length;
    int k;
    Object localObject2;
    for (int j = 0;; j++)
    {
      k = 3;
      if (j >= i) {
        break;
      }
      localObject2 = localObject1[j];
      if ((!Modifier.isStatic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getName().length() >= 3)) {
        if (((Method)localObject2).getName().startsWith("set")) {
          localHashSet.add(((Method)localObject2).getName());
        } else if ((Modifier.isPublic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getParameterTypes().length == 0)) {
          if (((Method)localObject2).getName().startsWith("has")) {
            localHashMap.put(((Method)localObject2).getName(), localObject2);
          } else if (((Method)localObject2).getName().startsWith("get")) {
            localTreeMap.put(((Method)localObject2).getName(), localObject2);
          }
        }
      }
    }
    Iterator localIterator = localTreeMap.entrySet().iterator();
    j = k;
    while (localIterator.hasNext())
    {
      localObject1 = (Map.Entry)localIterator.next();
      localObject2 = ((String)((Map.Entry)localObject1).getKey()).substring(j);
      if ((((String)localObject2).endsWith("List")) && (!((String)localObject2).endsWith("OrBuilderList")) && (!((String)localObject2).equals("List")))
      {
        localObject3 = (Method)((Map.Entry)localObject1).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(List.class)))
        {
          zza(paramStringBuilder, paramInt, ((String)localObject2).substring(0, ((String)localObject2).length() - 4), zzkg.zza((Method)localObject3, paramzzlm, new Object[0]));
          j = 3;
          continue;
        }
      }
      if ((((String)localObject2).endsWith("Map")) && (!((String)localObject2).equals("Map")))
      {
        localObject3 = (Method)((Map.Entry)localObject1).getValue();
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(Map.class)) && (!((AccessibleObject)localObject3).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject3).getModifiers())))
        {
          zza(paramStringBuilder, paramInt, ((String)localObject2).substring(0, ((String)localObject2).length() - 3), zzkg.zza((Method)localObject3, paramzzlm, new Object[0]));
          break label843;
        }
      }
      Object localObject3 = new StringBuilder("set");
      ((StringBuilder)localObject3).append((String)localObject2);
      if (localHashSet.contains(((StringBuilder)localObject3).toString()))
      {
        Object localObject4;
        if (((String)localObject2).endsWith("Bytes"))
        {
          localObject3 = ((String)localObject2).substring(0, ((String)localObject2).length() - 5);
          localObject4 = new StringBuilder("get");
          ((StringBuilder)localObject4).append((String)localObject3);
          if (localTreeMap.containsKey(((StringBuilder)localObject4).toString())) {}
        }
        else
        {
          localObject1 = (Method)((Map.Entry)localObject1).getValue();
          localObject3 = new StringBuilder("has");
          ((StringBuilder)localObject3).append((String)localObject2);
          localObject4 = (Method)localHashMap.get(((StringBuilder)localObject3).toString());
          if (localObject1 != null)
          {
            localObject3 = zzkg.zza((Method)localObject1, paramzzlm, new Object[0]);
            boolean bool1 = true;
            boolean bool2;
            if (localObject4 == null)
            {
              if ((localObject3 instanceof Boolean)) {
                if (((Boolean)localObject3).booleanValue()) {}
              }
              for (;;)
              {
                bool2 = true;
                break;
                label678:
                label705:
                label771:
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          bool2 = false;
                          break label793;
                          if (!(localObject3 instanceof Integer)) {
                            break;
                          }
                        } while (((Integer)localObject3).intValue() != 0);
                        break;
                        if (!(localObject3 instanceof Float)) {
                          break label678;
                        }
                      } while (Float.floatToRawIntBits(((Float)localObject3).floatValue()) != 0);
                      break;
                      if (!(localObject3 instanceof Double)) {
                        break label705;
                      }
                    } while (Double.doubleToRawLongBits(((Double)localObject3).doubleValue()) != 0L);
                    break;
                    if ((localObject3 instanceof String)) {}
                    for (localObject1 = "";; localObject1 = zziy.zza)
                    {
                      bool2 = localObject3.equals(localObject1);
                      break label793;
                      if (!(localObject3 instanceof zziy)) {
                        break;
                      }
                    }
                    if (!(localObject3 instanceof zzlm)) {
                      break label771;
                    }
                  } while (localObject3 != ((zzlm)localObject3).zzal());
                  break;
                } while ((!(localObject3 instanceof Enum)) || (((Enum)localObject3).ordinal() != 0));
              }
              label793:
              if (!bool2) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }
            }
            else
            {
              bool2 = ((Boolean)zzkg.zza((Method)localObject4, paramzzlm, new Object[0])).booleanValue();
            }
            if (bool2) {
              zza(paramStringBuilder, paramInt, (String)localObject2, localObject3);
            }
          }
        }
      }
      label843:
      j = 3;
    }
    if ((paramzzlm instanceof zzkg.zzb))
    {
      localObject1 = zzc.zzd();
      if (((Iterator)localObject1).hasNext())
      {
        paramzzlm = (zzkg.zze)((Map.Entry)((Iterator)localObject1).next()).getKey();
        throw new NoSuchMethodError();
      }
    }
    paramzzlm = zzb;
    if (paramzzlm != null) {
      paramzzlm.zza(paramStringBuilder, paramInt);
    }
  }
  
  public static void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zza(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        zza(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    zza(paramInt, paramStringBuilder);
    int i;
    if (!paramString.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Character.toLowerCase(paramString.charAt(0)));
      for (i = 1; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if (Character.isUpperCase(c)) {
          localStringBuilder.append("_");
        }
        localStringBuilder.append(Character.toLowerCase(c));
      }
      paramString = localStringBuilder.toString();
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmq.zza(zziy.zza((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zziy))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmq.zza((zziy)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzkg))
    {
      paramStringBuilder.append(" {");
      zza((zzkg)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      zza(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      zza(paramStringBuilder, i, "key", paramString.getKey());
      zza(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      zza(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzlr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */