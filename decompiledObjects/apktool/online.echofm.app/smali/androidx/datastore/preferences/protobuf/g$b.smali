.class public final Landroidx/datastore/preferences/protobuf/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/g;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/g;->S()Landroidx/datastore/preferences/protobuf/g$g;

    move-result-object v0

    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/g;->S()Landroidx/datastore/preferences/protobuf/g$g;

    move-result-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/g$g;->c()B

    move-result v2

    invoke-static {v2}, Landroidx/datastore/preferences/protobuf/g;->a(B)I

    move-result v2

    invoke-interface {v1}, Landroidx/datastore/preferences/protobuf/g$g;->c()B

    move-result v3

    invoke-static {v3}, Landroidx/datastore/preferences/protobuf/g;->a(B)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_1
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result p1

    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/g;

    check-cast p2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/g$b;->a(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/g;)I

    move-result p1

    return p1
.end method
