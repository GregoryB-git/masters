package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import m6.j;
import x0.i;

public final class SupportFragmentWrapper
  extends IFragmentWrapper.Stub
{
  public final i a;
  
  public SupportFragmentWrapper(i parami)
  {
    a = parami;
  }
  
  public static SupportFragmentWrapper wrap(i parami)
  {
    if (parami != null) {
      return new SupportFragmentWrapper(parami);
    }
    return null;
  }
  
  public final void B(boolean paramBoolean)
  {
    a.setHasOptionsMenu(paramBoolean);
  }
  
  public final void G0(Intent paramIntent)
  {
    a.startActivity(paramIntent);
  }
  
  public final void I2(boolean paramBoolean)
  {
    a.setUserVisibleHint(paramBoolean);
  }
  
  public final void P1(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    a.registerForContextMenu(paramIObjectWrapper);
  }
  
  public final void U(boolean paramBoolean)
  {
    a.setMenuVisibility(paramBoolean);
  }
  
  public final boolean Y2()
  {
    return a.isVisible();
  }
  
  public final void Z1(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    j.i(paramIObjectWrapper);
    a.unregisterForContextMenu(paramIObjectWrapper);
  }
  
  public final void q2(int paramInt, Intent paramIntent)
  {
    a.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void w0(boolean paramBoolean)
  {
    a.setRetainInstance(paramBoolean);
  }
  
  public final int zzb()
  {
    return a.getId();
  }
  
  public final int zzc()
  {
    return a.getTargetRequestCode();
  }
  
  public final Bundle zzd()
  {
    return a.getArguments();
  }
  
  public final IFragmentWrapper zze()
  {
    return wrap(a.getParentFragment());
  }
  
  public final IFragmentWrapper zzf()
  {
    return wrap(a.getTargetFragment());
  }
  
  public final IObjectWrapper zzg()
  {
    return ObjectWrapper.wrap(a.getActivity());
  }
  
  public final IObjectWrapper zzh()
  {
    return ObjectWrapper.wrap(a.getResources());
  }
  
  public final IObjectWrapper zzi()
  {
    return ObjectWrapper.wrap(a.getView());
  }
  
  public final String zzj()
  {
    return a.getTag();
  }
  
  public final boolean zzs()
  {
    return a.getRetainInstance();
  }
  
  public final boolean zzt()
  {
    return a.getUserVisibleHint();
  }
  
  public final boolean zzu()
  {
    return a.isAdded();
  }
  
  public final boolean zzv()
  {
    return a.isDetached();
  }
  
  public final boolean zzw()
  {
    return a.isHidden();
  }
  
  public final boolean zzx()
  {
    return a.isInLayout();
  }
  
  public final boolean zzy()
  {
    return a.isRemoving();
  }
  
  public final boolean zzz()
  {
    return a.isResumed();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.SupportFragmentWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */