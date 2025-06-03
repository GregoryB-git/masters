package q5;

import android.text.TextUtils;
import h5.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v3.a1;
import v5.e0;
import v5.m;
import v5.u;
import x6.b;

public final class g
  extends h5.f
{
  public final u m = new u();
  public final c n = new c();
  
  public final h5.g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    m.E(paramArrayOfByte, paramInt);
    ArrayList localArrayList1 = new ArrayList();
    try
    {
      h.d(m);
      while (!TextUtils.isEmpty(m.g())) {}
      ArrayList localArrayList2 = new ArrayList();
      for (;;)
      {
        Object localObject1 = m;
        int i = 2;
        int k = 1;
        paramInt = -1;
        int i1 = 0;
        while (paramInt == -1)
        {
          i1 = b;
          paramArrayOfByte = ((u)localObject1).g();
          if (paramArrayOfByte == null) {
            paramInt = 0;
          } else if ("STYLE".equals(paramArrayOfByte)) {
            paramInt = 2;
          } else if (paramArrayOfByte.startsWith("NOTE")) {
            paramInt = 1;
          } else {
            paramInt = 3;
          }
        }
        ((u)localObject1).G(i1);
        if (paramInt == 0) {
          break;
        }
        if (paramInt == 1)
        {
          paramArrayOfByte = m;
          while (!TextUtils.isEmpty(paramArrayOfByte.g())) {}
        }
        else
        {
          Object localObject2;
          Object localObject3;
          if (paramInt == 2)
          {
            if (localArrayList2.isEmpty())
            {
              m.g();
              localObject2 = n;
              paramArrayOfByte = m;
              b.setLength(0);
              paramInt = b;
              while (!TextUtils.isEmpty(paramArrayOfByte.g())) {}
              a.E(a, b);
              a.G(paramInt);
              localObject3 = new ArrayList();
              paramInt = k;
              i1 = i;
              for (;;)
              {
                Object localObject4 = a;
                localObject1 = b;
                c.c((u)localObject4);
                if ((c - b >= 5) && ("::cue".equals(((u)localObject4).s(5))))
                {
                  i = b;
                  paramArrayOfByte = c.b((u)localObject4, (StringBuilder)localObject1);
                  if (paramArrayOfByte != null)
                  {
                    if ("{".equals(paramArrayOfByte))
                    {
                      ((u)localObject4).G(i);
                      paramArrayOfByte = "";
                      break label464;
                    }
                    if ("(".equals(paramArrayOfByte))
                    {
                      k = b;
                      int i2 = c;
                      i = 0;
                      while ((k < i2) && (i == 0))
                      {
                        if ((char)a[k] == ')') {
                          i = paramInt;
                        } else {
                          i = 0;
                        }
                        k++;
                      }
                      paramArrayOfByte = ((u)localObject4).s(k - 1 - b).trim();
                    }
                    else
                    {
                      paramArrayOfByte = null;
                    }
                    if (")".equals(c.b((u)localObject4, (StringBuilder)localObject1))) {
                      break label464;
                    }
                  }
                }
                paramArrayOfByte = null;
                label464:
                if ((paramArrayOfByte == null) || (!"{".equals(c.b(a, b)))) {
                  break;
                }
                localObject4 = new d();
                if (!"".equals(paramArrayOfByte))
                {
                  i = paramArrayOfByte.indexOf('[');
                  localObject1 = paramArrayOfByte;
                  if (i != -1)
                  {
                    localObject1 = c.c.matcher(paramArrayOfByte.substring(i));
                    if (((Matcher)localObject1).matches())
                    {
                      localObject1 = ((Matcher)localObject1).group(paramInt);
                      localObject1.getClass();
                      d = ((String)localObject1);
                    }
                    localObject1 = paramArrayOfByte.substring(0, i);
                  }
                  i = e0.a;
                  paramArrayOfByte = ((String)localObject1).split("\\.", -1);
                  localObject1 = paramArrayOfByte[0];
                  i = ((String)localObject1).indexOf('#');
                  if (i != -1)
                  {
                    b = ((String)localObject1).substring(0, i);
                    a = ((String)localObject1).substring(i + 1);
                  }
                  else
                  {
                    b = ((String)localObject1);
                  }
                  if (paramArrayOfByte.length > paramInt)
                  {
                    k = paramArrayOfByte.length;
                    if (k <= paramArrayOfByte.length) {
                      i = paramInt;
                    } else {
                      i = 0;
                    }
                    b.q(i);
                    c = new HashSet(Arrays.asList((String[])Arrays.copyOfRange(paramArrayOfByte, paramInt, k)));
                  }
                }
                int j = 0;
                paramArrayOfByte = null;
                label940:
                label1458:
                label1460:
                label1510:
                label1542:
                label1548:
                while (j == 0)
                {
                  paramArrayOfByte = a;
                  k = b;
                  paramArrayOfByte = c.b(paramArrayOfByte, b);
                  if ((paramArrayOfByte != null) && (!"}".equals(paramArrayOfByte))) {
                    j = 0;
                  } else {
                    j = paramInt;
                  }
                  if (j == 0)
                  {
                    a.G(k);
                    Object localObject5 = a;
                    Object localObject6 = b;
                    c.c((u)localObject5);
                    String str1 = c.a((u)localObject5, (StringBuilder)localObject6);
                    if (!"".equals(str1))
                    {
                      if (":".equals(c.b((u)localObject5, (StringBuilder)localObject6)))
                      {
                        c.c((u)localObject5);
                        localObject1 = new StringBuilder();
                        paramInt = 0;
                        while (paramInt == 0)
                        {
                          i1 = b;
                          String str2 = c.b((u)localObject5, (StringBuilder)localObject6);
                          if (str2 == null)
                          {
                            localObject1 = null;
                            break label940;
                          }
                          if ((!"}".equals(str2)) && (!";".equals(str2)))
                          {
                            ((StringBuilder)localObject1).append(str2);
                          }
                          else
                          {
                            ((u)localObject5).G(i1);
                            paramInt = 1;
                          }
                        }
                        localObject1 = ((StringBuilder)localObject1).toString();
                        if ((localObject1 != null) && (!"".equals(localObject1)))
                        {
                          paramInt = b;
                          localObject6 = c.b((u)localObject5, (StringBuilder)localObject6);
                          if (!";".equals(localObject6))
                          {
                            if ("}".equals(localObject6)) {
                              ((u)localObject5).G(paramInt);
                            }
                          }
                          else if ("color".equals(str1))
                          {
                            f = v5.d.a((String)localObject1, true);
                            g = true;
                          }
                          else if ("background-color".equals(str1))
                          {
                            h = v5.d.a((String)localObject1, true);
                            i = true;
                          }
                          else if ("ruby-position".equals(str1))
                          {
                            if ("over".equals(localObject1))
                            {
                              p = 1;
                            }
                            else if ("under".equals(localObject1))
                            {
                              p = 2;
                              i1 = 2;
                              paramInt = 1;
                              break label1548;
                            }
                          }
                          else if ("text-combine-upright".equals(str1))
                          {
                            if ((!"all".equals(localObject1)) && (!((String)localObject1).startsWith("digits"))) {
                              paramBoolean = false;
                            } else {
                              paramBoolean = true;
                            }
                            q = paramBoolean;
                          }
                          else if ("text-decoration".equals(str1))
                          {
                            if ("underline".equals(localObject1))
                            {
                              paramInt = 1;
                              k = 1;
                              break label1542;
                            }
                          }
                          else if ("font-family".equals(str1))
                          {
                            e = b.x0((String)localObject1);
                          }
                          else if ("font-weight".equals(str1))
                          {
                            if ("bold".equals(localObject1)) {
                              l = 1;
                            }
                          }
                          else if ("font-style".equals(str1))
                          {
                            if ("italic".equals(localObject1)) {
                              m = 1;
                            }
                          }
                          else if ("font-size".equals(str1))
                          {
                            localObject5 = c.d.matcher(b.x0((String)localObject1));
                            if (!((Matcher)localObject5).matches())
                            {
                              localObject5 = new StringBuilder();
                              ((StringBuilder)localObject5).append("Invalid font-size: '");
                              ((StringBuilder)localObject5).append((String)localObject1);
                              ((StringBuilder)localObject5).append("'.");
                              m.f("WebvttCssParser", ((StringBuilder)localObject5).toString());
                            }
                            else
                            {
                              localObject1 = ((Matcher)localObject5).group(2);
                              localObject1.getClass();
                              paramInt = ((String)localObject1).hashCode();
                              if (paramInt != 37)
                              {
                                if (paramInt != 3240)
                                {
                                  if ((paramInt == 3592) && (((String)localObject1).equals("px")))
                                  {
                                    paramInt = 2;
                                    break label1460;
                                  }
                                }
                                else if (((String)localObject1).equals("em"))
                                {
                                  paramInt = 1;
                                  break label1460;
                                }
                              }
                              else {
                                if (((String)localObject1).equals("%")) {
                                  break label1458;
                                }
                              }
                              paramInt = -1;
                              break label1460;
                              paramInt = 0;
                              k = 1;
                              i1 = 2;
                              if (paramInt != 0)
                              {
                                if (paramInt != 1)
                                {
                                  if (paramInt == 2)
                                  {
                                    n = 1;
                                    break label1510;
                                  }
                                  throw new IllegalStateException();
                                }
                                paramInt = 2;
                              }
                              else
                              {
                                paramInt = 3;
                              }
                              n = paramInt;
                              localObject1 = ((Matcher)localObject5).group(1);
                              localObject1.getClass();
                              o = Float.parseFloat((String)localObject1);
                              paramInt = k;
                              break label1548;
                            }
                          }
                        }
                        paramInt = 1;
                      }
                      i1 = 2;
                    }
                  }
                }
                if ("}".equals(paramArrayOfByte)) {
                  ((ArrayList)localObject3).add(localObject4);
                }
              }
              localArrayList1.addAll((Collection)localObject3);
            }
            else
            {
              throw new i("A style block was found after the first cue.");
            }
          }
          else if (paramInt == 3)
          {
            paramArrayOfByte = m;
            localObject1 = f.a;
            localObject1 = paramArrayOfByte.g();
            if (localObject1 == null)
            {
              paramArrayOfByte = null;
            }
            else
            {
              localObject2 = f.a;
              localObject3 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
              if (((Matcher)localObject3).matches())
              {
                paramArrayOfByte = f.d(null, (Matcher)localObject3, paramArrayOfByte, localArrayList1);
              }
              else
              {
                localObject3 = paramArrayOfByte.g();
                if (localObject3 != null)
                {
                  localObject2 = ((Pattern)localObject2).matcher((CharSequence)localObject3);
                  if (((Matcher)localObject2).matches())
                  {
                    paramArrayOfByte = f.d(((String)localObject1).trim(), (Matcher)localObject2, paramArrayOfByte, localArrayList1);
                    break label1709;
                  }
                }
                paramArrayOfByte = null;
              }
            }
            label1709:
            if (paramArrayOfByte != null) {
              localArrayList2.add(paramArrayOfByte);
            }
          }
        }
      }
      return new j(localArrayList2);
    }
    catch (a1 paramArrayOfByte)
    {
      throw new i(paramArrayOfByte);
    }
  }
}

/* Location:
 * Qualified Name:     q5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */