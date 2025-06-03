package u4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import o7.l0;
import o7.r;
import o7.t;
import v3.p0.a;
import v5.e0;
import x6.b;

public final class l
  extends h
{
  public static final Parcelable.Creator<l> CREATOR = new a();
  public final String b;
  public final t<String> c;
  
  public l(String paramString1, String paramString2, l0 paraml0)
  {
    super(paramString1);
    b.q(paraml0.isEmpty() ^ true);
    b = paramString2;
    paramString1 = t.p(paraml0);
    c = paramString1;
    paramString1 = (String)paramString1.get(0);
  }
  
  public static ArrayList a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      if (paramString.length() >= 10)
      {
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(5, 7))));
        paramString = paramString.substring(8, 10);
      }
      int i;
      for (;;)
      {
        i = Integer.parseInt(paramString);
        break;
        if (paramString.length() >= 7)
        {
          localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
          paramString = paramString.substring(5, 7);
        }
        else
        {
          if (paramString.length() < 4) {
            break label133;
          }
          paramString = paramString.substring(0, 4);
        }
      }
      localArrayList.add(Integer.valueOf(i));
      label133:
      return localArrayList;
    }
    catch (NumberFormatException paramString) {}
    return new ArrayList();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (l.class == paramObject.getClass()))
    {
      paramObject = (l)paramObject;
      if ((!e0.a(a, a)) || (!e0.a(b, b)) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 527, 31);
    String str = b;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    return c.hashCode() + (i + j) * 31;
  }
  
  public final void l(p0.a parama)
  {
    Object localObject = a;
    localObject.getClass();
    switch (((String)localObject).hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                i = -1;
                                                break;
                                              } while (!((String)localObject).equals("TYER"));
                                              i = 21;
                                              break;
                                            } while (!((String)localObject).equals("TRCK"));
                                            i = 20;
                                            break;
                                          } while (!((String)localObject).equals("TPE3"));
                                          i = 19;
                                          break;
                                        } while (!((String)localObject).equals("TPE2"));
                                        i = 18;
                                        break;
                                      } while (!((String)localObject).equals("TPE1"));
                                      i = 17;
                                      break;
                                    } while (!((String)localObject).equals("TIT2"));
                                    i = 16;
                                    break;
                                  } while (!((String)localObject).equals("TEXT"));
                                  i = 15;
                                  break;
                                } while (!((String)localObject).equals("TDRL"));
                                i = 14;
                                break;
                              } while (!((String)localObject).equals("TDRC"));
                              i = 13;
                              break;
                            } while (!((String)localObject).equals("TDAT"));
                            i = 12;
                            break;
                          } while (!((String)localObject).equals("TCOM"));
                          i = 11;
                          break;
                        } while (!((String)localObject).equals("TALB"));
                        i = 10;
                        break;
                      } while (!((String)localObject).equals("TYE"));
                      i = 9;
                      break;
                    } while (!((String)localObject).equals("TXT"));
                    i = 8;
                    break;
                  } while (!((String)localObject).equals("TT2"));
                  i = 7;
                  break;
                } while (!((String)localObject).equals("TRK"));
                i = 6;
                break;
              } while (!((String)localObject).equals("TP3"));
              i = 5;
              break;
            } while (!((String)localObject).equals("TP2"));
            i = 4;
            break;
          } while (!((String)localObject).equals("TP1"));
          i = 3;
          break;
        } while (!((String)localObject).equals("TDA"));
        i = 2;
        break;
      } while (!((String)localObject).equals("TCM"));
      i = 1;
      break;
    } while (!((String)localObject).equals("TAL"));
    int i = 0;
    switch (i)
    {
    default: 
      break;
    case 14: 
      localObject = a((String)c.get(0));
      i = ((ArrayList)localObject).size();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            w = ((Integer)((ArrayList)localObject).get(2));
          }
        }
        else {
          v = ((Integer)((ArrayList)localObject).get(1));
        }
      }
      else {
        u = ((Integer)((ArrayList)localObject).get(0));
      }
      break;
    case 13: 
      localObject = a((String)c.get(0));
      i = ((ArrayList)localObject).size();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            t = ((Integer)((ArrayList)localObject).get(2));
          }
        }
        else {
          s = ((Integer)((ArrayList)localObject).get(1));
        }
      }
      else {
        r = ((Integer)((ArrayList)localObject).get(0));
      }
      break;
    }
    try
    {
      r = Integer.valueOf(Integer.parseInt((String)c.get(0)));
    }
    catch (NumberFormatException|StringIndexOutOfBoundsException parama)
    {
      int j;
      for (;;) {}
    }
    x = ((CharSequence)c.get(0));
    break label1145;
    a = ((CharSequence)c.get(0));
    break label1145;
    localObject = (String)c.get(0);
    i = e0.a;
    localObject = ((String)localObject).split("/", -1);
    i = Integer.parseInt(localObject[0]);
    if (localObject.length > 1) {
      localObject = Integer.valueOf(Integer.parseInt(localObject[1]));
    } else {
      localObject = null;
    }
    m = Integer.valueOf(i);
    n = ((Integer)localObject);
    break label1145;
    z = ((CharSequence)c.get(0));
    break label1145;
    d = ((CharSequence)c.get(0));
    break label1145;
    b = ((CharSequence)c.get(0));
    break label1145;
    localObject = (String)c.get(0);
    i = Integer.parseInt(((String)localObject).substring(2, 4));
    j = Integer.parseInt(((String)localObject).substring(0, 2));
    s = Integer.valueOf(i);
    t = Integer.valueOf(j);
    break label1145;
    y = ((CharSequence)c.get(0));
    break label1145;
    c = ((CharSequence)c.get(0));
    label1145:
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": description=");
    localStringBuilder.append(b);
    localStringBuilder.append(": values=");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeStringArray((String[])c.toArray(new String[0]));
  }
  
  public final class a
    implements Parcelable.Creator<l>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      String str1 = paramParcel.readString();
      str1.getClass();
      String str2 = paramParcel.readString();
      paramParcel = paramParcel.createStringArray();
      paramParcel.getClass();
      return new l(str1, str2, t.q(paramParcel));
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new l[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */