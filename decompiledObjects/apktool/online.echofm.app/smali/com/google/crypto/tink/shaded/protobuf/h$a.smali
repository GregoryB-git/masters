.class public Lcom/google/crypto/tink/shaded/protobuf/h$a;
.super Lcom/google/crypto/tink/shaded/protobuf/h$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/crypto/tink/shaded/protobuf/h;->S()Lcom/google/crypto/tink/shaded/protobuf/h$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public o:I

.field public final p:I

.field public final synthetic q:Lcom/google/crypto/tink/shaded/protobuf/h;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->q:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/h$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->o:I

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    iput p1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->p:I

    return-void
.end method


# virtual methods
.method public c()B
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->o:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->p:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->o:I

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->q:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->D(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->o:I

    iget v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h$a;->p:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
