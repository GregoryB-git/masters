package com.facebook.share.internal;

import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.GameRequestContent.ActionType;

public class GameRequestValidation
{
  public static void validate(GameRequestContent paramGameRequestContent)
  {
    Validate.notNull(paramGameRequestContent.getMessage(), "message");
    String str = paramGameRequestContent.getObjectId();
    int i = 0;
    int j;
    if (str != null) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((paramGameRequestContent.getActionType() != GameRequestContent.ActionType.ASKFOR) && (paramGameRequestContent.getActionType() != GameRequestContent.ActionType.SEND)) {
      k = 0;
    } else {
      k = 1;
    }
    if ((j ^ k) == 0)
    {
      k = i;
      if (paramGameRequestContent.getRecipients() != null) {
        k = 1;
      }
      j = k;
      if (paramGameRequestContent.getSuggestions() != null) {
        j = k + 1;
      }
      k = j;
      if (paramGameRequestContent.getFilters() != null) {
        k = j + 1;
      }
      if (k <= 1) {
        return;
      }
      throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
    }
    throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.GameRequestValidation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */