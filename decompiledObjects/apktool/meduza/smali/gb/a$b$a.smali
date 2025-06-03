.class public final Lgb/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/a$b;->j(Leb/e1;Lgb/t$a;ZLeb/s0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Leb/e1;

.field public final synthetic b:Lgb/t$a;

.field public final synthetic c:Leb/s0;

.field public final synthetic d:Lgb/a$b;


# direct methods
.method public constructor <init>(Lgb/a$b;Leb/e1;Lgb/t$a;Leb/s0;)V
    .locals 0

    iput-object p1, p0, Lgb/a$b$a;->d:Lgb/a$b;

    iput-object p2, p0, Lgb/a$b$a;->a:Leb/e1;

    iput-object p3, p0, Lgb/a$b$a;->b:Lgb/t$a;

    iput-object p4, p0, Lgb/a$b$a;->c:Leb/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lgb/a$b$a;->d:Lgb/a$b;

    iget-object v1, p0, Lgb/a$b$a;->a:Leb/e1;

    iget-object v2, p0, Lgb/a$b$a;->b:Lgb/t$a;

    iget-object v3, p0, Lgb/a$b$a;->c:Leb/s0;

    invoke-virtual {v0, v1, v2, v3}, Lgb/a$b;->g(Leb/e1;Lgb/t$a;Leb/s0;)V

    return-void
.end method
