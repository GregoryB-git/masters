package ma;

public enum t
{
  public static final t[] d;
  public final int a;
  
  static
  {
    Object localObject1 = d0.f;
    t localt1 = new t("DOUBLE", 0, 0, 1, (d0)localObject1);
    Object localObject2 = d0.e;
    t localt2 = new t("FLOAT", 1, 1, 1, (d0)localObject2);
    Object localObject3 = d0.d;
    t localt3 = new t("INT64", 2, 2, 1, (d0)localObject3);
    t localt4 = new t("UINT64", 3, 3, 1, (d0)localObject3);
    Object localObject4 = d0.c;
    t localt5 = new t("INT32", 4, 4, 1, (d0)localObject4);
    t localt6 = new t("FIXED64", 5, 5, 1, (d0)localObject3);
    t localt7 = new t("FIXED32", 6, 6, 1, (d0)localObject4);
    Object localObject5 = d0.o;
    t localt8 = new t("BOOL", 7, 7, 1, (d0)localObject5);
    Object localObject6 = d0.p;
    t localt9 = new t("STRING", 8, 8, 1, (d0)localObject6);
    Object localObject7 = d0.s;
    t localt10 = new t("MESSAGE", 9, 9, 1, (d0)localObject7);
    Object localObject8 = d0.q;
    t localt11 = new t("BYTES", 10, 10, 1, (d0)localObject8);
    t localt12 = new t("UINT32", 11, 11, 1, (d0)localObject4);
    Object localObject9 = d0.r;
    t localt13 = new t("ENUM", 12, 12, 1, (d0)localObject9);
    t localt14 = new t("SFIXED32", 13, 13, 1, (d0)localObject4);
    t localt15 = new t("SFIXED64", 14, 14, 1, (d0)localObject3);
    t localt16 = new t("SINT32", 15, 15, 1, (d0)localObject4);
    t localt17 = new t("SINT64", 16, 16, 1, (d0)localObject3);
    t localt18 = new t("GROUP", 17, 17, 1, (d0)localObject7);
    t localt19 = new t("DOUBLE_LIST", 18, 18, 2, (d0)localObject1);
    t localt20 = new t("FLOAT_LIST", 19, 19, 2, (d0)localObject2);
    t localt21 = new t("INT64_LIST", 20, 20, 2, (d0)localObject3);
    t localt22 = new t("UINT64_LIST", 21, 21, 2, (d0)localObject3);
    t localt23 = new t("INT32_LIST", 22, 22, 2, (d0)localObject4);
    t localt24 = new t("FIXED64_LIST", 23, 23, 2, (d0)localObject3);
    Object localObject10 = new t("FIXED32_LIST", 24, 24, 2, (d0)localObject4);
    t localt25 = new t("BOOL_LIST", 25, 25, 2, (d0)localObject5);
    localObject6 = new t("STRING_LIST", 26, 26, 2, (d0)localObject6);
    t localt26 = new t("MESSAGE_LIST", 27, 27, 2, (d0)localObject7);
    t localt27 = new t("BYTES_LIST", 28, 28, 2, (d0)localObject8);
    t localt28 = new t("UINT32_LIST", 29, 29, 2, (d0)localObject4);
    t localt29 = new t("ENUM_LIST", 30, 30, 2, (d0)localObject9);
    localObject8 = new t("SFIXED32_LIST", 31, 31, 2, (d0)localObject4);
    t localt30 = new t("SFIXED64_LIST", 32, 32, 2, (d0)localObject3);
    t localt31 = new t("SINT32_LIST", 33, 33, 2, (d0)localObject4);
    t localt32 = new t("SINT64_LIST", 34, 34, 2, (d0)localObject3);
    localObject1 = new t("DOUBLE_LIST_PACKED", 35, 35, 3, (d0)localObject1);
    b = (t)localObject1;
    t localt33 = new t("FLOAT_LIST_PACKED", 36, 36, 3, (d0)localObject2);
    t localt34 = new t("INT64_LIST_PACKED", 37, 37, 3, (d0)localObject3);
    t localt35 = new t("UINT64_LIST_PACKED", 38, 38, 3, (d0)localObject3);
    t localt36 = new t("INT32_LIST_PACKED", 39, 39, 3, (d0)localObject4);
    localObject2 = new t("FIXED64_LIST_PACKED", 40, 40, 3, (d0)localObject3);
    t localt37 = new t("FIXED32_LIST_PACKED", 41, 41, 3, (d0)localObject4);
    localObject5 = new t("BOOL_LIST_PACKED", 42, 42, 3, (d0)localObject5);
    t localt38 = new t("UINT32_LIST_PACKED", 43, 43, 3, (d0)localObject4);
    localObject9 = new t("ENUM_LIST_PACKED", 44, 44, 3, (d0)localObject9);
    t localt39 = new t("SFIXED32_LIST_PACKED", 45, 45, 3, (d0)localObject4);
    t localt40 = new t("SFIXED64_LIST_PACKED", 46, 46, 3, (d0)localObject3);
    localObject4 = new t("SINT32_LIST_PACKED", 47, 47, 3, (d0)localObject4);
    localObject3 = new t("SINT64_LIST_PACKED", 48, 48, 3, (d0)localObject3);
    c = (t)localObject3;
    localObject7 = new t("GROUP_LIST", 49, 49, 2, (d0)localObject7);
    t localt41 = new t("MAP", 50, 50, 4, d0.b);
    int i = 0;
    e = new t[] { localt1, localt2, localt3, localt4, localt5, localt6, localt7, localt8, localt9, localt10, localt11, localt12, localt13, localt14, localt15, localt16, localt17, localt18, localt19, localt20, localt21, localt22, localt23, localt24, localObject10, localt25, localObject6, localt26, localt27, localt28, localt29, localObject8, localt30, localt31, localt32, localObject1, localt33, localt34, localt35, localt36, localObject2, localt37, localObject5, localt38, localObject9, localt39, localt40, localObject4, localObject3, localObject7, localt41 };
    localObject10 = values();
    d = new t[localObject10.length];
    int j = localObject10.length;
    while (i < j)
    {
      localt20 = localObject10[i];
      d[a] = localt20;
      i++;
    }
  }
  
  public t(int paramInt, Object paramObject, d0 paramd0)
  {
    a = paramInt;
    if (paramObject != 0)
    {
      ??? = paramObject - 1;
      if ((??? == 1) || (??? == 3)) {
        paramd0.getClass();
      }
      if (paramObject == 1) {
        paramd0.ordinal();
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
 * Qualified Name:     ma.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */