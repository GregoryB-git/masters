package d0;

public abstract class f
  implements D
{
  public final I.c a = new I.c();
  
  public final boolean B()
  {
    boolean bool;
    if (b() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean G()
  {
    boolean bool;
    if (c() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean I()
  {
    I localI = L();
    boolean bool;
    if ((!localI.q()) && (nEa).i)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int M()
  {
    return L().p();
  }
  
  public final boolean Q()
  {
    I localI = L();
    boolean bool;
    if ((!localI.q()) && (localI.n(E(), a).f())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int R()
  {
    int i = q();
    int j = i;
    if (i == 1) {
      j = 0;
    }
    return j;
  }
  
  public final void S(int paramInt)
  {
    U(-1, -9223372036854775807L, paramInt, false);
  }
  
  public final void T(int paramInt)
  {
    U(E(), -9223372036854775807L, paramInt, true);
  }
  
  public abstract void U(int paramInt1, long paramLong, int paramInt2, boolean paramBoolean);
  
  public final void V(int paramInt1, int paramInt2)
  {
    U(paramInt1, -9223372036854775807L, paramInt2, false);
  }
  
  public final void W(int paramInt)
  {
    int i = b();
    if (i == -1)
    {
      S(paramInt);
      return;
    }
    if (i == E()) {
      T(paramInt);
    } else {
      V(i, paramInt);
    }
  }
  
  public final long a()
  {
    I localI = L();
    long l;
    if (localI.q()) {
      l = -9223372036854775807L;
    } else {
      l = localI.n(E(), a).d();
    }
    return l;
  }
  
  public final int b()
  {
    I localI = L();
    int i;
    if (localI.q()) {
      i = -1;
    } else {
      i = localI.e(E(), R(), N());
    }
    return i;
  }
  
  public final int c()
  {
    I localI = L();
    int i;
    if (localI.q()) {
      i = -1;
    } else {
      i = localI.l(E(), R(), N());
    }
    return i;
  }
  
  public final void s(int paramInt, long paramLong)
  {
    U(paramInt, paramLong, 10, false);
  }
  
  public final boolean w()
  {
    I localI = L();
    boolean bool;
    if ((!localI.q()) && (nEa).h)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void y()
  {
    W(8);
  }
}

/* Location:
 * Qualified Name:     d0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */