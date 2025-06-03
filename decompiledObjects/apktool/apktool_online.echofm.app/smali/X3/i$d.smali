.class public LX3/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LX3/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LX3/i$d;->b(LX3/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LX3/h;)Z
    .locals 1

    .line 1
    invoke-static {}, LX3/i;->a()LY3/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, LY3/i;->a(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    xor-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    return p1
.end method
