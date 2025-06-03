.class public Lu5/D;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements LG5/b$c;
.implements Lu5/L$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu5/D$f;
    }
.end annotation


# instance fields
.field public A:LF5/e;

.field public B:Lu5/L;

.field public C:Lu5/c;

.field public D:Lio/flutter/view/i;

.field public E:Landroid/view/textservice/TextServicesManager;

.field public F:Lu5/Q;

.field public final G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

.field public final H:Lio/flutter/view/i$k;

.field public final I:Landroid/database/ContentObserver;

.field public final J:Lio/flutter/embedding/engine/renderer/j;

.field public final K:LH/a;

.field public o:Lu5/s;

.field public p:Lu5/t;

.field public q:Lu5/r;

.field public r:Lio/flutter/embedding/engine/renderer/k;

.field public s:Lio/flutter/embedding/engine/renderer/k;

.field public final t:Ljava/util/Set;

.field public u:Z

.field public v:Lio/flutter/embedding/engine/a;

.field public final w:Ljava/util/Set;

.field public x:LG5/b;

.field public y:Lio/flutter/plugin/editing/C;

.field public z:Lio/flutter/plugin/editing/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lu5/s;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lu5/D;->t:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lu5/D;->w:Ljava/util/Set;

    new-instance p1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;-><init>()V

    iput-object p1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    new-instance p1, Lu5/D$a;

    invoke-direct {p1, p0}, Lu5/D$a;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->H:Lio/flutter/view/i$k;

    new-instance p1, Lu5/D$b;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, p0, p2}, Lu5/D$b;-><init>(Lu5/D;Landroid/os/Handler;)V

    iput-object p1, p0, Lu5/D;->I:Landroid/database/ContentObserver;

    new-instance p1, Lu5/D$c;

    invoke-direct {p1, p0}, Lu5/D$c;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->J:Lio/flutter/embedding/engine/renderer/j;

    new-instance p1, Lu5/D$d;

    invoke-direct {p1, p0}, Lu5/D$d;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->K:LH/a;

    iput-object p3, p0, Lu5/D;->o:Lu5/s;

    iput-object p3, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    invoke-virtual {p0}, Lu5/D;->u()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lu5/t;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lu5/D;->t:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lu5/D;->w:Ljava/util/Set;

    new-instance p1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-direct {p1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;-><init>()V

    iput-object p1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    new-instance p1, Lu5/D$a;

    invoke-direct {p1, p0}, Lu5/D$a;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->H:Lio/flutter/view/i$k;

    new-instance p1, Lu5/D$b;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, p0, p2}, Lu5/D$b;-><init>(Lu5/D;Landroid/os/Handler;)V

    iput-object p1, p0, Lu5/D;->I:Landroid/database/ContentObserver;

    new-instance p1, Lu5/D$c;

    invoke-direct {p1, p0}, Lu5/D$c;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->J:Lio/flutter/embedding/engine/renderer/j;

    new-instance p1, Lu5/D$d;

    invoke-direct {p1, p0}, Lu5/D$d;-><init>(Lu5/D;)V

    iput-object p1, p0, Lu5/D;->K:LH/a;

    iput-object p3, p0, Lu5/D;->p:Lu5/t;

    iput-object p3, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    invoke-virtual {p0}, Lu5/D;->u()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lu5/s;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lu5/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lu5/s;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lu5/t;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lu5/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lu5/t;)V

    return-void
.end method

.method public static synthetic d(Landroid/view/textservice/SpellCheckerInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lu5/D;->w(Landroid/view/textservice/SpellCheckerInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Lu5/D;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lu5/D;->z(ZZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lu5/D;)Lio/flutter/embedding/engine/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lu5/D;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lu5/D;->u:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic h(Lu5/D;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lu5/D;->t:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lu5/D;)Lu5/r;
    .locals 0

    .line 1
    iget-object p0, p0, Lu5/D;->q:Lu5/r;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(Lu5/D;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu5/D;->x()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Landroid/view/textservice/SpellCheckerInfo;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/textservice/SpellCheckerInfo;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "com.google.android.inputmethod.latin"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public A(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 2
    .line 3
    const-string v1, "FlutterView"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Tried to revert the image view, but no image view is used."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lu5/D;->s:Lio/flutter/embedding/engine/renderer/k;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string p1, "Tried to revert the image view, but no previous surface was used."

    .line 18
    .line 19
    invoke-static {v1, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iput-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lu5/D;->s:Lio/flutter/embedding/engine/renderer/k;

    .line 27
    .line 28
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 29
    .line 30
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object v1, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 42
    .line 43
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/k;->b()V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lu5/D$e;

    .line 47
    .line 48
    invoke-direct {v1, p0, v0, p1}, Lu5/D$e;-><init>(Lu5/D;Lio/flutter/embedding/engine/renderer/FlutterRenderer;Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->f(Lio/flutter/embedding/engine/renderer/j;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :goto_0
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 56
    .line 57
    invoke-virtual {v0}, Lu5/r;->a()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lu5/D;->x()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public B()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, 0x30

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget-object v0, LD5/t$c;->q:LD5/t$c;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v0, LD5/t$c;->p:LD5/t$c;

    .line 21
    .line 22
    :goto_0
    iget-object v1, p0, Lu5/D;->E:Landroid/view/textservice/TextServicesManager;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v5, 0x1f

    .line 31
    .line 32
    if-lt v4, v5, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Lu5/v;->a(Landroid/view/textservice/TextServicesManager;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lu5/w;->a(Ljava/util/List;)Ljava/util/stream/Stream;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v4, Lu5/C;

    .line 43
    .line 44
    invoke-direct {v4}, Lu5/C;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v4}, Lu5/x;->a(Ljava/util/stream/Stream;Ljava/util/function/Predicate;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v4, p0, Lu5/D;->E:Landroid/view/textservice/TextServicesManager;

    .line 52
    .line 53
    invoke-static {v4}, Lu5/y;->a(Landroid/view/textservice/TextServicesManager;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    :cond_1
    move v1, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v1, v2

    .line 64
    :goto_1
    iget-object v4, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 65
    .line 66
    invoke-virtual {v4}, Lio/flutter/embedding/engine/a;->v()LD5/t;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, LD5/t;->d()LD5/t$b;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    iget v5, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 83
    .line 84
    invoke-virtual {v4, v5}, LD5/t$b;->f(F)LD5/t$b;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4, v5}, LD5/t$b;->c(Landroid/util/DisplayMetrics;)LD5/t$b;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4, v1}, LD5/t$b;->d(Z)LD5/t$b;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const-string v5, "show_password"

    .line 113
    .line 114
    invoke-static {v4, v5, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-ne v4, v3, :cond_3

    .line 119
    .line 120
    move v2, v3

    .line 121
    :cond_3
    invoke-virtual {v1, v2}, LD5/t$b;->b(Z)LD5/t$b;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-virtual {v1, v2}, LD5/t$b;->g(Z)LD5/t$b;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1, v0}, LD5/t$b;->e(LD5/t$c;)LD5/t$b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, LD5/t$b;->a()V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final C()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "FlutterView"

    .line 8
    .line 9
    const-string v1, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine."

    .line 10
    .line 11
    invoke-static {v0, v1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 26
    .line 27
    iput v1, v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->a:F

    .line 28
    .line 29
    iget-object v0, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iput v1, v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->p:I

    .line 44
    .line 45
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 46
    .line 47
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->n(Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public a(Landroid/view/KeyEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/C;->j(Landroid/util/SparseArray;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(I)Landroid/view/PointerIcon;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lu5/B;->a(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public c(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/C;->p(Landroid/view/KeyEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/r;->y(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->checkInputConnectionProxy(Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    return p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lu5/D;->B:Lu5/L;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lu5/L;->b(Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/4 v1, 0x0

    .line 57
    :cond_4
    :goto_1
    return v1
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/view/i;->B()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public getAttachedFlutterEngine()Lio/flutter/embedding/engine/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBinaryMessenger()LE5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getCurrentImageSurface()Lu5/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu5/r;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public l(Lio/flutter/embedding/engine/renderer/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->t:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Lu5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lu5/r;->c(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public n(Lio/flutter/embedding/engine/a;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attaching to a FlutterEngine: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterView"

    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu5/D;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    if-ne p1, v0, :cond_0

    const-string p1, "Already attached to this engine. Doing nothing."

    invoke-static {v1, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "Currently attached to a different engine. Detaching and then attaching to new engine."

    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu5/D;->s()V

    :cond_1
    iput-object p1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->h()Z

    move-result v2

    iput-boolean v2, p0, Lu5/D;->u:Z

    iget-object v2, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    invoke-interface {v2, v0}, Lio/flutter/embedding/engine/renderer/k;->c(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V

    iget-object v2, p0, Lu5/D;->J:Lio/flutter/embedding/engine/renderer/j;

    invoke-virtual {v0, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->f(Lio/flutter/embedding/engine/renderer/j;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_2

    new-instance v0, LG5/b;

    iget-object v2, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->n()LD5/m;

    move-result-object v2

    invoke-direct {v0, p0, v2}, LG5/b;-><init>(LG5/b$c;LD5/m;)V

    iput-object v0, p0, Lu5/D;->x:LG5/b;

    :cond_2
    new-instance v0, Lio/flutter/plugin/editing/C;

    iget-object v2, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->y()LD5/w;

    move-result-object v2

    iget-object v3, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    move-result-object v3

    invoke-direct {v0, p0, v2, v3}, Lio/flutter/plugin/editing/C;-><init>(Landroid/view/View;LD5/w;Lio/flutter/plugin/platform/r;)V

    iput-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "textservices"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/textservice/TextServicesManager;

    iput-object v0, p0, Lu5/D;->E:Landroid/view/textservice/TextServicesManager;

    new-instance v2, Lio/flutter/plugin/editing/n;

    iget-object v3, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/a;->w()LD5/u;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lio/flutter/plugin/editing/n;-><init>(Landroid/view/textservice/TextServicesManager;LD5/u;)V

    iput-object v2, p0, Lu5/D;->z:Lio/flutter/plugin/editing/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "TextServicesManager not supported by device, spell check disabled."

    invoke-static {v1, v0}, Lt5/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->m()LF5/e;

    move-result-object v0

    iput-object v0, p0, Lu5/D;->A:LF5/e;

    new-instance v0, Lu5/L;

    invoke-direct {v0, p0}, Lu5/L;-><init>(Lu5/L$e;)V

    iput-object v0, p0, Lu5/D;->B:Lu5/L;

    new-instance v0, Lu5/c;

    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu5/c;-><init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)V

    iput-object v0, p0, Lu5/D;->C:Lu5/c;

    new-instance v0, Lio/flutter/view/i;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->h()LD5/a;

    move-result-object v5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "accessibility"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    move-result-object v8

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lio/flutter/view/i;-><init>(Landroid/view/View;LD5/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/o;)V

    iput-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    iget-object v1, p0, Lu5/D;->H:Lio/flutter/view/i$k;

    invoke-virtual {v0, v1}, Lio/flutter/view/i;->Z(Lio/flutter/view/i$k;)V

    iget-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    invoke-virtual {v0}, Lio/flutter/view/i;->B()Z

    move-result v0

    iget-object v1, p0, Lu5/D;->D:Lio/flutter/view/i;

    invoke-virtual {v1}, Lio/flutter/view/i;->D()Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Lu5/D;->z(ZZ)V

    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    move-result-object v0

    iget-object v1, p0, Lu5/D;->D:Lio/flutter/view/i;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/r;->a(Lio/flutter/view/i;)V

    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    move-result-object v0

    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/r;->w(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V

    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/C;->o()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    invoke-virtual {p0}, Lu5/D;->B()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "show_password"

    invoke-static {v1}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v3, p0, Lu5/D;->I:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    invoke-virtual {p0}, Lu5/D;->C()V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    move-result-object p1

    invoke-virtual {p1, p0}, Lio/flutter/plugin/platform/r;->x(Lu5/D;)V

    iget-object p1, p0, Lu5/D;->w:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean p1, p0, Lu5/D;->u:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lu5/D;->J:Lio/flutter/embedding/engine/renderer/j;

    invoke-interface {p1}, Lio/flutter/embedding/engine/renderer/j;->e()V

    :cond_3
    return-void

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final o()Lu5/D$f;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 14
    .line 15
    const-string v2, "window"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/WindowManager;

    .line 22
    .line 23
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v2, 0x2

    .line 32
    if-ne v1, v2, :cond_3

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    sget-object v0, Lu5/D$f;->q:Lu5/D$f;

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    const/4 v1, 0x3

    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    sget-object v0, Lu5/D$f;->p:Lu5/D$f;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    if-eqz v0, :cond_2

    .line 47
    .line 48
    if-ne v0, v2, :cond_3

    .line 49
    .line 50
    :cond_2
    sget-object v0, Lu5/D$f;->r:Lu5/D$f;

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    sget-object v0, Lu5/D$f;->o:Lu5/D$f;

    .line 54
    .line 55
    return-object v0
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LI/L;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v2

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v2}, LA/c;->a(Landroid/graphics/Insets;)I

    move-result v4

    iput v4, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->l:I

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v2}, LA/d;->a(Landroid/graphics/Insets;)I

    move-result v4

    iput v4, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->m:I

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v2}, LA/e;->a(Landroid/graphics/Insets;)I

    move-result v4

    iput v4, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->n:I

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v2}, LA/b;->a(Landroid/graphics/Insets;)I

    move-result v2

    iput v2, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->o:I

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v2

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v5

    and-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    const/16 v5, 0x1e

    if-lt v1, v5, :cond_5

    if-eqz v3, :cond_3

    invoke-static {}, LI/P;->a()I

    move-result v4

    :cond_3
    if-eqz v2, :cond_4

    invoke-static {}, LI/O;->a()I

    move-result v1

    or-int/2addr v4, v1

    :cond_4
    invoke-static {p1, v4}, LI/M;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/c;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->d:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/d;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->e:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/e;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->f:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/b;->a(Landroid/graphics/Insets;)I

    move-result v1

    iput v1, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->g:I

    invoke-static {}, LI/S;->a()I

    move-result v1

    invoke-static {p1, v1}, LI/M;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/c;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->h:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/d;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->i:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/e;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->j:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/b;->a(Landroid/graphics/Insets;)I

    move-result v1

    iput v1, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->k:I

    invoke-static {}, LI/T;->a()I

    move-result v1

    invoke-static {p1, v1}, LI/M;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/c;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->l:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/d;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->m:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/e;->a(Landroid/graphics/Insets;)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->n:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    invoke-static {v1}, LA/b;->a(Landroid/graphics/Insets;)I

    move-result v1

    iput v1, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->o:I

    invoke-static {p1}, LI/G;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-static {p1}, Lu5/u;->a(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->d:I

    invoke-static {v1}, LA/c;->a(Landroid/graphics/Insets;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {p1}, Landroidx/window/layout/h;->a(Landroid/view/DisplayCutout;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->d:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->e:I

    invoke-static {v1}, LA/d;->a(Landroid/graphics/Insets;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {p1}, Landroidx/window/layout/e;->a(Landroid/view/DisplayCutout;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->e:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->f:I

    invoke-static {v1}, LA/e;->a(Landroid/graphics/Insets;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {p1}, Landroidx/window/layout/f;->a(Landroid/view/DisplayCutout;)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->f:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->g:I

    invoke-static {v1}, LA/b;->a(Landroid/graphics/Insets;)I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p1}, Landroidx/window/layout/g;->a(Landroid/view/DisplayCutout;)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->g:I

    goto :goto_8

    :cond_5
    sget-object v1, Lu5/D$f;->o:Lu5/D$f;

    if-nez v3, :cond_6

    invoke-virtual {p0}, Lu5/D;->o()Lu5/D$f;

    move-result-object v1

    :cond_6
    iget-object v5, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    goto :goto_2

    :cond_7
    move v2, v4

    :goto_2
    iput v2, v5, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->d:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    sget-object v5, Lu5/D$f;->q:Lu5/D$f;

    if-eq v1, v5, :cond_9

    sget-object v5, Lu5/D$f;->r:Lu5/D$f;

    if-ne v1, v5, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v5

    goto :goto_4

    :cond_9
    :goto_3
    move v5, v4

    :goto_4
    iput v5, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->e:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    if-eqz v3, :cond_a

    invoke-virtual {p0, p1}, Lu5/D;->t(Landroid/view/WindowInsets;)I

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    goto :goto_5

    :cond_a
    move v3, v4

    :goto_5
    iput v3, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->f:I

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    sget-object v3, Lu5/D$f;->p:Lu5/D$f;

    if-eq v1, v3, :cond_c

    sget-object v3, Lu5/D$f;->r:Lu5/D$f;

    if-ne v1, v3, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v1

    goto :goto_7

    :cond_c
    :goto_6
    move v1, v4

    :goto_7
    iput v1, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->g:I

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iput v4, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->h:I

    iput v4, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->i:I

    invoke-virtual {p0, p1}, Lu5/D;->t(Landroid/view/WindowInsets;)I

    move-result p1

    iput p1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->j:I

    iget-object p1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iput v4, p1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->k:I

    :cond_d
    :goto_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->d:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Left: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v2, v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->g:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", Right: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->e:I

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\nKeyboard insets: Bottom: "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v3, v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->j:I

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->k:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->i:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "System Gesture Insets - Left: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->o:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Top: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->l:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->m:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Bottom: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    iget v1, v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->j:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FlutterView"

    invoke-static {v1, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu5/D;->C()V

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lu5/D;->r()Lu5/Q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lu5/D;->F:Lu5/Q;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, LT5/g;->b(Landroid/content/Context;)Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lu5/D;->F:Lu5/Q;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lx/a;->e(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Lu5/D;->K:LH/a;

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2, v3}, Lu5/Q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;LH/a;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FlutterView"

    .line 9
    .line 10
    const-string v1, "Configuration changed. Sending locales and user settings to Flutter."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/D;->A:LF5/e;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LF5/e;->d(Landroid/content/res/Configuration;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lu5/D;->B()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 28
    .line 29
    invoke-static {p1, v0}, LT5/g;->a(Landroid/content/Context;LT5/g$a;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 13
    .line 14
    iget-object v1, p0, Lu5/D;->B:Lu5/L;

    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, p1}, Lio/flutter/plugin/editing/C;->m(Landroid/view/View;Lu5/L;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/D;->F:Lu5/Q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lu5/D;->K:LH/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lu5/Q;->b(LH/a;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lu5/D;->F:Lu5/Q;

    .line 12
    .line 13
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu5/D;->C:Lu5/c;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, Lu5/c;->j(Landroid/view/MotionEvent;Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    :goto_0
    return p1
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/flutter/view/i;->K(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/C;->x(Landroid/view/ViewStructure;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "Size changed. Sending Flutter new viewport metrics. FlutterView was "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p3, " x "

    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p4, ", it is now "

    .line 26
    .line 27
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    const-string p4, "FlutterView"

    .line 44
    .line 45
    invoke-static {p4, p3}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object p3, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    .line 49
    .line 50
    iput p1, p3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->b:I

    .line 51
    .line 52
    iput p2, p3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->c:I

    .line 53
    .line 54
    invoke-virtual {p0}, Lu5/D;->C()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/D;->C:Lu5/c;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lu5/c;->k(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/flutter/embedding/engine/renderer/k;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lu5/D;->q()Lu5/r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0, v1, v2}, Lu5/r;->k(II)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 32
    .line 33
    iput-object v0, p0, Lu5/D;->s:Lio/flutter/embedding/engine/renderer/k;

    .line 34
    .line 35
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 36
    .line 37
    iput-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 38
    .line 39
    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/renderer/k;->c(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public q()Lu5/r;
    .locals 5

    .line 1
    new-instance v0, Lu5/r;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sget-object v4, Lu5/r$b;->o:Lu5/r$b;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lu5/r;-><init>(Landroid/content/Context;IILu5/r$b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public r()Lu5/Q;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lu5/Q;

    .line 2
    .line 3
    new-instance v1, Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;

    .line 4
    .line 5
    sget-object v2, Landroidx/window/layout/WindowInfoTracker;->Companion:Landroidx/window/layout/WindowInfoTracker$Companion;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Landroidx/window/layout/WindowInfoTracker$Companion;->getOrCreate(Landroid/content/Context;)Landroidx/window/layout/WindowInfoTracker;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;-><init>(Landroidx/window/layout/WindowInfoTracker;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lu5/Q;-><init>(Landroidx/window/java/layout/WindowInfoTrackerCallbackAdapter;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :catch_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public s()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Detaching from a FlutterEngine: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "FlutterView"

    .line 21
    .line 22
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lu5/D;->v()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const-string v0, "FlutterView not attached to an engine. Not detaching."

    .line 32
    .line 33
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lu5/D;->w:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    if-nez v1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lu5/D;->I:Landroid/database/ContentObserver;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 64
    .line 65
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->F()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 73
    .line 74
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->d()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lu5/D;->D:Lio/flutter/view/i;

    .line 82
    .line 83
    invoke-virtual {v0}, Lio/flutter/view/i;->R()V

    .line 84
    .line 85
    .line 86
    iput-object v2, p0, Lu5/D;->D:Lio/flutter/view/i;

    .line 87
    .line 88
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 89
    .line 90
    invoke-virtual {v0}, Lio/flutter/plugin/editing/C;->o()Landroid/view/inputmethod/InputMethodManager;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0, p0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lu5/D;->y:Lio/flutter/plugin/editing/C;

    .line 98
    .line 99
    invoke-virtual {v0}, Lio/flutter/plugin/editing/C;->n()V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lu5/D;->B:Lu5/L;

    .line 103
    .line 104
    invoke-virtual {v0}, Lu5/L;->d()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lu5/D;->z:Lio/flutter/plugin/editing/n;

    .line 108
    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    invoke-virtual {v0}, Lio/flutter/plugin/editing/n;->b()V

    .line 112
    .line 113
    .line 114
    :cond_1
    iget-object v0, p0, Lu5/D;->x:LG5/b;

    .line 115
    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    invoke-virtual {v0}, LG5/b;->c()V

    .line 119
    .line 120
    .line 121
    :cond_2
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 122
    .line 123
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v1, 0x0

    .line 128
    iput-boolean v1, p0, Lu5/D;->u:Z

    .line 129
    .line 130
    iget-object v3, p0, Lu5/D;->J:Lio/flutter/embedding/engine/renderer/j;

    .line 131
    .line 132
    invoke-virtual {v0, v3}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->k(Lio/flutter/embedding/engine/renderer/j;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->p()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->m(Z)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lu5/D;->s:Lio/flutter/embedding/engine/renderer/k;

    .line 142
    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    iget-object v1, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 146
    .line 147
    iget-object v3, p0, Lu5/D;->q:Lu5/r;

    .line 148
    .line 149
    if-ne v1, v3, :cond_3

    .line 150
    .line 151
    iput-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 152
    .line 153
    :cond_3
    iget-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 154
    .line 155
    invoke-interface {v0}, Lio/flutter/embedding/engine/renderer/k;->a()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Lu5/D;->x()V

    .line 159
    .line 160
    .line 161
    iput-object v2, p0, Lu5/D;->s:Lio/flutter/embedding/engine/renderer/k;

    .line 162
    .line 163
    iput-object v2, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    throw v2
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 5
    .line 6
    instance-of v1, v0, Lu5/s;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lu5/s;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setWindowInfoListenerDisplayFeatures(Landroidx/window/layout/WindowLayoutInfo;)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/window/layout/WindowLayoutInfo;->getDisplayFeatures()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v2, "FlutterView"

    .line 19
    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/window/layout/DisplayFeature;

    .line 27
    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v4, "WindowInfoTracker Display Feature reported with bounds = "

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Landroidx/window/layout/DisplayFeature;->getBounds()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v4, " and type = "

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v2, v3}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    instance-of v2, v1, Landroidx/window/layout/FoldingFeature;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    move-object v2, v1

    .line 77
    check-cast v2, Landroidx/window/layout/FoldingFeature;

    .line 78
    .line 79
    invoke-interface {v2}, Landroidx/window/layout/FoldingFeature;->getOcclusionType()Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, Landroidx/window/layout/FoldingFeature$OcclusionType;->FULL:Landroidx/window/layout/FoldingFeature$OcclusionType;

    .line 84
    .line 85
    if-ne v3, v4, :cond_0

    .line 86
    .line 87
    sget-object v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;->r:Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    sget-object v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;->q:Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;

    .line 91
    .line 92
    :goto_1
    invoke-interface {v2}, Landroidx/window/layout/FoldingFeature;->getState()Landroidx/window/layout/FoldingFeature$State;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    sget-object v5, Landroidx/window/layout/FoldingFeature$State;->FLAT:Landroidx/window/layout/FoldingFeature$State;

    .line 97
    .line 98
    if-ne v4, v5, :cond_1

    .line 99
    .line 100
    sget-object v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->q:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-interface {v2}, Landroidx/window/layout/FoldingFeature;->getState()Landroidx/window/layout/FoldingFeature$State;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    sget-object v4, Landroidx/window/layout/FoldingFeature$State;->HALF_OPENED:Landroidx/window/layout/FoldingFeature$State;

    .line 108
    .line 109
    if-ne v2, v4, :cond_2

    .line 110
    .line 111
    sget-object v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->r:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    sget-object v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    .line 115
    .line 116
    :goto_2
    new-instance v4, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;

    .line 117
    .line 118
    invoke-interface {v1}, Landroidx/window/layout/DisplayFeature;->getBounds()Landroid/graphics/Rect;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v4, v1, v3, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;-><init>(Landroid/graphics/Rect;Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    new-instance v2, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;

    .line 130
    .line 131
    invoke-interface {v1}, Landroidx/window/layout/DisplayFeature;->getBounds()Landroid/graphics/Rect;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    sget-object v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;->p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;

    .line 136
    .line 137
    sget-object v4, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    .line 138
    .line 139
    invoke-direct {v2, v1, v3, v4}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;-><init>(Landroid/graphics/Rect;Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 148
    .line 149
    const/16 v1, 0x1c

    .line 150
    .line 151
    if-lt p1, v1, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    invoke-static {p1}, LI/G;->a(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-eqz p1, :cond_5

    .line 164
    .line 165
    invoke-static {p1}, Lu5/A;->a(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Landroid/graphics/Rect;

    .line 184
    .line 185
    new-instance v3, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v4, "DisplayCutout area reported with bounds = "

    .line 191
    .line 192
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v2, v3}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    new-instance v3, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;

    .line 210
    .line 211
    sget-object v4, Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;->s:Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;

    .line 212
    .line 213
    invoke-direct {v3, v1, v4}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$b;-><init>(Landroid/graphics/Rect;Lio/flutter/embedding/engine/renderer/FlutterRenderer$d;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_5
    iget-object p1, p0, Lu5/D;->G:Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;

    .line 221
    .line 222
    iput-object v0, p1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$f;->q:Ljava/util/List;

    .line 223
    .line 224
    invoke-virtual {p0}, Lu5/D;->C()V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public final t(Landroid/view/WindowInsets;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-double v1, v1

    .line 14
    int-to-double v3, v0

    .line 15
    const-wide v5, 0x3fc70a3d70a3d70aL    # 0.18

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    mul-double/2addr v3, v5

    .line 21
    cmpg-double v0, v1, v3

    .line 22
    .line 23
    if-gez v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final u()V
    .locals 3

    .line 1
    const-string v0, "Initializing FlutterView"

    .line 2
    .line 3
    const-string v1, "FlutterView"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu5/D;->o:Lu5/s;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "Internally using a FlutterSurfaceView."

    .line 13
    .line 14
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lu5/D;->o:Lu5/s;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v0, p0, Lu5/D;->p:Lu5/t;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string v0, "Internally using a FlutterTextureView."

    .line 28
    .line 29
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lu5/D;->p:Lu5/t;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v0, "Internally using a FlutterImageView."

    .line 36
    .line 37
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    const/4 v0, 0x1

    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 48
    .line 49
    .line 50
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v2, 0x1a

    .line 53
    .line 54
    if-lt v1, v2, :cond_2

    .line 55
    .line 56
    invoke-static {p0, v0}, Lu5/z;->a(Lu5/D;I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public v()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lu5/D;->r:Lio/flutter/embedding/engine/renderer/k;

    .line 10
    .line 11
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/k;->getAttachedRenderer()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu5/r;->f()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lu5/D;->q:Lu5/r;

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public y(Lio/flutter/embedding/engine/renderer/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/D;->t:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z(ZZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/D;->v:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
