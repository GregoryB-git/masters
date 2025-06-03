.class public final Lcom/google/protobuf/g$b;
.super Lcom/google/protobuf/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final e:[B

.field public final f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>([BIIZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/protobuf/g;-><init>(Lcom/google/protobuf/g$a;)V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/protobuf/g$b;->k:I

    iput-object p1, p0, Lcom/google/protobuf/g$b;->e:[B

    add-int/2addr p3, p2

    iput p3, p0, Lcom/google/protobuf/g$b;->g:I

    iput p2, p0, Lcom/google/protobuf/g$b;->i:I

    iput p2, p0, Lcom/google/protobuf/g$b;->j:I

    iput-boolean p4, p0, Lcom/google/protobuf/g$b;->f:Z

    return-void
.end method

.method public synthetic constructor <init>([BIIZLcom/google/protobuf/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/protobuf/g$b;-><init>([BIIZ)V

    return-void
.end method


# virtual methods
.method public d()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/g$b;->i:I

    iget v1, p0, Lcom/google/protobuf/g$b;->j:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public e(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/g$b;->d()I

    move-result v0

    add-int/2addr p1, v0

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/protobuf/g$b;->k:I

    if-gt p1, v0, :cond_0

    iput p1, p0, Lcom/google/protobuf/g$b;->k:I

    invoke-virtual {p0}, Lcom/google/protobuf/g$b;->f()V

    return v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/v;->d()Lcom/google/protobuf/v;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {}, Lcom/google/protobuf/v;->c()Lcom/google/protobuf/v;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {}, Lcom/google/protobuf/v;->b()Lcom/google/protobuf/v;

    move-result-object p1

    throw p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/g$b;->g:I

    iget v1, p0, Lcom/google/protobuf/g$b;->h:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/g$b;->g:I

    iget v1, p0, Lcom/google/protobuf/g$b;->j:I

    sub-int v1, v0, v1

    iget v2, p0, Lcom/google/protobuf/g$b;->k:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/g$b;->h:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/g$b;->g:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/g$b;->h:I

    :goto_0
    return-void
.end method
