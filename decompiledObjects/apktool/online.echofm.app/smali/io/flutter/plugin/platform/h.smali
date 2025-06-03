.class public Lio/flutter/plugin/platform/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugin/platform/h$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:LD5/o;

.field public final c:Lio/flutter/plugin/platform/h$d;

.field public d:LD5/o$j;

.field public e:I

.field public final f:LD5/o$h;


# direct methods
.method public constructor <init>(Landroid/app/Activity;LD5/o;Lio/flutter/plugin/platform/h$d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/flutter/plugin/platform/h$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/h$a;-><init>(Lio/flutter/plugin/platform/h;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/flutter/plugin/platform/h;->f:LD5/o$h;

    .line 10
    .line 11
    iput-object p1, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p2, p0, Lio/flutter/plugin/platform/h;->b:LD5/o;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, LD5/o;->l(LD5/o$h;)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Lio/flutter/plugin/platform/h;->c:Lio/flutter/plugin/platform/h$d;

    .line 19
    .line 20
    const/16 p1, 0x500

    .line 21
    .line 22
    iput p1, p0, Lio/flutter/plugin/platform/h;->e:I

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/platform/h;LD5/o$i;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->s(LD5/o$i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/platform/h;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->B(I)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugin/platform/h;LD5/o$e;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->r(LD5/o$e;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lio/flutter/plugin/platform/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->v(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugin/platform/h;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->p()Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lio/flutter/plugin/platform/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->D(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugin/platform/h;)LD5/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/flutter/plugin/platform/h;->b:LD5/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lio/flutter/plugin/platform/h;LD5/o$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->x(LD5/o$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lio/flutter/plugin/platform/h;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->A(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugin/platform/h;LD5/o$k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->z(LD5/o$k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lio/flutter/plugin/platform/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->y()V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugin/platform/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->u()V

    return-void
.end method

.method public static synthetic m(Lio/flutter/plugin/platform/h;LD5/o$j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->C(LD5/o$j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Lio/flutter/plugin/platform/h;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/h;->w(Z)V

    return-void
.end method

.method public static synthetic o(Lio/flutter/plugin/platform/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->t()V

    return-void
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x1706

    goto :goto_0

    :cond_0
    const/16 v0, 0x706

    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD5/o$l;

    sget-object v3, Lio/flutter/plugin/platform/h$c;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    and-int/lit16 v0, v0, -0x203

    goto :goto_2

    :cond_2
    and-int/lit8 v0, v0, -0x5

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iput v0, p0, Lio/flutter/plugin/platform/h;->e:I

    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->E()V

    return-void
.end method

.method public final B(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public final C(LD5/o$j;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, LI/X;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, LI/X;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v3, 0x1e

    .line 19
    .line 20
    if-ge v1, v3, :cond_0

    .line 21
    .line 22
    const/high16 v3, -0x80000000

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 25
    .line 26
    .line 27
    const/high16 v3, 0xc000000

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v3, p1, LD5/o$j;->b:LD5/o$d;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    sget-object v7, Lio/flutter/plugin/platform/h$c;->c:[I

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    aget v3, v7, v3

    .line 46
    .line 47
    if-eq v3, v6, :cond_2

    .line 48
    .line 49
    if-eq v3, v5, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v2, v4}, LI/X;->b(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {v2, v6}, LI/X;->b(Z)V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    iget-object v3, p1, LD5/o$j;->a:Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object v3, p1, LD5/o$j;->c:Ljava/lang/Boolean;

    .line 71
    .line 72
    const/16 v7, 0x1d

    .line 73
    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    if-lt v1, v7, :cond_5

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v0, v3}, Lio/flutter/plugin/platform/c;->a(Landroid/view/Window;Z)V

    .line 83
    .line 84
    .line 85
    :cond_5
    const/16 v3, 0x1a

    .line 86
    .line 87
    if-lt v1, v3, :cond_9

    .line 88
    .line 89
    iget-object v3, p1, LD5/o$j;->e:LD5/o$d;

    .line 90
    .line 91
    if-eqz v3, :cond_8

    .line 92
    .line 93
    sget-object v8, Lio/flutter/plugin/platform/h$c;->c:[I

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    aget v3, v8, v3

    .line 100
    .line 101
    if-eq v3, v6, :cond_7

    .line 102
    .line 103
    if-eq v3, v5, :cond_6

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    invoke-virtual {v2, v4}, LI/X;->a(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    invoke-virtual {v2, v6}, LI/X;->a(Z)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_1
    iget-object v2, p1, LD5/o$j;->d:Ljava/lang/Integer;

    .line 114
    .line 115
    if-eqz v2, :cond_9

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v0, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 122
    .line 123
    .line 124
    :cond_9
    iget-object v2, p1, LD5/o$j;->f:Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v2, :cond_a

    .line 127
    .line 128
    const/16 v3, 0x1c

    .line 129
    .line 130
    if-lt v1, v3, :cond_a

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-static {v0, v2}, Lio/flutter/plugin/platform/d;->a(Landroid/view/Window;I)V

    .line 137
    .line 138
    .line 139
    :cond_a
    iget-object v2, p1, LD5/o$j;->g:Ljava/lang/Boolean;

    .line 140
    .line 141
    if-eqz v2, :cond_b

    .line 142
    .line 143
    if-lt v1, v7, :cond_b

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v0, v1}, Lio/flutter/plugin/platform/e;->a(Landroid/view/Window;Z)V

    .line 150
    .line 151
    .line 152
    :cond_b
    iput-object p1, p0, Lio/flutter/plugin/platform/h;->d:LD5/o$j;

    .line 153
    .line 154
    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lio/flutter/plugin/platform/h;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    iget-object v0, p0, Lio/flutter/plugin/platform/h;->d:LD5/o$j;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/h;->C(LD5/o$j;)V

    :cond_0
    return-void
.end method

.method public F(LD5/o$g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lio/flutter/plugin/platform/h$c;->a:[I

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    aget p1, v1, p1

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p1, v2, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq p1, v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    if-eq p1, v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 p1, 0x6

    .line 40
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    return-void
.end method

.method public final p()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const-string v1, "text/*"

    invoke-virtual {v0, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->b:LD5/o;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LD5/o;->l(LD5/o$h;)V

    return-void
.end method

.method public final r(LD5/o$e;)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    const-string v0, "PlatformPlugin"

    .line 2
    .line 3
    iget-object v1, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 4
    .line 5
    const-string v2, "clipboard"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/content/ClipboardManager;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    return-object v3

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_1
    if-eqz p1, :cond_3

    .line 29
    .line 30
    sget-object v2, LD5/o$e;->p:LD5/o$e;

    .line 31
    .line 32
    if-ne p1, v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return-object v3

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception p1

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 41
    invoke-virtual {v1, p1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    if-nez v1, :cond_6

    .line 50
    .line 51
    :try_start_1
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    const-string p1, "Clipboard item contained no textual content nor a URI to retrieve it from."

    .line 58
    .line 59
    invoke-static {v0, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :catch_2
    move-exception p1

    .line 64
    move-object v3, v1

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "content"

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v2, "Clipboard item contains a Uri with scheme \'"

    .line 84
    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v2, "\'that is unhandled."

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v0, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :cond_5
    iget-object v4, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 105
    .line 106
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const-string v5, "text/*"

    .line 111
    .line 112
    invoke-virtual {v4, v2, v5, v3}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object v4, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 117
    .line 118
    invoke-virtual {p1, v4}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 125
    .line 126
    .line 127
    :cond_6
    return-object v1

    .line 128
    :goto_1
    const-string v1, "Failed to close AssetFileDescriptor while trying to read text from URI."

    .line 129
    .line 130
    invoke-static {v0, v1, p1}, Lt5/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    return-object v3

    .line 134
    :catch_3
    const-string p1, "Clipboard text was unable to be received from content URI."

    .line 135
    .line 136
    invoke-static {v0, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v3

    .line 140
    :goto_2
    const-string v1, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"

    .line 141
    .line 142
    invoke-static {v0, v1, p1}, Lt5/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    return-object v3
.end method

.method public final s(LD5/o$i;)V
    .locals 1

    .line 1
    sget-object v0, LD5/o$i;->p:LD5/o$i;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->playSoundEffect(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->c:Lio/flutter/plugin/platform/h$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/plugin/platform/h$d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    instance-of v1, v0, Landroidx/activity/c;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/activity/c;

    invoke-interface {v0}, Landroidx/activity/c;->j()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final u()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->E()V

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v1, "text label?"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method

.method public final w(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->c:Lio/flutter/plugin/platform/h$d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/flutter/plugin/platform/h$d;->f(Z)V

    :cond_0
    return-void
.end method

.method public final x(LD5/o$c;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 8
    .line 9
    new-instance v1, Landroid/app/ActivityManager$TaskDescription;

    .line 10
    .line 11
    iget-object v2, p1, LD5/o$c;->b:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    iget p1, p1, LD5/o$c;->a:I

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, p1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, Lio/flutter/plugin/platform/g;->a()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p1, LD5/o$c;->b:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iget p1, p1, LD5/o$c;->a:I

    .line 30
    .line 31
    invoke-static {v0, v1, p1}, Lio/flutter/plugin/platform/f;->a(Ljava/lang/String;II)Landroid/app/ActivityManager$TaskDescription;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/h;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lio/flutter/plugin/platform/h$b;

    invoke-direct {v1, p0, v0}, Lio/flutter/plugin/platform/h$b;-><init>(Lio/flutter/plugin/platform/h;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method

.method public final z(LD5/o$k;)V
    .locals 1

    .line 1
    sget-object v0, LD5/o$k;->p:LD5/o$k;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x706

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, LD5/o$k;->q:LD5/o$k;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    const/16 p1, 0xf06

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object v0, LD5/o$k;->r:LD5/o$k;

    .line 16
    .line 17
    if-ne p1, v0, :cond_2

    .line 18
    .line 19
    const/16 p1, 0x1706

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object v0, LD5/o$k;->s:LD5/o$k;

    .line 23
    .line 24
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v0, 0x1d

    .line 29
    .line 30
    if-lt p1, v0, :cond_3

    .line 31
    .line 32
    const/16 p1, 0x700

    .line 33
    .line 34
    :goto_0
    iput p1, p0, Lio/flutter/plugin/platform/h;->e:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lio/flutter/plugin/platform/h;->E()V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method
