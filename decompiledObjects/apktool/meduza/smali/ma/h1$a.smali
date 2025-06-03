.class public final Lma/h1$a;
.super Lma/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lma/h1;->s()Lma/h$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final a:Lma/h1$c;

.field public b:Lma/h$f;


# direct methods
.method public constructor <init>(Lma/h1;)V
    .locals 1

    invoke-direct {p0}, Lma/h$b;-><init>()V

    new-instance v0, Lma/h1$c;

    invoke-direct {v0, p1}, Lma/h1$c;-><init>(Lma/h;)V

    iput-object v0, p0, Lma/h1$a;->a:Lma/h1$c;

    invoke-virtual {p0}, Lma/h1$a;->a()Lma/h$a;

    move-result-object p1

    iput-object p1, p0, Lma/h1$a;->b:Lma/h$f;

    return-void
.end method


# virtual methods
.method public final a()Lma/h$a;
    .locals 2

    iget-object v0, p0, Lma/h1$a;->a:Lma/h1$c;

    invoke-virtual {v0}, Lma/h1$c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lma/h1$a;->a:Lma/h1$c;

    invoke-virtual {v0}, Lma/h1$c;->a()Lma/h$g;

    move-result-object v0

    new-instance v1, Lma/h$a;

    invoke-direct {v1, v0}, Lma/h$a;-><init>(Lma/h;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public final f()B
    .locals 2

    iget-object v0, p0, Lma/h1$a;->b:Lma/h$f;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lma/h$f;->f()B

    move-result v0

    iget-object v1, p0, Lma/h1$a;->b:Lma/h$f;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lma/h1$a;->a()Lma/h$a;

    move-result-object v1

    iput-object v1, p0, Lma/h1$a;->b:Lma/h$f;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lma/h1$a;->b:Lma/h$f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
