package io.flutter.embedding.android;

import android.view.KeyCharacterMap;

public class KeyboardManager$CharacterCombiner
{
  private int combiningCharacter = 0;
  
  public Character applyCombiningCharacterToBaseCharacter(int paramInt)
  {
    int i = (char)paramInt;
    int j;
    if ((0x80000000 & paramInt) != 0) {
      j = 1;
    } else {
      j = 0;
    }
    int m;
    if (j != 0)
    {
      j = paramInt & 0x7FFFFFFF;
      int k = combiningCharacter;
      paramInt = j;
      if (k != 0) {
        paramInt = KeyCharacterMap.getDeadChar(k, j);
      }
      combiningCharacter = paramInt;
      m = i;
    }
    else
    {
      j = combiningCharacter;
      m = i;
      if (j != 0)
      {
        j = KeyCharacterMap.getDeadChar(j, paramInt);
        paramInt = i;
        if (j > 0) {
          paramInt = (char)j;
        }
        combiningCharacter = 0;
        m = paramInt;
      }
    }
    return Character.valueOf(m);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyboardManager.CharacterCombiner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */