package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.d;

public abstract class e
{
  public static int a(TypedArray paramTypedArray, int paramInt)
  {
    return a.a(paramTypedArray, paramInt);
  }
  
  public static b b(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return d(paramXmlPullParser, paramResources);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static List c(Resources paramResources, int paramInt)
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
        localTypedArray.recycle();
        return paramResources;
      }
    }
    finally
    {
      break label118;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (a(localTypedArray, 0) == 1) {
        for (paramInt = 0; paramInt < localTypedArray.length(); paramInt++)
        {
          int i = localTypedArray.getResourceId(paramInt, 0);
          if (i != 0) {
            localArrayList.add(h(paramResources.getStringArray(i)));
          }
        }
      }
      localArrayList.add(h(paramResources.getStringArray(paramInt)));
      localTypedArray.recycle();
      return localArrayList;
      label118:
      localTypedArray.recycle();
    }
  }
  
  public static b d(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family")) {
      return e(paramXmlPullParser, paramResources);
    }
    g(paramXmlPullParser);
    return null;
  }
  
  public static b e(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), d.h);
    Object localObject = localTypedArray.getString(d.i);
    String str1 = localTypedArray.getString(d.m);
    String str2 = localTypedArray.getString(d.n);
    int i = localTypedArray.getResourceId(d.j, 0);
    int j = localTypedArray.getInteger(d.k, 1);
    int k = localTypedArray.getInteger(d.l, 500);
    String str3 = localTypedArray.getString(d.o);
    localTypedArray.recycle();
    if ((localObject != null) && (str1 != null) && (str2 != null))
    {
      while (paramXmlPullParser.next() != 3) {
        g(paramXmlPullParser);
      }
      return new e(new F.e((String)localObject, str1, str2, c(paramResources, i)), j, k, str3);
    }
    localObject = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("font")) {
          ((List)localObject).add(f(paramXmlPullParser, paramResources));
        } else {
          g(paramXmlPullParser);
        }
      }
    }
    if (((List)localObject).isEmpty()) {
      return null;
    }
    return new c((d[])((List)localObject).toArray(new d[0]));
  }
  
  public static d f(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), d.p);
    int i;
    if (localTypedArray.hasValue(d.y)) {
      i = d.y;
    } else {
      i = d.r;
    }
    int j = localTypedArray.getInt(i, 400);
    if (localTypedArray.hasValue(d.w)) {
      i = d.w;
    } else {
      i = d.s;
    }
    boolean bool;
    if (1 == localTypedArray.getInt(i, 0)) {
      bool = true;
    } else {
      bool = false;
    }
    if (localTypedArray.hasValue(d.z)) {
      i = d.z;
    } else {
      i = d.t;
    }
    if (localTypedArray.hasValue(d.x)) {
      k = d.x;
    } else {
      k = d.u;
    }
    paramResources = localTypedArray.getString(k);
    int k = localTypedArray.getInt(i, 0);
    if (localTypedArray.hasValue(d.v)) {
      i = d.v;
    } else {
      i = d.q;
    }
    int m = localTypedArray.getResourceId(i, 0);
    String str = localTypedArray.getString(i);
    localTypedArray.recycle();
    while (paramXmlPullParser.next() != 3) {
      g(paramXmlPullParser);
    }
    return new d(str, j, bool, paramResources, k, m);
  }
  
  public static void g(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlPullParser.next();
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
  
  public static List h(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Base64.decode(paramArrayOfString[j], 0));
    }
    return localArrayList;
  }
  
  public static abstract class a
  {
    public static int a(TypedArray paramTypedArray, int paramInt)
    {
      return paramTypedArray.getType(paramInt);
    }
  }
  
  public static abstract interface b {}
  
  public static final class c
    implements e.b
  {
    public final e.d[] a;
    
    public c(e.d[] paramArrayOfd)
    {
      a = paramArrayOfd;
    }
    
    public e.d[] a()
    {
      return a;
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
    
    public d(String paramString1, int paramInt1, boolean paramBoolean, String paramString2, int paramInt2, int paramInt3)
    {
      a = paramString1;
      b = paramInt1;
      c = paramBoolean;
      d = paramString2;
      e = paramInt2;
      f = paramInt3;
    }
    
    public String a()
    {
      return a;
    }
    
    public int b()
    {
      return f;
    }
    
    public int c()
    {
      return e;
    }
    
    public String d()
    {
      return d;
    }
    
    public int e()
    {
      return b;
    }
    
    public boolean f()
    {
      return c;
    }
  }
  
  public static final class e
    implements e.b
  {
    public final F.e a;
    public final int b;
    public final int c;
    public final String d;
    
    public e(F.e parame, int paramInt1, int paramInt2, String paramString)
    {
      a = parame;
      c = paramInt1;
      b = paramInt2;
      d = paramString;
    }
    
    public int a()
    {
      return c;
    }
    
    public F.e b()
    {
      return a;
    }
    
    public String c()
    {
      return d;
    }
    
    public int d()
    {
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     z.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */