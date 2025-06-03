package com.google.firebase;

import O4.c;
import O4.e;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o4.f;
import s3.i;
import s3.j;
import s3.k;

public class FirebaseCommonRegistrar
  implements ComponentRegistrar
{
  public static String i(String paramString)
  {
    return paramString.replace(' ', '_').replace('/', '_');
  }
  
  public List getComponents()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(c.c());
    localArrayList.add(f.g());
    localArrayList.add(O4.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
    localArrayList.add(O4.h.b("fire-core", "20.4.2"));
    localArrayList.add(O4.h.b("device-name", i(Build.PRODUCT)));
    localArrayList.add(O4.h.b("device-model", i(Build.DEVICE)));
    localArrayList.add(O4.h.b("device-brand", i(Build.BRAND)));
    localArrayList.add(O4.h.c("android-target-sdk", new s3.h()));
    localArrayList.add(O4.h.c("android-min-sdk", new i()));
    localArrayList.add(O4.h.c("android-platform", new j()));
    localArrayList.add(O4.h.c("android-installer", new k()));
    String str = e.a();
    if (str != null) {
      localArrayList.add(O4.h.b("kotlin", str));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.FirebaseCommonRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */