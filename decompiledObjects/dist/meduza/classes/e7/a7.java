package e7;

import com.google.android.gms.internal.measurement.zzgf.zzm;
import com.google.android.gms.internal.measurement.zzoh;
import d2.q;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.g.c;

public final class a7
{
  public String a;
  public boolean b;
  public zzgf.zzm c;
  public BitSet d;
  public BitSet e;
  public Map<Integer, Long> f;
  public r.b g;
  
  public a7() {}
  
  public a7(y6 paramy6, String paramString)
  {
    a = paramString;
    b = true;
    d = new BitSet();
    e = new BitSet();
    f = new r.b();
    g = new r.b();
  }
  
  public a7(y6 paramy6, String paramString, zzgf.zzm paramzzm, BitSet paramBitSet1, BitSet paramBitSet2, r.b paramb1, r.b paramb2)
  {
    a = paramString;
    d = paramBitSet1;
    e = paramBitSet2;
    f = paramb1;
    g = new r.b();
    paramBitSet1 = ((g.c)paramb2.keySet()).iterator();
    while (paramBitSet1.hasNext())
    {
      paramString = (Integer)paramBitSet1.next();
      paramy6 = new ArrayList();
      paramy6.add((Long)paramb2.getOrDefault(paramString, null));
      g.put(paramString, paramy6);
    }
    b = false;
    c = paramzzm;
  }
  
  public final void a(b paramb)
  {
    int i = paramb.a();
    Object localObject = c;
    if (localObject != null) {
      e.set(i, ((Boolean)localObject).booleanValue());
    }
    localObject = d;
    if (localObject != null) {
      d.set(i, ((Boolean)localObject).booleanValue());
    }
    long l;
    if (e != null)
    {
      localObject = (Long)f.get(Integer.valueOf(i));
      l = e.longValue() / 1000L;
      if ((localObject == null) || (l > ((Long)localObject).longValue())) {
        f.put(Integer.valueOf(i), Long.valueOf(l));
      }
    }
    if (f != null)
    {
      List localList = (List)g.getOrDefault(Integer.valueOf(i), null);
      localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        g.put(Integer.valueOf(i), localObject);
      }
      if (paramb.f()) {
        ((List)localObject).clear();
      }
      if ((zzoh.zza()) && (h.h().x(a, h0.A0)) && (paramb.e())) {
        ((List)localObject).clear();
      }
      if ((zzoh.zza()) && (h.h().x(a, h0.A0)))
      {
        l = f.longValue() / 1000L;
        if (!((List)localObject).contains(Long.valueOf(l))) {
          ((List)localObject).add(Long.valueOf(l));
        }
        return;
      }
      ((List)localObject).add(Long.valueOf(f.longValue() / 1000L));
    }
  }
}

/* Location:
 * Qualified Name:     e7.a7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */