package com.google.android.recaptcha.internal;

import a0.j;
import defpackage.g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzok {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzoi zzoiVar, String str) {
        StringBuilder g10 = g.g("# ", str);
        zzd(zzoiVar, g10, 0);
        return g10.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzpg.zza(new zzlc(((String) obj).getBytes(zznl.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzle) {
            sb2.append(": \"");
            sb2.append(zzpg.zza((zzle) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zznd) {
            sb2.append(" {");
            zzd((zznd) obj, sb2, i10 + 2);
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i12, Constants.KEY, entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        zzc(i10, sb2);
        sb2.append("}");
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzoi zzoiVar, StringBuilder sb2, int i10) {
        int i11;
        Object obj;
        Method method;
        String substring;
        Object zzE;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzoiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i11);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                zzE = zznd.zzE(method2, zzoiVar, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object zzE2 = zznd.zzE(method4, zzoiVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) zznd.zzE(method5, zzoiVar, new Object[0])).booleanValue()) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        } else if (zzE2 instanceof Boolean) {
                            if (!((Boolean) zzE2).booleanValue()) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        } else if (zzE2 instanceof Integer) {
                            if (((Integer) zzE2).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        } else if (zzE2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE2).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        } else if (zzE2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzE2).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        } else {
                            if (zzE2 instanceof String) {
                                obj = "";
                            } else if (zzE2 instanceof zzle) {
                                obj = zzle.zzb;
                            } else if (zzE2 instanceof zzoi) {
                                if (zzE2 == ((zzoi) zzE2).zzm()) {
                                }
                                zzb(sb2, i10, substring2, zzE2);
                            } else {
                                if ((zzE2 instanceof Enum) && ((Enum) zzE2).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring2, zzE2);
                            }
                            if (zzE2.equals(obj)) {
                            }
                            zzb(sb2, i10, substring2, zzE2);
                        }
                    }
                }
                i11 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                zzE = zznd.zzE(method, zzoiVar, new Object[0]);
            }
            zzb(sb2, i10, substring, zzE);
            i11 = 3;
        }
        if (zzoiVar instanceof zzna) {
            Iterator zzf = ((zzna) zzoiVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb2, i10, j.h("[", ((zznb) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzpm zzpmVar = ((zznd) zzoiVar).zzc;
        if (zzpmVar != null) {
            zzpmVar.zzi(sb2, i10);
        }
    }
}
