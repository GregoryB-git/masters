package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class yw
{
  public static final Type[] a = new Type[0];
  
  public static Type a(Type paramType)
  {
    if ((paramType instanceof Class))
    {
      Class localClass = (Class)paramType;
      paramType = localClass;
      if (localClass.isArray()) {
        paramType = new yv(a(localClass.getComponentType()));
      }
      return paramType;
    }
    if ((paramType instanceof ParameterizedType))
    {
      paramType = (ParameterizedType)paramType;
      return new yy(paramType.getOwnerType(), paramType.getRawType(), paramType.getActualTypeArguments());
    }
    if ((paramType instanceof GenericArrayType)) {
      return new yv(((GenericArrayType)paramType).getGenericComponentType());
    }
    if ((paramType instanceof WildcardType))
    {
      paramType = (WildcardType)paramType;
      return new yx(paramType.getUpperBounds(), paramType.getLowerBounds());
    }
    return paramType;
  }
  
  public static Type a(Type paramType, Class<?> paramClass)
  {
    paramClass = b(paramType, paramClass, Collection.class);
    paramType = paramClass;
    if ((paramClass instanceof WildcardType)) {
      paramType = ((WildcardType)paramClass).getUpperBounds()[0];
    }
    if ((paramType instanceof ParameterizedType)) {
      return ((ParameterizedType)paramType).getActualTypeArguments()[0];
    }
    return Object.class;
  }
  
  private static Type a(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2 == paramClass1) {
      return paramType;
    }
    if (paramClass2.isInterface())
    {
      Class[] arrayOfClass = paramClass1.getInterfaces();
      int i = 0;
      int j = arrayOfClass.length;
      while (i < j)
      {
        paramType = arrayOfClass[i];
        if (paramType == paramClass2) {
          return paramClass1.getGenericInterfaces()[i];
        }
        if (paramClass2.isAssignableFrom(paramType))
        {
          paramType = paramClass1.getGenericInterfaces()[i];
          paramClass1 = arrayOfClass[i];
          break label124;
        }
        i++;
      }
    }
    if (!paramClass1.isInterface()) {
      for (paramType = paramClass1;; paramType = paramClass1)
      {
        if (paramType == Object.class) {
          return paramClass2;
        }
        paramClass1 = paramType.getSuperclass();
        if (paramClass1 == paramClass2) {
          return paramType.getGenericSuperclass();
        }
        if (paramClass2.isAssignableFrom(paramClass1))
        {
          paramType = paramType.getGenericSuperclass();
          label124:
          break;
        }
      }
    }
    return paramClass2;
  }
  
  public static Type a(Type paramType1, Class<?> paramClass, Type paramType2)
  {
    return a(paramType1, paramClass, paramType2, new HashSet());
  }
  
  private static Type a(Type paramType1, Class<?> paramClass, Type paramType2, Collection<TypeVariable> paramCollection)
  {
    int i;
    int j;
    Object localObject1;
    int k;
    label154:
    do
    {
      boolean bool = paramType2 instanceof TypeVariable;
      i = 0;
      j = 0;
      if (!bool) {
        break;
      }
      localObject1 = (TypeVariable)paramType2;
      if (paramCollection.contains(localObject1)) {
        return paramType2;
      }
      paramCollection.add(localObject1);
      paramType2 = ((TypeVariable)localObject1).getGenericDeclaration();
      if ((paramType2 instanceof Class)) {
        paramType2 = (Class)paramType2;
      } else {
        paramType2 = null;
      }
      if (paramType2 != null)
      {
        localObject2 = a(paramType1, paramClass, paramType2);
        if ((localObject2 instanceof ParameterizedType))
        {
          paramType2 = paramType2.getTypeParameters();
          k = paramType2.length;
          while (j < k)
          {
            if (localObject1.equals(paramType2[j]))
            {
              localObject2 = ((ParameterizedType)localObject2).getActualTypeArguments()[j];
              break label154;
            }
            j++;
          }
          throw new NoSuchElementException();
        }
      }
      localObject2 = localObject1;
      paramType2 = (Type)localObject2;
    } while (localObject2 != localObject1);
    return (Type)localObject2;
    if ((paramType2 instanceof Class))
    {
      localObject2 = (Class)paramType2;
      if (((Class)localObject2).isArray())
      {
        paramType2 = ((Class)localObject2).getComponentType();
        paramType1 = a(paramType1, paramClass, paramType2, paramCollection);
        if (paramType2 == paramType1) {
          return (Type)localObject2;
        }
        return e(paramType1);
      }
    }
    if ((paramType2 instanceof GenericArrayType))
    {
      paramType2 = (GenericArrayType)paramType2;
      localObject2 = paramType2.getGenericComponentType();
      paramType1 = a(paramType1, paramClass, (Type)localObject2, paramCollection);
      if (localObject2 == paramType1) {
        return paramType2;
      }
      return e(paramType1);
    }
    Object localObject3;
    if ((paramType2 instanceof ParameterizedType))
    {
      localObject1 = (ParameterizedType)paramType2;
      paramType2 = ((ParameterizedType)localObject1).getOwnerType();
      localObject3 = a(paramType1, paramClass, paramType2, paramCollection);
      if (localObject3 != paramType2) {
        j = 1;
      } else {
        j = 0;
      }
      paramType2 = ((ParameterizedType)localObject1).getActualTypeArguments();
      int m = paramType2.length;
      while (i < m)
      {
        Type localType = a(paramType1, paramClass, paramType2[i], paramCollection);
        k = j;
        localObject2 = paramType2;
        if (localType != paramType2[i])
        {
          k = j;
          localObject2 = paramType2;
          if (j == 0)
          {
            localObject2 = (Type[])paramType2.clone();
            k = 1;
          }
          localObject2[i] = localType;
        }
        i++;
        j = k;
        paramType2 = (Type)localObject2;
      }
      if (j != 0) {
        return new yy((Type)localObject3, ((ParameterizedType)localObject1).getRawType(), paramType2);
      }
      return (Type)localObject1;
    }
    Object localObject2 = paramType2;
    if ((paramType2 instanceof WildcardType))
    {
      paramType2 = (WildcardType)paramType2;
      localObject3 = paramType2.getLowerBounds();
      localObject1 = paramType2.getUpperBounds();
      if (localObject3.length == 1)
      {
        paramType1 = a(paramType1, paramClass, localObject3[0], paramCollection);
        localObject2 = paramType2;
        if (paramType1 != localObject3[0])
        {
          if ((paramType1 instanceof WildcardType)) {
            paramType1 = ((WildcardType)paramType1).getLowerBounds();
          } else {
            paramType1 = new Type[] { paramType1 };
          }
          return new yx(new Type[] { Object.class }, paramType1);
        }
      }
      else
      {
        localObject2 = paramType2;
        if (localObject1.length == 1)
        {
          paramType1 = a(paramType1, paramClass, localObject1[0], paramCollection);
          localObject2 = paramType2;
          if (paramType1 != localObject1[0])
          {
            if ((paramType1 instanceof WildcardType)) {
              paramType1 = ((WildcardType)paramType1).getUpperBounds();
            } else {
              paramType1 = new Type[] { paramType1 };
            }
            return new yx(paramType1, a);
          }
        }
      }
    }
    return (Type)localObject2;
  }
  
  public static boolean a(Type paramType1, Type paramType2)
  {
    for (;;)
    {
      if (paramType1 == paramType2) {
        return true;
      }
      if ((paramType1 instanceof Class)) {
        return paramType1.equals(paramType2);
      }
      if ((paramType1 instanceof ParameterizedType))
      {
        if (!(paramType2 instanceof ParameterizedType)) {
          return false;
        }
        paramType1 = (ParameterizedType)paramType1;
        paramType2 = (ParameterizedType)paramType2;
        Type localType1 = paramType1.getOwnerType();
        Type localType2 = paramType2.getOwnerType();
        int i;
        if ((localType1 != localType2) && ((localType1 == null) || (!localType1.equals(localType2)))) {
          i = 0;
        } else {
          i = 1;
        }
        return (i != 0) && (paramType1.getRawType().equals(paramType2.getRawType())) && (Arrays.equals(paramType1.getActualTypeArguments(), paramType2.getActualTypeArguments()));
      }
      if (!(paramType1 instanceof GenericArrayType)) {
        break;
      }
      if (!(paramType2 instanceof GenericArrayType)) {
        return false;
      }
      paramType1 = (GenericArrayType)paramType1;
      paramType2 = (GenericArrayType)paramType2;
      paramType1 = paramType1.getGenericComponentType();
      paramType2 = paramType2.getGenericComponentType();
    }
    if ((paramType1 instanceof WildcardType))
    {
      if (!(paramType2 instanceof WildcardType)) {
        return false;
      }
      paramType1 = (WildcardType)paramType1;
      paramType2 = (WildcardType)paramType2;
      return (Arrays.equals(paramType1.getUpperBounds(), paramType2.getUpperBounds())) && (Arrays.equals(paramType1.getLowerBounds(), paramType2.getLowerBounds()));
    }
    if ((paramType1 instanceof TypeVariable))
    {
      if (!(paramType2 instanceof TypeVariable)) {
        return false;
      }
      paramType1 = (TypeVariable)paramType1;
      paramType2 = (TypeVariable)paramType2;
      if ((paramType1.getGenericDeclaration() == paramType2.getGenericDeclaration()) && (paramType1.getName().equals(paramType2.getName()))) {
        return true;
      }
    }
    return false;
  }
  
  public static Class<?> b(Type paramType)
  {
    for (;;)
    {
      if ((paramType instanceof Class)) {
        return (Class)paramType;
      }
      if ((paramType instanceof ParameterizedType))
      {
        paramType = ((ParameterizedType)paramType).getRawType();
        uw.a(paramType instanceof Class);
        return (Class)paramType;
      }
      if ((paramType instanceof GenericArrayType)) {
        return Array.newInstance(b(((GenericArrayType)paramType).getGenericComponentType()), 0).getClass();
      }
      if ((paramType instanceof TypeVariable)) {
        return Object.class;
      }
      if (!(paramType instanceof WildcardType)) {
        break;
      }
      paramType = ((WildcardType)paramType).getUpperBounds()[0];
    }
    String str;
    if (paramType == null) {
      str = "null";
    } else {
      str = paramType.getClass().getName();
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
    localStringBuilder.append(paramType);
    localStringBuilder.append("> is of type ");
    localStringBuilder.append(str);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private static Type b(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    Type localType = paramType;
    if ((paramType instanceof WildcardType)) {
      localType = ((WildcardType)paramType).getUpperBounds()[0];
    }
    uw.a(paramClass2.isAssignableFrom(paramClass1));
    return a(localType, paramClass1, a(localType, paramClass1, paramClass2));
  }
  
  public static Type[] b(Type paramType, Class<?> paramClass)
  {
    if (paramType == Properties.class) {
      return new Type[] { String.class, String.class };
    }
    paramType = b(paramType, paramClass, Map.class);
    if ((paramType instanceof ParameterizedType)) {
      return ((ParameterizedType)paramType).getActualTypeArguments();
    }
    return new Type[] { Object.class, Object.class };
  }
  
  public static String c(Type paramType)
  {
    if ((paramType instanceof Class)) {
      return ((Class)paramType).getName();
    }
    return paramType.toString();
  }
  
  public static void d(Type paramType)
  {
    boolean bool;
    if (((paramType instanceof Class)) && (((Class)paramType).isPrimitive())) {
      bool = false;
    } else {
      bool = true;
    }
    uw.a(bool);
  }
  
  private static GenericArrayType e(Type paramType)
  {
    return new yv(paramType);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */