package v3;

import android.net.Uri;
import e0.d;
import e0.e;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o7.l0;
import o7.m0;
import o7.t;
import o7.t.a;
import o7.t.b;
import o7.u;
import r3.j;
import v5.e0;
import w3.v;
import x6.b;
import y4.c;

public final class o0
  implements g
{
  public static final o0 o = new a().a();
  public static final String p = e0.E(0);
  public static final String q = e0.E(1);
  public static final String r = e0.E(2);
  public static final String s = e0.E(3);
  public static final String t = e0.E(4);
  public static final e u = new e(3);
  public final String a;
  public final g b;
  public final e c;
  public final p0 d;
  public final c e;
  public final h f;
  
  public o0(String paramString, c paramc, g paramg, e parame, p0 paramp0, h paramh)
  {
    a = paramString;
    b = paramg;
    c = parame;
    d = paramp0;
    e = paramc;
    f = paramh;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof o0)) {
      return false;
    }
    paramObject = (o0)paramObject;
    if ((!e0.a(a, a)) || (!e.equals(e)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(d, d)) || (!e0.a(f, f))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    g localg = b;
    int j;
    if (localg != null) {
      j = localg.hashCode();
    } else {
      j = 0;
    }
    int k = c.hashCode();
    int m = e.hashCode();
    int n = d.hashCode();
    return f.hashCode() + (n + (m + (k + (i * 31 + j) * 31) * 31) * 31) * 31;
  }
  
  public static final class a
  {
    public String a;
    public Uri b;
    public String c;
    public o0.b.a d = new o0.b.a();
    public o0.d.a e = new o0.d.a();
    public List<c> f = Collections.emptyList();
    public String g;
    public t<o0.j> h = l0.e;
    public Object i;
    public p0 j;
    public o0.e.a k = new o0.e.a();
    public o0.h l = o0.h.c;
    
    public final o0 a()
    {
      Object localObject1 = e;
      boolean bool;
      if ((b != null) && (a == null)) {
        bool = false;
      } else {
        bool = true;
      }
      b.H(bool);
      Object localObject2 = b;
      localObject1 = null;
      if (localObject2 != null)
      {
        str = c;
        localObject3 = e;
        if (a != null) {
          localObject1 = new o0.d((o0.d.a)localObject3);
        }
        localObject1 = new o0.g((Uri)localObject2, str, (o0.d)localObject1, f, g, h, i);
      }
      else
      {
        localObject1 = null;
      }
      String str = a;
      if (str == null) {
        str = "";
      }
      localObject2 = d;
      localObject2.getClass();
      Object localObject3 = new o0.c((o0.b.a)localObject2);
      localObject2 = k;
      localObject2.getClass();
      o0.e locale = new o0.e(a, b, c, d, e);
      localObject2 = j;
      if (localObject2 == null) {
        localObject2 = p0.Q;
      }
      return new o0(str, (o0.c)localObject3, (o0.g)localObject1, locale, (p0)localObject2, l);
    }
  }
  
  public static class b
    implements g
  {
    public static final o0.c f = new o0.c(new a());
    public static final String o = e0.E(0);
    public static final String p = e0.E(1);
    public static final String q = e0.E(2);
    public static final String r = e0.E(3);
    public static final String s = e0.E(4);
    public static final v t = new v(4);
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public b(a parama)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      long l = a;
      int i = (int)(l ^ l >>> 32);
      l = b;
      return (((i * 31 + (int)(l >>> 32 ^ l)) * 31 + c) * 31 + d) * 31 + e;
    }
    
    public static final class a
    {
      public long a;
      public long b;
      public boolean c;
      public boolean d;
      public boolean e;
      
      public a()
      {
        b = Long.MIN_VALUE;
      }
      
      public a(o0.c paramc)
      {
        a = a;
        b = b;
        c = c;
        d = d;
        e = e;
      }
    }
  }
  
  @Deprecated
  public static final class c
    extends o0.b
  {
    public static final c u = new c(new o0.b.a());
    
    public c(o0.b.a parama)
    {
      super();
    }
  }
  
  public static final class d
  {
    public final UUID a;
    public final Uri b;
    public final u<String, String> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final t<Integer> g;
    public final byte[] h;
    
    public d(a parama)
    {
      boolean bool;
      if ((f) && (b == null)) {
        bool = false;
      } else {
        bool = true;
      }
      b.H(bool);
      UUID localUUID = a;
      localUUID.getClass();
      a = localUUID;
      b = b;
      c = c;
      d = d;
      f = f;
      e = e;
      g = g;
      parama = h;
      if (parama != null) {
        parama = Arrays.copyOf(parama, parama.length);
      } else {
        parama = null;
      }
      h = parama;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
      if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (d != d) || (f != f) || (e != e) || (!g.equals(g)) || (!Arrays.equals(h, h))) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      Uri localUri = b;
      int j;
      if (localUri != null) {
        j = localUri.hashCode();
      } else {
        j = 0;
      }
      int k = c.hashCode();
      int m = d;
      int n = f;
      int i1 = e;
      int i2 = g.hashCode();
      return Arrays.hashCode(h) + (i2 + ((((k + (i * 31 + j) * 31) * 31 + m) * 31 + n) * 31 + i1) * 31) * 31;
    }
    
    public static final class a
    {
      public UUID a;
      public Uri b;
      public u<String, String> c;
      public boolean d;
      public boolean e;
      public boolean f;
      public t<Integer> g;
      public byte[] h;
      
      public a()
      {
        c = m0.o;
        t.b localb = t.b;
        g = l0.e;
      }
      
      public a(o0.d paramd)
      {
        a = a;
        b = b;
        c = c;
        d = d;
        e = e;
        f = f;
        g = g;
        h = h;
      }
    }
  }
  
  public static final class e
    implements g
  {
    public static final e f = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38F, -3.4028235E38F);
    public static final String o = e0.E(0);
    public static final String p = e0.E(1);
    public static final String q = e0.E(2);
    public static final String r = e0.E(3);
    public static final String s = e0.E(4);
    public static final j t = new j(8);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    
    @Deprecated
    public e(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2)
    {
      a = paramLong1;
      b = paramLong2;
      c = paramLong3;
      d = paramFloat1;
      e = paramFloat2;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof e)) {
        return false;
      }
      paramObject = (e)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      long l = a;
      int i = (int)(l ^ l >>> 32);
      l = b;
      int j = (int)(l ^ l >>> 32);
      l = c;
      int k = (int)(l >>> 32 ^ l);
      float f1 = d;
      int m = 0;
      int n;
      if (f1 != 0.0F) {
        n = Float.floatToIntBits(f1);
      } else {
        n = 0;
      }
      f1 = e;
      if (f1 != 0.0F) {
        m = Float.floatToIntBits(f1);
      }
      return (((i * 31 + j) * 31 + k) * 31 + n) * 31 + m;
    }
    
    public static final class a
    {
      public long a;
      public long b;
      public long c;
      public float d;
      public float e;
      
      public a()
      {
        a = -9223372036854775807L;
        b = -9223372036854775807L;
        c = -9223372036854775807L;
        d = -3.4028235E38F;
        e = -3.4028235E38F;
      }
      
      public a(o0.e parame)
      {
        a = a;
        b = b;
        c = c;
        d = d;
        e = e;
      }
    }
  }
  
  public static class f
  {
    public final Uri a;
    public final String b;
    public final o0.d c;
    public final List<c> d;
    public final String e;
    public final t<o0.j> f;
    public final Object g;
    
    public f() {}
    
    public f(Uri paramUri, String paramString1, o0.d paramd, List paramList, String paramString2, t paramt, Object paramObject)
    {
      a = paramUri;
      b = paramString1;
      c = paramd;
      d = paramList;
      e = paramString2;
      f = paramt;
      paramUri = t.b;
      paramUri = new t.a();
      for (int i = 0; i < paramt.size(); i++)
      {
        paramString1 = (o0.j)paramt.get(i);
        paramString1.getClass();
        paramUri.c(new o0.i(new o0.j.a(paramString1)));
      }
      paramUri.e();
      g = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof f)) {
        return false;
      }
      paramObject = (f)paramObject;
      if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(null, null)) || (!d.equals(d)) || (!e0.a(e, e)) || (!f.equals(f)) || (!e0.a(g, g))) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      Object localObject = b;
      int j = 0;
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = ((String)localObject).hashCode();
      }
      localObject = c;
      int m;
      if (localObject == null) {
        m = 0;
      } else {
        m = ((o0.d)localObject).hashCode();
      }
      int n = d.hashCode();
      localObject = e;
      int i1;
      if (localObject == null) {
        i1 = 0;
      } else {
        i1 = ((String)localObject).hashCode();
      }
      int i2 = f.hashCode();
      localObject = g;
      if (localObject != null) {
        j = localObject.hashCode();
      }
      return (i2 + ((n + (((i * 31 + k) * 31 + m) * 31 + 0) * 31) * 31 + i1) * 31) * 31 + j;
    }
  }
  
  @Deprecated
  public static final class g
    extends o0.f
  {
    public g(Uri paramUri, String paramString1, o0.d paramd, List paramList, String paramString2, t paramt, Object paramObject)
    {
      super(paramString1, paramd, paramList, paramString2, paramt, paramObject);
    }
  }
  
  public static final class h
    implements g
  {
    public static final h c = new h(new a());
    public static final String d = e0.E(0);
    public static final String e = e0.E(1);
    public static final String f = e0.E(2);
    public static final d o = new d(6);
    public final Uri a;
    public final String b;
    
    public h(a parama)
    {
      a = a;
      b = b;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof h)) {
        return false;
      }
      paramObject = (h)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(b, b))) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      Object localObject = a;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = ((Uri)localObject).hashCode();
      }
      localObject = b;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public static final class a
    {
      public Uri a;
      public String b;
    }
  }
  
  @Deprecated
  public static final class i
    extends o0.j
  {
    public i(o0.j.a parama)
    {
      super();
    }
  }
  
  public static class j
  {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    
    public j(a parama)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof j)) {
        return false;
      }
      paramObject = (j)paramObject;
      if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (d != d) || (e != e) || (!e0.a(f, f)) || (!e0.a(g, g))) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      String str = b;
      int j = 0;
      int k;
      if (str == null) {
        k = 0;
      } else {
        k = str.hashCode();
      }
      str = c;
      int m;
      if (str == null) {
        m = 0;
      } else {
        m = str.hashCode();
      }
      int n = d;
      int i1 = e;
      str = f;
      int i2;
      if (str == null) {
        i2 = 0;
      } else {
        i2 = str.hashCode();
      }
      str = g;
      if (str != null) {
        j = str.hashCode();
      }
      return (((((i * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + j;
    }
    
    public static final class a
    {
      public Uri a;
      public String b;
      public String c;
      public int d;
      public int e;
      public String f;
      public String g;
      
      public a(o0.j paramj)
      {
        a = a;
        b = b;
        c = c;
        d = d;
        e = e;
        f = f;
        g = g;
      }
    }
  }
}

/* Location:
 * Qualified Name:     v3.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */