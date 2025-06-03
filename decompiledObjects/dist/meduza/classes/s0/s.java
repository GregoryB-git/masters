package s0;

public enum s
{
  public static final s[] d;
  public final int a;
  
  static
  {
    Object localObject1 = z.f;
    s locals1 = new s("DOUBLE", 0, 0, 1, (z)localObject1);
    Object localObject2 = z.e;
    s locals2 = new s("FLOAT", 1, 1, 1, (z)localObject2);
    Object localObject3 = z.d;
    s locals3 = new s("INT64", 2, 2, 1, (z)localObject3);
    s locals4 = new s("UINT64", 3, 3, 1, (z)localObject3);
    Object localObject4 = z.c;
    s locals5 = new s("INT32", 4, 4, 1, (z)localObject4);
    s locals6 = new s("FIXED64", 5, 5, 1, (z)localObject3);
    s locals7 = new s("FIXED32", 6, 6, 1, (z)localObject4);
    Object localObject5 = z.o;
    s locals8 = new s("BOOL", 7, 7, 1, (z)localObject5);
    Object localObject6 = z.p;
    s locals9 = new s("STRING", 8, 8, 1, (z)localObject6);
    Object localObject7 = z.s;
    Object localObject8 = new s("MESSAGE", 9, 9, 1, (z)localObject7);
    Object localObject9 = z.q;
    s locals10 = new s("BYTES", 10, 10, 1, (z)localObject9);
    s locals11 = new s("UINT32", 11, 11, 1, (z)localObject4);
    Object localObject10 = z.r;
    s locals12 = new s("ENUM", 12, 12, 1, (z)localObject10);
    s locals13 = new s("SFIXED32", 13, 13, 1, (z)localObject4);
    s locals14 = new s("SFIXED64", 14, 14, 1, (z)localObject3);
    s locals15 = new s("SINT32", 15, 15, 1, (z)localObject4);
    s locals16 = new s("SINT64", 16, 16, 1, (z)localObject3);
    s locals17 = new s("GROUP", 17, 17, 1, (z)localObject7);
    s locals18 = new s("DOUBLE_LIST", 18, 18, 2, (z)localObject1);
    s locals19 = new s("FLOAT_LIST", 19, 19, 2, (z)localObject2);
    s locals20 = new s("INT64_LIST", 20, 20, 2, (z)localObject3);
    s locals21 = new s("UINT64_LIST", 21, 21, 2, (z)localObject3);
    s locals22 = new s("INT32_LIST", 22, 22, 2, (z)localObject4);
    s locals23 = new s("FIXED64_LIST", 23, 23, 2, (z)localObject3);
    s locals24 = new s("FIXED32_LIST", 24, 24, 2, (z)localObject4);
    s locals25 = new s("BOOL_LIST", 25, 25, 2, (z)localObject5);
    localObject6 = new s("STRING_LIST", 26, 26, 2, (z)localObject6);
    s locals26 = new s("MESSAGE_LIST", 27, 27, 2, (z)localObject7);
    s locals27 = new s("BYTES_LIST", 28, 28, 2, (z)localObject9);
    s locals28 = new s("UINT32_LIST", 29, 29, 2, (z)localObject4);
    s locals29 = new s("ENUM_LIST", 30, 30, 2, (z)localObject10);
    s locals30 = new s("SFIXED32_LIST", 31, 31, 2, (z)localObject4);
    localObject9 = new s("SFIXED64_LIST", 32, 32, 2, (z)localObject3);
    s locals31 = new s("SINT32_LIST", 33, 33, 2, (z)localObject4);
    s locals32 = new s("SINT64_LIST", 34, 34, 2, (z)localObject3);
    localObject1 = new s("DOUBLE_LIST_PACKED", 35, 35, 3, (z)localObject1);
    b = (s)localObject1;
    s locals33 = new s("FLOAT_LIST_PACKED", 36, 36, 3, (z)localObject2);
    localObject2 = new s("INT64_LIST_PACKED", 37, 37, 3, (z)localObject3);
    s locals34 = new s("UINT64_LIST_PACKED", 38, 38, 3, (z)localObject3);
    s locals35 = new s("INT32_LIST_PACKED", 39, 39, 3, (z)localObject4);
    s locals36 = new s("FIXED64_LIST_PACKED", 40, 40, 3, (z)localObject3);
    s locals37 = new s("FIXED32_LIST_PACKED", 41, 41, 3, (z)localObject4);
    localObject5 = new s("BOOL_LIST_PACKED", 42, 42, 3, (z)localObject5);
    s locals38 = new s("UINT32_LIST_PACKED", 43, 43, 3, (z)localObject4);
    s locals39 = new s("ENUM_LIST_PACKED", 44, 44, 3, (z)localObject10);
    s locals40 = new s("SFIXED32_LIST_PACKED", 45, 45, 3, (z)localObject4);
    localObject10 = new s("SFIXED64_LIST_PACKED", 46, 46, 3, (z)localObject3);
    localObject4 = new s("SINT32_LIST_PACKED", 47, 47, 3, (z)localObject4);
    localObject3 = new s("SINT64_LIST_PACKED", 48, 48, 3, (z)localObject3);
    c = (s)localObject3;
    localObject7 = new s("GROUP_LIST", 49, 49, 2, (z)localObject7);
    s locals41 = new s("MAP", 50, 50, 4, z.b);
    int i = 0;
    e = new s[] { locals1, locals2, locals3, locals4, locals5, locals6, locals7, locals8, locals9, localObject8, locals10, locals11, locals12, locals13, locals14, locals15, locals16, locals17, locals18, locals19, locals20, locals21, locals22, locals23, locals24, locals25, localObject6, locals26, locals27, locals28, locals29, locals30, localObject9, locals31, locals32, localObject1, locals33, localObject2, locals34, locals35, locals36, locals37, localObject5, locals38, locals39, locals40, localObject10, localObject4, localObject3, localObject7, locals41 };
    localObject8 = values();
    d = new s[localObject8.length];
    int j = localObject8.length;
    while (i < j)
    {
      locals22 = localObject8[i];
      d[a] = locals22;
      i++;
    }
  }
  
  public s(int paramInt, Object paramObject, z paramz)
  {
    a = paramInt;
    if (paramObject != 0)
    {
      ??? = paramObject - 1;
      if ((??? == 1) || (??? == 3)) {
        paramz.getClass();
      }
      if (paramObject == 1) {
        paramz.ordinal();
      }
      return;
    }
    throw null;
  }
  
  public final int f()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     s0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */