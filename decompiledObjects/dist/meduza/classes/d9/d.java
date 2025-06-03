package d9;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.i;
import f;
import g9.f0;
import j9.e;
import j9.o;

public final class d
  extends i
{
  public d(o paramo, FirebaseFirestore paramFirebaseFirestore)
  {
    super(new f0(paramo, null), paramFirebaseFirestore);
    if (paramo.q() % 2 == 1) {
      return;
    }
    paramFirebaseFirestore = f.l("Invalid collection reference. Collection references must have an odd number of segments, but ");
    paramFirebaseFirestore.append(paramo.h());
    paramFirebaseFirestore.append(" has ");
    paramFirebaseFirestore.append(paramo.q());
    throw new IllegalArgumentException(paramFirebaseFirestore.toString());
  }
}

/* Location:
 * Qualified Name:     d9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */