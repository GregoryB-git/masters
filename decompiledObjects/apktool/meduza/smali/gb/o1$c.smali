.class public final Lgb/o1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/o1$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lgb/x;


# direct methods
.method public constructor <init>(Lgb/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/o1$c;->a:Lgb/x;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lgb/o1$c;->a:Lgb/x;

    sget-object v1, Leb/e1;->n:Leb/e1;

    const-string v2, "Keepalive failed. The connection is likely gone"

    invoke-virtual {v1, v2}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    move-result-object v1

    invoke-interface {v0, v1}, Lgb/h2;->h(Leb/e1;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lgb/o1$c;->a:Lgb/x;

    new-instance v1, Lgb/o1$c$a;

    invoke-direct {v1, p0}, Lgb/o1$c$a;-><init>(Lgb/o1$c;)V

    invoke-interface {v0, v1}, Lgb/u;->e(Lgb/o1$c$a;)V

    return-void
.end method
