package d0;

import X2.v;
import X2.v.a;
import android.net.Uri;
import android.os.Bundle;
import g0.M;
import g0.a;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class u
{
  public static final u i = new c().a();
  public static final String j = M.w0(0);
  public static final String k = M.w0(1);
  public static final String l = M.w0(2);
  public static final String m = M.w0(3);
  public static final String n = M.w0(4);
  public static final String o = M.w0(5);
  public final String a;
  public final h b;
  public final h c;
  public final g d;
  public final w e;
  public final d f;
  public final e g;
  public final i h;
  
  public u(String paramString, e parame, h paramh, g paramg, w paramw, i parami)
  {
    a = paramString;
    b = paramh;
    c = paramh;
    d = paramg;
    e = paramw;
    f = parame;
    g = parame;
    h = parami;
  }
  
  public c a()
  {
    return new c(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof u)) {
      return false;
    }
    paramObject = (u)paramObject;
    if ((!M.c(a, a)) || (!f.equals(f)) || (!M.c(b, b)) || (!M.c(d, d)) || (!M.c(e, e)) || (!M.c(h, h))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i1 = a.hashCode();
    h localh = b;
    int i2;
    if (localh != null) {
      i2 = localh.hashCode();
    } else {
      i2 = 0;
    }
    return ((((i1 * 31 + i2) * 31 + d.hashCode()) * 31 + f.hashCode()) * 31 + e.hashCode()) * 31 + h.hashCode();
  }
  
  public static final abstract class b {}
  
  public static final class c
  {
    public String a;
    public Uri b;
    public String c;
    public u.d.a d = new u.d.a();
    public u.f.a e = new u.f.a(null);
    public List f = Collections.emptyList();
    public String g;
    public v h = v.Y();
    public Object i;
    public long j = -9223372036854775807L;
    public w k;
    public u.g.a l = new u.g.a();
    public u.i m = u.i.d;
    
    public c() {}
    
    public c(u paramu)
    {
      this();
      a = a;
      k = e;
      l = d.a();
      m = h;
      u.h localh = b;
      if (localh != null)
      {
        g = e;
        c = b;
        b = a;
        f = d;
        h = f;
        i = h;
        paramu = c;
        if (paramu != null) {
          paramu = paramu.b();
        } else {
          paramu = new u.f.a(null);
        }
        e = paramu;
        j = i;
      }
    }
    
    public u a()
    {
      boolean bool;
      if ((u.f.a.e(e) != null) && (u.f.a.f(e) == null)) {
        bool = false;
      } else {
        bool = true;
      }
      a.f(bool);
      Object localObject1 = b;
      Object localObject2 = null;
      if (localObject1 != null)
      {
        localObject3 = c;
        if (u.f.a.f(e) != null) {
          localObject2 = e.i();
        }
        localObject2 = new u.h((Uri)localObject1, (String)localObject3, (u.f)localObject2, null, f, g, h, i, j, null);
      }
      else
      {
        localObject2 = null;
      }
      localObject1 = a;
      if (localObject1 == null) {
        for (;;)
        {
          localObject1 = "";
        }
      }
      u.e locale = d.g();
      u.g localg = l.f();
      Object localObject3 = k;
      if (localObject3 == null) {
        for (;;)
        {
          localObject3 = w.H;
        }
      }
      return new u((String)localObject1, locale, (u.h)localObject2, localg, (w)localObject3, m, null);
    }
    
    public c b(String paramString)
    {
      a = ((String)a.e(paramString));
      return this;
    }
    
    public c c(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public c d(Object paramObject)
    {
      i = paramObject;
      return this;
    }
    
    public c e(Uri paramUri)
    {
      b = paramUri;
      return this;
    }
  }
  
  public static class d
  {
    public static final d h = new a().f();
    public static final String i = M.w0(0);
    public static final String j = M.w0(1);
    public static final String k = M.w0(2);
    public static final String l = M.w0(3);
    public static final String m = M.w0(4);
    public static final String n = M.w0(5);
    public static final String o = M.w0(6);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    
    public d(a parama)
    {
      a = M.i1(a.a(parama));
      c = M.i1(a.b(parama));
      b = a.a(parama);
      d = a.b(parama);
      e = a.c(parama);
      f = a.d(parama);
      g = a.e(parama);
    }
    
    public a a()
    {
      return new a(this, null);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
      if ((b != b) || (d != d) || (e != e) || (f != f) || (g != g)) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      long l1 = b;
      int i1 = (int)(l1 ^ l1 >>> 32);
      l1 = d;
      return (((i1 * 31 + (int)(l1 >>> 32 ^ l1)) * 31 + e) * 31 + f) * 31 + g;
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
      
      public a(u.d paramd)
      {
        a = b;
        b = d;
        c = e;
        d = f;
        e = g;
      }
      
      public u.d f()
      {
        return new u.d(this, null);
      }
      
      public u.e g()
      {
        return new u.e(this, null);
      }
    }
  }
  
  public static final class e
    extends u.d
  {
    public static final e p = new u.d.a().g();
    
    public e(u.d.a parama)
    {
      super(null);
    }
  }
  
  public static final class f
  {
    public static final String l = M.w0(0);
    public static final String m = M.w0(1);
    public static final String n = M.w0(2);
    public static final String o = M.w0(3);
    public static final String p = M.w0(4);
    public static final String q = M.w0(5);
    public static final String r = M.w0(6);
    public static final String s = M.w0(7);
    public final UUID a;
    public final UUID b;
    public final Uri c;
    public final X2.w d;
    public final X2.w e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final v i;
    public final v j;
    public final byte[] k;
    
    public f(a parama)
    {
      boolean bool;
      if ((a.g(parama)) && (a.e(parama) == null)) {
        bool = false;
      } else {
        bool = true;
      }
      a.f(bool);
      UUID localUUID = (UUID)a.e(a.f(parama));
      a = localUUID;
      b = localUUID;
      c = a.e(parama);
      d = a.h(parama);
      e = a.h(parama);
      f = a.a(parama);
      h = a.g(parama);
      g = a.b(parama);
      i = a.c(parama);
      j = a.c(parama);
      if (a.d(parama) != null) {
        parama = Arrays.copyOf(a.d(parama), a.d(parama).length);
      } else {
        parama = null;
      }
      k = parama;
    }
    
    public a b()
    {
      return new a(this, null);
    }
    
    public byte[] c()
    {
      byte[] arrayOfByte = k;
      if (arrayOfByte != null) {
        arrayOfByte = Arrays.copyOf(arrayOfByte, arrayOfByte.length);
      } else {
        arrayOfByte = null;
      }
      return arrayOfByte;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof f)) {
        return false;
      }
      paramObject = (f)paramObject;
      if ((!a.equals(a)) || (!M.c(c, c)) || (!M.c(e, e)) || (f != f) || (h != h) || (g != g) || (!j.equals(j)) || (!Arrays.equals(k, k))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      int i1 = a.hashCode();
      Uri localUri = c;
      int i2;
      if (localUri != null) {
        i2 = localUri.hashCode();
      } else {
        i2 = 0;
      }
      return ((((((i1 * 31 + i2) * 31 + e.hashCode()) * 31 + f) * 31 + h) * 31 + g) * 31 + j.hashCode()) * 31 + Arrays.hashCode(k);
    }
    
    public static final class a
    {
      public UUID a;
      public Uri b;
      public X2.w c;
      public boolean d;
      public boolean e;
      public boolean f;
      public v g;
      public byte[] h;
      
      public a()
      {
        c = X2.w.j();
        e = true;
        g = v.Y();
      }
      
      public a(u.f paramf)
      {
        a = a;
        b = c;
        c = e;
        d = f;
        e = g;
        f = h;
        g = j;
        h = u.f.a(paramf);
      }
      
      public u.f i()
      {
        return new u.f(this, null);
      }
    }
  }
  
  public static final class g
  {
    public static final g f = new a().f();
    public static final String g = M.w0(0);
    public static final String h = M.w0(1);
    public static final String i = M.w0(2);
    public static final String j = M.w0(3);
    public static final String k = M.w0(4);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    
    public g(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2)
    {
      a = paramLong1;
      b = paramLong2;
      c = paramLong3;
      d = paramFloat1;
      e = paramFloat2;
    }
    
    public g(a parama)
    {
      this(a.a(parama), a.b(parama), a.c(parama), a.d(parama), a.e(parama));
    }
    
    public a a()
    {
      return new a(this, null);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof g)) {
        return false;
      }
      paramObject = (g)paramObject;
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      long l = a;
      int m = (int)(l ^ l >>> 32);
      l = b;
      int n = (int)(l ^ l >>> 32);
      l = c;
      int i1 = (int)(l >>> 32 ^ l);
      float f1 = d;
      int i2 = 0;
      int i3;
      if (f1 != 0.0F) {
        i3 = Float.floatToIntBits(f1);
      } else {
        i3 = 0;
      }
      f1 = e;
      if (f1 != 0.0F) {
        i2 = Float.floatToIntBits(f1);
      }
      return (((m * 31 + n) * 31 + i1) * 31 + i3) * 31 + i2;
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
      
      public a(u.g paramg)
      {
        a = a;
        b = b;
        c = c;
        d = d;
        e = e;
      }
      
      public u.g f()
      {
        return new u.g(this, null);
      }
      
      public a g(long paramLong)
      {
        c = paramLong;
        return this;
      }
      
      public a h(float paramFloat)
      {
        e = paramFloat;
        return this;
      }
      
      public a i(long paramLong)
      {
        b = paramLong;
        return this;
      }
      
      public a j(float paramFloat)
      {
        d = paramFloat;
        return this;
      }
      
      public a k(long paramLong)
      {
        a = paramLong;
        return this;
      }
    }
  }
  
  public static final class h
  {
    public static final String j = M.w0(0);
    public static final String k = M.w0(1);
    public static final String l = M.w0(2);
    public static final String m = M.w0(3);
    public static final String n = M.w0(4);
    public static final String o = M.w0(5);
    public static final String p = M.w0(6);
    public static final String q = M.w0(7);
    public final Uri a;
    public final String b;
    public final u.f c;
    public final List d;
    public final String e;
    public final v f;
    public final List g;
    public final Object h;
    public final long i;
    
    public h(Uri paramUri, String paramString1, u.f paramf, u.b paramb, List paramList, String paramString2, v paramv, Object paramObject, long paramLong)
    {
      a = paramUri;
      b = z.t(paramString1);
      c = paramf;
      d = paramList;
      e = paramString2;
      f = paramv;
      paramUri = v.M();
      for (int i1 = 0; i1 < paramv.size(); i1++) {
        paramUri.h(u.k.a.a(((u.k)paramv.get(i1)).a()));
      }
      g = paramUri.k();
      h = paramObject;
      i = paramLong;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof h)) {
        return false;
      }
      paramObject = (h)paramObject;
      if ((!a.equals(a)) || (!M.c(b, b)) || (!M.c(c, c)) || (!M.c(null, null)) || (!d.equals(d)) || (!M.c(e, e)) || (!f.equals(f)) || (!M.c(h, h)) || (!M.c(Long.valueOf(i), Long.valueOf(i)))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      int i1 = a.hashCode();
      Object localObject = b;
      int i2 = 0;
      int i3;
      if (localObject == null) {
        i3 = 0;
      } else {
        i3 = ((String)localObject).hashCode();
      }
      localObject = c;
      int i4;
      if (localObject == null) {
        i4 = 0;
      } else {
        i4 = ((u.f)localObject).hashCode();
      }
      int i5 = d.hashCode();
      localObject = e;
      int i6;
      if (localObject == null) {
        i6 = 0;
      } else {
        i6 = ((String)localObject).hashCode();
      }
      int i7 = f.hashCode();
      localObject = h;
      if (localObject != null) {
        i2 = localObject.hashCode();
      }
      return (int)(((((((i1 * 31 + i3) * 31 + i4) * 961 + i5) * 31 + i6) * 31 + i7) * 31 + i2) * 31L + i);
    }
  }
  
  public static final class i
  {
    public static final i d = new a().d();
    public static final String e = M.w0(0);
    public static final String f = M.w0(1);
    public static final String g = M.w0(2);
    public final Uri a;
    public final String b;
    public final Bundle c;
    
    public i(a parama)
    {
      a = a.a(parama);
      b = a.b(parama);
      c = a.c(parama);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof i)) {
        return false;
      }
      paramObject = (i)paramObject;
      if ((M.c(a, a)) && (M.c(b, b)))
      {
        int i;
        if (c == null) {
          i = 1;
        } else {
          i = 0;
        }
        int j;
        if (c == null) {
          j = 1;
        } else {
          j = 0;
        }
        if (i == j) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
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
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = ((String)localObject).hashCode();
      }
      if (c != null) {
        i = 1;
      }
      return (j * 31 + k) * 31 + i;
    }
    
    public static final class a
    {
      public Uri a;
      public String b;
      public Bundle c;
      
      public u.i d()
      {
        return new u.i(this, null);
      }
    }
  }
  
  public static final abstract class j
    extends u.k
  {}
  
  public static abstract class k
  {
    public abstract a a();
    
    public static final abstract class a
    {
      public abstract u.j b();
    }
  }
}

/* Location:
 * Qualified Name:     d0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */