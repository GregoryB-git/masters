package f6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.v;
import m6.c;

public abstract class a
{
  public static final Class a(c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "<this>");
    paramc = ((d)paramc).b();
    if (!paramc.isPrimitive())
    {
      Intrinsics.c(paramc, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
      return paramc;
    }
    String str = paramc.getName();
    switch (str.hashCode())
    {
    default: 
      break;
    case 109413500: 
      if (str.equals("short")) {
        paramc = Short.class;
      }
      break;
    case 97526364: 
      if (str.equals("float")) {
        paramc = Float.class;
      }
      break;
    case 64711720: 
      if (str.equals("boolean")) {
        paramc = Boolean.class;
      }
      break;
    case 3625364: 
      if (str.equals("void")) {
        paramc = Void.class;
      }
      break;
    case 3327612: 
      if (str.equals("long")) {
        paramc = Long.class;
      }
      break;
    case 3052374: 
      if (str.equals("char")) {
        paramc = Character.class;
      }
      break;
    case 3039496: 
      if (str.equals("byte")) {
        paramc = Byte.class;
      }
      break;
    case 104431: 
      if (str.equals("int")) {
        paramc = Integer.class;
      }
      break;
    case -1325958191: 
      if (str.equals("double")) {
        paramc = Double.class;
      }
      break;
    }
    Intrinsics.c(paramc, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
    return paramc;
  }
  
  public static final c b(Class paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "<this>");
    return v.b(paramClass);
  }
}

/* Location:
 * Qualified Name:     f6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */