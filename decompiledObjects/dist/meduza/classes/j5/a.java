package j5;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.util.SparseArray;
import h5.a.a;
import h5.f;
import h5.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.m;
import v5.t;
import v5.u;

public final class a
  extends f
{
  public final b m;
  
  public a(List<byte[]> paramList)
  {
    paramList = new u((byte[])paramList.get(0));
    m = new b(paramList.A(), paramList.A());
  }
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject1 = m.f;
      c.clear();
      d.clear();
      e.clear();
      f.clear();
      g.clear();
      h = null;
      i = null;
    }
    Object localObject2 = new j5/c;
    b localb = m;
    localb.getClass();
    Object localObject3 = new t(paramArrayOfByte, paramInt);
    int i;
    int k;
    int n;
    int i1;
    int i2;
    int i3;
    Object localObject4;
    while ((((t)localObject3).b() >= 48) && (((t)localObject3).g(8) == 15))
    {
      localObject1 = f;
      paramInt = ((t)localObject3).g(8);
      i = ((t)localObject3).g(16);
      int j = ((t)localObject3).g(16);
      k = ((t)localObject3).d();
      if (j * 8 > ((t)localObject3).b())
      {
        m.f("DvbParser", "Data field length exceeds limit");
        ((t)localObject3).m(((t)localObject3).b());
      }
      else
      {
        switch (paramInt)
        {
        default: 
          break;
        case 20: 
          if (i != a) {
            break label1046;
          }
          ((t)localObject3).m(4);
          paramBoolean = ((t)localObject3).f();
          ((t)localObject3).m(3);
          n = ((t)localObject3).g(16);
          i1 = ((t)localObject3).g(16);
          if (paramBoolean)
          {
            i2 = ((t)localObject3).g(16);
            i3 = ((t)localObject3).g(16);
            i = ((t)localObject3).g(16);
            paramInt = ((t)localObject3).g(16);
          }
          else
          {
            i3 = n;
            paramInt = i1;
            i2 = 0;
            i = 0;
          }
          h = new b.b(n, i1, i2, i3, i, paramInt);
          break;
        case 19: 
          if (i == a)
          {
            paramArrayOfByte = b.f((t)localObject3);
            localObject1 = e;
          }
          else
          {
            if (i != b) {
              break label1046;
            }
            paramArrayOfByte = b.f((t)localObject3);
            localObject1 = g;
          }
          paramInt = a;
          break;
        case 18: 
          if (i == a)
          {
            paramArrayOfByte = b.e((t)localObject3, j);
            localObject1 = d;
          }
          else
          {
            if (i != b) {
              break label1046;
            }
            paramArrayOfByte = b.e((t)localObject3, j);
            localObject1 = f;
          }
          paramInt = a;
          break;
        case 17: 
          localObject4 = i;
          if ((i != a) || (localObject4 == null)) {
            break label1046;
          }
          int i4 = ((t)localObject3).g(8);
          ((t)localObject3).m(4);
          paramBoolean = ((t)localObject3).f();
          ((t)localObject3).m(3);
          int i5 = ((t)localObject3).g(16);
          int i6 = ((t)localObject3).g(16);
          ((t)localObject3).g(3);
          i1 = ((t)localObject3).g(3);
          ((t)localObject3).m(2);
          int i7 = ((t)localObject3).g(8);
          n = ((t)localObject3).g(8);
          i3 = ((t)localObject3).g(4);
          i2 = ((t)localObject3).g(2);
          ((t)localObject3).m(2);
          paramInt = j - 10;
          paramArrayOfByte = new SparseArray();
          while (paramInt > 0)
          {
            int i8 = ((t)localObject3).g(16);
            int i9 = ((t)localObject3).g(2);
            ((t)localObject3).g(2);
            int i10 = ((t)localObject3).g(12);
            ((t)localObject3).m(4);
            int i11 = ((t)localObject3).g(12);
            i = paramInt - 6;
            if (i9 != 1)
            {
              paramInt = i;
              if (i9 != 2) {}
            }
            else
            {
              ((t)localObject3).g(8);
              ((t)localObject3).g(8);
              paramInt = i - 2;
            }
            paramArrayOfByte.put(i8, new b.g(i10, i11));
          }
          paramArrayOfByte = new b.f(i4, paramBoolean, i5, i6, i1, i7, n, i3, i2, paramArrayOfByte);
          if (b == 0)
          {
            localObject4 = (b.f)c.get(i4);
            if (localObject4 != null)
            {
              localObject4 = j;
              for (paramInt = 0; paramInt < ((SparseArray)localObject4).size(); paramInt++) {
                j.put(((SparseArray)localObject4).keyAt(paramInt), (b.g)((SparseArray)localObject4).valueAt(paramInt));
              }
            }
          }
          localObject1 = c;
          paramInt = a;
          ((SparseArray)localObject1).put(paramInt, paramArrayOfByte);
          break;
        }
        if (i == a)
        {
          paramArrayOfByte = i;
          ((t)localObject3).g(8);
          i = ((t)localObject3).g(4);
          i3 = ((t)localObject3).g(2);
          ((t)localObject3).m(2);
          paramInt = j - 2;
          localObject4 = new SparseArray();
          while (paramInt > 0)
          {
            i2 = ((t)localObject3).g(8);
            ((t)localObject3).m(8);
            n = ((t)localObject3).g(16);
            i1 = ((t)localObject3).g(16);
            paramInt -= 6;
            ((SparseArray)localObject4).put(i2, new b.e(n, i1));
          }
          localObject4 = new b.d(i, i3, (SparseArray)localObject4);
          if (i3 != 0)
          {
            i = ((b.d)localObject4);
            c.clear();
            d.clear();
            e.clear();
          }
          else if ((paramArrayOfByte != null) && (a != i))
          {
            i = ((b.d)localObject4);
          }
        }
        label1046:
        ((t)localObject3).n(k + j - ((t)localObject3).d());
      }
    }
    Object localObject1 = f;
    paramArrayOfByte = i;
    if (paramArrayOfByte == null)
    {
      localObject1 = Collections.emptyList();
      paramArrayOfByte = (byte[])localObject2;
    }
    else
    {
      localObject4 = h;
      if (localObject4 == null) {
        localObject4 = d;
      }
      localObject1 = g;
      if ((localObject1 != null) && (a + 1 == ((Bitmap)localObject1).getWidth())) {
        if (b + 1 == g.getHeight()) {
          break label1202;
        }
      }
      localObject1 = Bitmap.createBitmap(a + 1, b + 1, Bitmap.Config.ARGB_8888);
      g = ((Bitmap)localObject1);
      c.setBitmap((Bitmap)localObject1);
      label1202:
      ArrayList localArrayList = new ArrayList();
      localObject3 = c;
      paramInt = 0;
      paramArrayOfByte = (byte[])localObject2;
      while (paramInt < ((SparseArray)localObject3).size())
      {
        c.save();
        localObject1 = (b.e)((SparseArray)localObject3).valueAt(paramInt);
        i = ((SparseArray)localObject3).keyAt(paramInt);
        b.f localf = (b.f)f.c.get(i);
        i1 = a + c;
        i2 = b + e;
        i = Math.min(c + i1, d);
        i3 = Math.min(d + i2, f);
        c.clipRect(i1, i2, i, i3);
        localObject2 = (b.a)f.d.get(f);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = (b.a)f.f.get(f);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = e;
          }
        }
        SparseArray localSparseArray = j;
        i3 = 0;
        i = paramInt;
        while (i3 < localSparseArray.size())
        {
          paramInt = localSparseArray.keyAt(i3);
          Object localObject5 = (b.g)localSparseArray.valueAt(i3);
          localObject2 = (b.c)f.e.get(paramInt);
          Object localObject6 = localObject2;
          if (localObject2 == null) {
            localObject6 = (b.c)f.g.get(paramInt);
          }
          if (localObject6 != null)
          {
            Paint localPaint;
            if (b) {
              localPaint = null;
            } else {
              localPaint = a;
            }
            n = e;
            k = a + i1;
            paramInt = b + i2;
            localObject5 = c;
            if (n == 3) {
              localObject2 = d;
            }
            for (;;)
            {
              break;
              if (n == 2) {
                localObject2 = c;
              } else {
                localObject2 = b;
              }
            }
            b.d(c, (int[])localObject2, n, k, paramInt, localPaint, (Canvas)localObject5);
            b.d(d, (int[])localObject2, n, k, paramInt + 1, localPaint, (Canvas)localObject5);
          }
          i3++;
        }
        if (b)
        {
          paramInt = e;
          if (paramInt == 3) {
            paramInt = d[g];
          } else if (paramInt == 2) {
            paramInt = c[h];
          } else {
            paramInt = b[i];
          }
          b.setColor(paramInt);
          c.drawRect(i1, i2, c + i1, d + i2, b);
        }
        localObject1 = new a.a();
        b = Bitmap.createBitmap(g, i1, i2, c, d);
        float f1 = i1;
        float f2 = a;
        h = (f1 / f2);
        i = 0;
        f1 = i2;
        float f3 = b;
        e = (f1 / f3);
        f = 0;
        g = 0;
        l = (c / f2);
        m = (d / f3);
        localArrayList.add(((a.a)localObject1).a());
        c.drawColor(0, PorterDuff.Mode.CLEAR);
        c.restore();
        paramInt = i + 1;
      }
      localObject1 = Collections.unmodifiableList(localArrayList);
    }
    paramArrayOfByte.<init>((List)localObject1);
    return paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     j5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */