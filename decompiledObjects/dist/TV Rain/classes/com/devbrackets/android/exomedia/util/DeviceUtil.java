package com.devbrackets.android.exomedia.util;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DeviceUtil
{
  public static final List<NonCompatibleDevice> NON_COMPATIBLE_DEVICES;
  
  static
  {
    LinkedList localLinkedList = new LinkedList();
    NON_COMPATIBLE_DEVICES = localLinkedList;
    localLinkedList.add(new NonCompatibleDevice("Amazon"));
  }
  
  public boolean isDeviceTV(Context paramContext)
  {
    paramContext = (UiModeManager)paramContext.getSystemService("uimode");
    boolean bool;
    if ((paramContext != null) && (paramContext.getCurrentModeType() == 4)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isNotCompatible(@NonNull List<NonCompatibleDevice> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (NonCompatibleDevice)localIterator.next();
      if (Build.MANUFACTURER.equalsIgnoreCase(paramList.getManufacturer()))
      {
        if (paramList.ignoreModel()) {
          return true;
        }
        if (Build.DEVICE.equalsIgnoreCase(paramList.getModel())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean supportsExoPlayer(@NonNull Context paramContext)
  {
    boolean bool1 = isNotCompatible(NON_COMPATIBLE_DEVICES);
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    if (Build.MANUFACTURER.equalsIgnoreCase("Amazon")) {
      isDeviceTV(paramContext);
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public static class NonCompatibleDevice
  {
    private boolean ignoreModel;
    private final String manufacturer;
    private final String model;
    
    public NonCompatibleDevice(@NonNull String paramString)
    {
      manufacturer = paramString;
      model = null;
      ignoreModel = true;
    }
    
    public NonCompatibleDevice(@NonNull String paramString1, @NonNull String paramString2)
    {
      model = paramString1;
      manufacturer = paramString2;
    }
    
    public String getManufacturer()
    {
      return manufacturer;
    }
    
    public String getModel()
    {
      return model;
    }
    
    public boolean ignoreModel()
    {
      return ignoreModel;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.DeviceUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */