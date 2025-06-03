package w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import b.a0;
import b0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d
{
  public static b a(XmlResourceParser paramXmlResourceParser, Resources paramResources)
  {
    int i;
    do
    {
      i = paramXmlResourceParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2)
    {
      paramXmlResourceParser.require(2, null, "font-family");
      if (paramXmlResourceParser.getName().equals("font-family"))
      {
        Object localObject1 = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlResourceParser), a0.b0);
        String str1 = ((TypedArray)localObject1).getString(0);
        Object localObject2 = ((TypedArray)localObject1).getString(4);
        Object localObject3 = ((TypedArray)localObject1).getString(5);
        i = ((TypedArray)localObject1).getResourceId(1, 0);
        int j = ((TypedArray)localObject1).getInteger(2, 1);
        int k = ((TypedArray)localObject1).getInteger(3, 500);
        String str2 = ((TypedArray)localObject1).getString(6);
        ((TypedArray)localObject1).recycle();
        if ((str1 != null) && (localObject2 != null) && (localObject3 != null))
        {
          while (paramXmlResourceParser.next() != 3) {
            c(paramXmlResourceParser);
          }
          paramXmlResourceParser = new e(new g(str1, (String)localObject2, (String)localObject3, b(paramResources, i)), j, k, str2);
          break label496;
        }
        localObject3 = new ArrayList();
        while (paramXmlResourceParser.next() != 3) {
          if (paramXmlResourceParser.getEventType() == 2) {
            if (paramXmlResourceParser.getName().equals("font"))
            {
              localObject2 = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlResourceParser), a0.c0);
              i = 8;
              if (!((TypedArray)localObject2).hasValue(8)) {
                i = 1;
              }
              k = ((TypedArray)localObject2).getInt(i, 400);
              if (((TypedArray)localObject2).hasValue(6)) {
                i = 6;
              } else {
                i = 2;
              }
              boolean bool;
              if (1 == ((TypedArray)localObject2).getInt(i, 0)) {
                bool = true;
              } else {
                bool = false;
              }
              i = 9;
              if (!((TypedArray)localObject2).hasValue(9)) {
                i = 3;
              }
              j = 7;
              if (!((TypedArray)localObject2).hasValue(7)) {
                j = 4;
              }
              str1 = ((TypedArray)localObject2).getString(j);
              j = ((TypedArray)localObject2).getInt(i, 0);
              if (((TypedArray)localObject2).hasValue(5)) {
                i = 5;
              } else {
                i = 0;
              }
              int m = ((TypedArray)localObject2).getResourceId(i, 0);
              localObject1 = ((TypedArray)localObject2).getString(i);
              ((TypedArray)localObject2).recycle();
              while (paramXmlResourceParser.next() != 3) {
                c(paramXmlResourceParser);
              }
              ((ArrayList)localObject3).add(new d(k, j, m, (String)localObject1, str1, bool));
            }
            else
            {
              c(paramXmlResourceParser);
            }
          }
        }
        if (!((ArrayList)localObject3).isEmpty())
        {
          paramXmlResourceParser = new c((d[])((ArrayList)localObject3).toArray(new d[0]));
          break label496;
        }
      }
      else
      {
        c(paramXmlResourceParser);
      }
      paramXmlResourceParser = null;
      label496:
      return paramXmlResourceParser;
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static List<List<byte[]>> b(Resources paramResources, int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
    try
    {
      if (localTypedArray.length() == 0)
      {
        paramResources = Collections.emptyList();
        return paramResources;
      }
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      if (a.a(localTypedArray, 0) == 1) {
        for (paramInt = 0; paramInt < localTypedArray.length(); paramInt++)
        {
          i = localTypedArray.getResourceId(paramInt, 0);
          if (i != 0)
          {
            localObject = paramResources.getStringArray(i);
            ArrayList localArrayList2 = new java/util/ArrayList;
            localArrayList2.<init>();
            int j = localObject.length;
            for (i = 0; i < j; i++) {
              localArrayList2.add(Base64.decode(localObject[i], 0));
            }
            localArrayList1.add(localArrayList2);
          }
        }
      }
      paramResources = paramResources.getStringArray(paramInt);
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int i = paramResources.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        ((ArrayList)localObject).add(Base64.decode(paramResources[paramInt], 0));
      }
      localArrayList1.add(localObject);
      return localArrayList1;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public static void c(XmlResourceParser paramXmlResourceParser)
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlResourceParser.next();
      if (j != 2)
      {
        if (j == 3) {
          i--;
        }
      }
      else {
        i++;
      }
    }
  }
  
  public static final class a
  {
    public static int a(TypedArray paramTypedArray, int paramInt)
    {
      return paramTypedArray.getType(paramInt);
    }
  }
  
  public static abstract interface b {}
  
  public static final class c
    implements d.b
  {
    public final d.d[] a;
    
    public c(d.d[] paramArrayOfd)
    {
      a = paramArrayOfd;
    }
  }
  
  public static final class d
  {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final int f;
    
    public d(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, boolean paramBoolean)
    {
      a = paramString1;
      b = paramInt1;
      c = paramBoolean;
      d = paramString2;
      e = paramInt2;
      f = paramInt3;
    }
  }
  
  public static final class e
    implements d.b
  {
    public final g a;
    public final int b;
    public final int c;
    public final String d;
    
    public e(g paramg, int paramInt1, int paramInt2, String paramString)
    {
      a = paramg;
      c = paramInt1;
      b = paramInt2;
      d = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     w.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */