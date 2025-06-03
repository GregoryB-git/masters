package S0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import d0.x.b;
import g0.M;
import g0.a;

public final class b
  implements x.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final int o;
  public final String p;
  public final String q;
  public final String r;
  public final boolean s;
  public final int t;
  
  public b(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 != -1) && (paramInt2 <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    a.a(bool);
    o = paramInt1;
    p = paramString1;
    q = paramString2;
    r = paramString3;
    s = paramBoolean;
    t = paramInt2;
  }
  
  public b(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = paramParcel.readString();
    q = paramParcel.readString();
    r = paramParcel.readString();
    s = M.T0(paramParcel);
    t = paramParcel.readInt();
  }
  
  /* Error */
  public static b a(java.util.Map paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 70
    //   3: invokeinterface 76 2 0
    //   8: checkcast 78	java/util/List
    //   11: astore_1
    //   12: iconst_1
    //   13: istore_2
    //   14: iconst_m1
    //   15: istore_3
    //   16: aload_1
    //   17: ifnull +132 -> 149
    //   20: aload_1
    //   21: iconst_0
    //   22: invokeinterface 81 2 0
    //   27: checkcast 83	java/lang/String
    //   30: astore_1
    //   31: aload_1
    //   32: invokestatic 89	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   35: istore 4
    //   37: iload 4
    //   39: sipush 1000
    //   42: imul
    //   43: istore 5
    //   45: iload 5
    //   47: ifle +9 -> 56
    //   50: iconst_1
    //   51: istore 4
    //   53: goto +44 -> 97
    //   56: new 91	java/lang/StringBuilder
    //   59: astore 6
    //   61: aload 6
    //   63: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   66: aload 6
    //   68: ldc 94
    //   70: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload 6
    //   76: aload_1
    //   77: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: ldc 100
    //   83: aload 6
    //   85: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 109	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: iconst_0
    //   92: istore 4
    //   94: iconst_m1
    //   95: istore 5
    //   97: iload 5
    //   99: istore 7
    //   101: goto +54 -> 155
    //   104: astore 6
    //   106: iconst_m1
    //   107: istore 5
    //   109: new 91	java/lang/StringBuilder
    //   112: dup
    //   113: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   116: astore 6
    //   118: aload 6
    //   120: ldc 111
    //   122: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload 6
    //   128: aload_1
    //   129: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: ldc 100
    //   135: aload 6
    //   137: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 109	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: iconst_0
    //   144: istore 4
    //   146: goto -49 -> 97
    //   149: iconst_0
    //   150: istore 4
    //   152: iconst_m1
    //   153: istore 7
    //   155: aload_0
    //   156: ldc 113
    //   158: invokeinterface 76 2 0
    //   163: checkcast 78	java/util/List
    //   166: astore_1
    //   167: aconst_null
    //   168: astore 8
    //   170: aload_1
    //   171: ifnull +20 -> 191
    //   174: aload_1
    //   175: iconst_0
    //   176: invokeinterface 81 2 0
    //   181: checkcast 83	java/lang/String
    //   184: astore_1
    //   185: iconst_1
    //   186: istore 4
    //   188: goto +5 -> 193
    //   191: aconst_null
    //   192: astore_1
    //   193: aload_0
    //   194: ldc 115
    //   196: invokeinterface 76 2 0
    //   201: checkcast 78	java/util/List
    //   204: astore 6
    //   206: aload 6
    //   208: ifnull +22 -> 230
    //   211: aload 6
    //   213: iconst_0
    //   214: invokeinterface 81 2 0
    //   219: checkcast 83	java/lang/String
    //   222: astore 6
    //   224: iconst_1
    //   225: istore 4
    //   227: goto +6 -> 233
    //   230: aconst_null
    //   231: astore 6
    //   233: aload_0
    //   234: ldc 117
    //   236: invokeinterface 76 2 0
    //   241: checkcast 78	java/util/List
    //   244: astore 9
    //   246: aload 9
    //   248: ifnull +22 -> 270
    //   251: aload 9
    //   253: iconst_0
    //   254: invokeinterface 81 2 0
    //   259: checkcast 83	java/lang/String
    //   262: astore 9
    //   264: iconst_1
    //   265: istore 4
    //   267: goto +6 -> 273
    //   270: aconst_null
    //   271: astore 9
    //   273: aload_0
    //   274: ldc 119
    //   276: invokeinterface 76 2 0
    //   281: checkcast 78	java/util/List
    //   284: astore 10
    //   286: aload 10
    //   288: ifnull +27 -> 315
    //   291: aload 10
    //   293: iconst_0
    //   294: invokeinterface 81 2 0
    //   299: checkcast 83	java/lang/String
    //   302: ldc 121
    //   304: invokevirtual 125	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   307: istore 11
    //   309: iconst_1
    //   310: istore 4
    //   312: goto +6 -> 318
    //   315: iconst_0
    //   316: istore 11
    //   318: aload_0
    //   319: ldc 127
    //   321: invokeinterface 76 2 0
    //   326: checkcast 78	java/util/List
    //   329: astore_0
    //   330: iload 4
    //   332: istore 12
    //   334: iload_3
    //   335: istore 5
    //   337: aload_0
    //   338: ifnull +116 -> 454
    //   341: aload_0
    //   342: iconst_0
    //   343: invokeinterface 81 2 0
    //   348: checkcast 83	java/lang/String
    //   351: astore_0
    //   352: aload_0
    //   353: invokestatic 89	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   356: istore 5
    //   358: iload 5
    //   360: ifle +9 -> 369
    //   363: iload_2
    //   364: istore 4
    //   366: goto +41 -> 407
    //   369: new 91	java/lang/StringBuilder
    //   372: astore 10
    //   374: aload 10
    //   376: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   379: aload 10
    //   381: ldc -127
    //   383: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: pop
    //   387: aload 10
    //   389: aload_0
    //   390: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: ldc 100
    //   396: aload 10
    //   398: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 109	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   404: iload_3
    //   405: istore 5
    //   407: iload 4
    //   409: istore 12
    //   411: goto +43 -> 454
    //   414: astore 10
    //   416: new 91	java/lang/StringBuilder
    //   419: dup
    //   420: invokespecial 92	java/lang/StringBuilder:<init>	()V
    //   423: astore 10
    //   425: aload 10
    //   427: ldc -127
    //   429: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: pop
    //   433: aload 10
    //   435: aload_0
    //   436: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: pop
    //   440: ldc 100
    //   442: aload 10
    //   444: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   447: invokestatic 109	g0/o:h	(Ljava/lang/String;Ljava/lang/String;)V
    //   450: iload 4
    //   452: istore 12
    //   454: aload 8
    //   456: astore_0
    //   457: iload 12
    //   459: ifeq +22 -> 481
    //   462: new 2	S0/b
    //   465: dup
    //   466: iload 7
    //   468: aload_1
    //   469: aload 6
    //   471: aload 9
    //   473: iload 11
    //   475: iload 5
    //   477: invokespecial 131	S0/b:<init>	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    //   480: astore_0
    //   481: aload_0
    //   482: areturn
    //   483: astore 6
    //   485: goto -376 -> 109
    //   488: astore 10
    //   490: iload_3
    //   491: istore 5
    //   493: goto -77 -> 416
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	496	0	paramMap	java.util.Map
    //   11	458	1	localObject1	Object
    //   13	351	2	i	int
    //   15	476	3	j	int
    //   35	416	4	k	int
    //   43	449	5	m	int
    //   59	25	6	localStringBuilder1	StringBuilder
    //   104	1	6	localNumberFormatException1	NumberFormatException
    //   116	354	6	localObject2	Object
    //   483	1	6	localNumberFormatException2	NumberFormatException
    //   99	368	7	n	int
    //   168	287	8	localObject3	Object
    //   244	228	9	localObject4	Object
    //   284	113	10	localObject5	Object
    //   414	1	10	localNumberFormatException3	NumberFormatException
    //   423	20	10	localStringBuilder2	StringBuilder
    //   488	1	10	localNumberFormatException4	NumberFormatException
    //   307	167	11	bool	boolean
    //   332	126	12	i1	int
    // Exception table:
    //   from	to	target	type
    //   31	37	104	java/lang/NumberFormatException
    //   369	404	414	java/lang/NumberFormatException
    //   56	91	483	java/lang/NumberFormatException
    //   352	358	488	java/lang/NumberFormatException
  }
  
  public void D(w.b paramb)
  {
    String str = q;
    if (str != null) {
      paramb.l0(str);
    }
    str = p;
    if (str != null) {
      paramb.b0(str);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((o != o) || (!M.c(p, p)) || (!M.c(q, q)) || (!M.c(r, r)) || (s != s) || (t != t)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = o;
    String str = p;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = q;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = r;
    if (str != null) {
      j = str.hashCode();
    }
    return (((((527 + i) * 31 + k) * 31 + m) * 31 + j) * 31 + s) * 31 + t;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IcyHeaders: name=\"");
    localStringBuilder.append(q);
    localStringBuilder.append("\", genre=\"");
    localStringBuilder.append(p);
    localStringBuilder.append("\", bitrate=");
    localStringBuilder.append(o);
    localStringBuilder.append(", metadataInterval=");
    localStringBuilder.append(t);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeString(r);
    M.j1(paramParcel, s);
    paramParcel.writeInt(t);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     S0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */