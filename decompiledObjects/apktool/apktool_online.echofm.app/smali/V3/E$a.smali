.class public LV3/E$a;
.super LV3/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:LV3/x;

.field public final b:LV3/k;


# direct methods
.method public constructor <init>(LV3/x;LV3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV3/E;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/E$a;->a:LV3/x;

    .line 5
    .line 6
    iput-object p2, p0, LV3/E$a;->b:LV3/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ld4/b;)LV3/E;
    .locals 2

    .line 1
    iget-object v0, p0, LV3/E$a;->b:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, LV3/E$a;

    .line 8
    .line 9
    iget-object v1, p0, LV3/E$a;->a:LV3/x;

    .line 10
    .line 11
    invoke-direct {v0, v1, p1}, LV3/E$a;-><init>(LV3/x;LV3/k;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public b()Ld4/n;
    .locals 3

    .line 1
    iget-object v0, p0, LV3/E$a;->a:LV3/x;

    .line 2
    .line 3
    iget-object v1, p0, LV3/E$a;->b:LV3/k;

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, LV3/x;->J(LV3/k;Ljava/util/List;)Ld4/n;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method
