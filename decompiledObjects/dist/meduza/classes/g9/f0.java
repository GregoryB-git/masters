package g9;

import f;
import j9.i;
import j9.o;
import j9.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import ka.d0;
import x6.b;

public final class f0
{
  public static final e0 l;
  public static final e0 m;
  public final List<e0> a;
  public List<e0> b;
  public k0 c;
  public k0 d;
  public final List<m> e;
  public final o f;
  public final String g;
  public final long h;
  public final int i;
  public final e j;
  public final e k;
  
  static
  {
    j9.l locall = j9.l.b;
    l = new e0(1, locall);
    m = new e0(2, locall);
  }
  
  public f0(o paramo, String paramString)
  {
    this(paramo, paramString, Collections.emptyList(), Collections.emptyList(), -1L, 1, null, null);
  }
  
  public f0(o paramo, String paramString, List<m> paramList, List<e0> paramList1, long paramLong, Object paramObject, e parame1, e parame2)
  {
    f = paramo;
    g = paramString;
    a = paramList1;
    e = paramList;
    h = paramLong;
    i = paramObject;
    j = parame1;
    k = parame2;
  }
  
  public final a a()
  {
    return new a(d());
  }
  
  public final f0 b(m paramm)
  {
    b.Z("No filter is allowed for document query", e() ^ true, new Object[0]);
    ArrayList localArrayList = new ArrayList(e);
    localArrayList.add(paramm);
    return new f0(f, g, localArrayList, a, h, i, j, k);
  }
  
  public final TreeSet c()
  {
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator1 = e.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((m)localIterator1.next()).c().iterator();
      while (localIterator2.hasNext())
      {
        l locall = (l)localIterator2.next();
        if (locall.f()) {
          localTreeSet.add(c);
        }
      }
    }
    return localTreeSet;
  }
  
  /* Error */
  public final List<e0> d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 138	g9/f0:b	Ljava/util/List;
    //   6: ifnonnull +239 -> 245
    //   9: new 99	java/util/ArrayList
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 139	java/util/ArrayList:<init>	()V
    //   17: new 141	java/util/HashSet
    //   20: astore_2
    //   21: aload_2
    //   22: invokespecial 142	java/util/HashSet:<init>	()V
    //   25: aload_0
    //   26: getfield 67	g9/f0:a	Ljava/util/List;
    //   29: invokeinterface 116 1 0
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface 121 1 0
    //   41: ifeq +41 -> 82
    //   44: aload_3
    //   45: invokeinterface 125 1 0
    //   50: checkcast 38	g9/e0
    //   53: astore 4
    //   55: aload_1
    //   56: aload 4
    //   58: invokevirtual 106	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   61: pop
    //   62: aload_2
    //   63: aload 4
    //   65: getfield 143	g9/e0:b	Lj9/l;
    //   68: invokevirtual 146	j9/l:h	()Ljava/lang/String;
    //   71: invokevirtual 147	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   74: pop
    //   75: goto -40 -> 35
    //   78: astore_2
    //   79: goto +175 -> 254
    //   82: aload_0
    //   83: getfield 67	g9/f0:a	Ljava/util/List;
    //   86: invokeinterface 151 1 0
    //   91: ifle +33 -> 124
    //   94: aload_0
    //   95: getfield 67	g9/f0:a	Ljava/util/List;
    //   98: astore_3
    //   99: aload_3
    //   100: aload_3
    //   101: invokeinterface 151 1 0
    //   106: iconst_1
    //   107: isub
    //   108: invokeinterface 155 2 0
    //   113: checkcast 38	g9/e0
    //   116: getfield 157	g9/e0:a	I
    //   119: istore 5
    //   121: goto +6 -> 127
    //   124: iconst_1
    //   125: istore 5
    //   127: aload_0
    //   128: invokevirtual 159	g9/f0:c	()Ljava/util/TreeSet;
    //   131: invokevirtual 160	java/util/TreeSet:iterator	()Ljava/util/Iterator;
    //   134: astore 4
    //   136: aload 4
    //   138: invokeinterface 121 1 0
    //   143: ifeq +55 -> 198
    //   146: aload 4
    //   148: invokeinterface 125 1 0
    //   153: checkcast 33	j9/l
    //   156: astore_3
    //   157: aload_2
    //   158: aload_3
    //   159: invokevirtual 146	j9/l:h	()Ljava/lang/String;
    //   162: invokevirtual 163	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   165: ifne -29 -> 136
    //   168: aload_3
    //   169: invokevirtual 166	j9/l:u	()Z
    //   172: ifne -36 -> 136
    //   175: new 38	g9/e0
    //   178: astore 6
    //   180: aload 6
    //   182: iload 5
    //   184: aload_3
    //   185: invokespecial 42	g9/e0:<init>	(ILj9/l;)V
    //   188: aload_1
    //   189: aload 6
    //   191: invokevirtual 106	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   194: pop
    //   195: goto -59 -> 136
    //   198: aload_2
    //   199: getstatic 36	j9/l:b	Lj9/l;
    //   202: invokevirtual 146	j9/l:h	()Ljava/lang/String;
    //   205: invokevirtual 163	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   208: ifne +29 -> 237
    //   211: iload 5
    //   213: iconst_1
    //   214: invokestatic 171	q0/g:b	(II)Z
    //   217: ifeq +10 -> 227
    //   220: getstatic 44	g9/f0:l	Lg9/e0;
    //   223: astore_2
    //   224: goto +7 -> 231
    //   227: getstatic 46	g9/f0:m	Lg9/e0;
    //   230: astore_2
    //   231: aload_1
    //   232: aload_2
    //   233: invokevirtual 106	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   236: pop
    //   237: aload_0
    //   238: aload_1
    //   239: invokestatic 175	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   242: putfield 138	g9/f0:b	Ljava/util/List;
    //   245: aload_0
    //   246: getfield 138	g9/f0:b	Ljava/util/List;
    //   249: astore_2
    //   250: aload_0
    //   251: monitorexit
    //   252: aload_2
    //   253: areturn
    //   254: aload_0
    //   255: monitorexit
    //   256: aload_2
    //   257: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	this	f0
    //   12	227	1	localArrayList	ArrayList
    //   20	43	2	localHashSet	java.util.HashSet
    //   78	121	2	localObject1	Object
    //   223	34	2	localObject2	Object
    //   34	151	3	localObject3	Object
    //   53	94	4	localObject4	Object
    //   119	93	5	n	int
    //   178	12	6	locale0	e0
    // Exception table:
    //   from	to	target	type
    //   2	35	78	finally
    //   35	75	78	finally
    //   82	121	78	finally
    //   127	136	78	finally
    //   136	195	78	finally
    //   198	224	78	finally
    //   227	231	78	finally
    //   231	237	78	finally
    //   237	245	78	finally
    //   245	250	78	finally
  }
  
  public final boolean e()
  {
    boolean bool;
    if ((i.l(f)) && (g == null) && (e.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f0.class == paramObject.getClass()))
    {
      paramObject = (f0)paramObject;
      if (i != i) {
        return false;
      }
      return i().equals(((f0)paramObject).i());
    }
    return false;
  }
  
  public final f0 f(long paramLong)
  {
    return new f0(f, g, e, a, paramLong, 1, j, k);
  }
  
  public final boolean g(j9.g paramg)
  {
    boolean bool1 = paramg.b();
    boolean bool2 = true;
    if (bool1)
    {
      Object localObject1 = getKeya;
      Object localObject3;
      int n;
      if (g != null)
      {
        Object localObject2 = paramg.getKey();
        localObject3 = g;
        if (a.q() >= 2)
        {
          localObject2 = a;
          if (((String)a.get(((j9.e)localObject2).q() - 2)).equals(localObject3))
          {
            n = 1;
            break label101;
          }
        }
        n = 0;
        label101:
        if ((n == 0) || (!f.p((j9.e)localObject1))) {}
      }
      for (;;)
      {
        bool1 = true;
        break;
        do
        {
          bool1 = false;
          break;
          if (i.l(f))
          {
            bool1 = f.equals(localObject1);
            break;
          }
        } while ((!f.p((j9.e)localObject1)) || (f.q() != ((j9.e)localObject1).q() - 1));
      }
      if (bool1)
      {
        localObject1 = d().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (e0)((Iterator)localObject1).next();
          if ((!b.equals(j9.l.b)) && (paramg.g(b) == null))
          {
            n = 0;
            break label257;
          }
        }
        n = 1;
        label257:
        if (n != 0)
        {
          localObject1 = e.iterator();
          while (((Iterator)localObject1).hasNext()) {
            if (!((m)((Iterator)localObject1).next()).d(paramg))
            {
              n = 0;
              break label309;
            }
          }
          n = 1;
          label309:
          if (n != 0)
          {
            localObject1 = j;
            if (localObject1 != null)
            {
              n = ((e)localObject1).a(d(), paramg);
              if (a ? n <= 0 : n < 0) {
                n = 1;
              } else {
                n = 0;
              }
              if (n != 0) {}
            }
            do
            {
              n = 0;
              break label442;
              localObject1 = k;
              if (localObject1 == null) {
                break;
              }
              n = ((e)localObject1).a(d(), paramg);
              if (a ? n >= 0 : n > 0) {
                n = 1;
              } else {
                n = 0;
              }
            } while (n == 0);
            n = 1;
            label442:
            if (n != 0) {
              return bool2;
            }
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public final boolean h()
  {
    boolean bool1 = e.isEmpty();
    boolean bool2 = true;
    if ((bool1) && (h == -1L) && (j == null) && (k == null))
    {
      bool1 = bool2;
      if (a.isEmpty()) {
        return bool1;
      }
      if ((a.size() == 1) && (a.get(0)).b.u())) {
        return bool2;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public final int hashCode()
  {
    int n = i().hashCode();
    return q0.g.c(i) + n * 31;
  }
  
  public final k0 i()
  {
    try
    {
      if (c == null) {
        c = j(d());
      }
      k0 localk0 = c;
      return localk0;
    }
    finally {}
  }
  
  public final k0 j(List<e0> paramList)
  {
    try
    {
      if (i == 1)
      {
        paramList = new k0(f, g, e, paramList, h, j, k);
        return paramList;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject1 = (e0)paramList.next();
        int n = a;
        int i1 = 2;
        if (n == 2) {
          i1 = 1;
        }
        localObject1 = b;
        localObject2 = new g9/e0;
        ((e0)localObject2).<init>(i1, (j9.l)localObject1);
        localArrayList.add(localObject2);
      }
      Object localObject2 = k;
      Object localObject1 = null;
      if (localObject2 != null)
      {
        paramList = new g9/e;
        paramList.<init>(b, a);
      }
      else
      {
        paramList = null;
      }
      localObject2 = j;
      if (localObject2 != null)
      {
        localObject1 = new g9/e;
        ((e)localObject1).<init>(b, a);
      }
      paramList = new k0(f, g, e, localArrayList, h, paramList, (e)localObject1);
      return paramList;
    }
    finally {}
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Query(target=");
    localStringBuilder.append(i().toString());
    localStringBuilder.append(";limitType=");
    localStringBuilder.append(g.l(i));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
    implements Comparator<j9.g>
  {
    public final List<e0> a;
    
    public a(List<e0> paramList)
    {
      Iterator localIterator = paramList.iterator();
      for (int i = 0;; i = 1)
      {
        if (!localIterator.hasNext()) {
          break label56;
        }
        e0 locale0 = (e0)localIterator.next();
        if ((i == 0) && (!b.equals(j9.l.b))) {
          break;
        }
      }
      label56:
      if (i != 0)
      {
        a = paramList;
        return;
      }
      throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
    }
    
    public final int compare(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (j9.g)paramObject1;
      paramObject2 = (j9.g)paramObject2;
      Iterator localIterator = a.iterator();
      int i;
      do
      {
        boolean bool = localIterator.hasNext();
        i = 0;
        if (!bool) {
          break;
        }
        e0 locale0 = (e0)localIterator.next();
        int j;
        if (b.equals(j9.l.b))
        {
          j = f.c(a);
          i = ((j9.g)paramObject1).getKey().f(((j9.g)paramObject2).getKey());
        }
        else
        {
          d0 locald01 = ((j9.g)paramObject1).g(b);
          d0 locald02 = ((j9.g)paramObject2).g(b);
          if ((locald01 != null) && (locald02 != null)) {
            bool = true;
          } else {
            bool = false;
          }
          b.Z("Trying to compare documents on fields that don't exist.", bool, new Object[0]);
          j = f.c(a);
          i = s.c(locald01, locald02);
        }
        i *= j;
      } while (i == 0);
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     g9.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */