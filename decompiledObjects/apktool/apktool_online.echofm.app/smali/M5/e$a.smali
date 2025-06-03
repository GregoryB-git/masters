.class public LM5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/e;->b(Ljava/lang/Object;LE5/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LE5/d$b;

.field public final synthetic b:LM5/e;


# direct methods
.method public constructor <init>(LM5/e;LE5/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM5/e$a;->b:LM5/e;

    .line 2
    .line 3
    iput-object p2, p0, LM5/e$a;->a:LE5/d$b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(LE5/d$b;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LM5/e$a;->d(LE5/d$b;Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(LE5/d$b;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LE5/d$b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LP4/o;)V
    .locals 3

    .line 1
    iget-object v0, p0, LM5/e$a;->a:LE5/d$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "firebase_remote_config"

    .line 9
    .line 10
    invoke-interface {v0, v2, p1, v1}, LE5/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b(LP4/b;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, LP4/b;->b()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LM5/e$a;->b:LM5/e;

    .line 11
    .line 12
    invoke-static {p1}, LM5/e;->f(LM5/e;)Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v1, p0, LM5/e$a;->a:LE5/d$b;

    .line 17
    .line 18
    new-instance v2, LM5/d;

    .line 19
    .line 20
    invoke-direct {v2, v1, v0}, LM5/d;-><init>(LE5/d$b;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method
