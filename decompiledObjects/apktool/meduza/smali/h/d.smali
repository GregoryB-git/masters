.class public Lh/d;
.super Lh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/d$a;
    }
.end annotation


# instance fields
.field public v:Lh/d$a;

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh/b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lh/d$a;Landroid/content/res/Resources;)V
    .locals 1

    invoke-direct {p0}, Lh/b;-><init>()V

    new-instance v0, Lh/d$a;

    invoke-direct {v0, p1, p0, p2}, Lh/d$a;-><init>(Lh/d$a;Lh/d;Landroid/content/res/Resources;)V

    invoke-virtual {p0, v0}, Lh/d;->e(Lh/b$c;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lh/d;->onStateChange([I)Z

    return-void
.end method


# virtual methods
.method public final applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-super {p0, p1}, Lh/b;->applyTheme(Landroid/content/res/Resources$Theme;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lh/d;->onStateChange([I)Z

    return-void
.end method

.method public bridge synthetic b()Lh/b$c;
    .locals 1

    invoke-virtual {p0}, Lh/d;->f()Lh/d$a;

    move-result-object v0

    return-object v0
.end method

.method public e(Lh/b$c;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lh/b;->a:Lh/b$c;

    .line 2
    .line 3
    iget v0, p0, Lh/b;->o:I

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lh/b$c;->d(I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lh/b;->c:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lh/b;->c(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lh/b;->d:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    instance-of v0, p1, Lh/d$a;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p1, Lh/d$a;

    .line 26
    .line 27
    iput-object p1, p0, Lh/d;->v:Lh/d$a;

    .line 28
    .line 29
    :cond_1
    return-void
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
.end method

.method public f()Lh/d$a;
    .locals 3

    new-instance v0, Lh/d$a;

    iget-object v1, p0, Lh/d;->v:Lh/d$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lh/d$a;-><init>(Lh/d$a;Lh/d;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, Lh/d;->w:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lh/b;->mutate()Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lh/d;->v:Lh/d$a;

    invoke-virtual {v0}, Lh/d$a;->e()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/d;->w:Z

    :cond_0
    return-object p0
.end method

.method public onStateChange([I)Z
    .locals 2

    invoke-super {p0, p1}, Lh/b;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, Lh/d;->v:Lh/d$a;

    invoke-virtual {v1, p1}, Lh/d$a;->f([I)I

    move-result p1

    if-gez p1, :cond_0

    iget-object p1, p0, Lh/d;->v:Lh/d$a;

    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p1, v1}, Lh/d$a;->f([I)I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, Lh/b;->d(I)Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
