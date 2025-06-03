package b8;

import c8.f;
import com.google.firebase.auth.FirebaseAuth;
import m6.j;
import u7.h;

public final class i1
  extends f0
{
  public i1(FirebaseAuth paramFirebaseAuth, f0 paramf0) {}
  
  public final void onCodeAutoRetrievalTimeOut(String paramString) {}
  
  public final void onCodeSent(String paramString, e0 parame0)
  {
    parame0 = a;
    String str = b.g.b;
    j.i(str);
    parame0.onVerificationCompleted(c0.G(paramString, str));
  }
  
  public final void onVerificationCompleted(c0 paramc0)
  {
    a.onVerificationCompleted(paramc0);
  }
  
  public final void onVerificationFailed(h paramh)
  {
    a.onVerificationFailed(paramh);
  }
}

/* Location:
 * Qualified Name:     b8.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */