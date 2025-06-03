.class public final LO1/E$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO1/E$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LO1/E$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO1/E$e;I)LO1/E$f;
    .locals 2

    .line 1
    new-instance v0, LO1/E$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LO1/E$f;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, LO1/E$f;->a(LO1/E$f;LO1/E$e;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p2}, LO1/E$f;->b(LO1/E$f;I)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b()LO1/E$f;
    .locals 2

    .line 1
    new-instance v0, LO1/E$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LO1/E$f;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-static {v0, v1}, LO1/E$f;->b(LO1/E$f;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
