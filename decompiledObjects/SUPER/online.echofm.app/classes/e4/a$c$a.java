package e4;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class a$c$a
  extends ThreadLocal
{
  public CharsetDecoder a()
  {
    CharsetDecoder localCharsetDecoder = Charset.forName("UTF8").newDecoder();
    CodingErrorAction localCodingErrorAction = CodingErrorAction.REPORT;
    localCharsetDecoder.onMalformedInput(localCodingErrorAction);
    localCharsetDecoder.onUnmappableCharacter(localCodingErrorAction);
    return localCharsetDecoder;
  }
}

/* Location:
 * Qualified Name:     e4.a.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */