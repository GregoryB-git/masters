.class public Lcom/google/crypto/tink/shaded/protobuf/n0;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/D;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final o:Lcom/google/crypto/tink/shaded/protobuf/D;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    return-void
.end method

.method public static synthetic a(Lcom/google/crypto/tink/shaded/protobuf/n0;)Lcom/google/crypto/tink/shaded/protobuf/D;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    return-object p0
.end method


# virtual methods
.method public C(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n0;->d(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/n0$b;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/n0$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/n0;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/n0$a;

    invoke-direct {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n0$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/n0;I)V

    return-object v0
.end method

.method public m()Lcom/google/crypto/tink/shaded/protobuf/D;
    .locals 0

    .line 1
    return-object p0
.end method

.method public n(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/D;->n(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/D;->o()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/n0;->o:Lcom/google/crypto/tink/shaded/protobuf/D;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
