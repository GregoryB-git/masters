package e0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;
import f;
import g;
import java.util.Locale;

public final class c
{
  public final e a;
  
  public c(e parame)
  {
    a = parame;
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public static final class a
    implements c.b
  {
    public final ContentInfo.Builder a;
    
    public a(ClipData paramClipData, int paramInt)
    {
      a = new ContentInfo.Builder(paramClipData, paramInt);
    }
    
    public final void a(Uri paramUri)
    {
      a.setLinkUri(paramUri);
    }
    
    public final void b(int paramInt)
    {
      a.setFlags(paramInt);
    }
    
    public final c build()
    {
      return new c(new c.d(a.build()));
    }
    
    public final void setExtras(Bundle paramBundle)
    {
      a.setExtras(paramBundle);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Uri paramUri);
    
    public abstract void b(int paramInt);
    
    public abstract c build();
    
    public abstract void setExtras(Bundle paramBundle);
  }
  
  public static final class c
    implements c.b
  {
    public ClipData a;
    public int b;
    public int c;
    public Uri d;
    public Bundle e;
    
    public c(ClipData paramClipData, int paramInt)
    {
      a = paramClipData;
      b = paramInt;
    }
    
    public final void a(Uri paramUri)
    {
      d = paramUri;
    }
    
    public final void b(int paramInt)
    {
      c = paramInt;
    }
    
    public final c build()
    {
      return new c(new c.f(this));
    }
    
    public final void setExtras(Bundle paramBundle)
    {
      e = paramBundle;
    }
  }
  
  public static final class d
    implements c.e
  {
    public final ContentInfo a;
    
    public d(ContentInfo paramContentInfo)
    {
      paramContentInfo.getClass();
      a = paramContentInfo;
    }
    
    public final ClipData a()
    {
      return a.getClip();
    }
    
    public final ContentInfo b()
    {
      return a;
    }
    
    public final int c()
    {
      return a.getSource();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("ContentInfoCompat{");
      localStringBuilder.append(a);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public final int w()
    {
      return a.getFlags();
    }
  }
  
  public static abstract interface e
  {
    public abstract ClipData a();
    
    public abstract ContentInfo b();
    
    public abstract int c();
    
    public abstract int w();
  }
  
  public static final class f
    implements c.e
  {
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;
    
    public f(c.c paramc)
    {
      ClipData localClipData = a;
      localClipData.getClass();
      a = localClipData;
      int i = b;
      if (i >= 0)
      {
        if (i <= 5)
        {
          b = i;
          i = c;
          if ((i & 0x1) == i)
          {
            c = i;
            d = d;
            e = e;
            return;
          }
          paramc = f.l("Requested flags 0x");
          paramc.append(Integer.toHexString(i));
          paramc.append(", but only 0x");
          paramc.append(Integer.toHexString(1));
          paramc.append(" are allowed");
          throw new IllegalArgumentException(paramc.toString());
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { "source", Integer.valueOf(0), Integer.valueOf(5) }));
      }
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { "source", Integer.valueOf(0), Integer.valueOf(5) }));
    }
    
    public final ClipData a()
    {
      return a;
    }
    
    public final ContentInfo b()
    {
      return null;
    }
    
    public final int c()
    {
      return b;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("ContentInfoCompat{clip=");
      localStringBuilder.append(a.getDescription());
      localStringBuilder.append(", source=");
      int i = b;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i != 5) {
                  localObject = String.valueOf(i);
                } else {
                  localObject = "SOURCE_PROCESS_TEXT";
                }
              }
              else {
                localObject = "SOURCE_AUTOFILL";
              }
            }
            else {
              localObject = "SOURCE_DRAG_AND_DROP";
            }
          }
          else {
            localObject = "SOURCE_INPUT_METHOD";
          }
        }
        else {
          localObject = "SOURCE_CLIPBOARD";
        }
      }
      else {
        localObject = "SOURCE_APP";
      }
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(", flags=");
      i = c;
      if ((i & 0x1) != 0) {
        localObject = "FLAG_CONVERT_TO_PLAIN_TEXT";
      } else {
        localObject = String.valueOf(i);
      }
      localStringBuilder.append((String)localObject);
      Object localObject = d;
      String str = "";
      if (localObject == null)
      {
        localObject = "";
      }
      else
      {
        localObject = f.l(", hasLinkUri(");
        ((StringBuilder)localObject).append(d.toString().length());
        ((StringBuilder)localObject).append(")");
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append((String)localObject);
      if (e == null) {
        localObject = str;
      } else {
        localObject = ", hasExtras";
      }
      return g.f(localStringBuilder, (String)localObject, "}");
    }
    
    public final int w()
    {
      return c;
    }
  }
}

/* Location:
 * Qualified Name:     e0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */