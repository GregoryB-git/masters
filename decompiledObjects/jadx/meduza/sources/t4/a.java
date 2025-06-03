package t4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.d;

/* loaded from: classes.dex */
public final class a extends e9.a {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14434d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f14435b = d.f11284c.newDecoder();

    /* renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f14436c = d.f11283b.newDecoder();

    @Override // e9.a
    public final p4.a i(p4.d dVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        String str2 = null;
        try {
            str = this.f14435b.decode(byteBuffer).toString();
            charsetDecoder = this.f14435b;
        } catch (CharacterCodingException unused) {
            this.f14435b.reset();
            byteBuffer.rewind();
            try {
                str = this.f14436c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f14436c.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f14436c;
        } catch (Throwable th2) {
            this.f14435b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new p4.a(new c(bArr, null, null));
        }
        Matcher matcher = f14434d.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String x02 = x6.b.x0(group);
                x02.getClass();
                if (x02.equals("streamurl")) {
                    str3 = group2;
                } else if (x02.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new p4.a(new c(bArr, str2, str3));
    }
}
