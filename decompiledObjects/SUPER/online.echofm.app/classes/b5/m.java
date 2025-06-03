package b5;

public final class m
  extends c
{
  public int c(char paramChar, StringBuilder paramStringBuilder)
  {
    char c;
    if (paramChar == ' ')
    {
      paramChar = '\003';
      c = paramChar;
      paramStringBuilder.append(c);
      return 1;
    }
    if ((paramChar >= '0') && (paramChar <= '9')) {
      paramChar -= 44;
    }
    for (;;)
    {
      paramChar = (char)paramChar;
      c = paramChar;
      break;
      if ((paramChar < 'a') || (paramChar > 'z')) {
        break label59;
      }
      paramChar -= 83;
    }
    label59:
    if (paramChar < ' ')
    {
      paramStringBuilder.append('\000');
      c = paramChar;
      paramStringBuilder.append(c);
      return 2;
    }
    if ((paramChar >= '!') && (paramChar <= '/'))
    {
      paramStringBuilder.append('\001');
      paramChar -= 33;
    }
    for (;;)
    {
      paramChar = (char)paramChar;
      c = paramChar;
      break;
      if ((paramChar >= ':') && (paramChar <= '@'))
      {
        paramStringBuilder.append('\001');
        paramChar -= 43;
      }
      else
      {
        if ((paramChar < '[') || (paramChar > '_')) {
          break label158;
        }
        paramStringBuilder.append('\001');
        paramChar -= 69;
      }
    }
    label158:
    if (paramChar == '`') {}
    do
    {
      paramStringBuilder.append('\002');
      paramChar -= 96;
      break;
      if ((paramChar >= 'A') && (paramChar <= 'Z'))
      {
        paramStringBuilder.append('\002');
        paramChar -= 64;
        break;
      }
    } while ((paramChar >= '{') && (paramChar <= ''));
    paramStringBuilder.append("\001\036");
    return c((char)(paramChar - ''), paramStringBuilder) + 2;
  }
  
  public int e()
  {
    return 2;
  }
}

/* Location:
 * Qualified Name:     b5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */