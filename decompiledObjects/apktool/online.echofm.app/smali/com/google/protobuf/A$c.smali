.class public final Lcom/google/protobuf/A$c;
.super Lcom/google/protobuf/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/protobuf/A;-><init>(Lcom/google/protobuf/A$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/A$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/protobuf/A$c;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/Object;J)Lcom/google/protobuf/t$e;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/k0;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/t$e;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/google/protobuf/A$c;->e(Ljava/lang/Object;J)Lcom/google/protobuf/t$e;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/protobuf/t$e;->j()V

    return-void
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 4

    .line 1
    invoke-static {p1, p3, p4}, Lcom/google/protobuf/A$c;->e(Ljava/lang/Object;J)Lcom/google/protobuf/t$e;

    move-result-object v0

    invoke-static {p2, p3, p4}, Lcom/google/protobuf/A$c;->e(Ljava/lang/Object;J)Lcom/google/protobuf/t$e;

    move-result-object p2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_1

    if-lez v2, :cond_1

    invoke-interface {v0}, Lcom/google/protobuf/t$e;->p()Z

    move-result v3

    if-nez v3, :cond_0

    add-int/2addr v2, v1

    invoke-interface {v0, v2}, Lcom/google/protobuf/t$e;->h(I)Lcom/google/protobuf/t$e;

    move-result-object v0

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-lez v1, :cond_2

    move-object p2, v0

    :cond_2
    invoke-static {p1, p3, p4, p2}, Lcom/google/protobuf/k0;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
