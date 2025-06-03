package com.facebook.drawee.controller;

class AbstractDraweeController$InternalForwardingListener<INFO>
  extends ForwardingControllerListener<INFO>
{
  public static <INFO> InternalForwardingListener<INFO> createInternal(ControllerListener<? super INFO> paramControllerListener1, ControllerListener<? super INFO> paramControllerListener2)
  {
    InternalForwardingListener localInternalForwardingListener = new InternalForwardingListener();
    localInternalForwardingListener.addListener(paramControllerListener1);
    localInternalForwardingListener.addListener(paramControllerListener2);
    return localInternalForwardingListener;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeController.InternalForwardingListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */