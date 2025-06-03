package H1;

import kotlin.jvm.internal.Intrinsics;

public final class i
{
  public static final i a = new i();
  
  /* Error */
  public static final void a(a parama1, a parama2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 24
    //   12: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 32
    //   18: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_0
    //   22: iconst_0
    //   23: invokevirtual 37	H1/a:b	(I)I
    //   26: istore_2
    //   27: aload_0
    //   28: iconst_1
    //   29: invokevirtual 37	H1/a:b	(I)I
    //   32: istore_3
    //   33: aload_0
    //   34: iconst_2
    //   35: invokevirtual 37	H1/a:b	(I)I
    //   38: istore 4
    //   40: aload_0
    //   41: invokevirtual 40	H1/a:a	()[F
    //   44: astore_0
    //   45: aload_1
    //   46: invokevirtual 40	H1/a:a	()[F
    //   49: astore_1
    //   50: iload_2
    //   51: ifle +123 -> 174
    //   54: iconst_0
    //   55: istore 5
    //   57: iload 5
    //   59: iconst_1
    //   60: iadd
    //   61: istore 6
    //   63: iload_3
    //   64: ifle +94 -> 158
    //   67: iconst_0
    //   68: istore 7
    //   70: iload 7
    //   72: iconst_1
    //   73: iadd
    //   74: istore 8
    //   76: iload 4
    //   78: ifle +64 -> 142
    //   81: iconst_0
    //   82: istore 9
    //   84: iload 9
    //   86: iconst_1
    //   87: iadd
    //   88: istore 10
    //   90: iload 5
    //   92: iload_3
    //   93: imul
    //   94: iload 4
    //   96: imul
    //   97: iload 7
    //   99: iload 4
    //   101: imul
    //   102: iadd
    //   103: iload 9
    //   105: iadd
    //   106: istore 11
    //   108: aload_0
    //   109: iload 11
    //   111: aload_0
    //   112: iload 11
    //   114: faload
    //   115: aload_1
    //   116: iload 9
    //   118: faload
    //   119: fadd
    //   120: fastore
    //   121: iload 10
    //   123: iload 4
    //   125: if_icmplt +6 -> 131
    //   128: goto +14 -> 142
    //   131: iload 10
    //   133: istore 9
    //   135: goto -51 -> 84
    //   138: astore_0
    //   139: goto +36 -> 175
    //   142: iload 8
    //   144: iload_3
    //   145: if_icmplt +6 -> 151
    //   148: goto +10 -> 158
    //   151: iload 8
    //   153: istore 7
    //   155: goto -85 -> 70
    //   158: iload 6
    //   160: iload_2
    //   161: if_icmplt +6 -> 167
    //   164: goto +10 -> 174
    //   167: iload 6
    //   169: istore 5
    //   171: goto -114 -> 57
    //   174: return
    //   175: aload_0
    //   176: ldc 2
    //   178: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   181: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	parama1	a
    //   0	182	1	parama2	a
    //   26	136	2	i	int
    //   32	114	3	j	int
    //   38	88	4	k	int
    //   55	115	5	m	int
    //   61	107	6	n	int
    //   68	86	7	i1	int
    //   74	78	8	i2	int
    //   82	52	9	i3	int
    //   88	44	10	i4	int
    //   106	7	11	i5	int
    // Exception table:
    //   from	to	target	type
    //   9	50	138	finally
  }
  
  public static final a b(a[] paramArrayOfa)
  {
    if (T1.a.d(i.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramArrayOfa, "tensors");
      int i = paramArrayOfa[0].b(0);
      int j = paramArrayOfa.length - 1;
      int k;
      int m;
      int n;
      if (j >= 0)
      {
        k = 0;
        m = k;
        for (;;)
        {
          n = k + 1;
          m += paramArrayOfa[k].b(1);
          if (n > j)
          {
            k = m;
            break;
          }
          k = n;
        }
      }
      a locala;
      float[] arrayOfFloat1;
      int i1;
      int i2;
      int i3;
      float[] arrayOfFloat2;
      label215:
      return null;
    }
    finally
    {
      break label215;
      k = 0;
      locala = new H1/a;
      locala.<init>(new int[] { i, k });
      arrayOfFloat1 = locala.a();
      if (i > 0) {
        for (m = 0;; m = i1)
        {
          i1 = m + 1;
          n = m * k;
          i2 = paramArrayOfa.length - 1;
          if (i2 >= 0) {
            for (j = 0;; j = i3)
            {
              i3 = j + 1;
              arrayOfFloat2 = paramArrayOfa[j].a();
              j = paramArrayOfa[j].b(1);
              System.arraycopy(arrayOfFloat2, m * j, arrayOfFloat1, n, j);
              n += j;
              if (i3 > i2) {
                break;
              }
            }
          }
          if (i1 >= i) {
            break;
          }
        }
      }
      return locala;
      T1.a.b(paramArrayOfa, i.class);
    }
  }
  
  public static final a c(a parama1, a parama2)
  {
    Class localClass = i.class;
    if (T1.a.d(i.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        Intrinsics.checkNotNullParameter(parama1, "x");
        Intrinsics.checkNotNullParameter(parama2, "w");
        i = parama1.b(0);
        int j = parama1.b(1);
        int k = parama1.b(2);
        m = parama2.b(0);
        n = j - m + 1;
        i1 = parama2.b(2);
        locala = new H1/a;
        locala.<init>(new int[] { i, n, i1 });
        float[] arrayOfFloat1 = parama1.a();
        arrayOfFloat2 = locala.a();
        float[] arrayOfFloat3 = parama2.a();
        if (i <= 0) {
          continue;
        }
        i2 = 0;
        parama2 = locala;
        parama1 = localClass;
        i3 = i2 + 1;
        if (i1 <= 0) {
          continue;
        }
        i4 = 0;
        i5 = i4 + 1;
        if (n <= 0) {
          continue;
        }
        i6 = 0;
        locala = parama1;
        i7 = i6 + 1;
        f1 = 0.0F;
        f2 = 0.0F;
        if (m <= 0) {
          continue;
        }
        i8 = 0;
        parama1 = parama2;
        parama2 = locala;
        i9 = i8 + 1;
        if (k > 0)
        {
          int i10 = 0;
          int i11 = i10 + 1;
          f2 += arrayOfFloat1[(j * k * i2 + (i8 + i6) * k + i10)] * arrayOfFloat3[((i8 * k + i10) * i1 + i4)];
          if (i11 < k)
          {
            i10 = i11;
            continue;
          }
        }
      }
      finally
      {
        int i;
        int m;
        int n;
        int i1;
        a locala;
        float[] arrayOfFloat2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f1;
        float f2;
        int i8;
        int i9;
        continue;
        T1.a.b(parama1, i.class);
      }
      if (i9 < m)
      {
        i8 = i9;
        continue;
        parama1 = parama2;
        parama2 = locala;
        f2 = f1;
      }
      else
      {
        arrayOfFloat2[(n * i1 * i2 + i6 * i1 + i4)] = f2;
        if (i7 < n)
        {
          i6 = i7;
          locala = parama2;
          parama2 = parama1;
          continue;
          locala = parama1;
          parama1 = parama2;
          parama2 = locala;
        }
        else if (i5 < i1)
        {
          i4 = i5;
          locala = parama1;
          parama1 = parama2;
          parama2 = locala;
          continue;
          locala = parama1;
          parama1 = parama2;
          parama2 = locala;
        }
        else
        {
          if (i3 >= i) {
            continue;
          }
          i2 = i3;
          locala = parama2;
          parama2 = parama1;
          parama1 = locala;
        }
      }
    }
    parama1 = locala;
    return parama1;
    return null;
  }
  
  /* Error */
  public static final a d(a parama1, a parama2, a parama3)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 24
    //   13: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ldc 59
    //   19: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: ldc 32
    //   25: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   28: aload_0
    //   29: iconst_0
    //   30: invokevirtual 37	H1/a:b	(I)I
    //   33: istore_3
    //   34: aload_2
    //   35: iconst_0
    //   36: invokevirtual 37	H1/a:b	(I)I
    //   39: istore 4
    //   41: aload_0
    //   42: aload_1
    //   43: invokestatic 63	H1/i:h	(LH1/a;LH1/a;)LH1/a;
    //   46: astore_0
    //   47: aload_2
    //   48: invokevirtual 40	H1/a:a	()[F
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 40	H1/a:a	()[F
    //   56: astore_2
    //   57: iload_3
    //   58: ifle +86 -> 144
    //   61: iconst_0
    //   62: istore 5
    //   64: iload 5
    //   66: iconst_1
    //   67: iadd
    //   68: istore 6
    //   70: iload 4
    //   72: ifle +56 -> 128
    //   75: iconst_0
    //   76: istore 7
    //   78: iload 7
    //   80: iconst_1
    //   81: iadd
    //   82: istore 8
    //   84: iload 5
    //   86: iload 4
    //   88: imul
    //   89: iload 7
    //   91: iadd
    //   92: istore 9
    //   94: aload_2
    //   95: iload 9
    //   97: aload_2
    //   98: iload 9
    //   100: faload
    //   101: aload_1
    //   102: iload 7
    //   104: faload
    //   105: fadd
    //   106: fastore
    //   107: iload 8
    //   109: iload 4
    //   111: if_icmplt +6 -> 117
    //   114: goto +14 -> 128
    //   117: iload 8
    //   119: istore 7
    //   121: goto -43 -> 78
    //   124: astore_0
    //   125: goto +21 -> 146
    //   128: iload 6
    //   130: iload_3
    //   131: if_icmplt +6 -> 137
    //   134: goto +10 -> 144
    //   137: iload 6
    //   139: istore 5
    //   141: goto -77 -> 64
    //   144: aload_0
    //   145: areturn
    //   146: aload_0
    //   147: ldc 2
    //   149: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   152: aconst_null
    //   153: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	parama1	a
    //   0	154	1	parama2	a
    //   0	154	2	parama3	a
    //   33	99	3	i	int
    //   39	73	4	j	int
    //   62	78	5	k	int
    //   68	70	6	m	int
    //   76	44	7	n	int
    //   82	36	8	i1	int
    //   92	7	9	i2	int
    // Exception table:
    //   from	to	target	type
    //   10	57	124	finally
  }
  
  public static final a e(String[] paramArrayOfString, int paramInt, a parama)
  {
    if (T1.a.d(i.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramArrayOfString, "texts");
      Intrinsics.checkNotNullParameter(parama, "w");
      i = paramArrayOfString.length;
      j = parama.b(1);
      locala = new H1/a;
      locala.<init>(new int[] { i, paramInt, j });
      arrayOfFloat = locala.a();
      parama = parama.a();
      if (i <= 0) {
        break label174;
      }
      k = 0;
    }
    finally
    {
      for (;;)
      {
        int i;
        int j;
        a locala;
        float[] arrayOfFloat;
        int k;
        int m;
        int[] arrayOfInt;
        int n;
        int i1;
        break;
        if (m < i) {
          k = m;
        } else {
          return locala;
        }
      }
      T1.a.b(paramArrayOfString, i.class);
    }
    m = k + 1;
    arrayOfInt = j.a.d(paramArrayOfString[k], paramInt);
    if (paramInt > 0) {
      for (n = 0;; n = i1)
      {
        i1 = n + 1;
        System.arraycopy(parama, arrayOfInt[n] * j, arrayOfFloat, j * paramInt * k + n * j, j);
        if (i1 >= paramInt) {
          break;
        }
      }
    }
    label174:
    return null;
  }
  
  public static final void f(a parama, int paramInt)
  {
    if (T1.a.d(i.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "x");
      if (paramInt >= parama.c()) {
        return;
      }
      int i = parama.c();
      int j = 1;
      int k = 1;
      int m;
      if (paramInt < i)
      {
        m = paramInt;
        j = k;
        for (;;)
        {
          k = m + 1;
          j *= parama.b(m);
          if (k >= i) {
            break;
          }
          m = k;
        }
      }
      int[] arrayOfInt;
      label139:
      return;
    }
    finally
    {
      break label139;
      arrayOfInt = new int[paramInt + 1];
      if (paramInt > 0) {
        for (m = 0;; m = k)
        {
          k = m + 1;
          arrayOfInt[m] = parama.b(m);
          if (k >= paramInt) {
            break;
          }
        }
      }
      arrayOfInt[paramInt] = j;
      parama.d(arrayOfInt);
      return;
      T1.a.b(parama, i.class);
    }
  }
  
  public static final a g(a parama, int paramInt)
  {
    if (T1.a.d(i.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "x");
      i = parama.b(0);
      j = parama.b(1);
      k = parama.b(2);
      m = j - paramInt + 1;
      locala = new H1/a;
      locala.<init>(new int[] { i, m, k });
      parama = parama.a();
      arrayOfFloat = locala.a();
      if (i <= 0) {
        break label275;
      }
      n = 0;
    }
    finally
    {
      for (;;)
      {
        int i;
        int j;
        int k;
        int m;
        a locala;
        float[] arrayOfFloat;
        int n;
        int i1;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        break;
        if (i5 < m) {
          i4 = i5;
        } else if (i3 < k) {
          i2 = i3;
        } else if (i1 < i) {
          n = i1;
        } else {
          return locala;
        }
      }
      T1.a.b(parama, i.class);
    }
    i1 = n + 1;
    if (k > 0)
    {
      i2 = 0;
      i3 = i2 + 1;
      if (m > 0)
      {
        i4 = 0;
        i5 = i4 + 1;
        i6 = i4 * k;
        i7 = n * m * k + i6 + i2;
        arrayOfFloat[i7] = Float.MIN_VALUE;
        if (paramInt > 0)
        {
          i8 = 0;
          i4 = j;
          for (;;)
          {
            int i9 = i8 + 1;
            arrayOfFloat[i7] = Math.max(arrayOfFloat[i7], parama[(n * j * k + i6 + i2 + i8 * k)]);
            if (i9 >= paramInt)
            {
              j = i4;
              break;
            }
            i8 = i9;
          }
        }
      }
    }
    label275:
    return null;
  }
  
  /* Error */
  public static final a h(a parama1, a parama2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 24
    //   13: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ldc 59
    //   19: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_0
    //   23: iconst_0
    //   24: invokevirtual 37	H1/a:b	(I)I
    //   27: istore_2
    //   28: aload_1
    //   29: iconst_0
    //   30: invokevirtual 37	H1/a:b	(I)I
    //   33: istore_3
    //   34: aload_1
    //   35: iconst_1
    //   36: invokevirtual 37	H1/a:b	(I)I
    //   39: istore 4
    //   41: new 34	H1/a
    //   44: astore 5
    //   46: aload 5
    //   48: iconst_2
    //   49: newarray <illegal type>
    //   51: dup
    //   52: iconst_0
    //   53: iload_2
    //   54: iastore
    //   55: dup
    //   56: iconst_1
    //   57: iload 4
    //   59: iastore
    //   60: invokespecial 49	H1/a:<init>	([I)V
    //   63: aload_0
    //   64: invokevirtual 40	H1/a:a	()[F
    //   67: astore_0
    //   68: aload_1
    //   69: invokevirtual 40	H1/a:a	()[F
    //   72: astore 6
    //   74: aload 5
    //   76: invokevirtual 40	H1/a:a	()[F
    //   79: astore_1
    //   80: iload_2
    //   81: ifle +137 -> 218
    //   84: iconst_0
    //   85: istore 7
    //   87: iload 7
    //   89: iconst_1
    //   90: iadd
    //   91: istore 8
    //   93: iload 4
    //   95: ifle +107 -> 202
    //   98: iconst_0
    //   99: istore 9
    //   101: iload 9
    //   103: iconst_1
    //   104: iadd
    //   105: istore 10
    //   107: iload 7
    //   109: iload 4
    //   111: imul
    //   112: iload 9
    //   114: iadd
    //   115: istore 11
    //   117: aload_1
    //   118: iload 11
    //   120: fconst_0
    //   121: fastore
    //   122: iload_3
    //   123: ifle +62 -> 185
    //   126: iconst_0
    //   127: istore 12
    //   129: iload 12
    //   131: iconst_1
    //   132: iadd
    //   133: istore 13
    //   135: aload_1
    //   136: iload 11
    //   138: aload_1
    //   139: iload 11
    //   141: faload
    //   142: aload_0
    //   143: iload 7
    //   145: iload_3
    //   146: imul
    //   147: iload 12
    //   149: iadd
    //   150: faload
    //   151: aload 6
    //   153: iload 12
    //   155: iload 4
    //   157: imul
    //   158: iload 9
    //   160: iadd
    //   161: faload
    //   162: fmul
    //   163: fadd
    //   164: fastore
    //   165: iload 13
    //   167: iload_3
    //   168: if_icmplt +6 -> 174
    //   171: goto +14 -> 185
    //   174: iload 13
    //   176: istore 12
    //   178: goto -49 -> 129
    //   181: astore_0
    //   182: goto +39 -> 221
    //   185: iload 10
    //   187: iload 4
    //   189: if_icmplt +6 -> 195
    //   192: goto +10 -> 202
    //   195: iload 10
    //   197: istore 9
    //   199: goto -98 -> 101
    //   202: iload 8
    //   204: iload_2
    //   205: if_icmplt +6 -> 211
    //   208: goto +10 -> 218
    //   211: iload 8
    //   213: istore 7
    //   215: goto -128 -> 87
    //   218: aload 5
    //   220: areturn
    //   221: aload_0
    //   222: ldc 2
    //   224: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   227: aconst_null
    //   228: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	parama1	a
    //   0	229	1	parama2	a
    //   27	179	2	i	int
    //   33	136	3	j	int
    //   39	151	4	k	int
    //   44	175	5	locala	a
    //   72	80	6	arrayOfFloat	float[]
    //   85	129	7	m	int
    //   91	121	8	n	int
    //   99	99	9	i1	int
    //   105	91	10	i2	int
    //   115	25	11	i3	int
    //   127	50	12	i4	int
    //   133	42	13	i5	int
    // Exception table:
    //   from	to	target	type
    //   10	80	181	finally
  }
  
  /* Error */
  public static final void i(a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 24
    //   12: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokevirtual 40	H1/a:a	()[F
    //   19: astore_0
    //   20: aload_0
    //   21: arraylength
    //   22: iconst_1
    //   23: isub
    //   24: istore_1
    //   25: iload_1
    //   26: iflt +41 -> 67
    //   29: iconst_0
    //   30: istore_2
    //   31: iload_2
    //   32: iconst_1
    //   33: iadd
    //   34: istore_3
    //   35: aload_0
    //   36: iload_2
    //   37: faload
    //   38: fconst_0
    //   39: fcmpg
    //   40: ifge +14 -> 54
    //   43: aload_0
    //   44: iload_2
    //   45: fconst_0
    //   46: fastore
    //   47: goto +7 -> 54
    //   50: astore_0
    //   51: goto +17 -> 68
    //   54: iload_3
    //   55: iload_1
    //   56: if_icmple +6 -> 62
    //   59: goto +8 -> 67
    //   62: iload_3
    //   63: istore_2
    //   64: goto -33 -> 31
    //   67: return
    //   68: aload_0
    //   69: ldc 2
    //   71: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   74: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	parama	a
    //   24	33	1	i	int
    //   30	34	2	j	int
    //   34	29	3	k	int
    // Exception table:
    //   from	to	target	type
    //   9	25	50	finally
  }
  
  public static final void j(a parama)
  {
    if (T1.a.d(i.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "x");
      i = 0;
      j = parama.b(0);
      k = parama.b(1);
      parama = parama.a();
      if (j <= 0) {
        break label242;
      }
    }
    finally
    {
      for (;;)
      {
        int i;
        int j;
        int k;
        int m;
        int n;
        float f1;
        int i1;
        int i2;
        break;
        float f2 = 0.0F;
        float f3 = 0.0F;
        if (i < n)
        {
          i1 = i;
          f2 = f3;
          for (;;)
          {
            i2 = i1 + 1;
            f3 = (float)Math.exp(parama[i1] - f1);
            parama[i1] = f3;
            f2 += f3;
            if (i2 >= n) {
              break;
            }
            i1 = i2;
          }
        }
        if (i < n) {
          for (;;)
          {
            i1 = i + 1;
            parama[i] /= f2;
            if (i1 >= n) {
              break;
            }
            i = i1;
          }
        }
        if (m < j) {
          i = m;
        } else {
          return;
        }
      }
      T1.a.b(parama, i.class);
    }
    m = i + 1;
    i *= k;
    n = i + k;
    f1 = Float.MIN_VALUE;
    f2 = Float.MIN_VALUE;
    if (i < n)
    {
      i1 = i;
      for (;;)
      {
        i2 = i1 + 1;
        f3 = parama[i1];
        f1 = f2;
        if (f3 > f2) {
          f1 = f3;
        }
        if (i2 >= n) {
          break;
        }
        i1 = i2;
        f2 = f1;
      }
    }
    label242:
  }
  
  /* Error */
  public static final a k(a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 24
    //   13: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_0
    //   17: iconst_0
    //   18: invokevirtual 37	H1/a:b	(I)I
    //   21: istore_1
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual 37	H1/a:b	(I)I
    //   27: istore_2
    //   28: new 34	H1/a
    //   31: astore_3
    //   32: aload_3
    //   33: iconst_2
    //   34: newarray <illegal type>
    //   36: dup
    //   37: iconst_0
    //   38: iload_2
    //   39: iastore
    //   40: dup
    //   41: iconst_1
    //   42: iload_1
    //   43: iastore
    //   44: invokespecial 49	H1/a:<init>	([I)V
    //   47: aload_0
    //   48: invokevirtual 40	H1/a:a	()[F
    //   51: astore_0
    //   52: aload_3
    //   53: invokevirtual 40	H1/a:a	()[F
    //   56: astore 4
    //   58: iload_1
    //   59: ifle +80 -> 139
    //   62: iconst_0
    //   63: istore 5
    //   65: iload 5
    //   67: iconst_1
    //   68: iadd
    //   69: istore 6
    //   71: iload_2
    //   72: ifle +51 -> 123
    //   75: iconst_0
    //   76: istore 7
    //   78: iload 7
    //   80: iconst_1
    //   81: iadd
    //   82: istore 8
    //   84: aload 4
    //   86: iload 7
    //   88: iload_1
    //   89: imul
    //   90: iload 5
    //   92: iadd
    //   93: aload_0
    //   94: iload 5
    //   96: iload_2
    //   97: imul
    //   98: iload 7
    //   100: iadd
    //   101: faload
    //   102: fastore
    //   103: iload 8
    //   105: iload_2
    //   106: if_icmplt +6 -> 112
    //   109: goto +14 -> 123
    //   112: iload 8
    //   114: istore 7
    //   116: goto -38 -> 78
    //   119: astore_0
    //   120: goto +21 -> 141
    //   123: iload 6
    //   125: iload_1
    //   126: if_icmplt +6 -> 132
    //   129: goto +10 -> 139
    //   132: iload 6
    //   134: istore 5
    //   136: goto -71 -> 65
    //   139: aload_3
    //   140: areturn
    //   141: aload_0
    //   142: ldc 2
    //   144: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   147: aconst_null
    //   148: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	parama	a
    //   21	106	1	i	int
    //   27	80	2	j	int
    //   31	109	3	locala	a
    //   56	29	4	arrayOfFloat	float[]
    //   63	72	5	k	int
    //   69	64	6	m	int
    //   76	39	7	n	int
    //   82	31	8	i1	int
    // Exception table:
    //   from	to	target	type
    //   10	58	119	finally
  }
  
  /* Error */
  public static final a l(a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ldc 24
    //   13: invokestatic 30	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_0
    //   17: iconst_0
    //   18: invokevirtual 37	H1/a:b	(I)I
    //   21: istore_1
    //   22: aload_0
    //   23: iconst_1
    //   24: invokevirtual 37	H1/a:b	(I)I
    //   27: istore_2
    //   28: aload_0
    //   29: iconst_2
    //   30: invokevirtual 37	H1/a:b	(I)I
    //   33: istore_3
    //   34: new 34	H1/a
    //   37: astore 4
    //   39: aload 4
    //   41: iconst_3
    //   42: newarray <illegal type>
    //   44: dup
    //   45: iconst_0
    //   46: iload_3
    //   47: iastore
    //   48: dup
    //   49: iconst_1
    //   50: iload_2
    //   51: iastore
    //   52: dup
    //   53: iconst_2
    //   54: iload_1
    //   55: iastore
    //   56: invokespecial 49	H1/a:<init>	([I)V
    //   59: aload_0
    //   60: invokevirtual 40	H1/a:a	()[F
    //   63: astore_0
    //   64: aload 4
    //   66: invokevirtual 40	H1/a:a	()[F
    //   69: astore 5
    //   71: iload_1
    //   72: ifle +123 -> 195
    //   75: iconst_0
    //   76: istore 6
    //   78: iload 6
    //   80: iconst_1
    //   81: iadd
    //   82: istore 7
    //   84: iload_2
    //   85: ifle +94 -> 179
    //   88: iconst_0
    //   89: istore 8
    //   91: iload 8
    //   93: iconst_1
    //   94: iadd
    //   95: istore 9
    //   97: iload_3
    //   98: ifle +65 -> 163
    //   101: iconst_0
    //   102: istore 10
    //   104: iload 10
    //   106: iconst_1
    //   107: iadd
    //   108: istore 11
    //   110: aload 5
    //   112: iload 10
    //   114: iload_1
    //   115: imul
    //   116: iload_2
    //   117: imul
    //   118: iload 8
    //   120: iload_1
    //   121: imul
    //   122: iadd
    //   123: iload 6
    //   125: iadd
    //   126: aload_0
    //   127: iload 6
    //   129: iload_2
    //   130: imul
    //   131: iload_3
    //   132: imul
    //   133: iload 8
    //   135: iload_3
    //   136: imul
    //   137: iadd
    //   138: iload 10
    //   140: iadd
    //   141: faload
    //   142: fastore
    //   143: iload 11
    //   145: iload_3
    //   146: if_icmplt +6 -> 152
    //   149: goto +14 -> 163
    //   152: iload 11
    //   154: istore 10
    //   156: goto -52 -> 104
    //   159: astore_0
    //   160: goto +38 -> 198
    //   163: iload 9
    //   165: iload_2
    //   166: if_icmplt +6 -> 172
    //   169: goto +10 -> 179
    //   172: iload 9
    //   174: istore 8
    //   176: goto -85 -> 91
    //   179: iload 7
    //   181: iload_1
    //   182: if_icmplt +6 -> 188
    //   185: goto +10 -> 195
    //   188: iload 7
    //   190: istore 6
    //   192: goto -114 -> 78
    //   195: aload 4
    //   197: areturn
    //   198: aload_0
    //   199: ldc 2
    //   201: invokestatic 43	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   204: aconst_null
    //   205: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	parama	a
    //   21	162	1	i	int
    //   27	140	2	j	int
    //   33	114	3	k	int
    //   37	159	4	locala	a
    //   69	42	5	arrayOfFloat	float[]
    //   76	115	6	m	int
    //   82	107	7	n	int
    //   89	86	8	i1	int
    //   95	78	9	i2	int
    //   102	53	10	i3	int
    //   108	45	11	i4	int
    // Exception table:
    //   from	to	target	type
    //   10	71	159	finally
  }
}

/* Location:
 * Qualified Name:     H1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */