package l8;

import android.util.Log;
import io.flutter.plugins.firebase.analytics.Constants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f9767b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final p8.e f9768a;

    public h(p8.e eVar) {
        this.f9768a = eVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(k.a(string));
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String e(List<k> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(k.f9787a.a(list.get(i10))));
            } catch (JSONException e10) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e10);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            StringBuilder l10 = defpackage.f.l("Deleted corrupt file: ");
            l10.append(file.getAbsolutePath());
            Log.i("FirebaseCrashlytics", l10.toString(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str), null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final Map<String, String> c(String str, boolean z10) {
        ?? r12;
        FileInputStream fileInputStream;
        Exception e10;
        File b10 = z10 ? this.f9768a.b(str, "internal-keys") : this.f9768a.b(str, "keys");
        if (b10.exists() && b10.length() != 0) {
            Closeable closeable = null;
            try {
                try {
                    fileInputStream = new FileInputStream(b10);
                } catch (Exception e11) {
                    fileInputStream = null;
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    j8.g.b(closeable, "Failed to close user metadata file.");
                    throw th;
                }
                try {
                    HashMap a10 = a(j8.g.j(fileInputStream));
                    j8.g.b(fileInputStream, "Failed to close user metadata file.");
                    return a10;
                } catch (Exception e12) {
                    e10 = e12;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                    f(b10);
                    j8.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r12;
                j8.g.b(closeable, "Failed to close user metadata file.");
                throw th;
            }
        }
        g(b10, "The file has a length of zero for session: " + str);
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File b10 = this.f9768a.b(str, "user-data");
        Closeable closeable = null;
        if (b10.exists()) {
            ?? r22 = (b10.length() > 0L ? 1 : (b10.length() == 0L ? 0 : -1));
            try {
                if (r22 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b10);
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        j8.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(j8.g.j(fileInputStream));
                        String optString = !jSONObject.isNull(Constants.USER_ID) ? jSONObject.optString(Constants.USER_ID, null) : null;
                        String str2 = "Loaded userId " + optString + " for session " + str;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str2, null);
                        }
                        j8.g.b(fileInputStream, "Failed to close user metadata file.");
                        return optString;
                    } catch (Exception e11) {
                        e = e11;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(b10);
                        j8.g.b(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r22;
            }
        }
        String d10 = defpackage.g.d("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d10, null);
        }
        f(b10);
        return null;
    }

    public final void h(String str, Map<String, String> map, boolean z10) {
        BufferedWriter bufferedWriter;
        File b10 = z10 ? this.f9768a.b(str, "internal-keys") : this.f9768a.b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f9767b));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                    j8.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter2 = bufferedWriter;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(b10);
                    j8.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    j8.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void i(String str, String str2) {
        BufferedWriter bufferedWriter;
        File b10 = this.f9768a.b(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String obj = new g(str2).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b10), f9767b));
                try {
                    bufferedWriter.write(obj);
                    bufferedWriter.flush();
                    j8.g.b(bufferedWriter, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter2 = bufferedWriter;
                    Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    j8.g.b(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    j8.g.b(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = bufferedWriter2;
        }
    }
}
