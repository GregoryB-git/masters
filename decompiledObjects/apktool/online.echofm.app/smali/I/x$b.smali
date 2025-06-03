.class public final LI/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LI/x$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LI/x$e;

    invoke-direct {v0}, LI/x$e;-><init>()V

    :goto_0
    iput-object v0, p0, LI/x$b;->a:LI/x$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LI/x$d;

    invoke-direct {v0}, LI/x$d;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, LI/x$c;

    invoke-direct {v0}, LI/x$c;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(LI/x;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LI/x$e;

    invoke-direct {v0, p1}, LI/x$e;-><init>(LI/x;)V

    :goto_0
    iput-object v0, p0, LI/x$b;->a:LI/x$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LI/x$d;

    invoke-direct {v0, p1}, LI/x$d;-><init>(LI/x;)V

    goto :goto_0

    :cond_1
    new-instance v0, LI/x$c;

    invoke-direct {v0, p1}, LI/x$c;-><init>(LI/x;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()LI/x;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x$b;->a:LI/x$f;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$f;->b()LI/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(LA/f;)LI/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x$b;->a:LI/x$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$f;->d(LA/f;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(LA/f;)LI/x$b;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x$b;->a:LI/x$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$f;->f(LA/f;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
