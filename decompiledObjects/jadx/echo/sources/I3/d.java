package I3;

import H3.AbstractC0387i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f2519b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final M3.g f2520a;

    public class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2521a;

        public a(String str) {
            this.f2521a = str;
            put("userId", str);
        }
    }

    public d(M3.g gVar) {
        this.f2520a = gVar;
    }

    public static Map d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, k(jSONObject, next));
        }
        return hashMap;
    }

    public static String f(Map map) {
        return new JSONObject(map).toString();
    }

    public static void i(File file) {
        if (file.exists() && file.delete()) {
            E3.f.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String j(String str) {
        return new a(str).toString();
    }

    public static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f2520a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f2520a.o(str, "keys");
    }

    public File c(String str) {
        return this.f2520a.o(str, "user-data");
    }

    public final String e(String str) {
        return k(new JSONObject(str), "userId");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    public Map g(String str, boolean z7) {
        FileInputStream fileInputStream;
        Exception e7;
        File a7 = z7 ? a(str) : b(str);
        if (a7.exists()) {
            ?? length = a7.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(a7);
                    } catch (Exception e8) {
                        fileInputStream = null;
                        e7 = e8;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0387i.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        Map d7 = d(AbstractC0387i.B(fileInputStream));
                        AbstractC0387i.f(fileInputStream, "Failed to close user metadata file.");
                        return d7;
                    } catch (Exception e9) {
                        e7 = e9;
                        E3.f.f().l("Error deserializing user metadata.", e7);
                        i(a7);
                        AbstractC0387i.f(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = length;
                    AbstractC0387i.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        i(a7);
        return Collections.emptyMap();
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c7 = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c7.exists() || c7.length() == 0) {
            E3.f.f().b("No userId set for session " + str);
            i(c7);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c7);
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            AbstractC0387i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String e8 = e(AbstractC0387i.B(fileInputStream));
                E3.f.f().b("Loaded userId " + e8 + " for session " + str);
                AbstractC0387i.f(fileInputStream, "Failed to close user metadata file.");
                return e8;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC0387i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            E3.f.f().l("Error deserializing user metadata.", e);
            i(c7);
            AbstractC0387i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void l(String str, Map map) {
        m(str, map, false);
    }

    public void m(String str, Map map, boolean z7) {
        File a7 = z7 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String f7 = f(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a7), f2519b));
                try {
                    bufferedWriter2.write(f7);
                    bufferedWriter2.flush();
                    AbstractC0387i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e7) {
                    e = e7;
                    bufferedWriter = bufferedWriter2;
                    E3.f.f().l("Error serializing key/value metadata.", e);
                    i(a7);
                    AbstractC0387i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC0387i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void n(String str, String str2) {
        File c7 = c(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String j7 = j(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c7), f2519b));
                try {
                    bufferedWriter2.write(j7);
                    bufferedWriter2.flush();
                    AbstractC0387i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e7) {
                    e = e7;
                    bufferedWriter = bufferedWriter2;
                    E3.f.f().l("Error serializing user metadata.", e);
                    AbstractC0387i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    AbstractC0387i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }
}
