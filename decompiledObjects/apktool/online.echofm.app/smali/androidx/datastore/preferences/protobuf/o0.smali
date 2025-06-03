.class public Landroidx/datastore/preferences/protobuf/o0;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/D;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final o:Landroidx/datastore/preferences/protobuf/D;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    return-void
.end method

.method public static synthetic a(Landroidx/datastore/preferences/protobuf/o0;)Landroidx/datastore/preferences/protobuf/D;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    return-object p0
.end method


# virtual methods
.method public H(Landroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/o0;->d(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/o0$b;

    invoke-direct {v0, p0}, Landroidx/datastore/preferences/protobuf/o0$b;-><init>(Landroidx/datastore/preferences/protobuf/o0;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/o0$a;

    invoke-direct {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/o0$a;-><init>(Landroidx/datastore/preferences/protobuf/o0;I)V

    return-object v0
.end method

.method public m()Landroidx/datastore/preferences/protobuf/D;
    .locals 0

    .line 1
    return-object p0
.end method

.method public n(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    invoke-interface {v0, p1}, Landroidx/datastore/preferences/protobuf/D;->n(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/D;->o()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/o0;->o:Landroidx/datastore/preferences/protobuf/D;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
