.class public LF/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LF/g$c;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(LF/g$c;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/a;->a:LF/g$c;

    .line 5
    .line 6
    iput-object p2, p0, LF/a;->b:Landroid/os/Handler;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LF/a;->a:LF/g$c;

    .line 2
    .line 3
    iget-object v1, p0, LF/a;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, LF/a$b;

    .line 6
    .line 7
    invoke-direct {v2, p0, v0, p1}, LF/a$b;-><init>(LF/a;LF/g$c;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b(LF/f$e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LF/f$e;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, LF/f$e;->a:Landroid/graphics/Typeface;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LF/a;->c(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget p1, p1, LF/f$e;->b:I

    .line 14
    .line 15
    invoke-virtual {p0, p1}, LF/a;->a(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    iget-object v0, p0, LF/a;->a:LF/g$c;

    .line 2
    .line 3
    iget-object v1, p0, LF/a;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, LF/a$a;

    .line 6
    .line 7
    invoke-direct {v2, p0, v0, p1}, LF/a$a;-><init>(LF/a;LF/g$c;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
