.class public final LR/g$a;
.super Landroidx/datastore/preferences/protobuf/w$a;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, LR/g;->H()LR/g;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/w$a;-><init>(Landroidx/datastore/preferences/protobuf/w;)V

    return-void
.end method

.method public synthetic constructor <init>(LR/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LR/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Iterable;)LR/g$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->v()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    .line 5
    .line 6
    check-cast v0, LR/g;

    .line 7
    .line 8
    invoke-static {v0, p1}, LR/g;->I(LR/g;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
