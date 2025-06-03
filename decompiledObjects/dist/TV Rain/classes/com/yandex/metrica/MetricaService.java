package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.B1;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Il;
import com.yandex.metrica.impl.ob.k2;
import com.yandex.metrica.impl.ob.p1;
import com.yandex.metrica.impl.ob.q1;
import com.yandex.metrica.impl.ob.r1;

public class MetricaService
  extends Service
{
  private static p1 c;
  private final d a = new a();
  private final IMetricaService.a b = new b();
  
  public IBinder onBind(Intent paramIntent)
  {
    Object localObject;
    if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(paramIntent.getAction())) {
      localObject = new c();
    } else {
      localObject = b;
    }
    c.a(paramIntent);
    return (IBinder)localObject;
  }
  
  public void onConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    c.onConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate()
  {
    super.onCreate();
    F0.a(getApplicationContext());
    Il.a(getApplicationContext());
    p1 localp1 = c;
    if (localp1 == null) {
      c = new q1(new r1(getApplicationContext(), a));
    } else {
      localp1.a(a);
    }
    c.a();
    F0.g().a(new k2(c));
  }
  
  public void onDestroy()
  {
    c.b();
    super.onDestroy();
  }
  
  public void onRebind(Intent paramIntent)
  {
    super.onRebind(paramIntent);
    c.c(paramIntent);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    c.a(paramIntent, paramInt);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    c.a(paramIntent, paramInt1, paramInt2);
    return 2;
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    c.b(paramIntent);
    if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(paramIntent.getAction())) {
      return false;
    }
    int i;
    if (paramIntent.getData() == null) {
      i = 1;
    } else {
      i = 0;
    }
    return i == 0;
  }
  
  public class a
    implements MetricaService.d
  {
    public a() {}
    
    public void a(int paramInt)
    {
      stopSelfResult(paramInt);
    }
  }
  
  public class b
    extends IMetricaService.a
  {
    public b() {}
    
    public void a(int paramInt, Bundle paramBundle)
      throws RemoteException
    {
      MetricaService.a().a(paramInt, paramBundle);
    }
    
    public void a(@NonNull Bundle paramBundle)
      throws RemoteException
    {
      MetricaService.a().a(paramBundle);
    }
    
    public void b(@NonNull Bundle paramBundle)
      throws RemoteException
    {
      MetricaService.a().b(paramBundle);
    }
    
    public void reportData(Bundle paramBundle)
      throws RemoteException
    {
      MetricaService.a().reportData(paramBundle);
    }
  }
  
  public static class c
    extends Binder
  {}
  
  public static abstract interface d
  {
    public abstract void a(int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.MetricaService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */