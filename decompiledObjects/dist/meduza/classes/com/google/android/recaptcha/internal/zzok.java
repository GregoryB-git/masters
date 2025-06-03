package com.google.android.recaptcha.internal;

import a0.j;
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

final class zzok
{
  private static final char[] zza;
  
  static
  {
    char[] arrayOfChar = new char[80];
    zza = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static String zza(zzoi paramzzoi, String paramString)
  {
    paramString = g.g("# ", paramString);
    zzd(paramzzoi, paramString, 0);
    return paramString.toString();
  }
  
  public static void zzb(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    zzc(paramInt, paramStringBuilder);
    Object localObject = paramString;
    int i;
    if (!paramString.isEmpty())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Character.toLowerCase(paramString.charAt(0)));
      for (i = 1; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if (Character.isUpperCase(c)) {
          ((StringBuilder)localObject).append("_");
        }
        ((StringBuilder)localObject).append(Character.toLowerCase(c));
      }
      localObject = ((StringBuilder)localObject).toString();
    }
    paramStringBuilder.append((String)localObject);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzpg.zza(new zzlc(((String)paramObject).getBytes(zznl.zza))));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzle))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzpg.zza((zzle)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zznd))
    {
      paramStringBuilder.append(" {");
      zzd((zznd)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      zzc(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      i = paramInt + 2;
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      zzb(paramStringBuilder, i, "key", paramString.getKey());
      zzb(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      zzc(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
  
  private static void zzc(int paramInt, StringBuilder paramStringBuilder)
  {
    while (paramInt > 0)
    {
      int i = 80;
      if (paramInt <= 80) {
        i = paramInt;
      }
      paramStringBuilder.append(zza, 0, i);
      paramInt -= i;
    }
  }
  
  private static void zzd(zzoi paramzzoi, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject2;
    for (localObject2 : paramzzoi.getClass().getDeclaredMethods()) {
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
    label428:
    label683:
    label750:
    label759:
    while (localIterator.hasNext())
    {
      Object localObject3 = (Map.Entry)localIterator.next();
      localObject2 = ((String)((Map.Entry)localObject3).getKey()).substring(3);
      if ((((String)localObject2).endsWith("List")) && (!((String)localObject2).endsWith("OrBuilderList")) && (!((String)localObject2).equals("List")))
      {
        ??? = (Method)((Map.Entry)localObject3).getValue();
        if ((??? != null) && (((Method)???).getReturnType().equals(List.class)))
        {
          localObject2 = ((String)localObject2).substring(0, ((String)localObject2).length() - 4);
          ??? = zznd.zzE((Method)???, paramzzoi, new Object[0]);
          break label428;
        }
      }
      if ((((String)localObject2).endsWith("Map")) && (!((String)localObject2).equals("Map")))
      {
        ??? = (Method)((Map.Entry)localObject3).getValue();
        if ((??? != null) && (((Method)???).getReturnType().equals(Map.class)) && (!((AccessibleObject)???).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)???).getModifiers())))
        {
          localObject2 = ((String)localObject2).substring(0, ((String)localObject2).length() - 3);
          ??? = zznd.zzE((Method)???, paramzzoi, new Object[0]);
          zzb(paramStringBuilder, paramInt, (String)localObject2, ???);
          break label759;
        }
      }
      if ((localHashSet.contains("set".concat((String)localObject2))) && ((!((String)localObject2).endsWith("Bytes")) || (!localTreeMap.containsKey("get".concat(String.valueOf(((String)localObject2).substring(0, ((String)localObject2).length() - 5)))))))
      {
        localObject3 = (Method)((Map.Entry)localObject3).getValue();
        ??? = (Method)localHashMap.get("has".concat((String)localObject2));
        if (localObject3 != null)
        {
          localObject3 = zznd.zzE((Method)localObject3, paramzzoi, new Object[0]);
          if (??? == null)
          {
            if ((localObject3 instanceof Boolean))
            {
              if (!((Boolean)localObject3).booleanValue()) {
                break label759;
              }
            }
            else if ((localObject3 instanceof Integer))
            {
              if (((Integer)localObject3).intValue() == 0) {
                break label759;
              }
            }
            else if ((localObject3 instanceof Float))
            {
              if (Float.floatToRawIntBits(((Float)localObject3).floatValue()) == 0) {
                break label759;
              }
            }
            else if ((localObject3 instanceof Double))
            {
              if (Double.doubleToRawLongBits(((Double)localObject3).doubleValue()) == 0L) {
                break label759;
              }
            }
            else
            {
              if ((localObject3 instanceof String))
              {
                ??? = "";
              }
              else
              {
                if (!(localObject3 instanceof zzle)) {
                  break label683;
                }
                ??? = zzle.zzb;
              }
              if (localObject3.equals(???)) {
                break label759;
              }
              break label750;
              if ((localObject3 instanceof zzoi)) {
                if (localObject3 == ((zzoi)localObject3).zzm()) {
                  break label759;
                }
              } else if ((localObject3 instanceof Enum)) {
                if (((Enum)localObject3).ordinal() == 0) {
                  break label759;
                }
              }
            }
          }
          else {
            if (!((Boolean)zznd.zzE((Method)???, paramzzoi, new Object[0])).booleanValue()) {
              break label759;
            }
          }
          zzb(paramStringBuilder, paramInt, (String)localObject2, localObject3);
        }
      }
    }
    if ((paramzzoi instanceof zzna))
    {
      ??? = zzb.zzf();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)???).next();
        zzb(paramStringBuilder, paramInt, j.h("[", getKeyzza, "]"), ((Map.Entry)localObject2).getValue());
      }
    }
    paramzzoi = zzc;
    if (paramzzoi != null) {
      paramzzoi.zzi(paramStringBuilder, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzok
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */