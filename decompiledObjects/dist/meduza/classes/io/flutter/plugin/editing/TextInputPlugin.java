package io.flutter.plugin.editing;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import f;
import i0.a;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.InputType;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextCapitalization;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler;
import io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.ArrayList;
import java.util.HashMap;

public class TextInputPlugin
  implements ListenableEditingState.EditingStateWatcher
{
  private static final String TAG = "TextInputPlugin";
  private final AutofillManager afm;
  private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
  private TextInputChannel.Configuration configuration;
  private ImeSyncDeferringInsetsCallback imeSyncCallback;
  private InputTarget inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
  private boolean isInputConnectionLocked;
  private Rect lastClientRect;
  private InputConnection lastInputConnection;
  private ListenableEditingState mEditable;
  private final InputMethodManager mImm;
  private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
  private boolean mRestartInputPending;
  private final View mView;
  private PlatformViewsController platformViewsController;
  private final ScribeChannel scribeChannel;
  private final TextInputChannel textInputChannel;
  
  public TextInputPlugin(View paramView, TextInputChannel paramTextInputChannel, ScribeChannel paramScribeChannel, PlatformViewsController paramPlatformViewsController)
  {
    mView = paramView;
    AutofillManager localAutofillManager = null;
    mEditable = new ListenableEditingState(null, paramView);
    mImm = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      localAutofillManager = (AutofillManager)paramView.getContext().getSystemService(AutofillManager.class);
    }
    afm = localAutofillManager;
    if (i >= 30)
    {
      paramView = new ImeSyncDeferringInsetsCallback(paramView);
      imeSyncCallback = paramView;
      paramView.install();
    }
    textInputChannel = paramTextInputChannel;
    paramTextInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler()
    {
      public void clearClient()
      {
        clearTextInputClient();
      }
      
      public void finishAutofillContext(boolean paramAnonymousBoolean)
      {
        if ((Build.VERSION.SDK_INT >= 26) && (TextInputPlugin.access$500(TextInputPlugin.this) != null)) {
          if (paramAnonymousBoolean) {
            TextInputPlugin.access$500(TextInputPlugin.this).commit();
          } else {
            TextInputPlugin.access$500(TextInputPlugin.this).cancel();
          }
        }
      }
      
      public void hide()
      {
        if (access$100type == TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW)
        {
          TextInputPlugin.access$200(TextInputPlugin.this);
        }
        else
        {
          TextInputPlugin localTextInputPlugin = TextInputPlugin.this;
          TextInputPlugin.access$300(localTextInputPlugin, TextInputPlugin.access$000(localTextInputPlugin));
        }
      }
      
      public void requestAutofill()
      {
        TextInputPlugin.access$400(TextInputPlugin.this);
      }
      
      public void sendAppPrivateCommand(String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        sendTextInputAppPrivateCommand(paramAnonymousString, paramAnonymousBundle);
      }
      
      public void setClient(int paramAnonymousInt, TextInputChannel.Configuration paramAnonymousConfiguration)
      {
        setTextInputClient(paramAnonymousInt, paramAnonymousConfiguration);
      }
      
      public void setEditableSizeAndTransform(double paramAnonymousDouble1, double paramAnonymousDouble2, double[] paramAnonymousArrayOfDouble)
      {
        TextInputPlugin.access$700(TextInputPlugin.this, paramAnonymousDouble1, paramAnonymousDouble2, paramAnonymousArrayOfDouble);
      }
      
      public void setEditingState(TextInputChannel.TextEditState paramAnonymousTextEditState)
      {
        TextInputPlugin localTextInputPlugin = TextInputPlugin.this;
        localTextInputPlugin.setTextInputEditingState(TextInputPlugin.access$000(localTextInputPlugin), paramAnonymousTextEditState);
      }
      
      public void setPlatformViewClient(int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        TextInputPlugin.access$600(TextInputPlugin.this, paramAnonymousInt, paramAnonymousBoolean);
      }
      
      public void show()
      {
        TextInputPlugin localTextInputPlugin = TextInputPlugin.this;
        localTextInputPlugin.showTextInput(TextInputPlugin.access$000(localTextInputPlugin));
      }
    });
    paramTextInputChannel.requestExistingInputState();
    scribeChannel = paramScribeChannel;
    platformViewsController = paramPlatformViewsController;
    paramPlatformViewsController.attachTextInputPlugin(this);
  }
  
  private static boolean composingChanged(TextInputChannel.TextEditState paramTextEditState1, TextInputChannel.TextEditState paramTextEditState2)
  {
    int i = composingEnd - composingStart;
    if (i != composingEnd - composingStart) {
      return true;
    }
    for (int j = 0; j < i; j++) {
      if (text.charAt(composingStart + j) != text.charAt(composingStart + j)) {
        return true;
      }
    }
    return false;
  }
  
  private void hideTextInput(View paramView)
  {
    notifyViewExited();
    mImm.hideSoftInputFromWindow(paramView.getApplicationWindowToken(), 0);
  }
  
  private static int inputTypeFromTextInputType(TextInputChannel.InputType paramInputType, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, TextInputChannel.TextCapitalization paramTextCapitalization)
  {
    TextInputChannel.TextInputType localTextInputType = type;
    if (localTextInputType == TextInputChannel.TextInputType.DATETIME) {
      return 4;
    }
    int j;
    if (localTextInputType == TextInputChannel.TextInputType.NUMBER)
    {
      i = 2;
      if (isSigned) {
        i = 4098;
      }
      j = i;
      if (isDecimal) {
        j = i | 0x2000;
      }
      return j;
    }
    if (localTextInputType == TextInputChannel.TextInputType.PHONE) {
      return 3;
    }
    if (localTextInputType == TextInputChannel.TextInputType.NONE) {
      return 0;
    }
    int i = 1;
    if (localTextInputType == TextInputChannel.TextInputType.MULTILINE) {
      i = 131073;
    } else if ((localTextInputType != TextInputChannel.TextInputType.EMAIL_ADDRESS) && (localTextInputType != TextInputChannel.TextInputType.TWITTER))
    {
      if ((localTextInputType != TextInputChannel.TextInputType.URL) && (localTextInputType != TextInputChannel.TextInputType.WEB_SEARCH))
      {
        if (localTextInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
          i = 145;
        } else if (localTextInputType == TextInputChannel.TextInputType.NAME) {
          i = 97;
        } else if (localTextInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS) {
          i = 113;
        }
      }
      else {
        i = 17;
      }
    }
    else {
      i = 33;
    }
    if (paramBoolean1)
    {
      i = i | 0x80000 | 0x80;
    }
    else
    {
      j = i;
      if (paramBoolean2) {
        j = i | 0x8000;
      }
      i = j;
      if (!paramBoolean3) {
        i = j | 0x80000 | 0x90;
      }
    }
    if (paramTextCapitalization == TextInputChannel.TextCapitalization.CHARACTERS)
    {
      j = i | 0x1000;
    }
    else if (paramTextCapitalization == TextInputChannel.TextCapitalization.WORDS)
    {
      j = i | 0x2000;
    }
    else
    {
      j = i;
      if (paramTextCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
        j = i | 0x4000;
      }
    }
    return j;
  }
  
  private boolean needsAutofill()
  {
    boolean bool;
    if (autofillConfiguration != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void notifyValueChanged(String paramString)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (afm != null) && (needsAutofill()))
    {
      String str = configuration.autofill.uniqueIdentifier;
      afm.notifyValueChanged(mView, str.hashCode(), AutofillValue.forText(paramString));
    }
  }
  
  private void notifyViewEntered()
  {
    if ((Build.VERSION.SDK_INT >= 26) && (afm != null) && (needsAutofill()))
    {
      String str = configuration.autofill.uniqueIdentifier;
      int[] arrayOfInt = new int[2];
      mView.getLocationOnScreen(arrayOfInt);
      Rect localRect = new Rect(lastClientRect);
      localRect.offset(arrayOfInt[0], arrayOfInt[1]);
      afm.notifyViewEntered(mView, str.hashCode(), localRect);
    }
  }
  
  private void notifyViewExited()
  {
    if ((Build.VERSION.SDK_INT >= 26) && (afm != null))
    {
      Object localObject = configuration;
      if ((localObject != null) && (autofill != null) && (needsAutofill()))
      {
        localObject = configuration.autofill.uniqueIdentifier;
        afm.notifyViewExited(mView, ((String)localObject).hashCode());
      }
    }
  }
  
  private void saveEditableSizeAndTransform(double paramDouble1, double paramDouble2, final double[] paramArrayOfDouble)
  {
    final double[] arrayOfDouble = new double[4];
    final boolean bool;
    if ((paramArrayOfDouble[3] == 0.0D) && (paramArrayOfDouble[7] == 0.0D) && (paramArrayOfDouble[15] == 1.0D)) {
      bool = true;
    } else {
      bool = false;
    }
    double d1 = paramArrayOfDouble[12];
    double d2 = paramArrayOfDouble[15];
    d1 /= d2;
    arrayOfDouble[1] = d1;
    arrayOfDouble[0] = d1;
    d2 = paramArrayOfDouble[13] / d2;
    arrayOfDouble[3] = d2;
    arrayOfDouble[2] = d2;
    paramArrayOfDouble = new MinMax()
    {
      public void inspect(double paramAnonymousDouble1, double paramAnonymousDouble2)
      {
        boolean bool = bool;
        double d1 = 1.0D;
        if (!bool)
        {
          arrayOfDouble = paramArrayOfDouble;
          d1 = arrayOfDouble[3];
          d1 = 1.0D / (arrayOfDouble[7] * paramAnonymousDouble2 + d1 * paramAnonymousDouble1 + arrayOfDouble[15]);
        }
        double[] arrayOfDouble = paramArrayOfDouble;
        double d2 = arrayOfDouble[0];
        d2 = (arrayOfDouble[4] * paramAnonymousDouble2 + d2 * paramAnonymousDouble1 + arrayOfDouble[12]) * d1;
        double d3 = arrayOfDouble[1];
        paramAnonymousDouble1 = (arrayOfDouble[5] * paramAnonymousDouble2 + d3 * paramAnonymousDouble1 + arrayOfDouble[13]) * d1;
        arrayOfDouble = arrayOfDouble;
        if (d2 < arrayOfDouble[0]) {
          arrayOfDouble[0] = d2;
        } else if (d2 > arrayOfDouble[1]) {
          arrayOfDouble[1] = d2;
        }
        if (paramAnonymousDouble1 < arrayOfDouble[2]) {
          arrayOfDouble[2] = paramAnonymousDouble1;
        } else if (paramAnonymousDouble1 > arrayOfDouble[3]) {
          arrayOfDouble[3] = paramAnonymousDouble1;
        }
      }
    };
    paramArrayOfDouble.inspect(paramDouble1, 0.0D);
    paramArrayOfDouble.inspect(paramDouble1, paramDouble2);
    paramArrayOfDouble.inspect(0.0D, paramDouble2);
    paramArrayOfDouble = Float.valueOf(mView.getContext().getResources().getDisplayMetrics().density);
    lastClientRect = new Rect((int)(arrayOfDouble[0] * paramArrayOfDouble.floatValue()), (int)(arrayOfDouble[2] * paramArrayOfDouble.floatValue()), (int)Math.ceil(arrayOfDouble[1] * paramArrayOfDouble.floatValue()), (int)Math.ceil(arrayOfDouble[3] * paramArrayOfDouble.floatValue()));
  }
  
  private void setPlatformViewTextInputClient(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      mView.requestFocus();
      inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, paramInt);
      mImm.restartInput(mView);
      mRestartInputPending = false;
    }
    else
    {
      inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, paramInt);
      lastInputConnection = null;
    }
  }
  
  private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    if ((paramConfiguration != null) && (autofill != null))
    {
      TextInputChannel.Configuration[] arrayOfConfiguration = fields;
      Object localObject = new SparseArray();
      autofillConfiguration = ((SparseArray)localObject);
      if (arrayOfConfiguration == null)
      {
        ((SparseArray)localObject).put(autofill.uniqueIdentifier.hashCode(), paramConfiguration);
      }
      else
      {
        int i = arrayOfConfiguration.length;
        for (int j = 0; j < i; j++)
        {
          paramConfiguration = arrayOfConfiguration[j];
          localObject = autofill;
          if (localObject != null)
          {
            autofillConfiguration.put(uniqueIdentifier.hashCode(), paramConfiguration);
            afm.notifyValueChanged(mView, uniqueIdentifier.hashCode(), AutofillValue.forText(editState.text));
          }
        }
      }
      return;
    }
    autofillConfiguration = null;
  }
  
  public void autofill(SparseArray<AutofillValue> paramSparseArray)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    Object localObject1 = configuration;
    if ((localObject1 != null) && (autofillConfiguration != null))
    {
      TextInputChannel.Configuration.Autofill localAutofill = autofill;
      if (localAutofill != null)
      {
        localObject1 = new HashMap();
        for (int i = 0; i < paramSparseArray.size(); i++)
        {
          int j = paramSparseArray.keyAt(i);
          Object localObject2 = (TextInputChannel.Configuration)autofillConfiguration.get(j);
          if (localObject2 != null)
          {
            localObject2 = autofill;
            if (localObject2 != null)
            {
              Object localObject3 = ((AutofillValue)paramSparseArray.valueAt(i)).getTextValue().toString();
              localObject3 = new TextInputChannel.TextEditState((String)localObject3, ((String)localObject3).length(), ((String)localObject3).length(), -1, -1);
              if (uniqueIdentifier.equals(uniqueIdentifier)) {
                mEditable.setEditingState((TextInputChannel.TextEditState)localObject3);
              } else {
                ((HashMap)localObject1).put(uniqueIdentifier, localObject3);
              }
            }
          }
        }
        textInputChannel.updateEditingStateWithTag(inputTarget.id, (HashMap)localObject1);
      }
    }
  }
  
  public void clearPlatformViewClient(int paramInt)
  {
    InputTarget localInputTarget = inputTarget;
    TextInputPlugin.InputTarget.Type localType = type;
    if (((localType == TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) || (localType == TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW)) && (id == paramInt))
    {
      inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
      notifyViewExited();
      mImm.hideSoftInputFromWindow(mView.getApplicationWindowToken(), 0);
      mImm.restartInput(mView);
      mRestartInputPending = false;
    }
  }
  
  public void clearTextInputClient()
  {
    if (inputTarget.type == TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
      return;
    }
    mEditable.removeEditingStateListener(this);
    notifyViewExited();
    configuration = null;
    updateAutofillConfigurationIfNeeded(null);
    inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.NO_TARGET, 0);
    unlockPlatformViewInputConnection();
    lastClientRect = null;
  }
  
  public InputConnection createInputConnection(View paramView, KeyboardManager paramKeyboardManager, EditorInfo paramEditorInfo)
  {
    Object localObject1 = inputTarget;
    Object localObject2 = type;
    if (localObject2 == TextInputPlugin.InputTarget.Type.NO_TARGET)
    {
      lastInputConnection = null;
      return null;
    }
    if (localObject2 == TextInputPlugin.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
      return null;
    }
    if (localObject2 == TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW)
    {
      if (isInputConnectionLocked) {
        return lastInputConnection;
      }
      paramView = platformViewsController.getPlatformViewById(id).onCreateInputConnection(paramEditorInfo);
      lastInputConnection = paramView;
      return paramView;
    }
    localObject1 = configuration;
    int i = inputTypeFromTextInputType(inputType, obscureText, autocorrect, enableSuggestions, enableIMEPersonalizedLearning, textCapitalization);
    inputType = i;
    imeOptions = 33554432;
    int j = Build.VERSION.SDK_INT;
    if ((j >= 26) && (!configuration.enableIMEPersonalizedLearning)) {
      imeOptions = (0x2000000 | 0x1000000);
    }
    localObject1 = configuration.inputAction;
    if (localObject1 == null)
    {
      if ((i & 0x20000) != 0) {
        i = 1;
      } else {
        i = 6;
      }
    }
    else {
      i = ((Integer)localObject1).intValue();
    }
    localObject1 = configuration;
    localObject2 = actionLabel;
    if (localObject2 != null)
    {
      actionLabel = ((CharSequence)localObject2);
      actionId = i;
    }
    imeOptions = (i | imeOptions);
    localObject1 = contentCommitMimeTypes;
    if (localObject1 != null) {
      a.b(paramEditorInfo, (String[])localObject1);
    }
    if (j >= 34)
    {
      if (extras == null) {
        extras = new Bundle();
      }
      extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
    }
    paramView = new InputConnectionAdaptor(paramView, inputTarget.id, textInputChannel, scribeChannel, paramKeyboardManager, mEditable, paramEditorInfo);
    initialSelStart = mEditable.getSelectionStart();
    initialSelEnd = mEditable.getSelectionEnd();
    lastInputConnection = paramView;
    return paramView;
  }
  
  public void destroy()
  {
    platformViewsController.detachTextInputPlugin();
    textInputChannel.setTextInputMethodHandler(null);
    notifyViewExited();
    mEditable.removeEditingStateListener(this);
    ImeSyncDeferringInsetsCallback localImeSyncDeferringInsetsCallback = imeSyncCallback;
    if (localImeSyncDeferringInsetsCallback != null) {
      localImeSyncDeferringInsetsCallback.remove();
    }
  }
  
  public void didChangeEditingState(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      notifyValueChanged(mEditable.toString());
    }
    int i = mEditable.getSelectionStart();
    int j = mEditable.getSelectionEnd();
    int k = mEditable.getComposingStart();
    int m = mEditable.getComposingEnd();
    ArrayList localArrayList = mEditable.extractBatchTextEditingDeltas();
    Object localObject;
    if (mLastKnownFrameworkTextEditingState != null) {
      if (mEditable.toString().equals(mLastKnownFrameworkTextEditingState.text))
      {
        localObject = mLastKnownFrameworkTextEditingState;
        if ((i == selectionStart) && (j == selectionEnd) && (k == composingStart) && (m == composingEnd)) {}
      }
      else
      {
        n = 0;
        break label145;
      }
    }
    int n = 1;
    label145:
    if (n == 0)
    {
      localObject = f.l("send EditingState to flutter: ");
      ((StringBuilder)localObject).append(mEditable.toString());
      Log.v("TextInputPlugin", ((StringBuilder)localObject).toString());
      if (configuration.enableDeltaModel)
      {
        textInputChannel.updateEditingStateWithDeltas(inputTarget.id, localArrayList);
        mEditable.clearBatchDeltas();
      }
      else
      {
        textInputChannel.updateEditingState(inputTarget.id, mEditable.toString(), i, j, k, m);
      }
      mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(mEditable.toString(), i, j, k, m);
    }
    else
    {
      mEditable.clearBatchDeltas();
    }
  }
  
  public Editable getEditable()
  {
    return mEditable;
  }
  
  public ImeSyncDeferringInsetsCallback getImeSyncCallback()
  {
    return imeSyncCallback;
  }
  
  public InputMethodManager getInputMethodManager()
  {
    return mImm;
  }
  
  public InputConnection getLastInputConnection()
  {
    return lastInputConnection;
  }
  
  public boolean handleKeyEvent(KeyEvent paramKeyEvent)
  {
    if (getInputMethodManager().isAcceptingText())
    {
      InputConnection localInputConnection = lastInputConnection;
      if (localInputConnection != null)
      {
        boolean bool;
        if ((localInputConnection instanceof InputConnectionAdaptor)) {
          bool = ((InputConnectionAdaptor)localInputConnection).handleKeyEvent(paramKeyEvent);
        } else {
          bool = localInputConnection.sendKeyEvent(paramKeyEvent);
        }
        return bool;
      }
    }
    return false;
  }
  
  public void lockPlatformViewInputConnection()
  {
    if (inputTarget.type == TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
      isInputConnectionLocked = true;
    }
  }
  
  public void onProvideAutofillVirtualStructure(ViewStructure paramViewStructure, int paramInt)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (needsAutofill()))
    {
      String str = configuration.autofill.uniqueIdentifier;
      AutofillId localAutofillId = paramViewStructure.getAutofillId();
      for (paramInt = 0; paramInt < autofillConfiguration.size(); paramInt++)
      {
        int i = autofillConfiguration.keyAt(paramInt);
        Object localObject1 = autofillConfiguration.valueAt(paramInt)).autofill;
        if (localObject1 != null)
        {
          paramViewStructure.addChildCount(1);
          ViewStructure localViewStructure = paramViewStructure.newChild(paramInt);
          localViewStructure.setAutofillId(localAutofillId, i);
          Object localObject2 = hints;
          if (localObject2.length > 0) {
            localViewStructure.setAutofillHints((String[])localObject2);
          }
          localViewStructure.setAutofillType(1);
          localViewStructure.setVisibility(0);
          localObject2 = hintText;
          if (localObject2 != null) {
            localViewStructure.setHint((CharSequence)localObject2);
          }
          if (str.hashCode() == i)
          {
            localObject2 = lastClientRect;
            if (localObject2 != null) {
              localViewStructure.setDimens(left, top, 0, 0, ((Rect)localObject2).width(), lastClientRect.height());
            }
          }
          for (localObject1 = mEditable;; localObject1 = editState.text)
          {
            localViewStructure.setAutofillValue(AutofillValue.forText((CharSequence)localObject1));
            break;
            localViewStructure.setDimens(0, 0, 0, 0, 1, 1);
          }
        }
      }
    }
  }
  
  public void sendTextInputAppPrivateCommand(String paramString, Bundle paramBundle)
  {
    mImm.sendAppPrivateCommand(mView, paramString, paramBundle);
  }
  
  public void setTextInputClient(int paramInt, TextInputChannel.Configuration paramConfiguration)
  {
    notifyViewExited();
    configuration = paramConfiguration;
    inputTarget = new InputTarget(TextInputPlugin.InputTarget.Type.FRAMEWORK_CLIENT, paramInt);
    mEditable.removeEditingStateListener(this);
    Object localObject = autofill;
    if (localObject != null) {
      localObject = editState;
    } else {
      localObject = null;
    }
    mEditable = new ListenableEditingState((TextInputChannel.TextEditState)localObject, mView);
    updateAutofillConfigurationIfNeeded(paramConfiguration);
    mRestartInputPending = true;
    unlockPlatformViewInputConnection();
    lastClientRect = null;
    mEditable.addEditingStateListener(this);
  }
  
  public void setTextInputEditingState(View paramView, TextInputChannel.TextEditState paramTextEditState)
  {
    if (!mRestartInputPending)
    {
      TextInputChannel.TextEditState localTextEditState = mLastKnownFrameworkTextEditingState;
      if ((localTextEditState != null) && (localTextEditState.hasComposing()))
      {
        boolean bool = composingChanged(mLastKnownFrameworkTextEditingState, paramTextEditState);
        mRestartInputPending = bool;
        if (bool) {
          Log.i("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
        }
      }
    }
    mLastKnownFrameworkTextEditingState = paramTextEditState;
    mEditable.setEditingState(paramTextEditState);
    if (mRestartInputPending)
    {
      mImm.restartInput(paramView);
      mRestartInputPending = false;
    }
  }
  
  public void showTextInput(View paramView)
  {
    Object localObject = configuration;
    if (localObject != null)
    {
      localObject = inputType;
      if ((localObject != null) && (type == TextInputChannel.TextInputType.NONE))
      {
        hideTextInput(paramView);
        return;
      }
    }
    paramView.requestFocus();
    mImm.showSoftInput(paramView, 0);
  }
  
  public void unlockPlatformViewInputConnection()
  {
    if (inputTarget.type == TextInputPlugin.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
      isInputConnectionLocked = false;
    }
  }
  
  public static class InputTarget
  {
    public int id;
    public Type type;
    
    public InputTarget(Type paramType, int paramInt)
    {
      type = paramType;
      id = paramInt;
    }
    
    public static enum Type
    {
      static
      {
        FRAMEWORK_CLIENT = new Type("FRAMEWORK_CLIENT", 1);
        VIRTUAL_DISPLAY_PLATFORM_VIEW = new Type("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2);
        PHYSICAL_DISPLAY_PLATFORM_VIEW = new Type("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
      }
      
      private Type() {}
    }
  }
  
  public static abstract interface MinMax
  {
    public abstract void inspect(double paramDouble1, double paramDouble2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.TextInputPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */