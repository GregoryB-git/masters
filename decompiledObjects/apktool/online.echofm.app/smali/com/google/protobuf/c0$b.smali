.class public Lcom/google/protobuf/c0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public o:I

.field public p:Ljava/util/Iterator;

.field public final synthetic q:Lcom/google/protobuf/c0;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/c0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/c0$b;->q:Lcom/google/protobuf/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/protobuf/c0;->b(Lcom/google/protobuf/c0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/google/protobuf/c0$b;->o:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/c0;Lcom/google/protobuf/c0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/c0$b;-><init>(Lcom/google/protobuf/c0;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/c0$b;->p:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/c0$b;->q:Lcom/google/protobuf/c0;

    invoke-static {v0}, Lcom/google/protobuf/c0;->e(Lcom/google/protobuf/c0;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/c0$b;->p:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/c0$b;->p:Ljava/util/Iterator;

    return-object v0
.end method

.method public d()Ljava/util/Map$Entry;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/c0$b;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/c0$b;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/c0$b;->q:Lcom/google/protobuf/c0;

    invoke-static {v0}, Lcom/google/protobuf/c0;->b(Lcom/google/protobuf/c0;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/google/protobuf/c0$b;->o:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/protobuf/c0$b;->o:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/protobuf/c0$b;->o:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/google/protobuf/c0$b;->q:Lcom/google/protobuf/c0;

    invoke-static {v1}, Lcom/google/protobuf/c0;->b(Lcom/google/protobuf/c0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/c0$b;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/c0$b;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
