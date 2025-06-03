.class public final Landroidx/datastore/preferences/protobuf/g$e;
.super Landroidx/datastore/preferences/protobuf/g$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final t:I

.field public final u:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/g$i;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Landroidx/datastore/preferences/protobuf/g;->g(III)I

    iput p2, p0, Landroidx/datastore/preferences/protobuf/g$e;->t:I

    iput p3, p0, Landroidx/datastore/preferences/protobuf/g$e;->u:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "BoundedByteStream instances are not to be serialized directly"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public D(I)B
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$i;->s:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$e;->t:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public d(I)B
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g$e;->size()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->f(II)V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$i;->s:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$e;->t:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public f0()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$e;->t:I

    return v0
.end method

.method public s([BIII)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$i;->s:[B

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g$e;->f0()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public size()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$e;->u:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g;->W()[B

    move-result-object v0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/g;->b0([B)Landroidx/datastore/preferences/protobuf/g;

    move-result-object v0

    return-object v0
.end method
