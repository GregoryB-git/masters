package g5;

public final class c
{
  public static final int[] e = { 31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017 };
  public static final c[] f = a();
  public final int a;
  public final int[] b;
  public final b[] c;
  public final int d;
  
  public c(int paramInt, int[] paramArrayOfInt, b... paramVarArgs)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramVarArgs;
    paramInt = 0;
    int i = paramVarArgs[0].b();
    paramVarArgs = paramVarArgs[0].a();
    int j = paramVarArgs.length;
    int k = 0;
    while (paramInt < j)
    {
      paramArrayOfInt = paramVarArgs[paramInt];
      k += paramArrayOfInt.a() * (paramArrayOfInt.b() + i);
      paramInt++;
    }
    d = k;
  }
  
  public static c[] a()
  {
    Object localObject1 = new b(7, new a[] { new a(1, 19) });
    Object localObject2 = new b(10, new a[] { new a(1, 16) });
    Object localObject3 = new b(13, new a[] { new a(1, 13) });
    Object localObject4 = new b(17, new a[] { new a(1, 9) });
    localObject4 = new c(1, new int[0], new b[] { localObject1, localObject2, localObject3, localObject4 });
    localObject2 = new b(10, new a[] { new a(1, 34) });
    localObject3 = new b(16, new a[] { new a(1, 28) });
    Object localObject5 = new b(22, new a[] { new a(1, 22) });
    localObject1 = new b(28, new a[] { new a(1, 16) });
    localObject2 = new c(2, new int[] { 6, 18 }, new b[] { localObject2, localObject3, localObject5, localObject1 });
    Object localObject6 = new b(15, new a[] { new a(1, 55) });
    localObject3 = new b(26, new a[] { new a(1, 44) });
    localObject5 = new b(18, new a[] { new a(2, 17) });
    localObject1 = new b(22, new a[] { new a(2, 13) });
    localObject3 = new c(3, new int[] { 6, 22 }, new b[] { localObject6, localObject3, localObject5, localObject1 });
    localObject1 = new b(20, new a[] { new a(1, 80) });
    localObject5 = new b(18, new a[] { new a(2, 32) });
    localObject6 = new b(26, new a[] { new a(2, 24) });
    Object localObject7 = new b(16, new a[] { new a(4, 9) });
    localObject1 = new c(4, new int[] { 6, 26 }, new b[] { localObject1, localObject5, localObject6, localObject7 });
    localObject6 = new b(26, new a[] { new a(1, 108) });
    localObject5 = new b(24, new a[] { new a(2, 43) });
    Object localObject8 = new b(18, new a[] { new a(2, 15), new a(2, 16) });
    localObject7 = new b(22, new a[] { new a(2, 11), new a(2, 12) });
    localObject5 = new c(5, new int[] { 6, 30 }, new b[] { localObject6, localObject5, localObject8, localObject7 });
    Object localObject9 = new b(18, new a[] { new a(2, 68) });
    localObject6 = new b(16, new a[] { new a(4, 27) });
    localObject7 = new b(24, new a[] { new a(4, 19) });
    localObject8 = new b(28, new a[] { new a(4, 15) });
    localObject6 = new c(6, new int[] { 6, 34 }, new b[] { localObject9, localObject6, localObject7, localObject8 });
    localObject7 = new b(20, new a[] { new a(2, 78) });
    localObject9 = new b(18, new a[] { new a(4, 31) });
    localObject8 = new b(18, new a[] { new a(2, 14), new a(4, 15) });
    Object localObject10 = new b(26, new a[] { new a(4, 13), new a(1, 14) });
    localObject7 = new c(7, new int[] { 6, 22, 38 }, new b[] { localObject7, localObject9, localObject8, localObject10 });
    Object localObject11 = new b(24, new a[] { new a(2, 97) });
    localObject9 = new b(22, new a[] { new a(2, 38), new a(2, 39) });
    localObject10 = new b(22, new a[] { new a(4, 18), new a(2, 19) });
    localObject8 = new b(26, new a[] { new a(4, 14), new a(2, 15) });
    localObject8 = new c(8, new int[] { 6, 24, 42 }, new b[] { localObject11, localObject9, localObject10, localObject8 });
    localObject9 = new b(30, new a[] { new a(2, 116) });
    localObject11 = new b(22, new a[] { new a(3, 36), new a(2, 37) });
    Object localObject12 = new b(20, new a[] { new a(4, 16), new a(4, 17) });
    localObject10 = new b(24, new a[] { new a(4, 12), new a(4, 13) });
    localObject9 = new c(9, new int[] { 6, 26, 46 }, new b[] { localObject9, localObject11, localObject12, localObject10 });
    localObject12 = new b(18, new a[] { new a(2, 68), new a(2, 69) });
    localObject10 = new b(26, new a[] { new a(4, 43), new a(1, 44) });
    Object localObject13 = new b(24, new a[] { new a(6, 19), new a(2, 20) });
    localObject11 = new b(28, new a[] { new a(6, 15), new a(2, 16) });
    localObject10 = new c(10, new int[] { 6, 28, 50 }, new b[] { localObject12, localObject10, localObject13, localObject11 });
    localObject13 = new b(20, new a[] { new a(4, 81) });
    localObject11 = new b(30, new a[] { new a(1, 50), new a(4, 51) });
    localObject12 = new b(28, new a[] { new a(4, 22), new a(4, 23) });
    Object localObject14 = new b(24, new a[] { new a(3, 12), new a(8, 13) });
    localObject11 = new c(11, new int[] { 6, 30, 54 }, new b[] { localObject13, localObject11, localObject12, localObject14 });
    localObject13 = new b(24, new a[] { new a(2, 92), new a(2, 93) });
    localObject14 = new b(22, new a[] { new a(6, 36), new a(2, 37) });
    Object localObject15 = new b(26, new a[] { new a(4, 20), new a(6, 21) });
    localObject12 = new b(28, new a[] { new a(7, 14), new a(4, 15) });
    localObject12 = new c(12, new int[] { 6, 32, 58 }, new b[] { localObject13, localObject14, localObject15, localObject12 });
    localObject14 = new b(26, new a[] { new a(4, 107) });
    localObject13 = new b(22, new a[] { new a(8, 37), new a(1, 38) });
    localObject15 = new b(24, new a[] { new a(8, 20), new a(4, 21) });
    Object localObject16 = new b(22, new a[] { new a(12, 11), new a(4, 12) });
    localObject13 = new c(13, new int[] { 6, 34, 62 }, new b[] { localObject14, localObject13, localObject15, localObject16 });
    localObject16 = new b(30, new a[] { new a(3, 115), new a(1, 116) });
    Object localObject17 = new b(24, new a[] { new a(4, 40), new a(5, 41) });
    localObject14 = new b(20, new a[] { new a(11, 16), new a(5, 17) });
    localObject15 = new b(24, new a[] { new a(11, 12), new a(5, 13) });
    localObject14 = new c(14, new int[] { 6, 26, 46, 66 }, new b[] { localObject16, localObject17, localObject14, localObject15 });
    localObject15 = new b(22, new a[] { new a(5, 87), new a(1, 88) });
    localObject17 = new b(24, new a[] { new a(5, 41), new a(5, 42) });
    Object localObject18 = new b(30, new a[] { new a(5, 24), new a(7, 25) });
    localObject16 = new b(24, new a[] { new a(11, 12), new a(7, 13) });
    localObject15 = new c(15, new int[] { 6, 26, 48, 70 }, new b[] { localObject15, localObject17, localObject18, localObject16 });
    localObject16 = new b(24, new a[] { new a(5, 98), new a(1, 99) });
    localObject17 = new b(28, new a[] { new a(7, 45), new a(3, 46) });
    Object localObject19 = new b(24, new a[] { new a(15, 19), new a(2, 20) });
    localObject18 = new b(30, new a[] { new a(3, 15), new a(13, 16) });
    localObject16 = new c(16, new int[] { 6, 26, 50, 74 }, new b[] { localObject16, localObject17, localObject19, localObject18 });
    localObject19 = new b(28, new a[] { new a(1, 107), new a(5, 108) });
    localObject17 = new b(28, new a[] { new a(10, 46), new a(1, 47) });
    Object localObject20 = new b(28, new a[] { new a(1, 22), new a(15, 23) });
    localObject18 = new b(28, new a[] { new a(2, 14), new a(17, 15) });
    localObject17 = new c(17, new int[] { 6, 30, 54, 78 }, new b[] { localObject19, localObject17, localObject20, localObject18 });
    localObject20 = new b(30, new a[] { new a(5, 120), new a(1, 121) });
    Object localObject21 = new b(26, new a[] { new a(9, 43), new a(4, 44) });
    localObject18 = new b(28, new a[] { new a(17, 22), new a(1, 23) });
    localObject19 = new b(28, new a[] { new a(2, 14), new a(19, 15) });
    localObject18 = new c(18, new int[] { 6, 30, 56, 82 }, new b[] { localObject20, localObject21, localObject18, localObject19 });
    Object localObject22 = new b(28, new a[] { new a(3, 113), new a(4, 114) });
    localObject19 = new b(26, new a[] { new a(3, 44), new a(11, 45) });
    localObject21 = new b(26, new a[] { new a(17, 21), new a(4, 22) });
    localObject20 = new b(26, new a[] { new a(9, 13), new a(16, 14) });
    localObject19 = new c(19, new int[] { 6, 30, 58, 86 }, new b[] { localObject22, localObject19, localObject21, localObject20 });
    localObject21 = new b(28, new a[] { new a(3, 107), new a(5, 108) });
    Object localObject23 = new b(26, new a[] { new a(3, 41), new a(13, 42) });
    localObject22 = new b(30, new a[] { new a(15, 24), new a(5, 25) });
    localObject20 = new b(28, new a[] { new a(15, 15), new a(10, 16) });
    localObject20 = new c(20, new int[] { 6, 34, 62, 90 }, new b[] { localObject21, localObject23, localObject22, localObject20 });
    localObject23 = new b(28, new a[] { new a(4, 116), new a(4, 117) });
    localObject22 = new b(26, new a[] { new a(17, 42) });
    Object localObject24 = new b(28, new a[] { new a(17, 22), new a(6, 23) });
    localObject21 = new b(30, new a[] { new a(19, 16), new a(6, 17) });
    localObject21 = new c(21, new int[] { 6, 28, 50, 72, 94 }, new b[] { localObject23, localObject22, localObject24, localObject21 });
    localObject24 = new b(28, new a[] { new a(2, 111), new a(7, 112) });
    Object localObject25 = new b(28, new a[] { new a(17, 46) });
    localObject23 = new b(30, new a[] { new a(7, 24), new a(16, 25) });
    localObject22 = new b(24, new a[] { new a(34, 13) });
    localObject22 = new c(22, new int[] { 6, 26, 50, 74, 98 }, new b[] { localObject24, localObject25, localObject23, localObject22 });
    localObject24 = new b(30, new a[] { new a(4, 121), new a(5, 122) });
    localObject25 = new b(28, new a[] { new a(4, 47), new a(14, 48) });
    Object localObject26 = new b(30, new a[] { new a(11, 24), new a(14, 25) });
    localObject23 = new b(30, new a[] { new a(16, 15), new a(14, 16) });
    localObject23 = new c(23, new int[] { 6, 30, 54, 78, 102 }, new b[] { localObject24, localObject25, localObject26, localObject23 });
    localObject26 = new b(30, new a[] { new a(6, 117), new a(4, 118) });
    localObject24 = new b(28, new a[] { new a(6, 45), new a(14, 46) });
    localObject25 = new b(30, new a[] { new a(11, 24), new a(16, 25) });
    Object localObject27 = new b(30, new a[] { new a(30, 16), new a(2, 17) });
    localObject24 = new c(24, new int[] { 6, 28, 54, 80, 106 }, new b[] { localObject26, localObject24, localObject25, localObject27 });
    localObject25 = new b(26, new a[] { new a(8, 106), new a(4, 107) });
    localObject26 = new b(28, new a[] { new a(8, 47), new a(13, 48) });
    Object localObject28 = new b(30, new a[] { new a(7, 24), new a(22, 25) });
    localObject27 = new b(30, new a[] { new a(22, 15), new a(13, 16) });
    localObject25 = new c(25, new int[] { 6, 32, 58, 84, 110 }, new b[] { localObject25, localObject26, localObject28, localObject27 });
    localObject28 = new b(28, new a[] { new a(10, 114), new a(2, 115) });
    Object localObject29 = new b(28, new a[] { new a(19, 46), new a(4, 47) });
    localObject27 = new b(28, new a[] { new a(28, 22), new a(6, 23) });
    localObject26 = new b(30, new a[] { new a(33, 16), new a(4, 17) });
    localObject26 = new c(26, new int[] { 6, 30, 58, 86, 114 }, new b[] { localObject28, localObject29, localObject27, localObject26 });
    Object localObject30 = new b(30, new a[] { new a(8, 122), new a(4, 123) });
    localObject27 = new b(28, new a[] { new a(22, 45), new a(3, 46) });
    localObject28 = new b(30, new a[] { new a(8, 23), new a(26, 24) });
    localObject29 = new b(30, new a[] { new a(12, 15), new a(28, 16) });
    localObject27 = new c(27, new int[] { 6, 34, 62, 90, 118 }, new b[] { localObject30, localObject27, localObject28, localObject29 });
    Object localObject31 = new b(30, new a[] { new a(3, 117), new a(10, 118) });
    localObject28 = new b(28, new a[] { new a(3, 45), new a(23, 46) });
    localObject29 = new b(30, new a[] { new a(4, 24), new a(31, 25) });
    localObject30 = new b(30, new a[] { new a(11, 15), new a(31, 16) });
    localObject28 = new c(28, new int[] { 6, 26, 50, 74, 98, 122 }, new b[] { localObject31, localObject28, localObject29, localObject30 });
    localObject31 = new b(30, new a[] { new a(7, 116), new a(7, 117) });
    localObject30 = new b(28, new a[] { new a(21, 45), new a(7, 46) });
    localObject29 = new b(30, new a[] { new a(1, 23), new a(37, 24) });
    Object localObject32 = new b(30, new a[] { new a(19, 15), new a(26, 16) });
    localObject29 = new c(29, new int[] { 6, 30, 54, 78, 102, 126 }, new b[] { localObject31, localObject30, localObject29, localObject32 });
    localObject32 = new b(30, new a[] { new a(5, 115), new a(10, 116) });
    localObject31 = new b(28, new a[] { new a(19, 47), new a(10, 48) });
    localObject30 = new b(30, new a[] { new a(15, 24), new a(25, 25) });
    Object localObject33 = new b(30, new a[] { new a(23, 15), new a(25, 16) });
    localObject30 = new c(30, new int[] { 6, 26, 52, 78, 104, 130 }, new b[] { localObject32, localObject31, localObject30, localObject33 });
    Object localObject34 = new b(30, new a[] { new a(13, 115), new a(3, 116) });
    localObject33 = new b(28, new a[] { new a(2, 46), new a(29, 47) });
    localObject32 = new b(30, new a[] { new a(42, 24), new a(1, 25) });
    localObject31 = new b(30, new a[] { new a(23, 15), new a(28, 16) });
    localObject31 = new c(31, new int[] { 6, 30, 56, 82, 108, 134 }, new b[] { localObject34, localObject33, localObject32, localObject31 });
    localObject32 = new b(30, new a[] { new a(17, 115) });
    Object localObject35 = new b(28, new a[] { new a(10, 46), new a(23, 47) });
    localObject33 = new b(30, new a[] { new a(10, 24), new a(35, 25) });
    localObject34 = new b(30, new a[] { new a(19, 15), new a(35, 16) });
    localObject32 = new c(32, new int[] { 6, 34, 60, 86, 112, 138 }, new b[] { localObject32, localObject35, localObject33, localObject34 });
    localObject34 = new b(30, new a[] { new a(17, 115), new a(1, 116) });
    localObject35 = new b(28, new a[] { new a(14, 46), new a(21, 47) });
    Object localObject36 = new b(30, new a[] { new a(29, 24), new a(19, 25) });
    localObject33 = new b(30, new a[] { new a(11, 15), new a(46, 16) });
    localObject33 = new c(33, new int[] { 6, 30, 58, 86, 114, 142 }, new b[] { localObject34, localObject35, localObject36, localObject33 });
    localObject35 = new b(30, new a[] { new a(13, 115), new a(6, 116) });
    localObject34 = new b(28, new a[] { new a(14, 46), new a(23, 47) });
    localObject36 = new b(30, new a[] { new a(44, 24), new a(7, 25) });
    Object localObject37 = new b(30, new a[] { new a(59, 16), new a(1, 17) });
    localObject34 = new c(34, new int[] { 6, 34, 62, 90, 118, 146 }, new b[] { localObject35, localObject34, localObject36, localObject37 });
    localObject36 = new b(30, new a[] { new a(12, 121), new a(7, 122) });
    localObject35 = new b(28, new a[] { new a(12, 47), new a(26, 48) });
    Object localObject38 = new b(30, new a[] { new a(39, 24), new a(14, 25) });
    localObject37 = new b(30, new a[] { new a(22, 15), new a(41, 16) });
    localObject35 = new c(35, new int[] { 6, 30, 54, 78, 102, 126, 150 }, new b[] { localObject36, localObject35, localObject38, localObject37 });
    b localb1 = new b(30, new a[] { new a(6, 121), new a(14, 122) });
    localObject37 = new b(28, new a[] { new a(6, 47), new a(34, 48) });
    localObject36 = new b(30, new a[] { new a(46, 24), new a(10, 25) });
    localObject38 = new b(30, new a[] { new a(2, 15), new a(64, 16) });
    localObject36 = new c(36, new int[] { 6, 24, 50, 76, 102, 128, 154 }, new b[] { localb1, localObject37, localObject36, localObject38 });
    b localb2 = new b(30, new a[] { new a(17, 122), new a(4, 123) });
    localObject38 = new b(28, new a[] { new a(29, 46), new a(14, 47) });
    localb1 = new b(30, new a[] { new a(49, 24), new a(10, 25) });
    localObject37 = new b(30, new a[] { new a(24, 15), new a(46, 16) });
    localObject37 = new c(37, new int[] { 6, 28, 54, 80, 106, 132, 158 }, new b[] { localb2, localObject38, localb1, localObject37 });
    Object localObject39 = new b(30, new a[] { new a(4, 122), new a(18, 123) });
    localb1 = new b(28, new a[] { new a(13, 46), new a(32, 47) });
    localObject38 = new b(30, new a[] { new a(48, 24), new a(14, 25) });
    localb2 = new b(30, new a[] { new a(42, 15), new a(32, 16) });
    localObject38 = new c(38, new int[] { 6, 32, 58, 84, 110, 136, 162 }, new b[] { localObject39, localb1, localObject38, localb2 });
    localb2 = new b(30, new a[] { new a(20, 117), new a(4, 118) });
    localb1 = new b(28, new a[] { new a(40, 47), new a(7, 48) });
    b localb3 = new b(30, new a[] { new a(43, 24), new a(22, 25) });
    localObject39 = new b(30, new a[] { new a(10, 15), new a(67, 16) });
    localObject39 = new c(39, new int[] { 6, 26, 54, 82, 110, 138, 166 }, new b[] { localb2, localb1, localb3, localObject39 });
    localb2 = new b(30, new a[] { new a(19, 118), new a(6, 119) });
    localb3 = new b(28, new a[] { new a(18, 47), new a(31, 48) });
    b localb4 = new b(30, new a[] { new a(34, 24), new a(34, 25) });
    localb1 = new b(30, new a[] { new a(20, 15), new a(61, 16) });
    return new c[] { localObject4, localObject2, localObject3, localObject1, localObject5, localObject6, localObject7, localObject8, localObject9, localObject10, localObject11, localObject12, localObject13, localObject14, localObject15, localObject16, localObject17, localObject18, localObject19, localObject20, localObject21, localObject22, localObject23, localObject24, localObject25, localObject26, localObject27, localObject28, localObject29, localObject30, localObject31, localObject32, localObject33, localObject34, localObject35, localObject36, localObject37, localObject38, localObject39, new c(40, new int[] { 6, 30, 58, 86, 114, 142, 170 }, new b[] { localb2, localb3, localb4, localb1 }) };
  }
  
  public static c e(int paramInt)
  {
    if ((paramInt > 0) && (paramInt <= 40)) {
      return f[(paramInt - 1)];
    }
    throw new IllegalArgumentException();
  }
  
  public int b()
  {
    return a * 4 + 17;
  }
  
  public b c(a parama)
  {
    return c[parama.ordinal()];
  }
  
  public int d()
  {
    return d;
  }
  
  public int f()
  {
    return a;
  }
  
  public String toString()
  {
    return String.valueOf(a);
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
    
    public int a()
    {
      return a;
    }
    
    public int b()
    {
      return b;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final c.a[] b;
    
    public b(int paramInt, c.a... paramVarArgs)
    {
      a = paramInt;
      b = paramVarArgs;
    }
    
    public c.a[] a()
    {
      return b;
    }
    
    public int b()
    {
      return a;
    }
    
    public int c()
    {
      c.a[] arrayOfa = b;
      int i = arrayOfa.length;
      int j = 0;
      int k = 0;
      while (j < i)
      {
        k += arrayOfa[j].a();
        j++;
      }
      return k;
    }
    
    public int d()
    {
      return a * c();
    }
  }
}

/* Location:
 * Qualified Name:     g5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */