package ad;

import a0.j;
import ec.i;
import f;

public final class b
{
  public int a;
  public String b;
  public a c;
  public int d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public boolean j;
  public boolean k;
  public boolean l;
  public long m;
  public boolean n;
  public boolean o;
  
  public b(int paramInt1, String paramString1, a parama, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong, boolean paramBoolean4, boolean paramBoolean5)
  {
    a = paramInt1;
    b = paramString1;
    c = parama;
    d = paramInt2;
    e = paramString2;
    f = paramString3;
    g = paramString4;
    h = paramString5;
    i = paramString6;
    j = paramBoolean1;
    k = paramBoolean2;
    l = paramBoolean3;
    m = paramLong;
    n = paramBoolean4;
    o = paramBoolean5;
  }
  
  public final int a()
  {
    return d;
  }
  
  public final boolean b()
  {
    return j;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if (a != a) {
      return false;
    }
    if (!i.a(b, b)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (!i.a(e, e)) {
      return false;
    }
    if (!i.a(f, f)) {
      return false;
    }
    if (!i.a(g, g)) {
      return false;
    }
    if (!i.a(h, h)) {
      return false;
    }
    if (!i.a(i, i)) {
      return false;
    }
    if (j != j) {
      return false;
    }
    if (k != k) {
      return false;
    }
    if (l != l) {
      return false;
    }
    if (m != m) {
      return false;
    }
    if (n != n) {
      return false;
    }
    return o == o;
  }
  
  public final int hashCode()
  {
    int i1 = a;
    int i2 = j.e(b, i1 * 31, 31);
    int i3 = c.hashCode();
    i1 = d;
    i2 = j.e(e, ((i3 + i2) * 31 + i1) * 31, 31);
    String str = f;
    if (str == null) {
      i1 = 0;
    } else {
      i1 = str.hashCode();
    }
    i1 = j.e(g, (i2 + i1) * 31, 31);
    i1 = j.e(h, i1, 31);
    int i4 = j.e(i, i1, 31);
    boolean bool = j;
    int i5 = 1231;
    if (bool) {
      i1 = 1231;
    } else {
      i1 = 1237;
    }
    if (k) {
      i2 = 1231;
    } else {
      i2 = 1237;
    }
    if (l) {
      i3 = 1231;
    } else {
      i3 = 1237;
    }
    long l1 = m;
    int i6 = (int)(l1 ^ l1 >>> 32);
    int i7;
    if (n) {
      i7 = 1231;
    } else {
      i7 = 1237;
    }
    if (!o) {
      i5 = 1237;
    }
    return (((((i4 + i1) * 31 + i2) * 31 + i3) * 31 + i6) * 31 + i7) * 31 + i5;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DownloadTask(primaryId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", taskId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", status=");
    localStringBuilder.append(c);
    localStringBuilder.append(", progress=");
    localStringBuilder.append(d);
    localStringBuilder.append(", url=");
    localStringBuilder.append(e);
    localStringBuilder.append(", filename=");
    localStringBuilder.append(f);
    localStringBuilder.append(", savedDir=");
    localStringBuilder.append(g);
    localStringBuilder.append(", headers=");
    localStringBuilder.append(h);
    localStringBuilder.append(", mimeType=");
    localStringBuilder.append(i);
    localStringBuilder.append(", resumable=");
    localStringBuilder.append(j);
    localStringBuilder.append(", showNotification=");
    localStringBuilder.append(k);
    localStringBuilder.append(", openFileFromNotification=");
    localStringBuilder.append(l);
    localStringBuilder.append(", timeCreated=");
    localStringBuilder.append(m);
    localStringBuilder.append(", saveInPublicStorage=");
    localStringBuilder.append(n);
    localStringBuilder.append(", allowCellular=");
    localStringBuilder.append(o);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ad.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */