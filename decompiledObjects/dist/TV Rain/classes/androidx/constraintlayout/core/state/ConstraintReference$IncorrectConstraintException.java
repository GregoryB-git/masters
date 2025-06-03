package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import z2;

class ConstraintReference$IncorrectConstraintException
  extends Exception
{
  private final ArrayList<String> mErrors;
  
  public ConstraintReference$IncorrectConstraintException(ArrayList<String> paramArrayList)
  {
    mErrors = paramArrayList;
  }
  
  public ArrayList<String> getErrors()
  {
    return mErrors;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("IncorrectConstraintException: ");
    localStringBuilder.append(mErrors.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */