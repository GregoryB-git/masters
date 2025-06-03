package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class zzady {
    private zzady() {
    }

    public static Object zza(String str, Type type) {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzaea) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e10) {
                    throw new zzabr(f.j("Json conversion failed! ", e10.getMessage()), e10);
                }
            } catch (Exception e11) {
                throw new zzabr(f.j("Instantiation of JsonResponse failed! ", String.valueOf(type)), e11);
            }
        }
        try {
            zzafu zzafuVar = (zzafu) new zzafu().zza(str);
            if (zzafuVar.zzb()) {
                return zzafuVar.zza();
            }
            throw new zzabr("No error message: " + str);
        } catch (Exception e12) {
            throw new zzabr(f.j("Json conversion failed! ", e12.getMessage()), e12);
        }
    }
}
