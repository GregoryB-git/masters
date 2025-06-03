package T0;

import X2.t;
import X2.v;
import a3.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.List;

public final class n
  extends i
{
  public static final Parcelable.Creator<n> CREATOR = new a();
  public final String p;
  public final String q;
  public final v r;
  
  public n(Parcel paramParcel)
  {
    this((String)a.e(paramParcel.readString()), paramParcel.readString(), v.V((String[])a.e(paramParcel.createStringArray())));
  }
  
  public n(String paramString1, String paramString2, List paramList)
  {
    super(paramString1);
    a.a(paramList.isEmpty() ^ true);
    p = paramString2;
    paramString1 = v.U(paramList);
    r = paramString1;
    q = ((String)paramString1.get(0));
  }
  
  public static List a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      int i;
      if (paramString.length() >= 10)
      {
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(5, 7))));
        i = Integer.parseInt(paramString.substring(8, 10));
      }
      for (;;)
      {
        localArrayList.add(Integer.valueOf(i));
        break;
        if (paramString.length() >= 7)
        {
          localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
          i = Integer.parseInt(paramString.substring(5, 7));
        }
        else
        {
          if (paramString.length() < 4) {
            break;
          }
          i = Integer.parseInt(paramString.substring(0, 4));
        }
      }
      return localArrayList;
    }
    catch (NumberFormatException paramString) {}
    return new ArrayList();
  }
  
  public void D(w.b paramb)
  {
    Object localObject = o;
    ((String)localObject).hashCode();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2590194: 
      if (((String)localObject).equals("TYER")) {
        j = 22;
      }
      break;
    case 2583398: 
      if (((String)localObject).equals("TRCK")) {
        j = 21;
      }
      break;
    case 2581514: 
      if (((String)localObject).equals("TPE3")) {
        j = 20;
      }
      break;
    case 2581513: 
      if (((String)localObject).equals("TPE2")) {
        j = 19;
      }
      break;
    case 2581512: 
      if (((String)localObject).equals("TPE1")) {
        j = 18;
      }
      break;
    case 2575251: 
      if (((String)localObject).equals("TIT2")) {
        j = 17;
      }
      break;
    case 2571565: 
      if (((String)localObject).equals("TEXT")) {
        j = 16;
      }
      break;
    case 2570410: 
      if (((String)localObject).equals("TDRL")) {
        j = 15;
      }
      break;
    case 2570401: 
      if (((String)localObject).equals("TDRC")) {
        j = 14;
      }
      break;
    case 2569891: 
      if (((String)localObject).equals("TDAT")) {
        j = 13;
      }
      break;
    case 2569358: 
      if (((String)localObject).equals("TCON")) {
        j = 12;
      }
      break;
    case 2569357: 
      if (((String)localObject).equals("TCOM")) {
        j = 11;
      }
      break;
    case 2567331: 
      if (((String)localObject).equals("TALB")) {
        j = 10;
      }
      break;
    case 83552: 
      if (((String)localObject).equals("TYE")) {
        j = 9;
      }
      break;
    case 83536: 
      if (((String)localObject).equals("TXT")) {
        j = 8;
      }
      break;
    case 83378: 
      if (((String)localObject).equals("TT2")) {
        j = 7;
      }
      break;
    case 83341: 
      if (((String)localObject).equals("TRK")) {
        j = 6;
      }
      break;
    case 83255: 
      if (((String)localObject).equals("TP3")) {
        j = 5;
      }
      break;
    case 83254: 
      if (((String)localObject).equals("TP2")) {
        j = 4;
      }
      break;
    case 83253: 
      if (((String)localObject).equals("TP1")) {
        j = 3;
      }
      break;
    case 82897: 
      if (((String)localObject).equals("TDA")) {
        j = 2;
      }
      break;
    case 82878: 
      if (((String)localObject).equals("TCM")) {
        j = 1;
      }
      break;
    case 82815: 
      if (((String)localObject).equals("TAL")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 15: 
      localObject = a((String)r.get(0));
      j = ((List)localObject).size();
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3) {
            paramb.i0((Integer)((List)localObject).get(2));
          }
        }
        else {
          paramb.j0((Integer)((List)localObject).get(1));
        }
      }
      else {
        paramb.k0((Integer)((List)localObject).get(0));
      }
      break;
    case 14: 
      localObject = a((String)r.get(0));
      j = ((List)localObject).size();
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3) {
            paramb.f0((Integer)((List)localObject).get(2));
          }
        }
        else {
          paramb.g0((Integer)((List)localObject).get(1));
        }
      }
      else {
        paramb.h0((Integer)((List)localObject).get(0));
      }
      break;
    case 12: 
      localObject = f.o((String)r.get(0));
      if (localObject == null) {
        localObject = (CharSequence)r.get(0);
      }
      do
      {
        paramb.b0((CharSequence)localObject);
        break;
        localObject = j.a(((Integer)localObject).intValue());
      } while (localObject != null);
    }
    try
    {
      paramb.h0(Integer.valueOf(Integer.parseInt((String)r.get(0))));
    }
    catch (NumberFormatException|StringIndexOutOfBoundsException paramb)
    {
      for (;;) {}
    }
    paramb.r0((CharSequence)r.get(0));
    break label1293;
    paramb.n0((CharSequence)r.get(0));
    break label1293;
    localObject = M.b1((String)r.get(0), "/");
    j = Integer.parseInt(localObject[0]);
    if (localObject.length > 1) {
      localObject = Integer.valueOf(Integer.parseInt(localObject[1]));
    } else {
      localObject = null;
    }
    paramb.q0(Integer.valueOf(j)).p0((Integer)localObject);
    break label1293;
    paramb.U((CharSequence)r.get(0));
    break label1293;
    paramb.N((CharSequence)r.get(0));
    break label1293;
    paramb.P((CharSequence)r.get(0));
    break label1293;
    localObject = (String)r.get(0);
    j = Integer.parseInt(((String)localObject).substring(2, 4));
    i = Integer.parseInt(((String)localObject).substring(0, 2));
    paramb.g0(Integer.valueOf(j)).f0(Integer.valueOf(i));
    break label1293;
    paramb.T((CharSequence)r.get(0));
    break label1293;
    paramb.O((CharSequence)r.get(0));
    label1293:
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (n.class == paramObject.getClass()))
    {
      paramObject = (n)paramObject;
      if ((!M.c(o, o)) || (!M.c(p, p)) || (!r.equals(r))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = o.hashCode();
    String str = p;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return ((527 + i) * 31 + j) * 31 + r.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(": description=");
    localStringBuilder.append(p);
    localStringBuilder.append(": values=");
    localStringBuilder.append(r);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeStringArray((String[])r.toArray(new String[0]));
  }
  
  public class a
    implements Parcelable.Creator
  {
    public n a(Parcel paramParcel)
    {
      return new n(paramParcel, null);
    }
    
    public n[] b(int paramInt)
    {
      return new n[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     T0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */