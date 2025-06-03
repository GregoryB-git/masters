.class public LX3/i$c;
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
    invoke-virtual {p0, p1}, LX3/i$c;->b(LX3/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LX3/h;)Z
    .locals 0

    .line 1
    iget-boolean p1, p1, LX3/h;->e:Z

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    return p1
.end method
