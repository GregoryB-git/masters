package com.facebook.share.internal;

import com.facebook.share.model.ShareStoryContent;

class ShareContentValidation$StoryShareValidator
  extends ShareContentValidation.Validator
{
  private ShareContentValidation$StoryShareValidator()
  {
    super(null);
  }
  
  public void validate(ShareStoryContent paramShareStoryContent)
  {
    ShareContentValidation.access$400(paramShareStoryContent, this);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareContentValidation.StoryShareValidator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */