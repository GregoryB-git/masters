package H1;

import W5.C0680j;
import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2203a = new j();

    public static final File a() {
        if (T1.a.d(j.class)) {
            return null;
        }
        try {
            File file = new File(C2146B.l().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            T1.a.b(th, j.class);
            return null;
        }
    }

    public static final Map c(File file) {
        Map map;
        Map map2 = null;
        if (T1.a.d(j.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int available = fileInputStream.available();
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    byte[] bArr = new byte[available];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    if (available < 4) {
                        return null;
                    }
                    int i7 = 0;
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    int i8 = wrap.getInt();
                    int i9 = i8 + 4;
                    if (available < i9) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i8, kotlin.text.b.f16240b));
                    JSONArray names = jSONObject.names();
                    int length = names.length();
                    String[] strArr = new String[length];
                    int i10 = length - 1;
                    if (i10 >= 0) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            strArr[i11] = names.getString(i11);
                            if (i12 > i10) {
                                break;
                            }
                            i11 = i12;
                        }
                    }
                    C0680j.f(strArr);
                    HashMap hashMap = new HashMap();
                    int i13 = 0;
                    while (i13 < length) {
                        String str = strArr[i13];
                        i13++;
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i14 = length2 - 1;
                            int i15 = 1;
                            if (i14 >= 0) {
                                while (true) {
                                    int i16 = i7 + 1;
                                    try {
                                        int i17 = jSONArray.getInt(i7);
                                        iArr[i7] = i17;
                                        i15 *= i17;
                                        if (i16 > i14) {
                                            break;
                                        }
                                        i7 = i16;
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }
                            }
                            int i18 = i15 * 4;
                            int i19 = i9 + i18;
                            if (i19 > available) {
                                return null;
                            }
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i9, i18);
                            wrap2.order(ByteOrder.LITTLE_ENDIAN);
                            a aVar = new a(iArr);
                            wrap2.asFloatBuffer().get(aVar.a(), 0, i15);
                            hashMap.put(str, aVar);
                            i9 = i19;
                            i7 = 0;
                            map2 = null;
                        }
                    }
                    return hashMap;
                } catch (Throwable th) {
                    th = th;
                    map = null;
                    T1.a.b(th, j.class);
                    return map;
                }
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
    }

    public final String b(String str) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i7 = 0;
            boolean z7 = false;
            while (i7 <= length) {
                boolean z8 = Intrinsics.d(str.charAt(!z7 ? i7 : length), 32) <= 0;
                if (z7) {
                    if (!z8) {
                        break;
                    }
                    length--;
                } else if (z8) {
                    i7++;
                } else {
                    z7 = true;
                }
            }
            Object[] array = new Regex("\\s+").c(str.subSequence(i7, length + 1).toString(), 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String join = TextUtils.join(" ", (String[]) array);
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
            return join;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final int[] d(String texts, int i7) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[i7];
            String b7 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (b7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = b7.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            if (i7 > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    if (i8 < bytes.length) {
                        iArr[i8] = bytes[i8] & 255;
                    } else {
                        iArr[i8] = 0;
                    }
                    if (i9 >= i7) {
                        break;
                    }
                    i8 = i9;
                }
            }
            return iArr;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }
}
