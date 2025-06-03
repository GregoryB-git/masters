.class public Lio/flutter/embedding/engine/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/engine/b;->a(Lio/flutter/embedding/engine/b$b;)Lio/flutter/embedding/engine/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/embedding/engine/a;

.field public final synthetic b:Lio/flutter/embedding/engine/b;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/b;Lio/flutter/embedding/engine/a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/b$a;->b:Lio/flutter/embedding/engine/b;

    iput-object p2, p0, Lio/flutter/embedding/engine/b$a;->a:Lio/flutter/embedding/engine/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/embedding/engine/b$a;->b:Lio/flutter/embedding/engine/b;

    iget-object v0, v0, Lio/flutter/embedding/engine/b;->a:Ljava/util/List;

    iget-object v1, p0, Lio/flutter/embedding/engine/b$a;->a:Lio/flutter/embedding/engine/a;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method
