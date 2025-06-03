package e4;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class a$c$b
  extends ThreadLocal
{
  public CharsetEncoder a()
  {
    CharsetEncoder localCharsetEncoder = Charset.forName("UTF8").newEncoder();
    CodingErrorAction localCodingErrorAction = CodingErrorAction.REPORT;
    localCharsetEncoder.onMalformedInput(localCodingErrorAction);
    localCharsetEncoder.onUnmappableCharacter(localCodingErrorAction);
    return localCharsetEncoder;
  }
}

/* Location:
 * Qualified Name:     e4.a.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */