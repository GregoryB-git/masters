.class public LB3/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB3/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ln4/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ln4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/G$a;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, LB3/G$a;->b:Ln4/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ln4/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, LB3/G$a;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln4/a;->b()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LB3/G$a;->b:Ln4/c;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ln4/c;->a(Ln4/a;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, LB3/t;

    .line 20
    .line 21
    const-string v1, "Attempting to publish an undeclared event %s."

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object p1, v2, v3

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v0, p1}, LB3/t;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method
