package S0;

import W2.e;
import d0.C1201x;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends O0.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5818c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f5819a = e.f6821c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f5820b = e.f6820b.newDecoder();

    @Override // O0.c
    public C1201x b(O0.b bVar, ByteBuffer byteBuffer) {
        String c7 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c7 == null) {
            return new C1201x(new c(bArr, null, null));
        }
        Matcher matcher = f5818c.matcher(c7);
        String str2 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e7 = W2.c.e(group);
                e7.hashCode();
                if (e7.equals("streamurl")) {
                    str2 = group2;
                } else if (e7.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C1201x(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        String charBuffer;
        CharsetDecoder charsetDecoder;
        try {
            charBuffer = this.f5819a.decode(byteBuffer).toString();
            charsetDecoder = this.f5819a;
        } catch (CharacterCodingException unused) {
            this.f5819a.reset();
            byteBuffer.rewind();
            try {
                charBuffer = this.f5820b.decode(byteBuffer).toString();
                charsetDecoder = this.f5820b;
            } catch (CharacterCodingException unused2) {
                this.f5820b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f5820b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f5819a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return charBuffer;
    }
}
