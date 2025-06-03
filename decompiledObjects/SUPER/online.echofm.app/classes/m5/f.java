package m5;

import E5.c;
import E5.k;
import android.content.Context;

public class f
  implements A5.a
{
  public k a;
  public g b;
  
  public void onAttachedToEngine(A5.a.b paramb)
  {
    Object localObject = paramb.a();
    c localc = paramb.b();
    b = new g((Context)localObject, localc);
    localObject = new k(localc, "com.ryanheise.just_audio.methods");
    a = ((k)localObject);
    ((k)localObject).e(b);
    paramb.c().e(new a());
  }
  
  public void onDetachedFromEngine(A5.a.b paramb)
  {
    b.a();
    b = null;
    a.e(null);
  }
  
  public class a
    implements io.flutter.embedding.engine.a.b
  {
    public a() {}
    
    public void a() {}
    
    public void b()
    {
      f.a(f.this).a();
    }
  }
}

/* Location:
 * Qualified Name:     m5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */