// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase;

import O4.e;
import s3.k;
import s3.j;
import s3.i;
import android.os.Build;
import O4.h;
import o4.f;
import B3.c;
import java.util.ArrayList;
import java.util.List;
import s3.g;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;

public class FirebaseCommonRegistrar implements ComponentRegistrar
{
    public static String i(final String s) {
        return s.replace(' ', '_').replace('/', '_');
    }
    
    @Override
    public List getComponents() {
        final ArrayList<c> list = new ArrayList<c>();
        list.add(O4.c.c());
        list.add(f.g());
        list.add(h.b("fire-android", String.valueOf(Build$VERSION.SDK_INT)));
        list.add(h.b("fire-core", "20.4.2"));
        list.add(h.b("device-name", i(Build.PRODUCT)));
        list.add(h.b("device-model", i(Build.DEVICE)));
        list.add(h.b("device-brand", i(Build.BRAND)));
        list.add(h.c("android-target-sdk", (h.a)new s3.h()));
        list.add(h.c("android-min-sdk", (h.a)new i()));
        list.add(h.c("android-platform", (h.a)new j()));
        list.add(h.c("android-installer", (h.a)new k()));
        final String a = e.a();
        if (a != null) {
            list.add(h.b("kotlin", a));
        }
        return list;
    }
}
