.class public Lu5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu5/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu5/j$c;
    }
.end annotation


# instance fields
.field public a:Lu5/j$c;

.field public b:Lio/flutter/embedding/engine/a;

.field public c:Lu5/D;

.field public d:Lio/flutter/plugin/platform/h;

.field public e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Integer;

.field public k:Lio/flutter/embedding/engine/b;

.field public final l:Lio/flutter/embedding/engine/renderer/j;


# direct methods
.method public constructor <init>(Lu5/j$c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lu5/j;-><init>(Lu5/j$c;Lio/flutter/embedding/engine/b;)V

    return-void
.end method

.method public constructor <init>(Lu5/j$c;Lio/flutter/embedding/engine/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lu5/j$a;

    invoke-direct {v0, p0}, Lu5/j$a;-><init>(Lu5/j;)V

    iput-object v0, p0, Lu5/j;->l:Lio/flutter/embedding/engine/renderer/j;

    iput-object p1, p0, Lu5/j;->a:Lu5/j$c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu5/j;->h:Z

    iput-object p2, p0, Lu5/j;->k:Lio/flutter/embedding/engine/b;

    return-void
.end method

.method public static synthetic a(Lu5/j;)Lu5/j$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lu5/j;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lu5/j;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lu5/j;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lu5/j;->g:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lu5/j;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lu5/j;->h:Z

    .line 2
    .line 3
    return p1
.end method


# virtual methods
.method public A(I[Ljava/lang/String;[I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "\npermissions: "

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "\ngrantResults: "

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {p3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 55
    .line 56
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, p1, p2, p3}, LB5/b;->b(I[Ljava/lang/String;[I)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const-string p1, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity."

    .line 65
    .line 66
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    return-void
.end method

.method public B(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-string v0, "plugins"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "framework"

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    move-object p1, v0

    .line 28
    :goto_0
    iget-object v1, p0, Lu5/j;->a:Lu5/j$c;

    .line 29
    .line 30
    invoke-interface {v1}, Lu5/j$c;->r()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 37
    .line 38
    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->u()LD5/s;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, p1}, LD5/s;->j([B)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 46
    .line 47
    invoke-interface {p1}, Lu5/j$c;->n()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 54
    .line 55
    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1, v0}, LB5/b;->e(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public C()V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onResume()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lu5/j$c;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LD5/k;->e()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public D(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onSaveInstanceState. Giving framework and plugins an opportunity to save state."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lu5/j$c;->r()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->u()LD5/s;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LD5/s;->h()[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "framework"

    .line 30
    .line 31
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 35
    .line 36
    invoke-interface {v0}, Lu5/j$c;->n()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Landroid/os/Bundle;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 48
    .line 49
    invoke-virtual {v1}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1, v0}, LB5/b;->g(Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "plugins"

    .line 57
    .line 58
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onStart()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lu5/j;->k()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lu5/j;->j:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lu5/j;->c:Lu5/D;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {v1, v0}, Lu5/D;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public F()V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onStop()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lu5/j$c;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LD5/k;->d()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lu5/j;->j:Ljava/lang/Integer;

    .line 41
    .line 42
    iget-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lu5/D;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/16 v1, 0x28

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->j(I)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public G(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lu5/j;->h:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    if-lt p1, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lw5/a;->m()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->x()LD5/v;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LD5/v;->a()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 33
    .line 34
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->t()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->j(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 42
    .line 43
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/r;->Z(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public H()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding onUserLeaveHint() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, LB5/b;->h()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public I(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

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
    const-string v1, "Received onWindowFocusChanged: "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v1, "true"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "false"

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 29
    .line 30
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 34
    .line 35
    invoke-interface {v0}, Lu5/j$c;->p()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, LD5/k;->a()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, LD5/k;->f()V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_1
    return-void
.end method

.method public J()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 3
    .line 4
    iput-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    iput-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 7
    .line 8
    iput-object v0, p0, Lu5/j;->d:Lio/flutter/plugin/platform/h;

    .line 9
    .line 10
    return-void
.end method

.method public K()V
    .locals 5

    .line 1
    const-string v0, "Setting up FlutterEngine."

    .line 2
    .line 3
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 9
    .line 10
    invoke-interface {v0}, Lu5/j$c;->q()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v2, "\'"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {}, Lv5/a;->b()Lv5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, v0}, Lv5/a;->a(Ljava/lang/String;)Lio/flutter/embedding/engine/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 28
    .line 29
    iput-boolean v3, p0, Lu5/j;->f:Z

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v4, "The requested cached FlutterEngine did not exist in the FlutterEngineCache: \'"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 61
    .line 62
    invoke-interface {v0}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v0, v4}, Lu5/j$c;->C(Landroid/content/Context;)Lio/flutter/embedding/engine/a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iput-boolean v3, p0, Lu5/j;->f:Z

    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 78
    .line 79
    invoke-interface {v0}, Lu5/j$c;->h()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v3, 0x0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-static {}, Lv5/c;->b()Lv5/c;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, v0}, Lv5/c;->a(Ljava/lang/String;)Lio/flutter/embedding/engine/b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    new-instance v0, Lio/flutter/embedding/engine/b$b;

    .line 97
    .line 98
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 99
    .line 100
    invoke-interface {v2}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-direct {v0, v2}, Lio/flutter/embedding/engine/b$b;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, Lu5/j;->g(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/b$b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/b;->a(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/a;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_0
    iput-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 116
    .line 117
    iput-boolean v3, p0, Lu5/j;->f:Z

    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v4, "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: \'"

    .line 128
    .line 129
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v1

    .line 146
    :cond_4
    const-string v0, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment."

    .line 147
    .line 148
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lu5/j;->k:Lio/flutter/embedding/engine/b;

    .line 152
    .line 153
    if-nez v0, :cond_5

    .line 154
    .line 155
    new-instance v0, Lio/flutter/embedding/engine/b;

    .line 156
    .line 157
    iget-object v1, p0, Lu5/j;->a:Lu5/j$c;

    .line 158
    .line 159
    invoke-interface {v1}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 164
    .line 165
    invoke-interface {v2}, Lu5/j$c;->z()Lv5/j;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Lv5/j;->b()[Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/engine/b;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    new-instance v1, Lio/flutter/embedding/engine/b$b;

    .line 177
    .line 178
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 179
    .line 180
    invoke-interface {v2}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-direct {v1, v2}, Lio/flutter/embedding/engine/b$b;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3}, Lio/flutter/embedding/engine/b$b;->h(Z)Lio/flutter/embedding/engine/b$b;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 192
    .line 193
    invoke-interface {v2}, Lu5/j$c;->r()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/b$b;->l(Z)Lio/flutter/embedding/engine/b$b;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {p0, v1}, Lu5/j;->g(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/b$b;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/b;->a(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/a;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    goto :goto_0
.end method

.method public L(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding startBackGesture() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->j()LD5/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LD5/f;->d(Landroid/window/BackEvent;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p1, "Invoked startBackGesture() before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public M(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding updateBackGestureProgress() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->j()LD5/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, LD5/f;->e(Landroid/window/BackEvent;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p1, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public N()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/j;->d:Lio/flutter/plugin/platform/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/plugin/platform/h;->E()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 10
    .line 11
    invoke-interface {v0}, Lu5/j$c;->d()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "The internal FlutterEngine created by "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu5/j;->m()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final g(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/b$b;
    .locals 3

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->w()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lt5/a;->e()Lt5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lt5/a;->c()Ly5/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ly5/f;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    new-instance v1, Lw5/a$c;

    .line 28
    .line 29
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 30
    .line 31
    invoke-interface {v2}, Lu5/j$c;->s()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {v1, v0, v2}, Lw5/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 39
    .line 40
    invoke-interface {v0}, Lu5/j$c;->i()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 47
    .line 48
    invoke-interface {v0}, Lu5/j$c;->c()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lu5/j;->q(Landroid/content/Intent;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    const-string v0, "/"

    .line 63
    .line 64
    :cond_2
    invoke-virtual {p1, v1}, Lio/flutter/embedding/engine/b$b;->i(Lw5/a$c;)Lio/flutter/embedding/engine/b$b;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1, v0}, Lio/flutter/embedding/engine/b$b;->k(Ljava/lang/String;)Lio/flutter/embedding/engine/b$b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 73
    .line 74
    invoke-interface {v0}, Lu5/j$c;->m()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Lio/flutter/embedding/engine/b$b;->j(Ljava/util/List;)Lio/flutter/embedding/engine/b$b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1
.end method

.method public h()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding cancelBackGesture() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->j()LD5/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LD5/f;->b()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding commitBackGesture() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->j()LD5/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LD5/f;->c()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public final j(Lu5/D;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->A()Lu5/O;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lu5/O;->o:Lu5/O;

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    new-instance v0, Lu5/j$b;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lu5/j$b;-><init>(Lu5/j;Lu5/D;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    const-string v0, "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->q()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lw5/a;->l()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 24
    .line 25
    invoke-interface {v0}, Lu5/j$c;->i()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 32
    .line 33
    invoke-interface {v0}, Lu5/j$c;->c()Landroid/app/Activity;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, Lu5/j;->q(Landroid/content/Intent;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "/"

    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Lu5/j;->a:Lu5/j$c;

    .line 50
    .line 51
    invoke-interface {v1}, Lu5/j$c;->u()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v3, "Executing Dart entrypoint: "

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lu5/j;->a:Lu5/j$c;

    .line 66
    .line 67
    invoke-interface {v3}, Lu5/j$c;->s()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v3, ", library uri: "

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    const-string v2, "\"\""

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v3, ", and sending initial route: "

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :goto_0
    const-string v3, "FlutterActivityAndFragmentDelegate"

    .line 112
    .line 113
    invoke-static {v3, v2}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v2, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 117
    .line 118
    invoke-virtual {v2}, Lio/flutter/embedding/engine/a;->o()LD5/n;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2, v0}, LD5/n;->c(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 126
    .line 127
    invoke-interface {v0}, Lu5/j$c;->w()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    :cond_4
    invoke-static {}, Lt5/a;->e()Lt5/a;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lt5/a;->c()Ly5/f;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ly5/f;->j()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :cond_5
    if-nez v1, :cond_6

    .line 152
    .line 153
    new-instance v1, Lw5/a$c;

    .line 154
    .line 155
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 156
    .line 157
    invoke-interface {v2}, Lu5/j$c;->s()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-direct {v1, v0, v2}, Lw5/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_6
    new-instance v2, Lw5/a$c;

    .line 166
    .line 167
    iget-object v3, p0, Lu5/j;->a:Lu5/j$c;

    .line 168
    .line 169
    invoke-interface {v3}, Lu5/j$c;->s()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-direct {v2, v0, v1, v3}, Lw5/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object v1, v2

    .line 177
    :goto_1
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 178
    .line 179
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->k()Lw5/a;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 184
    .line 185
    invoke-interface {v2}, Lu5/j$c;->m()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v0, v1, v2}, Lw5/a;->k(Lw5/a$c;Ljava/util/List;)V

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public m()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->c()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 11
    .line 12
    const-string v1, "FlutterActivityAndFragmentDelegate\'s getAppComponent should only be queried after onAttach, when the host\'s activity should always be non-null"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public n()Lio/flutter/embedding/engine/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu5/j;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu5/j;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 2
    .line 3
    invoke-interface {v0}, Lu5/j$c;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public r(IILandroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "\nresultCode: "

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "\ndata: "

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p1, p2, p3}, LB5/b;->a(IILandroid/content/Intent;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const-string p1, "onActivityResult() invoked before FlutterFragment was attached to an Activity."

    .line 57
    .line 58
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void
.end method

.method public s(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->K()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {p1}, Lu5/j$c;->n()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 20
    .line 21
    const-string v0, "Attaching FlutterEngine to the Activity that owns this delegate."

    .line 22
    .line 23
    invoke-static {p1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 33
    .line 34
    invoke-interface {v0}, Lu5/j$c;->g()Landroidx/lifecycle/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {p1, p0, v0}, LB5/b;->i(Lu5/d;Landroidx/lifecycle/d;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 42
    .line 43
    invoke-interface {p1}, Lu5/j$c;->c()Landroid/app/Activity;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 48
    .line 49
    invoke-interface {p1, v0, v1}, Lu5/j$c;->v(Landroid/app/Activity;Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/h;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lu5/j;->d:Lio/flutter/plugin/platform/h;

    .line 54
    .line 55
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 56
    .line 57
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 58
    .line 59
    invoke-interface {p1, v0}, Lu5/j$c;->E(Lio/flutter/embedding/engine/a;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, Lu5/j;->i:Z

    .line 64
    .line 65
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding onBackPressed() to FlutterEngine."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->o()LD5/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LD5/n;->a()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "Invoked onBackPressed() before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
.end method

.method public u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;IZ)Landroid/view/View;
    .locals 4

    .line 1
    const-string p1, "Creating FlutterView."

    .line 2
    .line 3
    const-string p2, "FlutterActivityAndFragmentDelegate"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {p1}, Lu5/j$c;->A()Lu5/O;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object p3, Lu5/O;->o:Lu5/O;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p1, p3, :cond_1

    .line 22
    .line 23
    new-instance p1, Lu5/s;

    .line 24
    .line 25
    iget-object p3, p0, Lu5/j;->a:Lu5/j$c;

    .line 26
    .line 27
    invoke-interface {p3}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 32
    .line 33
    invoke-interface {v2}, Lu5/j$c;->D()Lu5/P;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Lu5/P;->p:Lu5/P;

    .line 38
    .line 39
    if-ne v2, v3, :cond_0

    .line 40
    .line 41
    move v0, v1

    .line 42
    :cond_0
    invoke-direct {p1, p3, v0}, Lu5/s;-><init>(Landroid/content/Context;Z)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, Lu5/j;->a:Lu5/j$c;

    .line 46
    .line 47
    invoke-interface {p3, p1}, Lu5/j$c;->l(Lu5/s;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lu5/D;

    .line 51
    .line 52
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 53
    .line 54
    invoke-interface {v0}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p3, v0, p1}, Lu5/D;-><init>(Landroid/content/Context;Lu5/s;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    iput-object p3, p0, Lu5/j;->c:Lu5/D;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance p1, Lu5/t;

    .line 65
    .line 66
    iget-object p3, p0, Lu5/j;->a:Lu5/j$c;

    .line 67
    .line 68
    invoke-interface {p3}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-direct {p1, p3}, Lu5/t;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    iget-object p3, p0, Lu5/j;->a:Lu5/j$c;

    .line 76
    .line 77
    invoke-interface {p3}, Lu5/j$c;->D()Lu5/P;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    sget-object v2, Lu5/P;->o:Lu5/P;

    .line 82
    .line 83
    if-ne p3, v2, :cond_2

    .line 84
    .line 85
    move v0, v1

    .line 86
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 87
    .line 88
    .line 89
    iget-object p3, p0, Lu5/j;->a:Lu5/j$c;

    .line 90
    .line 91
    invoke-interface {p3, p1}, Lu5/j$c;->x(Lu5/t;)V

    .line 92
    .line 93
    .line 94
    new-instance p3, Lu5/D;

    .line 95
    .line 96
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 97
    .line 98
    invoke-interface {v0}, Lu5/j$c;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p3, v0, p1}, Lu5/D;-><init>(Landroid/content/Context;Lu5/t;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :goto_1
    iget-object p1, p0, Lu5/j;->c:Lu5/D;

    .line 107
    .line 108
    iget-object p3, p0, Lu5/j;->l:Lio/flutter/embedding/engine/renderer/j;

    .line 109
    .line 110
    invoke-virtual {p1, p3}, Lu5/D;->l(Lio/flutter/embedding/engine/renderer/j;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lu5/j;->a:Lu5/j$c;

    .line 114
    .line 115
    invoke-interface {p1}, Lu5/j$c;->B()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    const-string p1, "Attaching FlutterEngine to FlutterView."

    .line 122
    .line 123
    invoke-static {p2, p1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lu5/j;->c:Lu5/D;

    .line 127
    .line 128
    iget-object p2, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 129
    .line 130
    invoke-virtual {p1, p2}, Lu5/D;->n(Lio/flutter/embedding/engine/a;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    iget-object p1, p0, Lu5/j;->c:Lu5/D;

    .line 134
    .line 135
    invoke-virtual {p1, p4}, Landroid/view/View;->setId(I)V

    .line 136
    .line 137
    .line 138
    if-eqz p5, :cond_4

    .line 139
    .line 140
    iget-object p1, p0, Lu5/j;->c:Lu5/D;

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Lu5/j;->j(Lu5/D;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    iget-object p1, p0, Lu5/j;->c:Lu5/D;

    .line 146
    .line 147
    return-object p1
.end method

.method public v()V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onDestroyView()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lu5/j;->e:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lu5/D;->s()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lu5/j;->c:Lu5/D;

    .line 37
    .line 38
    iget-object v1, p0, Lu5/j;->l:Lio/flutter/embedding/engine/renderer/j;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lu5/D;->y(Lio/flutter/embedding/engine/renderer/j;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public w()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lu5/j;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "onDetach()"

    .line 7
    .line 8
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 17
    .line 18
    iget-object v2, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 19
    .line 20
    invoke-interface {v0, v2}, Lu5/j$c;->t(Lio/flutter/embedding/engine/a;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 24
    .line 25
    invoke-interface {v0}, Lu5/j$c;->n()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string v0, "Detaching FlutterEngine from the Activity that owns this Fragment."

    .line 32
    .line 33
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 37
    .line 38
    invoke-interface {v0}, Lu5/j$c;->c()Landroid/app/Activity;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 49
    .line 50
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, LB5/b;->d()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 59
    .line 60
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, LB5/b;->f()V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    iget-object v0, p0, Lu5/j;->d:Lio/flutter/plugin/platform/h;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0}, Lio/flutter/plugin/platform/h;->q()V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lu5/j;->d:Lio/flutter/plugin/platform/h;

    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 78
    .line 79
    invoke-interface {v0}, Lu5/j$c;->p()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, LD5/k;->b()V

    .line 94
    .line 95
    .line 96
    :cond_4
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 97
    .line 98
    invoke-interface {v0}, Lu5/j$c;->o()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 105
    .line 106
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->g()V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 110
    .line 111
    invoke-interface {v0}, Lu5/j$c;->q()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    invoke-static {}, Lv5/a;->b()Lv5/a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v2, p0, Lu5/j;->a:Lu5/j$c;

    .line 122
    .line 123
    invoke-interface {v2}, Lu5/j$c;->q()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0, v2}, Lv5/a;->d(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    iput-object v1, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 131
    .line 132
    :cond_6
    const/4 v0, 0x0

    .line 133
    iput-boolean v0, p0, Lu5/j;->i:Z

    .line 134
    .line 135
    return-void
.end method

.method public x(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 5
    .line 6
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message."

    .line 11
    .line 12
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->i()LB5/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p1}, LB5/b;->onNewIntent(Landroid/content/Intent;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lu5/j;->q(Landroid/content/Intent;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 37
    .line 38
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->o()LD5/n;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, LD5/n;->b(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p1, "onNewIntent() invoked before FlutterFragment was attached to an Activity."

    .line 47
    .line 48
    invoke-static {v1, p1}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 2
    .line 3
    const-string v1, "onPause()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->a:Lu5/j$c;

    .line 12
    .line 13
    invoke-interface {v0}, Lu5/j$c;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->l()LD5/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LD5/k;->c()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    const-string v0, "onPostResume()"

    .line 2
    .line 3
    const-string v1, "FlutterActivityAndFragmentDelegate"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lu5/j;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lu5/j;->N()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lu5/j;->b:Lio/flutter/embedding/engine/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Lio/flutter/plugin/platform/r;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lio/flutter/plugin/platform/r;->Y()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "onPostResume() invoked before FlutterFragment was attached to an Activity."

    .line 29
    .line 30
    invoke-static {v1, v0}, Lt5/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
.end method
