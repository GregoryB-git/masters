package com.yandex.metrica;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.p1;

class MetricaService$b
  extends IMetricaService.a
{
  public MetricaService$b(MetricaService paramMetricaService) {}
  
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

/* Location:
 * Qualified Name:     com.yandex.metrica.MetricaService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */