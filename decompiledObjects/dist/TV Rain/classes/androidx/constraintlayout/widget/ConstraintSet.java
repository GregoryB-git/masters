package androidx.constraintlayout.widget;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

public class ConstraintSet
{
  private static final int ALPHA = 43;
  private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
  private static final int ANIMATE_RELATIVE_TO = 64;
  private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
  private static final int BARRIER_DIRECTION = 72;
  private static final int BARRIER_MARGIN = 73;
  private static final int BARRIER_TYPE = 1;
  public static final int BASELINE = 5;
  private static final int BASELINE_MARGIN = 93;
  private static final int BASELINE_TO_BASELINE = 1;
  private static final int BASELINE_TO_BOTTOM = 92;
  private static final int BASELINE_TO_TOP = 91;
  public static final int BOTTOM = 4;
  private static final int BOTTOM_MARGIN = 2;
  private static final int BOTTOM_TO_BOTTOM = 3;
  private static final int BOTTOM_TO_TOP = 4;
  public static final int CHAIN_PACKED = 2;
  public static final int CHAIN_SPREAD = 0;
  public static final int CHAIN_SPREAD_INSIDE = 1;
  private static final int CHAIN_USE_RTL = 71;
  private static final int CIRCLE = 61;
  private static final int CIRCLE_ANGLE = 63;
  private static final int CIRCLE_RADIUS = 62;
  public static final int CIRCLE_REFERENCE = 8;
  private static final int CONSTRAINED_HEIGHT = 81;
  private static final int CONSTRAINED_WIDTH = 80;
  private static final int CONSTRAINT_REFERENCED_IDS = 74;
  private static final int CONSTRAINT_TAG = 77;
  private static final boolean DEBUG = false;
  private static final int DIMENSION_RATIO = 5;
  private static final int DRAW_PATH = 66;
  private static final int EDITOR_ABSOLUTE_X = 6;
  private static final int EDITOR_ABSOLUTE_Y = 7;
  private static final int ELEVATION = 44;
  public static final int END = 7;
  private static final int END_MARGIN = 8;
  private static final int END_TO_END = 9;
  private static final int END_TO_START = 10;
  private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
  public static final int GONE = 8;
  private static final int GONE_BASELINE_MARGIN = 94;
  private static final int GONE_BOTTOM_MARGIN = 11;
  private static final int GONE_END_MARGIN = 12;
  private static final int GONE_LEFT_MARGIN = 13;
  private static final int GONE_RIGHT_MARGIN = 14;
  private static final int GONE_START_MARGIN = 15;
  private static final int GONE_TOP_MARGIN = 16;
  private static final int GUIDELINE_USE_RTL = 99;
  private static final int GUIDE_BEGIN = 17;
  private static final int GUIDE_END = 18;
  private static final int GUIDE_PERCENT = 19;
  private static final int HEIGHT_DEFAULT = 55;
  private static final int HEIGHT_MAX = 57;
  private static final int HEIGHT_MIN = 59;
  private static final int HEIGHT_PERCENT = 70;
  public static final int HORIZONTAL = 0;
  private static final int HORIZONTAL_BIAS = 20;
  public static final int HORIZONTAL_GUIDELINE = 0;
  private static final int HORIZONTAL_STYLE = 41;
  private static final int HORIZONTAL_WEIGHT = 39;
  private static final int INTERNAL_MATCH_CONSTRAINT = -3;
  private static final int INTERNAL_MATCH_PARENT = -1;
  private static final int INTERNAL_WRAP_CONTENT = -2;
  private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
  public static final int INVISIBLE = 4;
  private static final String KEY_PERCENT_PARENT = "parent";
  private static final String KEY_RATIO = "ratio";
  private static final String KEY_WEIGHT = "weight";
  private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
  private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
  private static final int LAYOUT_HEIGHT = 21;
  private static final int LAYOUT_VISIBILITY = 22;
  private static final int LAYOUT_WIDTH = 23;
  private static final int LAYOUT_WRAP_BEHAVIOR = 97;
  public static final int LEFT = 1;
  private static final int LEFT_MARGIN = 24;
  private static final int LEFT_TO_LEFT = 25;
  private static final int LEFT_TO_RIGHT = 26;
  public static final int MATCH_CONSTRAINT = 0;
  public static final int MATCH_CONSTRAINT_PERCENT = 2;
  public static final int MATCH_CONSTRAINT_SPREAD = 0;
  public static final int MATCH_CONSTRAINT_WRAP = 1;
  private static final int MOTION_STAGGER = 79;
  private static final int MOTION_TARGET = 98;
  private static final int ORIENTATION = 27;
  public static final int PARENT_ID = 0;
  private static final int PATH_MOTION_ARC = 76;
  private static final int PROGRESS = 68;
  private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
  private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
  private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
  private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
  private static final int QUANTIZE_MOTION_PHASE = 85;
  private static final int QUANTIZE_MOTION_STEPS = 84;
  public static final int RIGHT = 2;
  private static final int RIGHT_MARGIN = 28;
  private static final int RIGHT_TO_LEFT = 29;
  private static final int RIGHT_TO_RIGHT = 30;
  public static final int ROTATE_LEFT_OF_PORTRATE = 4;
  public static final int ROTATE_NONE = 0;
  public static final int ROTATE_PORTRATE_OF_LEFT = 2;
  public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
  public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
  private static final int ROTATION = 60;
  private static final int ROTATION_X = 45;
  private static final int ROTATION_Y = 46;
  private static final int SCALE_X = 47;
  private static final int SCALE_Y = 48;
  public static final int START = 6;
  private static final int START_MARGIN = 31;
  private static final int START_TO_END = 32;
  private static final int START_TO_START = 33;
  private static final String TAG = "ConstraintSet";
  public static final int TOP = 3;
  private static final int TOP_MARGIN = 34;
  private static final int TOP_TO_BOTTOM = 35;
  private static final int TOP_TO_TOP = 36;
  private static final int TRANSFORM_PIVOT_TARGET = 83;
  private static final int TRANSFORM_PIVOT_X = 49;
  private static final int TRANSFORM_PIVOT_Y = 50;
  private static final int TRANSITION_EASING = 65;
  private static final int TRANSITION_PATH_ROTATE = 67;
  private static final int TRANSLATION_X = 51;
  private static final int TRANSLATION_Y = 52;
  private static final int TRANSLATION_Z = 53;
  public static final int UNSET = -1;
  private static final int UNUSED = 87;
  public static final int VERTICAL = 1;
  private static final int VERTICAL_BIAS = 37;
  public static final int VERTICAL_GUIDELINE = 1;
  private static final int VERTICAL_STYLE = 42;
  private static final int VERTICAL_WEIGHT = 40;
  private static final int VIEW_ID = 38;
  private static final int[] VISIBILITY_FLAGS = { 0, 4, 8 };
  private static final int VISIBILITY_MODE = 78;
  public static final int VISIBILITY_MODE_IGNORE = 1;
  public static final int VISIBILITY_MODE_NORMAL = 0;
  public static final int VISIBLE = 0;
  private static final int WIDTH_DEFAULT = 54;
  private static final int WIDTH_MAX = 56;
  private static final int WIDTH_MIN = 58;
  private static final int WIDTH_PERCENT = 69;
  public static final int WRAP_CONTENT = -2;
  private static SparseIntArray mapToConstant = new SparseIntArray();
  private static SparseIntArray overrideMapToConstant = new SparseIntArray();
  public String derivedState = "";
  private HashMap<Integer, Constraint> mConstraints = new HashMap();
  private boolean mForceId = true;
  public String mIdString;
  public int mRotate = 0;
  private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap();
  private boolean mValidate;
  
  static
  {
    mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
    mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
    mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
    mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
    mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
    mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
    mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
    mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
    mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
    mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
    mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
    mapToConstant.append(R.styleable.Constraint_guidelineUseRtl, 99);
    mapToConstant.append(R.styleable.Constraint_android_orientation, 27);
    mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
    mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
    mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
    mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
    mapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
    mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
    mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
    mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
    mapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
    mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
    mapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
    mapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
    mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
    mapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
    mapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
    mapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
    mapToConstant.append(R.styleable.Constraint_layout_constraintWidth, 95);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHeight, 96);
    mapToConstant.append(R.styleable.Constraint_android_visibility, 22);
    mapToConstant.append(R.styleable.Constraint_android_alpha, 43);
    mapToConstant.append(R.styleable.Constraint_android_elevation, 44);
    mapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
    mapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
    mapToConstant.append(R.styleable.Constraint_android_rotation, 60);
    mapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
    mapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
    mapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
    mapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
    mapToConstant.append(R.styleable.Constraint_android_translationX, 51);
    mapToConstant.append(R.styleable.Constraint_android_translationY, 52);
    mapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
    mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
    mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
    mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
    mapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
    mapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
    mapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
    mapToConstant.append(R.styleable.Constraint_animateRelativeTo, 64);
    mapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
    mapToConstant.append(R.styleable.Constraint_drawPath, 66);
    mapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
    mapToConstant.append(R.styleable.Constraint_motionStagger, 79);
    mapToConstant.append(R.styleable.Constraint_android_id, 38);
    mapToConstant.append(R.styleable.Constraint_motionProgress, 68);
    mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
    mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
    mapToConstant.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
    mapToConstant.append(R.styleable.Constraint_chainUseRtl, 71);
    mapToConstant.append(R.styleable.Constraint_barrierDirection, 72);
    mapToConstant.append(R.styleable.Constraint_barrierMargin, 73);
    mapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, 74);
    mapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
    mapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
    mapToConstant.append(R.styleable.Constraint_layout_constraintTag, 77);
    mapToConstant.append(R.styleable.Constraint_visibilityMode, 78);
    mapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, 80);
    mapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, 81);
    mapToConstant.append(R.styleable.Constraint_polarRelativeTo, 82);
    mapToConstant.append(R.styleable.Constraint_transformPivotTarget, 83);
    mapToConstant.append(R.styleable.Constraint_quantizeMotionSteps, 84);
    mapToConstant.append(R.styleable.Constraint_quantizeMotionPhase, 85);
    mapToConstant.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
    SparseIntArray localSparseIntArray = overrideMapToConstant;
    int i = R.styleable.ConstraintOverride_layout_editor_absoluteY;
    localSparseIntArray.append(i, 6);
    overrideMapToConstant.append(i, 7);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_width, 23);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_height, 21);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_visibility, 22);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_alpha, 43);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_elevation, 44);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationX, 45);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationY, 46);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotation, 60);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleX, 47);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleY, 48);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationX, 51);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationY, 52);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationZ, 53);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_transitionEasing, 65);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_drawPath, 66);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_motionStagger, 79);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_android_id, 38);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_motionTarget, 98);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_motionProgress, 68);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierDirection, 72);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierMargin, 73);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_visibilityMode, 78);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
    overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
  }
  
  private void addAttributes(ConstraintAttribute.AttributeType paramAttributeType, String... paramVarArgs)
  {
    for (int i = 0; i < paramVarArgs.length; i++)
    {
      ConstraintAttribute localConstraintAttribute;
      if (mSavedAttributes.containsKey(paramVarArgs[i]))
      {
        localConstraintAttribute = (ConstraintAttribute)mSavedAttributes.get(paramVarArgs[i]);
        if ((localConstraintAttribute != null) && (localConstraintAttribute.getType() != paramAttributeType))
        {
          paramAttributeType = z2.t("ConstraintAttribute is already a ");
          paramAttributeType.append(localConstraintAttribute.getType().name());
          throw new IllegalArgumentException(paramAttributeType.toString());
        }
      }
      else
      {
        localConstraintAttribute = new ConstraintAttribute(paramVarArgs[i], paramAttributeType);
        mSavedAttributes.put(paramVarArgs[i], localConstraintAttribute);
      }
    }
  }
  
  public static Constraint buildDelta(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject = Xml.asAttributeSet(paramXmlPullParser);
    paramXmlPullParser = new Constraint();
    localObject = paramContext.obtainStyledAttributes((AttributeSet)localObject, R.styleable.ConstraintOverride);
    populateOverride(paramContext, paramXmlPullParser, (TypedArray)localObject);
    ((TypedArray)localObject).recycle();
    return paramXmlPullParser;
  }
  
  private int[] convertReferenceString(View paramView, String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    Context localContext = paramView.getContext();
    paramString = new int[arrayOfString.length];
    int i = 0;
    for (int j = i; i < arrayOfString.length; j++)
    {
      String str = arrayOfString[i].trim();
      try
      {
        k = R.id.class.getField(str).getInt(null);
      }
      catch (Exception localException)
      {
        k = 0;
      }
      int m = k;
      if (k == 0) {
        m = localContext.getResources().getIdentifier(str, "id", localContext.getPackageName());
      }
      int k = m;
      if (m == 0)
      {
        k = m;
        if (paramView.isInEditMode())
        {
          k = m;
          if ((paramView.getParent() instanceof ConstraintLayout))
          {
            Object localObject = ((ConstraintLayout)paramView.getParent()).getDesignInformation(0, str);
            k = m;
            if (localObject != null)
            {
              k = m;
              if ((localObject instanceof Integer)) {
                k = ((Integer)localObject).intValue();
              }
            }
          }
        }
      }
      paramString[j] = k;
      i++;
    }
    paramView = paramString;
    if (j != arrayOfString.length) {
      paramView = Arrays.copyOf(paramString, j);
    }
    return paramView;
  }
  
  private void createHorizontalChain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt5, int paramInt6, int paramInt7)
  {
    if (paramArrayOfInt.length >= 2)
    {
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length != paramArrayOfInt.length)) {
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
      }
      if (paramArrayOfFloat != null) {
        get0layout.horizontalWeight = paramArrayOfFloat[0];
      }
      get0layout.horizontalChainStyle = paramInt5;
      connect(paramArrayOfInt[0], paramInt6, paramInt1, paramInt2, -1);
      for (paramInt1 = 1; paramInt1 < paramArrayOfInt.length; paramInt1++)
      {
        paramInt2 = paramArrayOfInt[paramInt1];
        paramInt5 = paramInt1 - 1;
        connect(paramInt2, paramInt6, paramArrayOfInt[paramInt5], paramInt7, -1);
        connect(paramArrayOfInt[paramInt5], paramInt7, paramArrayOfInt[paramInt1], paramInt6, -1);
        if (paramArrayOfFloat != null) {
          getlayout.horizontalWeight = paramArrayOfFloat[paramInt1];
        }
      }
      connect(paramArrayOfInt[(paramArrayOfInt.length - 1)], paramInt7, paramInt3, paramInt4, -1);
      return;
    }
    throw new IllegalArgumentException("must have 2 or more widgets in a chain");
  }
  
  private Constraint fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    Constraint localConstraint = new Constraint();
    int[] arrayOfInt;
    if (paramBoolean) {
      arrayOfInt = R.styleable.ConstraintOverride;
    } else {
      arrayOfInt = R.styleable.Constraint;
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    populateConstraint(paramContext, localConstraint, paramAttributeSet, paramBoolean);
    paramAttributeSet.recycle();
    return localConstraint;
  }
  
  private Constraint get(int paramInt)
  {
    if (!mConstraints.containsKey(Integer.valueOf(paramInt))) {
      mConstraints.put(Integer.valueOf(paramInt), new Constraint());
    }
    return (Constraint)mConstraints.get(Integer.valueOf(paramInt));
  }
  
  public static String getDebugName(int paramInt)
  {
    for (Object localObject : ConstraintSet.class.getDeclaredFields()) {
      if ((((Field)localObject).getName().contains("_")) && (((Field)localObject).getType() == Integer.TYPE) && (Modifier.isStatic(((Field)localObject).getModifiers())) && (Modifier.isFinal(((Field)localObject).getModifiers()))) {
        try
        {
          if (((Field)localObject).getInt(null) == paramInt)
          {
            localObject = ((Field)localObject).getName();
            return (String)localObject;
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localIllegalAccessException.printStackTrace();
        }
      }
    }
    return "UNKNOWN";
  }
  
  public static String getLine(Context paramContext, int paramInt, XmlPullParser paramXmlPullParser)
  {
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(Debug.getName(paramContext, paramInt));
    localStringBuilder.append(".xml:");
    localStringBuilder.append(paramXmlPullParser.getLineNumber());
    localStringBuilder.append(") \"");
    localStringBuilder.append(paramXmlPullParser.getName());
    localStringBuilder.append("\"");
    return localStringBuilder.toString();
  }
  
  private static int lookupID(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1) {
      paramInt2 = paramTypedArray.getInt(paramInt1, -1);
    }
    return paramInt2;
  }
  
  public static void parseDimensionConstraints(Object paramObject, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    if (paramObject == null) {
      return;
    }
    int i = peekValuetype;
    if (i != 3)
    {
      int j = -2;
      boolean bool = false;
      if (i != 5)
      {
        paramInt1 = paramTypedArray.getInt(paramInt1, 0);
        if (paramInt1 != -4)
        {
          if ((paramInt1 == -3) || ((paramInt1 != -2) && (paramInt1 != -1))) {
            paramInt1 = 0;
          }
        }
        else
        {
          bool = true;
          paramInt1 = j;
        }
      }
      else
      {
        paramInt1 = paramTypedArray.getDimensionPixelSize(paramInt1, 0);
      }
      if ((paramObject instanceof ConstraintLayout.LayoutParams))
      {
        paramObject = (ConstraintLayout.LayoutParams)paramObject;
        if (paramInt2 == 0)
        {
          width = paramInt1;
          constrainedWidth = bool;
        }
        else
        {
          height = paramInt1;
          constrainedHeight = bool;
        }
      }
      else if ((paramObject instanceof Layout))
      {
        paramObject = (Layout)paramObject;
        if (paramInt2 == 0)
        {
          mWidth = paramInt1;
          constrainedWidth = bool;
        }
        else
        {
          mHeight = paramInt1;
          constrainedHeight = bool;
        }
      }
      else if ((paramObject instanceof ConstraintSet.Constraint.Delta))
      {
        paramObject = (ConstraintSet.Constraint.Delta)paramObject;
        if (paramInt2 == 0)
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(23, paramInt1);
          ((ConstraintSet.Constraint.Delta)paramObject).add(80, bool);
        }
        else
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(21, paramInt1);
          ((ConstraintSet.Constraint.Delta)paramObject).add(81, bool);
        }
      }
      return;
    }
    parseDimensionConstraintsString(paramObject, paramTypedArray.getString(paramInt1), paramInt2);
  }
  
  public static void parseDimensionConstraintsString(Object paramObject, String paramString, int paramInt)
  {
    if (paramString == null) {
      return;
    }
    int i = paramString.indexOf('=');
    int j = paramString.length();
    String str1;
    if ((i > 0) && (i < j - 1))
    {
      str1 = paramString.substring(0, i);
      String str2 = paramString.substring(i + 1);
      if (str2.length() > 0)
      {
        paramString = str1.trim();
        str1 = str2.trim();
        if ("ratio".equalsIgnoreCase(paramString))
        {
          if ((paramObject instanceof ConstraintLayout.LayoutParams))
          {
            paramObject = (ConstraintLayout.LayoutParams)paramObject;
            if (paramInt == 0) {
              width = 0;
            } else {
              height = 0;
            }
            parseDimensionRatioString((ConstraintLayout.LayoutParams)paramObject, str1);
          }
          else if ((paramObject instanceof Layout))
          {
            dimensionRatio = str1;
          }
          else if ((paramObject instanceof ConstraintSet.Constraint.Delta))
          {
            ((ConstraintSet.Constraint.Delta)paramObject).add(5, str1);
          }
        }
        else if (!"weight".equalsIgnoreCase(paramString)) {}
      }
    }
    try
    {
      f = Float.parseFloat(str1);
      if ((paramObject instanceof ConstraintLayout.LayoutParams))
      {
        paramObject = (ConstraintLayout.LayoutParams)paramObject;
        if (paramInt == 0)
        {
          width = 0;
          horizontalWeight = f;
        }
        else
        {
          height = 0;
          verticalWeight = f;
        }
      }
      else if ((paramObject instanceof Layout))
      {
        paramObject = (Layout)paramObject;
        if (paramInt == 0)
        {
          mWidth = 0;
          horizontalWeight = f;
        }
        else
        {
          mHeight = 0;
          verticalWeight = f;
        }
      }
      else if ((paramObject instanceof ConstraintSet.Constraint.Delta))
      {
        paramObject = (ConstraintSet.Constraint.Delta)paramObject;
        if (paramInt == 0)
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(23, 0);
          ((ConstraintSet.Constraint.Delta)paramObject).add(39, f);
        }
        else
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(21, 0);
          ((ConstraintSet.Constraint.Delta)paramObject).add(40, f);
        }
      }
    }
    catch (NumberFormatException paramObject)
    {
      float f;
      for (;;) {}
    }
    if ("parent".equalsIgnoreCase(paramString))
    {
      f = Math.max(0.0F, Math.min(1.0F, Float.parseFloat(str1)));
      if ((paramObject instanceof ConstraintLayout.LayoutParams))
      {
        paramObject = (ConstraintLayout.LayoutParams)paramObject;
        if (paramInt == 0)
        {
          width = 0;
          matchConstraintPercentWidth = f;
          matchConstraintDefaultWidth = 2;
        }
        else
        {
          height = 0;
          matchConstraintPercentHeight = f;
          matchConstraintDefaultHeight = 2;
        }
      }
      else if ((paramObject instanceof Layout))
      {
        paramObject = (Layout)paramObject;
        if (paramInt == 0)
        {
          mWidth = 0;
          widthPercent = f;
          widthDefault = 2;
        }
        else
        {
          mHeight = 0;
          heightPercent = f;
          heightDefault = 2;
        }
      }
      else if ((paramObject instanceof ConstraintSet.Constraint.Delta))
      {
        paramObject = (ConstraintSet.Constraint.Delta)paramObject;
        if (paramInt == 0)
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(23, 0);
          ((ConstraintSet.Constraint.Delta)paramObject).add(54, 2);
        }
        else
        {
          ((ConstraintSet.Constraint.Delta)paramObject).add(21, 0);
          ((ConstraintSet.Constraint.Delta)paramObject).add(55, 2);
        }
      }
    }
  }
  
  public static void parseDimensionRatioString(ConstraintLayout.LayoutParams paramLayoutParams, String paramString)
  {
    f1 = NaN.0F;
    int i = -1;
    f2 = f1;
    j = i;
    String str2;
    if (paramString != null)
    {
      int k = paramString.length();
      int m = paramString.indexOf(',');
      int n = 0;
      i1 = i;
      j = n;
      if (m > 0)
      {
        i1 = i;
        j = n;
        if (m < k - 1)
        {
          str1 = paramString.substring(0, m);
          if (str1.equalsIgnoreCase("W"))
          {
            i1 = 0;
          }
          else
          {
            i1 = i;
            if (str1.equalsIgnoreCase("H")) {
              i1 = 1;
            }
          }
          j = m + 1;
        }
      }
      i = paramString.indexOf(':');
      if ((i >= 0) && (i < k - 1))
      {
        str2 = paramString.substring(j, i);
        str1 = paramString.substring(i + 1);
        f2 = f1;
        j = i1;
        if (str2.length() <= 0) {
          break label293;
        }
        f2 = f1;
        j = i1;
        if (str1.length() <= 0) {
          break label293;
        }
      }
    }
    try
    {
      float f3 = Float.parseFloat(str2);
      float f4 = Float.parseFloat(str1);
      f2 = f1;
      j = i1;
      if (f3 <= 0.0F) {
        break label293;
      }
      f2 = f1;
      j = i1;
      if (f4 <= 0.0F) {
        break label293;
      }
      if (i1 == 1)
      {
        f2 = Math.abs(f4 / f3);
        j = i1;
      }
      else
      {
        f2 = Math.abs(f3 / f4);
        j = i1;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        f2 = f1;
        j = i1;
      }
    }
    String str1 = paramString.substring(j);
    f2 = f1;
    j = i1;
    if (str1.length() > 0)
    {
      f2 = Float.parseFloat(str1);
      j = i1;
    }
    label293:
    dimensionRatio = paramString;
    dimensionRatioValue = f2;
    dimensionRatioSide = j;
  }
  
  private void populateConstraint(Context paramContext, Constraint paramConstraint, TypedArray paramTypedArray, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      populateOverride(paramContext, paramConstraint, paramTypedArray);
      return;
    }
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      if ((k != R.styleable.Constraint_android_id) && (R.styleable.Constraint_android_layout_marginStart != k) && (R.styleable.Constraint_android_layout_marginEnd != k))
      {
        motion.mApply = true;
        layout.mApply = true;
        propertySet.mApply = true;
        transform.mApply = true;
      }
      switch (mapToConstant.get(k))
      {
      case 88: 
      case 89: 
      case 90: 
      default: 
        paramContext = z2.t("Unknown attribute 0x");
        paramContext.append(Integer.toHexString(k));
        paramContext.append("   ");
        paramContext.append(mapToConstant.get(k));
        Log.w("ConstraintSet", paramContext.toString());
        break;
      case 97: 
        paramContext = layout;
        mWrapBehavior = paramTypedArray.getInt(k, mWrapBehavior);
        break;
      case 96: 
        parseDimensionConstraints(layout, paramTypedArray, k, 1);
        break;
      case 95: 
        parseDimensionConstraints(layout, paramTypedArray, k, 0);
        break;
      case 94: 
        paramContext = layout;
        goneBaselineMargin = paramTypedArray.getDimensionPixelSize(k, goneBaselineMargin);
        break;
      case 93: 
        paramContext = layout;
        baselineMargin = paramTypedArray.getDimensionPixelSize(k, baselineMargin);
        break;
      case 92: 
        paramContext = layout;
        baselineToBottom = lookupID(paramTypedArray, k, baselineToBottom);
        break;
      case 91: 
        paramContext = layout;
        baselineToTop = lookupID(paramTypedArray, k, baselineToTop);
        break;
      case 87: 
        paramContext = z2.t("unused attribute 0x");
        paramContext.append(Integer.toHexString(k));
        paramContext.append("   ");
        paramContext.append(mapToConstant.get(k));
        Log.w("ConstraintSet", paramContext.toString());
        break;
      case 86: 
        int m = peekValuetype;
        if (m == 1)
        {
          motion.mQuantizeInterpolatorID = paramTypedArray.getResourceId(k, -1);
          paramContext = motion;
          if (mQuantizeInterpolatorID != -1) {
            mQuantizeInterpolatorType = -2;
          }
        }
        else if (m == 3)
        {
          motion.mQuantizeInterpolatorString = paramTypedArray.getString(k);
          if (motion.mQuantizeInterpolatorString.indexOf("/") > 0)
          {
            motion.mQuantizeInterpolatorID = paramTypedArray.getResourceId(k, -1);
            motion.mQuantizeInterpolatorType = -2;
          }
          else
          {
            motion.mQuantizeInterpolatorType = -1;
          }
        }
        else
        {
          paramContext = motion;
          mQuantizeInterpolatorType = paramTypedArray.getInteger(k, mQuantizeInterpolatorID);
        }
        break;
      case 85: 
        paramContext = motion;
        mQuantizeMotionPhase = paramTypedArray.getFloat(k, mQuantizeMotionPhase);
        break;
      case 84: 
        paramContext = motion;
        mQuantizeMotionSteps = paramTypedArray.getInteger(k, mQuantizeMotionSteps);
        break;
      case 83: 
        paramContext = transform;
        transformPivotTarget = lookupID(paramTypedArray, k, transformPivotTarget);
        break;
      case 82: 
        paramContext = motion;
        mAnimateCircleAngleTo = paramTypedArray.getInteger(k, mAnimateCircleAngleTo);
        break;
      case 81: 
        paramContext = layout;
        constrainedHeight = paramTypedArray.getBoolean(k, constrainedHeight);
        break;
      case 80: 
        paramContext = layout;
        constrainedWidth = paramTypedArray.getBoolean(k, constrainedWidth);
        break;
      case 79: 
        paramContext = motion;
        mMotionStagger = paramTypedArray.getFloat(k, mMotionStagger);
        break;
      case 78: 
        paramContext = propertySet;
        mVisibilityMode = paramTypedArray.getInt(k, mVisibilityMode);
        break;
      case 77: 
        layout.mConstraintTag = paramTypedArray.getString(k);
        break;
      case 76: 
        paramContext = motion;
        mPathMotionArc = paramTypedArray.getInt(k, mPathMotionArc);
        break;
      case 75: 
        paramContext = layout;
        mBarrierAllowsGoneWidgets = paramTypedArray.getBoolean(k, mBarrierAllowsGoneWidgets);
        break;
      case 74: 
        layout.mReferenceIdString = paramTypedArray.getString(k);
        break;
      case 73: 
        paramContext = layout;
        mBarrierMargin = paramTypedArray.getDimensionPixelSize(k, mBarrierMargin);
        break;
      case 72: 
        paramContext = layout;
        mBarrierDirection = paramTypedArray.getInt(k, mBarrierDirection);
        break;
      case 71: 
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        break;
      case 70: 
        layout.heightPercent = paramTypedArray.getFloat(k, 1.0F);
        break;
      case 69: 
        layout.widthPercent = paramTypedArray.getFloat(k, 1.0F);
        break;
      case 68: 
        paramContext = propertySet;
        mProgress = paramTypedArray.getFloat(k, mProgress);
        break;
      case 67: 
        paramContext = motion;
        mPathRotate = paramTypedArray.getFloat(k, mPathRotate);
        break;
      case 66: 
        motion.mDrawPath = paramTypedArray.getInt(k, 0);
        break;
      case 65: 
        if (peekValuetype == 3) {
          motion.mTransitionEasing = paramTypedArray.getString(k);
        } else {
          motion.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[paramTypedArray.getInteger(k, 0)];
        }
        break;
      case 64: 
        paramContext = motion;
        mAnimateRelativeTo = lookupID(paramTypedArray, k, mAnimateRelativeTo);
        break;
      case 63: 
        paramContext = layout;
        circleAngle = paramTypedArray.getFloat(k, circleAngle);
        break;
      case 62: 
        paramContext = layout;
        circleRadius = paramTypedArray.getDimensionPixelSize(k, circleRadius);
        break;
      case 61: 
        paramContext = layout;
        circleConstraint = lookupID(paramTypedArray, k, circleConstraint);
        break;
      case 60: 
        paramContext = transform;
        rotation = paramTypedArray.getFloat(k, rotation);
        break;
      case 59: 
        paramContext = layout;
        heightMin = paramTypedArray.getDimensionPixelSize(k, heightMin);
        break;
      case 58: 
        paramContext = layout;
        widthMin = paramTypedArray.getDimensionPixelSize(k, widthMin);
        break;
      case 57: 
        paramContext = layout;
        heightMax = paramTypedArray.getDimensionPixelSize(k, heightMax);
        break;
      case 56: 
        paramContext = layout;
        widthMax = paramTypedArray.getDimensionPixelSize(k, widthMax);
        break;
      case 55: 
        paramContext = layout;
        heightDefault = paramTypedArray.getInt(k, heightDefault);
        break;
      case 54: 
        paramContext = layout;
        widthDefault = paramTypedArray.getInt(k, widthDefault);
        break;
      case 53: 
        paramContext = transform;
        translationZ = paramTypedArray.getDimension(k, translationZ);
        break;
      case 52: 
        paramContext = transform;
        translationY = paramTypedArray.getDimension(k, translationY);
        break;
      case 51: 
        paramContext = transform;
        translationX = paramTypedArray.getDimension(k, translationX);
        break;
      case 50: 
        paramContext = transform;
        transformPivotY = paramTypedArray.getDimension(k, transformPivotY);
        break;
      case 49: 
        paramContext = transform;
        transformPivotX = paramTypedArray.getDimension(k, transformPivotX);
        break;
      case 48: 
        paramContext = transform;
        scaleY = paramTypedArray.getFloat(k, scaleY);
        break;
      case 47: 
        paramContext = transform;
        scaleX = paramTypedArray.getFloat(k, scaleX);
        break;
      case 46: 
        paramContext = transform;
        rotationY = paramTypedArray.getFloat(k, rotationY);
        break;
      case 45: 
        paramContext = transform;
        rotationX = paramTypedArray.getFloat(k, rotationX);
        break;
      case 44: 
        paramContext = transform;
        applyElevation = true;
        elevation = paramTypedArray.getDimension(k, elevation);
        break;
      case 43: 
        paramContext = propertySet;
        alpha = paramTypedArray.getFloat(k, alpha);
        break;
      case 42: 
        paramContext = layout;
        verticalChainStyle = paramTypedArray.getInt(k, verticalChainStyle);
        break;
      case 41: 
        paramContext = layout;
        horizontalChainStyle = paramTypedArray.getInt(k, horizontalChainStyle);
        break;
      case 40: 
        paramContext = layout;
        verticalWeight = paramTypedArray.getFloat(k, verticalWeight);
        break;
      case 39: 
        paramContext = layout;
        horizontalWeight = paramTypedArray.getFloat(k, horizontalWeight);
        break;
      case 38: 
        mViewId = paramTypedArray.getResourceId(k, mViewId);
        break;
      case 37: 
        paramContext = layout;
        verticalBias = paramTypedArray.getFloat(k, verticalBias);
        break;
      case 36: 
        paramContext = layout;
        topToTop = lookupID(paramTypedArray, k, topToTop);
        break;
      case 35: 
        paramContext = layout;
        topToBottom = lookupID(paramTypedArray, k, topToBottom);
        break;
      case 34: 
        paramContext = layout;
        topMargin = paramTypedArray.getDimensionPixelSize(k, topMargin);
        break;
      case 33: 
        paramContext = layout;
        startToStart = lookupID(paramTypedArray, k, startToStart);
        break;
      case 32: 
        paramContext = layout;
        startToEnd = lookupID(paramTypedArray, k, startToEnd);
        break;
      case 31: 
        paramContext = layout;
        startMargin = paramTypedArray.getDimensionPixelSize(k, startMargin);
        break;
      case 30: 
        paramContext = layout;
        rightToRight = lookupID(paramTypedArray, k, rightToRight);
        break;
      case 29: 
        paramContext = layout;
        rightToLeft = lookupID(paramTypedArray, k, rightToLeft);
        break;
      case 28: 
        paramContext = layout;
        rightMargin = paramTypedArray.getDimensionPixelSize(k, rightMargin);
        break;
      case 27: 
        paramContext = layout;
        orientation = paramTypedArray.getInt(k, orientation);
        break;
      case 26: 
        paramContext = layout;
        leftToRight = lookupID(paramTypedArray, k, leftToRight);
        break;
      case 25: 
        paramContext = layout;
        leftToLeft = lookupID(paramTypedArray, k, leftToLeft);
        break;
      case 24: 
        paramContext = layout;
        leftMargin = paramTypedArray.getDimensionPixelSize(k, leftMargin);
        break;
      case 23: 
        paramContext = layout;
        mWidth = paramTypedArray.getLayoutDimension(k, mWidth);
        break;
      case 22: 
        paramContext = propertySet;
        visibility = paramTypedArray.getInt(k, visibility);
        paramContext = propertySet;
        visibility = VISIBILITY_FLAGS[visibility];
        break;
      case 21: 
        paramContext = layout;
        mHeight = paramTypedArray.getLayoutDimension(k, mHeight);
        break;
      case 20: 
        paramContext = layout;
        horizontalBias = paramTypedArray.getFloat(k, horizontalBias);
        break;
      case 19: 
        paramContext = layout;
        guidePercent = paramTypedArray.getFloat(k, guidePercent);
        break;
      case 18: 
        paramContext = layout;
        guideEnd = paramTypedArray.getDimensionPixelOffset(k, guideEnd);
        break;
      case 17: 
        paramContext = layout;
        guideBegin = paramTypedArray.getDimensionPixelOffset(k, guideBegin);
        break;
      case 16: 
        paramContext = layout;
        goneTopMargin = paramTypedArray.getDimensionPixelSize(k, goneTopMargin);
        break;
      case 15: 
        paramContext = layout;
        goneStartMargin = paramTypedArray.getDimensionPixelSize(k, goneStartMargin);
        break;
      case 14: 
        paramContext = layout;
        goneRightMargin = paramTypedArray.getDimensionPixelSize(k, goneRightMargin);
        break;
      case 13: 
        paramContext = layout;
        goneLeftMargin = paramTypedArray.getDimensionPixelSize(k, goneLeftMargin);
        break;
      case 12: 
        paramContext = layout;
        goneEndMargin = paramTypedArray.getDimensionPixelSize(k, goneEndMargin);
        break;
      case 11: 
        paramContext = layout;
        goneBottomMargin = paramTypedArray.getDimensionPixelSize(k, goneBottomMargin);
        break;
      case 10: 
        paramContext = layout;
        endToStart = lookupID(paramTypedArray, k, endToStart);
        break;
      case 9: 
        paramContext = layout;
        endToEnd = lookupID(paramTypedArray, k, endToEnd);
        break;
      case 8: 
        paramContext = layout;
        endMargin = paramTypedArray.getDimensionPixelSize(k, endMargin);
        break;
      case 7: 
        paramContext = layout;
        editorAbsoluteY = paramTypedArray.getDimensionPixelOffset(k, editorAbsoluteY);
        break;
      case 6: 
        paramContext = layout;
        editorAbsoluteX = paramTypedArray.getDimensionPixelOffset(k, editorAbsoluteX);
        break;
      case 5: 
        layout.dimensionRatio = paramTypedArray.getString(k);
        break;
      case 4: 
        paramContext = layout;
        bottomToTop = lookupID(paramTypedArray, k, bottomToTop);
        break;
      case 3: 
        paramContext = layout;
        bottomToBottom = lookupID(paramTypedArray, k, bottomToBottom);
        break;
      case 2: 
        paramContext = layout;
        bottomMargin = paramTypedArray.getDimensionPixelSize(k, bottomMargin);
        break;
      case 1: 
        paramContext = layout;
        baselineToBaseline = lookupID(paramTypedArray, k, baselineToBaseline);
      }
    }
    paramContext = layout;
    if (mReferenceIdString != null) {
      mReferenceIds = null;
    }
  }
  
  private static void populateOverride(Context paramContext, Constraint paramConstraint, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    paramContext = new ConstraintSet.Constraint.Delta();
    mDelta = paramContext;
    motion.mApply = false;
    layout.mApply = false;
    propertySet.mApply = false;
    transform.mApply = false;
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject;
      int m;
      switch (overrideMapToConstant.get(k))
      {
      case 3: 
      case 4: 
      case 9: 
      case 10: 
      case 25: 
      case 26: 
      case 29: 
      case 30: 
      case 32: 
      case 33: 
      case 35: 
      case 36: 
      case 61: 
      case 88: 
      case 89: 
      case 90: 
      case 91: 
      case 92: 
      default: 
        localObject = z2.t("Unknown attribute 0x");
        ((StringBuilder)localObject).append(Integer.toHexString(k));
        ((StringBuilder)localObject).append("   ");
        ((StringBuilder)localObject).append(mapToConstant.get(k));
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
        break;
      case 99: 
        paramContext.add(99, paramTypedArray.getBoolean(k, layout.guidelineUseRtl));
        break;
      case 98: 
        if (MotionLayout.IS_IN_EDIT_MODE)
        {
          m = paramTypedArray.getResourceId(k, mViewId);
          mViewId = m;
          if (m == -1) {
            mTargetString = paramTypedArray.getString(k);
          }
        }
        else if (peekValuetype == 3)
        {
          mTargetString = paramTypedArray.getString(k);
        }
        else
        {
          mViewId = paramTypedArray.getResourceId(k, mViewId);
        }
        break;
      case 97: 
        paramContext.add(97, paramTypedArray.getInt(k, layout.mWrapBehavior));
        break;
      case 96: 
        parseDimensionConstraints(paramContext, paramTypedArray, k, 1);
        break;
      case 95: 
        parseDimensionConstraints(paramContext, paramTypedArray, k, 0);
        break;
      case 94: 
        paramContext.add(94, paramTypedArray.getDimensionPixelSize(k, layout.goneBaselineMargin));
        break;
      case 93: 
        paramContext.add(93, paramTypedArray.getDimensionPixelSize(k, layout.baselineMargin));
        break;
      case 87: 
        localObject = z2.t("unused attribute 0x");
        ((StringBuilder)localObject).append(Integer.toHexString(k));
        ((StringBuilder)localObject).append("   ");
        ((StringBuilder)localObject).append(mapToConstant.get(k));
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
        break;
      case 86: 
        m = peekValuetype;
        if (m == 1)
        {
          motion.mQuantizeInterpolatorID = paramTypedArray.getResourceId(k, -1);
          paramContext.add(89, motion.mQuantizeInterpolatorID);
          localObject = motion;
          if (mQuantizeInterpolatorID != -1)
          {
            mQuantizeInterpolatorType = -2;
            paramContext.add(88, -2);
          }
        }
        else if (m == 3)
        {
          motion.mQuantizeInterpolatorString = paramTypedArray.getString(k);
          paramContext.add(90, motion.mQuantizeInterpolatorString);
          if (motion.mQuantizeInterpolatorString.indexOf("/") > 0)
          {
            motion.mQuantizeInterpolatorID = paramTypedArray.getResourceId(k, -1);
            paramContext.add(89, motion.mQuantizeInterpolatorID);
            motion.mQuantizeInterpolatorType = -2;
            paramContext.add(88, -2);
          }
          else
          {
            motion.mQuantizeInterpolatorType = -1;
            paramContext.add(88, -1);
          }
        }
        else
        {
          localObject = motion;
          mQuantizeInterpolatorType = paramTypedArray.getInteger(k, mQuantizeInterpolatorID);
          paramContext.add(88, motion.mQuantizeInterpolatorType);
        }
        break;
      case 85: 
        paramContext.add(85, paramTypedArray.getFloat(k, motion.mQuantizeMotionPhase));
        break;
      case 84: 
        paramContext.add(84, paramTypedArray.getInteger(k, motion.mQuantizeMotionSteps));
        break;
      case 83: 
        paramContext.add(83, lookupID(paramTypedArray, k, transform.transformPivotTarget));
        break;
      case 82: 
        paramContext.add(82, paramTypedArray.getInteger(k, motion.mAnimateCircleAngleTo));
        break;
      case 81: 
        paramContext.add(81, paramTypedArray.getBoolean(k, layout.constrainedHeight));
        break;
      case 80: 
        paramContext.add(80, paramTypedArray.getBoolean(k, layout.constrainedWidth));
        break;
      case 79: 
        paramContext.add(79, paramTypedArray.getFloat(k, motion.mMotionStagger));
        break;
      case 78: 
        paramContext.add(78, paramTypedArray.getInt(k, propertySet.mVisibilityMode));
        break;
      case 77: 
        paramContext.add(77, paramTypedArray.getString(k));
        break;
      case 76: 
        paramContext.add(76, paramTypedArray.getInt(k, motion.mPathMotionArc));
        break;
      case 75: 
        paramContext.add(75, paramTypedArray.getBoolean(k, layout.mBarrierAllowsGoneWidgets));
        break;
      case 74: 
        paramContext.add(74, paramTypedArray.getString(k));
        break;
      case 73: 
        paramContext.add(73, paramTypedArray.getDimensionPixelSize(k, layout.mBarrierMargin));
        break;
      case 72: 
        paramContext.add(72, paramTypedArray.getInt(k, layout.mBarrierDirection));
        break;
      case 71: 
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        break;
      case 70: 
        paramContext.add(70, paramTypedArray.getFloat(k, 1.0F));
        break;
      case 69: 
        paramContext.add(69, paramTypedArray.getFloat(k, 1.0F));
        break;
      case 68: 
        paramContext.add(68, paramTypedArray.getFloat(k, propertySet.mProgress));
        break;
      case 67: 
        paramContext.add(67, paramTypedArray.getFloat(k, motion.mPathRotate));
        break;
      case 66: 
        paramContext.add(66, paramTypedArray.getInt(k, 0));
        break;
      case 65: 
        if (peekValuetype == 3) {
          paramContext.add(65, paramTypedArray.getString(k));
        } else {
          paramContext.add(65, androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[paramTypedArray.getInteger(k, 0)]);
        }
        break;
      case 64: 
        paramContext.add(64, lookupID(paramTypedArray, k, motion.mAnimateRelativeTo));
        break;
      case 63: 
        paramContext.add(63, paramTypedArray.getFloat(k, layout.circleAngle));
        break;
      case 62: 
        paramContext.add(62, paramTypedArray.getDimensionPixelSize(k, layout.circleRadius));
        break;
      case 60: 
        paramContext.add(60, paramTypedArray.getFloat(k, transform.rotation));
        break;
      case 59: 
        paramContext.add(59, paramTypedArray.getDimensionPixelSize(k, layout.heightMin));
        break;
      case 58: 
        paramContext.add(58, paramTypedArray.getDimensionPixelSize(k, layout.widthMin));
        break;
      case 57: 
        paramContext.add(57, paramTypedArray.getDimensionPixelSize(k, layout.heightMax));
        break;
      case 56: 
        paramContext.add(56, paramTypedArray.getDimensionPixelSize(k, layout.widthMax));
        break;
      case 55: 
        paramContext.add(55, paramTypedArray.getInt(k, layout.heightDefault));
        break;
      case 54: 
        paramContext.add(54, paramTypedArray.getInt(k, layout.widthDefault));
        break;
      case 53: 
        paramContext.add(53, paramTypedArray.getDimension(k, transform.translationZ));
        break;
      case 52: 
        paramContext.add(52, paramTypedArray.getDimension(k, transform.translationY));
        break;
      case 51: 
        paramContext.add(51, paramTypedArray.getDimension(k, transform.translationX));
        break;
      case 50: 
        paramContext.add(50, paramTypedArray.getDimension(k, transform.transformPivotY));
        break;
      case 49: 
        paramContext.add(49, paramTypedArray.getDimension(k, transform.transformPivotX));
        break;
      case 48: 
        paramContext.add(48, paramTypedArray.getFloat(k, transform.scaleY));
        break;
      case 47: 
        paramContext.add(47, paramTypedArray.getFloat(k, transform.scaleX));
        break;
      case 46: 
        paramContext.add(46, paramTypedArray.getFloat(k, transform.rotationY));
        break;
      case 45: 
        paramContext.add(45, paramTypedArray.getFloat(k, transform.rotationX));
        break;
      case 44: 
        paramContext.add(44, true);
        paramContext.add(44, paramTypedArray.getDimension(k, transform.elevation));
        break;
      case 43: 
        paramContext.add(43, paramTypedArray.getFloat(k, propertySet.alpha));
        break;
      case 42: 
        paramContext.add(42, paramTypedArray.getInt(k, layout.verticalChainStyle));
        break;
      case 41: 
        paramContext.add(41, paramTypedArray.getInt(k, layout.horizontalChainStyle));
        break;
      case 40: 
        paramContext.add(40, paramTypedArray.getFloat(k, layout.verticalWeight));
        break;
      case 39: 
        paramContext.add(39, paramTypedArray.getFloat(k, layout.horizontalWeight));
        break;
      case 38: 
        k = paramTypedArray.getResourceId(k, mViewId);
        mViewId = k;
        paramContext.add(38, k);
        break;
      case 37: 
        paramContext.add(37, paramTypedArray.getFloat(k, layout.verticalBias));
        break;
      case 34: 
        paramContext.add(34, paramTypedArray.getDimensionPixelSize(k, layout.topMargin));
        break;
      case 31: 
        paramContext.add(31, paramTypedArray.getDimensionPixelSize(k, layout.startMargin));
        break;
      case 28: 
        paramContext.add(28, paramTypedArray.getDimensionPixelSize(k, layout.rightMargin));
        break;
      case 27: 
        paramContext.add(27, paramTypedArray.getInt(k, layout.orientation));
        break;
      case 24: 
        paramContext.add(24, paramTypedArray.getDimensionPixelSize(k, layout.leftMargin));
        break;
      case 23: 
        paramContext.add(23, paramTypedArray.getLayoutDimension(k, layout.mWidth));
        break;
      case 22: 
        paramContext.add(22, VISIBILITY_FLAGS[paramTypedArray.getInt(k, propertySet.visibility)]);
        break;
      case 21: 
        paramContext.add(21, paramTypedArray.getLayoutDimension(k, layout.mHeight));
        break;
      case 20: 
        paramContext.add(20, paramTypedArray.getFloat(k, layout.horizontalBias));
        break;
      case 19: 
        paramContext.add(19, paramTypedArray.getFloat(k, layout.guidePercent));
        break;
      case 18: 
        paramContext.add(18, paramTypedArray.getDimensionPixelOffset(k, layout.guideEnd));
        break;
      case 17: 
        paramContext.add(17, paramTypedArray.getDimensionPixelOffset(k, layout.guideBegin));
        break;
      case 16: 
        paramContext.add(16, paramTypedArray.getDimensionPixelSize(k, layout.goneTopMargin));
        break;
      case 15: 
        paramContext.add(15, paramTypedArray.getDimensionPixelSize(k, layout.goneStartMargin));
        break;
      case 14: 
        paramContext.add(14, paramTypedArray.getDimensionPixelSize(k, layout.goneRightMargin));
        break;
      case 13: 
        paramContext.add(13, paramTypedArray.getDimensionPixelSize(k, layout.goneLeftMargin));
        break;
      case 12: 
        paramContext.add(12, paramTypedArray.getDimensionPixelSize(k, layout.goneEndMargin));
        break;
      case 11: 
        paramContext.add(11, paramTypedArray.getDimensionPixelSize(k, layout.goneBottomMargin));
        break;
      case 8: 
        paramContext.add(8, paramTypedArray.getDimensionPixelSize(k, layout.endMargin));
        break;
      case 7: 
        paramContext.add(7, paramTypedArray.getDimensionPixelOffset(k, layout.editorAbsoluteY));
        break;
      case 6: 
        paramContext.add(6, paramTypedArray.getDimensionPixelOffset(k, layout.editorAbsoluteX));
        break;
      case 5: 
        paramContext.add(5, paramTypedArray.getString(k));
        break;
      case 2: 
        paramContext.add(2, paramTypedArray.getDimensionPixelSize(k, layout.bottomMargin));
      }
    }
  }
  
  private static void setDeltaValue(Constraint paramConstraint, int paramInt, float paramFloat)
  {
    if (paramInt != 19)
    {
      if (paramInt != 20)
      {
        if (paramInt != 37)
        {
          if (paramInt != 60)
          {
            if (paramInt != 63)
            {
              if (paramInt != 79)
              {
                if (paramInt != 85)
                {
                  if (paramInt != 87) {
                    if (paramInt != 39)
                    {
                      if (paramInt != 40) {
                        switch (paramInt)
                        {
                        default: 
                          switch (paramInt)
                          {
                          default: 
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                          case 70: 
                            layout.heightPercent = paramFloat;
                            break;
                          case 69: 
                            layout.widthPercent = paramFloat;
                            break;
                          case 68: 
                            propertySet.mProgress = paramFloat;
                            break;
                          case 67: 
                            motion.mPathRotate = paramFloat;
                          }
                          break;
                        case 53: 
                          transform.translationZ = paramFloat;
                          break;
                        case 52: 
                          transform.translationY = paramFloat;
                          break;
                        case 51: 
                          transform.translationX = paramFloat;
                          break;
                        case 50: 
                          transform.transformPivotY = paramFloat;
                          break;
                        case 49: 
                          transform.transformPivotX = paramFloat;
                          break;
                        case 48: 
                          transform.scaleY = paramFloat;
                          break;
                        case 47: 
                          transform.scaleX = paramFloat;
                          break;
                        case 46: 
                          transform.rotationY = paramFloat;
                          break;
                        case 45: 
                          transform.rotationX = paramFloat;
                          break;
                        case 44: 
                          paramConstraint = transform;
                          elevation = paramFloat;
                          applyElevation = true;
                          break;
                        case 43: 
                          propertySet.alpha = paramFloat;
                          break;
                        }
                      } else {
                        layout.verticalWeight = paramFloat;
                      }
                    }
                    else {
                      layout.horizontalWeight = paramFloat;
                    }
                  }
                }
                else {
                  motion.mQuantizeMotionPhase = paramFloat;
                }
              }
              else {
                motion.mMotionStagger = paramFloat;
              }
            }
            else {
              layout.circleAngle = paramFloat;
            }
          }
          else {
            transform.rotation = paramFloat;
          }
        }
        else {
          layout.verticalBias = paramFloat;
        }
      }
      else {
        layout.horizontalBias = paramFloat;
      }
    }
    else {
      layout.guidePercent = paramFloat;
    }
  }
  
  private static void setDeltaValue(Constraint paramConstraint, int paramInt1, int paramInt2)
  {
    if (paramInt1 != 6)
    {
      if (paramInt1 != 7)
      {
        if (paramInt1 != 8)
        {
          if (paramInt1 != 27)
          {
            if (paramInt1 != 28)
            {
              if (paramInt1 != 41)
              {
                if (paramInt1 != 42)
                {
                  if (paramInt1 != 61)
                  {
                    if (paramInt1 != 62)
                    {
                      if (paramInt1 != 72)
                      {
                        if (paramInt1 != 73) {
                          switch (paramInt1)
                          {
                          default: 
                            switch (paramInt1)
                            {
                            default: 
                              switch (paramInt1)
                              {
                              default: 
                                switch (paramInt1)
                                {
                                default: 
                                  switch (paramInt1)
                                  {
                                  default: 
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                                  case 89: 
                                    motion.mQuantizeInterpolatorID = paramInt2;
                                    break;
                                  case 88: 
                                    motion.mQuantizeInterpolatorType = paramInt2;
                                  }
                                  break;
                                case 84: 
                                  motion.mQuantizeMotionSteps = paramInt2;
                                  break;
                                case 83: 
                                  transform.transformPivotTarget = paramInt2;
                                  break;
                                case 82: 
                                  motion.mAnimateCircleAngleTo = paramInt2;
                                }
                                break;
                              case 59: 
                                layout.heightMin = paramInt2;
                                break;
                              case 58: 
                                layout.widthMin = paramInt2;
                                break;
                              case 57: 
                                layout.heightMax = paramInt2;
                                break;
                              case 56: 
                                layout.widthMax = paramInt2;
                                break;
                              case 55: 
                                layout.heightDefault = paramInt2;
                                break;
                              case 54: 
                                layout.widthDefault = paramInt2;
                              }
                              break;
                            case 24: 
                              layout.leftMargin = paramInt2;
                              break;
                            case 23: 
                              layout.mWidth = paramInt2;
                              break;
                            case 22: 
                              propertySet.visibility = paramInt2;
                              break;
                            case 21: 
                              layout.mHeight = paramInt2;
                            }
                            break;
                          case 97: 
                            layout.mWrapBehavior = paramInt2;
                            break;
                          case 94: 
                            layout.goneBaselineMargin = paramInt2;
                            break;
                          case 93: 
                            layout.baselineMargin = paramInt2;
                            break;
                          case 78: 
                            propertySet.mVisibilityMode = paramInt2;
                            break;
                          case 76: 
                            motion.mPathMotionArc = paramInt2;
                            break;
                          case 66: 
                            motion.mDrawPath = paramInt2;
                            break;
                          case 64: 
                            motion.mAnimateRelativeTo = paramInt2;
                            break;
                          case 38: 
                            mViewId = paramInt2;
                            break;
                          case 34: 
                            layout.topMargin = paramInt2;
                            break;
                          case 31: 
                            layout.startMargin = paramInt2;
                            break;
                          case 18: 
                            layout.guideEnd = paramInt2;
                            break;
                          case 17: 
                            layout.guideBegin = paramInt2;
                            break;
                          case 16: 
                            layout.goneTopMargin = paramInt2;
                            break;
                          case 15: 
                            layout.goneStartMargin = paramInt2;
                            break;
                          case 14: 
                            layout.goneRightMargin = paramInt2;
                            break;
                          case 13: 
                            layout.goneLeftMargin = paramInt2;
                            break;
                          case 12: 
                            layout.goneEndMargin = paramInt2;
                            break;
                          case 11: 
                            layout.goneBottomMargin = paramInt2;
                            break;
                          case 2: 
                            layout.bottomMargin = paramInt2;
                            break;
                          }
                        } else {
                          layout.mBarrierMargin = paramInt2;
                        }
                      }
                      else {
                        layout.mBarrierDirection = paramInt2;
                      }
                    }
                    else {
                      layout.circleRadius = paramInt2;
                    }
                  }
                  else {
                    layout.circleConstraint = paramInt2;
                  }
                }
                else {
                  layout.verticalChainStyle = paramInt2;
                }
              }
              else {
                layout.horizontalChainStyle = paramInt2;
              }
            }
            else {
              layout.rightMargin = paramInt2;
            }
          }
          else {
            layout.orientation = paramInt2;
          }
        }
        else {
          layout.endMargin = paramInt2;
        }
      }
      else {
        layout.editorAbsoluteY = paramInt2;
      }
    }
    else {
      layout.editorAbsoluteX = paramInt2;
    }
  }
  
  private static void setDeltaValue(Constraint paramConstraint, int paramInt, String paramString)
  {
    if (paramInt != 5)
    {
      if (paramInt != 65)
      {
        if (paramInt != 74)
        {
          if (paramInt != 77)
          {
            if (paramInt != 87) {
              if (paramInt != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
              } else {
                motion.mQuantizeInterpolatorString = paramString;
              }
            }
          }
          else {
            layout.mConstraintTag = paramString;
          }
        }
        else
        {
          paramConstraint = layout;
          mReferenceIdString = paramString;
          mReferenceIds = null;
        }
      }
      else {
        motion.mTransitionEasing = paramString;
      }
    }
    else {
      layout.dimensionRatio = paramString;
    }
  }
  
  private static void setDeltaValue(Constraint paramConstraint, int paramInt, boolean paramBoolean)
  {
    if (paramInt != 44)
    {
      if (paramInt != 75)
      {
        if (paramInt != 87) {
          if (paramInt != 80)
          {
            if (paramInt != 81) {
              Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
              layout.constrainedHeight = paramBoolean;
            }
          }
          else {
            layout.constrainedWidth = paramBoolean;
          }
        }
      }
      else {
        layout.mBarrierAllowsGoneWidgets = paramBoolean;
      }
    }
    else {
      transform.applyElevation = paramBoolean;
    }
  }
  
  private String sideToString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "undefined";
    case 7: 
      return "end";
    case 6: 
      return "start";
    case 5: 
      return "baseline";
    case 4: 
      return "bottom";
    case 3: 
      return "top";
    case 2: 
      return "right";
    }
    return "left";
  }
  
  private static String[] splitString(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    paramString = new ArrayList();
    int i = 0;
    int j = 0;
    int i1;
    for (int k = j; i < arrayOfChar.length; k = i1)
    {
      int m = arrayOfChar[i];
      int n;
      if ((m == 44) && (k == 0))
      {
        paramString.add(new String(arrayOfChar, j, i - j));
        n = i + 1;
        i1 = k;
      }
      else
      {
        n = j;
        i1 = k;
        if (m == 34)
        {
          i1 = k ^ 0x1;
          n = j;
        }
      }
      i++;
      j = n;
    }
    paramString.add(new String(arrayOfChar, j, arrayOfChar.length - j));
    return (String[])paramString.toArray(new String[paramString.size()]);
  }
  
  public void addColorAttributes(String... paramVarArgs)
  {
    addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, paramVarArgs);
  }
  
  public void addFloatAttributes(String... paramVarArgs)
  {
    addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, paramVarArgs);
  }
  
  public void addIntAttributes(String... paramVarArgs)
  {
    addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, paramVarArgs);
  }
  
  public void addStringAttributes(String... paramVarArgs)
  {
    addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, paramVarArgs);
  }
  
  public void addToHorizontalChain(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt2 == 0) {
      i = 1;
    } else {
      i = 2;
    }
    connect(paramInt1, 1, paramInt2, i, 0);
    if (paramInt3 == 0) {
      i = 2;
    } else {
      i = 1;
    }
    connect(paramInt1, 2, paramInt3, i, 0);
    if (paramInt2 != 0) {
      connect(paramInt2, 2, paramInt1, 1, 0);
    }
    if (paramInt3 != 0) {
      connect(paramInt3, 1, paramInt1, 2, 0);
    }
  }
  
  public void addToHorizontalChainRTL(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt2 == 0) {
      i = 6;
    } else {
      i = 7;
    }
    connect(paramInt1, 6, paramInt2, i, 0);
    if (paramInt3 == 0) {
      i = 7;
    } else {
      i = 6;
    }
    connect(paramInt1, 7, paramInt3, i, 0);
    if (paramInt2 != 0) {
      connect(paramInt2, 7, paramInt1, 6, 0);
    }
    if (paramInt3 != 0) {
      connect(paramInt3, 6, paramInt1, 7, 0);
    }
  }
  
  public void addToVerticalChain(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (paramInt2 == 0) {
      i = 3;
    } else {
      i = 4;
    }
    connect(paramInt1, 3, paramInt2, i, 0);
    if (paramInt3 == 0) {
      i = 4;
    } else {
      i = 3;
    }
    connect(paramInt1, 4, paramInt3, i, 0);
    if (paramInt2 != 0) {
      connect(paramInt2, 4, paramInt1, 3, 0);
    }
    if (paramInt3 != 0) {
      connect(paramInt3, 3, paramInt1, 4, 0);
    }
  }
  
  public void applyCustomAttributes(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramConstraintLayout.getChildAt(j);
      int k = localView.getId();
      Object localObject;
      if (!mConstraints.containsKey(Integer.valueOf(k)))
      {
        localObject = z2.t("id unknown ");
        ((StringBuilder)localObject).append(Debug.getName(localView));
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
      }
      else
      {
        if ((mForceId) && (k == -1)) {
          throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
        }
        if (mConstraints.containsKey(Integer.valueOf(k)))
        {
          localObject = (Constraint)mConstraints.get(Integer.valueOf(k));
          if (localObject != null) {
            ConstraintAttribute.setAttributes(localView, mCustomConstraints);
          }
        }
      }
    }
  }
  
  public void applyDeltaFrom(ConstraintSet paramConstraintSet)
  {
    paramConstraintSet = mConstraints.values().iterator();
    while (paramConstraintSet.hasNext())
    {
      Constraint localConstraint1 = (Constraint)paramConstraintSet.next();
      if (mDelta != null)
      {
        Object localObject;
        if (mTargetString != null)
        {
          localObject = mConstraints.keySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            Constraint localConstraint2 = getConstraint(((Integer)((Iterator)localObject).next()).intValue());
            String str = layout.mConstraintTag;
            if ((str != null) && (mTargetString.matches(str)))
            {
              mDelta.applyDelta(localConstraint2);
              mCustomConstraints.putAll((HashMap)mCustomConstraints.clone());
            }
          }
        }
        else
        {
          localObject = getConstraint(mViewId);
          mDelta.applyDelta((Constraint)localObject);
        }
      }
    }
  }
  
  public void applyTo(ConstraintLayout paramConstraintLayout)
  {
    applyToInternal(paramConstraintLayout, true);
    paramConstraintLayout.setConstraintSet(null);
    paramConstraintLayout.requestLayout();
  }
  
  public void applyToHelper(ConstraintHelper paramConstraintHelper, ConstraintWidget paramConstraintWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray)
  {
    int i = paramConstraintHelper.getId();
    if (mConstraints.containsKey(Integer.valueOf(i)))
    {
      Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(i));
      if ((localConstraint != null) && ((paramConstraintWidget instanceof HelperWidget))) {
        paramConstraintHelper.loadParameters(localConstraint, (HelperWidget)paramConstraintWidget, paramLayoutParams, paramSparseArray);
      }
    }
  }
  
  public void applyToInternal(ConstraintLayout paramConstraintLayout, boolean paramBoolean)
  {
    int i = paramConstraintLayout.getChildCount();
    Object localObject1 = new HashSet(mConstraints.keySet());
    int j = 0;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    for (int k = 0; k < i; k++)
    {
      localObject2 = paramConstraintLayout.getChildAt(k);
      int m = ((View)localObject2).getId();
      if (!mConstraints.containsKey(Integer.valueOf(m)))
      {
        localObject3 = z2.t("id unknown ");
        ((StringBuilder)localObject3).append(Debug.getName((View)localObject2));
        Log.w("ConstraintSet", ((StringBuilder)localObject3).toString());
      }
      else
      {
        if ((mForceId) && (m == -1)) {
          throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
        }
        if (m != -1) {
          if (mConstraints.containsKey(Integer.valueOf(m)))
          {
            ((HashSet)localObject1).remove(Integer.valueOf(m));
            localObject3 = (Constraint)mConstraints.get(Integer.valueOf(m));
            if (localObject3 != null)
            {
              if ((localObject2 instanceof Barrier))
              {
                layout.mHelperType = 1;
                localObject4 = (Barrier)localObject2;
                ((View)localObject4).setId(m);
                ((Barrier)localObject4).setType(layout.mBarrierDirection);
                ((Barrier)localObject4).setMargin(layout.mBarrierMargin);
                ((Barrier)localObject4).setAllowsGoneWidget(layout.mBarrierAllowsGoneWidgets);
                localObject5 = layout;
                localObject6 = mReferenceIds;
                if (localObject6 != null)
                {
                  ((ConstraintHelper)localObject4).setReferencedIds((int[])localObject6);
                }
                else
                {
                  localObject6 = mReferenceIdString;
                  if (localObject6 != null)
                  {
                    mReferenceIds = convertReferenceString((View)localObject4, (String)localObject6);
                    ((ConstraintHelper)localObject4).setReferencedIds(layout.mReferenceIds);
                  }
                }
              }
              localObject5 = (ConstraintLayout.LayoutParams)((View)localObject2).getLayoutParams();
              ((ConstraintLayout.LayoutParams)localObject5).validate();
              ((Constraint)localObject3).applyTo((ConstraintLayout.LayoutParams)localObject5);
              if (paramBoolean) {
                ConstraintAttribute.setAttributes((View)localObject2, mCustomConstraints);
              }
              ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject5);
              localObject5 = propertySet;
              if (mVisibilityMode == 0) {
                ((View)localObject2).setVisibility(visibility);
              }
              ((View)localObject2).setAlpha(propertySet.alpha);
              ((View)localObject2).setRotation(transform.rotation);
              ((View)localObject2).setRotationX(transform.rotationX);
              ((View)localObject2).setRotationY(transform.rotationY);
              ((View)localObject2).setScaleX(transform.scaleX);
              ((View)localObject2).setScaleY(transform.scaleY);
              localObject5 = transform;
              if (transformPivotTarget != -1)
              {
                localObject5 = ((View)((View)localObject2).getParent()).findViewById(transform.transformPivotTarget);
                if (localObject5 != null)
                {
                  m = ((View)localObject5).getTop();
                  float f1 = (((View)localObject5).getBottom() + m) / 2.0F;
                  m = ((View)localObject5).getLeft();
                  float f2 = (((View)localObject5).getRight() + m) / 2.0F;
                  if ((((View)localObject2).getRight() - ((View)localObject2).getLeft() > 0) && (((View)localObject2).getBottom() - ((View)localObject2).getTop() > 0))
                  {
                    float f3 = ((View)localObject2).getLeft();
                    float f4 = ((View)localObject2).getTop();
                    ((View)localObject2).setPivotX(f2 - f3);
                    ((View)localObject2).setPivotY(f1 - f4);
                  }
                }
              }
              else
              {
                if (!Float.isNaN(transformPivotX)) {
                  ((View)localObject2).setPivotX(transform.transformPivotX);
                }
                if (!Float.isNaN(transform.transformPivotY)) {
                  ((View)localObject2).setPivotY(transform.transformPivotY);
                }
              }
              ((View)localObject2).setTranslationX(transform.translationX);
              ((View)localObject2).setTranslationY(transform.translationY);
              ((View)localObject2).setTranslationZ(transform.translationZ);
              localObject3 = transform;
              if (applyElevation) {
                ((View)localObject2).setElevation(elevation);
              }
            }
          }
          else
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("WARNING NO CONSTRAINTS for view ");
            ((StringBuilder)localObject2).append(m);
            Log.v("ConstraintSet", ((StringBuilder)localObject2).toString());
          }
        }
      }
    }
    Object localObject2 = ((HashSet)localObject1).iterator();
    for (;;)
    {
      k = j;
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      localObject3 = (Integer)((Iterator)localObject2).next();
      localObject1 = (Constraint)mConstraints.get(localObject3);
      if (localObject1 != null)
      {
        if (layout.mHelperType == 1)
        {
          localObject5 = new Barrier(paramConstraintLayout.getContext());
          ((View)localObject5).setId(((Integer)localObject3).intValue());
          localObject4 = layout;
          localObject6 = mReferenceIds;
          if (localObject6 != null)
          {
            ((ConstraintHelper)localObject5).setReferencedIds((int[])localObject6);
          }
          else
          {
            localObject6 = mReferenceIdString;
            if (localObject6 != null)
            {
              mReferenceIds = convertReferenceString((View)localObject5, (String)localObject6);
              ((ConstraintHelper)localObject5).setReferencedIds(layout.mReferenceIds);
            }
          }
          ((Barrier)localObject5).setType(layout.mBarrierDirection);
          ((Barrier)localObject5).setMargin(layout.mBarrierMargin);
          localObject4 = paramConstraintLayout.generateDefaultLayoutParams();
          ((ConstraintHelper)localObject5).validateParams();
          ((Constraint)localObject1).applyTo((ConstraintLayout.LayoutParams)localObject4);
          paramConstraintLayout.addView((View)localObject5, (ViewGroup.LayoutParams)localObject4);
        }
        if (layout.mIsGuideline)
        {
          localObject5 = new Guideline(paramConstraintLayout.getContext());
          ((View)localObject5).setId(((Integer)localObject3).intValue());
          localObject3 = paramConstraintLayout.generateDefaultLayoutParams();
          ((Constraint)localObject1).applyTo((ConstraintLayout.LayoutParams)localObject3);
          paramConstraintLayout.addView((View)localObject5, (ViewGroup.LayoutParams)localObject3);
        }
      }
    }
    while (k < i)
    {
      localObject1 = paramConstraintLayout.getChildAt(k);
      if ((localObject1 instanceof ConstraintHelper)) {
        ((ConstraintHelper)localObject1).applyLayoutFeaturesInConstraintSet(paramConstraintLayout);
      }
      k++;
    }
  }
  
  public void applyToLayoutParams(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams)
  {
    if (mConstraints.containsKey(Integer.valueOf(paramInt)))
    {
      Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt));
      if (localConstraint != null) {
        localConstraint.applyTo(paramLayoutParams);
      }
    }
  }
  
  public void applyToWithoutCustom(ConstraintLayout paramConstraintLayout)
  {
    applyToInternal(paramConstraintLayout, false);
    paramConstraintLayout.setConstraintSet(null);
  }
  
  public void center(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat)
  {
    if (paramInt4 >= 0)
    {
      if (paramInt7 >= 0)
      {
        if ((paramFloat > 0.0F) && (paramFloat <= 1.0F))
        {
          Constraint localConstraint;
          if ((paramInt3 != 1) && (paramInt3 != 2))
          {
            if ((paramInt3 != 6) && (paramInt3 != 7))
            {
              connect(paramInt1, 3, paramInt2, paramInt3, paramInt4);
              connect(paramInt1, 4, paramInt5, paramInt6, paramInt7);
              localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
              if (localConstraint != null) {
                layout.verticalBias = paramFloat;
              }
            }
            else
            {
              connect(paramInt1, 6, paramInt2, paramInt3, paramInt4);
              connect(paramInt1, 7, paramInt5, paramInt6, paramInt7);
              localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
              if (localConstraint != null) {
                layout.horizontalBias = paramFloat;
              }
            }
          }
          else
          {
            connect(paramInt1, 1, paramInt2, paramInt3, paramInt4);
            connect(paramInt1, 2, paramInt5, paramInt6, paramInt7);
            localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
            if (localConstraint != null) {
              layout.horizontalBias = paramFloat;
            }
          }
          return;
        }
        throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
      }
      throw new IllegalArgumentException("margin must be > 0");
    }
    throw new IllegalArgumentException("margin must be > 0");
  }
  
  public void centerHorizontally(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      center(paramInt1, 0, 1, 0, 0, 2, 0, 0.5F);
    } else {
      center(paramInt1, paramInt2, 2, 0, paramInt2, 1, 0, 0.5F);
    }
  }
  
  public void centerHorizontally(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat)
  {
    connect(paramInt1, 1, paramInt2, paramInt3, paramInt4);
    connect(paramInt1, 2, paramInt5, paramInt6, paramInt7);
    Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
    if (localConstraint != null) {
      layout.horizontalBias = paramFloat;
    }
  }
  
  public void centerHorizontallyRtl(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      center(paramInt1, 0, 6, 0, 0, 7, 0, 0.5F);
    } else {
      center(paramInt1, paramInt2, 7, 0, paramInt2, 6, 0, 0.5F);
    }
  }
  
  public void centerHorizontallyRtl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat)
  {
    connect(paramInt1, 6, paramInt2, paramInt3, paramInt4);
    connect(paramInt1, 7, paramInt5, paramInt6, paramInt7);
    Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
    if (localConstraint != null) {
      layout.horizontalBias = paramFloat;
    }
  }
  
  public void centerVertically(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      center(paramInt1, 0, 3, 0, 0, 4, 0, 0.5F);
    } else {
      center(paramInt1, paramInt2, 4, 0, paramInt2, 3, 0, 0.5F);
    }
  }
  
  public void centerVertically(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat)
  {
    connect(paramInt1, 3, paramInt2, paramInt3, paramInt4);
    connect(paramInt1, 4, paramInt5, paramInt6, paramInt7);
    Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
    if (localConstraint != null) {
      layout.verticalBias = paramFloat;
    }
  }
  
  public void clear(int paramInt)
  {
    mConstraints.remove(Integer.valueOf(paramInt));
  }
  
  public void clear(int paramInt1, int paramInt2)
  {
    if (mConstraints.containsKey(Integer.valueOf(paramInt1)))
    {
      Object localObject = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
      if (localObject == null) {
        return;
      }
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException("unknown constraint");
      case 8: 
        localObject = layout;
        circleAngle = -1.0F;
        circleRadius = -1;
        circleConstraint = -1;
        break;
      case 7: 
        localObject = layout;
        endToStart = -1;
        endToEnd = -1;
        endMargin = 0;
        goneEndMargin = Integer.MIN_VALUE;
        break;
      case 6: 
        localObject = layout;
        startToEnd = -1;
        startToStart = -1;
        startMargin = 0;
        goneStartMargin = Integer.MIN_VALUE;
        break;
      case 5: 
        localObject = layout;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
        baselineMargin = 0;
        goneBaselineMargin = Integer.MIN_VALUE;
        break;
      case 4: 
        localObject = layout;
        bottomToTop = -1;
        bottomToBottom = -1;
        bottomMargin = 0;
        goneBottomMargin = Integer.MIN_VALUE;
        break;
      case 3: 
        localObject = layout;
        topToBottom = -1;
        topToTop = -1;
        topMargin = 0;
        goneTopMargin = Integer.MIN_VALUE;
        break;
      case 2: 
        localObject = layout;
        rightToRight = -1;
        rightToLeft = -1;
        rightMargin = -1;
        goneRightMargin = Integer.MIN_VALUE;
        break;
      case 1: 
        localObject = layout;
        leftToRight = -1;
        leftToLeft = -1;
        leftMargin = -1;
        goneLeftMargin = Integer.MIN_VALUE;
      }
    }
  }
  
  public void clone(Context paramContext, int paramInt)
  {
    clone((ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null));
  }
  
  public void clone(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    mConstraints.clear();
    for (int j = 0; j < i; j++)
    {
      Object localObject1 = paramConstraintLayout.getChildAt(j);
      Object localObject2 = (ConstraintLayout.LayoutParams)((View)localObject1).getLayoutParams();
      int k = ((View)localObject1).getId();
      if ((mForceId) && (k == -1)) {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
      if (!mConstraints.containsKey(Integer.valueOf(k))) {
        mConstraints.put(Integer.valueOf(k), new Constraint());
      }
      Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(k));
      if (localConstraint != null)
      {
        mCustomConstraints = ConstraintAttribute.extractAttributes(mSavedAttributes, (View)localObject1);
        Constraint.access$000(localConstraint, k, (ConstraintLayout.LayoutParams)localObject2);
        propertySet.visibility = ((View)localObject1).getVisibility();
        propertySet.alpha = ((View)localObject1).getAlpha();
        transform.rotation = ((View)localObject1).getRotation();
        transform.rotationX = ((View)localObject1).getRotationX();
        transform.rotationY = ((View)localObject1).getRotationY();
        transform.scaleX = ((View)localObject1).getScaleX();
        transform.scaleY = ((View)localObject1).getScaleY();
        float f1 = ((View)localObject1).getPivotX();
        float f2 = ((View)localObject1).getPivotY();
        if ((f1 != 0.0D) || (f2 != 0.0D))
        {
          localObject2 = transform;
          transformPivotX = f1;
          transformPivotY = f2;
        }
        transform.translationX = ((View)localObject1).getTranslationX();
        transform.translationY = ((View)localObject1).getTranslationY();
        transform.translationZ = ((View)localObject1).getTranslationZ();
        localObject2 = transform;
        if (applyElevation) {
          elevation = ((View)localObject1).getElevation();
        }
        if ((localObject1 instanceof Barrier))
        {
          localObject1 = (Barrier)localObject1;
          layout.mBarrierAllowsGoneWidgets = ((Barrier)localObject1).getAllowsGoneWidget();
          layout.mReferenceIds = ((ConstraintHelper)localObject1).getReferencedIds();
          layout.mBarrierDirection = ((Barrier)localObject1).getType();
          layout.mBarrierMargin = ((Barrier)localObject1).getMargin();
        }
      }
    }
  }
  
  public void clone(ConstraintSet paramConstraintSet)
  {
    mConstraints.clear();
    Iterator localIterator = mConstraints.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      Constraint localConstraint = (Constraint)mConstraints.get(localInteger);
      if (localConstraint != null) {
        mConstraints.put(localInteger, localConstraint.clone());
      }
    }
  }
  
  public void clone(Constraints paramConstraints)
  {
    int i = paramConstraints.getChildCount();
    mConstraints.clear();
    for (int j = 0; j < i; j++)
    {
      View localView = paramConstraints.getChildAt(j);
      Constraints.LayoutParams localLayoutParams = (Constraints.LayoutParams)localView.getLayoutParams();
      int k = localView.getId();
      if ((mForceId) && (k == -1)) {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
      if (!mConstraints.containsKey(Integer.valueOf(k))) {
        mConstraints.put(Integer.valueOf(k), new Constraint());
      }
      Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(k));
      if (localConstraint != null)
      {
        if ((localView instanceof ConstraintHelper)) {
          Constraint.access$700(localConstraint, (ConstraintHelper)localView, k, localLayoutParams);
        }
        Constraint.access$800(localConstraint, k, localLayoutParams);
      }
    }
  }
  
  public void connect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mConstraints.containsKey(Integer.valueOf(paramInt1))) {
      mConstraints.put(Integer.valueOf(paramInt1), new Constraint());
    }
    Object localObject = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
    if (localObject == null) {
      return;
    }
    switch (paramInt2)
    {
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(sideToString(paramInt2));
      ((StringBuilder)localObject).append(" to ");
      throw new IllegalArgumentException(z2.s((StringBuilder)localObject, sideToString(paramInt4), " unknown"));
    case 7: 
      if (paramInt4 == 7)
      {
        localObject = layout;
        endToEnd = paramInt3;
        endToStart = -1;
      }
      else if (paramInt4 == 6)
      {
        localObject = layout;
        endToStart = paramInt3;
        endToEnd = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 6: 
      if (paramInt4 == 6)
      {
        localObject = layout;
        startToStart = paramInt3;
        startToEnd = -1;
      }
      else if (paramInt4 == 7)
      {
        localObject = layout;
        startToEnd = paramInt3;
        startToStart = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 5: 
      if (paramInt4 == 5)
      {
        localObject = layout;
        baselineToBaseline = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else if (paramInt4 == 3)
      {
        localObject = layout;
        baselineToTop = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else if (paramInt4 == 4)
      {
        localObject = layout;
        baselineToBottom = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 4: 
      if (paramInt4 == 4)
      {
        localObject = layout;
        bottomToBottom = paramInt3;
        bottomToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else if (paramInt4 == 3)
      {
        localObject = layout;
        bottomToTop = paramInt3;
        bottomToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 3: 
      if (paramInt4 == 3)
      {
        localObject = layout;
        topToTop = paramInt3;
        topToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else if (paramInt4 == 4)
      {
        localObject = layout;
        topToBottom = paramInt3;
        topToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 2: 
      if (paramInt4 == 1)
      {
        localObject = layout;
        rightToLeft = paramInt3;
        rightToRight = -1;
      }
      else if (paramInt4 == 2)
      {
        localObject = layout;
        rightToRight = paramInt3;
        rightToLeft = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 1: 
      if (paramInt4 == 1)
      {
        localObject = layout;
        leftToLeft = paramInt3;
        leftToRight = -1;
      }
      else
      {
        if (paramInt4 != 2) {
          break label855;
        }
        localObject = layout;
        leftToRight = paramInt3;
        leftToLeft = -1;
      }
      break;
    }
    return;
    label855:
    throw new IllegalArgumentException(z2.s(z2.t("left to "), sideToString(paramInt4), " undefined"));
  }
  
  public void connect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (!mConstraints.containsKey(Integer.valueOf(paramInt1))) {
      mConstraints.put(Integer.valueOf(paramInt1), new Constraint());
    }
    Object localObject = (Constraint)mConstraints.get(Integer.valueOf(paramInt1));
    if (localObject == null) {
      return;
    }
    Layout localLayout;
    switch (paramInt2)
    {
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(sideToString(paramInt2));
      ((StringBuilder)localObject).append(" to ");
      throw new IllegalArgumentException(z2.s((StringBuilder)localObject, sideToString(paramInt4), " unknown"));
    case 7: 
      if (paramInt4 == 7)
      {
        localLayout = layout;
        endToEnd = paramInt3;
        endToStart = -1;
      }
      else
      {
        if (paramInt4 != 6) {
          break label219;
        }
        localLayout = layout;
        endToStart = paramInt3;
        endToEnd = -1;
      }
      layout.endMargin = paramInt5;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
    case 6: 
      if (paramInt4 == 6)
      {
        localLayout = layout;
        startToStart = paramInt3;
        startToEnd = -1;
      }
      else
      {
        if (paramInt4 != 7) {
          break label313;
        }
        localLayout = layout;
        startToEnd = paramInt3;
        startToStart = -1;
      }
      layout.startMargin = paramInt5;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
    case 5: 
      if (paramInt4 == 5)
      {
        localObject = layout;
        baselineToBaseline = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else if (paramInt4 == 3)
      {
        localObject = layout;
        baselineToTop = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else if (paramInt4 == 4)
      {
        localObject = layout;
        baselineToBottom = paramInt3;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else
      {
        throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
      }
      break;
    case 4: 
      if (paramInt4 == 4)
      {
        localLayout = layout;
        bottomToBottom = paramInt3;
        bottomToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        if (paramInt4 != 3) {
          break label605;
        }
        localLayout = layout;
        bottomToTop = paramInt3;
        bottomToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      layout.bottomMargin = paramInt5;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
    case 3: 
      if (paramInt4 == 3)
      {
        localLayout = layout;
        topToTop = paramInt3;
        topToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        if (paramInt4 != 4) {
          break label733;
        }
        localLayout = layout;
        topToBottom = paramInt3;
        topToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      layout.topMargin = paramInt5;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
    case 2: 
      if (paramInt4 == 1)
      {
        localLayout = layout;
        rightToLeft = paramInt3;
        rightToRight = -1;
      }
      else
      {
        if (paramInt4 != 2) {
          break label825;
        }
        localLayout = layout;
        rightToRight = paramInt3;
        rightToLeft = -1;
      }
      layout.rightMargin = paramInt5;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt4), " undefined"));
    case 1: 
      label219:
      label313:
      label605:
      label733:
      label825:
      if (paramInt4 == 1)
      {
        localLayout = layout;
        leftToLeft = paramInt3;
        leftToRight = -1;
      }
      else
      {
        if (paramInt4 != 2) {
          break label915;
        }
        localLayout = layout;
        leftToRight = paramInt3;
        leftToLeft = -1;
      }
      layout.leftMargin = paramInt5;
    }
    return;
    label915:
    throw new IllegalArgumentException(z2.s(z2.t("Left to "), sideToString(paramInt4), " undefined"));
  }
  
  public void constrainCircle(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Layout localLayout = getlayout;
    circleConstraint = paramInt2;
    circleRadius = paramInt3;
    circleAngle = paramFloat;
  }
  
  public void constrainDefaultHeight(int paramInt1, int paramInt2)
  {
    getlayout.heightDefault = paramInt2;
  }
  
  public void constrainDefaultWidth(int paramInt1, int paramInt2)
  {
    getlayout.widthDefault = paramInt2;
  }
  
  public void constrainHeight(int paramInt1, int paramInt2)
  {
    getlayout.mHeight = paramInt2;
  }
  
  public void constrainMaxHeight(int paramInt1, int paramInt2)
  {
    getlayout.heightMax = paramInt2;
  }
  
  public void constrainMaxWidth(int paramInt1, int paramInt2)
  {
    getlayout.widthMax = paramInt2;
  }
  
  public void constrainMinHeight(int paramInt1, int paramInt2)
  {
    getlayout.heightMin = paramInt2;
  }
  
  public void constrainMinWidth(int paramInt1, int paramInt2)
  {
    getlayout.widthMin = paramInt2;
  }
  
  public void constrainPercentHeight(int paramInt, float paramFloat)
  {
    getlayout.heightPercent = paramFloat;
  }
  
  public void constrainPercentWidth(int paramInt, float paramFloat)
  {
    getlayout.widthPercent = paramFloat;
  }
  
  public void constrainWidth(int paramInt1, int paramInt2)
  {
    getlayout.mWidth = paramInt2;
  }
  
  public void constrainedHeight(int paramInt, boolean paramBoolean)
  {
    getlayout.constrainedHeight = paramBoolean;
  }
  
  public void constrainedWidth(int paramInt, boolean paramBoolean)
  {
    getlayout.constrainedWidth = paramBoolean;
  }
  
  public void create(int paramInt1, int paramInt2)
  {
    Layout localLayout = getlayout;
    mIsGuideline = true;
    orientation = paramInt2;
  }
  
  public void createBarrier(int paramInt1, int paramInt2, int paramInt3, int... paramVarArgs)
  {
    Layout localLayout = getlayout;
    mHelperType = 1;
    mBarrierDirection = paramInt2;
    mBarrierMargin = paramInt3;
    mIsGuideline = false;
    mReferenceIds = paramVarArgs;
  }
  
  public void createHorizontalChain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt5)
  {
    createHorizontalChain(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramArrayOfFloat, paramInt5, 1, 2);
  }
  
  public void createHorizontalChainRtl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt5)
  {
    createHorizontalChain(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramArrayOfFloat, paramInt5, 6, 7);
  }
  
  public void createVerticalChain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt5)
  {
    if (paramArrayOfInt.length >= 2)
    {
      if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length != paramArrayOfInt.length)) {
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
      }
      if (paramArrayOfFloat != null) {
        get0layout.verticalWeight = paramArrayOfFloat[0];
      }
      get0layout.verticalChainStyle = paramInt5;
      connect(paramArrayOfInt[0], 3, paramInt1, paramInt2, 0);
      for (paramInt1 = 1; paramInt1 < paramArrayOfInt.length; paramInt1++)
      {
        paramInt2 = paramArrayOfInt[paramInt1];
        paramInt5 = paramInt1 - 1;
        connect(paramInt2, 3, paramArrayOfInt[paramInt5], 4, 0);
        connect(paramArrayOfInt[paramInt5], 4, paramArrayOfInt[paramInt1], 3, 0);
        if (paramArrayOfFloat != null) {
          getlayout.verticalWeight = paramArrayOfFloat[paramInt1];
        }
      }
      connect(paramArrayOfInt[(paramArrayOfInt.length - 1)], 4, paramInt3, paramInt4, 0);
      return;
    }
    throw new IllegalArgumentException("must have 2 or more widgets in a chain");
  }
  
  public void dump(MotionScene paramMotionScene, int... paramVarArgs)
  {
    Object localObject1 = mConstraints.keySet();
    int i = paramVarArgs.length;
    int j = 0;
    if (i != 0)
    {
      localObject2 = new HashSet();
      k = paramVarArgs.length;
      for (i = 0;; i++)
      {
        localObject1 = localObject2;
        if (i >= k) {
          break;
        }
        ((HashSet)localObject2).add(Integer.valueOf(paramVarArgs[i]));
      }
    }
    localObject1 = new HashSet((Collection)localObject1);
    Object localObject2 = System.out;
    paramVarArgs = new StringBuilder();
    paramVarArgs.append(((HashSet)localObject1).size());
    paramVarArgs.append(" constraints");
    ((PrintStream)localObject2).println(paramVarArgs.toString());
    paramVarArgs = new StringBuilder();
    Integer[] arrayOfInteger = (Integer[])((AbstractCollection)localObject1).toArray(new Integer[0]);
    int k = arrayOfInteger.length;
    for (i = j; i < k; i++)
    {
      localObject1 = arrayOfInteger[i];
      localObject2 = (Constraint)mConstraints.get(localObject1);
      if (localObject2 != null)
      {
        paramVarArgs.append("<Constraint id=");
        paramVarArgs.append(localObject1);
        paramVarArgs.append(" \n");
        layout.dump(paramMotionScene, paramVarArgs);
        paramVarArgs.append("/>\n");
      }
    }
    System.out.println(paramVarArgs.toString());
  }
  
  public boolean getApplyElevation(int paramInt)
  {
    return gettransform.applyElevation;
  }
  
  public Constraint getConstraint(int paramInt)
  {
    if (mConstraints.containsKey(Integer.valueOf(paramInt))) {
      return (Constraint)mConstraints.get(Integer.valueOf(paramInt));
    }
    return null;
  }
  
  public HashMap<String, ConstraintAttribute> getCustomAttributeSet()
  {
    return mSavedAttributes;
  }
  
  public int getHeight(int paramInt)
  {
    return getlayout.mHeight;
  }
  
  public int[] getKnownIds()
  {
    Object localObject = mConstraints.keySet();
    int i = 0;
    localObject = (Integer[])((Set)localObject).toArray(new Integer[0]);
    int j = localObject.length;
    int[] arrayOfInt = new int[j];
    while (i < j)
    {
      arrayOfInt[i] = localObject[i].intValue();
      i++;
    }
    return arrayOfInt;
  }
  
  public Constraint getParameters(int paramInt)
  {
    return get(paramInt);
  }
  
  public int[] getReferencedIds(int paramInt)
  {
    int[] arrayOfInt = getlayout.mReferenceIds;
    if (arrayOfInt == null) {
      return new int[0];
    }
    return Arrays.copyOf(arrayOfInt, arrayOfInt.length);
  }
  
  public int getVisibility(int paramInt)
  {
    return getpropertySet.visibility;
  }
  
  public int getVisibilityMode(int paramInt)
  {
    return getpropertySet.mVisibilityMode;
  }
  
  public int getWidth(int paramInt)
  {
    return getlayout.mWidth;
  }
  
  public boolean isForceId()
  {
    return mForceId;
  }
  
  public void load(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    try
    {
      for (paramInt = localXmlResourceParser.getEventType(); paramInt != 1; paramInt = localXmlResourceParser.next()) {
        if (paramInt != 0)
        {
          if (paramInt == 2)
          {
            String str = localXmlResourceParser.getName();
            Constraint localConstraint = fillFromAttributeList(paramContext, Xml.asAttributeSet(localXmlResourceParser), false);
            if (str.equalsIgnoreCase("Guideline")) {
              layout.mIsGuideline = true;
            }
            mConstraints.put(Integer.valueOf(mViewId), localConstraint);
          }
        }
        else {
          localXmlResourceParser.getName();
        }
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public void load(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    try
    {
      int i = paramXmlPullParser.getEventType();
      Object localObject1 = null;
      while (i != 1)
      {
        if (i != 0)
        {
          int j = -1;
          Object localObject2;
          if (i != 2)
          {
            if (i == 3)
            {
              localObject2 = paramXmlPullParser.getName().toLowerCase(Locale.ROOT);
              switch (((String)localObject2).hashCode())
              {
              default: 
                i = j;
                break;
              case 2146106725: 
                i = j;
                if (((String)localObject2).equals("constraintset")) {
                  i = 0;
                }
                break;
              case 426575017: 
                i = j;
                if (((String)localObject2).equals("constraintoverride")) {
                  i = 2;
                }
                break;
              case -190376483: 
                i = j;
                if (((String)localObject2).equals("constraint")) {
                  i = 1;
                }
                break;
              case -2075718416: 
                i = j;
                if (((String)localObject2).equals("guideline")) {
                  i = 3;
                }
                break;
              }
              if (i != 0)
              {
                if ((i != 1) && (i != 2) && (i != 3)) {
                  break label997;
                }
                mConstraints.put(Integer.valueOf(mViewId), localObject1);
                localObject1 = null;
              }
            }
          }
          else
          {
            localObject2 = paramXmlPullParser.getName();
            switch (((String)localObject2).hashCode())
            {
            default: 
              i = j;
              break;
            case 1803088381: 
              i = j;
              if (((String)localObject2).equals("Constraint")) {
                i = 0;
              }
              break;
            case 1791837707: 
              i = j;
              if (((String)localObject2).equals("CustomAttribute")) {
                i = 8;
              }
              break;
            case 1331510167: 
              i = j;
              if (((String)localObject2).equals("Barrier")) {
                i = 3;
              }
              break;
            case 366511058: 
              i = j;
              if (((String)localObject2).equals("CustomMethod")) {
                i = 9;
              }
              break;
            case -71750448: 
              i = j;
              if (((String)localObject2).equals("Guideline")) {
                i = 2;
              }
              break;
            case -1238332596: 
              i = j;
              if (((String)localObject2).equals("Transform")) {
                i = 5;
              }
              break;
            case -1269513683: 
              i = j;
              if (((String)localObject2).equals("PropertySet")) {
                i = 4;
              }
              break;
            case -1962203927: 
              i = j;
              if (((String)localObject2).equals("ConstraintOverride")) {
                i = 1;
              }
              break;
            case -1984451626: 
              i = j;
              if (((String)localObject2).equals("Motion")) {
                i = 7;
              }
              break;
            case -2025855158: 
              boolean bool = ((String)localObject2).equals("Layout");
              i = j;
              if (bool) {
                i = 6;
              }
              break;
            }
            switch (i)
            {
            default: 
              break;
            case 8: 
            case 9: 
              if (localObject1 != null)
              {
                ConstraintAttribute.parse(paramContext, paramXmlPullParser, mCustomConstraints);
                break;
              }
              localObject1 = new java/lang/RuntimeException;
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              paramContext.append("XML parser error must be within a Constraint ");
              paramContext.append(paramXmlPullParser.getLineNumber());
              ((RuntimeException)localObject1).<init>(paramContext.toString());
              throw ((Throwable)localObject1);
            case 7: 
              if (localObject1 != null)
              {
                motion.fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                break;
              }
              localObject1 = new java/lang/RuntimeException;
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              paramContext.append("XML parser error must be within a Constraint ");
              paramContext.append(paramXmlPullParser.getLineNumber());
              ((RuntimeException)localObject1).<init>(paramContext.toString());
              throw ((Throwable)localObject1);
            case 6: 
              if (localObject1 != null)
              {
                layout.fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                break;
              }
              localObject1 = new java/lang/RuntimeException;
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              paramContext.append("XML parser error must be within a Constraint ");
              paramContext.append(paramXmlPullParser.getLineNumber());
              ((RuntimeException)localObject1).<init>(paramContext.toString());
              throw ((Throwable)localObject1);
            case 5: 
              if (localObject1 != null)
              {
                transform.fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                break;
              }
              localObject1 = new java/lang/RuntimeException;
              paramContext = new java/lang/StringBuilder;
              paramContext.<init>();
              paramContext.append("XML parser error must be within a Constraint ");
              paramContext.append(paramXmlPullParser.getLineNumber());
              ((RuntimeException)localObject1).<init>(paramContext.toString());
              throw ((Throwable)localObject1);
            case 4: 
              if (localObject1 != null)
              {
                propertySet.fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser));
                break;
              }
              paramContext = new java/lang/RuntimeException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              ((StringBuilder)localObject1).append("XML parser error must be within a Constraint ");
              ((StringBuilder)localObject1).append(paramXmlPullParser.getLineNumber());
              paramContext.<init>(((StringBuilder)localObject1).toString());
              throw paramContext;
            case 3: 
              localObject1 = fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser), false);
              layout.mHelperType = 1;
              break;
            case 2: 
              localObject1 = fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser), false);
              localObject2 = layout;
              mIsGuideline = true;
              mApply = true;
              break;
            case 1: 
              localObject1 = fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser), true);
              break;
            case 0: 
              localObject1 = fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser), false);
            }
          }
        }
        else
        {
          paramXmlPullParser.getName();
        }
        label997:
        i = paramXmlPullParser.next();
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public void parseColorAttributes(Constraint paramConstraint, String paramString)
  {
    paramString = paramString.split(",");
    for (int i = 0; i < paramString.length; i++)
    {
      Object localObject = paramString[i].split("=");
      if (localObject.length != 2)
      {
        localObject = z2.t(" Unable to parse ");
        ((StringBuilder)localObject).append(paramString[i]);
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
      }
      else
      {
        Constraint.access$1000(paramConstraint, localObject[0], Color.parseColor(localObject[1]));
      }
    }
  }
  
  public void parseFloatAttributes(Constraint paramConstraint, String paramString)
  {
    paramString = paramString.split(",");
    for (int i = 0; i < paramString.length; i++)
    {
      Object localObject = paramString[i].split("=");
      if (localObject.length != 2)
      {
        localObject = z2.t(" Unable to parse ");
        ((StringBuilder)localObject).append(paramString[i]);
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
      }
      else
      {
        Constraint.access$1100(paramConstraint, localObject[0], Float.parseFloat(localObject[1]));
      }
    }
  }
  
  public void parseIntAttributes(Constraint paramConstraint, String paramString)
  {
    paramString = paramString.split(",");
    for (int i = 0; i < paramString.length; i++)
    {
      Object localObject = paramString[i].split("=");
      if (localObject.length != 2)
      {
        localObject = z2.t(" Unable to parse ");
        ((StringBuilder)localObject).append(paramString[i]);
        Log.w("ConstraintSet", ((StringBuilder)localObject).toString());
      }
      else
      {
        Constraint.access$1100(paramConstraint, localObject[0], Integer.decode(localObject[1]).intValue());
      }
    }
  }
  
  public void parseStringAttributes(Constraint paramConstraint, String paramString)
  {
    String[] arrayOfString1 = splitString(paramString);
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = arrayOfString1[i].split("=");
      paramString = z2.t(" Unable to parse ");
      paramString.append(arrayOfString1[i]);
      Log.w("ConstraintSet", paramString.toString());
      Constraint.access$1200(paramConstraint, arrayOfString2[0], arrayOfString2[1]);
    }
  }
  
  public void readFallback(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramConstraintLayout.getChildAt(j);
      Object localObject1 = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
      int k = localView.getId();
      if ((mForceId) && (k == -1)) {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
      if (!mConstraints.containsKey(Integer.valueOf(k))) {
        mConstraints.put(Integer.valueOf(k), new Constraint());
      }
      Object localObject2 = (Constraint)mConstraints.get(Integer.valueOf(k));
      if (localObject2 != null)
      {
        if (!layout.mApply)
        {
          Constraint.access$000((Constraint)localObject2, k, (ConstraintLayout.LayoutParams)localObject1);
          if ((localView instanceof ConstraintHelper))
          {
            layout.mReferenceIds = ((ConstraintHelper)localView).getReferencedIds();
            if ((localView instanceof Barrier))
            {
              localObject1 = (Barrier)localView;
              layout.mBarrierAllowsGoneWidgets = ((Barrier)localObject1).getAllowsGoneWidget();
              layout.mBarrierDirection = ((Barrier)localObject1).getType();
              layout.mBarrierMargin = ((Barrier)localObject1).getMargin();
            }
          }
          layout.mApply = true;
        }
        localObject1 = propertySet;
        if (!mApply)
        {
          visibility = localView.getVisibility();
          propertySet.alpha = localView.getAlpha();
          propertySet.mApply = true;
        }
        localObject1 = transform;
        if (!mApply)
        {
          mApply = true;
          rotation = localView.getRotation();
          transform.rotationX = localView.getRotationX();
          transform.rotationY = localView.getRotationY();
          transform.scaleX = localView.getScaleX();
          transform.scaleY = localView.getScaleY();
          float f1 = localView.getPivotX();
          float f2 = localView.getPivotY();
          if ((f1 != 0.0D) || (f2 != 0.0D))
          {
            localObject1 = transform;
            transformPivotX = f1;
            transformPivotY = f2;
          }
          transform.translationX = localView.getTranslationX();
          transform.translationY = localView.getTranslationY();
          transform.translationZ = localView.getTranslationZ();
          localObject2 = transform;
          if (applyElevation) {
            elevation = localView.getElevation();
          }
        }
      }
    }
  }
  
  public void readFallback(ConstraintSet paramConstraintSet)
  {
    Iterator localIterator1 = mConstraints.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject1 = (Integer)localIterator1.next();
      int i = ((Integer)localObject1).intValue();
      localObject1 = (Constraint)mConstraints.get(localObject1);
      if (!mConstraints.containsKey(Integer.valueOf(i))) {
        mConstraints.put(Integer.valueOf(i), new Constraint());
      }
      Constraint localConstraint = (Constraint)mConstraints.get(Integer.valueOf(i));
      if (localConstraint != null)
      {
        Object localObject2 = layout;
        if (!mApply) {
          ((Layout)localObject2).copyFrom(layout);
        }
        localObject2 = propertySet;
        if (!mApply) {
          ((PropertySet)localObject2).copyFrom(propertySet);
        }
        localObject2 = transform;
        if (!mApply) {
          ((Transform)localObject2).copyFrom(transform);
        }
        localObject2 = motion;
        if (!mApply) {
          ((Motion)localObject2).copyFrom(motion);
        }
        Iterator localIterator2 = mCustomConstraints.keySet().iterator();
        while (localIterator2.hasNext())
        {
          localObject2 = (String)localIterator2.next();
          if (!mCustomConstraints.containsKey(localObject2)) {
            mCustomConstraints.put(localObject2, (ConstraintAttribute)mCustomConstraints.get(localObject2));
          }
        }
      }
    }
  }
  
  public void removeAttribute(String paramString)
  {
    mSavedAttributes.remove(paramString);
  }
  
  public void removeFromHorizontalChain(int paramInt)
  {
    if (mConstraints.containsKey(Integer.valueOf(paramInt)))
    {
      Object localObject = (Constraint)mConstraints.get(Integer.valueOf(paramInt));
      if (localObject == null) {
        return;
      }
      localObject = layout;
      int i = leftToRight;
      int j = rightToLeft;
      int k;
      if ((i == -1) && (j == -1))
      {
        k = startToEnd;
        j = endToStart;
        if ((k != -1) || (j != -1)) {
          if ((k != -1) && (j != -1))
          {
            connect(k, 7, j, 6, 0);
            connect(j, 6, i, 7, 0);
          }
          else if (j != -1)
          {
            k = rightToRight;
            if (k != -1)
            {
              connect(i, 7, k, 7, 0);
            }
            else
            {
              i = leftToLeft;
              if (i != -1) {
                connect(j, 6, i, 6, 0);
              }
            }
          }
        }
        clear(paramInt, 6);
        clear(paramInt, 7);
      }
      else
      {
        if ((i != -1) && (j != -1))
        {
          connect(i, 2, j, 1, 0);
          connect(j, 1, i, 2, 0);
        }
        else
        {
          k = rightToRight;
          if (k != -1)
          {
            connect(i, 2, k, 2, 0);
          }
          else
          {
            i = leftToLeft;
            if (i != -1) {
              connect(j, 1, i, 1, 0);
            }
          }
        }
        clear(paramInt, 1);
        clear(paramInt, 2);
      }
    }
  }
  
  public void removeFromVerticalChain(int paramInt)
  {
    if (mConstraints.containsKey(Integer.valueOf(paramInt)))
    {
      Object localObject = (Constraint)mConstraints.get(Integer.valueOf(paramInt));
      if (localObject == null) {
        return;
      }
      localObject = layout;
      int i = topToBottom;
      int j = bottomToTop;
      if ((i != -1) || (j != -1)) {
        if ((i != -1) && (j != -1))
        {
          connect(i, 4, j, 3, 0);
          connect(j, 3, i, 4, 0);
        }
        else
        {
          int k = bottomToBottom;
          if (k != -1)
          {
            connect(i, 4, k, 4, 0);
          }
          else
          {
            i = topToTop;
            if (i != -1) {
              connect(j, 3, i, 3, 0);
            }
          }
        }
      }
    }
    clear(paramInt, 3);
    clear(paramInt, 4);
  }
  
  public void setAlpha(int paramInt, float paramFloat)
  {
    getpropertySet.alpha = paramFloat;
  }
  
  public void setApplyElevation(int paramInt, boolean paramBoolean)
  {
    gettransform.applyElevation = paramBoolean;
  }
  
  public void setBarrierType(int paramInt1, int paramInt2)
  {
    getlayout.mHelperType = paramInt2;
  }
  
  public void setColorValue(int paramInt1, String paramString, int paramInt2)
  {
    Constraint.access$1000(get(paramInt1), paramString, paramInt2);
  }
  
  public void setDimensionRatio(int paramInt, String paramString)
  {
    getlayout.dimensionRatio = paramString;
  }
  
  public void setEditorAbsoluteX(int paramInt1, int paramInt2)
  {
    getlayout.editorAbsoluteX = paramInt2;
  }
  
  public void setEditorAbsoluteY(int paramInt1, int paramInt2)
  {
    getlayout.editorAbsoluteY = paramInt2;
  }
  
  public void setElevation(int paramInt, float paramFloat)
  {
    gettransform.elevation = paramFloat;
    gettransform.applyElevation = true;
  }
  
  public void setFloatValue(int paramInt, String paramString, float paramFloat)
  {
    Constraint.access$1100(get(paramInt), paramString, paramFloat);
  }
  
  public void setForceId(boolean paramBoolean)
  {
    mForceId = paramBoolean;
  }
  
  public void setGoneMargin(int paramInt1, int paramInt2, int paramInt3)
  {
    Constraint localConstraint = get(paramInt1);
    switch (paramInt2)
    {
    default: 
      throw new IllegalArgumentException("unknown constraint");
    case 7: 
      layout.goneEndMargin = paramInt3;
      break;
    case 6: 
      layout.goneStartMargin = paramInt3;
      break;
    case 5: 
      layout.goneBaselineMargin = paramInt3;
      break;
    case 4: 
      layout.goneBottomMargin = paramInt3;
      break;
    case 3: 
      layout.goneTopMargin = paramInt3;
      break;
    case 2: 
      layout.goneRightMargin = paramInt3;
      break;
    case 1: 
      layout.goneLeftMargin = paramInt3;
    }
  }
  
  public void setGuidelineBegin(int paramInt1, int paramInt2)
  {
    getlayout.guideBegin = paramInt2;
    getlayout.guideEnd = -1;
    getlayout.guidePercent = -1.0F;
  }
  
  public void setGuidelineEnd(int paramInt1, int paramInt2)
  {
    getlayout.guideEnd = paramInt2;
    getlayout.guideBegin = -1;
    getlayout.guidePercent = -1.0F;
  }
  
  public void setGuidelinePercent(int paramInt, float paramFloat)
  {
    getlayout.guidePercent = paramFloat;
    getlayout.guideEnd = -1;
    getlayout.guideBegin = -1;
  }
  
  public void setHorizontalBias(int paramInt, float paramFloat)
  {
    getlayout.horizontalBias = paramFloat;
  }
  
  public void setHorizontalChainStyle(int paramInt1, int paramInt2)
  {
    getlayout.horizontalChainStyle = paramInt2;
  }
  
  public void setHorizontalWeight(int paramInt, float paramFloat)
  {
    getlayout.horizontalWeight = paramFloat;
  }
  
  public void setIntValue(int paramInt1, String paramString, int paramInt2)
  {
    Constraint.access$900(get(paramInt1), paramString, paramInt2);
  }
  
  public void setLayoutWrapBehavior(int paramInt1, int paramInt2)
  {
    if ((paramInt2 >= 0) && (paramInt2 <= 3)) {
      getlayout.mWrapBehavior = paramInt2;
    }
  }
  
  public void setMargin(int paramInt1, int paramInt2, int paramInt3)
  {
    Constraint localConstraint = get(paramInt1);
    switch (paramInt2)
    {
    default: 
      throw new IllegalArgumentException("unknown constraint");
    case 7: 
      layout.endMargin = paramInt3;
      break;
    case 6: 
      layout.startMargin = paramInt3;
      break;
    case 5: 
      layout.baselineMargin = paramInt3;
      break;
    case 4: 
      layout.bottomMargin = paramInt3;
      break;
    case 3: 
      layout.topMargin = paramInt3;
      break;
    case 2: 
      layout.rightMargin = paramInt3;
      break;
    case 1: 
      layout.leftMargin = paramInt3;
    }
  }
  
  public void setReferencedIds(int paramInt, int... paramVarArgs)
  {
    getlayout.mReferenceIds = paramVarArgs;
  }
  
  public void setRotation(int paramInt, float paramFloat)
  {
    gettransform.rotation = paramFloat;
  }
  
  public void setRotationX(int paramInt, float paramFloat)
  {
    gettransform.rotationX = paramFloat;
  }
  
  public void setRotationY(int paramInt, float paramFloat)
  {
    gettransform.rotationY = paramFloat;
  }
  
  public void setScaleX(int paramInt, float paramFloat)
  {
    gettransform.scaleX = paramFloat;
  }
  
  public void setScaleY(int paramInt, float paramFloat)
  {
    gettransform.scaleY = paramFloat;
  }
  
  public void setStringValue(int paramInt, String paramString1, String paramString2)
  {
    Constraint.access$1200(get(paramInt), paramString1, paramString2);
  }
  
  public void setTransformPivot(int paramInt, float paramFloat1, float paramFloat2)
  {
    Transform localTransform = gettransform;
    transformPivotY = paramFloat2;
    transformPivotX = paramFloat1;
  }
  
  public void setTransformPivotX(int paramInt, float paramFloat)
  {
    gettransform.transformPivotX = paramFloat;
  }
  
  public void setTransformPivotY(int paramInt, float paramFloat)
  {
    gettransform.transformPivotY = paramFloat;
  }
  
  public void setTranslation(int paramInt, float paramFloat1, float paramFloat2)
  {
    Transform localTransform = gettransform;
    translationX = paramFloat1;
    translationY = paramFloat2;
  }
  
  public void setTranslationX(int paramInt, float paramFloat)
  {
    gettransform.translationX = paramFloat;
  }
  
  public void setTranslationY(int paramInt, float paramFloat)
  {
    gettransform.translationY = paramFloat;
  }
  
  public void setTranslationZ(int paramInt, float paramFloat)
  {
    gettransform.translationZ = paramFloat;
  }
  
  public void setValidateOnParse(boolean paramBoolean)
  {
    mValidate = paramBoolean;
  }
  
  public void setVerticalBias(int paramInt, float paramFloat)
  {
    getlayout.verticalBias = paramFloat;
  }
  
  public void setVerticalChainStyle(int paramInt1, int paramInt2)
  {
    getlayout.verticalChainStyle = paramInt2;
  }
  
  public void setVerticalWeight(int paramInt, float paramFloat)
  {
    getlayout.verticalWeight = paramFloat;
  }
  
  public void setVisibility(int paramInt1, int paramInt2)
  {
    getpropertySet.visibility = paramInt2;
  }
  
  public void setVisibilityMode(int paramInt1, int paramInt2)
  {
    getpropertySet.mVisibilityMode = paramInt2;
  }
  
  public void writeState(Writer paramWriter, ConstraintLayout paramConstraintLayout, int paramInt)
    throws IOException
  {
    paramWriter.write("\n---------------------------------------------\n");
    if ((paramInt & 0x1) == 1) {
      new WriteXmlEngine(paramWriter, paramConstraintLayout, paramInt).writeLayout();
    } else {
      new WriteJsonEngine(paramWriter, paramConstraintLayout, paramInt).writeLayout();
    }
    paramWriter.write("\n---------------------------------------------\n");
  }
  
  public static class Constraint
  {
    public final ConstraintSet.Layout layout = new ConstraintSet.Layout();
    public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap();
    public Delta mDelta;
    public String mTargetString;
    public int mViewId;
    public final ConstraintSet.Motion motion = new ConstraintSet.Motion();
    public final ConstraintSet.PropertySet propertySet = new ConstraintSet.PropertySet();
    public final ConstraintSet.Transform transform = new ConstraintSet.Transform();
    
    private void fillFrom(int paramInt, ConstraintLayout.LayoutParams paramLayoutParams)
    {
      mViewId = paramInt;
      ConstraintSet.Layout localLayout = layout;
      leftToLeft = leftToLeft;
      leftToRight = leftToRight;
      rightToLeft = rightToLeft;
      rightToRight = rightToRight;
      topToTop = topToTop;
      topToBottom = topToBottom;
      bottomToTop = bottomToTop;
      bottomToBottom = bottomToBottom;
      baselineToBaseline = baselineToBaseline;
      baselineToTop = baselineToTop;
      baselineToBottom = baselineToBottom;
      startToEnd = startToEnd;
      startToStart = startToStart;
      endToStart = endToStart;
      endToEnd = endToEnd;
      horizontalBias = horizontalBias;
      verticalBias = verticalBias;
      dimensionRatio = dimensionRatio;
      circleConstraint = circleConstraint;
      circleRadius = circleRadius;
      circleAngle = circleAngle;
      editorAbsoluteX = editorAbsoluteX;
      editorAbsoluteY = editorAbsoluteY;
      orientation = orientation;
      guidePercent = guidePercent;
      guideBegin = guideBegin;
      guideEnd = guideEnd;
      mWidth = width;
      mHeight = height;
      leftMargin = leftMargin;
      rightMargin = rightMargin;
      topMargin = topMargin;
      bottomMargin = bottomMargin;
      baselineMargin = baselineMargin;
      verticalWeight = verticalWeight;
      horizontalWeight = horizontalWeight;
      verticalChainStyle = verticalChainStyle;
      horizontalChainStyle = horizontalChainStyle;
      constrainedWidth = constrainedWidth;
      constrainedHeight = constrainedHeight;
      widthDefault = matchConstraintDefaultWidth;
      heightDefault = matchConstraintDefaultHeight;
      widthMax = matchConstraintMaxWidth;
      heightMax = matchConstraintMaxHeight;
      widthMin = matchConstraintMinWidth;
      heightMin = matchConstraintMinHeight;
      widthPercent = matchConstraintPercentWidth;
      heightPercent = matchConstraintPercentHeight;
      mConstraintTag = constraintTag;
      goneTopMargin = goneTopMargin;
      goneBottomMargin = goneBottomMargin;
      goneLeftMargin = goneLeftMargin;
      goneRightMargin = goneRightMargin;
      goneStartMargin = goneStartMargin;
      goneEndMargin = goneEndMargin;
      goneBaselineMargin = goneBaselineMargin;
      mWrapBehavior = wrapBehaviorInParent;
      endMargin = paramLayoutParams.getMarginEnd();
      layout.startMargin = paramLayoutParams.getMarginStart();
    }
    
    private void fillFromConstraints(int paramInt, Constraints.LayoutParams paramLayoutParams)
    {
      fillFrom(paramInt, paramLayoutParams);
      propertySet.alpha = alpha;
      ConstraintSet.Transform localTransform = transform;
      rotation = rotation;
      rotationX = rotationX;
      rotationY = rotationY;
      scaleX = scaleX;
      scaleY = scaleY;
      transformPivotX = transformPivotX;
      transformPivotY = transformPivotY;
      translationX = translationX;
      translationY = translationY;
      translationZ = translationZ;
      elevation = elevation;
      applyElevation = applyElevation;
    }
    
    private void fillFromConstraints(ConstraintHelper paramConstraintHelper, int paramInt, Constraints.LayoutParams paramLayoutParams)
    {
      fillFromConstraints(paramInt, paramLayoutParams);
      if ((paramConstraintHelper instanceof Barrier))
      {
        paramLayoutParams = layout;
        mHelperType = 1;
        paramConstraintHelper = (Barrier)paramConstraintHelper;
        mBarrierDirection = paramConstraintHelper.getType();
        layout.mReferenceIds = paramConstraintHelper.getReferencedIds();
        layout.mBarrierMargin = paramConstraintHelper.getMargin();
      }
    }
    
    private ConstraintAttribute get(String paramString, ConstraintAttribute.AttributeType paramAttributeType)
    {
      if (mCustomConstraints.containsKey(paramString))
      {
        paramString = (ConstraintAttribute)mCustomConstraints.get(paramString);
        if (paramString.getType() != paramAttributeType)
        {
          paramAttributeType = z2.t("ConstraintAttribute is already a ");
          paramAttributeType.append(paramString.getType().name());
          throw new IllegalArgumentException(paramAttributeType.toString());
        }
      }
      else
      {
        paramAttributeType = new ConstraintAttribute(paramString, paramAttributeType);
        mCustomConstraints.put(paramString, paramAttributeType);
        paramString = paramAttributeType;
      }
      return paramString;
    }
    
    private void setColorValue(String paramString, int paramInt)
    {
      get(paramString, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(paramInt);
    }
    
    private void setFloatValue(String paramString, float paramFloat)
    {
      get(paramString, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(paramFloat);
    }
    
    private void setIntValue(String paramString, int paramInt)
    {
      get(paramString, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(paramInt);
    }
    
    private void setStringValue(String paramString1, String paramString2)
    {
      get(paramString1, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(paramString2);
    }
    
    public void applyDelta(Constraint paramConstraint)
    {
      Delta localDelta = mDelta;
      if (localDelta != null) {
        localDelta.applyDelta(paramConstraint);
      }
    }
    
    public void applyTo(ConstraintLayout.LayoutParams paramLayoutParams)
    {
      ConstraintSet.Layout localLayout = layout;
      leftToLeft = leftToLeft;
      leftToRight = leftToRight;
      rightToLeft = rightToLeft;
      rightToRight = rightToRight;
      topToTop = topToTop;
      topToBottom = topToBottom;
      bottomToTop = bottomToTop;
      bottomToBottom = bottomToBottom;
      baselineToBaseline = baselineToBaseline;
      baselineToTop = baselineToTop;
      baselineToBottom = baselineToBottom;
      startToEnd = startToEnd;
      startToStart = startToStart;
      endToStart = endToStart;
      endToEnd = endToEnd;
      leftMargin = leftMargin;
      rightMargin = rightMargin;
      topMargin = topMargin;
      bottomMargin = bottomMargin;
      goneStartMargin = goneStartMargin;
      goneEndMargin = goneEndMargin;
      goneTopMargin = goneTopMargin;
      goneBottomMargin = goneBottomMargin;
      horizontalBias = horizontalBias;
      verticalBias = verticalBias;
      circleConstraint = circleConstraint;
      circleRadius = circleRadius;
      circleAngle = circleAngle;
      dimensionRatio = dimensionRatio;
      editorAbsoluteX = editorAbsoluteX;
      editorAbsoluteY = editorAbsoluteY;
      verticalWeight = verticalWeight;
      horizontalWeight = horizontalWeight;
      verticalChainStyle = verticalChainStyle;
      horizontalChainStyle = horizontalChainStyle;
      constrainedWidth = constrainedWidth;
      constrainedHeight = constrainedHeight;
      matchConstraintDefaultWidth = widthDefault;
      matchConstraintDefaultHeight = heightDefault;
      matchConstraintMaxWidth = widthMax;
      matchConstraintMaxHeight = heightMax;
      matchConstraintMinWidth = widthMin;
      matchConstraintMinHeight = heightMin;
      matchConstraintPercentWidth = widthPercent;
      matchConstraintPercentHeight = heightPercent;
      orientation = orientation;
      guidePercent = guidePercent;
      guideBegin = guideBegin;
      guideEnd = guideEnd;
      width = mWidth;
      height = mHeight;
      String str = mConstraintTag;
      if (str != null) {
        constraintTag = str;
      }
      wrapBehaviorInParent = mWrapBehavior;
      paramLayoutParams.setMarginStart(startMargin);
      paramLayoutParams.setMarginEnd(layout.endMargin);
      paramLayoutParams.validate();
    }
    
    public Constraint clone()
    {
      Constraint localConstraint = new Constraint();
      layout.copyFrom(layout);
      motion.copyFrom(motion);
      propertySet.copyFrom(propertySet);
      transform.copyFrom(transform);
      mViewId = mViewId;
      mDelta = mDelta;
      return localConstraint;
    }
    
    public void printDelta(String paramString)
    {
      Delta localDelta = mDelta;
      if (localDelta != null) {
        localDelta.printDelta(paramString);
      } else {
        Log.v(paramString, "DELTA IS NULL");
      }
    }
    
    public static class Delta
    {
      private static final int INITIAL_BOOLEAN = 4;
      private static final int INITIAL_FLOAT = 10;
      private static final int INITIAL_INT = 10;
      private static final int INITIAL_STRING = 5;
      public int mCountBoolean = 0;
      public int mCountFloat = 0;
      public int mCountInt = 0;
      public int mCountString = 0;
      public int[] mTypeBoolean = new int[4];
      public int[] mTypeFloat = new int[10];
      public int[] mTypeInt = new int[10];
      public int[] mTypeString = new int[5];
      public boolean[] mValueBoolean = new boolean[4];
      public float[] mValueFloat = new float[10];
      public int[] mValueInt = new int[10];
      public String[] mValueString = new String[5];
      
      public void add(int paramInt, float paramFloat)
      {
        int i = mCountFloat;
        Object localObject = mTypeFloat;
        if (i >= localObject.length)
        {
          mTypeFloat = Arrays.copyOf((int[])localObject, localObject.length * 2);
          localObject = mValueFloat;
          mValueFloat = Arrays.copyOf((float[])localObject, localObject.length * 2);
        }
        localObject = mTypeFloat;
        i = mCountFloat;
        localObject[i] = paramInt;
        localObject = mValueFloat;
        mCountFloat = (i + 1);
        localObject[i] = paramFloat;
      }
      
      public void add(int paramInt1, int paramInt2)
      {
        int i = mCountInt;
        int[] arrayOfInt = mTypeInt;
        if (i >= arrayOfInt.length)
        {
          mTypeInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
          arrayOfInt = mValueInt;
          mValueInt = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
        }
        arrayOfInt = mTypeInt;
        i = mCountInt;
        arrayOfInt[i] = paramInt1;
        arrayOfInt = mValueInt;
        mCountInt = (i + 1);
        arrayOfInt[i] = paramInt2;
      }
      
      public void add(int paramInt, String paramString)
      {
        int i = mCountString;
        Object localObject = mTypeString;
        if (i >= localObject.length)
        {
          mTypeString = Arrays.copyOf((int[])localObject, localObject.length * 2);
          localObject = mValueString;
          mValueString = ((String[])Arrays.copyOf((Object[])localObject, localObject.length * 2));
        }
        localObject = mTypeString;
        i = mCountString;
        localObject[i] = paramInt;
        localObject = mValueString;
        mCountString = (i + 1);
        localObject[i] = paramString;
      }
      
      public void add(int paramInt, boolean paramBoolean)
      {
        int i = mCountBoolean;
        Object localObject = mTypeBoolean;
        if (i >= localObject.length)
        {
          mTypeBoolean = Arrays.copyOf((int[])localObject, localObject.length * 2);
          localObject = mValueBoolean;
          mValueBoolean = Arrays.copyOf((boolean[])localObject, localObject.length * 2);
        }
        localObject = mTypeBoolean;
        i = mCountBoolean;
        localObject[i] = paramInt;
        localObject = mValueBoolean;
        mCountBoolean = (i + 1);
        localObject[i] = paramBoolean;
      }
      
      public void applyDelta(ConstraintSet.Constraint paramConstraint)
      {
        int i = 0;
        for (int j = 0; j < mCountInt; j++) {
          ConstraintSet.access$300(paramConstraint, mTypeInt[j], mValueInt[j]);
        }
        for (j = 0; j < mCountFloat; j++) {
          ConstraintSet.access$400(paramConstraint, mTypeFloat[j], mValueFloat[j]);
        }
        for (int k = 0;; k++)
        {
          j = i;
          if (k >= mCountString) {
            break;
          }
          ConstraintSet.access$500(paramConstraint, mTypeString[k], mValueString[k]);
        }
        while (j < mCountBoolean)
        {
          ConstraintSet.access$600(paramConstraint, mTypeBoolean[j], mValueBoolean[j]);
          j++;
        }
      }
      
      @SuppressLint({"LogConditional"})
      public void printDelta(String paramString)
      {
        Log.v(paramString, "int");
        int i = 0;
        StringBuilder localStringBuilder;
        for (int j = 0; j < mCountInt; j++)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(mTypeInt[j]);
          localStringBuilder.append(" = ");
          localStringBuilder.append(mValueInt[j]);
          Log.v(paramString, localStringBuilder.toString());
        }
        Log.v(paramString, "float");
        for (j = 0; j < mCountFloat; j++)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(mTypeFloat[j]);
          localStringBuilder.append(" = ");
          localStringBuilder.append(mValueFloat[j]);
          Log.v(paramString, localStringBuilder.toString());
        }
        Log.v(paramString, "strings");
        for (j = 0; j < mCountString; j++)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(mTypeString[j]);
          localStringBuilder.append(" = ");
          localStringBuilder.append(mValueString[j]);
          Log.v(paramString, localStringBuilder.toString());
        }
        Log.v(paramString, "boolean");
        for (j = i; j < mCountBoolean; j++)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(mTypeBoolean[j]);
          localStringBuilder.append(" = ");
          localStringBuilder.append(mValueBoolean[j]);
          Log.v(paramString, localStringBuilder.toString());
        }
      }
    }
  }
  
  public static class Layout
  {
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BASELINE_MARGIN = 80;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 78;
    private static final int BASELINE_TO_TOP = 77;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINED_HEIGHT = 88;
    private static final int CONSTRAINED_WIDTH = 87;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 89;
    private static final int DIMENSION_RATIO = 5;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final int GONE_BASELINE_MARGIN = 79;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int GUIDE_USE_RTL = 90;
    private static final int HEIGHT_DEFAULT = 82;
    private static final int HEIGHT_MAX = 83;
    private static final int HEIGHT_MIN = 85;
    private static final int HEIGHT_PERCENT = 70;
    private static final int HORIZONTAL_BIAS = 20;
    private static final int HORIZONTAL_STYLE = 39;
    private static final int HORIZONTAL_WEIGHT = 37;
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_WIDTH = 22;
    private static final int LAYOUT_WRAP_BEHAVIOR = 76;
    private static final int LEFT_MARGIN = 23;
    private static final int LEFT_TO_LEFT = 24;
    private static final int LEFT_TO_RIGHT = 25;
    private static final int ORIENTATION = 26;
    private static final int RIGHT_MARGIN = 27;
    private static final int RIGHT_TO_LEFT = 28;
    private static final int RIGHT_TO_RIGHT = 29;
    private static final int START_MARGIN = 30;
    private static final int START_TO_END = 31;
    private static final int START_TO_START = 32;
    private static final int TOP_MARGIN = 33;
    private static final int TOP_TO_BOTTOM = 34;
    private static final int TOP_TO_TOP = 35;
    public static final int UNSET = -1;
    public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
    private static final int UNUSED = 91;
    private static final int VERTICAL_BIAS = 36;
    private static final int VERTICAL_STYLE = 40;
    private static final int VERTICAL_WEIGHT = 38;
    private static final int WIDTH_DEFAULT = 81;
    private static final int WIDTH_MAX = 84;
    private static final int WIDTH_MIN = 86;
    private static final int WIDTH_PERCENT = 69;
    private static SparseIntArray mapToConstant;
    public int baselineMargin = 0;
    public int baselineToBaseline = -1;
    public int baselineToBottom = -1;
    public int baselineToTop = -1;
    public int bottomMargin = 0;
    public int bottomToBottom = -1;
    public int bottomToTop = -1;
    public float circleAngle = 0.0F;
    public int circleConstraint = -1;
    public int circleRadius = 0;
    public boolean constrainedHeight = false;
    public boolean constrainedWidth = false;
    public String dimensionRatio = null;
    public int editorAbsoluteX = -1;
    public int editorAbsoluteY = -1;
    public int endMargin = 0;
    public int endToEnd = -1;
    public int endToStart = -1;
    public int goneBaselineMargin = Integer.MIN_VALUE;
    public int goneBottomMargin = Integer.MIN_VALUE;
    public int goneEndMargin = Integer.MIN_VALUE;
    public int goneLeftMargin = Integer.MIN_VALUE;
    public int goneRightMargin = Integer.MIN_VALUE;
    public int goneStartMargin = Integer.MIN_VALUE;
    public int goneTopMargin = Integer.MIN_VALUE;
    public int guideBegin = -1;
    public int guideEnd = -1;
    public float guidePercent = -1.0F;
    public boolean guidelineUseRtl = true;
    public int heightDefault = 0;
    public int heightMax = 0;
    public int heightMin = 0;
    public float heightPercent = 1.0F;
    public float horizontalBias = 0.5F;
    public int horizontalChainStyle = 0;
    public float horizontalWeight = -1.0F;
    public int leftMargin = 0;
    public int leftToLeft = -1;
    public int leftToRight = -1;
    public boolean mApply = false;
    public boolean mBarrierAllowsGoneWidgets = true;
    public int mBarrierDirection = -1;
    public int mBarrierMargin = 0;
    public String mConstraintTag;
    public int mHeight;
    public int mHelperType = -1;
    public boolean mIsGuideline = false;
    public boolean mOverride = false;
    public String mReferenceIdString;
    public int[] mReferenceIds;
    public int mWidth;
    public int mWrapBehavior = 0;
    public int orientation = -1;
    public int rightMargin = 0;
    public int rightToLeft = -1;
    public int rightToRight = -1;
    public int startMargin = 0;
    public int startToEnd = -1;
    public int startToStart = -1;
    public int topMargin = 0;
    public int topToBottom = -1;
    public int topToTop = -1;
    public float verticalBias = 0.5F;
    public int verticalChainStyle = 0;
    public float verticalWeight = -1.0F;
    public int widthDefault = 0;
    public int widthMax = 0;
    public int widthMin = 0;
    public float widthPercent = 1.0F;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mapToConstant = localSparseIntArray;
      localSparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
      mapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
      mapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
      mapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
      mapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
      mapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
      mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
      mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
      mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
      mapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
      mapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
      mapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
      mapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
      mapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
      mapToConstant.append(R.styleable.Layout_guidelineUseRtl, 90);
      mapToConstant.append(R.styleable.Layout_android_orientation, 26);
      mapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
      mapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
      mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
      mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
      mapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
      mapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
      mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
      mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
      mapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
      mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
      mapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
      mapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
      mapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
      mapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 91);
      mapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 91);
      mapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
      mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
      mapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
      mapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
      mapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
      mapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
      mapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
      mapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
      mapToConstant.append(R.styleable.Layout_android_layout_width, 22);
      mapToConstant.append(R.styleable.Layout_android_layout_height, 21);
      mapToConstant.append(R.styleable.Layout_layout_constraintWidth, 41);
      mapToConstant.append(R.styleable.Layout_layout_constraintHeight, 42);
      mapToConstant.append(R.styleable.Layout_layout_constrainedWidth, 41);
      mapToConstant.append(R.styleable.Layout_layout_constrainedHeight, 42);
      mapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
      mapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
      mapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
      mapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
      mapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
      mapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
      mapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
      mapToConstant.append(R.styleable.Layout_barrierDirection, 72);
      mapToConstant.append(R.styleable.Layout_barrierMargin, 73);
      mapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
      mapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
    }
    
    public void copyFrom(Layout paramLayout)
    {
      mIsGuideline = mIsGuideline;
      mWidth = mWidth;
      mApply = mApply;
      mHeight = mHeight;
      guideBegin = guideBegin;
      guideEnd = guideEnd;
      guidePercent = guidePercent;
      guidelineUseRtl = guidelineUseRtl;
      leftToLeft = leftToLeft;
      leftToRight = leftToRight;
      rightToLeft = rightToLeft;
      rightToRight = rightToRight;
      topToTop = topToTop;
      topToBottom = topToBottom;
      bottomToTop = bottomToTop;
      bottomToBottom = bottomToBottom;
      baselineToBaseline = baselineToBaseline;
      baselineToTop = baselineToTop;
      baselineToBottom = baselineToBottom;
      startToEnd = startToEnd;
      startToStart = startToStart;
      endToStart = endToStart;
      endToEnd = endToEnd;
      horizontalBias = horizontalBias;
      verticalBias = verticalBias;
      dimensionRatio = dimensionRatio;
      circleConstraint = circleConstraint;
      circleRadius = circleRadius;
      circleAngle = circleAngle;
      editorAbsoluteX = editorAbsoluteX;
      editorAbsoluteY = editorAbsoluteY;
      orientation = orientation;
      leftMargin = leftMargin;
      rightMargin = rightMargin;
      topMargin = topMargin;
      bottomMargin = bottomMargin;
      endMargin = endMargin;
      startMargin = startMargin;
      baselineMargin = baselineMargin;
      goneLeftMargin = goneLeftMargin;
      goneTopMargin = goneTopMargin;
      goneRightMargin = goneRightMargin;
      goneBottomMargin = goneBottomMargin;
      goneEndMargin = goneEndMargin;
      goneStartMargin = goneStartMargin;
      goneBaselineMargin = goneBaselineMargin;
      verticalWeight = verticalWeight;
      horizontalWeight = horizontalWeight;
      horizontalChainStyle = horizontalChainStyle;
      verticalChainStyle = verticalChainStyle;
      widthDefault = widthDefault;
      heightDefault = heightDefault;
      widthMax = widthMax;
      heightMax = heightMax;
      widthMin = widthMin;
      heightMin = heightMin;
      widthPercent = widthPercent;
      heightPercent = heightPercent;
      mBarrierDirection = mBarrierDirection;
      mBarrierMargin = mBarrierMargin;
      mHelperType = mHelperType;
      mConstraintTag = mConstraintTag;
      int[] arrayOfInt = mReferenceIds;
      if ((arrayOfInt != null) && (mReferenceIdString == null)) {
        mReferenceIds = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
      } else {
        mReferenceIds = null;
      }
      mReferenceIdString = mReferenceIdString;
      constrainedWidth = constrainedWidth;
      constrainedHeight = constrainedHeight;
      mBarrierAllowsGoneWidgets = mBarrierAllowsGoneWidgets;
      mWrapBehavior = mWrapBehavior;
    }
    
    public void dump(MotionScene paramMotionScene, StringBuilder paramStringBuilder)
    {
      Field[] arrayOfField = getClass().getDeclaredFields();
      paramStringBuilder.append("\n");
      for (int i = 0; i < arrayOfField.length; i++)
      {
        Object localObject1 = arrayOfField[i];
        String str = ((Field)localObject1).getName();
        if (!Modifier.isStatic(((Field)localObject1).getModifiers())) {
          try
          {
            Object localObject2 = ((Field)localObject1).get(this);
            localObject1 = ((Field)localObject1).getType();
            Class localClass = Integer.TYPE;
            if (localObject1 == localClass)
            {
              localObject2 = (Integer)localObject2;
              if (((Integer)localObject2).intValue() != -1)
              {
                localObject1 = paramMotionScene.lookUpConstraintName(((Integer)localObject2).intValue());
                paramStringBuilder.append("    ");
                paramStringBuilder.append(str);
                paramStringBuilder.append(" = \"");
                if (localObject1 != null) {
                  localObject2 = localObject1;
                }
                paramStringBuilder.append(localObject2);
                paramStringBuilder.append("\"\n");
              }
            }
            else if (localObject1 == Float.TYPE)
            {
              localObject2 = (Float)localObject2;
              if (((Float)localObject2).floatValue() != -1.0F)
              {
                paramStringBuilder.append("    ");
                paramStringBuilder.append(str);
                paramStringBuilder.append(" = \"");
                paramStringBuilder.append(localObject2);
                paramStringBuilder.append("\"\n");
              }
            }
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localIllegalAccessException.printStackTrace();
          }
        }
      }
    }
    
    public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Layout);
      mApply = true;
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        int m = mapToConstant.get(k);
        switch (m)
        {
        default: 
          switch (m)
          {
          default: 
            switch (m)
            {
            default: 
              paramAttributeSet = z2.t("Unknown attribute 0x");
              paramAttributeSet.append(Integer.toHexString(k));
              paramAttributeSet.append("   ");
              paramAttributeSet.append(mapToConstant.get(k));
              Log.w("ConstraintSet", paramAttributeSet.toString());
            }
            break;
          }
          break;
        case 42: 
          ConstraintSet.parseDimensionConstraints(this, paramContext, k, 1);
          break;
        case 41: 
          ConstraintSet.parseDimensionConstraints(this, paramContext, k, 0);
          break;
        case 40: 
          verticalChainStyle = paramContext.getInt(k, verticalChainStyle);
          break;
        case 39: 
          horizontalChainStyle = paramContext.getInt(k, horizontalChainStyle);
          break;
        case 38: 
          verticalWeight = paramContext.getFloat(k, verticalWeight);
          break;
        case 37: 
          horizontalWeight = paramContext.getFloat(k, horizontalWeight);
          break;
        case 36: 
          verticalBias = paramContext.getFloat(k, verticalBias);
          break;
        case 35: 
          topToTop = ConstraintSet.access$100(paramContext, k, topToTop);
          break;
        case 34: 
          topToBottom = ConstraintSet.access$100(paramContext, k, topToBottom);
          break;
        case 33: 
          topMargin = paramContext.getDimensionPixelSize(k, topMargin);
          break;
        case 32: 
          startToStart = ConstraintSet.access$100(paramContext, k, startToStart);
          break;
        case 31: 
          startToEnd = ConstraintSet.access$100(paramContext, k, startToEnd);
          break;
        case 30: 
          startMargin = paramContext.getDimensionPixelSize(k, startMargin);
          break;
        case 29: 
          rightToRight = ConstraintSet.access$100(paramContext, k, rightToRight);
          break;
        case 28: 
          rightToLeft = ConstraintSet.access$100(paramContext, k, rightToLeft);
          break;
        case 27: 
          rightMargin = paramContext.getDimensionPixelSize(k, rightMargin);
          break;
        case 26: 
          orientation = paramContext.getInt(k, orientation);
          break;
        case 25: 
          leftToRight = ConstraintSet.access$100(paramContext, k, leftToRight);
          break;
        case 24: 
          leftToLeft = ConstraintSet.access$100(paramContext, k, leftToLeft);
          break;
        case 23: 
          leftMargin = paramContext.getDimensionPixelSize(k, leftMargin);
          break;
        case 22: 
          mWidth = paramContext.getLayoutDimension(k, mWidth);
          break;
        case 21: 
          mHeight = paramContext.getLayoutDimension(k, mHeight);
          break;
        case 20: 
          horizontalBias = paramContext.getFloat(k, horizontalBias);
          break;
        case 19: 
          guidePercent = paramContext.getFloat(k, guidePercent);
          break;
        case 18: 
          guideEnd = paramContext.getDimensionPixelOffset(k, guideEnd);
          break;
        case 17: 
          guideBegin = paramContext.getDimensionPixelOffset(k, guideBegin);
          break;
        case 16: 
          goneTopMargin = paramContext.getDimensionPixelSize(k, goneTopMargin);
          break;
        case 15: 
          goneStartMargin = paramContext.getDimensionPixelSize(k, goneStartMargin);
          break;
        case 14: 
          goneRightMargin = paramContext.getDimensionPixelSize(k, goneRightMargin);
          break;
        case 13: 
          goneLeftMargin = paramContext.getDimensionPixelSize(k, goneLeftMargin);
          break;
        case 12: 
          goneEndMargin = paramContext.getDimensionPixelSize(k, goneEndMargin);
          break;
        case 11: 
          goneBottomMargin = paramContext.getDimensionPixelSize(k, goneBottomMargin);
          break;
        case 10: 
          endToStart = ConstraintSet.access$100(paramContext, k, endToStart);
          break;
        case 9: 
          endToEnd = ConstraintSet.access$100(paramContext, k, endToEnd);
          break;
        case 8: 
          endMargin = paramContext.getDimensionPixelSize(k, endMargin);
          break;
        case 7: 
          editorAbsoluteY = paramContext.getDimensionPixelOffset(k, editorAbsoluteY);
          break;
        case 6: 
          editorAbsoluteX = paramContext.getDimensionPixelOffset(k, editorAbsoluteX);
          break;
        case 5: 
          dimensionRatio = paramContext.getString(k);
          break;
        case 4: 
          bottomToTop = ConstraintSet.access$100(paramContext, k, bottomToTop);
          break;
        case 3: 
          bottomToBottom = ConstraintSet.access$100(paramContext, k, bottomToBottom);
          break;
        case 2: 
          bottomMargin = paramContext.getDimensionPixelSize(k, bottomMargin);
          break;
        case 1: 
          baselineToBaseline = ConstraintSet.access$100(paramContext, k, baselineToBaseline);
          continue;
          circleAngle = paramContext.getFloat(k, circleAngle);
          continue;
          circleRadius = paramContext.getDimensionPixelSize(k, circleRadius);
          continue;
          circleConstraint = ConstraintSet.access$100(paramContext, k, circleConstraint);
          continue;
          paramAttributeSet = z2.t("unused attribute 0x");
          paramAttributeSet.append(Integer.toHexString(k));
          paramAttributeSet.append("   ");
          paramAttributeSet.append(mapToConstant.get(k));
          Log.w("ConstraintSet", paramAttributeSet.toString());
          continue;
          guidelineUseRtl = paramContext.getBoolean(k, guidelineUseRtl);
          continue;
          mConstraintTag = paramContext.getString(k);
          continue;
          constrainedHeight = paramContext.getBoolean(k, constrainedHeight);
          continue;
          constrainedWidth = paramContext.getBoolean(k, constrainedWidth);
          continue;
          widthMin = paramContext.getDimensionPixelSize(k, widthMin);
          continue;
          heightMin = paramContext.getDimensionPixelSize(k, heightMin);
          continue;
          widthMax = paramContext.getDimensionPixelSize(k, widthMax);
          continue;
          heightMax = paramContext.getDimensionPixelSize(k, heightMax);
          continue;
          heightDefault = paramContext.getInt(k, heightDefault);
          continue;
          widthDefault = paramContext.getInt(k, widthDefault);
          continue;
          baselineMargin = paramContext.getDimensionPixelSize(k, baselineMargin);
          continue;
          goneBaselineMargin = paramContext.getDimensionPixelSize(k, goneBaselineMargin);
          continue;
          baselineToBottom = ConstraintSet.access$100(paramContext, k, baselineToBottom);
          continue;
          baselineToTop = ConstraintSet.access$100(paramContext, k, baselineToTop);
          continue;
          mWrapBehavior = paramContext.getInt(k, mWrapBehavior);
          continue;
          mBarrierAllowsGoneWidgets = paramContext.getBoolean(k, mBarrierAllowsGoneWidgets);
          continue;
          mReferenceIdString = paramContext.getString(k);
          continue;
          mBarrierMargin = paramContext.getDimensionPixelSize(k, mBarrierMargin);
          continue;
          mBarrierDirection = paramContext.getInt(k, mBarrierDirection);
          continue;
          Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
          continue;
          heightPercent = paramContext.getFloat(k, 1.0F);
          continue;
          widthPercent = paramContext.getFloat(k, 1.0F);
        }
      }
      paramContext.recycle();
    }
  }
  
  public static class Motion
  {
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
    private static final int ANIMATE_RELATIVE_TO = 5;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    private static final int MOTION_DRAW_PATH = 4;
    private static final int MOTION_STAGGER = 7;
    private static final int PATH_MOTION_ARC = 2;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
    private static final int QUANTIZE_MOTION_PHASE = 9;
    private static final int QUANTIZE_MOTION_STEPS = 8;
    private static final int SPLINE_STRING = -1;
    private static final int TRANSITION_EASING = 3;
    private static final int TRANSITION_PATH_ROTATE = 1;
    private static SparseIntArray mapToConstant;
    public int mAnimateCircleAngleTo = 0;
    public int mAnimateRelativeTo = -1;
    public boolean mApply = false;
    public int mDrawPath = 0;
    public float mMotionStagger = NaN.0F;
    public int mPathMotionArc = -1;
    public float mPathRotate = NaN.0F;
    public int mPolarRelativeTo = -1;
    public int mQuantizeInterpolatorID = -1;
    public String mQuantizeInterpolatorString = null;
    public int mQuantizeInterpolatorType = -3;
    public float mQuantizeMotionPhase = NaN.0F;
    public int mQuantizeMotionSteps = -1;
    public String mTransitionEasing = null;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mapToConstant = localSparseIntArray;
      localSparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
      mapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
      mapToConstant.append(R.styleable.Motion_transitionEasing, 3);
      mapToConstant.append(R.styleable.Motion_drawPath, 4);
      mapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
      mapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
      mapToConstant.append(R.styleable.Motion_motionStagger, 7);
      mapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
      mapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
      mapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
    }
    
    public void copyFrom(Motion paramMotion)
    {
      mApply = mApply;
      mAnimateRelativeTo = mAnimateRelativeTo;
      mTransitionEasing = mTransitionEasing;
      mPathMotionArc = mPathMotionArc;
      mDrawPath = mDrawPath;
      mPathRotate = mPathRotate;
      mMotionStagger = mMotionStagger;
      mPolarRelativeTo = mPolarRelativeTo;
    }
    
    public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Motion);
      mApply = true;
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        switch (mapToConstant.get(k))
        {
        default: 
          break;
        case 10: 
          int m = peekValuetype;
          if (m == 1)
          {
            m = paramContext.getResourceId(k, -1);
            mQuantizeInterpolatorID = m;
            if (m != -1) {
              mQuantizeInterpolatorType = -2;
            }
          }
          else if (m == 3)
          {
            paramAttributeSet = paramContext.getString(k);
            mQuantizeInterpolatorString = paramAttributeSet;
            if (paramAttributeSet.indexOf("/") > 0)
            {
              mQuantizeInterpolatorID = paramContext.getResourceId(k, -1);
              mQuantizeInterpolatorType = -2;
            }
            else
            {
              mQuantizeInterpolatorType = -1;
            }
          }
          else
          {
            mQuantizeInterpolatorType = paramContext.getInteger(k, mQuantizeInterpolatorID);
          }
          break;
        case 9: 
          mQuantizeMotionPhase = paramContext.getFloat(k, mQuantizeMotionPhase);
          break;
        case 8: 
          mQuantizeMotionSteps = paramContext.getInteger(k, mQuantizeMotionSteps);
          break;
        case 7: 
          mMotionStagger = paramContext.getFloat(k, mMotionStagger);
          break;
        case 6: 
          mAnimateCircleAngleTo = paramContext.getInteger(k, mAnimateCircleAngleTo);
          break;
        case 5: 
          mAnimateRelativeTo = ConstraintSet.access$100(paramContext, k, mAnimateRelativeTo);
          break;
        case 4: 
          mDrawPath = paramContext.getInt(k, 0);
          break;
        case 3: 
          if (peekValuetype == 3) {
            mTransitionEasing = paramContext.getString(k);
          } else {
            mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[paramContext.getInteger(k, 0)];
          }
          break;
        case 2: 
          mPathMotionArc = paramContext.getInt(k, mPathMotionArc);
          break;
        case 1: 
          mPathRotate = paramContext.getFloat(k, mPathRotate);
        }
      }
      paramContext.recycle();
    }
  }
  
  public static class PropertySet
  {
    public float alpha = 1.0F;
    public boolean mApply = false;
    public float mProgress = NaN.0F;
    public int mVisibilityMode = 0;
    public int visibility = 0;
    
    public void copyFrom(PropertySet paramPropertySet)
    {
      mApply = mApply;
      visibility = visibility;
      alpha = alpha;
      mProgress = mProgress;
      mVisibilityMode = mVisibilityMode;
    }
    
    public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.PropertySet);
      mApply = true;
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.PropertySet_android_alpha)
        {
          alpha = paramContext.getFloat(k, alpha);
        }
        else if (k == R.styleable.PropertySet_android_visibility)
        {
          visibility = paramContext.getInt(k, visibility);
          visibility = ConstraintSet.access$200()[visibility];
        }
        else if (k == R.styleable.PropertySet_visibilityMode)
        {
          mVisibilityMode = paramContext.getInt(k, mVisibilityMode);
        }
        else if (k == R.styleable.PropertySet_motionProgress)
        {
          mProgress = paramContext.getFloat(k, mProgress);
        }
      }
      paramContext.recycle();
    }
  }
  
  public static class Transform
  {
    private static final int ELEVATION = 11;
    private static final int ROTATION = 1;
    private static final int ROTATION_X = 2;
    private static final int ROTATION_Y = 3;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 5;
    private static final int TRANSFORM_PIVOT_TARGET = 12;
    private static final int TRANSFORM_PIVOT_X = 6;
    private static final int TRANSFORM_PIVOT_Y = 7;
    private static final int TRANSLATION_X = 8;
    private static final int TRANSLATION_Y = 9;
    private static final int TRANSLATION_Z = 10;
    private static SparseIntArray mapToConstant;
    public boolean applyElevation = false;
    public float elevation = 0.0F;
    public boolean mApply = false;
    public float rotation = 0.0F;
    public float rotationX = 0.0F;
    public float rotationY = 0.0F;
    public float scaleX = 1.0F;
    public float scaleY = 1.0F;
    public int transformPivotTarget = -1;
    public float transformPivotX = NaN.0F;
    public float transformPivotY = NaN.0F;
    public float translationX = 0.0F;
    public float translationY = 0.0F;
    public float translationZ = 0.0F;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mapToConstant = localSparseIntArray;
      localSparseIntArray.append(R.styleable.Transform_android_rotation, 1);
      mapToConstant.append(R.styleable.Transform_android_rotationX, 2);
      mapToConstant.append(R.styleable.Transform_android_rotationY, 3);
      mapToConstant.append(R.styleable.Transform_android_scaleX, 4);
      mapToConstant.append(R.styleable.Transform_android_scaleY, 5);
      mapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
      mapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
      mapToConstant.append(R.styleable.Transform_android_translationX, 8);
      mapToConstant.append(R.styleable.Transform_android_translationY, 9);
      mapToConstant.append(R.styleable.Transform_android_translationZ, 10);
      mapToConstant.append(R.styleable.Transform_android_elevation, 11);
      mapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
    }
    
    public void copyFrom(Transform paramTransform)
    {
      mApply = mApply;
      rotation = rotation;
      rotationX = rotationX;
      rotationY = rotationY;
      scaleX = scaleX;
      scaleY = scaleY;
      transformPivotX = transformPivotX;
      transformPivotY = transformPivotY;
      transformPivotTarget = transformPivotTarget;
      translationX = translationX;
      translationY = translationY;
      translationZ = translationZ;
      applyElevation = applyElevation;
      elevation = elevation;
    }
    
    public void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Transform);
      mApply = true;
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        switch (mapToConstant.get(k))
        {
        default: 
          break;
        case 12: 
          transformPivotTarget = ConstraintSet.access$100(paramContext, k, transformPivotTarget);
          break;
        case 11: 
          applyElevation = true;
          elevation = paramContext.getDimension(k, elevation);
          break;
        case 10: 
          translationZ = paramContext.getDimension(k, translationZ);
          break;
        case 9: 
          translationY = paramContext.getDimension(k, translationY);
          break;
        case 8: 
          translationX = paramContext.getDimension(k, translationX);
          break;
        case 7: 
          transformPivotY = paramContext.getDimension(k, transformPivotY);
          break;
        case 6: 
          transformPivotX = paramContext.getDimension(k, transformPivotX);
          break;
        case 5: 
          scaleY = paramContext.getFloat(k, scaleY);
          break;
        case 4: 
          scaleX = paramContext.getFloat(k, scaleX);
          break;
        case 3: 
          rotationY = paramContext.getFloat(k, rotationY);
          break;
        case 2: 
          rotationX = paramContext.getFloat(k, rotationX);
          break;
        case 1: 
          rotation = paramContext.getFloat(k, rotation);
        }
      }
      paramContext.recycle();
    }
  }
  
  public class WriteJsonEngine
  {
    private static final String SPACE = "       ";
    public final String BASELINE = "'baseline'";
    public final String BOTTOM = "'bottom'";
    public final String END = "'end'";
    public final String LEFT = "'left'";
    public final String RIGHT = "'right'";
    public final String START = "'start'";
    public final String TOP = "'top'";
    public Context context;
    public int flags;
    public HashMap<Integer, String> idMap = new HashMap();
    public ConstraintLayout layout;
    public int unknownCount = 0;
    public Writer writer;
    
    public WriteJsonEngine(Writer paramWriter, ConstraintLayout paramConstraintLayout, int paramInt)
      throws IOException
    {
      writer = paramWriter;
      layout = paramConstraintLayout;
      context = paramConstraintLayout.getContext();
      flags = paramInt;
    }
    
    private void writeDimension(String paramString, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, boolean paramBoolean)
      throws IOException
    {
      Object localObject1;
      Object localObject2;
      if (paramInt1 == 0)
      {
        if ((paramInt4 == -1) && (paramInt3 == -1))
        {
          if (paramInt2 != 1)
          {
            if (paramInt2 == 2)
            {
              localObject1 = writer;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("       ");
              ((StringBuilder)localObject2).append(paramString);
              ((StringBuilder)localObject2).append(": '");
              ((StringBuilder)localObject2).append(paramFloat);
              ((StringBuilder)localObject2).append("%',\n");
              ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
            }
          }
          else
          {
            localObject1 = writer;
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("       ");
            ((StringBuilder)localObject2).append(paramString);
            ((StringBuilder)localObject2).append(": '???????????',\n");
            ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
          }
        }
        else if (paramInt2 != 0)
        {
          if (paramInt2 != 1)
          {
            if (paramInt2 == 2)
            {
              localObject1 = writer;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("       ");
              ((StringBuilder)localObject2).append(paramString);
              ((StringBuilder)localObject2).append(": {'");
              ((StringBuilder)localObject2).append(paramFloat);
              ((StringBuilder)localObject2).append("'% ,");
              ((StringBuilder)localObject2).append(paramInt3);
              ((StringBuilder)localObject2).append(", ");
              ((StringBuilder)localObject2).append(paramInt4);
              ((StringBuilder)localObject2).append("}\n");
              ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
            }
          }
          else
          {
            localObject1 = writer;
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("       ");
            ((StringBuilder)localObject2).append(paramString);
            ((StringBuilder)localObject2).append(": {'wrap' ,");
            ((StringBuilder)localObject2).append(paramInt3);
            ((StringBuilder)localObject2).append(", ");
            ((StringBuilder)localObject2).append(paramInt4);
            ((StringBuilder)localObject2).append("}\n");
            ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          localObject2 = writer;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("       ");
          ((StringBuilder)localObject1).append(paramString);
          ((StringBuilder)localObject1).append(": {'spread' ,");
          ((StringBuilder)localObject1).append(paramInt3);
          ((StringBuilder)localObject1).append(", ");
          ((StringBuilder)localObject1).append(paramInt4);
          ((StringBuilder)localObject1).append("}\n");
          ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
        }
      }
      else if (paramInt1 == -2)
      {
        localObject1 = writer;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("       ");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append(": 'wrap'\n");
        ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
      }
      else if (paramInt1 == -1)
      {
        localObject2 = writer;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("       ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(": 'parent'\n");
        ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
      }
      else
      {
        localObject2 = writer;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("       ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(": ");
        ((StringBuilder)localObject1).append(paramInt1);
        ((StringBuilder)localObject1).append(",\n");
        ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
      }
    }
    
    private void writeGuideline(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
    
    public String getName(int paramInt)
    {
      if (idMap.containsKey(Integer.valueOf(paramInt))) {
        return z2.s(z2.t("'"), (String)idMap.get(Integer.valueOf(paramInt)), "'");
      }
      if (paramInt == 0) {
        return "'parent'";
      }
      String str = lookup(paramInt);
      idMap.put(Integer.valueOf(paramInt), str);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("'");
      localStringBuilder.append(str);
      localStringBuilder.append("'");
      return localStringBuilder.toString();
    }
    
    public String lookup(int paramInt)
    {
      if (paramInt != -1) {}
      try
      {
        return context.getResources().getResourceEntryName(paramInt);
      }
      catch (Exception localException)
      {
        Object localObject;
        StringBuilder localStringBuilder = z2.t("unknown");
        paramInt = unknownCount + 1;
        unknownCount = paramInt;
        localStringBuilder.append(paramInt);
        return localStringBuilder.toString();
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("unknown");
      paramInt = unknownCount + 1;
      unknownCount = paramInt;
      ((StringBuilder)localObject).append(paramInt);
      localObject = ((StringBuilder)localObject).toString();
      return (String)localObject;
    }
    
    public void writeCircle(int paramInt1, float paramFloat, int paramInt2)
      throws IOException
    {
      if (paramInt1 == -1) {
        return;
      }
      writer.write("       circle");
      writer.write(":[");
      writer.write(getName(paramInt1));
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(", ");
      localStringBuilder.append(paramFloat);
      localWriter.write(localStringBuilder.toString());
      localWriter = writer;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("]");
      localWriter.write(localStringBuilder.toString());
    }
    
    public void writeConstraint(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
      throws IOException
    {
      if (paramInt1 == -1) {
        return;
      }
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("       ");
      localStringBuilder.append(paramString1);
      localWriter.write(localStringBuilder.toString());
      writer.write(":[");
      writer.write(getName(paramInt1));
      writer.write(" , ");
      writer.write(paramString2);
      if (paramInt2 != 0)
      {
        paramString2 = writer;
        paramString1 = new StringBuilder();
        paramString1.append(" , ");
        paramString1.append(paramInt2);
        paramString2.write(paramString1.toString());
      }
      writer.write("],\n");
    }
    
    public void writeLayout()
      throws IOException
    {
      writer.write("\n'ConstraintSet':{\n");
      Iterator localIterator = ConstraintSet.access$1300(ConstraintSet.this).keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Integer)localIterator.next();
        Object localObject2 = (ConstraintSet.Constraint)ConstraintSet.access$1300(ConstraintSet.this).get(localObject1);
        String str = getName(((Integer)localObject1).intValue());
        localObject1 = writer;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str);
        localStringBuilder.append(":{\n");
        ((Writer)localObject1).write(localStringBuilder.toString());
        localObject2 = layout;
        writeDimension("height", mHeight, heightDefault, heightPercent, heightMin, heightMax, constrainedHeight);
        writeDimension("width", mWidth, widthDefault, widthPercent, widthMin, widthMax, constrainedWidth);
        writeConstraint("'left'", leftToLeft, "'left'", leftMargin, goneLeftMargin);
        writeConstraint("'left'", leftToRight, "'right'", leftMargin, goneLeftMargin);
        writeConstraint("'right'", rightToLeft, "'left'", rightMargin, goneRightMargin);
        writeConstraint("'right'", rightToRight, "'right'", rightMargin, goneRightMargin);
        writeConstraint("'baseline'", baselineToBaseline, "'baseline'", -1, goneBaselineMargin);
        writeConstraint("'baseline'", baselineToTop, "'top'", -1, goneBaselineMargin);
        writeConstraint("'baseline'", baselineToBottom, "'bottom'", -1, goneBaselineMargin);
        writeConstraint("'top'", topToBottom, "'bottom'", topMargin, goneTopMargin);
        writeConstraint("'top'", topToTop, "'top'", topMargin, goneTopMargin);
        writeConstraint("'bottom'", bottomToBottom, "'bottom'", bottomMargin, goneBottomMargin);
        writeConstraint("'bottom'", bottomToTop, "'top'", bottomMargin, goneBottomMargin);
        writeConstraint("'start'", startToStart, "'start'", startMargin, goneStartMargin);
        writeConstraint("'start'", startToEnd, "'end'", startMargin, goneStartMargin);
        writeConstraint("'end'", endToStart, "'start'", endMargin, goneEndMargin);
        writeConstraint("'end'", endToEnd, "'end'", endMargin, goneEndMargin);
        writeVariable("'horizontalBias'", horizontalBias, 0.5F);
        writeVariable("'verticalBias'", verticalBias, 0.5F);
        writeCircle(circleConstraint, circleAngle, circleRadius);
        writeGuideline(orientation, guideBegin, guideEnd, guidePercent);
        writeVariable("'dimensionRatio'", dimensionRatio);
        writeVariable("'barrierMargin'", mBarrierMargin);
        writeVariable("'type'", mHelperType);
        writeVariable("'ReferenceId'", mReferenceIdString);
        writeVariable("'mBarrierAllowsGoneWidgets'", mBarrierAllowsGoneWidgets, true);
        writeVariable("'WrapBehavior'", mWrapBehavior);
        writeVariable("'verticalWeight'", verticalWeight);
        writeVariable("'horizontalWeight'", horizontalWeight);
        writeVariable("'horizontalChainStyle'", horizontalChainStyle);
        writeVariable("'verticalChainStyle'", verticalChainStyle);
        writeVariable("'barrierDirection'", mBarrierDirection);
        localObject2 = mReferenceIds;
        if (localObject2 != null) {
          writeVariable("'ReferenceIds'", (int[])localObject2);
        }
        writer.write("}\n");
      }
      writer.write("}\n");
    }
    
    public void writeVariable(String paramString, float paramFloat)
      throws IOException
    {
      if (paramFloat == -1.0F) {
        return;
      }
      Writer localWriter = writer;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("       ");
      ((StringBuilder)localObject).append(paramString);
      localWriter.write(((StringBuilder)localObject).toString());
      localObject = writer;
      paramString = new StringBuilder();
      paramString.append(": ");
      paramString.append(paramFloat);
      ((Writer)localObject).write(paramString.toString());
      writer.write(",\n");
    }
    
    public void writeVariable(String paramString, float paramFloat1, float paramFloat2)
      throws IOException
    {
      if (paramFloat1 == paramFloat2) {
        return;
      }
      Writer localWriter = writer;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("       ");
      ((StringBuilder)localObject).append(paramString);
      localWriter.write(((StringBuilder)localObject).toString());
      localObject = writer;
      paramString = new StringBuilder();
      paramString.append(": ");
      paramString.append(paramFloat1);
      ((Writer)localObject).write(paramString.toString());
      writer.write(",\n");
    }
    
    public void writeVariable(String paramString, int paramInt)
      throws IOException
    {
      if ((paramInt != 0) && (paramInt != -1))
      {
        Writer localWriter = writer;
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("       ");
        ((StringBuilder)localObject).append(paramString);
        localWriter.write(((StringBuilder)localObject).toString());
        writer.write(":");
        localObject = writer;
        paramString = new StringBuilder();
        paramString.append(", ");
        paramString.append(paramInt);
        ((Writer)localObject).write(paramString.toString());
        writer.write("\n");
      }
    }
    
    public void writeVariable(String paramString1, String paramString2)
      throws IOException
    {
      if (paramString2 == null) {
        return;
      }
      Object localObject = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("       ");
      localStringBuilder.append(paramString1);
      ((Writer)localObject).write(localStringBuilder.toString());
      writer.write(":");
      paramString1 = writer;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramString2);
      paramString1.write(((StringBuilder)localObject).toString());
      writer.write("\n");
    }
    
    public void writeVariable(String paramString, boolean paramBoolean)
      throws IOException
    {
      if (!paramBoolean) {
        return;
      }
      Object localObject = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("       ");
      localStringBuilder.append(paramString);
      ((Writer)localObject).write(localStringBuilder.toString());
      paramString = writer;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(": ");
      ((StringBuilder)localObject).append(paramBoolean);
      paramString.write(((StringBuilder)localObject).toString());
      writer.write(",\n");
    }
    
    public void writeVariable(String paramString, boolean paramBoolean1, boolean paramBoolean2)
      throws IOException
    {
      if (paramBoolean1 == paramBoolean2) {
        return;
      }
      Writer localWriter = writer;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("       ");
      ((StringBuilder)localObject).append(paramString);
      localWriter.write(((StringBuilder)localObject).toString());
      localObject = writer;
      paramString = new StringBuilder();
      paramString.append(": ");
      paramString.append(paramBoolean1);
      ((Writer)localObject).write(paramString.toString());
      writer.write(",\n");
    }
    
    public void writeVariable(String paramString, int[] paramArrayOfInt)
      throws IOException
    {
      if (paramArrayOfInt == null) {
        return;
      }
      Object localObject1 = writer;
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("       ");
      ((StringBuilder)localObject2).append(paramString);
      ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
      writer.write(": ");
      for (int i = 0; i < paramArrayOfInt.length; i++)
      {
        localObject2 = writer;
        localObject1 = new StringBuilder();
        if (i == 0) {
          paramString = "[";
        } else {
          paramString = ", ";
        }
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(getName(paramArrayOfInt[i]));
        ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
      }
      writer.write("],\n");
    }
  }
  
  public class WriteXmlEngine
  {
    private static final String SPACE = "\n       ";
    public final String BASELINE = "'baseline'";
    public final String BOTTOM = "'bottom'";
    public final String END = "'end'";
    public final String LEFT = "'left'";
    public final String RIGHT = "'right'";
    public final String START = "'start'";
    public final String TOP = "'top'";
    public Context context;
    public int flags;
    public HashMap<Integer, String> idMap = new HashMap();
    public ConstraintLayout layout;
    public int unknownCount = 0;
    public Writer writer;
    
    public WriteXmlEngine(Writer paramWriter, ConstraintLayout paramConstraintLayout, int paramInt)
      throws IOException
    {
      writer = paramWriter;
      layout = paramConstraintLayout;
      context = paramConstraintLayout.getContext();
      flags = paramInt;
    }
    
    private void writeBaseDimension(String paramString, int paramInt1, int paramInt2)
      throws IOException
    {
      if (paramInt1 != paramInt2)
      {
        Object localObject1;
        Object localObject2;
        if (paramInt1 == -2)
        {
          localObject1 = writer;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("\n       ");
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append("=\"wrap_content\"");
          ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
        }
        else if (paramInt1 == -1)
        {
          localObject2 = writer;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("\n       ");
          ((StringBuilder)localObject1).append(paramString);
          ((StringBuilder)localObject1).append("=\"match_parent\"");
          ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
        }
        else
        {
          localObject1 = writer;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("\n       ");
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append("=\"");
          ((StringBuilder)localObject2).append(paramInt1);
          ((StringBuilder)localObject2).append("dp\"");
          ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
        }
      }
    }
    
    private void writeBoolen(String paramString, boolean paramBoolean1, boolean paramBoolean2)
      throws IOException
    {
      if (paramBoolean1 != paramBoolean2)
      {
        Writer localWriter = writer;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("\n       ");
        localStringBuilder.append(paramString);
        localStringBuilder.append("=\"");
        localStringBuilder.append(paramBoolean1);
        localStringBuilder.append("dp\"");
        localWriter.write(localStringBuilder.toString());
      }
    }
    
    private void writeDimension(String paramString, int paramInt1, int paramInt2)
      throws IOException
    {
      if (paramInt1 != paramInt2)
      {
        Writer localWriter = writer;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("\n       ");
        localStringBuilder.append(paramString);
        localStringBuilder.append("=\"");
        localStringBuilder.append(paramInt1);
        localStringBuilder.append("dp\"");
        localWriter.write(localStringBuilder.toString());
      }
    }
    
    private void writeEnum(String paramString, int paramInt1, String[] paramArrayOfString, int paramInt2)
      throws IOException
    {
      if (paramInt1 != paramInt2)
      {
        Writer localWriter = writer;
        paramString = a.s("\n       ", paramString, "=\"");
        paramString.append(paramArrayOfString[paramInt1]);
        paramString.append("\"");
        localWriter.write(paramString.toString());
      }
    }
    
    public String getName(int paramInt)
    {
      if (idMap.containsKey(Integer.valueOf(paramInt))) {
        return z2.s(z2.t("@+id/"), (String)idMap.get(Integer.valueOf(paramInt)), "");
      }
      if (paramInt == 0) {
        return "parent";
      }
      String str = lookup(paramInt);
      idMap.put(Integer.valueOf(paramInt), str);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("@+id/");
      localStringBuilder.append(str);
      localStringBuilder.append("");
      return localStringBuilder.toString();
    }
    
    public String lookup(int paramInt)
    {
      if (paramInt != -1) {}
      try
      {
        return context.getResources().getResourceEntryName(paramInt);
      }
      catch (Exception localException)
      {
        Object localObject;
        StringBuilder localStringBuilder = z2.t("unknown");
        paramInt = unknownCount + 1;
        unknownCount = paramInt;
        localStringBuilder.append(paramInt);
        return localStringBuilder.toString();
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("unknown");
      paramInt = unknownCount + 1;
      unknownCount = paramInt;
      ((StringBuilder)localObject).append(paramInt);
      localObject = ((StringBuilder)localObject).toString();
      return (String)localObject;
    }
    
    public void writeCircle(int paramInt1, float paramFloat, int paramInt2)
      throws IOException
    {
      if (paramInt1 == -1) {
        return;
      }
      writer.write("circle");
      writer.write(":[");
      writer.write(getName(paramInt1));
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(", ");
      localStringBuilder.append(paramFloat);
      localWriter.write(localStringBuilder.toString());
      localWriter = writer;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramInt2);
      localStringBuilder.append("]");
      localWriter.write(localStringBuilder.toString());
    }
    
    public void writeConstraint(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
      throws IOException
    {
      if (paramInt1 == -1) {
        return;
      }
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString1);
      localWriter.write(localStringBuilder.toString());
      writer.write(":[");
      writer.write(getName(paramInt1));
      writer.write(" , ");
      writer.write(paramString2);
      if (paramInt2 != 0)
      {
        paramString1 = writer;
        paramString2 = new StringBuilder();
        paramString2.append(" , ");
        paramString2.append(paramInt2);
        paramString1.write(paramString2.toString());
      }
      writer.write("],\n");
    }
    
    public void writeLayout()
      throws IOException
    {
      writer.write("\n<ConstraintSet>\n");
      Iterator localIterator = ConstraintSet.access$1300(ConstraintSet.this).keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Integer)localIterator.next();
        Object localObject2 = (ConstraintSet.Constraint)ConstraintSet.access$1300(ConstraintSet.this).get(localObject1);
        String str = getName(((Integer)localObject1).intValue());
        writer.write("  <Constraint");
        localObject1 = writer;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("\n       android:id=\"");
        localStringBuilder.append(str);
        localStringBuilder.append("\"");
        ((Writer)localObject1).write(localStringBuilder.toString());
        localObject2 = layout;
        writeBaseDimension("android:layout_width", mWidth, -5);
        writeBaseDimension("android:layout_height", mHeight, -5);
        writeVariable("app:layout_constraintGuide_begin", guideBegin, -1.0F);
        writeVariable("app:layout_constraintGuide_end", guideEnd, -1.0F);
        writeVariable("app:layout_constraintGuide_percent", guidePercent, -1.0F);
        writeVariable("app:layout_constraintHorizontal_bias", horizontalBias, 0.5F);
        writeVariable("app:layout_constraintVertical_bias", verticalBias, 0.5F);
        writeVariable("app:layout_constraintDimensionRatio", dimensionRatio, null);
        writeXmlConstraint("app:layout_constraintCircle", circleConstraint);
        writeVariable("app:layout_constraintCircleRadius", circleRadius, 0.0F);
        writeVariable("app:layout_constraintCircleAngle", circleAngle, 0.0F);
        writeVariable("android:orientation", orientation, -1.0F);
        writeVariable("app:layout_constraintVertical_weight", verticalWeight, -1.0F);
        writeVariable("app:layout_constraintHorizontal_weight", horizontalWeight, -1.0F);
        writeVariable("app:layout_constraintHorizontal_chainStyle", horizontalChainStyle, 0.0F);
        writeVariable("app:layout_constraintVertical_chainStyle", verticalChainStyle, 0.0F);
        writeVariable("app:barrierDirection", mBarrierDirection, -1.0F);
        writeVariable("app:barrierMargin", mBarrierMargin, 0.0F);
        writeDimension("app:layout_marginLeft", leftMargin, 0);
        writeDimension("app:layout_goneMarginLeft", goneLeftMargin, Integer.MIN_VALUE);
        writeDimension("app:layout_marginRight", rightMargin, 0);
        writeDimension("app:layout_goneMarginRight", goneRightMargin, Integer.MIN_VALUE);
        writeDimension("app:layout_marginStart", startMargin, 0);
        writeDimension("app:layout_goneMarginStart", goneStartMargin, Integer.MIN_VALUE);
        writeDimension("app:layout_marginEnd", endMargin, 0);
        writeDimension("app:layout_goneMarginEnd", goneEndMargin, Integer.MIN_VALUE);
        writeDimension("app:layout_marginTop", topMargin, 0);
        writeDimension("app:layout_goneMarginTop", goneTopMargin, Integer.MIN_VALUE);
        writeDimension("app:layout_marginBottom", bottomMargin, 0);
        writeDimension("app:layout_goneMarginBottom", goneBottomMargin, Integer.MIN_VALUE);
        writeDimension("app:goneBaselineMargin", goneBaselineMargin, Integer.MIN_VALUE);
        writeDimension("app:baselineMargin", baselineMargin, 0);
        writeBoolen("app:layout_constrainedWidth", constrainedWidth, false);
        writeBoolen("app:layout_constrainedHeight", constrainedHeight, false);
        writeBoolen("app:barrierAllowsGoneWidgets", mBarrierAllowsGoneWidgets, true);
        writeVariable("app:layout_wrapBehaviorInParent", mWrapBehavior, 0.0F);
        writeXmlConstraint("app:baselineToBaseline", baselineToBaseline);
        writeXmlConstraint("app:baselineToBottom", baselineToBottom);
        writeXmlConstraint("app:baselineToTop", baselineToTop);
        writeXmlConstraint("app:layout_constraintBottom_toBottomOf", bottomToBottom);
        writeXmlConstraint("app:layout_constraintBottom_toTopOf", bottomToTop);
        writeXmlConstraint("app:layout_constraintEnd_toEndOf", endToEnd);
        writeXmlConstraint("app:layout_constraintEnd_toStartOf", endToStart);
        writeXmlConstraint("app:layout_constraintLeft_toLeftOf", leftToLeft);
        writeXmlConstraint("app:layout_constraintLeft_toRightOf", leftToRight);
        writeXmlConstraint("app:layout_constraintRight_toLeftOf", rightToLeft);
        writeXmlConstraint("app:layout_constraintRight_toRightOf", rightToRight);
        writeXmlConstraint("app:layout_constraintStart_toEndOf", startToEnd);
        writeXmlConstraint("app:layout_constraintStart_toStartOf", startToStart);
        writeXmlConstraint("app:layout_constraintTop_toBottomOf", topToBottom);
        writeXmlConstraint("app:layout_constraintTop_toTopOf", topToTop);
        localObject1 = new String[3];
        localObject1[0] = "spread";
        localObject1[1] = "wrap";
        localObject1[2] = "percent";
        writeEnum("app:layout_constraintHeight_default", heightDefault, (String[])localObject1, 0);
        writeVariable("app:layout_constraintHeight_percent", heightPercent, 1.0F);
        writeDimension("app:layout_constraintHeight_min", heightMin, 0);
        writeDimension("app:layout_constraintHeight_max", heightMax, 0);
        writeBoolen("android:layout_constrainedHeight", constrainedHeight, false);
        writeEnum("app:layout_constraintWidth_default", widthDefault, (String[])localObject1, 0);
        writeVariable("app:layout_constraintWidth_percent", widthPercent, 1.0F);
        writeDimension("app:layout_constraintWidth_min", widthMin, 0);
        writeDimension("app:layout_constraintWidth_max", widthMax, 0);
        writeBoolen("android:layout_constrainedWidth", constrainedWidth, false);
        writeVariable("app:layout_constraintVertical_weight", verticalWeight, -1.0F);
        writeVariable("app:layout_constraintHorizontal_weight", horizontalWeight, -1.0F);
        writeVariable("app:layout_constraintHorizontal_chainStyle", horizontalChainStyle);
        writeVariable("app:layout_constraintVertical_chainStyle", verticalChainStyle);
        writeEnum("app:barrierDirection", mBarrierDirection, new String[] { "left", "right", "top", "bottom", "start", "end" }, -1);
        writeVariable("app:layout_constraintTag", mConstraintTag, null);
        localObject2 = mReferenceIds;
        if (localObject2 != null) {
          writeVariable("'ReferenceIds'", (int[])localObject2);
        }
        writer.write(" />\n");
      }
      writer.write("</ConstraintSet>\n");
    }
    
    public void writeVariable(String paramString, float paramFloat1, float paramFloat2)
      throws IOException
    {
      if (paramFloat1 == paramFloat2) {
        return;
      }
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localWriter.write(localStringBuilder.toString());
      paramString = writer;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("=\"");
      localStringBuilder.append(paramFloat1);
      localStringBuilder.append("\"");
      paramString.write(localStringBuilder.toString());
    }
    
    public void writeVariable(String paramString, int paramInt)
      throws IOException
    {
      if ((paramInt != 0) && (paramInt != -1))
      {
        Writer localWriter = writer;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("\n       ");
        localStringBuilder.append(paramString);
        localStringBuilder.append("=\"");
        localStringBuilder.append(paramInt);
        localStringBuilder.append("\"\n");
        localWriter.write(localStringBuilder.toString());
      }
    }
    
    public void writeVariable(String paramString1, String paramString2)
      throws IOException
    {
      if (paramString2 == null) {
        return;
      }
      writer.write(paramString1);
      writer.write(":");
      paramString1 = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString2);
      paramString1.write(localStringBuilder.toString());
      writer.write("\n");
    }
    
    public void writeVariable(String paramString1, String paramString2, String paramString3)
      throws IOException
    {
      if ((paramString2 != null) && (!paramString2.equals(paramString3)))
      {
        Writer localWriter = writer;
        paramString3 = new StringBuilder();
        paramString3.append("\n       ");
        paramString3.append(paramString1);
        localWriter.write(paramString3.toString());
        paramString1 = writer;
        paramString3 = new StringBuilder();
        paramString3.append("=\"");
        paramString3.append(paramString2);
        paramString3.append("\"");
        paramString1.write(paramString3.toString());
      }
    }
    
    public void writeVariable(String paramString, int[] paramArrayOfInt)
      throws IOException
    {
      if (paramArrayOfInt == null) {
        return;
      }
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localWriter.write(localStringBuilder.toString());
      writer.write(":");
      for (int i = 0; i < paramArrayOfInt.length; i++)
      {
        localWriter = writer;
        localStringBuilder = new StringBuilder();
        if (i == 0) {
          paramString = "[";
        } else {
          paramString = ", ";
        }
        localStringBuilder.append(paramString);
        localStringBuilder.append(getName(paramArrayOfInt[i]));
        localWriter.write(localStringBuilder.toString());
      }
      writer.write("],\n");
    }
    
    public void writeXmlConstraint(String paramString, int paramInt)
      throws IOException
    {
      if (paramInt == -1) {
        return;
      }
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localWriter.write(localStringBuilder.toString());
      paramString = writer;
      localStringBuilder = z2.t("=\"");
      localStringBuilder.append(getName(paramInt));
      localStringBuilder.append("\"");
      paramString.write(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */