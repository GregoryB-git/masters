package x2;

import android.net.Uri;
import android.os.Build.VERSION;
import ec.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;
import n7.w;
import o2.c.a;
import q0.g;
import rb.h;
import x6.b;

public final class u$i
  extends p1.d
{
  public u$i(p1.j paramj)
  {
    super(paramj, 1);
  }
  
  public final String c()
  {
    return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }
  
  public final void e(t1.f paramf, Object paramObject)
  {
    paramObject = (s)paramObject;
    Object localObject1 = a;
    int i = 1;
    if (localObject1 == null) {
      paramf.d0(1);
    } else {
      paramf.n(1, (String)localObject1);
    }
    paramf.F(2, z.f(b));
    localObject1 = c;
    if (localObject1 == null) {
      paramf.d0(3);
    } else {
      paramf.n(3, (String)localObject1);
    }
    localObject1 = d;
    if (localObject1 == null) {
      paramf.d0(4);
    } else {
      paramf.n(4, (String)localObject1);
    }
    localObject1 = androidx.work.c.e(e);
    if (localObject1 == null) {
      paramf.d0(5);
    } else {
      paramf.T((byte[])localObject1, 5);
    }
    localObject1 = androidx.work.c.e(f);
    if (localObject1 == null) {
      paramf.d0(6);
    } else {
      paramf.T((byte[])localObject1, 6);
    }
    paramf.F(7, g);
    paramf.F(8, h);
    paramf.F(9, i);
    paramf.F(10, k);
    int j = l;
    a0.j.p(j, "backoffPolicy");
    j = g.c(j);
    if (j != 0)
    {
      if (j == 1) {
        j = 1;
      } else {
        throw new w();
      }
    }
    else {
      j = 0;
    }
    paramf.F(11, j);
    paramf.F(12, m);
    paramf.F(13, n);
    paramf.F(14, o);
    paramf.F(15, p);
    paramf.F(16, q);
    j = r;
    a0.j.p(j, "policy");
    j = g.c(j);
    if (j != 0)
    {
      if (j == 1) {
        j = 1;
      } else {
        throw new w();
      }
    }
    else {
      j = 0;
    }
    paramf.F(17, j);
    paramf.F(18, s);
    paramf.F(19, t);
    paramf.F(20, u);
    paramf.F(21, v);
    paramf.F(22, w);
    paramObject = j;
    if (paramObject != null)
    {
      int k = a;
      a0.j.p(k, "networkType");
      int m = g.c(k);
      if (m != 0)
      {
        j = i;
        if (m != 1) {
          if (m != 2)
          {
            if (m != 3)
            {
              if (m != 4)
              {
                if ((Build.VERSION.SDK_INT >= 30) && (k == 6))
                {
                  j = 5;
                }
                else
                {
                  paramf = f.l("Could not convert ");
                  paramf.append(a0.j.x(k));
                  paramf.append(" to int");
                  throw new IllegalArgumentException(paramf.toString());
                }
              }
              else {
                j = 4;
              }
            }
            else {
              j = 3;
            }
          }
          else {
            j = 2;
          }
        }
      }
      else
      {
        j = 0;
      }
      paramf.F(23, j);
      paramf.F(24, b);
      paramf.F(25, c);
      paramf.F(26, d);
      paramf.F(27, e);
      paramf.F(28, f);
      paramf.F(29, g);
      Object localObject3 = h;
      i.e(localObject3, "triggers");
      if (((Set)localObject3).isEmpty()) {
        paramObject = new byte[0];
      } else {
        paramObject = new ByteArrayOutputStream();
      }
      try
      {
        localObject1 = new java/io/ObjectOutputStream;
        ((ObjectOutputStream)localObject1).<init>((OutputStream)paramObject);
        try
        {
          ((ObjectOutputStream)localObject1).writeInt(((Set)localObject3).size());
          localObject3 = ((Set)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            c.a locala = (c.a)((Iterator)localObject3).next();
            ((ObjectOutputStream)localObject1).writeUTF(a.toString());
            ((ObjectOutputStream)localObject1).writeBoolean(b);
          }
          localObject3 = h.a;
          b.L((Closeable)localObject1, null);
          b.L((Closeable)paramObject, null);
          paramObject = ((ByteArrayOutputStream)paramObject).toByteArray();
          i.d(paramObject, "outputStream.toByteArray()");
          paramf.T((byte[])paramObject, 30);
        }
        finally {}
        paramf.d0(23);
      }
      finally
      {
        try
        {
          throw paramf;
        }
        finally
        {
          b.L((Closeable)paramObject, paramf);
        }
      }
    }
    paramf.d0(24);
    paramf.d0(25);
    paramf.d0(26);
    paramf.d0(27);
    paramf.d0(28);
    paramf.d0(29);
    paramf.d0(30);
  }
}

/* Location:
 * Qualified Name:     x2.u.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */