.class public final LR2/F5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/e2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LR2/D5;


# direct methods
.method public constructor <init>(LR2/D5;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/F5;->b:LR2/D5;

    .line 2
    .line 3
    iput-object p2, p0, LR2/F5;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/F5;->b:LR2/D5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v5, p0, LR2/F5;->a:Ljava/lang/String;

    .line 5
    .line 6
    move v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-virtual/range {v0 .. v5}, LR2/D5;->I(ZILjava/lang/Throwable;[BLjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
