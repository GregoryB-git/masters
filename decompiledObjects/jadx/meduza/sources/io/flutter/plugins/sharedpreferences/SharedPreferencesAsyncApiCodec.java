package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SharedPreferencesAsyncApiCodec extends StandardMessageCodec {
    public static final SharedPreferencesAsyncApiCodec INSTANCE = new SharedPreferencesAsyncApiCodec();

    private SharedPreferencesAsyncApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        ec.i.e(byteBuffer, "buffer");
        if (b10 != Byte.MIN_VALUE) {
            return super.readValueOfType(b10, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        List<? extends Object> list = readValue instanceof List ? (List) readValue : null;
        if (list != null) {
            return SharedPreferencesPigeonOptions.Companion.fromList(list);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        ec.i.e(byteArrayOutputStream, "stream");
        if (!(obj instanceof SharedPreferencesPigeonOptions)) {
            super.writeValue(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(128);
            writeValue(byteArrayOutputStream, ((SharedPreferencesPigeonOptions) obj).toList());
        }
    }
}
