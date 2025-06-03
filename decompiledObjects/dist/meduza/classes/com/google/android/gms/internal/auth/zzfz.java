package com.google.android.gms.internal.auth;

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

final class zzfz
{
  private static final char[] zza;
  
  static
  {
    char[] arrayOfChar = new char[80];
    zza = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static String zza(zzfx paramzzfx, String paramString)
  {
    paramString = g.g("# ", paramString);
    zzd(paramzzfx, paramString, 0);
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
      return;
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
      paramStringBuilder.append(zzgx.zza(new zzec(((String)paramObject).getBytes(zzfa.zzb))));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzef))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzgx.zza((zzef)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzev))
    {
      paramStringBuilder.append(" {");
      zzd((zzev)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      zzc(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
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
  
  private static void zzd(zzfx paramzzfx, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    Object localObject2;
    for (localObject2 : paramzzfx.getClass().getDeclaredMethods()) {
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
    label690:
    label757:
    label766:
    while (localIterator.hasNext())
    {
      Object localObject3 = (Map.Entry)localIterator.next();
      ??? = ((String)((Map.Entry)localObject3).getKey()).substring(3);
      if ((((String)???).endsWith("List")) && (!((String)???).endsWith("OrBuilderList")) && (!((String)???).equals("List")))
      {
        localObject2 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject2 != null) && (((Method)localObject2).getReturnType().equals(List.class))) {
          ??? = ((String)???).substring(0, ((String)???).length() - 4);
        }
      }
      for (localObject2 = zzev.zzg((Method)localObject2, paramzzfx, new Object[0]);; localObject2 = zzev.zzg((Method)localObject2, paramzzfx, new Object[0]))
      {
        zzb(paramStringBuilder, paramInt, (String)???, localObject2);
        break label766;
        if ((!((String)???).endsWith("Map")) || (((String)???).equals("Map"))) {
          break;
        }
        localObject2 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject2 == null) || (!((Method)localObject2).getReturnType().equals(Map.class)) || (((AccessibleObject)localObject2).isAnnotationPresent(Deprecated.class)) || (!Modifier.isPublic(((Method)localObject2).getModifiers()))) {
          break;
        }
        ??? = ((String)???).substring(0, ((String)???).length() - 3);
      }
      if ((localHashSet.contains("set".concat((String)???))) && ((!((String)???).endsWith("Bytes")) || (!localTreeMap.containsKey("get".concat(String.valueOf(((String)???).substring(0, ((String)???).length() - 5)))))))
      {
        localObject3 = (Method)((Map.Entry)localObject3).getValue();
        localObject2 = (Method)localHashMap.get("has".concat((String)???));
        if (localObject3 != null)
        {
          localObject3 = zzev.zzg((Method)localObject3, paramzzfx, new Object[0]);
          if (localObject2 == null)
          {
            if ((localObject3 instanceof Boolean))
            {
              if (!((Boolean)localObject3).booleanValue()) {
                break label766;
              }
            }
            else if ((localObject3 instanceof Integer))
            {
              if (((Integer)localObject3).intValue() == 0) {
                break label766;
              }
            }
            else if ((localObject3 instanceof Float))
            {
              if (Float.floatToRawIntBits(((Float)localObject3).floatValue()) == 0) {
                break label766;
              }
            }
            else if ((localObject3 instanceof Double))
            {
              if (Double.doubleToRawLongBits(((Double)localObject3).doubleValue()) == 0L) {
                break label766;
              }
            }
            else
            {
              if ((localObject3 instanceof String)) {}
              boolean bool;
              for (localObject2 = "";; localObject2 = zzef.zzb)
              {
                bool = localObject3.equals(localObject2);
                break;
                if (!(localObject3 instanceof zzef)) {
                  break label690;
                }
              }
              if (bool) {
                break label766;
              }
              break label757;
              if ((localObject3 instanceof zzfx)) {
                if (localObject3 == ((zzfx)localObject3).zze()) {
                  break label766;
                }
              } else if ((localObject3 instanceof Enum)) {
                if (((Enum)localObject3).ordinal() == 0) {
                  break label766;
                }
              }
            }
          }
          else {
            if (!((Boolean)zzev.zzg((Method)localObject2, paramzzfx, new Object[0])).booleanValue()) {
              break label766;
            }
          }
          zzb(paramStringBuilder, paramInt, (String)???, localObject3);
        }
      }
    }
    if (!(paramzzfx instanceof zzeu))
    {
      paramzzfx = zzc;
      if (paramzzfx != null) {
        paramzzfx.zzg(paramStringBuilder, paramInt);
      }
      return;
    }
    paramzzfx = (zzeu)paramzzfx;
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */