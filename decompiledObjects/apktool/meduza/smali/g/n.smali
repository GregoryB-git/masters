.class public Lg/n;
.super Lb/l;
.source "SourceFile"

# interfaces
.implements Lg/d;


# instance fields
.field public d:Lg/g;

.field public final e:Lg/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7f040079

    .line 3
    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance v2, Landroid/util/TypedValue;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 17
    .line 18
    .line 19
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, p2

    .line 23
    :goto_0
    invoke-direct {p0, p1, v2}, Lb/l;-><init>(Landroid/content/Context;I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lg/m;

    .line 27
    .line 28
    move-object v3, p0

    .line 29
    check-cast v3, Landroidx/appcompat/app/b;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Lg/m;-><init>(Landroidx/appcompat/app/b;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lg/n;->e:Lg/m;

    .line 35
    .line 36
    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    new-instance p2, Landroid/util/TypedValue;

    .line 43
    .line 44
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 52
    .line 53
    .line 54
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 55
    .line 56
    :cond_1
    move-object p1, v2

    .line 57
    check-cast p1, Lg/g;

    .line 58
    .line 59
    iput p2, p1, Lg/g;->c0:I

    .line 60
    .line 61
    invoke-virtual {v2}, Lg/f;->o()V

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg/f;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final c()Lg/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lg/n;->d:Lg/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lg/f;->a:Lg/r$a;

    .line 6
    .line 7
    new-instance v0, Lg/g;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Lg/g;-><init>(Landroid/content/Context;Landroid/view/Window;Lg/d;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lg/n;->d:Lg/g;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lg/n;->d:Lg/g;

    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final d(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0}, Lg/f;->p()V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lg/n;->e:Lg/m;

    invoke-static {v1, v0, p0, p1}, Le0/i;->b(Le0/i$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/f;->e(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0}, Lg/f;->l()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0}, Lg/f;->k()V

    invoke-super {p0, p1}, Lb/l;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object p1

    invoke-virtual {p1}, Lg/f;->o()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Lb/l;->onStop()V

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0}, Lg/f;->u()V

    return-void
.end method

.method public final onSupportActionModeFinished(Lj/a;)V
    .locals 0

    return-void
.end method

.method public final onSupportActionModeStarted(Lj/a;)V
    .locals 0

    return-void
.end method

.method public final onWindowStartingSupportActionMode(Lj/a$a;)Lj/a;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/f;->x(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/f;->y(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg/f;->z(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg/f;->C(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lg/n;->c()Lg/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/f;->C(Ljava/lang/CharSequence;)V

    return-void
.end method
