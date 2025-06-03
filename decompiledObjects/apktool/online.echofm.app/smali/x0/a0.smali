.class public Lx0/a0;
.super Ld0/A;
.source "SourceFile"


# instance fields
.field public final q:Landroid/net/Uri;

.field public final r:LX2/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, p1, v2, v0, v1}, Ld0/A;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lx0/a0;->q:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {p3}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lx0/a0;->r:LX2/v;

    .line 14
    .line 15
    return-void
.end method
