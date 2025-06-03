.class public Lio/flutter/embedding/engine/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lw5/a$c;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/List;

.field public e:Lio/flutter/plugin/platform/r;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/embedding/engine/b$b;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/engine/b$b;->g:Z

    iput-object p1, p0, Lio/flutter/embedding/engine/b$b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/flutter/embedding/engine/b$b;->f:Z

    return v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public c()Lw5/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$b;->b:Lw5/a$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$b;->d:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lio/flutter/plugin/platform/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$b;->e:Lio/flutter/plugin/platform/r;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/flutter/embedding/engine/b$b;->g:Z

    return v0
.end method

.method public h(Z)Lio/flutter/embedding/engine/b$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/flutter/embedding/engine/b$b;->f:Z

    return-object p0
.end method

.method public i(Lw5/a$c;)Lio/flutter/embedding/engine/b$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/b$b;->b:Lw5/a$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/util/List;)Lio/flutter/embedding/engine/b$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/b$b;->d:Ljava/util/List;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lio/flutter/embedding/engine/b$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/b$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public l(Z)Lio/flutter/embedding/engine/b$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/flutter/embedding/engine/b$b;->g:Z

    return-object p0
.end method
