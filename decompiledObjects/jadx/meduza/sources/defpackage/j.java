package defpackage;

import ec.i;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import va.a;

/* loaded from: classes.dex */
public final class j extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        i.e(byteBuffer, "buffer");
        if (b10 == -127) {
            Object readValue = readValue(byteBuffer);
            List list = readValue instanceof List ? (List) readValue : null;
            if (list != null) {
                return new b((Boolean) list.get(0));
            }
            return null;
        }
        if (b10 != -126) {
            return super.readValueOfType(b10, byteBuffer);
        }
        Object readValue2 = readValue(byteBuffer);
        List list2 = readValue2 instanceof List ? (List) readValue2 : null;
        if (list2 != null) {
            return new a((Boolean) list2.get(0));
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        List f;
        i.e(byteArrayOutputStream, "stream");
        if (obj instanceof b) {
            byteArrayOutputStream.write(129);
            f = a.f(((b) obj).f1557a);
        } else if (!(obj instanceof a)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        } else {
            byteArrayOutputStream.write(130);
            f = a.f(((a) obj).f0a);
        }
        writeValue(byteArrayOutputStream, f);
    }
}
