.class public final Leb/k0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/k0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/u;",
            ">;"
        }
    .end annotation
.end field

.field public b:Leb/a;

.field public c:[[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Leb/a;->b:Leb/a;

    iput-object v0, p0, Leb/k0$b$a;->b:Leb/a;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const-class v1, Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Ljava/lang/Object;

    iput-object v0, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x2
    .end array-data
.end method


# virtual methods
.method public final a(Leb/k0$k;)V
    .locals 7

    sget-object v0, Leb/k0;->c:Leb/k0$b$b;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    aget-object v3, v3, v1

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_1
    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v5, :cond_2

    iget-object v2, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    array-length v2, v2

    add-int/2addr v2, v4

    new-array v5, v3, [I

    aput v3, v5, v4

    aput v2, v5, v1

    const-class v2, Ljava/lang/Object;

    invoke-static {v2, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[Ljava/lang/Object;

    iget-object v5, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    array-length v6, v5

    invoke-static {v5, v1, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    array-length v2, v2

    sub-int/2addr v2, v4

    :cond_2
    iget-object v5, p0, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    aput-object p1, v3, v4

    aput-object v3, v5, v2

    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "addrs is empty"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Leb/k0$b$a;->a:Ljava/util/List;

    return-void
.end method
