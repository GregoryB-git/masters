.class public LO5/C;
.super Landroidx/lifecycle/LiveData;
.source "SourceFile"


# static fields
.field public static l:LO5/C;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static k()LO5/C;
    .locals 1

    .line 1
    sget-object v0, LO5/C;->l:LO5/C;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LO5/C;

    .line 6
    .line 7
    invoke-direct {v0}, LO5/C;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LO5/C;->l:LO5/C;

    .line 11
    .line 12
    :cond_0
    sget-object v0, LO5/C;->l:LO5/C;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public l(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->h(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
