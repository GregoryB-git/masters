package t6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.h.a;
import s6.b;

public final class a$a<I, O>
  extends n6.a
{
  public static final d CREATOR = new d();
  public final int a;
  public final int b;
  public final boolean c;
  public final int d;
  public final boolean e;
  public final String f;
  public final int o;
  public final Class p;
  public final String q;
  public h r;
  public final a.b s;
  
  public a$a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, b paramb)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramBoolean1;
    d = paramInt3;
    e = paramBoolean2;
    f = paramString1;
    o = paramInt4;
    if (paramString2 == null)
    {
      p = null;
      q = null;
    }
    else
    {
      p = c.class;
      q = paramString2;
    }
    if (paramb == null)
    {
      s = null;
      return;
    }
    paramString1 = b;
    if (paramString1 != null)
    {
      s = paramString1;
      return;
    }
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public a$a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class paramClass)
  {
    a = 1;
    b = paramInt1;
    c = paramBoolean1;
    d = paramInt2;
    e = paramBoolean2;
    f = paramString;
    o = paramInt3;
    p = paramClass;
    if (paramClass == null) {
      paramString = null;
    } else {
      paramString = paramClass.getCanonicalName();
    }
    q = paramString;
    s = null;
  }
  
  public static a D(int paramInt, String paramString)
  {
    return new a(7, true, 7, true, paramString, paramInt, null);
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(Integer.valueOf(a), "versionCode");
    locala.a(Integer.valueOf(b), "typeIn");
    locala.a(Boolean.valueOf(c), "typeInArray");
    locala.a(Integer.valueOf(d), "typeOut");
    locala.a(Boolean.valueOf(e), "typeOutArray");
    locala.a(f, "outputFieldName");
    locala.a(Integer.valueOf(o), "safeParcelFieldId");
    String str = q;
    Object localObject = str;
    if (str == null) {
      localObject = null;
    }
    locala.a(localObject, "concreteTypeName");
    localObject = p;
    if (localObject != null) {
      locala.a(((Class)localObject).getCanonicalName(), "concreteType.class");
    }
    localObject = s;
    if (localObject != null) {
      locala.a(localObject.getClass().getCanonicalName(), "converterName");
    }
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.z(paramParcel, 2, b);
    z.t(paramParcel, 3, c);
    z.z(paramParcel, 4, d);
    z.t(paramParcel, 5, e);
    z.F(paramParcel, 6, f, false);
    z.z(paramParcel, 7, o);
    String str = q;
    Object localObject1 = null;
    Object localObject2 = str;
    if (str == null) {
      localObject2 = null;
    }
    z.F(paramParcel, 8, (String)localObject2, false);
    localObject2 = s;
    if (localObject2 == null)
    {
      localObject2 = localObject1;
    }
    else
    {
      if (!(localObject2 instanceof s6.a)) {
        break label164;
      }
      localObject2 = new b((s6.a)localObject2);
    }
    z.E(paramParcel, 9, (Parcelable)localObject2, paramInt, false);
    z.L(j, paramParcel);
    return;
    label164:
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
}

/* Location:
 * Qualified Name:     t6.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */